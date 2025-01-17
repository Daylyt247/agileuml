// Generated from MathOCL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathOCLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, FLOAT_LITERAL=103, STRING_LITERAL=104, NULL_LITERAL=105, MULTILINE_COMMENT=106, 
		IN=107, NOTIN=108, INTEGRAL=109, SIGMA=110, PRODUCT=111, INFINITY=112, 
		DIFFERENTIAL=113, PARTIALDIFF=114, FORALL=115, EXISTS=116, EMPTYSET=117, 
		SQUAREROOT=118, NATURAL=119, INTEGER=120, REAL=121, CDOT=122, NEWLINE=123, 
		INT=124, ID=125, WS=126;
	public static final int
		RULE_specification = 0, RULE_part = 1, RULE_formula = 2, RULE_constraint = 3, 
		RULE_reexpression = 4, RULE_simplify = 5, RULE_substituting = 6, RULE_solve = 7, 
		RULE_prove = 8, RULE_expanding = 9, RULE_factorBy = 10, RULE_idList = 11, 
		RULE_type = 12, RULE_expressionList = 13, RULE_expression = 14, RULE_basicExpression = 15, 
		RULE_conditionalExpression = 16, RULE_lambdaExpression = 17, RULE_letExpression = 18, 
		RULE_logicalExpression = 19, RULE_equalityExpression = 20, RULE_additiveExpression = 21, 
		RULE_factorExpression = 22, RULE_factor2Expression = 23, RULE_setExpression = 24, 
		RULE_identifier = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"specification", "part", "formula", "constraint", "reexpression", "simplify", 
			"substituting", "solve", "prove", "expanding", "factorBy", "idList", 
			"type", "expressionList", "expression", "basicExpression", "conditionalExpression", 
			"lambdaExpression", "letExpression", "logicalExpression", "equalityExpression", 
			"additiveExpression", "factorExpression", "factor2Expression", "setExpression", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'specification'", "'Constraint'", "'on'", "'|'", "'Express'", 
			"'as'", "'Simplify'", "'Substitute'", "'for'", "'in'", "'Solve'", "'Prove'", 
			"'if'", "'Expanding'", "'to'", "'terms'", "'Factor'", "'by'", "','", 
			"'Sequence'", "'('", "')'", "'Set'", "'Bag'", "'OrderedSet'", "'Map'", 
			"'Function'", "'true'", "'false'", "'.'", "'['", "']'", "'g{'", "'}'", 
			"'then'", "'else'", "'endif'", "'lambda'", "':'", "'let'", "'='", "'=>'", 
			"'implies'", "'or'", "'xor'", "'&'", "'and'", "'not'", "'<'", "'>'", 
			"'>='", "'<='", "'/='", "'<>'", "'/:'", "'<:'", "'+'", "'-'", "'..'", 
			"'|->'", "'C'", "'_{'", "'^{'", "'*'", "'/'", "'mod'", "'div'", "'!'", 
			"'->size()'", "'->isEmpty()'", "'->notEmpty()'", "'->asSet()'", "'->asBag()'", 
			"'->asOrderedSet()'", "'->asSequence()'", "'->sort()'", "'->any()'", 
			"'->first()'", "'->last()'", "'->front()'", "'->tail()'", "'->reverse()'", 
			"'->max()'", "'->min()'", "'->at'", "'->union'", "'->intersection'", 
			"'->includes'", "'->excludes'", "'->including'", "'->excluding'", "'->includesAll'", 
			"'->excludesAll'", "'->prepend'", "'->append'", "'->count'", "'->apply'", 
			"'OrderedSet{'", "'Bag{'", "'Set{'", "'Sequence{'", "'Map{'", null, null, 
			"'null'", null, "'\u00A9'", "'\u00A2'", "'\u2021'", "'\u20AC'", "'\u00D7'", 
			"'\u2026'", "'\u00B4'", "'\u00D0'", "'\u00A1'", "'\u00A3'", "'\u00D8'", 
			"'\u2020'", "'\u00D1'", "'\u017D'", "'\u00AE'", "'\u2022'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "FLOAT_LITERAL", "STRING_LITERAL", 
			"NULL_LITERAL", "MULTILINE_COMMENT", "IN", "NOTIN", "INTEGRAL", "SIGMA", 
			"PRODUCT", "INFINITY", "DIFFERENTIAL", "PARTIALDIFF", "FORALL", "EXISTS", 
			"EMPTYSET", "SQUAREROOT", "NATURAL", "INTEGER", "REAL", "CDOT", "NEWLINE", 
			"INT", "ID", "WS"
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
	public String getGrammarFileName() { return "MathOCL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MathOCLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SpecificationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MathOCLParser.ID, 0); }
		public TerminalNode EOF() { return getToken(MathOCLParser.EOF, 0); }
		public List<PartContext> part() {
			return getRuleContexts(PartContext.class);
		}
		public PartContext part(int i) {
			return getRuleContext(PartContext.class,i);
		}
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitSpecification(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			match(ID);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__20) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << T__37) | (1L << T__39) | (1L << T__47) | (1L << T__56) | (1L << T__57) | (1L << T__60))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (T__97 - 98)) | (1L << (T__98 - 98)) | (1L << (T__99 - 98)) | (1L << (T__100 - 98)) | (1L << (T__101 - 98)) | (1L << (FLOAT_LITERAL - 98)) | (1L << (STRING_LITERAL - 98)) | (1L << (NULL_LITERAL - 98)) | (1L << (INTEGRAL - 98)) | (1L << (SIGMA - 98)) | (1L << (PRODUCT - 98)) | (1L << (INFINITY - 98)) | (1L << (PARTIALDIFF - 98)) | (1L << (FORALL - 98)) | (1L << (EXISTS - 98)) | (1L << (EMPTYSET - 98)) | (1L << (SQUAREROOT - 98)) | (1L << (INT - 98)) | (1L << (ID - 98)))) != 0)) {
				{
				{
				setState(54);
				part();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(EOF);
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

	public static class PartContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public ReexpressionContext reexpression() {
			return getRuleContext(ReexpressionContext.class,0);
		}
		public ExpandingContext expanding() {
			return getRuleContext(ExpandingContext.class,0);
		}
		public SimplifyContext simplify() {
			return getRuleContext(SimplifyContext.class,0);
		}
		public SubstitutingContext substituting() {
			return getRuleContext(SubstitutingContext.class,0);
		}
		public SolveContext solve() {
			return getRuleContext(SolveContext.class,0);
		}
		public ProveContext prove() {
			return getRuleContext(ProveContext.class,0);
		}
		public FactorByContext factorBy() {
			return getRuleContext(FactorByContext.class,0);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitPart(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_part);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__20:
			case T__27:
			case T__28:
			case T__32:
			case T__37:
			case T__39:
			case T__47:
			case T__56:
			case T__57:
			case T__60:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case INTEGRAL:
			case SIGMA:
			case PRODUCT:
			case INFINITY:
			case PARTIALDIFF:
			case FORALL:
			case EXISTS:
			case EMPTYSET:
			case SQUAREROOT:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				formula();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				constraint();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				reexpression();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				expanding();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				simplify();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				substituting();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				solve();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				prove();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				factorBy();
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

	public static class FormulaContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitFormula(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
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

	public static class ConstraintContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__1);
			setState(76);
			match(T__2);
			setState(77);
			expression();
			setState(78);
			match(T__3);
			setState(79);
			logicalExpression(0);
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

	public static class ReexpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ReexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterReexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitReexpression(this);
		}
	}

	public final ReexpressionContext reexpression() throws RecognitionException {
		ReexpressionContext _localctx = new ReexpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__4);
			setState(82);
			expression();
			setState(83);
			match(T__5);
			setState(84);
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

	public static class SimplifyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimplifyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplify; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterSimplify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitSimplify(this);
		}
	}

	public final SimplifyContext simplify() throws RecognitionException {
		SimplifyContext _localctx = new SimplifyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simplify);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__6);
			setState(87);
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

	public static class SubstitutingContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(MathOCLParser.ID, 0); }
		public SubstitutingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substituting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterSubstituting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitSubstituting(this);
		}
	}

	public final SubstitutingContext substituting() throws RecognitionException {
		SubstitutingContext _localctx = new SubstitutingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_substituting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__7);
			setState(90);
			expression();
			setState(91);
			match(T__8);
			setState(92);
			match(ID);
			setState(93);
			match(T__9);
			setState(94);
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

	public static class SolveContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public SolveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterSolve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitSolve(this);
		}
	}

	public final SolveContext solve() throws RecognitionException {
		SolveContext _localctx = new SolveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_solve);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__10);
			setState(97);
			expressionList();
			setState(98);
			match(T__8);
			setState(99);
			idList();
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

	public static class ProveContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ProveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterProve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitProve(this);
		}
	}

	public final ProveContext prove() throws RecognitionException {
		ProveContext _localctx = new ProveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_prove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__11);
			setState(102);
			logicalExpression(0);
			setState(103);
			match(T__12);
			setState(104);
			expressionList();
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

	public static class ExpandingContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INT() { return getToken(MathOCLParser.INT, 0); }
		public ExpandingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expanding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterExpanding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitExpanding(this);
		}
	}

	public final ExpandingContext expanding() throws RecognitionException {
		ExpandingContext _localctx = new ExpandingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expanding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__13);
			setState(107);
			expression();
			setState(108);
			match(T__14);
			setState(109);
			match(INT);
			setState(110);
			match(T__15);
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

	public static class FactorByContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FactorByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterFactorBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitFactorBy(this);
		}
	}

	public final FactorByContext factorBy() throws RecognitionException {
		FactorByContext _localctx = new FactorByContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factorBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__16);
			setState(113);
			expression();
			setState(114);
			match(T__17);
			setState(115);
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

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MathOCLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MathOCLParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitIdList(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_idList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					match(ID);
					setState(118);
					match(T__18);
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(124);
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

	public static class TypeContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode NATURAL() { return getToken(MathOCLParser.NATURAL, 0); }
		public TerminalNode INTEGER() { return getToken(MathOCLParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(MathOCLParser.REAL, 0); }
		public TerminalNode ID() { return getToken(MathOCLParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__19);
				setState(127);
				match(T__20);
				setState(128);
				type();
				setState(129);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__22);
				setState(132);
				match(T__20);
				setState(133);
				type();
				setState(134);
				match(T__21);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(T__23);
				setState(137);
				match(T__20);
				setState(138);
				type();
				setState(139);
				match(T__21);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(T__24);
				setState(142);
				match(T__20);
				setState(143);
				type();
				setState(144);
				match(T__21);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(T__25);
				setState(147);
				match(T__20);
				setState(148);
				type();
				setState(149);
				match(T__18);
				setState(150);
				type();
				setState(151);
				match(T__21);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				match(T__26);
				setState(154);
				match(T__20);
				setState(155);
				type();
				setState(156);
				match(T__18);
				setState(157);
				type();
				setState(158);
				match(T__21);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				match(NATURAL);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
				match(INTEGER);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(162);
				match(REAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 10);
				{
				setState(163);
				match(ID);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					expression();
					setState(167);
					match(T__18);
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(174);
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

	public static class ExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public LetExpressionContext letExpression() {
			return getRuleContext(LetExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case T__27:
			case T__28:
			case T__32:
			case T__47:
			case T__56:
			case T__57:
			case T__60:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case INTEGRAL:
			case SIGMA:
			case PRODUCT:
			case INFINITY:
			case PARTIALDIFF:
			case FORALL:
			case EXISTS:
			case EMPTYSET:
			case SQUAREROOT:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				logicalExpression(0);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				conditionalExpression();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				lambdaExpression();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				letExpression();
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

	public static class BasicExpressionContext extends ParserRuleContext {
		public TerminalNode NULL_LITERAL() { return getToken(MathOCLParser.NULL_LITERAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(MathOCLParser.ID, 0); }
		public TerminalNode INT() { return getToken(MathOCLParser.INT, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(MathOCLParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MathOCLParser.STRING_LITERAL, 0); }
		public TerminalNode INFINITY() { return getToken(MathOCLParser.INFINITY, 0); }
		public TerminalNode EMPTYSET() { return getToken(MathOCLParser.EMPTYSET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public BasicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterBasicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitBasicExpression(this);
		}
	}

	public final BasicExpressionContext basicExpression() throws RecognitionException {
		return basicExpression(0);
	}

	private BasicExpressionContext basicExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasicExpressionContext _localctx = new BasicExpressionContext(_ctx, _parentState);
		BasicExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_basicExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_LITERAL:
				{
				setState(183);
				match(NULL_LITERAL);
				}
				break;
			case T__27:
				{
				setState(184);
				match(T__27);
				}
				break;
			case T__28:
				{
				setState(185);
				match(T__28);
				}
				break;
			case ID:
				{
				setState(186);
				identifier();
				}
				break;
			case T__32:
				{
				setState(187);
				match(T__32);
				setState(188);
				match(ID);
				setState(189);
				match(T__33);
				}
				break;
			case INT:
				{
				setState(190);
				match(INT);
				}
				break;
			case FLOAT_LITERAL:
				{
				setState(191);
				match(FLOAT_LITERAL);
				}
				break;
			case STRING_LITERAL:
				{
				setState(192);
				match(STRING_LITERAL);
				}
				break;
			case INFINITY:
				{
				setState(193);
				match(INFINITY);
				}
				break;
			case EMPTYSET:
				{
				setState(194);
				match(EMPTYSET);
				}
				break;
			case T__20:
				{
				setState(195);
				match(T__20);
				setState(196);
				expression();
				setState(197);
				match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new BasicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_basicExpression);
						setState(201);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(202);
						match(T__29);
						setState(203);
						match(ID);
						}
						break;
					case 2:
						{
						_localctx = new BasicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_basicExpression);
						setState(204);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(205);
						match(T__20);
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__20) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << T__37) | (1L << T__39) | (1L << T__47) | (1L << T__56) | (1L << T__57) | (1L << T__60))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (T__97 - 98)) | (1L << (T__98 - 98)) | (1L << (T__99 - 98)) | (1L << (T__100 - 98)) | (1L << (T__101 - 98)) | (1L << (FLOAT_LITERAL - 98)) | (1L << (STRING_LITERAL - 98)) | (1L << (NULL_LITERAL - 98)) | (1L << (INTEGRAL - 98)) | (1L << (SIGMA - 98)) | (1L << (PRODUCT - 98)) | (1L << (INFINITY - 98)) | (1L << (PARTIALDIFF - 98)) | (1L << (FORALL - 98)) | (1L << (EXISTS - 98)) | (1L << (EMPTYSET - 98)) | (1L << (SQUAREROOT - 98)) | (1L << (INT - 98)) | (1L << (ID - 98)))) != 0)) {
							{
							setState(206);
							expressionList();
							}
						}

						setState(209);
						match(T__21);
						}
						break;
					case 3:
						{
						_localctx = new BasicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_basicExpression);
						setState(210);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(211);
						match(T__30);
						setState(212);
						expression();
						setState(213);
						match(T__31);
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__12);
			setState(221);
			expression();
			setState(222);
			match(T__34);
			setState(223);
			expression();
			setState(224);
			match(T__35);
			setState(225);
			expression();
			setState(226);
			match(T__36);
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__37);
			setState(229);
			identifier();
			setState(230);
			match(T__38);
			setState(231);
			type();
			setState(232);
			match(T__9);
			setState(233);
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

	public static class LetExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterLetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitLetExpression(this);
		}
	}

	public final LetExpressionContext letExpression() throws RecognitionException {
		LetExpressionContext _localctx = new LetExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_letExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__39);
			setState(236);
			identifier();
			setState(237);
			match(T__38);
			setState(238);
			type();
			setState(239);
			match(T__40);
			setState(240);
			expression();
			setState(241);
			match(T__9);
			setState(242);
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(MathOCLParser.FORALL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CDOT() { return getToken(MathOCLParser.CDOT, 0); }
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode EXISTS() { return getToken(MathOCLParser.EXISTS, 0); }
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		return logicalExpression(0);
	}

	private LogicalExpressionContext logicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, _parentState);
		LogicalExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_logicalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORALL:
				{
				setState(245);
				match(FORALL);
				setState(246);
				identifier();
				setState(247);
				match(CDOT);
				setState(248);
				logicalExpression(4);
				}
				break;
			case EXISTS:
				{
				setState(250);
				match(EXISTS);
				setState(251);
				identifier();
				setState(252);
				match(CDOT);
				setState(253);
				logicalExpression(3);
				}
				break;
			case T__47:
				{
				setState(255);
				match(T__47);
				setState(256);
				logicalExpression(2);
				}
				break;
			case T__20:
			case T__27:
			case T__28:
			case T__32:
			case T__56:
			case T__57:
			case T__60:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case INTEGRAL:
			case SIGMA:
			case PRODUCT:
			case INFINITY:
			case PARTIALDIFF:
			case EMPTYSET:
			case SQUAREROOT:
			case INT:
			case ID:
				{
				setState(257);
				equalityExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(260);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(261);
						match(T__41);
						setState(262);
						logicalExpression(11);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(263);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(264);
						match(T__42);
						setState(265);
						logicalExpression(10);
						}
						break;
					case 3:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(266);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(267);
						match(T__43);
						setState(268);
						logicalExpression(9);
						}
						break;
					case 4:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(269);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(270);
						match(T__44);
						setState(271);
						logicalExpression(8);
						}
						break;
					case 5:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(272);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(273);
						match(T__45);
						setState(274);
						logicalExpression(7);
						}
						break;
					case 6:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(275);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(276);
						match(T__46);
						setState(277);
						logicalExpression(6);
						}
						break;
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(MathOCLParser.IN, 0); }
		public TerminalNode NOTIN() { return getToken(MathOCLParser.NOTIN, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_equalityExpression);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				additiveExpression(0);
				setState(284);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__40) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0) || _la==IN || _la==NOTIN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(285);
				additiveExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				additiveExpression(0);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<FactorExpressionContext> factorExpression() {
			return getRuleContexts(FactorExpressionContext.class);
		}
		public FactorExpressionContext factorExpression(int i) {
			return getRuleContext(FactorExpressionContext.class,i);
		}
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_additiveExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(291);
				factorExpression(0);
				setState(292);
				_la = _input.LA(1);
				if ( !(_la==T__58 || _la==T__59) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(293);
				factorExpression(0);
				}
				break;
			case 2:
				{
				setState(295);
				factorExpression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(304);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(298);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(299);
						match(T__56);
						setState(300);
						additiveExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(301);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(302);
						match(T__57);
						setState(303);
						factorExpression(0);
						}
						break;
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class FactorExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INTEGRAL() { return getToken(MathOCLParser.INTEGRAL, 0); }
		public TerminalNode ID() { return getToken(MathOCLParser.ID, 0); }
		public TerminalNode SIGMA() { return getToken(MathOCLParser.SIGMA, 0); }
		public TerminalNode PRODUCT() { return getToken(MathOCLParser.PRODUCT, 0); }
		public List<FactorExpressionContext> factorExpression() {
			return getRuleContexts(FactorExpressionContext.class);
		}
		public FactorExpressionContext factorExpression(int i) {
			return getRuleContext(FactorExpressionContext.class,i);
		}
		public TerminalNode SQUAREROOT() { return getToken(MathOCLParser.SQUAREROOT, 0); }
		public TerminalNode PARTIALDIFF() { return getToken(MathOCLParser.PARTIALDIFF, 0); }
		public Factor2ExpressionContext factor2Expression() {
			return getRuleContext(Factor2ExpressionContext.class,0);
		}
		public TerminalNode DIFFERENTIAL() { return getToken(MathOCLParser.DIFFERENTIAL, 0); }
		public FactorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterFactorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitFactorExpression(this);
		}
	}

	public final FactorExpressionContext factorExpression() throws RecognitionException {
		return factorExpression(0);
	}

	private FactorExpressionContext factorExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FactorExpressionContext _localctx = new FactorExpressionContext(_ctx, _parentState);
		FactorExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_factorExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(310);
				match(T__60);
				setState(311);
				match(T__61);
				setState(312);
				expression();
				setState(313);
				match(T__33);
				setState(314);
				match(T__62);
				setState(315);
				expression();
				setState(316);
				match(T__33);
				}
				break;
			case 2:
				{
				setState(318);
				match(INTEGRAL);
				setState(319);
				match(T__61);
				setState(320);
				expression();
				setState(321);
				match(T__33);
				setState(322);
				match(T__62);
				setState(323);
				expression();
				setState(324);
				match(T__33);
				setState(325);
				expression();
				setState(326);
				match(ID);
				}
				break;
			case 3:
				{
				setState(328);
				match(INTEGRAL);
				setState(329);
				expression();
				setState(330);
				match(ID);
				}
				break;
			case 4:
				{
				setState(332);
				match(SIGMA);
				setState(333);
				match(T__61);
				setState(334);
				expression();
				setState(335);
				match(T__33);
				setState(336);
				match(T__62);
				setState(337);
				expression();
				setState(338);
				match(T__33);
				setState(339);
				expression();
				}
				break;
			case 5:
				{
				setState(341);
				match(PRODUCT);
				setState(342);
				match(T__61);
				setState(343);
				expression();
				setState(344);
				match(T__33);
				setState(345);
				match(T__62);
				setState(346);
				expression();
				setState(347);
				match(T__33);
				setState(348);
				expression();
				}
				break;
			case 6:
				{
				setState(350);
				match(T__57);
				setState(351);
				factorExpression(7);
				}
				break;
			case 7:
				{
				setState(352);
				match(T__56);
				setState(353);
				factorExpression(6);
				}
				break;
			case 8:
				{
				setState(354);
				match(SQUAREROOT);
				setState(355);
				factorExpression(5);
				}
				break;
			case 9:
				{
				setState(356);
				match(PARTIALDIFF);
				setState(357);
				match(T__61);
				setState(358);
				match(ID);
				setState(359);
				match(T__33);
				setState(360);
				factorExpression(4);
				}
				break;
			case 10:
				{
				setState(361);
				factor2Expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new FactorExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factorExpression);
						setState(364);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(365);
						_la = _input.LA(1);
						if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(366);
						factorExpression(13);
						}
						break;
					case 2:
						{
						_localctx = new FactorExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factorExpression);
						setState(367);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(368);
						match(T__67);
						}
						break;
					case 3:
						{
						_localctx = new FactorExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factorExpression);
						setState(369);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(370);
						match(DIFFERENTIAL);
						}
						break;
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Factor2ExpressionContext extends ParserRuleContext {
		public SetExpressionContext setExpression() {
			return getRuleContext(SetExpressionContext.class,0);
		}
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public Factor2ExpressionContext factor2Expression() {
			return getRuleContext(Factor2ExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Factor2ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor2Expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterFactor2Expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitFactor2Expression(this);
		}
	}

	public final Factor2ExpressionContext factor2Expression() throws RecognitionException {
		return factor2Expression(0);
	}

	private Factor2ExpressionContext factor2Expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Factor2ExpressionContext _localctx = new Factor2ExpressionContext(_ctx, _parentState);
		Factor2ExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_factor2Expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
				{
				setState(377);
				setExpression();
				}
				break;
			case T__20:
			case T__27:
			case T__28:
			case T__32:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case INFINITY:
			case EMPTYSET:
			case INT:
			case ID:
				{
				setState(378);
				basicExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(417);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new Factor2ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor2Expression);
						setState(381);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(382);
						match(T__68);
						}
						break;
					case 2:
						{
						_localctx = new Factor2ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor2Expression);
						setState(383);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(384);
						_la = _input.LA(1);
						if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__75 - 70)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 3:
						{
						_localctx = new Factor2ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor2Expression);
						setState(385);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(386);
						match(T__76);
						}
						break;
					case 4:
						{
						_localctx = new Factor2ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor2Expression);
						setState(387);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(388);
						match(T__77);
						}
						break;
					case 5:
						{
						_localctx = new Factor2ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor2Expression);
						setState(389);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(390);
						match(T__78);
						}
						break;
					case 6:
						{
						_localctx = new Factor2ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor2Expression);
						setState(391);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(392);
						match(T__79);
						}
						break;
					case 7:
						{
						_localctx = new Factor2ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor2Expression);
						setState(393);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(394);
						match(T__80);
						}
						break;
					case 8:
						{
						_localctx = new Factor2ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor2Expression);
						setState(395);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(396);
						match(T__81);
						}
						break;
					case 9:
						{
						_localctx = new Factor2ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor2Expression);
						setState(397);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(398);
						match(T__82);
						}
						break;
					case 10:
						{
						_localctx = new Factor2ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor2Expression);
						setState(399);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(400);
						match(T__83);
						}
						break;
					case 11:
						{
						_localctx = new Factor2ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor2Expression);
						setState(401);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(402);
						match(T__62);
						setState(403);
						expression();
						setState(404);
						match(T__33);
						}
						break;
					case 12:
						{
						_localctx = new Factor2ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor2Expression);
						setState(406);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(407);
						match(T__61);
						setState(408);
						expression();
						setState(409);
						match(T__33);
						}
						break;
					case 13:
						{
						_localctx = new Factor2ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor2Expression);
						setState(411);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(412);
						_la = _input.LA(1);
						if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (T__85 - 85)) | (1L << (T__86 - 85)) | (1L << (T__87 - 85)) | (1L << (T__88 - 85)) | (1L << (T__89 - 85)) | (1L << (T__90 - 85)) | (1L << (T__91 - 85)) | (1L << (T__92 - 85)) | (1L << (T__93 - 85)) | (1L << (T__94 - 85)) | (1L << (T__95 - 85)) | (1L << (T__96 - 85)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(413);
						match(T__20);
						setState(414);
						expression();
						setState(415);
						match(T__21);
						}
						break;
					}
					} 
				}
				setState(421);
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

	public static class SetExpressionContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterSetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitSetExpression(this);
		}
	}

	public final SetExpressionContext setExpression() throws RecognitionException {
		SetExpressionContext _localctx = new SetExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_setExpression);
		int _la;
		try {
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__97:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(T__97);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__20) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << T__37) | (1L << T__39) | (1L << T__47) | (1L << T__56) | (1L << T__57) | (1L << T__60))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (T__97 - 98)) | (1L << (T__98 - 98)) | (1L << (T__99 - 98)) | (1L << (T__100 - 98)) | (1L << (T__101 - 98)) | (1L << (FLOAT_LITERAL - 98)) | (1L << (STRING_LITERAL - 98)) | (1L << (NULL_LITERAL - 98)) | (1L << (INTEGRAL - 98)) | (1L << (SIGMA - 98)) | (1L << (PRODUCT - 98)) | (1L << (INFINITY - 98)) | (1L << (PARTIALDIFF - 98)) | (1L << (FORALL - 98)) | (1L << (EXISTS - 98)) | (1L << (EMPTYSET - 98)) | (1L << (SQUAREROOT - 98)) | (1L << (INT - 98)) | (1L << (ID - 98)))) != 0)) {
					{
					setState(423);
					expressionList();
					}
				}

				setState(426);
				match(T__33);
				}
				break;
			case T__98:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(T__98);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__20) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << T__37) | (1L << T__39) | (1L << T__47) | (1L << T__56) | (1L << T__57) | (1L << T__60))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (T__97 - 98)) | (1L << (T__98 - 98)) | (1L << (T__99 - 98)) | (1L << (T__100 - 98)) | (1L << (T__101 - 98)) | (1L << (FLOAT_LITERAL - 98)) | (1L << (STRING_LITERAL - 98)) | (1L << (NULL_LITERAL - 98)) | (1L << (INTEGRAL - 98)) | (1L << (SIGMA - 98)) | (1L << (PRODUCT - 98)) | (1L << (INFINITY - 98)) | (1L << (PARTIALDIFF - 98)) | (1L << (FORALL - 98)) | (1L << (EXISTS - 98)) | (1L << (EMPTYSET - 98)) | (1L << (SQUAREROOT - 98)) | (1L << (INT - 98)) | (1L << (ID - 98)))) != 0)) {
					{
					setState(428);
					expressionList();
					}
				}

				setState(431);
				match(T__33);
				}
				break;
			case T__99:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(T__99);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__20) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << T__37) | (1L << T__39) | (1L << T__47) | (1L << T__56) | (1L << T__57) | (1L << T__60))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (T__97 - 98)) | (1L << (T__98 - 98)) | (1L << (T__99 - 98)) | (1L << (T__100 - 98)) | (1L << (T__101 - 98)) | (1L << (FLOAT_LITERAL - 98)) | (1L << (STRING_LITERAL - 98)) | (1L << (NULL_LITERAL - 98)) | (1L << (INTEGRAL - 98)) | (1L << (SIGMA - 98)) | (1L << (PRODUCT - 98)) | (1L << (INFINITY - 98)) | (1L << (PARTIALDIFF - 98)) | (1L << (FORALL - 98)) | (1L << (EXISTS - 98)) | (1L << (EMPTYSET - 98)) | (1L << (SQUAREROOT - 98)) | (1L << (INT - 98)) | (1L << (ID - 98)))) != 0)) {
					{
					setState(433);
					expressionList();
					}
				}

				setState(436);
				match(T__33);
				}
				break;
			case T__100:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				match(T__100);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__20) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << T__37) | (1L << T__39) | (1L << T__47) | (1L << T__56) | (1L << T__57) | (1L << T__60))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (T__97 - 98)) | (1L << (T__98 - 98)) | (1L << (T__99 - 98)) | (1L << (T__100 - 98)) | (1L << (T__101 - 98)) | (1L << (FLOAT_LITERAL - 98)) | (1L << (STRING_LITERAL - 98)) | (1L << (NULL_LITERAL - 98)) | (1L << (INTEGRAL - 98)) | (1L << (SIGMA - 98)) | (1L << (PRODUCT - 98)) | (1L << (INFINITY - 98)) | (1L << (PARTIALDIFF - 98)) | (1L << (FORALL - 98)) | (1L << (EXISTS - 98)) | (1L << (EMPTYSET - 98)) | (1L << (SQUAREROOT - 98)) | (1L << (INT - 98)) | (1L << (ID - 98)))) != 0)) {
					{
					setState(438);
					expressionList();
					}
				}

				setState(441);
				match(T__33);
				}
				break;
			case T__101:
				enterOuterAlt(_localctx, 5);
				{
				setState(442);
				match(T__101);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__20) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << T__37) | (1L << T__39) | (1L << T__47) | (1L << T__56) | (1L << T__57) | (1L << T__60))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (T__97 - 98)) | (1L << (T__98 - 98)) | (1L << (T__99 - 98)) | (1L << (T__100 - 98)) | (1L << (T__101 - 98)) | (1L << (FLOAT_LITERAL - 98)) | (1L << (STRING_LITERAL - 98)) | (1L << (NULL_LITERAL - 98)) | (1L << (INTEGRAL - 98)) | (1L << (SIGMA - 98)) | (1L << (PRODUCT - 98)) | (1L << (INFINITY - 98)) | (1L << (PARTIALDIFF - 98)) | (1L << (FORALL - 98)) | (1L << (EXISTS - 98)) | (1L << (EMPTYSET - 98)) | (1L << (SQUAREROOT - 98)) | (1L << (INT - 98)) | (1L << (ID - 98)))) != 0)) {
					{
					setState(443);
					expressionList();
					}
				}

				setState(446);
				match(T__33);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MathOCLParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOCLListener ) ((MathOCLListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return basicExpression_sempred((BasicExpressionContext)_localctx, predIndex);
		case 19:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		case 21:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 22:
			return factorExpression_sempred((FactorExpressionContext)_localctx, predIndex);
		case 23:
			return factor2Expression_sempred((Factor2ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean basicExpression_sempred(BasicExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean factorExpression_sempred(FactorExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean factor2Expression_sempred(Factor2ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 15);
		case 15:
			return precpred(_ctx, 14);
		case 16:
			return precpred(_ctx, 13);
		case 17:
			return precpred(_ctx, 12);
		case 18:
			return precpred(_ctx, 11);
		case 19:
			return precpred(_ctx, 10);
		case 20:
			return precpred(_ctx, 9);
		case 21:
			return precpred(_ctx, 8);
		case 22:
			return precpred(_ctx, 7);
		case 23:
			return precpred(_ctx, 6);
		case 24:
			return precpred(_ctx, 5);
		case 25:
			return precpred(_ctx, 4);
		case 26:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0080\u01c6\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\7\rz\n\r\f\r\16\r}\13\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a7\n\16\3\17\3\17\3\17\7\17"+
		"\u00ac\n\17\f\17\16\17\u00af\13\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20"+
		"\u00b7\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00ca\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00d2\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00da\n\21\f\21\16"+
		"\21\u00dd\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0105\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0119\n\25\f\25\16\25\u011c\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0123\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u012b\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0133\n\27\f\27\16"+
		"\27\u0136\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u016d\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0176\n\30\f"+
		"\30\16\30\u0179\13\30\3\31\3\31\3\31\5\31\u017e\n\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\7\31\u01a4\n\31\f\31\16\31\u01a7\13\31\3\32\3"+
		"\32\5\32\u01ab\n\32\3\32\3\32\3\32\5\32\u01b0\n\32\3\32\3\32\3\32\5\32"+
		"\u01b5\n\32\3\32\3\32\3\32\5\32\u01ba\n\32\3\32\3\32\3\32\5\32\u01bf\n"+
		"\32\3\32\5\32\u01c2\n\32\3\33\3\33\3\33\2\7 (,.\60\34\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\7\6\2))++\63:mn\3\2=>\3\2BE"+
		"\3\2HN\3\2Wc\2\u0200\2\66\3\2\2\2\4I\3\2\2\2\6K\3\2\2\2\bM\3\2\2\2\nS"+
		"\3\2\2\2\fX\3\2\2\2\16[\3\2\2\2\20b\3\2\2\2\22g\3\2\2\2\24l\3\2\2\2\26"+
		"r\3\2\2\2\30{\3\2\2\2\32\u00a6\3\2\2\2\34\u00ad\3\2\2\2\36\u00b6\3\2\2"+
		"\2 \u00c9\3\2\2\2\"\u00de\3\2\2\2$\u00e6\3\2\2\2&\u00ed\3\2\2\2(\u0104"+
		"\3\2\2\2*\u0122\3\2\2\2,\u012a\3\2\2\2.\u016c\3\2\2\2\60\u017d\3\2\2\2"+
		"\62\u01c1\3\2\2\2\64\u01c3\3\2\2\2\66\67\7\3\2\2\67;\7\177\2\28:\5\4\3"+
		"\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\2\2"+
		"\3?\3\3\2\2\2@J\5\6\4\2AJ\5\b\5\2BJ\5\n\6\2CJ\5\24\13\2DJ\5\f\7\2EJ\5"+
		"\16\b\2FJ\5\20\t\2GJ\5\22\n\2HJ\5\26\f\2I@\3\2\2\2IA\3\2\2\2IB\3\2\2\2"+
		"IC\3\2\2\2ID\3\2\2\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\5\3\2\2"+
		"\2KL\5\36\20\2L\7\3\2\2\2MN\7\4\2\2NO\7\5\2\2OP\5\36\20\2PQ\7\6\2\2QR"+
		"\5(\25\2R\t\3\2\2\2ST\7\7\2\2TU\5\36\20\2UV\7\b\2\2VW\5\36\20\2W\13\3"+
		"\2\2\2XY\7\t\2\2YZ\5\36\20\2Z\r\3\2\2\2[\\\7\n\2\2\\]\5\36\20\2]^\7\13"+
		"\2\2^_\7\177\2\2_`\7\f\2\2`a\5\36\20\2a\17\3\2\2\2bc\7\r\2\2cd\5\34\17"+
		"\2de\7\13\2\2ef\5\30\r\2f\21\3\2\2\2gh\7\16\2\2hi\5(\25\2ij\7\17\2\2j"+
		"k\5\34\17\2k\23\3\2\2\2lm\7\20\2\2mn\5\36\20\2no\7\21\2\2op\7~\2\2pq\7"+
		"\22\2\2q\25\3\2\2\2rs\7\23\2\2st\5\36\20\2tu\7\24\2\2uv\5\36\20\2v\27"+
		"\3\2\2\2wx\7\177\2\2xz\7\25\2\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|~\3\2\2\2}{\3\2\2\2~\177\7\177\2\2\177\31\3\2\2\2\u0080\u0081\7\26"+
		"\2\2\u0081\u0082\7\27\2\2\u0082\u0083\5\32\16\2\u0083\u0084\7\30\2\2\u0084"+
		"\u00a7\3\2\2\2\u0085\u0086\7\31\2\2\u0086\u0087\7\27\2\2\u0087\u0088\5"+
		"\32\16\2\u0088\u0089\7\30\2\2\u0089\u00a7\3\2\2\2\u008a\u008b\7\32\2\2"+
		"\u008b\u008c\7\27\2\2\u008c\u008d\5\32\16\2\u008d\u008e\7\30\2\2\u008e"+
		"\u00a7\3\2\2\2\u008f\u0090\7\33\2\2\u0090\u0091\7\27\2\2\u0091\u0092\5"+
		"\32\16\2\u0092\u0093\7\30\2\2\u0093\u00a7\3\2\2\2\u0094\u0095\7\34\2\2"+
		"\u0095\u0096\7\27\2\2\u0096\u0097\5\32\16\2\u0097\u0098\7\25\2\2\u0098"+
		"\u0099\5\32\16\2\u0099\u009a\7\30\2\2\u009a\u00a7\3\2\2\2\u009b\u009c"+
		"\7\35\2\2\u009c\u009d\7\27\2\2\u009d\u009e\5\32\16\2\u009e\u009f\7\25"+
		"\2\2\u009f\u00a0\5\32\16\2\u00a0\u00a1\7\30\2\2\u00a1\u00a7\3\2\2\2\u00a2"+
		"\u00a7\7y\2\2\u00a3\u00a7\7z\2\2\u00a4\u00a7\7{\2\2\u00a5\u00a7\7\177"+
		"\2\2\u00a6\u0080\3\2\2\2\u00a6\u0085\3\2\2\2\u00a6\u008a\3\2\2\2\u00a6"+
		"\u008f\3\2\2\2\u00a6\u0094\3\2\2\2\u00a6\u009b\3\2\2\2\u00a6\u00a2\3\2"+
		"\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\33\3\2\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\7\25\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\5\36"+
		"\20\2\u00b1\35\3\2\2\2\u00b2\u00b7\5(\25\2\u00b3\u00b7\5\"\22\2\u00b4"+
		"\u00b7\5$\23\2\u00b5\u00b7\5&\24\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\37\3\2\2\2\u00b8\u00b9"+
		"\b\21\1\2\u00b9\u00ca\7k\2\2\u00ba\u00ca\7\36\2\2\u00bb\u00ca\7\37\2\2"+
		"\u00bc\u00ca\5\64\33\2\u00bd\u00be\7#\2\2\u00be\u00bf\7\177\2\2\u00bf"+
		"\u00ca\7$\2\2\u00c0\u00ca\7~\2\2\u00c1\u00ca\7i\2\2\u00c2\u00ca\7j\2\2"+
		"\u00c3\u00ca\7r\2\2\u00c4\u00ca\7w\2\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7"+
		"\5\36\20\2\u00c7\u00c8\7\30\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00b8\3\2\2"+
		"\2\u00c9\u00ba\3\2\2\2\u00c9\u00bb\3\2\2\2\u00c9\u00bc\3\2\2\2\u00c9\u00bd"+
		"\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00c2\3\2\2\2\u00c9"+
		"\u00c3\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca\u00db\3\2"+
		"\2\2\u00cb\u00cc\f\r\2\2\u00cc\u00cd\7 \2\2\u00cd\u00da\7\177\2\2\u00ce"+
		"\u00cf\f\f\2\2\u00cf\u00d1\7\27\2\2\u00d0\u00d2\5\34\17\2\u00d1\u00d0"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00da\7\30\2\2"+
		"\u00d4\u00d5\f\13\2\2\u00d5\u00d6\7!\2\2\u00d6\u00d7\5\36\20\2\u00d7\u00d8"+
		"\7\"\2\2\u00d8\u00da\3\2\2\2\u00d9\u00cb\3\2\2\2\u00d9\u00ce\3\2\2\2\u00d9"+
		"\u00d4\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc!\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\17\2\2\u00df\u00e0"+
		"\5\36\20\2\u00e0\u00e1\7%\2\2\u00e1\u00e2\5\36\20\2\u00e2\u00e3\7&\2\2"+
		"\u00e3\u00e4\5\36\20\2\u00e4\u00e5\7\'\2\2\u00e5#\3\2\2\2\u00e6\u00e7"+
		"\7(\2\2\u00e7\u00e8\5\64\33\2\u00e8\u00e9\7)\2\2\u00e9\u00ea\5\32\16\2"+
		"\u00ea\u00eb\7\f\2\2\u00eb\u00ec\5\36\20\2\u00ec%\3\2\2\2\u00ed\u00ee"+
		"\7*\2\2\u00ee\u00ef\5\64\33\2\u00ef\u00f0\7)\2\2\u00f0\u00f1\5\32\16\2"+
		"\u00f1\u00f2\7+\2\2\u00f2\u00f3\5\36\20\2\u00f3\u00f4\7\f\2\2\u00f4\u00f5"+
		"\5\36\20\2\u00f5\'\3\2\2\2\u00f6\u00f7\b\25\1\2\u00f7\u00f8\7u\2\2\u00f8"+
		"\u00f9\5\64\33\2\u00f9\u00fa\7|\2\2\u00fa\u00fb\5(\25\6\u00fb\u0105\3"+
		"\2\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\5\64\33\2\u00fe\u00ff\7|\2\2\u00ff"+
		"\u0100\5(\25\5\u0100\u0105\3\2\2\2\u0101\u0102\7\62\2\2\u0102\u0105\5"+
		"(\25\4\u0103\u0105\5*\26\2\u0104\u00f6\3\2\2\2\u0104\u00fc\3\2\2\2\u0104"+
		"\u0101\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u011a\3\2\2\2\u0106\u0107\f\f"+
		"\2\2\u0107\u0108\7,\2\2\u0108\u0119\5(\25\r\u0109\u010a\f\13\2\2\u010a"+
		"\u010b\7-\2\2\u010b\u0119\5(\25\f\u010c\u010d\f\n\2\2\u010d\u010e\7.\2"+
		"\2\u010e\u0119\5(\25\13\u010f\u0110\f\t\2\2\u0110\u0111\7/\2\2\u0111\u0119"+
		"\5(\25\n\u0112\u0113\f\b\2\2\u0113\u0114\7\60\2\2\u0114\u0119\5(\25\t"+
		"\u0115\u0116\f\7\2\2\u0116\u0117\7\61\2\2\u0117\u0119\5(\25\b\u0118\u0106"+
		"\3\2\2\2\u0118\u0109\3\2\2\2\u0118\u010c\3\2\2\2\u0118\u010f\3\2\2\2\u0118"+
		"\u0112\3\2\2\2\u0118\u0115\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b)\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e"+
		"\5,\27\2\u011e\u011f\t\2\2\2\u011f\u0120\5,\27\2\u0120\u0123\3\2\2\2\u0121"+
		"\u0123\5,\27\2\u0122\u011d\3\2\2\2\u0122\u0121\3\2\2\2\u0123+\3\2\2\2"+
		"\u0124\u0125\b\27\1\2\u0125\u0126\5.\30\2\u0126\u0127\t\3\2\2\u0127\u0128"+
		"\5.\30\2\u0128\u012b\3\2\2\2\u0129\u012b\5.\30\2\u012a\u0124\3\2\2\2\u012a"+
		"\u0129\3\2\2\2\u012b\u0134\3\2\2\2\u012c\u012d\f\6\2\2\u012d\u012e\7;"+
		"\2\2\u012e\u0133\5,\27\7\u012f\u0130\f\5\2\2\u0130\u0131\7<\2\2\u0131"+
		"\u0133\5.\30\2\u0132\u012c\3\2\2\2\u0132\u012f\3\2\2\2\u0133\u0136\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135-\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0137\u0138\b\30\1\2\u0138\u0139\7?\2\2\u0139\u013a\7@\2\2\u013a"+
		"\u013b\5\36\20\2\u013b\u013c\7$\2\2\u013c\u013d\7A\2\2\u013d\u013e\5\36"+
		"\20\2\u013e\u013f\7$\2\2\u013f\u016d\3\2\2\2\u0140\u0141\7o\2\2\u0141"+
		"\u0142\7@\2\2\u0142\u0143\5\36\20\2\u0143\u0144\7$\2\2\u0144\u0145\7A"+
		"\2\2\u0145\u0146\5\36\20\2\u0146\u0147\7$\2\2\u0147\u0148\5\36\20\2\u0148"+
		"\u0149\7\177\2\2\u0149\u016d\3\2\2\2\u014a\u014b\7o\2\2\u014b\u014c\5"+
		"\36\20\2\u014c\u014d\7\177\2\2\u014d\u016d\3\2\2\2\u014e\u014f\7p\2\2"+
		"\u014f\u0150\7@\2\2\u0150\u0151\5\36\20\2\u0151\u0152\7$\2\2\u0152\u0153"+
		"\7A\2\2\u0153\u0154\5\36\20\2\u0154\u0155\7$\2\2\u0155\u0156\5\36\20\2"+
		"\u0156\u016d\3\2\2\2\u0157\u0158\7q\2\2\u0158\u0159\7@\2\2\u0159\u015a"+
		"\5\36\20\2\u015a\u015b\7$\2\2\u015b\u015c\7A\2\2\u015c\u015d\5\36\20\2"+
		"\u015d\u015e\7$\2\2\u015e\u015f\5\36\20\2\u015f\u016d\3\2\2\2\u0160\u0161"+
		"\7<\2\2\u0161\u016d\5.\30\t\u0162\u0163\7;\2\2\u0163\u016d\5.\30\b\u0164"+
		"\u0165\7x\2\2\u0165\u016d\5.\30\7\u0166\u0167\7t\2\2\u0167\u0168\7@\2"+
		"\2\u0168\u0169\7\177\2\2\u0169\u016a\7$\2\2\u016a\u016d\5.\30\6\u016b"+
		"\u016d\5\60\31\2\u016c\u0137\3\2\2\2\u016c\u0140\3\2\2\2\u016c\u014a\3"+
		"\2\2\2\u016c\u014e\3\2\2\2\u016c\u0157\3\2\2\2\u016c\u0160\3\2\2\2\u016c"+
		"\u0162\3\2\2\2\u016c\u0164\3\2\2\2\u016c\u0166\3\2\2\2\u016c\u016b\3\2"+
		"\2\2\u016d\u0177\3\2\2\2\u016e\u016f\f\16\2\2\u016f\u0170\t\4\2\2\u0170"+
		"\u0176\5.\30\17\u0171\u0172\f\5\2\2\u0172\u0176\7F\2\2\u0173\u0174\f\4"+
		"\2\2\u0174\u0176\7s\2\2\u0175\u016e\3\2\2\2\u0175\u0171\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178/\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\b\31\1\2\u017b\u017e"+
		"\5\62\32\2\u017c\u017e\5 \21\2\u017d\u017a\3\2\2\2\u017d\u017c\3\2\2\2"+
		"\u017e\u01a5\3\2\2\2\u017f\u0180\f\21\2\2\u0180\u01a4\7G\2\2\u0181\u0182"+
		"\f\20\2\2\u0182\u01a4\t\5\2\2\u0183\u0184\f\17\2\2\u0184\u01a4\7O\2\2"+
		"\u0185\u0186\f\16\2\2\u0186\u01a4\7P\2\2\u0187\u0188\f\r\2\2\u0188\u01a4"+
		"\7Q\2\2\u0189\u018a\f\f\2\2\u018a\u01a4\7R\2\2\u018b\u018c\f\13\2\2\u018c"+
		"\u01a4\7S\2\2\u018d\u018e\f\n\2\2\u018e\u01a4\7T\2\2\u018f\u0190\f\t\2"+
		"\2\u0190\u01a4\7U\2\2\u0191\u0192\f\b\2\2\u0192\u01a4\7V\2\2\u0193\u0194"+
		"\f\7\2\2\u0194\u0195\7A\2\2\u0195\u0196\5\36\20\2\u0196\u0197\7$\2\2\u0197"+
		"\u01a4\3\2\2\2\u0198\u0199\f\6\2\2\u0199\u019a\7@\2\2\u019a\u019b\5\36"+
		"\20\2\u019b\u019c\7$\2\2\u019c\u01a4\3\2\2\2\u019d\u019e\f\5\2\2\u019e"+
		"\u019f\t\6\2\2\u019f\u01a0\7\27\2\2\u01a0\u01a1\5\36\20\2\u01a1\u01a2"+
		"\7\30\2\2\u01a2\u01a4\3\2\2\2\u01a3\u017f\3\2\2\2\u01a3\u0181\3\2\2\2"+
		"\u01a3\u0183\3\2\2\2\u01a3\u0185\3\2\2\2\u01a3\u0187\3\2\2\2\u01a3\u0189"+
		"\3\2\2\2\u01a3\u018b\3\2\2\2\u01a3\u018d\3\2\2\2\u01a3\u018f\3\2\2\2\u01a3"+
		"\u0191\3\2\2\2\u01a3\u0193\3\2\2\2\u01a3\u0198\3\2\2\2\u01a3\u019d\3\2"+
		"\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\61\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01aa\7d\2\2\u01a9\u01ab\5\34\17"+
		"\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01c2"+
		"\7$\2\2\u01ad\u01af\7e\2\2\u01ae\u01b0\5\34\17\2\u01af\u01ae\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01c2\7$\2\2\u01b2\u01b4\7f\2"+
		"\2\u01b3\u01b5\5\34\17\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01c2\7$\2\2\u01b7\u01b9\7g\2\2\u01b8\u01ba\5\34"+
		"\17\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01c2\7$\2\2\u01bc\u01be\7h\2\2\u01bd\u01bf\5\34\17\2\u01be\u01bd\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\7$\2\2\u01c1"+
		"\u01a8\3\2\2\2\u01c1\u01ad\3\2\2\2\u01c1\u01b2\3\2\2\2\u01c1\u01b7\3\2"+
		"\2\2\u01c1\u01bc\3\2\2\2\u01c2\63\3\2\2\2\u01c3\u01c4\7\177\2\2\u01c4"+
		"\65\3\2\2\2\37;I{\u00a6\u00ad\u00b6\u00c9\u00d1\u00d9\u00db\u0104\u0118"+
		"\u011a\u0122\u012a\u0132\u0134\u016c\u0175\u0177\u017d\u01a3\u01a5\u01aa"+
		"\u01af\u01b4\u01b9\u01be\u01c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}