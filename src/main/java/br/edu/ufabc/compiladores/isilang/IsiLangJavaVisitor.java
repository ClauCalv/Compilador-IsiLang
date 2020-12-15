package br.edu.ufabc.compiladores.isilang;

import br.edu.ufabc.compiladores.isilang.antlr4gen.IsiLangBaseVisitor;
import br.edu.ufabc.compiladores.isilang.antlr4gen.IsiLangParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import static br.edu.ufabc.compiladores.isilang.Variable.VariableState.NOT_INITIALIZED;
import static br.edu.ufabc.compiladores.isilang.Variable.VariableType.*;

public class IsiLangJavaVisitor extends IsiLangBaseVisitor<ContextReturn> {

    Map<String, Variable> variables = new HashMap<String, Variable>();

    List<Command> varDecls = new ArrayList<Command>();
    Stack<List<Command>> commandStack = new Stack<List<Command>>();

    public final String fileName;
    private StringBuilder finalText;

    public IsiLangJavaVisitor(String fileName) {
        this.fileName = fileName;
    }

    public String getFinalText() {
        return finalText.toString();
    }

    @Override
    public ContextReturn visitProg(IsiLangParser.ProgContext ctx) {

        String importCommand1 = "import java.util.*;\n";
        String classDeclare = "public class " + fileName + " {\n";
        String mainDeclare = "public static void main(String[] args) {\n";
        String closeAll = "}\n}\n}\n";

        String initializeScanner = "try (Scanner scanner = new Scanner(System.in)) {\n";
        commandStack.push(new ArrayList<Command>());
        visitChildren(ctx);
        List<Command> mainCommands = commandStack.pop();

        for (Variable v : variables.values()) {
            if (v.state == NOT_INITIALIZED || v.type == UNKNOWN) {
                error("Variável não inicializada.");
            } else if (v.initializer == null) {
                String output = v.type.toJava() + " " + v.name + ";\n";
                varDecls.add(new Command(output));
            } else {
                String output = v.type.toJava() + " " + v.name + " = " + v.initializer + ";\n";
                varDecls.add(new Command(output));
            }
        }

        finalText = new StringBuilder();
        finalText.append(importCommand1).append(classDeclare).append(mainDeclare).append(initializeScanner);
        for (Command c : varDecls) {
            finalText.append(c.getCommand());
        }
        appendCommands(mainCommands, 0);

        finalText.append(closeAll);
        return null;
    }

    public void appendCommands(List<Command> commands, int indent) {
        for (Command c : commands) {
            if (c.isNested)
                appendCommands(c.getNestedCommands(), indent + 1);
            else {
                for (int i = 0; i < indent; i++)
                    finalText.append('\t');

                finalText.append(c.getCommand());
            }
        }
    }

    @Override
    public ContextReturn visitVarDeclare(IsiLangParser.VarDeclareContext ctx) {
        String ID = ctx.ID().getText();

        List<String> reserved_words = Arrays.asList("texto",
                                                    "num",
                                                    "programa",
                                                    "fimprog",
                                                    "declare",
                                                    "se",
                                                    "entao",
                                                    "senao",
                                                    "enquanto",
                                                    "faca",
                                                    "leia",
                                                    "escreva",
                                                    "Verdadeiro",
                                                    "Falso");

        if (reserved_words.contains(ID))
            error(ID + " é uma palavra reservada.");

        else {
            if (variables.containsKey(ID))
                error("Variável já declarada.");

            Variable v;
            if (ctx.expr() != null) {
                ContextReturn r = visitExpr(ctx.expr());
                if (!variables.get(ID).setType(r.type))
                    error("Eu não sei o que você está fazendo e você provavelmente também não sabe.");
                v = new Variable(ID, r.translationJava);
            } else
                v = new Variable(ID);

            variables.put(ID, v);
        }

        return null;
    }

