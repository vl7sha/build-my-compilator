package gen;// Generated from /home/user/OpenideProjects/BuildMyCompilator/config.g4 by ANTLR 4.13.2


@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class configParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		NE=39, EQ=40, LT=41, LE=42, GT=43, GE=44, PLUS=45, MIN=46, OR=47, MULT=48, 
		DIV=49, AND=50, ID=51, WS=52, BINARY_DIGIT=53, OCTAL_DIGIT=54, DIGIT=55, 
		HEX_DIGIT=56;
	public static final int
		RULE_program = 0, RULE_description = 1, RULE_type = 2, RULE_operator = 3, 
		RULE_compound = 4, RULE_assignment = 5, RULE_conditional = 6, RULE_fixedLoop = 7, 
		RULE_conditionalLoop = 8, RULE_input = 9, RULE_output = 10, RULE_expression = 11, 
		RULE_operand = 12, RULE_term = 13, RULE_factor = 14, RULE_number = 15, 
		RULE_boolConst = 16, RULE_integer = 17, RULE_binary = 18, RULE_octal = 19, 
		RULE_decimal = 20, RULE_hexadecimal = 21, RULE_real = 22, RULE_numericString = 23, 
		RULE_exponent = 24, RULE_relOp = 25, RULE_addOp = 26, RULE_mulOp = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "description", "type", "operator", "compound", "assignment", 
			"conditional", "fixedLoop", "conditionalLoop", "input", "output", "expression", 
			"operand", "term", "factor", "number", "boolConst", "integer", "binary", 
			"octal", "decimal", "hexadecimal", "real", "numericString", "exponent", 
			"relOp", "addOp", "mulOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'begin'", "';'", "'end'", "'dim'", "','", 
			"'int'", "'float'", "'bool'", "':='", "'if'", "'('", "')'", "'else'", 
			"'for'", "'to'", "'step'", "'next'", "'while'", "'readln'", "'writeln'", 
			"'~'", "'true'", "'false'", "'B'", "'b'", "'O'", "'o'", "'D'", "'d'", 
			"'H'", "'h'", "'.'", "'E'", "'e'", "'+'", "'-'", "'NE'", "'EQ'", "'LT'", 
			"'LE'", "'GT'", "'GE'", "'plus'", "'min'", "'or'", "'mult'", "'div'", 
			"'and'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NE", "EQ", "LT", "LE", "GT", "GE", "PLUS", "MIN", 
			"OR", "MULT", "DIV", "AND", "ID", "WS", "BINARY_DIGIT", "OCTAL_DIGIT", 
			"DIGIT", "HEX_DIGIT"
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
	public String getGrammarFileName() { return "config.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public configParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(56);
			match(T__0);
			setState(57);
			match(T__1);
			setState(58);
			description();
			setState(59);
			match(T__2);
			setState(60);
			operator();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(61);
				match(T__3);
				setState(62);
				operator();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DescriptionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(configParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(configParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__5);
			setState(71);
			match(ID);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(72);
				match(T__6);
				setState(73);
				match(ID);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public FixedLoopContext fixedLoop() {
			return getRuleContext(FixedLoopContext.class,0);
		}
		public ConditionalLoopContext conditionalLoop() {
			return getRuleContext(ConditionalLoopContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operator);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				compound();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				assignment();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				conditional();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				fixedLoop();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				conditionalLoop();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				input();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				output();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundContext extends ParserRuleContext {
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public CompoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitCompound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundContext compound() throws RecognitionException {
		CompoundContext _localctx = new CompoundContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__2);
			setState(93);
			operator();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(94);
				match(T__3);
				setState(95);
				operator();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(configParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(T__10);
			setState(105);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__11);
			setState(108);
			match(T__12);
			setState(109);
			expression();
			setState(110);
			match(T__13);
			setState(111);
			operator();
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(112);
				match(T__14);
				setState(113);
				operator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FixedLoopContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public FixedLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterFixedLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitFixedLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitFixedLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedLoopContext fixedLoop() throws RecognitionException {
		FixedLoopContext _localctx = new FixedLoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fixedLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__15);
			setState(117);
			assignment();
			setState(118);
			match(T__16);
			setState(119);
			expression();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(120);
				match(T__17);
				setState(121);
				expression();
				}
			}

			setState(124);
			operator();
			setState(125);
			match(T__18);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalLoopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ConditionalLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterConditionalLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitConditionalLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitConditionalLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalLoopContext conditionalLoop() throws RecognitionException {
		ConditionalLoopContext _localctx = new ConditionalLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionalLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__19);
			setState(128);
			match(T__12);
			setState(129);
			expression();
			setState(130);
			match(T__13);
			setState(131);
			operator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(configParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(configParser.ID, i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__20);
			setState(134);
			match(ID);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(135);
				match(T__6);
				setState(136);
				match(ID);
				}
				}
				setState(141);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutputContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__21);
			setState(143);
			expression();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(144);
				match(T__6);
				setState(145);
				expression();
				}
				}
				setState(150);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<RelOpContext> relOp() {
			return getRuleContexts(RelOpContext.class);
		}
		public RelOpContext relOp(int i) {
			return getRuleContext(RelOpContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			operand();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34634616274944L) != 0)) {
				{
				{
				setState(152);
				relOp();
				setState(153);
				operand();
				}
				}
				setState(159);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddOpContext> addOp() {
			return getRuleContexts(AddOpContext.class);
		}
		public AddOpContext addOp(int i) {
			return getRuleContext(AddOpContext.class,i);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			term();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0)) {
				{
				{
				setState(161);
				addOp();
				setState(162);
				term();
				}
				}
				setState(168);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulOpContext> mulOp() {
			return getRuleContexts(MulOpContext.class);
		}
		public MulOpContext mulOp(int i) {
			return getRuleContext(MulOpContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			factor();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) {
				{
				{
				setState(170);
				mulOp();
				setState(171);
				factor();
				}
				}
				setState(177);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(configParser.ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BoolConstContext boolConst() {
			return getRuleContext(BoolConstContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ID);
				}
				break;
			case T__33:
			case BINARY_DIGIT:
			case OCTAL_DIGIT:
			case DIGIT:
			case HEX_DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				number();
				}
				break;
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				boolConst();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(T__22);
				setState(182);
				factor();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(T__12);
				setState(184);
				expression();
				setState(185);
				match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				real();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolConstContext extends ParserRuleContext {
		public BoolConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterBoolConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitBoolConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitBoolConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolConstContext boolConst() throws RecognitionException {
		BoolConstContext _localctx = new BoolConstContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__24) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ParserRuleContext {
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public OctalContext octal() {
			return getRuleContext(OctalContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public HexadecimalContext hexadecimal() {
			return getRuleContext(HexadecimalContext.class,0);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_integer);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				binary();
				}
				break;
			case OCTAL_DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				octal();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				decimal();
				}
				break;
			case HEX_DIGIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				hexadecimal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryContext extends ParserRuleContext {
		public List<TerminalNode> BINARY_DIGIT() { return getTokens(configParser.BINARY_DIGIT); }
		public TerminalNode BINARY_DIGIT(int i) {
			return getToken(configParser.BINARY_DIGIT, i);
		}
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				match(BINARY_DIGIT);
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BINARY_DIGIT );
			setState(206);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OctalContext extends ParserRuleContext {
		public List<TerminalNode> OCTAL_DIGIT() { return getTokens(configParser.OCTAL_DIGIT); }
		public TerminalNode OCTAL_DIGIT(int i) {
			return getToken(configParser.OCTAL_DIGIT, i);
		}
		public OctalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterOctal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitOctal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitOctal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctalContext octal() throws RecognitionException {
		OctalContext _localctx = new OctalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_octal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				match(OCTAL_DIGIT);
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OCTAL_DIGIT );
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(configParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(configParser.DIGIT, i);
		}
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				match(DIGIT);
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29 || _la==T__30) {
				{
				setState(220);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class HexadecimalContext extends ParserRuleContext {
		public List<TerminalNode> HEX_DIGIT() { return getTokens(configParser.HEX_DIGIT); }
		public TerminalNode HEX_DIGIT(int i) {
			return getToken(configParser.HEX_DIGIT, i);
		}
		public HexadecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterHexadecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitHexadecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitHexadecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalContext hexadecimal() throws RecognitionException {
		HexadecimalContext _localctx = new HexadecimalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_hexadecimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				match(HEX_DIGIT);
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HEX_DIGIT );
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__32) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class RealContext extends ParserRuleContext {
		public List<NumericStringContext> numericString() {
			return getRuleContexts(NumericStringContext.class);
		}
		public NumericStringContext numericString(int i) {
			return getRuleContext(NumericStringContext.class,i);
		}
		public ExponentContext exponent() {
			return getRuleContext(ExponentContext.class,0);
		}
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_real);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				numericString();
				setState(231);
				exponent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIGIT) {
					{
					setState(233);
					numericString();
					}
				}

				setState(236);
				match(T__33);
				setState(237);
				numericString();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__34 || _la==T__35) {
					{
					setState(238);
					exponent();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class NumericStringContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(configParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(configParser.DIGIT, i);
		}
		public NumericStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterNumericString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitNumericString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitNumericString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericStringContext numericString() throws RecognitionException {
		NumericStringContext _localctx = new NumericStringContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_numericString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				match(DIGIT);
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExponentContext extends ParserRuleContext {
		public NumericStringContext numericString() {
			return getRuleContext(NumericStringContext.class,0);
		}
		public ExponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitExponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitExponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExponentContext exponent() throws RecognitionException {
		ExponentContext _localctx = new ExponentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !(_la==T__34 || _la==T__35) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36 || _la==T__37) {
				{
				setState(249);
				_la = _input.LA(1);
				if ( !(_la==T__36 || _la==T__37) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(252);
			numericString();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelOpContext extends ParserRuleContext {
		public TerminalNode NE() { return getToken(configParser.NE, 0); }
		public TerminalNode EQ() { return getToken(configParser.EQ, 0); }
		public TerminalNode LT() { return getToken(configParser.LT, 0); }
		public TerminalNode LE() { return getToken(configParser.LE, 0); }
		public TerminalNode GT() { return getToken(configParser.GT, 0); }
		public TerminalNode GE() { return getToken(configParser.GE, 0); }
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34634616274944L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(configParser.PLUS, 0); }
		public TerminalNode MIN() { return getToken(configParser.MIN, 0); }
		public TerminalNode OR() { return getToken(configParser.OR, 0); }
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulOpContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(configParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(configParser.DIV, 0); }
		public TerminalNode AND() { return getToken(configParser.AND, 0); }
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).enterMulOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof configListener ) ((configListener)listener).exitMulOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof configVisitor ) return ((configVisitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u00018\u0105\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"K\b\u0001\n\u0001\f\u0001N\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004a\b\u0004\n\u0004\f\u0004d\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006s\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007{\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u008a\b\t\n\t\f\t\u008d\t\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0093\b\n\n\n\f\n\u0096\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u009c\b\u000b\n"+
		"\u000b\f\u000b\u009f\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a5"+
		"\b\f\n\f\f\f\u00a8\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00ae\b"+
		"\r\n\r\f\r\u00b1\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00bc"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00c0\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00c8\b\u0011\u0001\u0012\u0004\u0012\u00cb\b\u0012\u000b\u0012\f\u0012"+
		"\u00cc\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u00d2\b\u0013\u000b"+
		"\u0013\f\u0013\u00d3\u0001\u0013\u0001\u0013\u0001\u0014\u0004\u0014\u00d9"+
		"\b\u0014\u000b\u0014\f\u0014\u00da\u0001\u0014\u0003\u0014\u00de\b\u0014"+
		"\u0001\u0015\u0004\u0015\u00e1\b\u0015\u000b\u0015\f\u0015\u00e2\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00eb\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00f0"+
		"\b\u0016\u0003\u0016\u00f2\b\u0016\u0001\u0017\u0004\u0017\u00f5\b\u0017"+
		"\u000b\u0017\f\u0017\u00f6\u0001\u0018\u0001\u0018\u0003\u0018\u00fb\b"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0000\u0000\u001c\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.0246\u0000\u000b\u0001\u0000\b\n\u0001\u0000\u0018\u0019\u0001"+
		"\u0000\u001a\u001b\u0001\u0000\u001c\u001d\u0001\u0000\u001e\u001f\u0001"+
		"\u0000 !\u0001\u0000#$\u0001\u0000%&\u0001\u0000\',\u0001\u0000-/\u0001"+
		"\u000002\u010a\u00008\u0001\u0000\u0000\u0000\u0002F\u0001\u0000\u0000"+
		"\u0000\u0004Q\u0001\u0000\u0000\u0000\u0006Z\u0001\u0000\u0000\u0000\b"+
		"\\\u0001\u0000\u0000\u0000\ng\u0001\u0000\u0000\u0000\fk\u0001\u0000\u0000"+
		"\u0000\u000et\u0001\u0000\u0000\u0000\u0010\u007f\u0001\u0000\u0000\u0000"+
		"\u0012\u0085\u0001\u0000\u0000\u0000\u0014\u008e\u0001\u0000\u0000\u0000"+
		"\u0016\u0097\u0001\u0000\u0000\u0000\u0018\u00a0\u0001\u0000\u0000\u0000"+
		"\u001a\u00a9\u0001\u0000\u0000\u0000\u001c\u00bb\u0001\u0000\u0000\u0000"+
		"\u001e\u00bf\u0001\u0000\u0000\u0000 \u00c1\u0001\u0000\u0000\u0000\""+
		"\u00c7\u0001\u0000\u0000\u0000$\u00ca\u0001\u0000\u0000\u0000&\u00d1\u0001"+
		"\u0000\u0000\u0000(\u00d8\u0001\u0000\u0000\u0000*\u00e0\u0001\u0000\u0000"+
		"\u0000,\u00f1\u0001\u0000\u0000\u0000.\u00f4\u0001\u0000\u0000\u00000"+
		"\u00f8\u0001\u0000\u0000\u00002\u00fe\u0001\u0000\u0000\u00004\u0100\u0001"+
		"\u0000\u0000\u00006\u0102\u0001\u0000\u0000\u000089\u0005\u0001\u0000"+
		"\u00009:\u0005\u0002\u0000\u0000:;\u0003\u0002\u0001\u0000;<\u0005\u0003"+
		"\u0000\u0000<A\u0003\u0006\u0003\u0000=>\u0005\u0004\u0000\u0000>@\u0003"+
		"\u0006\u0003\u0000?=\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000DE\u0005\u0005\u0000\u0000E\u0001\u0001"+
		"\u0000\u0000\u0000FG\u0005\u0006\u0000\u0000GL\u00053\u0000\u0000HI\u0005"+
		"\u0007\u0000\u0000IK\u00053\u0000\u0000JH\u0001\u0000\u0000\u0000KN\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0003\u0004\u0002"+
		"\u0000P\u0003\u0001\u0000\u0000\u0000QR\u0007\u0000\u0000\u0000R\u0005"+
		"\u0001\u0000\u0000\u0000S[\u0003\b\u0004\u0000T[\u0003\n\u0005\u0000U"+
		"[\u0003\f\u0006\u0000V[\u0003\u000e\u0007\u0000W[\u0003\u0010\b\u0000"+
		"X[\u0003\u0012\t\u0000Y[\u0003\u0014\n\u0000ZS\u0001\u0000\u0000\u0000"+
		"ZT\u0001\u0000\u0000\u0000ZU\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000"+
		"\u0000ZW\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000"+
		"\u0000\u0000[\u0007\u0001\u0000\u0000\u0000\\]\u0005\u0003\u0000\u0000"+
		"]b\u0003\u0006\u0003\u0000^_\u0005\u0004\u0000\u0000_a\u0003\u0006\u0003"+
		"\u0000`^\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000ef\u0005\u0005\u0000\u0000f\t\u0001\u0000\u0000\u0000"+
		"gh\u00053\u0000\u0000hi\u0005\u000b\u0000\u0000ij\u0003\u0016\u000b\u0000"+
		"j\u000b\u0001\u0000\u0000\u0000kl\u0005\f\u0000\u0000lm\u0005\r\u0000"+
		"\u0000mn\u0003\u0016\u000b\u0000no\u0005\u000e\u0000\u0000or\u0003\u0006"+
		"\u0003\u0000pq\u0005\u000f\u0000\u0000qs\u0003\u0006\u0003\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\r\u0001\u0000\u0000\u0000"+
		"tu\u0005\u0010\u0000\u0000uv\u0003\n\u0005\u0000vw\u0005\u0011\u0000\u0000"+
		"wz\u0003\u0016\u000b\u0000xy\u0005\u0012\u0000\u0000y{\u0003\u0016\u000b"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0003\u0006\u0003\u0000}~\u0005\u0013\u0000\u0000~\u000f"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0014\u0000\u0000\u0080\u0081"+
		"\u0005\r\u0000\u0000\u0081\u0082\u0003\u0016\u000b\u0000\u0082\u0083\u0005"+
		"\u000e\u0000\u0000\u0083\u0084\u0003\u0006\u0003\u0000\u0084\u0011\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u0015\u0000\u0000\u0086\u008b\u0005"+
		"3\u0000\u0000\u0087\u0088\u0005\u0007\u0000\u0000\u0088\u008a\u00053\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\u0016\u0000\u0000\u008f\u0094\u0003\u0016\u000b"+
		"\u0000\u0090\u0091\u0005\u0007\u0000\u0000\u0091\u0093\u0003\u0016\u000b"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0015\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0097\u009d\u0003\u0018\f\u0000\u0098\u0099\u00032\u0019\u0000"+
		"\u0099\u009a\u0003\u0018\f\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b"+
		"\u0098\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u0017\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a6\u0003\u001a\r\u0000\u00a1\u00a2\u00034\u001a\u0000\u00a2\u00a3"+
		"\u0003\u001a\r\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u0019\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00af\u0003"+
		"\u001c\u000e\u0000\u00aa\u00ab\u00036\u001b\u0000\u00ab\u00ac\u0003\u001c"+
		"\u000e\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u001b\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00bc\u00053\u0000"+
		"\u0000\u00b3\u00bc\u0003\u001e\u000f\u0000\u00b4\u00bc\u0003 \u0010\u0000"+
		"\u00b5\u00b6\u0005\u0017\u0000\u0000\u00b6\u00bc\u0003\u001c\u000e\u0000"+
		"\u00b7\u00b8\u0005\r\u0000\u0000\u00b8\u00b9\u0003\u0016\u000b\u0000\u00b9"+
		"\u00ba\u0005\u000e\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b2\u0001\u0000\u0000\u0000\u00bb\u00b3\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b4\u0001\u0000\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b7\u0001\u0000\u0000\u0000\u00bc\u001d\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0003\"\u0011\u0000\u00be\u00c0\u0003,\u0016\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u001f"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0007\u0001\u0000\u0000\u00c2!\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c8\u0003$\u0012\u0000\u00c4\u00c8\u0003&\u0013"+
		"\u0000\u00c5\u00c8\u0003(\u0014\u0000\u00c6\u00c8\u0003*\u0015\u0000\u00c7"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"#\u0001\u0000\u0000\u0000\u00c9\u00cb\u00055\u0000\u0000\u00ca\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0007\u0002\u0000\u0000\u00cf%\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d2\u00056\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0007\u0003\u0000\u0000\u00d6\'\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d9\u00057\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00de\u0007\u0004\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de)\u0001\u0000\u0000\u0000\u00df\u00e1"+
		"\u00058\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0007"+
		"\u0005\u0000\u0000\u00e5+\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003.\u0017"+
		"\u0000\u00e7\u00e8\u00030\u0018\u0000\u00e8\u00f2\u0001\u0000\u0000\u0000"+
		"\u00e9\u00eb\u0003.\u0017\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0005\"\u0000\u0000\u00ed\u00ef\u0003.\u0017\u0000\u00ee\u00f0"+
		"\u00030\u0018\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00e6\u0001"+
		"\u0000\u0000\u0000\u00f1\u00ea\u0001\u0000\u0000\u0000\u00f2-\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u00057\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7/\u0001\u0000\u0000\u0000"+
		"\u00f8\u00fa\u0007\u0006\u0000\u0000\u00f9\u00fb\u0007\u0007\u0000\u0000"+
		"\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003.\u0017\u0000\u00fd"+
		"1\u0001\u0000\u0000\u0000\u00fe\u00ff\u0007\b\u0000\u0000\u00ff3\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0007\t\u0000\u0000\u01015\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0007\n\u0000\u0000\u01037\u0001\u0000\u0000"+
		"\u0000\u0018ALZbrz\u008b\u0094\u009d\u00a6\u00af\u00bb\u00bf\u00c7\u00cc"+
		"\u00d3\u00da\u00dd\u00e2\u00ea\u00ef\u00f1\u00f6\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}