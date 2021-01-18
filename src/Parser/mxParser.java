// Generated from C:/Users/Amagi/IdeaProjects/mx-compiler/src/Parser\mx.g4 by ANTLR 4.9
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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, Int=33, Bool=34, String=35, Null=36, Void=37, True=38, False=39, 
		If=40, Else=41, For=42, While=43, Break=44, Continue=45, Return=46, New=47, 
		Class=48, This=49, IntConstant=50, StringConstant=51, Identifier=52, Whitespace=53, 
		Newline=54, BlockComment=55, LineComment=56;
	public static final int
		RULE_program = 0, RULE_compoundStatement = 1, RULE_funcDefStatement = 2, 
		RULE_arg = 3, RULE_argList = 4, RULE_classDefStatement = 5, RULE_varDefStatement = 6, 
		RULE_varDefList = 7, RULE_varDef = 8, RULE_constructFuncDefStatement = 9, 
		RULE_block = 10, RULE_simpleStatement = 11, RULE_statement = 12, RULE_expression = 13, 
		RULE_creator = 14, RULE_expressionList = 15, RULE_constant = 16, RULE_logicConstant = 17, 
		RULE_basicType = 18, RULE_type = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "compoundStatement", "funcDefStatement", "arg", "argList", 
			"classDefStatement", "varDefStatement", "varDefList", "varDef", "constructFuncDefStatement", 
			"block", "simpleStatement", "statement", "expression", "creator", "expressionList", 
			"constant", "logicConstant", "basicType", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'{'", "'}'", "'='", "'++'", "'--'", 
			"'.'", "'['", "']'", "'+'", "'-'", "'!'", "'~'", "'*'", "'/'", "'%'", 
			"'<<'", "'>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", 
			"'^'", "'|'", "'&&'", "'||'", "'int'", "'bool'", "'string'", "'null'", 
			"'void'", "'true'", "'false'", "'if'", "'else'", "'for'", "'while'", 
			"'break'", "'continue'", "'return'", "'new'", "'class'", "'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Int", "Bool", 
			"String", "Null", "Void", "True", "False", "If", "Else", "For", "While", 
			"Break", "Continue", "Return", "New", "Class", "This", "IntConstant", 
			"StringConstant", "Identifier", "Whitespace", "Newline", "BlockComment", 
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Int) | (1L << Bool) | (1L << String) | (1L << Void) | (1L << Class) | (1L << Identifier))) != 0)) {
				{
				{
				setState(40);
				compoundStatement();
				}
				}
				setState(45);
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
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				funcDefStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				classDefStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				varDefStatement();
				setState(49);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
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
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
			case String:
			case Identifier:
				{
				setState(54);
				type();
				}
				break;
			case Void:
				{
				setState(55);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(58);
			match(Identifier);
			setState(59);
			match(T__1);
			setState(60);
			argList();
			setState(61);
			match(T__2);
			setState(62);
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
			setState(64);
			type();
			setState(65);
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
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << String) | (1L << Identifier))) != 0)) {
				{
				setState(67);
				arg();
				}
			}

			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(70);
				match(T__3);
				setState(71);
				arg();
				}
				}
				setState(76);
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
			setState(77);
			match(Class);
			setState(78);
			match(Identifier);
			setState(79);
			match(T__4);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Int) | (1L << Bool) | (1L << String) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(80);
					funcDefStatement();
					}
					break;
				case 2:
					{
					setState(81);
					constructFuncDefStatement();
					}
					break;
				case 3:
					{
					{
					setState(82);
					varDefStatement();
					setState(83);
					match(T__0);
					}
					}
					break;
				case 4:
					{
					setState(85);
					match(T__0);
					}
					break;
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__5);
			setState(92);
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
		public VarDefListContext varDefList() {
			return getRuleContext(VarDefListContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			type();
			setState(95);
			varDefList();
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

	public static class VarDefListContext extends ParserRuleContext {
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public VarDefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitVarDefList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefListContext varDefList() throws RecognitionException {
		VarDefListContext _localctx = new VarDefListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			varDef();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(98);
				match(T__3);
				setState(99);
				varDef();
				}
				}
				setState(104);
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
		enterRule(_localctx, 16, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(Identifier);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(106);
				match(T__6);
				setState(107);
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
		enterRule(_localctx, 18, RULE_constructFuncDefStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(Identifier);
			setState(111);
			match(T__1);
			setState(112);
			match(T__2);
			setState(113);
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
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__4);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << Int) | (1L << Bool) | (1L << String) | (1L << Null) | (1L << True) | (1L << False) | (1L << If) | (1L << For) | (1L << While) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << New) | (1L << This) | (1L << IntConstant) | (1L << StringConstant) | (1L << Identifier))) != 0)) {
				{
				{
				setState(116);
				statement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
	public static class BlockStatementContext extends SimpleStatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementContext(SimpleStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
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
		enterRule(_localctx, 22, RULE_simpleStatement);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(Return);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << IntConstant) | (1L << StringConstant) | (1L << Identifier))) != 0)) {
					{
					setState(125);
					expression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(Break);
				}
				break;
			case 3:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(Continue);
				}
				break;
			case 4:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				expression(0);
				}
				break;
			case 5:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				block();
				}
				break;
			case 6:
				_localctx = new VarStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
	public static class ForStatementContext extends StatementContext {
		public TerminalNode For() { return getToken(mxParser.For, 0); }
		public List<SimpleStatementContext> simpleStatement() {
			return getRuleContexts(SimpleStatementContext.class);
		}
		public SimpleStatementContext simpleStatement(int i) {
			return getRuleContext(SimpleStatementContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
		enterRule(_localctx, 24, RULE_statement);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(If);
				setState(136);
				match(T__1);
				setState(137);
				expression(0);
				setState(138);
				match(T__2);
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(139);
					block();
					}
					break;
				case 2:
					{
					setState(140);
					statement();
					}
					break;
				}
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(143);
					match(Else);
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(144);
						block();
						}
						break;
					case 2:
						{
						setState(145);
						statement();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case While:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(While);
				setState(151);
				match(T__1);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << IntConstant) | (1L << StringConstant) | (1L << Identifier))) != 0)) {
					{
					setState(152);
					expression(0);
					}
				}

				setState(155);
				match(T__2);
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(156);
					block();
					}
					break;
				case 2:
					{
					setState(157);
					statement();
					}
					break;
				}
				}
				break;
			case For:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(For);
				setState(161);
				match(T__1);
				setState(162);
				simpleStatement();
				setState(163);
				match(T__0);
				setState(164);
				expressionList();
				setState(165);
				match(T__0);
				setState(166);
				simpleStatement();
				setState(167);
				match(T__2);
				setState(170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(168);
					block();
					}
					break;
				case 2:
					{
					setState(169);
					statement();
					}
					break;
				}
				}
				break;
			case T__1:
			case T__4:
			case T__7:
			case T__8:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
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
				setState(172);
				simpleStatement();
				setState(173);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case New:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(178);
				match(New);
				setState(179);
				creator();
				}
				break;
			case T__7:
			case T__8:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
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
				setState(181);
				expression(18);
				}
				break;
			case T__12:
			case T__13:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
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
				setState(183);
				expression(17);
				}
				break;
			case T__14:
			case T__15:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				((PrefixExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
					((PrefixExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				expression(16);
				}
				break;
			case T__1:
				{
				_localctx = new SubExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(T__1);
				setState(187);
				expression(0);
				setState(188);
				match(T__2);
				}
				break;
			case This:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
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
				setState(191);
				constant();
				}
				break;
			case Identifier:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(196);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						((BinaryExpressionContext)_localctx).src2 = expression(16);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(199);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(200);
						((BinaryExpressionContext)_localctx).src2 = expression(15);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(202);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(203);
						((BinaryExpressionContext)_localctx).src2 = expression(14);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(205);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(206);
						((BinaryExpressionContext)_localctx).src2 = expression(13);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(208);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(209);
						((BinaryExpressionContext)_localctx).src2 = expression(12);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(211);
						((BinaryExpressionContext)_localctx).op = match(T__27);
						setState(212);
						((BinaryExpressionContext)_localctx).src2 = expression(11);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(214);
						((BinaryExpressionContext)_localctx).op = match(T__28);
						setState(215);
						((BinaryExpressionContext)_localctx).src2 = expression(10);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(217);
						((BinaryExpressionContext)_localctx).op = match(T__29);
						setState(218);
						((BinaryExpressionContext)_localctx).src2 = expression(9);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(220);
						((BinaryExpressionContext)_localctx).op = match(T__30);
						setState(221);
						((BinaryExpressionContext)_localctx).src2 = expression(8);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(223);
						((BinaryExpressionContext)_localctx).op = match(T__31);
						setState(224);
						((BinaryExpressionContext)_localctx).src2 = expression(7);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).src1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(226);
						((BinaryExpressionContext)_localctx).op = match(T__6);
						setState(227);
						((BinaryExpressionContext)_localctx).src2 = expression(5);
						}
						break;
					case 12:
						{
						_localctx = new PostfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(229);
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
						setState(230);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(231);
						match(T__9);
						setState(232);
						match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new FuncCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(234);
						match(T__1);
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << IntConstant) | (1L << StringConstant) | (1L << Identifier))) != 0)) {
							{
							setState(235);
							expressionList();
							}
						}

						setState(238);
						match(T__2);
						}
						break;
					case 15:
						{
						_localctx = new SubscriptExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(239);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(240);
						match(T__10);
						setState(241);
						expression(0);
						setState(242);
						match(T__11);
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
	public static class ArrayCreatorContext extends CreatorContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitArrayCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_creator);
		int _la;
		try {
			int _alt;
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new BasicCreatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				basicType();
				}
				break;
			case 2:
				_localctx = new ClassCreatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				basicType();
				setState(251);
				match(T__1);
				setState(252);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new ArrayCreatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				basicType();
				setState(260); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(255);
						match(T__10);
						setState(257);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << IntConstant) | (1L << StringConstant) | (1L << Identifier))) != 0)) {
							{
							setState(256);
							expression(0);
							}
						}

						setState(259);
						match(T__11);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(262); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 30, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			expression(0);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(267);
				match(T__3);
				setState(268);
				expression(0);
				}
				}
				setState(273);
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
		enterRule(_localctx, 32, RULE_constant);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
			case False:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				logicConstant();
				}
				break;
			case IntConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(IntConstant);
				}
				break;
			case StringConstant:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(StringConstant);
				}
				break;
			case Null:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
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
		enterRule(_localctx, 34, RULE_logicConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 36, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(284);
				basicType();
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(285);
					match(T__10);
					setState(286);
					match(T__11);
					}
					}
					setState(289); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__10 );
				}
				}
				break;
			case 2:
				_localctx = new SimpleTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
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
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\67\n\3\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\5\6G\n\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\7\tg\n\t\f\t\16\tj\13\t\3\n\3\n\3\n\5\no\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\7\fx\n\f\f\f\16\f{\13\f\3\f\3\f\3\r\3\r\5\r\u0081\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u0088\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0090\n\16\3\16\3\16\3\16\5\16\u0095\n\16\5\16\u0097\n\16\3\16\3\16\3"+
		"\16\5\16\u009c\n\16\3\16\3\16\3\16\5\16\u00a1\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ad\n\16\3\16\3\16\3\16\5\16\u00b2"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00c4\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00ef\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00f7\n\17\f\17\16\17\u00fa\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0104\n\20\3\20\6\20\u0107\n\20\r\20\16\20\u0108\5\20"+
		"\u010b\n\20\3\21\3\21\3\21\7\21\u0110\n\21\f\21\16\21\u0113\13\21\3\22"+
		"\3\22\3\22\3\22\5\22\u0119\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\6\25"+
		"\u0122\n\25\r\25\16\25\u0123\3\25\5\25\u0127\n\25\3\25\2\3\34\26\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\13\3\2\n\13\3\2\17\20\3\2\21"+
		"\22\3\2\23\25\3\2\26\27\3\2\30\33\3\2\34\35\3\2()\4\2#%\66\66\2\u0152"+
		"\2-\3\2\2\2\4\66\3\2\2\2\6:\3\2\2\2\bB\3\2\2\2\nF\3\2\2\2\fO\3\2\2\2\16"+
		"`\3\2\2\2\20c\3\2\2\2\22k\3\2\2\2\24p\3\2\2\2\26u\3\2\2\2\30\u0087\3\2"+
		"\2\2\32\u00b1\3\2\2\2\34\u00c3\3\2\2\2\36\u010a\3\2\2\2 \u010c\3\2\2\2"+
		"\"\u0118\3\2\2\2$\u011a\3\2\2\2&\u011c\3\2\2\2(\u0126\3\2\2\2*,\5\4\3"+
		"\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/-\3\2\2\2\60\67"+
		"\5\6\4\2\61\67\5\f\7\2\62\63\5\16\b\2\63\64\7\3\2\2\64\67\3\2\2\2\65\67"+
		"\7\3\2\2\66\60\3\2\2\2\66\61\3\2\2\2\66\62\3\2\2\2\66\65\3\2\2\2\67\5"+
		"\3\2\2\28;\5(\25\29;\7\'\2\2:8\3\2\2\2:9\3\2\2\2;<\3\2\2\2<=\7\66\2\2"+
		"=>\7\4\2\2>?\5\n\6\2?@\7\5\2\2@A\5\26\f\2A\7\3\2\2\2BC\5(\25\2CD\7\66"+
		"\2\2D\t\3\2\2\2EG\5\b\5\2FE\3\2\2\2FG\3\2\2\2GL\3\2\2\2HI\7\6\2\2IK\5"+
		"\b\5\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\13\3\2\2\2NL\3\2\2\2O"+
		"P\7\62\2\2PQ\7\66\2\2QZ\7\7\2\2RY\5\6\4\2SY\5\24\13\2TU\5\16\b\2UV\7\3"+
		"\2\2VY\3\2\2\2WY\7\3\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XW\3\2\2\2Y\\\3"+
		"\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\b\2\2^_\7\3\2\2_\r"+
		"\3\2\2\2`a\5(\25\2ab\5\20\t\2b\17\3\2\2\2ch\5\22\n\2de\7\6\2\2eg\5\22"+
		"\n\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\21\3\2\2\2jh\3\2\2\2kn\7"+
		"\66\2\2lm\7\t\2\2mo\5\34\17\2nl\3\2\2\2no\3\2\2\2o\23\3\2\2\2pq\7\66\2"+
		"\2qr\7\4\2\2rs\7\5\2\2st\5\26\f\2t\25\3\2\2\2uy\7\7\2\2vx\5\32\16\2wv"+
		"\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\b\2\2}"+
		"\27\3\2\2\2~\u0080\7\60\2\2\177\u0081\5\34\17\2\u0080\177\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0088\3\2\2\2\u0082\u0088\7.\2\2\u0083\u0088\7/\2"+
		"\2\u0084\u0088\5\34\17\2\u0085\u0088\5\26\f\2\u0086\u0088\5\16\b\2\u0087"+
		"~\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\31\3\2\2\2\u0089\u008a"+
		"\7*\2\2\u008a\u008b\7\4\2\2\u008b\u008c\5\34\17\2\u008c\u008f\7\5\2\2"+
		"\u008d\u0090\5\26\f\2\u008e\u0090\5\32\16\2\u008f\u008d\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0096\3\2\2\2\u0091\u0094\7+\2\2\u0092\u0095\5\26"+
		"\f\2\u0093\u0095\5\32\16\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00b2\3\2"+
		"\2\2\u0098\u0099\7-\2\2\u0099\u009b\7\4\2\2\u009a\u009c\5\34\17\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\7\5"+
		"\2\2\u009e\u00a1\5\26\f\2\u009f\u00a1\5\32\16\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00b2\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3\u00a4\7\4"+
		"\2\2\u00a4\u00a5\5\30\r\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\5 \21\2\u00a7"+
		"\u00a8\7\3\2\2\u00a8\u00a9\5\30\r\2\u00a9\u00ac\7\5\2\2\u00aa\u00ad\5"+
		"\26\f\2\u00ab\u00ad\5\32\16\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2"+
		"\u00ad\u00b2\3\2\2\2\u00ae\u00af\5\30\r\2\u00af\u00b0\7\3\2\2\u00b0\u00b2"+
		"\3\2\2\2\u00b1\u0089\3\2\2\2\u00b1\u0098\3\2\2\2\u00b1\u00a2\3\2\2\2\u00b1"+
		"\u00ae\3\2\2\2\u00b2\33\3\2\2\2\u00b3\u00b4\b\17\1\2\u00b4\u00b5\7\61"+
		"\2\2\u00b5\u00c4\5\36\20\2\u00b6\u00b7\t\2\2\2\u00b7\u00c4\5\34\17\24"+
		"\u00b8\u00b9\t\3\2\2\u00b9\u00c4\5\34\17\23\u00ba\u00bb\t\4\2\2\u00bb"+
		"\u00c4\5\34\17\22\u00bc\u00bd\7\4\2\2\u00bd\u00be\5\34\17\2\u00be\u00bf"+
		"\7\5\2\2\u00bf\u00c4\3\2\2\2\u00c0\u00c4\7\63\2\2\u00c1\u00c4\5\"\22\2"+
		"\u00c2\u00c4\7\66\2\2\u00c3\u00b3\3\2\2\2\u00c3\u00b6\3\2\2\2\u00c3\u00b8"+
		"\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00f8\3\2\2\2\u00c5\u00c6\f\21"+
		"\2\2\u00c6\u00c7\t\5\2\2\u00c7\u00f7\5\34\17\22\u00c8\u00c9\f\20\2\2\u00c9"+
		"\u00ca\t\3\2\2\u00ca\u00f7\5\34\17\21\u00cb\u00cc\f\17\2\2\u00cc\u00cd"+
		"\t\6\2\2\u00cd\u00f7\5\34\17\20\u00ce\u00cf\f\16\2\2\u00cf\u00d0\t\7\2"+
		"\2\u00d0\u00f7\5\34\17\17\u00d1\u00d2\f\r\2\2\u00d2\u00d3\t\b\2\2\u00d3"+
		"\u00f7\5\34\17\16\u00d4\u00d5\f\f\2\2\u00d5\u00d6\7\36\2\2\u00d6\u00f7"+
		"\5\34\17\r\u00d7\u00d8\f\13\2\2\u00d8\u00d9\7\37\2\2\u00d9\u00f7\5\34"+
		"\17\f\u00da\u00db\f\n\2\2\u00db\u00dc\7 \2\2\u00dc\u00f7\5\34\17\13\u00dd"+
		"\u00de\f\t\2\2\u00de\u00df\7!\2\2\u00df\u00f7\5\34\17\n\u00e0\u00e1\f"+
		"\b\2\2\u00e1\u00e2\7\"\2\2\u00e2\u00f7\5\34\17\t\u00e3\u00e4\f\7\2\2\u00e4"+
		"\u00e5\7\t\2\2\u00e5\u00f7\5\34\17\7\u00e6\u00e7\f\31\2\2\u00e7\u00f7"+
		"\t\2\2\2\u00e8\u00e9\f\27\2\2\u00e9\u00ea\7\f\2\2\u00ea\u00f7\7\66\2\2"+
		"\u00eb\u00ec\f\26\2\2\u00ec\u00ee\7\4\2\2\u00ed\u00ef\5 \21\2\u00ee\u00ed"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f7\7\5\2\2\u00f1"+
		"\u00f2\f\25\2\2\u00f2\u00f3\7\r\2\2\u00f3\u00f4\5\34\17\2\u00f4\u00f5"+
		"\7\16\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00c5\3\2\2\2\u00f6\u00c8\3\2\2\2"+
		"\u00f6\u00cb\3\2\2\2\u00f6\u00ce\3\2\2\2\u00f6\u00d1\3\2\2\2\u00f6\u00d4"+
		"\3\2\2\2\u00f6\u00d7\3\2\2\2\u00f6\u00da\3\2\2\2\u00f6\u00dd\3\2\2\2\u00f6"+
		"\u00e0\3\2\2\2\u00f6\u00e3\3\2\2\2\u00f6\u00e6\3\2\2\2\u00f6\u00e8\3\2"+
		"\2\2\u00f6\u00eb\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\35\3\2\2\2\u00fa\u00f8\3\2\2"+
		"\2\u00fb\u010b\5&\24\2\u00fc\u00fd\5&\24\2\u00fd\u00fe\7\4\2\2\u00fe\u00ff"+
		"\7\5\2\2\u00ff\u010b\3\2\2\2\u0100\u0106\5&\24\2\u0101\u0103\7\r\2\2\u0102"+
		"\u0104\5\34\17\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0107\7\16\2\2\u0106\u0101\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u00fb\3\2"+
		"\2\2\u010a\u00fc\3\2\2\2\u010a\u0100\3\2\2\2\u010b\37\3\2\2\2\u010c\u0111"+
		"\5\34\17\2\u010d\u010e\7\6\2\2\u010e\u0110\5\34\17\2\u010f\u010d\3\2\2"+
		"\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112!"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0119\5$\23\2\u0115\u0119\7\64\2\2"+
		"\u0116\u0119\7\65\2\2\u0117\u0119\7&\2\2\u0118\u0114\3\2\2\2\u0118\u0115"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119#\3\2\2\2\u011a"+
		"\u011b\t\t\2\2\u011b%\3\2\2\2\u011c\u011d\t\n\2\2\u011d\'\3\2\2\2\u011e"+
		"\u0121\5&\24\2\u011f\u0120\7\r\2\2\u0120\u0122\7\16\2\2\u0121\u011f\3"+
		"\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0127\5&\24\2\u0126\u011e\3\2\2\2\u0126\u0125\3\2"+
		"\2\2\u0127)\3\2\2\2 -\66:FLXZhny\u0080\u0087\u008f\u0094\u0096\u009b\u00a0"+
		"\u00ac\u00b1\u00c3\u00ee\u00f6\u00f8\u0103\u0108\u010a\u0111\u0118\u0123"+
		"\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}