// Generated from tiger.g by ANTLR 4.9.2

    package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tigerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		T__59=60, T__60=61, T__61=62, IDF=63, INT=64, ESC=65, ESCAPE_SEQ=66, STRING=67, 
		COMMENT=68, WS=69;
	public static final int
		RULE_program = 0, RULE_expr = 1, RULE_negation = 2, RULE_expr_seq = 3, 
		RULE_expr_list = 4, RULE_field_list = 5, RULE_lvalue = 6, RULE_functionCall = 7, 
		RULE_assignement = 8, RULE_ifthenelse = 9, RULE_ifthen = 10, RULE_whiledo = 11, 
		RULE_for_ = 12, RULE_let_in_end = 13, RULE_declaration_list = 14, RULE_declaration = 15, 
		RULE_type_declaration = 16, RULE_type = 17, RULE_type_fields = 18, RULE_type_field = 19, 
		RULE_type_IDF = 20, RULE_variable_declaration = 21, RULE_function_declaration = 22, 
		RULE_stdlib = 23, RULE_print_ = 24, RULE_printi = 25, RULE_flush_ = 26, 
		RULE_exit_ = 27, RULE_getchar_ = 28, RULE_chr_ = 29, RULE_substring_ = 30, 
		RULE_concat_ = 31, RULE_ord_ = 32, RULE_size_ = 33, RULE_not_ = 34, RULE_integer = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expr", "negation", "expr_seq", "expr_list", "field_list", 
			"lvalue", "functionCall", "assignement", "ifthenelse", "ifthen", "whiledo", 
			"for_", "let_in_end", "declaration_list", "declaration", "type_declaration", 
			"type", "type_fields", "type_field", "type_IDF", "variable_declaration", 
			"function_declaration", "stdlib", "print_", "printi", "flush_", "exit_", 
			"getchar_", "chr_", "substring_", "concat_", "ord_", "size_", "not_", 
			"integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'nil'", "'*'", "'/'", "'+'", "'-'", "'<>'", "'='", "'>='", "'<='", 
			"'>'", "'<'", "'&'", "'|'", "'break'", "'('", "')'", "'{'", "'}'", "'['", 
			"'] of '", "'- '", "';'", "' , '", "' = '", "'.'", "']'", "':='", "'if '", 
			"' then '", "' else '", "'while '", "' do '", "'for '", "' to '", "'let'", 
			"'in'", "'end'", "'type '", "'array of '", "', '", "':'", "'int'", "'string'", 
			"'intArray'", "'stringArray'", "'var '", "'function '", "') ='", "'):'", 
			"' ='", "'print('", "'printi('", "'flush()'", "'exit('", "'getchar()'", 
			"'chr('", "'substring('", "','", "'concat('", "'ord('", "'size('", "'not('"
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
			null, null, null, "IDF", "INT", "ESC", "ESCAPE_SEQ", "STRING", "COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "tiger.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tigerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(tigerParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			expr(0);
			setState(73);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(tigerParser.STRING, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public AssignementContext assignement() {
			return getRuleContext(AssignementContext.class,0);
		}
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public IfthenelseContext ifthenelse() {
			return getRuleContext(IfthenelseContext.class,0);
		}
		public IfthenContext ifthen() {
			return getRuleContext(IfthenContext.class,0);
		}
		public WhiledoContext whiledo() {
			return getRuleContext(WhiledoContext.class,0);
		}
		public For_Context for_() {
			return getRuleContext(For_Context.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public Expr_seqContext expr_seq() {
			return getRuleContext(Expr_seqContext.class,0);
		}
		public Type_IDFContext type_IDF() {
			return getRuleContext(Type_IDFContext.class,0);
		}
		public List<Field_listContext> field_list() {
			return getRuleContexts(Field_listContext.class);
		}
		public Field_listContext field_list(int i) {
			return getRuleContext(Field_listContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Let_in_endContext let_in_end() {
			return getRuleContext(Let_in_endContext.class,0);
		}
		public StdlibContext stdlib() {
			return getRuleContext(StdlibContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(76);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(77);
				integer();
				}
				break;
			case 3:
				{
				setState(78);
				match(T__0);
				}
				break;
			case 4:
				{
				setState(79);
				lvalue(0);
				}
				break;
			case 5:
				{
				setState(80);
				assignement();
				}
				break;
			case 6:
				{
				setState(81);
				negation();
				}
				break;
			case 7:
				{
				setState(82);
				assignement();
				}
				break;
			case 8:
				{
				setState(83);
				ifthenelse();
				}
				break;
			case 9:
				{
				setState(84);
				ifthen();
				}
				break;
			case 10:
				{
				setState(85);
				whiledo();
				}
				break;
			case 11:
				{
				setState(86);
				for_();
				}
				break;
			case 12:
				{
				setState(87);
				match(T__13);
				}
				break;
			case 13:
				{
				setState(88);
				functionCall();
				}
				break;
			case 14:
				{
				setState(89);
				match(T__14);
				setState(90);
				expr_seq(0);
				setState(91);
				match(T__15);
				}
				break;
			case 15:
				{
				setState(93);
				type_IDF();
				setState(94);
				match(T__16);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDF) {
					{
					{
					setState(95);
					field_list(0);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(T__17);
				}
				break;
			case 16:
				{
				setState(103);
				type_IDF();
				setState(104);
				match(T__18);
				setState(105);
				expr(0);
				setState(106);
				match(T__19);
				setState(107);
				expr(3);
				}
				break;
			case 17:
				{
				setState(109);
				let_in_end();
				}
				break;
			case 18:
				{
				setState(110);
				stdlib();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(114);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__2) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(115);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(117);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(118);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(120);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(121);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(123);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						expr(14);
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class NegationContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__20);
			setState(131);
			expr(0);
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

	public static class Expr_seqContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_seqContext expr_seq() {
			return getRuleContext(Expr_seqContext.class,0);
		}
		public Expr_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_seq; }
	}

	public final Expr_seqContext expr_seq() throws RecognitionException {
		return expr_seq(0);
	}

	private Expr_seqContext expr_seq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_seqContext _localctx = new Expr_seqContext(_ctx, _parentState);
		Expr_seqContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr_seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(134);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_seqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_seq);
					setState(136);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(137);
					match(T__21);
					setState(138);
					expr(0);
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Expr_listContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		return expr_list(0);
	}

	private Expr_listContext expr_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_listContext _localctx = new Expr_listContext(_ctx, _parentState);
		Expr_listContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(145);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_list);
					setState(147);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(148);
					match(T__22);
					setState(149);
					expr(0);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Field_listContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public Field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list; }
	}

	public final Field_listContext field_list() throws RecognitionException {
		return field_list(0);
	}

	private Field_listContext field_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Field_listContext _localctx = new Field_listContext(_ctx, _parentState);
		Field_listContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_field_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(156);
			match(IDF);
			setState(157);
			match(T__23);
			setState(158);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Field_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_field_list);
					setState(160);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(161);
					match(T__22);
					setState(162);
					match(IDF);
					setState(163);
					match(T__23);
					setState(164);
					expr(0);
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(171);
			match(IDF);
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(181);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(173);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(174);
						match(T__24);
						setState(175);
						match(IDF);
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(176);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(177);
						match(T__18);
						setState(178);
						expr(0);
						setState(179);
						match(T__25);
						}
						break;
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
		public List<Expr_listContext> expr_list() {
			return getRuleContexts(Expr_listContext.class);
		}
		public Expr_listContext expr_list(int i) {
			return getRuleContext(Expr_listContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(IDF);
			setState(187);
			match(T__14);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__13) | (1L << T__14) | (1L << T__20) | (1L << T__27) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << IDF))) != 0) || _la==INT || _la==STRING) {
				{
				{
				setState(188);
				expr_list(0);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
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

	public static class AssignementContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignement; }
	}

	public final AssignementContext assignement() throws RecognitionException {
		AssignementContext _localctx = new AssignementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			lvalue(0);
			setState(197);
			match(T__26);
			setState(198);
			expr(0);
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

	public static class IfthenelseContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfthenelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifthenelse; }
	}

	public final IfthenelseContext ifthenelse() throws RecognitionException {
		IfthenelseContext _localctx = new IfthenelseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifthenelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__27);
			setState(201);
			expr(0);
			setState(202);
			match(T__28);
			setState(203);
			expr(0);
			setState(204);
			match(T__29);
			setState(205);
			expr(0);
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

	public static class IfthenContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfthenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifthen; }
	}

	public final IfthenContext ifthen() throws RecognitionException {
		IfthenContext _localctx = new IfthenContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifthen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__27);
			setState(208);
			expr(0);
			setState(209);
			match(T__28);
			setState(210);
			expr(0);
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

	public static class WhiledoContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WhiledoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiledo; }
	}

	public final WhiledoContext whiledo() throws RecognitionException {
		WhiledoContext _localctx = new WhiledoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whiledo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__30);
			setState(213);
			expr(0);
			setState(214);
			match(T__31);
			setState(215);
			expr(0);
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

	public static class For_Context extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public For_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_; }
	}

	public final For_Context for_() throws RecognitionException {
		For_Context _localctx = new For_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__32);
			setState(218);
			match(IDF);
			setState(219);
			match(T__26);
			setState(220);
			expr(0);
			setState(221);
			match(T__33);
			setState(222);
			expr(0);
			setState(223);
			match(T__31);
			setState(224);
			expr(0);
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

	public static class Let_in_endContext extends ParserRuleContext {
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public Expr_seqContext expr_seq() {
			return getRuleContext(Expr_seqContext.class,0);
		}
		public Let_in_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_in_end; }
	}

	public final Let_in_endContext let_in_end() throws RecognitionException {
		Let_in_endContext _localctx = new Let_in_endContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_let_in_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__34);
			setState(227);
			declaration_list(0);
			setState(228);
			match(T__35);
			setState(229);
			expr_seq(0);
			setState(230);
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

	public static class Declaration_listContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public Declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_list; }
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		return declaration_list(0);
	}

	private Declaration_listContext declaration_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, _parentState);
		Declaration_listContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_declaration_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(233);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Declaration_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declaration_list);
					setState(235);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(236);
					declaration();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaration);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				type_declaration();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				variable_declaration();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				function_declaration();
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

	public static class Type_declarationContext extends ParserRuleContext {
		public Type_IDFContext type_IDF() {
			return getRuleContext(Type_IDFContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__37);
			setState(248);
			type_IDF();
			setState(249);
			match(T__23);
			setState(250);
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

	public static class TypeContext extends ParserRuleContext {
		public Type_IDFContext type_IDF() {
			return getRuleContext(Type_IDFContext.class,0);
		}
		public List<Type_fieldsContext> type_fields() {
			return getRuleContexts(Type_fieldsContext.class);
		}
		public Type_fieldsContext type_fields(int i) {
			return getRuleContext(Type_fieldsContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
			case T__42:
			case T__43:
			case T__44:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				type_IDF();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(T__16);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDF) {
					{
					{
					setState(254);
					type_fields(0);
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(T__17);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(T__38);
				setState(262);
				type_IDF();
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

	public static class Type_fieldsContext extends ParserRuleContext {
		public Type_fieldContext type_field() {
			return getRuleContext(Type_fieldContext.class,0);
		}
		public Type_fieldsContext type_fields() {
			return getRuleContext(Type_fieldsContext.class,0);
		}
		public Type_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_fields; }
	}

	public final Type_fieldsContext type_fields() throws RecognitionException {
		return type_fields(0);
	}

	private Type_fieldsContext type_fields(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_fieldsContext _localctx = new Type_fieldsContext(_ctx, _parentState);
		Type_fieldsContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_type_fields, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(266);
			type_field();
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_fieldsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type_fields);
					setState(268);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(269);
					match(T__39);
					setState(270);
					type_field();
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Type_fieldContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
		public Type_IDFContext type_IDF() {
			return getRuleContext(Type_IDFContext.class,0);
		}
		public Type_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_field; }
	}

	public final Type_fieldContext type_field() throws RecognitionException {
		Type_fieldContext _localctx = new Type_fieldContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(IDF);
			setState(277);
			match(T__40);
			setState(278);
			type_IDF();
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

	public static class Type_IDFContext extends ParserRuleContext {
		public Type_IDFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_IDF; }
	}

	public final Type_IDFContext type_IDF() throws RecognitionException {
		Type_IDFContext _localctx = new Type_IDFContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type_IDF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_IDFContext type_IDF() {
			return getRuleContext(Type_IDFContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable_declaration);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(T__45);
				setState(283);
				match(IDF);
				setState(284);
				match(T__26);
				setState(285);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(T__45);
				setState(287);
				match(IDF);
				setState(288);
				match(T__40);
				setState(289);
				type_IDF();
				setState(290);
				match(T__26);
				setState(291);
				expr(0);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Type_fieldsContext> type_fields() {
			return getRuleContexts(Type_fieldsContext.class);
		}
		public Type_fieldsContext type_fields(int i) {
			return getRuleContext(Type_fieldsContext.class,i);
		}
		public Type_IDFContext type_IDF() {
			return getRuleContext(Type_IDFContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_declaration);
		int _la;
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(T__46);
				setState(296);
				match(IDF);
				setState(297);
				match(T__14);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDF) {
					{
					{
					setState(298);
					type_fields(0);
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
				match(T__47);
				setState(305);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(T__46);
				setState(307);
				match(IDF);
				setState(308);
				match(T__14);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDF) {
					{
					{
					setState(309);
					type_fields(0);
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(315);
				match(T__48);
				setState(316);
				type_IDF();
				setState(317);
				match(T__49);
				setState(318);
				expr(0);
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

	public static class StdlibContext extends ParserRuleContext {
		public Print_Context print_() {
			return getRuleContext(Print_Context.class,0);
		}
		public PrintiContext printi() {
			return getRuleContext(PrintiContext.class,0);
		}
		public Flush_Context flush_() {
			return getRuleContext(Flush_Context.class,0);
		}
		public Exit_Context exit_() {
			return getRuleContext(Exit_Context.class,0);
		}
		public Getchar_Context getchar_() {
			return getRuleContext(Getchar_Context.class,0);
		}
		public Chr_Context chr_() {
			return getRuleContext(Chr_Context.class,0);
		}
		public Substring_Context substring_() {
			return getRuleContext(Substring_Context.class,0);
		}
		public Concat_Context concat_() {
			return getRuleContext(Concat_Context.class,0);
		}
		public Ord_Context ord_() {
			return getRuleContext(Ord_Context.class,0);
		}
		public Size_Context size_() {
			return getRuleContext(Size_Context.class,0);
		}
		public Not_Context not_() {
			return getRuleContext(Not_Context.class,0);
		}
		public IfthenContext ifthen() {
			return getRuleContext(IfthenContext.class,0);
		}
		public IfthenelseContext ifthenelse() {
			return getRuleContext(IfthenelseContext.class,0);
		}
		public StdlibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdlib; }
	}

	public final StdlibContext stdlib() throws RecognitionException {
		StdlibContext _localctx = new StdlibContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_stdlib);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				print_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				printi();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				flush_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				exit_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				getchar_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(327);
				chr_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(328);
				substring_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(329);
				concat_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(330);
				ord_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(331);
				size_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(332);
				not_();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(333);
				ifthen();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(334);
				ifthenelse();
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

	public static class Print_Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_; }
	}

	public final Print_Context print_() throws RecognitionException {
		Print_Context _localctx = new Print_Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_print_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__50);
			setState(338);
			expr(0);
			setState(339);
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

	public static class PrintiContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printi; }
	}

	public final PrintiContext printi() throws RecognitionException {
		PrintiContext _localctx = new PrintiContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_printi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__51);
			setState(342);
			expr(0);
			setState(343);
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

	public static class Flush_Context extends ParserRuleContext {
		public Flush_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flush_; }
	}

	public final Flush_Context flush_() throws RecognitionException {
		Flush_Context _localctx = new Flush_Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_flush_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__52);
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

	public static class Exit_Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Exit_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_; }
	}

	public final Exit_Context exit_() throws RecognitionException {
		Exit_Context _localctx = new Exit_Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_exit_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(T__53);
			setState(348);
			expr(0);
			setState(349);
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

	public static class Getchar_Context extends ParserRuleContext {
		public Getchar_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getchar_; }
	}

	public final Getchar_Context getchar_() throws RecognitionException {
		Getchar_Context _localctx = new Getchar_Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_getchar_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__54);
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

	public static class Chr_Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Chr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chr_; }
	}

	public final Chr_Context chr_() throws RecognitionException {
		Chr_Context _localctx = new Chr_Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_chr_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__55);
			setState(354);
			expr(0);
			setState(355);
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

	public static class Substring_Context extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Substring_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substring_; }
	}

	public final Substring_Context substring_() throws RecognitionException {
		Substring_Context _localctx = new Substring_Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_substring_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__56);
			setState(358);
			expr(0);
			setState(359);
			match(T__57);
			setState(360);
			expr(0);
			setState(361);
			match(T__57);
			setState(362);
			expr(0);
			setState(363);
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

	public static class Concat_Context extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Concat_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat_; }
	}

	public final Concat_Context concat_() throws RecognitionException {
		Concat_Context _localctx = new Concat_Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_concat_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__58);
			setState(366);
			expr(0);
			setState(367);
			match(T__57);
			setState(368);
			expr(0);
			setState(369);
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

	public static class Ord_Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ord_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ord_; }
	}

	public final Ord_Context ord_() throws RecognitionException {
		Ord_Context _localctx = new Ord_Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_ord_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__59);
			setState(372);
			expr(0);
			setState(373);
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

	public static class Size_Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Size_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size_; }
	}

	public final Size_Context size_() throws RecognitionException {
		Size_Context _localctx = new Size_Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_size_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__60);
			setState(376);
			expr(0);
			setState(377);
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

	public static class Not_Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Not_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_; }
	}

	public final Not_Context not_() throws RecognitionException {
		Not_Context _localctx = new Not_Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_not_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__61);
			setState(380);
			expr(0);
			setState(381);
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

	public static class IntegerContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(tigerParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(tigerParser.INT, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_integer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(383);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(386); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 3:
			return expr_seq_sempred((Expr_seqContext)_localctx, predIndex);
		case 4:
			return expr_list_sempred((Expr_listContext)_localctx, predIndex);
		case 5:
			return field_list_sempred((Field_listContext)_localctx, predIndex);
		case 6:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
		case 14:
			return declaration_list_sempred((Declaration_listContext)_localctx, predIndex);
		case 18:
			return type_fields_sempred((Type_fieldsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean expr_seq_sempred(Expr_seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_list_sempred(Expr_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean field_list_sempred(Field_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declaration_list_sempred(Declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_fields_sempred(Type_fieldsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u0187\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3c\n\3\f\3"+
		"\16\3f\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3r\n\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0080\n\3\f\3\16\3\u0083\13"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008e\n\5\f\5\16\5\u0091\13"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0099\n\6\f\6\16\6\u009c\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a8\n\7\f\7\16\7\u00ab\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b8\n\b\f\b\16\b\u00bb\13"+
		"\b\3\t\3\t\3\t\7\t\u00c0\n\t\f\t\16\t\u00c3\13\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00f0\n\20\f\20\16\20\u00f3"+
		"\13\20\3\21\3\21\3\21\5\21\u00f8\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\7\23\u0102\n\23\f\23\16\23\u0105\13\23\3\23\3\23\3\23\5\23\u010a"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0112\n\24\f\24\16\24\u0115\13"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u0128\n\27\3\30\3\30\3\30\3\30\7\30\u012e\n\30"+
		"\f\30\16\30\u0131\13\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0139\n\30"+
		"\f\30\16\30\u013c\13\30\3\30\3\30\3\30\3\30\3\30\5\30\u0143\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0152"+
		"\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\6%\u0183\n%\r%\16%"+
		"\u0184\3%\2\t\4\b\n\f\16\36&&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFH\2\7\3\2\4\5\3\2\6\7\3\2\b\r\3\2\16\17\3"+
		"\2,/\2\u0196\2J\3\2\2\2\4q\3\2\2\2\6\u0084\3\2\2\2\b\u0087\3\2\2\2\n\u0092"+
		"\3\2\2\2\f\u009d\3\2\2\2\16\u00ac\3\2\2\2\20\u00bc\3\2\2\2\22\u00c6\3"+
		"\2\2\2\24\u00ca\3\2\2\2\26\u00d1\3\2\2\2\30\u00d6\3\2\2\2\32\u00db\3\2"+
		"\2\2\34\u00e4\3\2\2\2\36\u00ea\3\2\2\2 \u00f7\3\2\2\2\"\u00f9\3\2\2\2"+
		"$\u0109\3\2\2\2&\u010b\3\2\2\2(\u0116\3\2\2\2*\u011a\3\2\2\2,\u0127\3"+
		"\2\2\2.\u0142\3\2\2\2\60\u0151\3\2\2\2\62\u0153\3\2\2\2\64\u0157\3\2\2"+
		"\2\66\u015b\3\2\2\28\u015d\3\2\2\2:\u0161\3\2\2\2<\u0163\3\2\2\2>\u0167"+
		"\3\2\2\2@\u016f\3\2\2\2B\u0175\3\2\2\2D\u0179\3\2\2\2F\u017d\3\2\2\2H"+
		"\u0182\3\2\2\2JK\5\4\3\2KL\7\2\2\3L\3\3\2\2\2MN\b\3\1\2Nr\7E\2\2Or\5H"+
		"%\2Pr\7\3\2\2Qr\5\16\b\2Rr\5\22\n\2Sr\5\6\4\2Tr\5\22\n\2Ur\5\24\13\2V"+
		"r\5\26\f\2Wr\5\30\r\2Xr\5\32\16\2Yr\7\20\2\2Zr\5\20\t\2[\\\7\21\2\2\\"+
		"]\5\b\5\2]^\7\22\2\2^r\3\2\2\2_`\5*\26\2`d\7\23\2\2ac\5\f\7\2ba\3\2\2"+
		"\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\24\2\2hr\3\2"+
		"\2\2ij\5*\26\2jk\7\25\2\2kl\5\4\3\2lm\7\26\2\2mn\5\4\3\5nr\3\2\2\2or\5"+
		"\34\17\2pr\5\60\31\2qM\3\2\2\2qO\3\2\2\2qP\3\2\2\2qQ\3\2\2\2qR\3\2\2\2"+
		"qS\3\2\2\2qT\3\2\2\2qU\3\2\2\2qV\3\2\2\2qW\3\2\2\2qX\3\2\2\2qY\3\2\2\2"+
		"qZ\3\2\2\2q[\3\2\2\2q_\3\2\2\2qi\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\u0081\3"+
		"\2\2\2st\f\22\2\2tu\t\2\2\2u\u0080\5\4\3\23vw\f\21\2\2wx\t\3\2\2x\u0080"+
		"\5\4\3\22yz\f\20\2\2z{\t\4\2\2{\u0080\5\4\3\21|}\f\17\2\2}~\t\5\2\2~\u0080"+
		"\5\4\3\20\177s\3\2\2\2\177v\3\2\2\2\177y\3\2\2\2\177|\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\5\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0085\7\27\2\2\u0085\u0086\5\4\3\2\u0086\7\3\2\2\2\u0087"+
		"\u0088\b\5\1\2\u0088\u0089\5\4\3\2\u0089\u008f\3\2\2\2\u008a\u008b\f\3"+
		"\2\2\u008b\u008c\7\30\2\2\u008c\u008e\5\4\3\2\u008d\u008a\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\t\3\2\2\2"+
		"\u0091\u008f\3\2\2\2\u0092\u0093\b\6\1\2\u0093\u0094\5\4\3\2\u0094\u009a"+
		"\3\2\2\2\u0095\u0096\f\3\2\2\u0096\u0097\7\31\2\2\u0097\u0099\5\4\3\2"+
		"\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\13\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\b\7\1\2\u009e"+
		"\u009f\7A\2\2\u009f\u00a0\7\32\2\2\u00a0\u00a1\5\4\3\2\u00a1\u00a9\3\2"+
		"\2\2\u00a2\u00a3\f\3\2\2\u00a3\u00a4\7\31\2\2\u00a4\u00a5\7A\2\2\u00a5"+
		"\u00a6\7\32\2\2\u00a6\u00a8\5\4\3\2\u00a7\u00a2\3\2\2\2\u00a8\u00ab\3"+
		"\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\r\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00ad\b\b\1\2\u00ad\u00ae\7A\2\2\u00ae\u00b9\3\2\2\2\u00af"+
		"\u00b0\f\4\2\2\u00b0\u00b1\7\33\2\2\u00b1\u00b8\7A\2\2\u00b2\u00b3\f\3"+
		"\2\2\u00b3\u00b4\7\25\2\2\u00b4\u00b5\5\4\3\2\u00b5\u00b6\7\34\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b8\u00bb\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\17\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\u00bd\7A\2\2\u00bd\u00c1\7\21\2\2\u00be\u00c0\5\n\6\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\22\2\2\u00c5"+
		"\21\3\2\2\2\u00c6\u00c7\5\16\b\2\u00c7\u00c8\7\35\2\2\u00c8\u00c9\5\4"+
		"\3\2\u00c9\23\3\2\2\2\u00ca\u00cb\7\36\2\2\u00cb\u00cc\5\4\3\2\u00cc\u00cd"+
		"\7\37\2\2\u00cd\u00ce\5\4\3\2\u00ce\u00cf\7 \2\2\u00cf\u00d0\5\4\3\2\u00d0"+
		"\25\3\2\2\2\u00d1\u00d2\7\36\2\2\u00d2\u00d3\5\4\3\2\u00d3\u00d4\7\37"+
		"\2\2\u00d4\u00d5\5\4\3\2\u00d5\27\3\2\2\2\u00d6\u00d7\7!\2\2\u00d7\u00d8"+
		"\5\4\3\2\u00d8\u00d9\7\"\2\2\u00d9\u00da\5\4\3\2\u00da\31\3\2\2\2\u00db"+
		"\u00dc\7#\2\2\u00dc\u00dd\7A\2\2\u00dd\u00de\7\35\2\2\u00de\u00df\5\4"+
		"\3\2\u00df\u00e0\7$\2\2\u00e0\u00e1\5\4\3\2\u00e1\u00e2\7\"\2\2\u00e2"+
		"\u00e3\5\4\3\2\u00e3\33\3\2\2\2\u00e4\u00e5\7%\2\2\u00e5\u00e6\5\36\20"+
		"\2\u00e6\u00e7\7&\2\2\u00e7\u00e8\5\b\5\2\u00e8\u00e9\7\'\2\2\u00e9\35"+
		"\3\2\2\2\u00ea\u00eb\b\20\1\2\u00eb\u00ec\5 \21\2\u00ec\u00f1\3\2\2\2"+
		"\u00ed\u00ee\f\3\2\2\u00ee\u00f0\5 \21\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\37\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f8\5\"\22\2\u00f5\u00f8\5,\27\2\u00f6\u00f8\5"+
		".\30\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"!\3\2\2\2\u00f9\u00fa\7(\2\2\u00fa\u00fb\5*\26\2\u00fb\u00fc\7\32\2\2"+
		"\u00fc\u00fd\5$\23\2\u00fd#\3\2\2\2\u00fe\u010a\5*\26\2\u00ff\u0103\7"+
		"\23\2\2\u0100\u0102\5&\24\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u010a\7\24\2\2\u0107\u0108\7)\2\2\u0108\u010a\5*\26\2\u0109"+
		"\u00fe\3\2\2\2\u0109\u00ff\3\2\2\2\u0109\u0107\3\2\2\2\u010a%\3\2\2\2"+
		"\u010b\u010c\b\24\1\2\u010c\u010d\5(\25\2\u010d\u0113\3\2\2\2\u010e\u010f"+
		"\f\3\2\2\u010f\u0110\7*\2\2\u0110\u0112\5(\25\2\u0111\u010e\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\'\3\2\2\2"+
		"\u0115\u0113\3\2\2\2\u0116\u0117\7A\2\2\u0117\u0118\7+\2\2\u0118\u0119"+
		"\5*\26\2\u0119)\3\2\2\2\u011a\u011b\t\6\2\2\u011b+\3\2\2\2\u011c\u011d"+
		"\7\60\2\2\u011d\u011e\7A\2\2\u011e\u011f\7\35\2\2\u011f\u0128\5\4\3\2"+
		"\u0120\u0121\7\60\2\2\u0121\u0122\7A\2\2\u0122\u0123\7+\2\2\u0123\u0124"+
		"\5*\26\2\u0124\u0125\7\35\2\2\u0125\u0126\5\4\3\2\u0126\u0128\3\2\2\2"+
		"\u0127\u011c\3\2\2\2\u0127\u0120\3\2\2\2\u0128-\3\2\2\2\u0129\u012a\7"+
		"\61\2\2\u012a\u012b\7A\2\2\u012b\u012f\7\21\2\2\u012c\u012e\5&\24\2\u012d"+
		"\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7\62\2\2\u0133"+
		"\u0143\5\4\3\2\u0134\u0135\7\61\2\2\u0135\u0136\7A\2\2\u0136\u013a\7\21"+
		"\2\2\u0137\u0139\5&\24\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013d\u013e\7\63\2\2\u013e\u013f\5*\26\2\u013f\u0140\7\64\2\2\u0140"+
		"\u0141\5\4\3\2\u0141\u0143\3\2\2\2\u0142\u0129\3\2\2\2\u0142\u0134\3\2"+
		"\2\2\u0143/\3\2\2\2\u0144\u0152\5\62\32\2\u0145\u0152\5\64\33\2\u0146"+
		"\u0152\5\66\34\2\u0147\u0152\58\35\2\u0148\u0152\5:\36\2\u0149\u0152\5"+
		"<\37\2\u014a\u0152\5> \2\u014b\u0152\5@!\2\u014c\u0152\5B\"\2\u014d\u0152"+
		"\5D#\2\u014e\u0152\5F$\2\u014f\u0152\5\26\f\2\u0150\u0152\5\24\13\2\u0151"+
		"\u0144\3\2\2\2\u0151\u0145\3\2\2\2\u0151\u0146\3\2\2\2\u0151\u0147\3\2"+
		"\2\2\u0151\u0148\3\2\2\2\u0151\u0149\3\2\2\2\u0151\u014a\3\2\2\2\u0151"+
		"\u014b\3\2\2\2\u0151\u014c\3\2\2\2\u0151\u014d\3\2\2\2\u0151\u014e\3\2"+
		"\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152\61\3\2\2\2\u0153\u0154"+
		"\7\65\2\2\u0154\u0155\5\4\3\2\u0155\u0156\7\22\2\2\u0156\63\3\2\2\2\u0157"+
		"\u0158\7\66\2\2\u0158\u0159\5\4\3\2\u0159\u015a\7\22\2\2\u015a\65\3\2"+
		"\2\2\u015b\u015c\7\67\2\2\u015c\67\3\2\2\2\u015d\u015e\78\2\2\u015e\u015f"+
		"\5\4\3\2\u015f\u0160\7\22\2\2\u01609\3\2\2\2\u0161\u0162\79\2\2\u0162"+
		";\3\2\2\2\u0163\u0164\7:\2\2\u0164\u0165\5\4\3\2\u0165\u0166\7\22\2\2"+
		"\u0166=\3\2\2\2\u0167\u0168\7;\2\2\u0168\u0169\5\4\3\2\u0169\u016a\7<"+
		"\2\2\u016a\u016b\5\4\3\2\u016b\u016c\7<\2\2\u016c\u016d\5\4\3\2\u016d"+
		"\u016e\7\22\2\2\u016e?\3\2\2\2\u016f\u0170\7=\2\2\u0170\u0171\5\4\3\2"+
		"\u0171\u0172\7<\2\2\u0172\u0173\5\4\3\2\u0173\u0174\7\22\2\2\u0174A\3"+
		"\2\2\2\u0175\u0176\7>\2\2\u0176\u0177\5\4\3\2\u0177\u0178\7\22\2\2\u0178"+
		"C\3\2\2\2\u0179\u017a\7?\2\2\u017a\u017b\5\4\3\2\u017b\u017c\7\22\2\2"+
		"\u017cE\3\2\2\2\u017d\u017e\7@\2\2\u017e\u017f\5\4\3\2\u017f\u0180\7\22"+
		"\2\2\u0180G\3\2\2\2\u0181\u0183\7B\2\2\u0182\u0181\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185I\3\2\2\2\27dq\177"+
		"\u0081\u008f\u009a\u00a9\u00b7\u00b9\u00c1\u00f1\u00f7\u0103\u0109\u0113"+
		"\u0127\u012f\u013a\u0142\u0151\u0184";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}