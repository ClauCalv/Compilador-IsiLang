// Generated from C:/Users/Clau_/Desktop/Matéria Facul/compilador/final/src/main/grammars\isiLang.g4 by ANTLR 4.8
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
public class isiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, Op_rel=20, Texto=21, Num=22, Id=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "Op_rel", "Texto", "Num", "Id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog'", "'.'", "'declare'", "','", "'leia'", 
			"'('", "')'", "'escreva'", "'se'", "'entao'", "'{'", "'}'", "'senao'", 
			"':='", "'+'", "'\u2013'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Op_rel", "Texto", "Num", 
			"Id"
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


	public isiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "isiLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\5\25\u0087\n\25\3\26\6\26\u008a\n\26\r\26\16\26\u008b"+
		"\3\27\6\27\u008f\n\27\r\27\16\27\u0090\3\30\3\30\7\30\u0095\n\30\f\30"+
		"\16\30\u0098\13\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\6"+
		"\4\2>>@@\5\2\62;C\\c|\3\2\62;\4\2C\\c|\2\u009f\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5:\3\2\2"+
		"\2\7B\3\2\2\2\tD\3\2\2\2\13L\3\2\2\2\rN\3\2\2\2\17S\3\2\2\2\21U\3\2\2"+
		"\2\23W\3\2\2\2\25_\3\2\2\2\27b\3\2\2\2\31h\3\2\2\2\33j\3\2\2\2\35l\3\2"+
		"\2\2\37r\3\2\2\2!u\3\2\2\2#w\3\2\2\2%y\3\2\2\2\'{\3\2\2\2)\u0086\3\2\2"+
		"\2+\u0089\3\2\2\2-\u008e\3\2\2\2/\u0092\3\2\2\2\61\62\7r\2\2\62\63\7t"+
		"\2\2\63\64\7q\2\2\64\65\7i\2\2\65\66\7t\2\2\66\67\7c\2\2\678\7o\2\289"+
		"\7c\2\29\4\3\2\2\2:;\7h\2\2;<\7k\2\2<=\7o\2\2=>\7r\2\2>?\7t\2\2?@\7q\2"+
		"\2@A\7i\2\2A\6\3\2\2\2BC\7\60\2\2C\b\3\2\2\2DE\7f\2\2EF\7g\2\2FG\7e\2"+
		"\2GH\7n\2\2HI\7c\2\2IJ\7t\2\2JK\7g\2\2K\n\3\2\2\2LM\7.\2\2M\f\3\2\2\2"+
		"NO\7n\2\2OP\7g\2\2PQ\7k\2\2QR\7c\2\2R\16\3\2\2\2ST\7*\2\2T\20\3\2\2\2"+
		"UV\7+\2\2V\22\3\2\2\2WX\7g\2\2XY\7u\2\2YZ\7e\2\2Z[\7t\2\2[\\\7g\2\2\\"+
		"]\7x\2\2]^\7c\2\2^\24\3\2\2\2_`\7u\2\2`a\7g\2\2a\26\3\2\2\2bc\7g\2\2c"+
		"d\7p\2\2de\7v\2\2ef\7c\2\2fg\7q\2\2g\30\3\2\2\2hi\7}\2\2i\32\3\2\2\2j"+
		"k\7\177\2\2k\34\3\2\2\2lm\7u\2\2mn\7g\2\2no\7p\2\2op\7c\2\2pq\7q\2\2q"+
		"\36\3\2\2\2rs\7<\2\2st\7?\2\2t \3\2\2\2uv\7-\2\2v\"\3\2\2\2wx\7\u2015"+
		"\2\2x$\3\2\2\2yz\7,\2\2z&\3\2\2\2{|\7\61\2\2|(\3\2\2\2}\u0087\t\2\2\2"+
		"~\177\7>\2\2\177\u0087\7?\2\2\u0080\u0081\7@\2\2\u0081\u0087\7?\2\2\u0082"+
		"\u0083\7#\2\2\u0083\u0087\7?\2\2\u0084\u0085\7?\2\2\u0085\u0087\7?\2\2"+
		"\u0086}\3\2\2\2\u0086~\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0082\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0087*\3\2\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		",\3\2\2\2\u008d\u008f\t\4\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2"+
		"\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091.\3\2\2\2\u0092\u0096\t"+
		"\5\2\2\u0093\u0095\t\3\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\60\3\2\2\2\u0098\u0096\3\2\2"+
		"\2\7\2\u0086\u008b\u0090\u0096\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}