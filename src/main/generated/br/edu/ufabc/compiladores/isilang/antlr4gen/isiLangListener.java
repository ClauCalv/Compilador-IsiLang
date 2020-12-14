// Generated from C:/Users/Clau_/Desktop/Matéria Facul/compilador/final/src/main/grammars\isiLang.g4 by ANTLR 4.8
package br.edu.ufabc.compiladores.isilang.antlr4gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link isiLangParser}.
 */
public interface isiLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link isiLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(isiLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(isiLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(isiLangParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(isiLangParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(isiLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(isiLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(isiLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(isiLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeitura(isiLangParser.CmdLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeitura(isiLangParser.CmdLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscrita(isiLangParser.CmdEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscrita(isiLangParser.CmdEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(isiLangParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(isiLangParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#cmdBlock}.
	 * @param ctx the parse tree
	 */
	void enterCmdBlock(isiLangParser.CmdBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#cmdBlock}.
	 * @param ctx the parse tree
	 */
	void exitCmdBlock(isiLangParser.CmdBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#cmdExpr}.
	 * @param ctx the parse tree
	 */
	void enterCmdExpr(isiLangParser.CmdExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#cmdExpr}.
	 * @param ctx the parse tree
	 */
	void exitCmdExpr(isiLangParser.CmdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(isiLangParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(isiLangParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(isiLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(isiLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#exprText}.
	 * @param ctx the parse tree
	 */
	void enterExprText(isiLangParser.ExprTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#exprText}.
	 * @param ctx the parse tree
	 */
	void exitExprText(isiLangParser.ExprTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#exprText1}.
	 * @param ctx the parse tree
	 */
	void enterExprText1(isiLangParser.ExprText1Context ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#exprText1}.
	 * @param ctx the parse tree
	 */
	void exitExprText1(isiLangParser.ExprText1Context ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#exprText2}.
	 * @param ctx the parse tree
	 */
	void enterExprText2(isiLangParser.ExprText2Context ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#exprText2}.
	 * @param ctx the parse tree
	 */
	void exitExprText2(isiLangParser.ExprText2Context ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void enterExprLogic(isiLangParser.ExprLogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void exitExprLogic(isiLangParser.ExprLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#exprLogic1}.
	 * @param ctx the parse tree
	 */
	void enterExprLogic1(isiLangParser.ExprLogic1Context ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#exprLogic1}.
	 * @param ctx the parse tree
	 */
	void exitExprLogic1(isiLangParser.ExprLogic1Context ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#exprLogic2}.
	 * @param ctx the parse tree
	 */
	void enterExprLogic2(isiLangParser.ExprLogic2Context ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#exprLogic2}.
	 * @param ctx the parse tree
	 */
	void exitExprLogic2(isiLangParser.ExprLogic2Context ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#exprAritm}.
	 * @param ctx the parse tree
	 */
	void enterExprAritm(isiLangParser.ExprAritmContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#exprAritm}.
	 * @param ctx the parse tree
	 */
	void exitExprAritm(isiLangParser.ExprAritmContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#exprAritm2}.
	 * @param ctx the parse tree
	 */
	void enterExprAritm2(isiLangParser.ExprAritm2Context ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#exprAritm2}.
	 * @param ctx the parse tree
	 */
	void exitExprAritm2(isiLangParser.ExprAritm2Context ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#exprAritm3}.
	 * @param ctx the parse tree
	 */
	void enterExprAritm3(isiLangParser.ExprAritm3Context ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#exprAritm3}.
	 * @param ctx the parse tree
	 */
	void exitExprAritm3(isiLangParser.ExprAritm3Context ctx);
}