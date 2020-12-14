// Generated from C:/Users/Clau_/Desktop/Matéria Facul/compilador/final/src/main/grammars\IsiLang.g4 by ANTLR 4.8
package br.edu.ufabc.compiladores.isilang.antlr4gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ATTR=1, ARIT_H=2, ARIT_L=3, REL_OP=4, LOG_OP=5, NOT_OP=6, CONCAT_OP=7, 
		CMD_TEXT=8, CMD_NUM=9, BEGIN=10, END=11, DECL=12, CMD_IF=13, CMD_THEN=14, 
		CMD_ELSE=15, CMD_WHILE=16, CMD_DO=17, CMD_RD=18, CMD_WT=19, ID=20, TEXT_LITERAL=21, 
		LOGIC_LITERAL=22, NUMERIC_LITERAL=23, AP=24, FP=25, AC=26, FC=27, END_CMD=28, 
		SEP=29, WP=30;
	public static final int
		RULE_prog = 0, RULE_declara = 1, RULE_varDeclare = 2, RULE_bloco = 3, 
		RULE_cmd = 4, RULE_cmdLeitura = 5, RULE_cmdEscrita = 6, RULE_cmdIf = 7, 
		RULE_thenCmd = 8, RULE_elseCmd = 9, RULE_cmdBlock = 10, RULE_cmdAttrib = 11, 
		RULE_cmdWhile = 12, RULE_expr = 13, RULE_exprText = 14, RULE_exprText1 = 15, 
		RULE_idText = 16, RULE_stringTypeCast = 17, RULE_stringLiteral = 18, RULE_exprText2 = 19, 
		RULE_exprLogic = 20, RULE_exprLogic1 = 21, RULE_aritmRelation = 22, RULE_log_negation = 23, 
		RULE_parent_logic = 24, RULE_bool_literal = 25, RULE_idLogic = 26, RULE_exprLogic2 = 27, 
		RULE_exprAritm = 28, RULE_exprAritm2 = 29, RULE_exprAritm3 = 30, RULE_numLit = 31, 
		RULE_idNum = 32, RULE_numParen = 33, RULE_numCast = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declara", "varDeclare", "bloco", "cmd", "cmdLeitura", "cmdEscrita", 
			"cmdIf", "thenCmd", "elseCmd", "cmdBlock", "cmdAttrib", "cmdWhile", "expr", 
			"exprText", "exprText1", "idText", "stringTypeCast", "stringLiteral", 
			"exprText2", "exprLogic", "exprLogic1", "aritmRelation", "log_negation", 
			"parent_logic", "bool_literal", "idLogic", "exprLogic2", "exprAritm", 
			"exprAritm2", "exprAritm3", "numLit", "idNum", "numParen", "numCast"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", null, null, null, null, "'!'", "'++'", "'texto'", "'num'", 
			"'programa'", "'fimprog'", "'declare'", "'se'", "'entao'", "'senao'", 
			"'enquanto'", "'faca'", "'leia'", "'escreva'", null, null, null, null, 
			"'('", "')'", "'{'", "'}'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ATTR", "ARIT_H", "ARIT_L", "REL_OP", "LOG_OP", "NOT_OP", "CONCAT_OP", 
			"CMD_TEXT", "CMD_NUM", "BEGIN", "END", "DECL", "CMD_IF", "CMD_THEN", 
			"CMD_ELSE", "CMD_WHILE", "CMD_DO", "CMD_RD", "CMD_WT", "ID", "TEXT_LITERAL", 
			"LOGIC_LITERAL", "NUMERIC_LITERAL", "AP", "FP", "AC", "FC", "END_CMD", 
			"SEP", "WP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IsiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(IsiLangParser.BEGIN, 0); }
		public DeclaraContext declara() {
			return getRuleContext(DeclaraContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode END() { return getToken(IsiLangParser.END, 0); }
		public TerminalNode END_CMD() { return getToken(IsiLangParser.END_CMD, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(BEGIN);
			setState(71);
			declara();
			setState(72);
			bloco();
			setState(73);
			match(END);
			setState(74);
			match(END_CMD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaraContext extends ParserRuleContext {
		public TerminalNode DECL() { return getToken(IsiLangParser.DECL, 0); }
		public List<VarDeclareContext> varDeclare() {
			return getRuleContexts(VarDeclareContext.class);
		}
		public VarDeclareContext varDeclare(int i) {
			return getRuleContext(VarDeclareContext.class,i);
		}
		public TerminalNode END_CMD() { return getToken(IsiLangParser.END_CMD, 0); }
		public List<TerminalNode> SEP() { return getTokens(IsiLangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(IsiLangParser.SEP, i);
		}
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDeclara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitDeclara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaraContext declara() throws RecognitionException {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(DECL);
			setState(77);
			varDeclare();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(78);
				match(SEP);
				setState(79);
				varDeclare();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(END_CMD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclareContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(IsiLangParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterVarDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitVarDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitVarDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclareContext varDeclare() throws RecognitionException {
		VarDeclareContext _localctx = new VarDeclareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTR) {
				{
				setState(88);
				match(ATTR);
				setState(89);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> END_CMD() { return getTokens(IsiLangParser.END_CMD); }
		public TerminalNode END_CMD(int i) {
			return getToken(IsiLangParser.END_CMD, i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				cmd();
				setState(93);
				match(END_CMD);
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CMD_IF) | (1L << CMD_WHILE) | (1L << CMD_RD) | (1L << CMD_WT) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdLeituraContext cmdLeitura() {
			return getRuleContext(CmdLeituraContext.class,0);
		}
		public CmdEscritaContext cmdEscrita() {
			return getRuleContext(CmdEscritaContext.class,0);
		}
		public CmdAttribContext cmdAttrib() {
			return getRuleContext(CmdAttribContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CMD_RD:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				cmdLeitura();
				}
				break;
			case CMD_WT:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				cmdEscrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				cmdAttrib();
				}
				break;
			case CMD_IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				cmdIf();
				}
				break;
			case CMD_WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				cmdWhile();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdLeituraContext extends ParserRuleContext {
		public TerminalNode CMD_RD() { return getToken(IsiLangParser.CMD_RD, 0); }
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public CmdLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitCmdLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLeituraContext cmdLeitura() throws RecognitionException {
		CmdLeituraContext _localctx = new CmdLeituraContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(CMD_RD);
			setState(107);
			match(AP);
			setState(108);
			match(ID);
			setState(109);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEscritaContext extends ParserRuleContext {
		public TerminalNode CMD_WT() { return getToken(IsiLangParser.CMD_WT, 0); }
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdEscrita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitCmdEscrita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEscritaContext cmdEscrita() throws RecognitionException {
		CmdEscritaContext _localctx = new CmdEscritaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdEscrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(CMD_WT);
			setState(112);
			match(AP);
			{
			setState(113);
			expr();
			}
			setState(114);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode CMD_IF() { return getToken(IsiLangParser.CMD_IF, 0); }
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode CMD_THEN() { return getToken(IsiLangParser.CMD_THEN, 0); }
		public ThenCmdContext thenCmd() {
			return getRuleContext(ThenCmdContext.class,0);
		}
		public TerminalNode CMD_ELSE() { return getToken(IsiLangParser.CMD_ELSE, 0); }
		public ElseCmdContext elseCmd() {
			return getRuleContext(ElseCmdContext.class,0);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitCmdIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CMD_IF);
			setState(117);
			match(AP);
			setState(118);
			exprLogic();
			setState(119);
			match(FP);
			setState(120);
			match(CMD_THEN);
			setState(121);
			thenCmd();
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(122);
				match(CMD_ELSE);
				setState(123);
				elseCmd();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThenCmdContext extends ParserRuleContext {
		public CmdBlockContext cmdBlock() {
			return getRuleContext(CmdBlockContext.class,0);
		}
		public ThenCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterThenCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitThenCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitThenCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenCmdContext thenCmd() throws RecognitionException {
		ThenCmdContext _localctx = new ThenCmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_thenCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			cmdBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseCmdContext extends ParserRuleContext {
		public CmdBlockContext cmdBlock() {
			return getRuleContext(CmdBlockContext.class,0);
		}
		public ElseCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterElseCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitElseCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitElseCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseCmdContext elseCmd() throws RecognitionException {
		ElseCmdContext _localctx = new ElseCmdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			cmdBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdBlockContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(IsiLangParser.AC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FC() { return getToken(IsiLangParser.FC, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CmdBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitCmdBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdBlockContext cmdBlock() throws RecognitionException {
		CmdBlockContext _localctx = new CmdBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdBlock);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AC:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(AC);
				setState(131);
				bloco();
				setState(132);
				match(FC);
				}
				break;
			case CMD_IF:
			case CMD_WHILE:
			case CMD_RD:
			case CMD_WT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				cmd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAttribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(IsiLangParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdAttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAttrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdAttrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitCmdAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAttribContext cmdAttrib() throws RecognitionException {
		CmdAttribContext _localctx = new CmdAttribContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdAttrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ID);
			setState(138);
			match(ATTR);
			setState(139);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode CMD_WHILE() { return getToken(IsiLangParser.CMD_WHILE, 0); }
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode CMD_DO() { return getToken(IsiLangParser.CMD_DO, 0); }
		public CmdBlockContext cmdBlock() {
			return getRuleContext(CmdBlockContext.class,0);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitCmdWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(CMD_WHILE);
			setState(142);
			match(AP);
			setState(143);
			exprLogic();
			setState(144);
			match(FP);
			setState(145);
			match(CMD_DO);
			setState(146);
			cmdBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprTextContext exprText() {
			return getRuleContext(ExprTextContext.class,0);
		}
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public ExprAritmContext exprAritm() {
			return getRuleContext(ExprAritmContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				exprText();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				exprLogic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				exprAritm();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprTextContext extends ParserRuleContext {
		public ExprText1Context exprText1() {
			return getRuleContext(ExprText1Context.class,0);
		}
		public ExprText2Context exprText2() {
			return getRuleContext(ExprText2Context.class,0);
		}
		public ExprTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExprText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExprText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitExprText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprTextContext exprText() throws RecognitionException {
		ExprTextContext _localctx = new ExprTextContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			exprText1();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONCAT_OP) {
				{
				setState(154);
				exprText2();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprText1Context extends ParserRuleContext {
		public StringTypeCastContext stringTypeCast() {
			return getRuleContext(StringTypeCastContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public IdTextContext idText() {
			return getRuleContext(IdTextContext.class,0);
		}
		public ExprText1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprText1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExprText1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExprText1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitExprText1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprText1Context exprText1() throws RecognitionException {
		ExprText1Context _localctx = new ExprText1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprText1);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CMD_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				stringTypeCast();
				}
				break;
			case TEXT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				stringLiteral();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				idText();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdTextContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public IdTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterIdText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitIdText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitIdText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdTextContext idText() throws RecognitionException {
		IdTextContext _localctx = new IdTextContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_idText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringTypeCastContext extends ParserRuleContext {
		public TerminalNode CMD_TEXT() { return getToken(IsiLangParser.CMD_TEXT, 0); }
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public StringTypeCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringTypeCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterStringTypeCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitStringTypeCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitStringTypeCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringTypeCastContext stringTypeCast() throws RecognitionException {
		StringTypeCastContext _localctx = new StringTypeCastContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stringTypeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(CMD_TEXT);
			setState(165);
			match(AP);
			setState(166);
			expr();
			setState(167);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode TEXT_LITERAL() { return getToken(IsiLangParser.TEXT_LITERAL, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(TEXT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprText2Context extends ParserRuleContext {
		public TerminalNode CONCAT_OP() { return getToken(IsiLangParser.CONCAT_OP, 0); }
		public ExprTextContext exprText() {
			return getRuleContext(ExprTextContext.class,0);
		}
		public ExprText2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprText2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExprText2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExprText2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitExprText2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprText2Context exprText2() throws RecognitionException {
		ExprText2Context _localctx = new ExprText2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_exprText2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(CONCAT_OP);
			setState(172);
			exprText();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprLogicContext extends ParserRuleContext {
		public ExprLogic1Context exprLogic1() {
			return getRuleContext(ExprLogic1Context.class,0);
		}
		public ExprLogic2Context exprLogic2() {
			return getRuleContext(ExprLogic2Context.class,0);
		}
		public ExprLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExprLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExprLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitExprLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLogicContext exprLogic() throws RecognitionException {
		ExprLogicContext _localctx = new ExprLogicContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprLogic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			exprLogic1();
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(175);
				exprLogic2();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprLogic1Context extends ParserRuleContext {
		public AritmRelationContext aritmRelation() {
			return getRuleContext(AritmRelationContext.class,0);
		}
		public Log_negationContext log_negation() {
			return getRuleContext(Log_negationContext.class,0);
		}
		public Parent_logicContext parent_logic() {
			return getRuleContext(Parent_logicContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public IdLogicContext idLogic() {
			return getRuleContext(IdLogicContext.class,0);
		}
		public ExprLogic1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLogic1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExprLogic1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExprLogic1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitExprLogic1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLogic1Context exprLogic1() throws RecognitionException {
		ExprLogic1Context _localctx = new ExprLogic1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprLogic1);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				aritmRelation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				log_negation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				parent_logic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				bool_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				idLogic();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AritmRelationContext extends ParserRuleContext {
		public ExprAritmContext ex1;
		public ExprAritmContext ex2;
		public TerminalNode REL_OP() { return getToken(IsiLangParser.REL_OP, 0); }
		public List<ExprAritmContext> exprAritm() {
			return getRuleContexts(ExprAritmContext.class);
		}
		public ExprAritmContext exprAritm(int i) {
			return getRuleContext(ExprAritmContext.class,i);
		}
		public AritmRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterAritmRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitAritmRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitAritmRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AritmRelationContext aritmRelation() throws RecognitionException {
		AritmRelationContext _localctx = new AritmRelationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_aritmRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			((AritmRelationContext)_localctx).ex1 = exprAritm();
			setState(186);
			match(REL_OP);
			setState(187);
			((AritmRelationContext)_localctx).ex2 = exprAritm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Log_negationContext extends ParserRuleContext {
		public TerminalNode NOT_OP() { return getToken(IsiLangParser.NOT_OP, 0); }
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public Log_negationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterLog_negation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitLog_negation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitLog_negation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Log_negationContext log_negation() throws RecognitionException {
		Log_negationContext _localctx = new Log_negationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_log_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(NOT_OP);
			setState(190);
			exprLogic();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parent_logicContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public Parent_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterParent_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitParent_logic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitParent_logic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parent_logicContext parent_logic() throws RecognitionException {
		Parent_logicContext _localctx = new Parent_logicContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parent_logic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(AP);
			setState(193);
			exprLogic();
			setState(194);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode LOGIC_LITERAL() { return getToken(IsiLangParser.LOGIC_LITERAL, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bool_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(LOGIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdLogicContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public IdLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterIdLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitIdLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitIdLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdLogicContext idLogic() throws RecognitionException {
		IdLogicContext _localctx = new IdLogicContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_idLogic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprLogic2Context extends ParserRuleContext {
		public TerminalNode LOG_OP() { return getToken(IsiLangParser.LOG_OP, 0); }
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public ExprLogic2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLogic2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExprLogic2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExprLogic2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitExprLogic2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLogic2Context exprLogic2() throws RecognitionException {
		ExprLogic2Context _localctx = new ExprLogic2Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_exprLogic2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(LOG_OP);
			setState(201);
			exprLogic();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprAritmContext extends ParserRuleContext {
		public List<ExprAritm2Context> exprAritm2() {
			return getRuleContexts(ExprAritm2Context.class);
		}
		public ExprAritm2Context exprAritm2(int i) {
			return getRuleContext(ExprAritm2Context.class,i);
		}
		public List<TerminalNode> ARIT_L() { return getTokens(IsiLangParser.ARIT_L); }
		public TerminalNode ARIT_L(int i) {
			return getToken(IsiLangParser.ARIT_L, i);
		}
		public ExprAritmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAritm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExprAritm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExprAritm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitExprAritm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAritmContext exprAritm() throws RecognitionException {
		ExprAritmContext _localctx = new ExprAritmContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exprAritm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			exprAritm2();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARIT_L) {
				{
				{
				setState(204);
				match(ARIT_L);
				setState(205);
				exprAritm2();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprAritm2Context extends ParserRuleContext {
		public List<ExprAritm3Context> exprAritm3() {
			return getRuleContexts(ExprAritm3Context.class);
		}
		public ExprAritm3Context exprAritm3(int i) {
			return getRuleContext(ExprAritm3Context.class,i);
		}
		public List<TerminalNode> ARIT_H() { return getTokens(IsiLangParser.ARIT_H); }
		public TerminalNode ARIT_H(int i) {
			return getToken(IsiLangParser.ARIT_H, i);
		}
		public ExprAritm2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAritm2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExprAritm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExprAritm2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitExprAritm2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAritm2Context exprAritm2() throws RecognitionException {
		ExprAritm2Context _localctx = new ExprAritm2Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_exprAritm2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			exprAritm3();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARIT_H) {
				{
				{
				setState(212);
				match(ARIT_H);
				setState(213);
				exprAritm3();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprAritm3Context extends ParserRuleContext {
		public NumLitContext numLit() {
			return getRuleContext(NumLitContext.class,0);
		}
		public IdNumContext idNum() {
			return getRuleContext(IdNumContext.class,0);
		}
		public NumParenContext numParen() {
			return getRuleContext(NumParenContext.class,0);
		}
		public NumCastContext numCast() {
			return getRuleContext(NumCastContext.class,0);
		}
		public ExprAritm3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAritm3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExprAritm3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExprAritm3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitExprAritm3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAritm3Context exprAritm3() throws RecognitionException {
		ExprAritm3Context _localctx = new ExprAritm3Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_exprAritm3);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				numLit();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				idNum();
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				numParen();
				}
				break;
			case CMD_NUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				numCast();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumLitContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(IsiLangParser.NUMERIC_LITERAL, 0); }
		public NumLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterNumLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitNumLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitNumLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumLitContext numLit() throws RecognitionException {
		NumLitContext _localctx = new NumLitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdNumContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public IdNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterIdNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitIdNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitIdNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdNumContext idNum() throws RecognitionException {
		IdNumContext _localctx = new IdNumContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_idNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumParenContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public ExprAritmContext exprAritm() {
			return getRuleContext(ExprAritmContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public NumParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterNumParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitNumParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitNumParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumParenContext numParen() throws RecognitionException {
		NumParenContext _localctx = new NumParenContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_numParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(AP);
			setState(230);
			exprAritm();
			setState(231);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumCastContext extends ParserRuleContext {
		public TerminalNode CMD_NUM() { return getToken(IsiLangParser.CMD_NUM, 0); }
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public NumCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterNumCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitNumCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitNumCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumCastContext numCast() throws RecognitionException {
		NumCastContext _localctx = new NumCastContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_numCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(CMD_NUM);
			setState(234);
			match(AP);
			setState(235);
			expr();
			setState(236);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3S\n"+
		"\3\f\3\16\3V\13\3\3\3\3\3\3\4\3\4\3\4\5\4]\n\4\3\5\3\5\3\5\6\5b\n\5\r"+
		"\5\16\5c\3\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u008a\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u009a\n\17\3\20\3\20\5\20\u009e\n"+
		"\20\3\21\3\21\3\21\5\21\u00a3\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\5\26\u00b3\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u00ba\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u00d1\n\36"+
		"\f\36\16\36\u00d4\13\36\3\37\3\37\3\37\7\37\u00d9\n\37\f\37\16\37\u00dc"+
		"\13\37\3 \3 \3 \3 \5 \u00e2\n \3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDF\2\2\2\u00e5\2H\3\2\2\2\4N\3\2\2\2\6Y\3\2\2\2\ba\3\2\2\2\nj\3"+
		"\2\2\2\fl\3\2\2\2\16q\3\2\2\2\20v\3\2\2\2\22\u0080\3\2\2\2\24\u0082\3"+
		"\2\2\2\26\u0089\3\2\2\2\30\u008b\3\2\2\2\32\u008f\3\2\2\2\34\u0099\3\2"+
		"\2\2\36\u009b\3\2\2\2 \u00a2\3\2\2\2\"\u00a4\3\2\2\2$\u00a6\3\2\2\2&\u00ab"+
		"\3\2\2\2(\u00ad\3\2\2\2*\u00b0\3\2\2\2,\u00b9\3\2\2\2.\u00bb\3\2\2\2\60"+
		"\u00bf\3\2\2\2\62\u00c2\3\2\2\2\64\u00c6\3\2\2\2\66\u00c8\3\2\2\28\u00ca"+
		"\3\2\2\2:\u00cd\3\2\2\2<\u00d5\3\2\2\2>\u00e1\3\2\2\2@\u00e3\3\2\2\2B"+
		"\u00e5\3\2\2\2D\u00e7\3\2\2\2F\u00eb\3\2\2\2HI\7\f\2\2IJ\5\4\3\2JK\5\b"+
		"\5\2KL\7\r\2\2LM\7\36\2\2M\3\3\2\2\2NO\7\16\2\2OT\5\6\4\2PQ\7\37\2\2Q"+
		"S\5\6\4\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2"+
		"WX\7\36\2\2X\5\3\2\2\2Y\\\7\26\2\2Z[\7\3\2\2[]\5\34\17\2\\Z\3\2\2\2\\"+
		"]\3\2\2\2]\7\3\2\2\2^_\5\n\6\2_`\7\36\2\2`b\3\2\2\2a^\3\2\2\2bc\3\2\2"+
		"\2ca\3\2\2\2cd\3\2\2\2d\t\3\2\2\2ek\5\f\7\2fk\5\16\b\2gk\5\30\r\2hk\5"+
		"\20\t\2ik\5\32\16\2je\3\2\2\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2"+
		"k\13\3\2\2\2lm\7\24\2\2mn\7\32\2\2no\7\26\2\2op\7\33\2\2p\r\3\2\2\2qr"+
		"\7\25\2\2rs\7\32\2\2st\5\34\17\2tu\7\33\2\2u\17\3\2\2\2vw\7\17\2\2wx\7"+
		"\32\2\2xy\5*\26\2yz\7\33\2\2z{\7\20\2\2{~\5\22\n\2|}\7\21\2\2}\177\5\24"+
		"\13\2~|\3\2\2\2~\177\3\2\2\2\177\21\3\2\2\2\u0080\u0081\5\26\f\2\u0081"+
		"\23\3\2\2\2\u0082\u0083\5\26\f\2\u0083\25\3\2\2\2\u0084\u0085\7\34\2\2"+
		"\u0085\u0086\5\b\5\2\u0086\u0087\7\35\2\2\u0087\u008a\3\2\2\2\u0088\u008a"+
		"\5\n\6\2\u0089\u0084\3\2\2\2\u0089\u0088\3\2\2\2\u008a\27\3\2\2\2\u008b"+
		"\u008c\7\26\2\2\u008c\u008d\7\3\2\2\u008d\u008e\5\34\17\2\u008e\31\3\2"+
		"\2\2\u008f\u0090\7\22\2\2\u0090\u0091\7\32\2\2\u0091\u0092\5*\26\2\u0092"+
		"\u0093\7\33\2\2\u0093\u0094\7\23\2\2\u0094\u0095\5\26\f\2\u0095\33\3\2"+
		"\2\2\u0096\u009a\5\36\20\2\u0097\u009a\5*\26\2\u0098\u009a\5:\36\2\u0099"+
		"\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\35\3\2\2"+
		"\2\u009b\u009d\5 \21\2\u009c\u009e\5(\25\2\u009d\u009c\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\37\3\2\2\2\u009f\u00a3\5$\23\2\u00a0\u00a3\5&\24\2\u00a1"+
		"\u00a3\5\"\22\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3"+
		"\2\2\2\u00a3!\3\2\2\2\u00a4\u00a5\7\26\2\2\u00a5#\3\2\2\2\u00a6\u00a7"+
		"\7\n\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa\7\33\2"+
		"\2\u00aa%\3\2\2\2\u00ab\u00ac\7\27\2\2\u00ac\'\3\2\2\2\u00ad\u00ae\7\t"+
		"\2\2\u00ae\u00af\5\36\20\2\u00af)\3\2\2\2\u00b0\u00b2\5,\27\2\u00b1\u00b3"+
		"\58\35\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3+\3\2\2\2\u00b4"+
		"\u00ba\5.\30\2\u00b5\u00ba\5\60\31\2\u00b6\u00ba\5\62\32\2\u00b7\u00ba"+
		"\5\64\33\2\u00b8\u00ba\5\66\34\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2"+
		"\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba-"+
		"\3\2\2\2\u00bb\u00bc\5:\36\2\u00bc\u00bd\7\6\2\2\u00bd\u00be\5:\36\2\u00be"+
		"/\3\2\2\2\u00bf\u00c0\7\b\2\2\u00c0\u00c1\5*\26\2\u00c1\61\3\2\2\2\u00c2"+
		"\u00c3\7\32\2\2\u00c3\u00c4\5*\26\2\u00c4\u00c5\7\33\2\2\u00c5\63\3\2"+
		"\2\2\u00c6\u00c7\7\30\2\2\u00c7\65\3\2\2\2\u00c8\u00c9\7\26\2\2\u00c9"+
		"\67\3\2\2\2\u00ca\u00cb\7\7\2\2\u00cb\u00cc\5*\26\2\u00cc9\3\2\2\2\u00cd"+
		"\u00d2\5<\37\2\u00ce\u00cf\7\5\2\2\u00cf\u00d1\5<\37\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		";\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00da\5> \2\u00d6\u00d7\7\4\2\2\u00d7"+
		"\u00d9\5> \2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2"+
		"\2\u00da\u00db\3\2\2\2\u00db=\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e2"+
		"\5@!\2\u00de\u00e2\5B\"\2\u00df\u00e2\5D#\2\u00e0\u00e2\5F$\2\u00e1\u00dd"+
		"\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"?\3\2\2\2\u00e3\u00e4\7\31\2\2\u00e4A\3\2\2\2\u00e5\u00e6\7\26\2\2\u00e6"+
		"C\3\2\2\2\u00e7\u00e8\7\32\2\2\u00e8\u00e9\5:\36\2\u00e9\u00ea\7\33\2"+
		"\2\u00eaE\3\2\2\2\u00eb\u00ec\7\13\2\2\u00ec\u00ed\7\32\2\2\u00ed\u00ee"+
		"\5\34\17\2\u00ee\u00ef\7\33\2\2\u00efG\3\2\2\2\20T\\cj~\u0089\u0099\u009d"+
		"\u00a2\u00b2\u00b9\u00d2\u00da\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}