// Generated from C:/Users/Clau_/Desktop/Matéria Facul/compilador/final/src/main/grammars\IsiLang.g4 by ANTLR 4.8
package br.edu.ufabc.compiladores.isilang.antlr4gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IsiLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IsiLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(IsiLangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#declara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclara(IsiLangParser.DeclaraContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#varDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclare(IsiLangParser.VarDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(IsiLangParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(IsiLangParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#cmdLeitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeitura(IsiLangParser.CmdLeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#cmdEscrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscrita(IsiLangParser.CmdEscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#cmdIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdIf(IsiLangParser.CmdIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#thenCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenCmd(IsiLangParser.ThenCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#elseCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseCmd(IsiLangParser.ElseCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#cmdBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdBlock(IsiLangParser.CmdBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#cmdAttrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAttrib(IsiLangParser.CmdAttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#cmdWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWhile(IsiLangParser.CmdWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(IsiLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#exprText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprText(IsiLangParser.ExprTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#exprText1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprText1(IsiLangParser.ExprText1Context ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#idText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdText(IsiLangParser.IdTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#stringTypeCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTypeCast(IsiLangParser.StringTypeCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(IsiLangParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#exprText2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprText2(IsiLangParser.ExprText2Context ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#exprLogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogic(IsiLangParser.ExprLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#exprLogic1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogic1(IsiLangParser.ExprLogic1Context ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#aritmRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmRelation(IsiLangParser.AritmRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#log_negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_negation(IsiLangParser.Log_negationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#parent_logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent_logic(IsiLangParser.Parent_logicContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(IsiLangParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#idLogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdLogic(IsiLangParser.IdLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#exprLogic2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogic2(IsiLangParser.ExprLogic2Context ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#exprAritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAritm(IsiLangParser.ExprAritmContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#exprAritm2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAritm2(IsiLangParser.ExprAritm2Context ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#exprAritm3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAritm3(IsiLangParser.ExprAritm3Context ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#numLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumLit(IsiLangParser.NumLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#idNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdNum(IsiLangParser.IdNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#numParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumParen(IsiLangParser.NumParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsiLangParser#numCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumCast(IsiLangParser.NumCastContext ctx);
}