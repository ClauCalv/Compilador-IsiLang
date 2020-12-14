package br.edu.ufabc.compiladores.isilang;

import br.edu.ufabc.compiladores.isilang.antlr4gen.IsiLangBaseVisitor;
import br.edu.ufabc.compiladores.isilang.antlr4gen.IsiLangParser;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsiLangCVisitor extends IsiLangBaseVisitor<Variable.VariableType> {

    Map<String, Variable> variables = new HashMap<String, Variable>();

    List<String> varDecls = new ArrayList<String>();

    @Override
    public Variable.VariableType visitProg(IsiLangParser.ProgContext ctx) {
        //
        // INTIALIZE C CODES
        //

        visitChildren(ctx);

        //
        // VALIDATE AND FINALIZE
        //
        return null;
    }

    @Override
    public Variable.VariableType visitVarDeclare(IsiLangParser.VarDeclareContext ctx) {
        String ID = ctx.ID().getText();
        if(variables.containsKey(ID))
            error();

        variables.put(ID, new Variable(ID));

        Variable.VariableType init = Variable.VariableType.UNKNOWN;
        String output = init.toC() + " " + ID + ";\n";

        if(ctx.expr() != null) {
            init = visitExpr(ctx.expr());
            if(!variables.get(ID).setType(init))
                error();
            output = init.toC() + " " + ID + " = " + parseExp(ctx.expr().getText()) + ";\n";
        }

        varDecls.add(output);
        return null;
    }

    @Override
    public Variable.VariableType visitCmdLeitura(IsiLangParser.CmdLeituraContext ctx) {
        return super.visitCmdLeitura(ctx); //TODO
    }

    @Override
    public Variable.VariableType visitCmdEscrita(IsiLangParser.CmdEscritaContext ctx) {
        return super.visitCmdEscrita(ctx); //TODO
    }

    @Override
    public Variable.VariableType visitCmdIf(IsiLangParser.CmdIfContext ctx) {
        return super.visitCmdIf(ctx); //TODO
    }

    @Override
    public Variable.VariableType visitCmdAttrib(IsiLangParser.CmdAttribContext ctx) {
        return super.visitCmdAttrib(ctx); //TODO
    }

    @Override
    public Variable.VariableType visitCmdWhile(IsiLangParser.CmdWhileContext ctx) {
        return super.visitCmdWhile(ctx); //TODO
    }

    @Override
    public Variable.VariableType visitExprText1(IsiLangParser.ExprText1Context ctx) {
        return super.visitExprText1(ctx); //TODO
    }

    @Override
    public Variable.VariableType visitExprText2(IsiLangParser.ExprText2Context ctx) {
        return super.visitExprText2(ctx); //TODO
    }

    @Override
    public Variable.VariableType visitExprLogic1(IsiLangParser.ExprLogic1Context ctx) {
        return super.visitExprLogic1(ctx);  //TODO
    }

    @Override
    public Variable.VariableType visitExprLogic2(IsiLangParser.ExprLogic2Context ctx) {
        return super.visitExprLogic2(ctx); //TODO
    }

    @Override
    public Variable.VariableType visitExprAritm(IsiLangParser.ExprAritmContext ctx) {
        return super.visitExprAritm(ctx); //TODO
    }

    @Override
    public Variable.VariableType visitExprAritm2(IsiLangParser.ExprAritm2Context ctx) {
        return super.visitExprAritm2(ctx); //TODO
    }

    @Override
    public Variable.VariableType visitExprAritm3(IsiLangParser.ExprAritm3Context ctx) {
        return super.visitExprAritm3(ctx); //TODO
    }


    public String parseExp(String expr){
        return null; //TODO
    }
    public void error(){
        //TODO
    }
}
