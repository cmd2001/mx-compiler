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
			"Characters", "IdentifierFirstCharacters", "IdentifierCharacters", "IntConstant", 
			"StringConstant", "Identifier", "LeftBracket", "RightBracket", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0179\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u012b\n\63"+
		"\3\64\5\64\u012e\n\64\3\65\5\65\u0131\n\65\3\66\3\66\3\66\7\66\u0136\n"+
		"\66\f\66\16\66\u0139\13\66\5\66\u013b\n\66\3\67\3\67\7\67\u013f\n\67\f"+
		"\67\16\67\u0142\13\67\3\67\3\67\38\38\78\u0148\n8\f8\168\u014b\138\39"+
		"\39\3:\3:\3;\6;\u0152\n;\r;\16;\u0153\3;\3;\3<\3<\5<\u015a\n<\3<\5<\u015d"+
		"\n<\3<\3<\3=\3=\3=\3=\7=\u0165\n=\f=\16=\u0168\13=\3=\3=\3=\3=\3=\3>\3"+
		">\3>\3>\7>\u0173\n>\f>\16>\u0176\13>\3>\3>\3\u0166\2?\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2e\2g\2i\2k\62m\63o\64q\65s\66u\67w8y9"+
		"{:\3\2\t\3\2\62;\3\2\63;\6\2\f\f\17\17$$^^\4\2C\\c|\6\2\62;C\\aac|\4\2"+
		"\13\13\"\"\4\2\f\f\17\17\2\u017f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\177"+
		"\3\2\2\2\7\u0081\3\2\2\2\t\u0083\3\2\2\2\13\u0085\3\2\2\2\r\u0087\3\2"+
		"\2\2\17\u0089\3\2\2\2\21\u008b\3\2\2\2\23\u008e\3\2\2\2\25\u0091\3\2\2"+
		"\2\27\u0093\3\2\2\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2\35\u0099\3\2\2\2"+
		"\37\u009b\3\2\2\2!\u009d\3\2\2\2#\u009f\3\2\2\2%\u00a1\3\2\2\2\'\u00a4"+
		"\3\2\2\2)\u00a7\3\2\2\2+\u00a9\3\2\2\2-\u00ab\3\2\2\2/\u00ae\3\2\2\2\61"+
		"\u00b1\3\2\2\2\63\u00b4\3\2\2\2\65\u00b7\3\2\2\2\67\u00b9\3\2\2\29\u00bb"+
		"\3\2\2\2;\u00bd\3\2\2\2=\u00c0\3\2\2\2?\u00c3\3\2\2\2A\u00c7\3\2\2\2C"+
		"\u00cc\3\2\2\2E\u00d3\3\2\2\2G\u00d8\3\2\2\2I\u00dd\3\2\2\2K\u00e2\3\2"+
		"\2\2M\u00e8\3\2\2\2O\u00eb\3\2\2\2Q\u00f0\3\2\2\2S\u00f4\3\2\2\2U\u00fa"+
		"\3\2\2\2W\u0100\3\2\2\2Y\u0109\3\2\2\2[\u0110\3\2\2\2]\u0114\3\2\2\2_"+
		"\u011a\3\2\2\2a\u011f\3\2\2\2c\u0121\3\2\2\2e\u012a\3\2\2\2g\u012d\3\2"+
		"\2\2i\u0130\3\2\2\2k\u013a\3\2\2\2m\u013c\3\2\2\2o\u0145\3\2\2\2q\u014c"+
		"\3\2\2\2s\u014e\3\2\2\2u\u0151\3\2\2\2w\u015c\3\2\2\2y\u0160\3\2\2\2{"+
		"\u016e\3\2\2\2}~\7=\2\2~\4\3\2\2\2\177\u0080\7*\2\2\u0080\6\3\2\2\2\u0081"+
		"\u0082\7+\2\2\u0082\b\3\2\2\2\u0083\u0084\7.\2\2\u0084\n\3\2\2\2\u0085"+
		"\u0086\7}\2\2\u0086\f\3\2\2\2\u0087\u0088\7\177\2\2\u0088\16\3\2\2\2\u0089"+
		"\u008a\7?\2\2\u008a\20\3\2\2\2\u008b\u008c\7-\2\2\u008c\u008d\7-\2\2\u008d"+
		"\22\3\2\2\2\u008e\u008f\7/\2\2\u008f\u0090\7/\2\2\u0090\24\3\2\2\2\u0091"+
		"\u0092\7\60\2\2\u0092\26\3\2\2\2\u0093\u0094\7-\2\2\u0094\30\3\2\2\2\u0095"+
		"\u0096\7/\2\2\u0096\32\3\2\2\2\u0097\u0098\7#\2\2\u0098\34\3\2\2\2\u0099"+
		"\u009a\7\u0080\2\2\u009a\36\3\2\2\2\u009b\u009c\7,\2\2\u009c \3\2\2\2"+
		"\u009d\u009e\7\61\2\2\u009e\"\3\2\2\2\u009f\u00a0\7\'\2\2\u00a0$\3\2\2"+
		"\2\u00a1\u00a2\7>\2\2\u00a2\u00a3\7>\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7"+
		"@\2\2\u00a5\u00a6\7@\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7>\2\2\u00a8*\3\2"+
		"\2\2\u00a9\u00aa\7@\2\2\u00aa,\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad"+
		"\7?\2\2\u00ad.\3\2\2\2\u00ae\u00af\7@\2\2\u00af\u00b0\7?\2\2\u00b0\60"+
		"\3\2\2\2\u00b1\u00b2\7?\2\2\u00b2\u00b3\7?\2\2\u00b3\62\3\2\2\2\u00b4"+
		"\u00b5\7#\2\2\u00b5\u00b6\7?\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7(\2\2\u00b8"+
		"\66\3\2\2\2\u00b9\u00ba\7`\2\2\u00ba8\3\2\2\2\u00bb\u00bc\7~\2\2\u00bc"+
		":\3\2\2\2\u00bd\u00be\7(\2\2\u00be\u00bf\7(\2\2\u00bf<\3\2\2\2\u00c0\u00c1"+
		"\7~\2\2\u00c1\u00c2\7~\2\2\u00c2>\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5"+
		"\7p\2\2\u00c5\u00c6\7v\2\2\u00c6@\3\2\2\2\u00c7\u00c8\7d\2\2\u00c8\u00c9"+
		"\7q\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7n\2\2\u00cbB\3\2\2\2\u00cc\u00cd"+
		"\7u\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7k\2\2\u00d0"+
		"\u00d1\7p\2\2\u00d1\u00d2\7i\2\2\u00d2D\3\2\2\2\u00d3\u00d4\7p\2\2\u00d4"+
		"\u00d5\7w\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7n\2\2\u00d7F\3\2\2\2\u00d8"+
		"\u00d9\7x\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7f\2\2"+
		"\u00dcH\3\2\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7w\2"+
		"\2\u00e0\u00e1\7g\2\2\u00e1J\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7"+
		"c\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7g\2\2\u00e7L"+
		"\3\2\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7h\2\2\u00eaN\3\2\2\2\u00eb\u00ec"+
		"\7g\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7g\2\2\u00ef"+
		"P\3\2\2\2\u00f0\u00f1\7h\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7t\2\2\u00f3"+
		"R\3\2\2\2\u00f4\u00f5\7y\2\2\u00f5\u00f6\7j\2\2\u00f6\u00f7\7k\2\2\u00f7"+
		"\u00f8\7n\2\2\u00f8\u00f9\7g\2\2\u00f9T\3\2\2\2\u00fa\u00fb\7d\2\2\u00fb"+
		"\u00fc\7t\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7m\2\2"+
		"\u00ffV\3\2\2\2\u0100\u0101\7e\2\2\u0101\u0102\7q\2\2\u0102\u0103\7p\2"+
		"\2\u0103\u0104\7v\2\2\u0104\u0105\7k\2\2\u0105\u0106\7p\2\2\u0106\u0107"+
		"\7w\2\2\u0107\u0108\7g\2\2\u0108X\3\2\2\2\u0109\u010a\7t\2\2\u010a\u010b"+
		"\7g\2\2\u010b\u010c\7v\2\2\u010c\u010d\7w\2\2\u010d\u010e\7t\2\2\u010e"+
		"\u010f\7p\2\2\u010fZ\3\2\2\2\u0110\u0111\7p\2\2\u0111\u0112\7g\2\2\u0112"+
		"\u0113\7y\2\2\u0113\\\3\2\2\2\u0114\u0115\7e\2\2\u0115\u0116\7n\2\2\u0116"+
		"\u0117\7c\2\2\u0117\u0118\7u\2\2\u0118\u0119\7u\2\2\u0119^\3\2\2\2\u011a"+
		"\u011b\7v\2\2\u011b\u011c\7j\2\2\u011c\u011d\7k\2\2\u011d\u011e\7u\2\2"+
		"\u011e`\3\2\2\2\u011f\u0120\t\2\2\2\u0120b\3\2\2\2\u0121\u0122\t\3\2\2"+
		"\u0122d\3\2\2\2\u0123\u012b\n\4\2\2\u0124\u0125\7^\2\2\u0125\u012b\7p"+
		"\2\2\u0126\u0127\7^\2\2\u0127\u012b\7^\2\2\u0128\u0129\7^\2\2\u0129\u012b"+
		"\7$\2\2\u012a\u0123\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0126\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012bf\3\2\2\2\u012c\u012e\t\5\2\2\u012d\u012c\3\2\2\2"+
		"\u012eh\3\2\2\2\u012f\u0131\t\6\2\2\u0130\u012f\3\2\2\2\u0131j\3\2\2\2"+
		"\u0132\u013b\7\62\2\2\u0133\u0137\5c\62\2\u0134\u0136\5a\61\2\u0135\u0134"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u0132\3\2\2\2\u013a\u0133\3\2"+
		"\2\2\u013bl\3\2\2\2\u013c\u0140\7$\2\2\u013d\u013f\5e\63\2\u013e\u013d"+
		"\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7$\2\2\u0144n\3\2\2\2\u0145"+
		"\u0149\5g\64\2\u0146\u0148\5i\65\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014ap\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014d\7]\2\2\u014dr\3\2\2\2\u014e\u014f\7_\2\2\u014ft\3"+
		"\2\2\2\u0150\u0152\t\7\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\b;"+
		"\2\2\u0156v\3\2\2\2\u0157\u0159\7\17\2\2\u0158\u015a\7\f\2\2\u0159\u0158"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u015d\7\f\2\2\u015c"+
		"\u0157\3\2\2\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\b<"+
		"\2\2\u015fx\3\2\2\2\u0160\u0161\7\61\2\2\u0161\u0162\7,\2\2\u0162\u0166"+
		"\3\2\2\2\u0163\u0165\13\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0169\u016a\7,\2\2\u016a\u016b\7\61\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\b=\2\2\u016dz\3\2\2\2\u016e\u016f\7\61\2\2\u016f\u0170\7\61\2\2"+
		"\u0170\u0174\3\2\2\2\u0171\u0173\n\b\2\2\u0172\u0171\3\2\2\2\u0173\u0176"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0177\u0178\b>\2\2\u0178|\3\2\2\2\17\2\u012a\u012d\u0130"+
		"\u0137\u013a\u0140\u0149\u0153\u0159\u015c\u0166\u0174\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}