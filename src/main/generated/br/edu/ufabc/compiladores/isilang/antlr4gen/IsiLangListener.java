// Generated from C:/Users/Clau_/Desktop/Matéria Facul/compilador/final/src/main/grammars\IsiLang.g4 by ANTLR 4.8
package br.edu.ufabc.compiladores.isilang.antlr4gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IsiLangParser}.
 */
public interface IsiLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(IsiLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(IsiLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(IsiLangParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(IsiLangParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#varDeclare}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclare(IsiLangParser.VarDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#varDeclare}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclare(IsiLangParser.VarDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(IsiLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(IsiLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(IsiLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(IsiLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeitura(IsiLangParser.CmdLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeitura(IsiLangParser.CmdLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscrita(IsiLangParser.CmdEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscrita(IsiLangParser.CmdEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(IsiLangParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(IsiLangParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdBlock}.
	 * @param ctx the parse tree
	 */
	void enterCmdBlock(IsiLangParser.CmdBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdBlock}.
	 * @param ctx the parse tree
	 */
	void exitCmdBlock(IsiLangParser.CmdBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdAttrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdAttrib(IsiLangParser.CmdAttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdAttrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdAttrib(IsiLangParser.CmdAttribContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(IsiLangParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(IsiLangParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IsiLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IsiLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#exprText}.
	 * @param ctx the parse tree
	 */
	void enterExprText(IsiLangParser.ExprTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#exprText}.
	 * @param ctx the parse tree
	 */
	void exitExprText(IsiLangParser.ExprTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#exprText1}.
	 * @param ctx the parse tree
	 */
	void enterExprText1(IsiLangParser.ExprText1Context ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#exprText1}.
	 * @param ctx the parse tree
	 */
	void exitExprText1(IsiLangParser.ExprText1Context ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#exprText2}.
	 * @param ctx the parse tree
	 */
	void enterExprText2(IsiLangParser.ExprText2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#exprText2}.
	 * @param ctx the parse tree
	 */
	void exitExprText2(IsiLangParser.ExprText2Context ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void enterExprLogic(IsiLangParser.ExprLogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void exitExprLogic(IsiLangParser.ExprLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#exprLogic1}.
	 * @param ctx the parse tree
	 */
	void enterExprLogic1(IsiLangParser.ExprLogic1Context ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#exprLogic1}.
	 * @param ctx the parse tree
	 */
	void exitExprLogic1(IsiLangParser.ExprLogic1Context ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#exprLogic2}.
	 * @param ctx the parse tree
	 */
	void enterExprLogic2(IsiLangParser.ExprLogic2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#exprLogic2}.
	 * @param ctx the parse tree
	 */
	void exitExprLogic2(IsiLangParser.ExprLogic2Context ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#exprAritm}.
	 * @param ctx the parse tree
	 */
	void enterExprAritm(IsiLangParser.ExprAritmContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#exprAritm}.
	 * @param ctx the parse tree
	 */
	void exitExprAritm(IsiLangParser.ExprAritmContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#exprAritm2}.
	 * @param ctx the parse tree
	 */
	void enterExprAritm2(IsiLangParser.ExprAritm2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#exprAritm2}.
	 * @param ctx the parse tree
	 */
	void exitExprAritm2(IsiLangParser.ExprAritm2Context ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#exprAritm3}.
	 * @param ctx the parse tree
	 */
	void enterExprAritm3(IsiLangParser.ExprAritm3Context ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#exprAritm3}.
	 * @param ctx the parse tree
	 */
	void exitExprAritm3(IsiLangParser.ExprAritm3Context ctx);
}