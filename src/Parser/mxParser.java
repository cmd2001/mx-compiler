// Generated from /Users/xzy/IdeaProjects/mx-compiler/src/Parser/mx.g4 by ANTLR 4.9
package Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mxParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_compoundStatement = 1, RULE_funcDefStatement = 2, 
		RULE_arg = 3, RULE_argList = 4, RULE_classDefStatement = 5, RULE_varDefStatement = 6, 
		RULE_varDef = 7, RULE_constructFuncDefStatement = 8, RULE_block = 9, RULE_simpleStatement = 10, 
		RULE_statement = 11, RULE_expression = 12, RULE_creator = 13, RULE_expressionList = 14, 
		RULE_constant = 15, RULE_logicConstant = 16, RULE_basicType = 17, RULE_type = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "compoundStatement", "funcDefStatement", "arg", "argList", 
			"classDefStatement", "varDefStatement", "varDef", "constructFuncDefStatement", 
			"block", "simpleStatement", "statement", "expression", "creator", "expressionList", 
			"constant", "logicConstant", "basicType", "type"
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

	@Override
	public String getGrammarFileName() { return "mx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Int) | (1L << Bool) | (1L << String) | (1L << Void) | (1L << Class) | (1L << Identifier))) != 0)) {
				{
				{
				setState(38);
				compoundStatement();
				}
				}
				setState(43);
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public FuncDefStatementContext funcDefStatement() {
			return getRuleContext(FuncDefStatementContext.class,0);
		}
		public ClassDefStatementContext classDefStatement() {
			return getRuleContext(ClassDefStatementContext.class,0);
		}
		public VarDefStatementContext varDefStatement() {
			return getRuleContext(VarDefStatementContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compoundStatement);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				funcDefStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				classDefStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				varDefStatement();
				setState(47);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				match(T__0);
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

	public static class FuncDefStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mxParser.Identifier, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Void() { return getToken(mxParser.Void, 0); }
		public FuncDefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitFuncDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefStatementContext funcDefStatement() throws RecognitionException {
		FuncDefStatementContext _localctx = new FuncDefStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDefStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
			case String:
			case Identifier:
				{
				setState(52);
				type();
				}
				break;
			case Void:
				{
				setState(53);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(56);
			match(Identifier);
			setState(57);
			match(T__1);
			setState(58);
			argList();
			setState(59);
			match(T__2);
			setState(60);
			block();
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

	public static class ArgContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(mxParser.Identifier, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			type();
			setState(63);
			match(Identifier);
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

	public static class ArgListContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << String) | (1L << Identifier))) != 0)) {
				{
				setState(65);
				arg();
				}
			}

			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(68);
				match(T__3);
				setState(69);
				arg();
				}
				}
				setState(74);
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

	public static class ClassDefStatementContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(mxParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(mxParser.Identifier, 0); }
		public List<FuncDefStatementContext> funcDefStatement() {
			return getRuleContexts(FuncDefStatementContext.class);
		}
		public FuncDefStatementContext funcDefStatement(int i) {
			return getRuleContext(FuncDefStatementContext.class,i);
		}
		public List<ConstructFuncDefStatementContext> constructFuncDefStatement() {
			return getRuleContexts(ConstructFuncDefStatementContext.class);
		}
		public ConstructFuncDefStatementContext constructFuncDefStatement(int i) {
			return getRuleContext(ConstructFuncDefStatementContext.class,i);
		}
		public List<VarDefStatementContext> varDefStatement() {
			return getRuleContexts(VarDefStatementContext.class);
		}
		public VarDefStatementContext varDefStatement(int i) {
			return getRuleContext(VarDefStatementContext.class,i);
		}
		public ClassDefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitClassDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefStatementContext classDefStatement() throws RecognitionException {
		ClassDefStatementContext _localctx = new ClassDefStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDefStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(Class);
			setState(76);
			match(Identifier);
			setState(77);
			match(T__4);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Int) | (1L << Bool) | (1L << String) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(78);
					funcDefStatement();
					}
					break;
				case 2:
					{
					setState(79);
					constructFuncDefStatement();
					}
					break;
				case 3:
					{
					{
					setState(80);
					varDefStatement();
					setState(81);
					match(T__0);
					}
					}
					break;
				case 4:
					{
					setState(83);
					match(T__0);
					}
					break;
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(T__5);
			setState(90);
			match(T__0);
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

	public static class VarDefStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public VarDefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitVarDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefStatementContext varDefStatement() throws RecognitionException {
		VarDefStatementContext _localctx = new VarDefStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDefStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			type();
			setState(93);
			varDef();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(94);
				match(T__3);
				setState(95);
				varDef();
				}
				}
				setState(100);
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

	public static class VarDefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mxParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(Identifier);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(102);
				match(T__6);
				setState(103);
				expression(0);
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

	public static class ConstructFuncDefStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mxParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructFuncDefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructFuncDefStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitConstructFuncDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructFuncDefStatementContext constructFuncDefStatement() throws RecognitionException {
		ConstructFuncDefStatementContext _localctx = new ConstructFuncDefStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constructFuncDefStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(Identifier);
			setState(107);
			match(T__1);
			setState(108);
			match(T__2);
			setState(109);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__4);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << Int) | (1L << Bool) | (1L << String) | (1L << Null) | (1L << True) | (1L << False) | (1L << If) | (1L << For) | (1L << While) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << New) | (1L << This) | (1L << IntConstant) | (1L << StringConstant) | (1L << Identifier))) != 0)) {
				{
				{
				setState(112);
				statement();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__5);
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
	 
		public SimpleStatementContext() { }
		public void copyFrom(SimpleStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakStatementContext extends SimpleStatementContext {
		public TerminalNode Break() { return getToken(mxParser.Break, 0); }
		public BreakStatementContext(SimpleStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatementContext extends SimpleStatementContext {
		public TerminalNode Continue() { return getToken(mxParser.Continue, 0); }
		public ContinueStatementContext(SimpleStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionStatementContext extends SimpleStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(SimpleStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends SimpleStatementContext {
		public TerminalNode Return() { return getToken(mxParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(SimpleStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarStatementContext extends SimpleStatementContext {
		public VarDefStatementContext varDefStatement() {
			return getRuleContext(VarDefStatementContext.class,0);
		}
		public VarStatementContext(SimpleStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitVarStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpleStatement);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(Return);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << IntConstant) | (1L << StringConstant) | (1L << Identifier))) != 0)) {
					{
					setState(121);
					expression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(Break);
				}
				break;
			case 3:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(Continue);
				}
				break;
			case 4:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				expression(0);
				}
				break;
			case 5:
				_localctx = new VarStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				varDefStatement();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public TerminalNode While() { return getToken(mxParser.While, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStatementContext extends StatementContext {
		public EmptyStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatementContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StatementContext {
		public SimpleStatementContext stmt1;
		public ExpressionContext condition;
		public SimpleStatementContext stmt2;
		public TerminalNode For() { return getToken(mxParser.For, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<SimpleStatementContext> simpleStatement() {
			return getRuleContexts(SimpleStatementContext.class);
		}
		public SimpleStatementContext simpleStatement(int i) {
			return getRuleContext(SimpleStatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainSimpleStatementContext extends StatementContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public ContainSimpleStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitContainSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public TerminalNode If() { return getToken(mxParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(mxParser.Else, 0); }
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(If);
				setState(131);
				match(T__1);
				setState(132);
				expression(0);
				setState(133);
				match(T__2);
				setState(134);
				statement();
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(135);
					match(Else);
					setState(136);
					statement();
					}
					break;
				}
				}
				break;
			case While:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(While);
				setState(140);
				match(T__1);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << IntConstant) | (1L << StringConstant) | (1L << Identifier))) != 0)) {
					{
					setState(141);
					expression(0);
					}
				}

				setState(144);
				match(T__2);
				setState(145);
				statement();
				}
				break;
			case For:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(For);
				setState(147);
				match(T__1);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << Int) | (1L << Bool) | (1L << String) | (1L << Null) | (1L << True) | (1L << False) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << New) | (1L << This) | (1L << IntConstant) | (1L << StringConstant) | (1L << Identifier))) != 0)) {
					{
					setState(148);
					((ForStatementContext)_localctx).stmt1 = simpleStatement();
					}
				}

				setState(151);
				match(T__0);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << IntConstant) | (1L << StringConstant) | (1L << Identifier))) != 0)) {
					{
					setState(152);
					((ForStatementContext)_localctx).condition = expression(0);
					}
				}

				setState(155);
				match(T__0);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << Int) | (1L << Bool) | (1L << String) | (1L << Null) | (1L << True) | (1L << False) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << New) | (1L << This) | (1L << IntConstant) | (1L << StringConstant) | (1L << Identifier))) != 0)) {
					{
					setState(156);
					((ForStatementContext)_localctx).stmt2 = simpleStatement();
					}
				}

				setState(159);
				match(T__2);
				setState(160);
				statement();
				}
				break;
			case T__1:
			case T__7:
			case T__8:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case Int:
			case Bool:
			case String:
			case Null:
			case True:
			case False:
			case Break:
			case Continue:
			case Return:
			case New:
			case This:
			case IntConstant:
			case StringConstant:
			case Identifier:
				_localctx = new ContainSimpleStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				simpleStatement();
				setState(162);
				match(T__0);
				}
				break;
			case T__4:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				block();
				}
				break;
			case T__0:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				match(T__0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryExpressionContext extends ExpressionContext {
		public ExpressionContext src1;
		public Token op;
		public ExpressionContext src2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrefixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(mxParser.Identifier, 0); }
		public IdExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptExpressionContext extends ExpressionContext {
		public ExpressionContext array;
		public ExpressionContext index;
		public TerminalNode LeftBracket() { return getToken(mxParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(mxParser.RightBracket, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubscriptExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitSubscriptExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpressionContext extends ExpressionContext {
		public TerminalNode This() { return getToken(mxParser.This, 0); }
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstExpressionContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitConstExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExpressionContext extends ExpressionContext {
		public TerminalNode New() { return getToken(mxParser.New, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(mxParser.Identifier, 0); }
		public MemberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostfixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FuncCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitFuncCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case New:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(169);
				match(New);
				setState(170);
				creator();
				}
				break;
			case T__7:
			case T__8:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				((PrefixExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((PrefixExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				expression(18);
				}
				break;
			case T__10:
			case T__11:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				((PrefixExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
					((PrefixExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				expression(17);
				}
				break;
			case T__12:
			case T__13:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				((PrefixExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
					((PrefixExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				expression(16);
				}
				break;
			case T__1:
				{
				_localctx = new SubExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(T__1);
				setState(178);
				expression(0);
				setState(179);
				match(T__2);
				}
				break;
			case This:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(This);
				}
				break;
			case Null:
			case True:
			case False:
			case IntConstant:
			case StringConstant:
				{
				_localctx = new ConstExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				constant();
				}
				break;
			case Identifier:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(187);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(188);
						((BinaryExpressionContext)_localctx).src2 = expression(16);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(190);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(191);
						((BinaryExpressionContext)_localctx).src2 = expression(15);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(193);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						((BinaryExpressionContext)_localctx).src2 = expression(14);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(196);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						((BinaryExpressionContext)_localctx).src2 = expression(13);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(199);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(200);
						((BinaryExpressionContext)_localctx).src2 = expression(12);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(202);
						((BinaryExpressionContext)_localctx).op = match(T__25);
						setState(203);
						((BinaryExpressionContext)_localctx).src2 = expression(11);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(205);
						((BinaryExpressionContext)_localctx).op = match(T__26);
						setState(206);
						((BinaryExpressionContext)_localctx).src2 = expression(10);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(208);
						((BinaryExpressionContext)_localctx).op = match(T__27);
						setState(209);
						((BinaryExpressionContext)_localctx).src2 = expression(9);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(211);
						((BinaryExpressionContext)_localctx).op = match(T__28);
						setState(212);
						((BinaryExpressionContext)_localctx).src2 = expression(8);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(214);
						((BinaryExpressionContext)_localctx).op = match(T__29);
						setState(215);
						((BinaryExpressionContext)_localctx).src2 = expression(7);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(217);
						((BinaryExpressionContext)_localctx).op = match(T__6);
						setState(218);
						((BinaryExpressionContext)_localctx).src2 = expression(5);
						}
						break;
					case 12:
						{
						_localctx = new PostfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(220);
						((PostfixExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
							((PostfixExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 13:
						{
						_localctx = new MemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(222);
						match(T__9);
						setState(223);
						match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new FuncCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(225);
						match(T__1);
						setState(227);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << IntConstant) | (1L << StringConstant) | (1L << Identifier))) != 0)) {
							{
							setState(226);
							expressionList();
							}
						}

						setState(229);
						match(T__2);
						}
						break;
					case 15:
						{
						_localctx = new SubscriptExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((SubscriptExpressionContext)_localctx).array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(231);
						match(LeftBracket);
						setState(232);
						((SubscriptExpressionContext)_localctx).index = expression(0);
						setState(233);
						match(RightBracket);
						}
						break;
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
	 
		public CreatorContext() { }
		public void copyFrom(CreatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassCreatorContext extends CreatorContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public ClassCreatorContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitClassCreator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayCreatorContext extends CreatorContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(mxParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(mxParser.LeftBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(mxParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(mxParser.RightBracket, i);
		}
		public ArrayCreatorContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitArrayCreator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicCreatorContext extends CreatorContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public BasicCreatorContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitBasicCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_creator);
		try {
			int _alt;
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new ArrayCreatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				basicType();
				setState(245); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(241);
						match(LeftBracket);
						setState(242);
						expression(0);
						setState(243);
						match(RightBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(247); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(249);
						match(LeftBracket);
						setState(250);
						match(RightBracket);
						}
						} 
					}
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new ClassCreatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				basicType();
				setState(257);
				match(T__1);
				setState(258);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new BasicCreatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				basicType();
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			expression(0);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(264);
				match(T__3);
				setState(265);
				expression(0);
				}
				}
				setState(270);
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

	public static class ConstantContext extends ParserRuleContext {
		public LogicConstantContext logicConstant() {
			return getRuleContext(LogicConstantContext.class,0);
		}
		public TerminalNode IntConstant() { return getToken(mxParser.IntConstant, 0); }
		public TerminalNode StringConstant() { return getToken(mxParser.StringConstant, 0); }
		public TerminalNode Null() { return getToken(mxParser.Null, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constant);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
			case False:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				logicConstant();
				}
				break;
			case IntConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(IntConstant);
				}
				break;
			case StringConstant:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				match(StringConstant);
				}
				break;
			case Null:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				match(Null);
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

	public static class LogicConstantContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(mxParser.True, 0); }
		public TerminalNode False() { return getToken(mxParser.False, 0); }
		public LogicConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitLogicConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicConstantContext logicConstant() throws RecognitionException {
		LogicConstantContext _localctx = new LogicConstantContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==True || _la==False) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(mxParser.Int, 0); }
		public TerminalNode Bool() { return getToken(mxParser.Bool, 0); }
		public TerminalNode String() { return getToken(mxParser.String, 0); }
		public TerminalNode Identifier() { return getToken(mxParser.Identifier, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << String) | (1L << Identifier))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleTypeContext extends TypeContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public SimpleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayTypeContext extends TypeContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(mxParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(mxParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(mxParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(mxParser.RightBracket, i);
		}
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(281);
				basicType();
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(282);
					match(LeftBracket);
					setState(283);
					match(RightBracket);
					}
					}
					setState(286); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftBracket );
				}
				}
				break;
			case 2:
				_localctx = new SimpleTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				basicType();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 23);
		case 12:
			return precpred(_ctx, 21);
		case 13:
			return precpred(_ctx, 20);
		case 14:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0126\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\65\n\3\3\4\3\4\5\49\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\5\6E\n\6\3\6\3\6\7\6I\n\6\f\6\16\6L\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7W\n\7\f\7\16\7Z\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bc\n\b"+
		"\f\b\16\bf\13\b\3\t\3\t\3\t\5\tk\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13"+
		"t\n\13\f\13\16\13w\13\13\3\13\3\13\3\f\3\f\5\f}\n\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0083\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\r\3\r\3\r\5\r"+
		"\u0091\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u0098\n\r\3\r\3\r\5\r\u009c\n\r\3\r"+
		"\3\r\5\r\u00a0\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a9\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00bb\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00e6\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ee\n"+
		"\16\f\16\16\16\u00f1\13\16\3\17\3\17\3\17\3\17\3\17\6\17\u00f8\n\17\r"+
		"\17\16\17\u00f9\3\17\3\17\7\17\u00fe\n\17\f\17\16\17\u0101\13\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0108\n\17\3\20\3\20\3\20\7\20\u010d\n\20\f"+
		"\20\16\20\u0110\13\20\3\21\3\21\3\21\3\21\5\21\u0116\n\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\6\24\u011f\n\24\r\24\16\24\u0120\3\24\5\24\u0124"+
		"\n\24\3\24\2\3\32\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\13"+
		"\3\2\n\13\3\2\r\16\3\2\17\20\3\2\21\23\3\2\24\25\3\2\26\31\3\2\32\33\3"+
		"\2&\'\4\2!#\64\64\2\u0150\2+\3\2\2\2\4\64\3\2\2\2\68\3\2\2\2\b@\3\2\2"+
		"\2\nD\3\2\2\2\fM\3\2\2\2\16^\3\2\2\2\20g\3\2\2\2\22l\3\2\2\2\24q\3\2\2"+
		"\2\26\u0082\3\2\2\2\30\u00a8\3\2\2\2\32\u00ba\3\2\2\2\34\u0107\3\2\2\2"+
		"\36\u0109\3\2\2\2 \u0115\3\2\2\2\"\u0117\3\2\2\2$\u0119\3\2\2\2&\u0123"+
		"\3\2\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2"+
		"-+\3\2\2\2.\65\5\6\4\2/\65\5\f\7\2\60\61\5\16\b\2\61\62\7\3\2\2\62\65"+
		"\3\2\2\2\63\65\7\3\2\2\64.\3\2\2\2\64/\3\2\2\2\64\60\3\2\2\2\64\63\3\2"+
		"\2\2\65\5\3\2\2\2\669\5&\24\2\679\7%\2\28\66\3\2\2\28\67\3\2\2\29:\3\2"+
		"\2\2:;\7\64\2\2;<\7\4\2\2<=\5\n\6\2=>\7\5\2\2>?\5\24\13\2?\7\3\2\2\2@"+
		"A\5&\24\2AB\7\64\2\2B\t\3\2\2\2CE\5\b\5\2DC\3\2\2\2DE\3\2\2\2EJ\3\2\2"+
		"\2FG\7\6\2\2GI\5\b\5\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\13\3\2"+
		"\2\2LJ\3\2\2\2MN\7\60\2\2NO\7\64\2\2OX\7\7\2\2PW\5\6\4\2QW\5\22\n\2RS"+
		"\5\16\b\2ST\7\3\2\2TW\3\2\2\2UW\7\3\2\2VP\3\2\2\2VQ\3\2\2\2VR\3\2\2\2"+
		"VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\b\2"+
		"\2\\]\7\3\2\2]\r\3\2\2\2^_\5&\24\2_d\5\20\t\2`a\7\6\2\2ac\5\20\t\2b`\3"+
		"\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\17\3\2\2\2fd\3\2\2\2gj\7\64\2\2"+
		"hi\7\t\2\2ik\5\32\16\2jh\3\2\2\2jk\3\2\2\2k\21\3\2\2\2lm\7\64\2\2mn\7"+
		"\4\2\2no\7\5\2\2op\5\24\13\2p\23\3\2\2\2qu\7\7\2\2rt\5\30\r\2sr\3\2\2"+
		"\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\b\2\2y\25\3\2"+
		"\2\2z|\7.\2\2{}\5\32\16\2|{\3\2\2\2|}\3\2\2\2}\u0083\3\2\2\2~\u0083\7"+
		",\2\2\177\u0083\7-\2\2\u0080\u0083\5\32\16\2\u0081\u0083\5\16\b\2\u0082"+
		"z\3\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\27\3\2\2\2\u0084\u0085\7(\2\2\u0085\u0086\7\4\2\2\u0086"+
		"\u0087\5\32\16\2\u0087\u0088\7\5\2\2\u0088\u008b\5\30\r\2\u0089\u008a"+
		"\7)\2\2\u008a\u008c\5\30\r\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u00a9\3\2\2\2\u008d\u008e\7+\2\2\u008e\u0090\7\4\2\2\u008f\u0091\5\32"+
		"\16\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\7\5\2\2\u0093\u00a9\5\30\r\2\u0094\u0095\7*\2\2\u0095\u0097\7\4"+
		"\2\2\u0096\u0098\5\26\f\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\7\3\2\2\u009a\u009c\5\32\16\2\u009b\u009a\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\7\3\2\2\u009e"+
		"\u00a0\5\26\f\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a2\7\5\2\2\u00a2\u00a9\5\30\r\2\u00a3\u00a4\5\26\f\2\u00a4"+
		"\u00a5\7\3\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a9\5\24\13\2\u00a7\u00a9\7"+
		"\3\2\2\u00a8\u0084\3\2\2\2\u00a8\u008d\3\2\2\2\u00a8\u0094\3\2\2\2\u00a8"+
		"\u00a3\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\31\3\2\2"+
		"\2\u00aa\u00ab\b\16\1\2\u00ab\u00ac\7/\2\2\u00ac\u00bb\5\34\17\2\u00ad"+
		"\u00ae\t\2\2\2\u00ae\u00bb\5\32\16\24\u00af\u00b0\t\3\2\2\u00b0\u00bb"+
		"\5\32\16\23\u00b1\u00b2\t\4\2\2\u00b2\u00bb\5\32\16\22\u00b3\u00b4\7\4"+
		"\2\2\u00b4\u00b5\5\32\16\2\u00b5\u00b6\7\5\2\2\u00b6\u00bb\3\2\2\2\u00b7"+
		"\u00bb\7\61\2\2\u00b8\u00bb\5 \21\2\u00b9\u00bb\7\64\2\2\u00ba\u00aa\3"+
		"\2\2\2\u00ba\u00ad\3\2\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba"+
		"\u00b3\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb\u00ef\3\2\2\2\u00bc\u00bd\f\21\2\2\u00bd\u00be\t\5\2\2\u00be"+
		"\u00ee\5\32\16\22\u00bf\u00c0\f\20\2\2\u00c0\u00c1\t\3\2\2\u00c1\u00ee"+
		"\5\32\16\21\u00c2\u00c3\f\17\2\2\u00c3\u00c4\t\6\2\2\u00c4\u00ee\5\32"+
		"\16\20\u00c5\u00c6\f\16\2\2\u00c6\u00c7\t\7\2\2\u00c7\u00ee\5\32\16\17"+
		"\u00c8\u00c9\f\r\2\2\u00c9\u00ca\t\b\2\2\u00ca\u00ee\5\32\16\16\u00cb"+
		"\u00cc\f\f\2\2\u00cc\u00cd\7\34\2\2\u00cd\u00ee\5\32\16\r\u00ce\u00cf"+
		"\f\13\2\2\u00cf\u00d0\7\35\2\2\u00d0\u00ee\5\32\16\f\u00d1\u00d2\f\n\2"+
		"\2\u00d2\u00d3\7\36\2\2\u00d3\u00ee\5\32\16\13\u00d4\u00d5\f\t\2\2\u00d5"+
		"\u00d6\7\37\2\2\u00d6\u00ee\5\32\16\n\u00d7\u00d8\f\b\2\2\u00d8\u00d9"+
		"\7 \2\2\u00d9\u00ee\5\32\16\t\u00da\u00db\f\7\2\2\u00db\u00dc\7\t\2\2"+
		"\u00dc\u00ee\5\32\16\7\u00dd\u00de\f\31\2\2\u00de\u00ee\t\2\2\2\u00df"+
		"\u00e0\f\27\2\2\u00e0\u00e1\7\f\2\2\u00e1\u00ee\7\64\2\2\u00e2\u00e3\f"+
		"\26\2\2\u00e3\u00e5\7\4\2\2\u00e4\u00e6\5\36\20\2\u00e5\u00e4\3\2\2\2"+
		"\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ee\7\5\2\2\u00e8\u00e9"+
		"\f\25\2\2\u00e9\u00ea\7\65\2\2\u00ea\u00eb\5\32\16\2\u00eb\u00ec\7\66"+
		"\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00bc\3\2\2\2\u00ed\u00bf\3\2\2\2\u00ed"+
		"\u00c2\3\2\2\2\u00ed\u00c5\3\2\2\2\u00ed\u00c8\3\2\2\2\u00ed\u00cb\3\2"+
		"\2\2\u00ed\u00ce\3\2\2\2\u00ed\u00d1\3\2\2\2\u00ed\u00d4\3\2\2\2\u00ed"+
		"\u00d7\3\2\2\2\u00ed\u00da\3\2\2\2\u00ed\u00dd\3\2\2\2\u00ed\u00df\3\2"+
		"\2\2\u00ed\u00e2\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\33\3\2\2\2\u00f1\u00ef\3\2\2"+
		"\2\u00f2\u00f7\5$\23\2\u00f3\u00f4\7\65\2\2\u00f4\u00f5\5\32\16\2\u00f5"+
		"\u00f6\7\66\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f8\u00f9\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00ff\3\2\2\2\u00fb"+
		"\u00fc\7\65\2\2\u00fc\u00fe\7\66\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3"+
		"\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0108\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0103\5$\23\2\u0103\u0104\7\4\2\2\u0104\u0105\7\5"+
		"\2\2\u0105\u0108\3\2\2\2\u0106\u0108\5$\23\2\u0107\u00f2\3\2\2\2\u0107"+
		"\u0102\3\2\2\2\u0107\u0106\3\2\2\2\u0108\35\3\2\2\2\u0109\u010e\5\32\16"+
		"\2\u010a\u010b\7\6\2\2\u010b\u010d\5\32\16\2\u010c\u010a\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\37\3\2\2"+
		"\2\u0110\u010e\3\2\2\2\u0111\u0116\5\"\22\2\u0112\u0116\7\62\2\2\u0113"+
		"\u0116\7\63\2\2\u0114\u0116\7$\2\2\u0115\u0111\3\2\2\2\u0115\u0112\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116!\3\2\2\2\u0117\u0118"+
		"\t\t\2\2\u0118#\3\2\2\2\u0119\u011a\t\n\2\2\u011a%\3\2\2\2\u011b\u011e"+
		"\5$\23\2\u011c\u011d\7\65\2\2\u011d\u011f\7\66\2\2\u011e\u011c\3\2\2\2"+
		"\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124"+
		"\3\2\2\2\u0122\u0124\5$\23\2\u0123\u011b\3\2\2\2\u0123\u0122\3\2\2\2\u0124"+
		"\'\3\2\2\2\37+\648DJVXdju|\u0082\u008b\u0090\u0097\u009b\u009f\u00a8\u00ba"+
		"\u00e5\u00ed\u00ef\u00f9\u00ff\u0107\u010e\u0115\u0120\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}