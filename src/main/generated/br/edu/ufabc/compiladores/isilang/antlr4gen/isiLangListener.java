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
	 * Enter a parse tree produced by {@link isiLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(isiLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(isiLangParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link isiLangParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(isiLangParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link isiLangParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(isiLangParser.FatorContext ctx);
}