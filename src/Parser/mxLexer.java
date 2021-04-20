// Generated from /Users/xzy/IdeaProjects/mx-compiler/src/Parser/mx.g4 by ANTLR 4.9
package Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, Int=31, Bool=32, 
		String=33, Null=34, Void=35, True=36, False=37, If=38, Else=39, For=40, 
		While=41, Break=42, Continue=43, Return=44, New=45, Class=46, This=47, 
		IntConstant=48, StringConstant=49, Identifier=50, LeftBracket=51, RightBracket=52, 
		Whitespace=53, Newline=54, BlockComment=55, LineComment=56;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "Int", "Bool", "String", 
			"Null", "Void", "True", "False", "If", "Else", "For", "While", "Break", 
			"Continue", "Return", "New", "Class", "This", "Digit", "NonZeroDigit", 
			"Characters", "IdentifierCharacters", "IntConstant", "StringConstant", 
			"Identifier", "LeftBracket", "RightBracket", "Whitespace", "Newline", 
			"BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'{'", "'}'", "'='", "'++'", "'--'", 
			"'.'", "'+'", "'-'", "'!'", "'~'", "'*'", "'/'", "'%'", "'<<'", "'>>'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", 
			"'||'", "'int'", "'bool'", "'string'", "'null'", "'void'", "'true'", 
			"'false'", "'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", 
			"'return'", "'new'", "'class'", "'this'", null, null, null, "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "Int", "Bool", "String", "Null", 
			"Void", "True", "False", "If", "Else", "For", "While", "Break", "Continue", 
			"Return", "New", "Class", "This", "IntConstant", "StringConstant", "Identifier", 
			"LeftBracket", "RightBracket", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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


	public mxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mx.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0172\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!"+
		"\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0129\n\63\3\64"+
		"\5\64\u012c\n\64\3\65\3\65\3\65\7\65\u0131\n\65\f\65\16\65\u0134\13\65"+
		"\5\65\u0136\n\65\3\66\3\66\7\66\u013a\n\66\f\66\16\66\u013d\13\66\3\66"+
		"\3\66\3\67\6\67\u0142\n\67\r\67\16\67\u0143\38\38\39\39\3:\6:\u014b\n"+
		":\r:\16:\u014c\3:\3:\3;\3;\5;\u0153\n;\3;\5;\u0156\n;\3;\3;\3<\3<\3<\3"+
		"<\7<\u015e\n<\f<\16<\u0161\13<\3<\3<\3<\3<\3<\3=\3=\3=\3=\7=\u016c\n="+
		"\f=\16=\u016f\13=\3=\3=\3\u015f\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\2c\2e\2g\2i\62k\63m\64o\65q\66s\67u8w9y:\3\2\b\3\2\62;\3\2"+
		"\63;\6\2\f\f\17\17$$^^\6\2\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2\u0179"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2i\3"+
		"\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2"+
		"\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7\177\3\2\2\2\t\u0081\3"+
		"\2\2\2\13\u0083\3\2\2\2\r\u0085\3\2\2\2\17\u0087\3\2\2\2\21\u0089\3\2"+
		"\2\2\23\u008c\3\2\2\2\25\u008f\3\2\2\2\27\u0091\3\2\2\2\31\u0093\3\2\2"+
		"\2\33\u0095\3\2\2\2\35\u0097\3\2\2\2\37\u0099\3\2\2\2!\u009b\3\2\2\2#"+
		"\u009d\3\2\2\2%\u009f\3\2\2\2\'\u00a2\3\2\2\2)\u00a5\3\2\2\2+\u00a7\3"+
		"\2\2\2-\u00a9\3\2\2\2/\u00ac\3\2\2\2\61\u00af\3\2\2\2\63\u00b2\3\2\2\2"+
		"\65\u00b5\3\2\2\2\67\u00b7\3\2\2\29\u00b9\3\2\2\2;\u00bb\3\2\2\2=\u00be"+
		"\3\2\2\2?\u00c1\3\2\2\2A\u00c5\3\2\2\2C\u00ca\3\2\2\2E\u00d1\3\2\2\2G"+
		"\u00d6\3\2\2\2I\u00db\3\2\2\2K\u00e0\3\2\2\2M\u00e6\3\2\2\2O\u00e9\3\2"+
		"\2\2Q\u00ee\3\2\2\2S\u00f2\3\2\2\2U\u00f8\3\2\2\2W\u00fe\3\2\2\2Y\u0107"+
		"\3\2\2\2[\u010e\3\2\2\2]\u0112\3\2\2\2_\u0118\3\2\2\2a\u011d\3\2\2\2c"+
		"\u011f\3\2\2\2e\u0128\3\2\2\2g\u012b\3\2\2\2i\u0135\3\2\2\2k\u0137\3\2"+
		"\2\2m\u0141\3\2\2\2o\u0145\3\2\2\2q\u0147\3\2\2\2s\u014a\3\2\2\2u\u0155"+
		"\3\2\2\2w\u0159\3\2\2\2y\u0167\3\2\2\2{|\7=\2\2|\4\3\2\2\2}~\7*\2\2~\6"+
		"\3\2\2\2\177\u0080\7+\2\2\u0080\b\3\2\2\2\u0081\u0082\7.\2\2\u0082\n\3"+
		"\2\2\2\u0083\u0084\7}\2\2\u0084\f\3\2\2\2\u0085\u0086\7\177\2\2\u0086"+
		"\16\3\2\2\2\u0087\u0088\7?\2\2\u0088\20\3\2\2\2\u0089\u008a\7-\2\2\u008a"+
		"\u008b\7-\2\2\u008b\22\3\2\2\2\u008c\u008d\7/\2\2\u008d\u008e\7/\2\2\u008e"+
		"\24\3\2\2\2\u008f\u0090\7\60\2\2\u0090\26\3\2\2\2\u0091\u0092\7-\2\2\u0092"+
		"\30\3\2\2\2\u0093\u0094\7/\2\2\u0094\32\3\2\2\2\u0095\u0096\7#\2\2\u0096"+
		"\34\3\2\2\2\u0097\u0098\7\u0080\2\2\u0098\36\3\2\2\2\u0099\u009a\7,\2"+
		"\2\u009a \3\2\2\2\u009b\u009c\7\61\2\2\u009c\"\3\2\2\2\u009d\u009e\7\'"+
		"\2\2\u009e$\3\2\2\2\u009f\u00a0\7>\2\2\u00a0\u00a1\7>\2\2\u00a1&\3\2\2"+
		"\2\u00a2\u00a3\7@\2\2\u00a3\u00a4\7@\2\2\u00a4(\3\2\2\2\u00a5\u00a6\7"+
		">\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7@\2\2\u00a8,\3\2\2\2\u00a9\u00aa\7>"+
		"\2\2\u00aa\u00ab\7?\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7@\2\2\u00ad\u00ae"+
		"\7?\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7?\2\2\u00b0\u00b1\7?\2\2\u00b1\62"+
		"\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4\7?\2\2\u00b4\64\3\2\2\2\u00b5"+
		"\u00b6\7(\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\7`\2\2\u00b88\3\2\2\2\u00b9"+
		"\u00ba\7~\2\2\u00ba:\3\2\2\2\u00bb\u00bc\7(\2\2\u00bc\u00bd\7(\2\2\u00bd"+
		"<\3\2\2\2\u00be\u00bf\7~\2\2\u00bf\u00c0\7~\2\2\u00c0>\3\2\2\2\u00c1\u00c2"+
		"\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7v\2\2\u00c4@\3\2\2\2\u00c5\u00c6"+
		"\7d\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7n\2\2\u00c9"+
		"B\3\2\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7t\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7i\2\2\u00d0D\3\2\2\2\u00d1"+
		"\u00d2\7p\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7n\2\2"+
		"\u00d5F\3\2\2\2\u00d6\u00d7\7x\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7k\2"+
		"\2\u00d9\u00da\7f\2\2\u00daH\3\2\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7"+
		"t\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7g\2\2\u00dfJ\3\2\2\2\u00e0\u00e1"+
		"\7h\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7u\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5L\3\2\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7h\2\2\u00e8"+
		"N\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7u\2\2\u00ec"+
		"\u00ed\7g\2\2\u00edP\3\2\2\2\u00ee\u00ef\7h\2\2\u00ef\u00f0\7q\2\2\u00f0"+
		"\u00f1\7t\2\2\u00f1R\3\2\2\2\u00f2\u00f3\7y\2\2\u00f3\u00f4\7j\2\2\u00f4"+
		"\u00f5\7k\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7g\2\2\u00f7T\3\2\2\2\u00f8"+
		"\u00f9\7d\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7c\2\2"+
		"\u00fc\u00fd\7m\2\2\u00fdV\3\2\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100\7q\2"+
		"\2\u0100\u0101\7p\2\2\u0101\u0102\7v\2\2\u0102\u0103\7k\2\2\u0103\u0104"+
		"\7p\2\2\u0104\u0105\7w\2\2\u0105\u0106\7g\2\2\u0106X\3\2\2\2\u0107\u0108"+
		"\7t\2\2\u0108\u0109\7g\2\2\u0109\u010a\7v\2\2\u010a\u010b\7w\2\2\u010b"+
		"\u010c\7t\2\2\u010c\u010d\7p\2\2\u010dZ\3\2\2\2\u010e\u010f\7p\2\2\u010f"+
		"\u0110\7g\2\2\u0110\u0111\7y\2\2\u0111\\\3\2\2\2\u0112\u0113\7e\2\2\u0113"+
		"\u0114\7n\2\2\u0114\u0115\7c\2\2\u0115\u0116\7u\2\2\u0116\u0117\7u\2\2"+
		"\u0117^\3\2\2\2\u0118\u0119\7v\2\2\u0119\u011a\7j\2\2\u011a\u011b\7k\2"+
		"\2\u011b\u011c\7u\2\2\u011c`\3\2\2\2\u011d\u011e\t\2\2\2\u011eb\3\2\2"+
		"\2\u011f\u0120\t\3\2\2\u0120d\3\2\2\2\u0121\u0129\n\4\2\2\u0122\u0123"+
		"\7^\2\2\u0123\u0129\7p\2\2\u0124\u0125\7^\2\2\u0125\u0129\7^\2\2\u0126"+
		"\u0127\7^\2\2\u0127\u0129\7$\2\2\u0128\u0121\3\2\2\2\u0128\u0122\3\2\2"+
		"\2\u0128\u0124\3\2\2\2\u0128\u0126\3\2\2\2\u0129f\3\2\2\2\u012a\u012c"+
		"\t\5\2\2\u012b\u012a\3\2\2\2\u012ch\3\2\2\2\u012d\u0136\7\62\2\2\u012e"+
		"\u0132\5c\62\2\u012f\u0131\5a\61\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u012d\3\2\2\2\u0135\u012e\3\2\2\2\u0136j\3\2\2\2"+
		"\u0137\u013b\7$\2\2\u0138\u013a\5e\63\2\u0139\u0138\3\2\2\2\u013a\u013d"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e\u013f\7$\2\2\u013fl\3\2\2\2\u0140\u0142\5g\64\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144n\3\2\2\2\u0145\u0146\7]\2\2\u0146p\3\2\2\2\u0147\u0148\7_\2"+
		"\2\u0148r\3\2\2\2\u0149\u014b\t\6\2\2\u014a\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\b:\2\2\u014ft\3\2\2\2\u0150\u0152\7\17\2\2\u0151\u0153\7\f\2\2"+
		"\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0156"+
		"\7\f\2\2\u0155\u0150\3\2\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\b;\2\2\u0158v\3\2\2\2\u0159\u015a\7\61\2\2\u015a\u015b\7,\2\2\u015b"+
		"\u015f\3\2\2\2\u015c\u015e\13\2\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3"+
		"\2\2\2\u015f\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0162\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0163\7,\2\2\u0163\u0164\7\61\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0166\b<\2\2\u0166x\3\2\2\2\u0167\u0168\7\61\2\2\u0168\u0169"+
		"\7\61\2\2\u0169\u016d\3\2\2\2\u016a\u016c\n\7\2\2\u016b\u016a\3\2\2\2"+
		"\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\b=\2\2\u0171z\3\2\2\2\16\2\u0128"+
		"\u012b\u0132\u0135\u013b\u0143\u014c\u0152\u0155\u015f\u016d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}