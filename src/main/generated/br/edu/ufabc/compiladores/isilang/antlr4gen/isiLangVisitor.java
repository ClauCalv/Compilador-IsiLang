// Generated from C:/Users/Clau_/Desktop/Matéria Facul/compilador/final/src/main/grammars\isiLang.g4 by ANTLR 4.8
package br.edu.ufabc.compiladores.isilang.antlr4gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link isiLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface isiLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link isiLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(isiLangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link isiLangParser#declara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclara(isiLangParser.DeclaraContext ctx);
	/**
	 * Visit a parse tree produced by {@link isiLangParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(isiLangParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link isiLangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(isiLangParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link isiLangParser#cmdLeitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeitura(isiLangParser.CmdLeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link isiLangParser#cmdEscrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscrita(isiLangParser.CmdEscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link isiLangParser#cmdIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdIf(isiLangParser.CmdIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link isiLangParser#cmdExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdExpr(isiLangParser.CmdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link isiLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(isiLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link isiLangParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(isiLangParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link isiLangParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(isiLangParser.FatorContext ctx);
}