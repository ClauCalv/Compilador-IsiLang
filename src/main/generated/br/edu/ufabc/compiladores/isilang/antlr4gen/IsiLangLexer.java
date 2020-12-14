// Generated from C:/Users/Clau_/Desktop/Matéria Facul/compilador/final/src/main/grammars\IsiLang.g4 by ANTLR 4.8
package br.edu.ufabc.compiladores.isilang.antlr4gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ATTR", "ARIT_H", "ARIT_L", "REL_OP", "LOG_OP", "NOT_OP", "CONCAT_OP", 
			"CMD_TEXT", "CMD_NUM", "BEGIN", "END", "DECL", "CMD_IF", "CMD_THEN", 
			"CMD_ELSE", "CMD_WHILE", "CMD_DO", "CMD_RD", "CMD_WT", "ID", "TEXT_LITERAL", 
			"TEXT_ELEM", "TEXT_DECL", "LOGIC_LITERAL", "NUMERIC_LITERAL", "NUM_INT", 
			"NUM_DEC", "NUMERIC", "ALPHABETIC", "AP", "FP", "AC", "FC", "END_CMD", 
			"SEP", "WP"
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


	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u0107\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3\6\3\6\5\6b\n\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00ba\n\25\f\25\16\25\u00bd"+
		"\13\25\3\26\3\26\7\26\u00c1\n\26\f\26\16\26\u00c4\13\26\3\26\3\26\3\27"+
		"\3\27\3\27\5\27\u00cb\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00de\n\31\3\32\3\32\5\32"+
		"\u00e2\n\32\3\33\6\33\u00e5\n\33\r\33\16\33\u00e6\3\34\6\34\u00ea\n\34"+
		"\r\34\16\34\u00eb\3\34\3\34\6\34\u00f0\n\34\r\34\16\34\u00f1\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\2\2&"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61\30\63\31\65\2\67\29\2;\2=\32"+
		"?\33A\34C\35E\36G\37I \3\2\t\4\2,,\61\61\4\2--//\4\2>>@@\4\2$$^^\3\2\62"+
		";\4\2C\\c|\5\2\13\f\17\17\"\"\2\u010f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5N\3\2\2"+
		"\2\7P\3\2\2\2\t[\3\2\2\2\13a\3\2\2\2\rc\3\2\2\2\17e\3\2\2\2\21h\3\2\2"+
		"\2\23n\3\2\2\2\25r\3\2\2\2\27{\3\2\2\2\31\u0083\3\2\2\2\33\u008b\3\2\2"+
		"\2\35\u008e\3\2\2\2\37\u0094\3\2\2\2!\u009a\3\2\2\2#\u00a3\3\2\2\2%\u00a8"+
		"\3\2\2\2\'\u00ad\3\2\2\2)\u00b5\3\2\2\2+\u00be\3\2\2\2-\u00ca\3\2\2\2"+
		"/\u00cc\3\2\2\2\61\u00dd\3\2\2\2\63\u00e1\3\2\2\2\65\u00e4\3\2\2\2\67"+
		"\u00e9\3\2\2\29\u00f3\3\2\2\2;\u00f5\3\2\2\2=\u00f7\3\2\2\2?\u00f9\3\2"+
		"\2\2A\u00fb\3\2\2\2C\u00fd\3\2\2\2E\u00ff\3\2\2\2G\u0101\3\2\2\2I\u0103"+
		"\3\2\2\2KL\7<\2\2LM\7?\2\2M\4\3\2\2\2NO\t\2\2\2O\6\3\2\2\2PQ\t\3\2\2Q"+
		"\b\3\2\2\2R\\\t\4\2\2ST\7>\2\2T\\\7?\2\2UV\7@\2\2V\\\7?\2\2WX\7#\2\2X"+
		"\\\7?\2\2YZ\7?\2\2Z\\\7?\2\2[R\3\2\2\2[S\3\2\2\2[U\3\2\2\2[W\3\2\2\2["+
		"Y\3\2\2\2\\\n\3\2\2\2]^\7(\2\2^b\7(\2\2_`\7~\2\2`b\7~\2\2a]\3\2\2\2a_"+
		"\3\2\2\2b\f\3\2\2\2cd\7#\2\2d\16\3\2\2\2ef\7-\2\2fg\7-\2\2g\20\3\2\2\2"+
		"hi\7v\2\2ij\7g\2\2jk\7z\2\2kl\7v\2\2lm\7q\2\2m\22\3\2\2\2no\7p\2\2op\7"+
		"w\2\2pq\7o\2\2q\24\3\2\2\2rs\7r\2\2st\7t\2\2tu\7q\2\2uv\7i\2\2vw\7t\2"+
		"\2wx\7c\2\2xy\7o\2\2yz\7c\2\2z\26\3\2\2\2{|\7h\2\2|}\7k\2\2}~\7o\2\2~"+
		"\177\7r\2\2\177\u0080\7t\2\2\u0080\u0081\7q\2\2\u0081\u0082\7i\2\2\u0082"+
		"\30\3\2\2\2\u0083\u0084\7f\2\2\u0084\u0085\7g\2\2\u0085\u0086\7e\2\2\u0086"+
		"\u0087\7n\2\2\u0087\u0088\7c\2\2\u0088\u0089\7t\2\2\u0089\u008a\7g\2\2"+
		"\u008a\32\3\2\2\2\u008b\u008c\7u\2\2\u008c\u008d\7g\2\2\u008d\34\3\2\2"+
		"\2\u008e\u008f\7g\2\2\u008f\u0090\7p\2\2\u0090\u0091\7v\2\2\u0091\u0092"+
		"\7c\2\2\u0092\u0093\7q\2\2\u0093\36\3\2\2\2\u0094\u0095\7u\2\2\u0095\u0096"+
		"\7g\2\2\u0096\u0097\7p\2\2\u0097\u0098\7c\2\2\u0098\u0099\7q\2\2\u0099"+
		" \3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c\7p\2\2\u009c\u009d\7s\2\2\u009d"+
		"\u009e\7w\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7v\2\2"+
		"\u00a1\u00a2\7q\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7c"+
		"\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7c\2\2\u00a7$\3\2\2\2\u00a8\u00a9"+
		"\7n\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7c\2\2\u00ac"+
		"&\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7e\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7x\2\2\u00b3\u00b4\7c\2\2"+
		"\u00b4(\3\2\2\2\u00b5\u00bb\5;\36\2\u00b6\u00ba\5;\36\2\u00b7\u00ba\5"+
		"9\35\2\u00b8\u00ba\7a\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc*\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c2\5/\30\2\u00bf\u00c1"+
		"\5-\27\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\5/"+
		"\30\2\u00c6,\3\2\2\2\u00c7\u00cb\n\5\2\2\u00c8\u00c9\7^\2\2\u00c9\u00cb"+
		"\t\5\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb.\3\2\2\2\u00cc"+
		"\u00cd\7$\2\2\u00cd\60\3\2\2\2\u00ce\u00cf\7X\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"\u00d1\7t\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7f\2\2"+
		"\u00d4\u00d5\7g\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7t\2\2\u00d7\u00de"+
		"\7q\2\2\u00d8\u00d9\7H\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7n\2\2\u00db"+
		"\u00dc\7u\2\2\u00dc\u00de\7q\2\2\u00dd\u00ce\3\2\2\2\u00dd\u00d8\3\2\2"+
		"\2\u00de\62\3\2\2\2\u00df\u00e2\5\65\33\2\u00e0\u00e2\5\67\34\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\64\3\2\2\2\u00e3\u00e5\59\35"+
		"\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\66\3\2\2\2\u00e8\u00ea\59\35\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ef\5G$\2\u00ee\u00f0\59\35\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f28\3\2\2\2\u00f3"+
		"\u00f4\t\6\2\2\u00f4:\3\2\2\2\u00f5\u00f6\t\7\2\2\u00f6<\3\2\2\2\u00f7"+
		"\u00f8\7*\2\2\u00f8>\3\2\2\2\u00f9\u00fa\7+\2\2\u00fa@\3\2\2\2\u00fb\u00fc"+
		"\7}\2\2\u00fcB\3\2\2\2\u00fd\u00fe\7\177\2\2\u00feD\3\2\2\2\u00ff\u0100"+
		"\7\60\2\2\u0100F\3\2\2\2\u0101\u0102\7.\2\2\u0102H\3\2\2\2\u0103\u0104"+
		"\t\b\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b%\2\2\u0106J\3\2\2\2\16\2[a"+
		"\u00b9\u00bb\u00c2\u00ca\u00dd\u00e1\u00e6\u00eb\u00f1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}