    @Override
    public ContextReturn visitCmdLeitura(IsiLangParser.CmdLeituraContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID))
            error("Variável não declarada.");

        if (!variables.get(ID).setType(TEXT))
            error("Tipo incompatível com texto.");

        String output = ID + "= scanner.nextLine();\n";
        commandStack.peek().add(new Command(output));
        return null;
    }

    @Override
    public ContextReturn visitCmdEscrita(IsiLangParser.CmdEscritaContext ctx) {
        final String content = ctx.expr() == null
                               ? visitId(ctx.id()).translationJava
                               : visitExpr(ctx.expr()).translationJava;

        String command = "System.out.println(" + content + ");\n";
        commandStack.peek().add(new Command(command));
        return null;
    }

    @Override
    public ContextReturn visitCmdIf(IsiLangParser.CmdIfContext ctx) {
        ContextReturn t = visitExprLogic(ctx.exprLogic());
        if (t.type != LOGIC)
            error("Condicional do bloco \"se\" deve ser expressão lógica.");

        String startExpr = "if (" + t.translationJava + ")";
        String midExpr = "";
        String endExpr = "";

        List<Command> thenCommands = new ArrayList<>();
        List<Command> elseCommands = null;
        commandStack.push(thenCommands);
        visitThenCmd(ctx.thenCmd());
        thenCommands = commandStack.pop();
        if (thenCommands.size() > 1) {
            startExpr += "{\n";
            midExpr += "} ";
        } else {
            startExpr += "\n";
        }

        if (ctx.elseCmd() != null) {
            elseCommands = new ArrayList<Command>();
            commandStack.push(elseCommands);
            visitElseCmd(ctx.elseCmd());
            elseCommands = commandStack.pop();
            if (elseCommands.size() > 1) {
                midExpr += "else {\n";
                endExpr += "}\n";
            } else {
                midExpr += "else \n";
            }
        } else if (!midExpr.isEmpty()) {
            midExpr += "\n";
        }

        List<Command> ifCommands = new ArrayList<Command>();
        ifCommands.add(new Command(startExpr));
        ifCommands.add(new Command(thenCommands));
        if (!midExpr.isEmpty())
            ifCommands.add(new Command(midExpr));
        if (elseCommands != null)
            ifCommands.add(new Command(elseCommands));
        if (!endExpr.isEmpty())
            ifCommands.add(new Command(endExpr));

        commandStack.peek().add(new Command(ifCommands));
        return null;
    }

    @Override
    public ContextReturn visitCmdAttrib(IsiLangParser.CmdAttribContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID))
            error("Variável não declarada.");

        ContextReturn t = visitExpr(ctx.expr());
        if (!variables.get(ID).setType(t.type))
            error("Tipo incompátível com a expressão.");

        String command = ID + " = " + t.translationJava + ";\n";
        commandStack.peek().add(new Command(command));
        return null;
    }

    @Override
    public ContextReturn visitCmdWhile(IsiLangParser.CmdWhileContext ctx) {
        ContextReturn t = visitExprLogic(ctx.exprLogic());
        if (t.type != LOGIC)
            error("Condicional do bloco \"enquanto\" deve ser expressão lógica.");

        String startExpr = "while (" + t.translationJava + ")";
        String endExpr = "";

        List<Command> doCommands = new ArrayList<Command>();
        commandStack.push(doCommands);
        visitCmdBlock(ctx.cmdBlock());
        doCommands = commandStack.pop();
        if (doCommands.size() > 1) {
            startExpr += "{\n";
            endExpr += "}\n";
        } else {
            startExpr += "\n";
        }

        List<Command> whileCommands = new ArrayList<Command>();
        whileCommands.add(new Command(startExpr));
        whileCommands.add(new Command(doCommands));
        if (!endExpr.isEmpty())
            whileCommands.add(new Command(endExpr));

        commandStack.peek().add(new Command(whileCommands));
        return null;
    }

    @Override
    public ContextReturn visitStringTypeCast(IsiLangParser.StringTypeCastContext ctx) {
        ContextReturn t = visitExpr(ctx.expr());
        String content = "";
        switch (t.type) {
            case TEXT:
                content = t.translationJava;
                break;
            case LOGIC:
            case NUMERIC:
                content = "String.valueOf(" + t.translationJava + ")";
                break;
            case UNKNOWN:
                error("Variável não inicializada.");
        }

        return new ContextReturn(TEXT, content);
    }

    @Override
    public ContextReturn visitStringLiteral(IsiLangParser.StringLiteralContext ctx) {
        String text = ctx.TEXT_LITERAL().getText();
        return new ContextReturn(TEXT, text);
    }

    @Override
    public ContextReturn visitExprText2(IsiLangParser.ExprText2Context ctx) {
        ContextReturn t = visitExprText(ctx.exprText());
        String content = " + " + t.translationJava;

        return new ContextReturn(TEXT, content); //TODO
    }

    @Override
    public ContextReturn visitExprText(IsiLangParser.ExprTextContext ctx) {
        ContextReturn exprText1 = visitExprText1(ctx.exprText1());

        if(exprText1.type != TEXT)
            error("Expressão não possui tipo texto");

        if(ctx.exprText2() == null)
            return exprText1;

        ContextReturn exprText2 = visitExprText2(ctx.exprText2());
        if(exprText2.type != TEXT)
            error("Expressão não possui tipo texto");

        return new ContextReturn(TEXT, exprText1.translationJava + exprText2.translationJava);
    }

    @Override
    public ContextReturn visitId(IsiLangParser.IdContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID))
            error("Variável não declarada.");

        if(variables.get(ID).getType() == UNKNOWN)
            error("Variável não inicializada.");
        return new ContextReturn(variables.get(ID).getType(), ID);

    }

    @Override
    public ContextReturn visitAritmRelation(IsiLangParser.AritmRelationContext ctx) {
        ContextReturn ex1 = visitExprAritm(ctx.ex1);
        ContextReturn ex2 = visitExprAritm(ctx.ex2);
        String rel_op = ctx.REL_OP().getText();

        String content = "(" + ex1.translationJava + ")" + rel_op + "(" + ex2.translationJava + ")";
        return new ContextReturn(LOGIC, content);
    }

    @Override
    public ContextReturn visitLog_negation(IsiLangParser.Log_negationContext ctx) {
        ContextReturn expr = visitExprLogic(ctx.exprLogic());
        String content = "!(" + expr.translationJava + ")";
        return new ContextReturn(LOGIC, content);
    }

    @Override
    public ContextReturn visitParent_logic(IsiLangParser.Parent_logicContext ctx) {
        ContextReturn expr = visitExprLogic(ctx.exprLogic());
        String content = "(" + expr.translationJava + ")";
        return new ContextReturn(LOGIC, content);
    }

    @Override
    public ContextReturn visitBool_literal(IsiLangParser.Bool_literalContext ctx) {
        String literal = ctx.LOGIC_LITERAL().getText();
        String content = "";
        switch (literal) {
            case "Verdadeiro":
                content = "true";
                break;
            case "Falso":
                content = "false";
                break;
            default:
                error("Parâmetro inválido.");
                ;
        }
        return new ContextReturn(LOGIC, content);
    }

    @Override
    public ContextReturn visitExprLogic2(IsiLangParser.ExprLogic2Context ctx) {
        ContextReturn t = visitExprLogic(ctx.exprLogic());
        String op = ctx.LOG_OP().getText();
        String content = " " + op + " " + t.translationJava;

        return new ContextReturn(LOGIC, content); //TODO
    }

    @Override
    public ContextReturn visitExprLogic(IsiLangParser.ExprLogicContext ctx) {
        ContextReturn exprLogic1 = visitExprLogic1(ctx.exprLogic1());
        if(exprLogic1.type != LOGIC)
            error("Expressão não possui tipo lógico");

        if(ctx.exprLogic2() == null)
            return exprLogic1;

        ContextReturn exprLogic2 = visitExprLogic2(ctx.exprLogic2());
        if(exprLogic2.type != LOGIC)
            error("Expressão não possui tipo lógico");

        return new ContextReturn(LOGIC, exprLogic1.translationJava + exprLogic2.translationJava);
    }

    @Override
    public ContextReturn visitExprAritm(IsiLangParser.ExprAritmContext ctx) {
        List<IsiLangParser.ExprAritm2Context> values = ctx.exprAritm2();
        List<TerminalNode> ops = ctx.ARIT_L();

        ContextReturn var0 = visitExprAritm2(values.get(0));
        StringBuilder content = new StringBuilder(var0.translationJava);
        int opNumber = ops.size();
        for (int i = 0; i < opNumber; i++) {
            ContextReturn var = visitExprAritm2(values.get(i + 1));
            String op = ops.get(i).getText();
            content.append(" ").append(op).append(" ").append(var.translationJava);
        }

        return new ContextReturn(NUMERIC, content.toString());
    }

    @Override
    public ContextReturn visitExprAritm2(IsiLangParser.ExprAritm2Context ctx) {
        List<IsiLangParser.ExprAritm3Context> values = ctx.exprAritm3();
        List<TerminalNode> ops = ctx.ARIT_H();

        ContextReturn var0 = visitExprAritm3(values.get(0));
        if(var0.type != NUMERIC)
            error("Expressão não possui tipo numérico");

        StringBuilder content = new StringBuilder(var0.translationJava);
        int opNumber = ops.size();
        for (int i = 0; i < opNumber; i++) {
            ContextReturn var = visitExprAritm3(values.get(i+1));
            if(var.type != NUMERIC)
                error("Expressão não possui tipo numérico");
            String op = ops.get(i).getText();
            content.append(" ").append(op).append(" ").append(var.translationJava);
        }

        return new ContextReturn(NUMERIC, content.toString());
    }

    @Override
    public ContextReturn visitNumLit(IsiLangParser.NumLitContext ctx) {
        String text = ctx.NUMERIC_LITERAL().getText();
        return new ContextReturn(NUMERIC, text);
    }

    @Override
    public ContextReturn visitNumParen(IsiLangParser.NumParenContext ctx) {
        ContextReturn expr = visitExprAritm(ctx.exprAritm());
        String content = "(" + expr.translationJava + ")";
        return new ContextReturn(NUMERIC, content);
    }

    @Override
    public ContextReturn visitNumCast(IsiLangParser.NumCastContext ctx) {
        ContextReturn expr = visitExpr(ctx.expr());
        String content = "";
        switch (expr.type) {
            case TEXT:
            case NUMERIC:
                content = "Double.valueOf(" + expr.translationJava + ")";
                break;
            case LOGIC:
                content = "(" + expr.translationJava + "? 1 : 0 )";
                break;
            case UNKNOWN:
                error("Variável não inicializada.");
        }

        return new ContextReturn(NUMERIC, content);
    }

    public void error(String message) {
        throw new SemanticException(message);
    }

    public static class SemanticException extends IllegalArgumentException {

        public SemanticException(String message) {
            super(message);
        }
    }
}
