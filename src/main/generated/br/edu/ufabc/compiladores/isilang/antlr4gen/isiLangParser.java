// Generated from C:/Users/Clau_/Desktop/Matéria Facul/compilador/final/src/main/grammars\isiLang.g4 by ANTLR 4.8
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
public class isiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ATTR=1, ARIT_H=2, ARIT_L=3, REL_OP=4, LOG_OP=5, NOT_OP=6, CONCAT_OP=7, 
		CMD_TEXT=8, BEGIN=9, END=10, DECL=11, CMD_IF=12, CMD_THEN=13, CMD_ELSE=14, 
		CMD_WHILE=15, CMD_DO=16, CMD_RD=17, CMD_WT=18, ID=19, TEXT_LITERAL=20, 
		LOGIC_LITERAL=21, NUMERIC_LITERAL=22, AP=23, FP=24, AC=25, FC=26, END_CMD=27, 
		SEP=28, WP=29;
	public static final int
		RULE_prog = 0, RULE_declara = 1, RULE_bloco = 2, RULE_cmd = 3, RULE_cmdLeitura = 4, 
		RULE_cmdEscrita = 5, RULE_cmdIf = 6, RULE_cmdBlock = 7, RULE_cmdExpr = 8, 
		RULE_cmdWhile = 9, RULE_expr = 10, RULE_exprText = 11, RULE_exprText1 = 12, 
		RULE_exprText2 = 13, RULE_exprLogic = 14, RULE_exprLogic1 = 15, RULE_exprLogic2 = 16, 
		RULE_exprAritm = 17, RULE_exprAritm2 = 18, RULE_exprAritm3 = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declara", "bloco", "cmd", "cmdLeitura", "cmdEscrita", "cmdIf", 
			"cmdBlock", "cmdExpr", "cmdWhile", "expr", "exprText", "exprText1", "exprText2", 
			"exprLogic", "exprLogic1", "exprLogic2", "exprAritm", "exprAritm2", "exprAritm3"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", null, null, null, null, "'!'", "'++'", "'texto'", "'programa'", 
			"'fimprog'", "'declare'", "'se'", "'entao'", "'senao'", "'enquanto'", 
			"'faca'", "'leia'", "'escreva'", null, null, null, null, "'('", "')'", 
			"'{'", "'}'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ATTR", "ARIT_H", "ARIT_L", "REL_OP", "LOG_OP", "NOT_OP", "CONCAT_OP", 
			"CMD_TEXT", "BEGIN", "END", "DECL", "CMD_IF", "CMD_THEN", "CMD_ELSE", 
			"CMD_WHILE", "CMD_DO", "CMD_RD", "CMD_WT", "ID", "TEXT_LITERAL", "LOGIC_LITERAL", 
			"NUMERIC_LITERAL", "AP", "FP", "AC", "FC", "END_CMD", "SEP", "WP"
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
	public String getGrammarFileName() { return "isiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public isiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(isiLangParser.BEGIN, 0); }
		public DeclaraContext declara() {
			return getRuleContext(DeclaraContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode END() { return getToken(isiLangParser.END, 0); }
		public TerminalNode END_CMD() { return getToken(isiLangParser.END_CMD, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(BEGIN);
			setState(41);
			declara();
			setState(42);
			bloco();
			setState(43);
			match(END);
			setState(44);
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
		public TerminalNode DECL() { return getToken(isiLangParser.DECL, 0); }
		public List<TerminalNode> ID() { return getTokens(isiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(isiLangParser.ID, i);
		}
		public TerminalNode END_CMD() { return getToken(isiLangParser.END_CMD, 0); }
		public List<TerminalNode> SEP() { return getTokens(isiLangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(isiLangParser.SEP, i);
		}
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitDeclara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitDeclara(this);
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
			setState(46);
			match(DECL);
			setState(47);
			match(ID);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(48);
				match(SEP);
				setState(49);
				match(ID);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> END_CMD() { return getTokens(isiLangParser.END_CMD); }
		public TerminalNode END_CMD(int i) {
			return getToken(isiLangParser.END_CMD, i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				cmd();
				setState(58);
				match(END_CMD);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CMD_IF) | (1L << CMD_RD) | (1L << CMD_WT) | (1L << ID))) != 0) );
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
		public CmdExprContext cmdExpr() {
			return getRuleContext(CmdExprContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CMD_RD:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				cmdLeitura();
				}
				break;
			case CMD_WT:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				cmdEscrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				cmdExpr();
				}
				break;
			case CMD_IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				cmdIf();
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
		public TerminalNode CMD_RD() { return getToken(isiLangParser.CMD_RD, 0); }
		public TerminalNode AP() { return getToken(isiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(isiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(isiLangParser.FP, 0); }
		public CmdLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterCmdLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitCmdLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitCmdLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLeituraContext cmdLeitura() throws RecognitionException {
		CmdLeituraContext _localctx = new CmdLeituraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmdLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(CMD_RD);
			setState(71);
			match(AP);
			setState(72);
			match(ID);
			setState(73);
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
		public TerminalNode CMD_WT() { return getToken(isiLangParser.CMD_WT, 0); }
		public TerminalNode AP() { return getToken(isiLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(isiLangParser.FP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterCmdEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitCmdEscrita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitCmdEscrita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEscritaContext cmdEscrita() throws RecognitionException {
		CmdEscritaContext _localctx = new CmdEscritaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdEscrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(CMD_WT);
			setState(76);
			match(AP);
			{
			setState(77);
			expr();
			}
			setState(78);
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
		public TerminalNode CMD_IF() { return getToken(isiLangParser.CMD_IF, 0); }
		public TerminalNode AP() { return getToken(isiLangParser.AP, 0); }
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public TerminalNode FP() { return getToken(isiLangParser.FP, 0); }
		public TerminalNode CMD_THEN() { return getToken(isiLangParser.CMD_THEN, 0); }
		public List<CmdBlockContext> cmdBlock() {
			return getRuleContexts(CmdBlockContext.class);
		}
		public CmdBlockContext cmdBlock(int i) {
			return getRuleContext(CmdBlockContext.class,i);
		}
		public TerminalNode CMD_ELSE() { return getToken(isiLangParser.CMD_ELSE, 0); }
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitCmdIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitCmdIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(CMD_IF);
			setState(81);
			match(AP);
			setState(82);
			exprLogic();
			setState(83);
			match(FP);
			setState(84);
			match(CMD_THEN);
			setState(85);
			cmdBlock();
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(86);
				match(CMD_ELSE);
				setState(87);
				cmdBlock();
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

	public static class CmdBlockContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(isiLangParser.AC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FC() { return getToken(isiLangParser.FC, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CmdBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterCmdBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitCmdBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitCmdBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdBlockContext cmdBlock() throws RecognitionException {
		CmdBlockContext _localctx = new CmdBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdBlock);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AC:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(AC);
				setState(91);
				bloco();
				setState(92);
				match(FC);
				}
				break;
			case CMD_IF:
			case CMD_RD:
			case CMD_WT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
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

	public static class CmdExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(isiLangParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(isiLangParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterCmdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitCmdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitCmdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdExprContext cmdExpr() throws RecognitionException {
		CmdExprContext _localctx = new CmdExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ID);
			setState(98);
			match(ATTR);
			setState(99);
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
		public TerminalNode CMD_WHILE() { return getToken(isiLangParser.CMD_WHILE, 0); }
		public TerminalNode AP() { return getToken(isiLangParser.AP, 0); }
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public TerminalNode FP() { return getToken(isiLangParser.FP, 0); }
		public TerminalNode CMD_DO() { return getToken(isiLangParser.CMD_DO, 0); }
		public TerminalNode AC() { return getToken(isiLangParser.AC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FC() { return getToken(isiLangParser.FC, 0); }
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitCmdWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitCmdWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(CMD_WHILE);
			setState(102);
			match(AP);
			setState(103);
			exprLogic();
			setState(104);
			match(FP);
			setState(105);
			match(CMD_DO);
			setState(106);
			match(AC);
			setState(107);
			bloco();
			setState(108);
			match(FC);
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
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				exprText();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				exprLogic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
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
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterExprText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitExprText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitExprText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprTextContext exprText() throws RecognitionException {
		ExprTextContext _localctx = new ExprTextContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			exprText1();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONCAT_OP) {
				{
				setState(116);
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
		public TerminalNode CMD_TEXT() { return getToken(isiLangParser.CMD_TEXT, 0); }
		public TerminalNode AP() { return getToken(isiLangParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(isiLangParser.FP, 0); }
		public TerminalNode TEXT_LITERAL() { return getToken(isiLangParser.TEXT_LITERAL, 0); }
		public ExprText1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprText1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterExprText1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitExprText1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitExprText1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprText1Context exprText1() throws RecognitionException {
		ExprText1Context _localctx = new ExprText1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprText1);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CMD_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(CMD_TEXT);
				setState(120);
				match(AP);
				setState(121);
				expr();
				setState(122);
				match(FP);
				}
				break;
			case TEXT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(TEXT_LITERAL);
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

	public static class ExprText2Context extends ParserRuleContext {
		public TerminalNode CONCAT_OP() { return getToken(isiLangParser.CONCAT_OP, 0); }
		public ExprTextContext exprText() {
			return getRuleContext(ExprTextContext.class,0);
		}
		public ExprText2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprText2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterExprText2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitExprText2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitExprText2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprText2Context exprText2() throws RecognitionException {
		ExprText2Context _localctx = new ExprText2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprText2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(CONCAT_OP);
			setState(128);
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
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterExprLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitExprLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitExprLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLogicContext exprLogic() throws RecognitionException {
		ExprLogicContext _localctx = new ExprLogicContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprLogic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			exprLogic1();
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(131);
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
		public List<ExprAritmContext> exprAritm() {
			return getRuleContexts(ExprAritmContext.class);
		}
		public ExprAritmContext exprAritm(int i) {
			return getRuleContext(ExprAritmContext.class,i);
		}
		public TerminalNode REL_OP() { return getToken(isiLangParser.REL_OP, 0); }
		public TerminalNode NOT_OP() { return getToken(isiLangParser.NOT_OP, 0); }
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public TerminalNode AP() { return getToken(isiLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(isiLangParser.FP, 0); }
		public TerminalNode LOGIC_LITERAL() { return getToken(isiLangParser.LOGIC_LITERAL, 0); }
		public TerminalNode ID() { return getToken(isiLangParser.ID, 0); }
		public ExprLogic1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLogic1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterExprLogic1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitExprLogic1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitExprLogic1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLogic1Context exprLogic1() throws RecognitionException {
		ExprLogic1Context _localctx = new ExprLogic1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprLogic1);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				exprAritm();
				setState(135);
				match(REL_OP);
				setState(136);
				exprAritm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(NOT_OP);
				setState(139);
				exprLogic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(AP);
				setState(141);
				exprLogic();
				setState(142);
				match(FP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(LOGIC_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				match(ID);
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

	public static class ExprLogic2Context extends ParserRuleContext {
		public TerminalNode LOG_OP() { return getToken(isiLangParser.LOG_OP, 0); }
		public ExprLogicContext exprLogic() {
			return getRuleContext(ExprLogicContext.class,0);
		}
		public ExprLogic2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLogic2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterExprLogic2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitExprLogic2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitExprLogic2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLogic2Context exprLogic2() throws RecognitionException {
		ExprLogic2Context _localctx = new ExprLogic2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprLogic2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(LOG_OP);
			setState(149);
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
		public List<TerminalNode> ARIT_L() { return getTokens(isiLangParser.ARIT_L); }
		public TerminalNode ARIT_L(int i) {
			return getToken(isiLangParser.ARIT_L, i);
		}
		public ExprAritmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAritm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterExprAritm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitExprAritm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitExprAritm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAritmContext exprAritm() throws RecognitionException {
		ExprAritmContext _localctx = new ExprAritmContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exprAritm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			exprAritm2();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARIT_L) {
				{
				{
				setState(152);
				match(ARIT_L);
				setState(153);
				exprAritm2();
				}
				}
				setState(158);
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
		public List<TerminalNode> ARIT_H() { return getTokens(isiLangParser.ARIT_H); }
		public TerminalNode ARIT_H(int i) {
			return getToken(isiLangParser.ARIT_H, i);
		}
		public ExprAritm2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAritm2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterExprAritm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitExprAritm2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitExprAritm2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAritm2Context exprAritm2() throws RecognitionException {
		ExprAritm2Context _localctx = new ExprAritm2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprAritm2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			exprAritm3();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARIT_H) {
				{
				{
				setState(160);
				match(ARIT_H);
				setState(161);
				exprAritm3();
				}
				}
				setState(166);
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
		public TerminalNode NUMERIC_LITERAL() { return getToken(isiLangParser.NUMERIC_LITERAL, 0); }
		public TerminalNode ID() { return getToken(isiLangParser.ID, 0); }
		public TerminalNode AP() { return getToken(isiLangParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(isiLangParser.FP, 0); }
		public ExprAritm3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAritm3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).enterExprAritm3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof isiLangListener ) ((isiLangListener)listener).exitExprAritm3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof isiLangVisitor ) return ((isiLangVisitor<? extends T>)visitor).visitExprAritm3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAritm3Context exprAritm3() throws RecognitionException {
		ExprAritm3Context _localctx = new ExprAritm3Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_exprAritm3);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(NUMERIC_LITERAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(ID);
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(AP);
				setState(170);
				expr();
				setState(171);
				match(FP);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00b2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\4\3\4\3\4\6\4?\n\4\r\4\16\4@\3\5"+
		"\3\5\3\5\3\5\5\5G\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\t\3\t\5\tb\n\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f"+
		"t\n\f\3\r\3\r\5\rx\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0080\n\16\3"+
		"\17\3\17\3\17\3\20\3\20\5\20\u0087\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0095\n\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\7\23\u009d\n\23\f\23\16\23\u00a0\13\23\3\24\3\24\3\24\7\24\u00a5"+
		"\n\24\f\24\16\24\u00a8\13\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00b0"+
		"\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\2\u00b1"+
		"\2*\3\2\2\2\4\60\3\2\2\2\6>\3\2\2\2\bF\3\2\2\2\nH\3\2\2\2\fM\3\2\2\2\16"+
		"R\3\2\2\2\20a\3\2\2\2\22c\3\2\2\2\24g\3\2\2\2\26s\3\2\2\2\30u\3\2\2\2"+
		"\32\177\3\2\2\2\34\u0081\3\2\2\2\36\u0084\3\2\2\2 \u0094\3\2\2\2\"\u0096"+
		"\3\2\2\2$\u0099\3\2\2\2&\u00a1\3\2\2\2(\u00af\3\2\2\2*+\7\13\2\2+,\5\4"+
		"\3\2,-\5\6\4\2-.\7\f\2\2./\7\35\2\2/\3\3\2\2\2\60\61\7\r\2\2\61\66\7\25"+
		"\2\2\62\63\7\36\2\2\63\65\7\25\2\2\64\62\3\2\2\2\658\3\2\2\2\66\64\3\2"+
		"\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\35\2\2:\5\3\2\2\2;<\5\b"+
		"\5\2<=\7\35\2\2=?\3\2\2\2>;\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\7\3"+
		"\2\2\2BG\5\n\6\2CG\5\f\7\2DG\5\22\n\2EG\5\16\b\2FB\3\2\2\2FC\3\2\2\2F"+
		"D\3\2\2\2FE\3\2\2\2G\t\3\2\2\2HI\7\23\2\2IJ\7\31\2\2JK\7\25\2\2KL\7\32"+
		"\2\2L\13\3\2\2\2MN\7\24\2\2NO\7\31\2\2OP\5\26\f\2PQ\7\32\2\2Q\r\3\2\2"+
		"\2RS\7\16\2\2ST\7\31\2\2TU\5\36\20\2UV\7\32\2\2VW\7\17\2\2WZ\5\20\t\2"+
		"XY\7\20\2\2Y[\5\20\t\2ZX\3\2\2\2Z[\3\2\2\2[\17\3\2\2\2\\]\7\33\2\2]^\5"+
		"\6\4\2^_\7\34\2\2_b\3\2\2\2`b\5\b\5\2a\\\3\2\2\2a`\3\2\2\2b\21\3\2\2\2"+
		"cd\7\25\2\2de\7\3\2\2ef\5\26\f\2f\23\3\2\2\2gh\7\21\2\2hi\7\31\2\2ij\5"+
		"\36\20\2jk\7\32\2\2kl\7\22\2\2lm\7\33\2\2mn\5\6\4\2no\7\34\2\2o\25\3\2"+
		"\2\2pt\5\30\r\2qt\5\36\20\2rt\5$\23\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\27"+
		"\3\2\2\2uw\5\32\16\2vx\5\34\17\2wv\3\2\2\2wx\3\2\2\2x\31\3\2\2\2yz\7\n"+
		"\2\2z{\7\31\2\2{|\5\26\f\2|}\7\32\2\2}\u0080\3\2\2\2~\u0080\7\26\2\2\177"+
		"y\3\2\2\2\177~\3\2\2\2\u0080\33\3\2\2\2\u0081\u0082\7\t\2\2\u0082\u0083"+
		"\5\30\r\2\u0083\35\3\2\2\2\u0084\u0086\5 \21\2\u0085\u0087\5\"\22\2\u0086"+
		"\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\37\3\2\2\2\u0088\u0089\5$\23"+
		"\2\u0089\u008a\7\6\2\2\u008a\u008b\5$\23\2\u008b\u0095\3\2\2\2\u008c\u008d"+
		"\7\b\2\2\u008d\u0095\5\36\20\2\u008e\u008f\7\31\2\2\u008f\u0090\5\36\20"+
		"\2\u0090\u0091\7\32\2\2\u0091\u0095\3\2\2\2\u0092\u0095\7\27\2\2\u0093"+
		"\u0095\7\25\2\2\u0094\u0088\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008e\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095!\3\2\2\2\u0096\u0097"+
		"\7\7\2\2\u0097\u0098\5\36\20\2\u0098#\3\2\2\2\u0099\u009e\5&\24\2\u009a"+
		"\u009b\7\5\2\2\u009b\u009d\5&\24\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f%\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a6\5(\25\2\u00a2\u00a3\7\4\2\2\u00a3\u00a5\5(\25\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\'\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00b0\7\30\2\2\u00aa\u00b0"+
		"\7\25\2\2\u00ab\u00ac\7\31\2\2\u00ac\u00ad\5\26\f\2\u00ad\u00ae\7\32\2"+
		"\2\u00ae\u00b0\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ab"+
		"\3\2\2\2\u00b0)\3\2\2\2\17\66@FZasw\177\u0086\u0094\u009e\u00a6\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}