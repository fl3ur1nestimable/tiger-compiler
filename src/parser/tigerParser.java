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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, BINARY=52, 
		IDF=53, INT=54, ESC=55, ESCAPE_SEQ=56, STRING=57, COMMENT=58, WS=59;
	public static final int
		RULE_program = 0, RULE_expr = 1, RULE_negation = 2, RULE_expr_seq = 3, 
		RULE_expr_list = 4, RULE_field_list = 5, RULE_lvalue = 6, RULE_functionCall = 7, 
		RULE_assignement = 8, RULE_ifthenelse = 9, RULE_ifthen = 10, RULE_whiledo = 11, 
		RULE_for_ = 12, RULE_let_in_end = 13, RULE_declaration_list = 14, RULE_declaration = 15, 
		RULE_type_declaration = 16, RULE_type = 17, RULE_type_fields = 18, RULE_type_field = 19, 
		RULE_type_IDF = 20, RULE_variable_declaration = 21, RULE_function_declaration = 22, 
		RULE_stdlib = 23, RULE_noreturn = 24, RULE_returnString = 25, RULE_returnInt = 26, 
		RULE_print_ = 27, RULE_printi = 28, RULE_flush_ = 29, RULE_exit_ = 30, 
		RULE_getchar_ = 31, RULE_chr_ = 32, RULE_substring_ = 33, RULE_concat_ = 34, 
		RULE_ord_ = 35, RULE_size_ = 36, RULE_not_ = 37, RULE_integer = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expr", "negation", "expr_seq", "expr_list", "field_list", 
			"lvalue", "functionCall", "assignement", "ifthenelse", "ifthen", "whiledo", 
			"for_", "let_in_end", "declaration_list", "declaration", "type_declaration", 
			"type", "type_fields", "type_field", "type_IDF", "variable_declaration", 
			"function_declaration", "stdlib", "noreturn", "returnString", "returnInt", 
			"print_", "printi", "flush_", "exit_", "getchar_", "chr_", "substring_", 
			"concat_", "ord_", "size_", "not_", "integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'nil'", "'break'", "'('", "')'", "'{'", "'}'", "' [ '", "' ] of '", 
			"'- '", "';'", "' , '", "' = '", "'.'", "'['", "']'", "':= '", "'if '", 
			"' then '", "'else '", "'while '", "'do'", "'for '", "' := '", "' to '", 
			"'let '", "' in '", "' end'", "'type '", "'array of '", "':'", "'int'", 
			"'string'", "'intArray'", "'stringArray'", "'var '", "' : '", "'function '", 
			"') ='", "') : '", "'print('", "'printi('", "'flush()'", "'exit('", "'getchar()'", 
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
			null, null, null, null, "BINARY", "IDF", "INT", "ESC", "ESCAPE_SEQ", 
			"STRING", "COMMENT", "WS"
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
			setState(78);
			expr(0);
			setState(79);
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
		public TerminalNode BINARY() { return getToken(tigerParser.BINARY, 0); }
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(82);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(83);
				integer();
				}
				break;
			case 3:
				{
				setState(84);
				match(T__0);
				}
				break;
			case 4:
				{
				setState(85);
				lvalue(0);
				}
				break;
			case 5:
				{
				setState(86);
				assignement();
				}
				break;
			case 6:
				{
				setState(87);
				negation();
				}
				break;
			case 7:
				{
				setState(88);
				assignement();
				}
				break;
			case 8:
				{
				setState(89);
				ifthenelse();
				}
				break;
			case 9:
				{
				setState(90);
				ifthen();
				}
				break;
			case 10:
				{
				setState(91);
				whiledo();
				}
				break;
			case 11:
				{
				setState(92);
				for_();
				}
				break;
			case 12:
				{
				setState(93);
				match(T__1);
				}
				break;
			case 13:
				{
				setState(94);
				functionCall();
				}
				break;
			case 14:
				{
				setState(95);
				match(T__2);
				setState(96);
				expr_seq(0);
				setState(97);
				match(T__3);
				}
				break;
			case 15:
				{
				setState(99);
				type_IDF();
				setState(100);
				match(T__4);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDF) {
					{
					{
					setState(101);
					field_list(0);
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(T__5);
				}
				break;
			case 16:
				{
				setState(109);
				type_IDF();
				setState(110);
				match(T__6);
				setState(111);
				expr(0);
				setState(112);
				match(T__7);
				setState(113);
				expr(3);
				}
				break;
			case 17:
				{
				setState(115);
				let_in_end();
				}
				break;
			case 18:
				{
				setState(116);
				stdlib();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(119);
					if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
					setState(120);
					match(BINARY);
					setState(121);
					expr(14);
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
			setState(127);
			match(T__8);
			setState(128);
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
			setState(131);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_seqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_seq);
					setState(133);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(134);
					match(T__9);
					setState(135);
					expr(0);
					}
					} 
				}
				setState(140);
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
			setState(142);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_list);
					setState(144);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(145);
					match(T__10);
					setState(146);
					expr(0);
					}
					} 
				}
				setState(151);
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
			setState(153);
			match(IDF);
			setState(154);
			match(T__11);
			setState(155);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Field_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_field_list);
					setState(157);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(158);
					match(T__10);
					setState(159);
					match(IDF);
					setState(160);
					match(T__11);
					setState(161);
					expr(0);
					}
					} 
				}
				setState(166);
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
			setState(168);
			match(IDF);
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(170);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(171);
						match(T__12);
						setState(172);
						match(IDF);
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(173);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(174);
						match(T__13);
						setState(175);
						expr(0);
						setState(176);
						match(T__14);
						}
						break;
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(183);
			match(IDF);
			setState(184);
			match(T__2);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__8) | (1L << T__16) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDF) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(185);
				expr_list(0);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(T__3);
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
			setState(193);
			lvalue(0);
			setState(194);
			match(T__15);
			setState(195);
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
			setState(197);
			match(T__16);
			setState(198);
			expr(0);
			setState(199);
			match(T__17);
			setState(200);
			expr(0);
			setState(201);
			match(T__18);
			setState(202);
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
			setState(204);
			match(T__16);
			setState(205);
			expr(0);
			setState(206);
			match(T__17);
			setState(207);
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
			setState(209);
			match(T__19);
			setState(210);
			expr(0);
			setState(211);
			match(T__20);
			setState(212);
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
			setState(214);
			match(T__21);
			setState(215);
			match(IDF);
			setState(216);
			match(T__22);
			setState(217);
			expr(0);
			setState(218);
			match(T__23);
			setState(219);
			expr(0);
			setState(220);
			match(T__20);
			setState(221);
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
			setState(223);
			match(T__24);
			setState(224);
			declaration_list(0);
			setState(225);
			match(T__25);
			setState(226);
			expr_seq(0);
			setState(227);
			match(T__26);
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
			setState(230);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Declaration_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declaration_list);
					setState(232);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(233);
					declaration();
					}
					} 
				}
				setState(238);
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
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				type_declaration();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				variable_declaration();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
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
			setState(244);
			match(T__27);
			setState(245);
			type_IDF();
			setState(246);
			match(T__11);
			setState(247);
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
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				type_IDF();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__4);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDF) {
					{
					{
					setState(251);
					type_fields(0);
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(T__5);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(T__28);
				setState(259);
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
			setState(263);
			type_field();
			}
			_ctx.stop = _input.LT(-1);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_fieldsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type_fields);
					setState(265);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(266);
					match(T__10);
					setState(267);
					type_field();
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
			setState(273);
			match(IDF);
			setState(274);
			match(T__29);
			setState(275);
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
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
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
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(T__34);
				setState(280);
				match(IDF);
				setState(281);
				match(T__22);
				setState(282);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(T__34);
				setState(284);
				match(IDF);
				setState(285);
				match(T__35);
				setState(286);
				type_IDF();
				setState(287);
				match(T__22);
				setState(288);
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
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(T__36);
				setState(293);
				match(IDF);
				setState(294);
				match(T__2);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDF) {
					{
					{
					setState(295);
					type_fields(0);
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(301);
				match(T__37);
				setState(302);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(T__36);
				setState(304);
				match(IDF);
				setState(305);
				match(T__2);
				setState(306);
				type_fields(0);
				setState(307);
				match(T__38);
				setState(308);
				type_IDF();
				setState(309);
				match(T__11);
				setState(310);
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
		public NoreturnContext noreturn() {
			return getRuleContext(NoreturnContext.class,0);
		}
		public ReturnStringContext returnString() {
			return getRuleContext(ReturnStringContext.class,0);
		}
		public ReturnIntContext returnInt() {
			return getRuleContext(ReturnIntContext.class,0);
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
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
			case T__41:
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				noreturn();
				}
				break;
			case T__43:
			case T__44:
			case T__45:
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				returnString();
				}
				break;
			case T__16:
			case T__48:
			case T__49:
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				returnInt();
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

	public static class NoreturnContext extends ParserRuleContext {
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
		public NoreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noreturn; }
	}

	public final NoreturnContext noreturn() throws RecognitionException {
		NoreturnContext _localctx = new NoreturnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_noreturn);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				print_();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				printi();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				flush_();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				exit_();
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

	public static class ReturnStringContext extends ParserRuleContext {
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
		public ReturnStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnString; }
	}

	public final ReturnStringContext returnString() throws RecognitionException {
		ReturnStringContext _localctx = new ReturnStringContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnString);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				getchar_();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				chr_();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				substring_();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				concat_();
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

	public static class ReturnIntContext extends ParserRuleContext {
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
		public ReturnIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnInt; }
	}

	public final ReturnIntContext returnInt() throws RecognitionException {
		ReturnIntContext _localctx = new ReturnIntContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_returnInt);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				ord_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				size_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				not_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				ifthen();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
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
		public TerminalNode STRING() { return getToken(tigerParser.STRING, 0); }
		public ReturnStringContext returnString() {
			return getRuleContext(ReturnStringContext.class,0);
		}
		public Print_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_; }
	}

	public final Print_Context print_() throws RecognitionException {
		Print_Context _localctx = new Print_Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_print_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__39);
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(339);
				match(STRING);
				}
				break;
			case T__43:
			case T__44:
			case T__45:
			case T__47:
				{
				setState(340);
				returnString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(343);
			match(T__3);
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ReturnIntContext returnInt() {
			return getRuleContext(ReturnIntContext.class,0);
		}
		public PrintiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printi; }
	}

	public final PrintiContext printi() throws RecognitionException {
		PrintiContext _localctx = new PrintiContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_printi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__40);
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(346);
				integer();
				}
				break;
			case T__16:
			case T__48:
			case T__49:
			case T__50:
				{
				setState(347);
				returnInt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(350);
			match(T__3);
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
		enterRule(_localctx, 58, RULE_flush_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__41);
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ReturnIntContext returnInt() {
			return getRuleContext(ReturnIntContext.class,0);
		}
		public Exit_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_; }
	}

	public final Exit_Context exit_() throws RecognitionException {
		Exit_Context _localctx = new Exit_Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_exit_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__42);
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(355);
				integer();
				}
				break;
			case T__16:
			case T__48:
			case T__49:
			case T__50:
				{
				setState(356);
				returnInt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(359);
			match(T__3);
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
		enterRule(_localctx, 62, RULE_getchar_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__43);
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ReturnIntContext returnInt() {
			return getRuleContext(ReturnIntContext.class,0);
		}
		public Chr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chr_; }
	}

	public final Chr_Context chr_() throws RecognitionException {
		Chr_Context _localctx = new Chr_Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_chr_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__44);
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(364);
				integer();
				}
				break;
			case T__16:
			case T__48:
			case T__49:
			case T__50:
				{
				setState(365);
				returnInt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(368);
			match(T__3);
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
		public TerminalNode STRING() { return getToken(tigerParser.STRING, 0); }
		public ReturnStringContext returnString() {
			return getRuleContext(ReturnStringContext.class,0);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<ReturnIntContext> returnInt() {
			return getRuleContexts(ReturnIntContext.class);
		}
		public ReturnIntContext returnInt(int i) {
			return getRuleContext(ReturnIntContext.class,i);
		}
		public Substring_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substring_; }
	}

	public final Substring_Context substring_() throws RecognitionException {
		Substring_Context _localctx = new Substring_Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_substring_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__45);
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(371);
				match(STRING);
				}
				break;
			case T__43:
			case T__44:
			case T__45:
			case T__47:
				{
				setState(372);
				returnString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(375);
			match(T__46);
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(376);
				integer();
				}
				break;
			case T__16:
			case T__48:
			case T__49:
			case T__50:
				{
				setState(377);
				returnInt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(380);
			match(T__46);
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(381);
				integer();
				}
				break;
			case T__16:
			case T__48:
			case T__49:
			case T__50:
				{
				setState(382);
				returnInt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(385);
			match(T__3);
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
		public List<TerminalNode> STRING() { return getTokens(tigerParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(tigerParser.STRING, i);
		}
		public List<ReturnStringContext> returnString() {
			return getRuleContexts(ReturnStringContext.class);
		}
		public ReturnStringContext returnString(int i) {
			return getRuleContext(ReturnStringContext.class,i);
		}
		public Concat_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat_; }
	}

	public final Concat_Context concat_() throws RecognitionException {
		Concat_Context _localctx = new Concat_Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_concat_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__47);
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(388);
				match(STRING);
				}
				break;
			case T__43:
			case T__44:
			case T__45:
			case T__47:
				{
				setState(389);
				returnString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(392);
			match(T__46);
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(393);
				match(STRING);
				}
				break;
			case T__43:
			case T__44:
			case T__45:
			case T__47:
				{
				setState(394);
				returnString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(397);
			match(T__3);
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
		public TerminalNode STRING() { return getToken(tigerParser.STRING, 0); }
		public ReturnStringContext returnString() {
			return getRuleContext(ReturnStringContext.class,0);
		}
		public Ord_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ord_; }
	}

	public final Ord_Context ord_() throws RecognitionException {
		Ord_Context _localctx = new Ord_Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_ord_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(T__48);
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(400);
				match(STRING);
				}
				break;
			case T__43:
			case T__44:
			case T__45:
			case T__47:
				{
				setState(401);
				returnString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(404);
			match(T__3);
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
		public TerminalNode STRING() { return getToken(tigerParser.STRING, 0); }
		public ReturnStringContext returnString() {
			return getRuleContext(ReturnStringContext.class,0);
		}
		public Size_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size_; }
	}

	public final Size_Context size_() throws RecognitionException {
		Size_Context _localctx = new Size_Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_size_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(T__49);
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(407);
				match(STRING);
				}
				break;
			case T__43:
			case T__44:
			case T__45:
			case T__47:
				{
				setState(408);
				returnString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(411);
			match(T__3);
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ReturnIntContext returnInt() {
			return getRuleContext(ReturnIntContext.class,0);
		}
		public Not_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_; }
	}

	public final Not_Context not_() throws RecognitionException {
		Not_Context _localctx = new Not_Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_not_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(T__50);
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(414);
				integer();
				}
				break;
			case T__16:
			case T__48:
			case T__49:
			case T__50:
				{
				setState(415);
				returnInt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(418);
			match(T__3);
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
		enterRule(_localctx, 76, RULE_integer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(420);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(423); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean expr_seq_sempred(Expr_seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_list_sempred(Expr_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean field_list_sempred(Field_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declaration_list_sempred(Declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_fields_sempred(Type_fieldsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3i\n\3\f\3\16\3l\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3x\n\3\3\3\3\3\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5\u008b\n\5\f\5\16\5\u008e\13\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6\u0096\n\6\f\6\16\6\u0099\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7\u00a5\n\7\f\7\16\7\u00a8\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b\u00b5\n\b\f\b\16\b\u00b8\13\b\3\t\3\t\3\t\7\t\u00bd"+
		"\n\t\f\t\16\t\u00c0\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\7\20\u00ed\n\20\f\20\16\20\u00f0\13\20\3\21\3\21\3\21\5"+
		"\21\u00f5\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u00ff\n\23"+
		"\f\23\16\23\u0102\13\23\3\23\3\23\3\23\5\23\u0107\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u010f\n\24\f\24\16\24\u0112\13\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0125\n\27\3\30\3\30\3\30\3\30\7\30\u012b\n\30\f\30\16\30\u012e"+
		"\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013b"+
		"\n\30\3\31\3\31\3\31\5\31\u0140\n\31\3\32\3\32\3\32\3\32\5\32\u0146\n"+
		"\32\3\33\3\33\3\33\3\33\5\33\u014c\n\33\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0153\n\34\3\35\3\35\3\35\5\35\u0158\n\35\3\35\3\35\3\36\3\36\3\36\5"+
		"\36\u015f\n\36\3\36\3\36\3\37\3\37\3 \3 \3 \5 \u0168\n \3 \3 \3!\3!\3"+
		"\"\3\"\3\"\5\"\u0171\n\"\3\"\3\"\3#\3#\3#\5#\u0178\n#\3#\3#\3#\5#\u017d"+
		"\n#\3#\3#\3#\5#\u0182\n#\3#\3#\3$\3$\3$\5$\u0189\n$\3$\3$\3$\5$\u018e"+
		"\n$\3$\3$\3%\3%\3%\5%\u0195\n%\3%\3%\3&\3&\3&\5&\u019c\n&\3&\3&\3\'\3"+
		"\'\3\'\5\'\u01a3\n\'\3\'\3\'\3(\6(\u01a8\n(\r(\16(\u01a9\3(\2\t\4\b\n"+
		"\f\16\36&)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLN\2\3\3\2!$\2\u01c0\2P\3\2\2\2\4w\3\2\2\2\6\u0081\3\2\2\2\b"+
		"\u0084\3\2\2\2\n\u008f\3\2\2\2\f\u009a\3\2\2\2\16\u00a9\3\2\2\2\20\u00b9"+
		"\3\2\2\2\22\u00c3\3\2\2\2\24\u00c7\3\2\2\2\26\u00ce\3\2\2\2\30\u00d3\3"+
		"\2\2\2\32\u00d8\3\2\2\2\34\u00e1\3\2\2\2\36\u00e7\3\2\2\2 \u00f4\3\2\2"+
		"\2\"\u00f6\3\2\2\2$\u0106\3\2\2\2&\u0108\3\2\2\2(\u0113\3\2\2\2*\u0117"+
		"\3\2\2\2,\u0124\3\2\2\2.\u013a\3\2\2\2\60\u013f\3\2\2\2\62\u0145\3\2\2"+
		"\2\64\u014b\3\2\2\2\66\u0152\3\2\2\28\u0154\3\2\2\2:\u015b\3\2\2\2<\u0162"+
		"\3\2\2\2>\u0164\3\2\2\2@\u016b\3\2\2\2B\u016d\3\2\2\2D\u0174\3\2\2\2F"+
		"\u0185\3\2\2\2H\u0191\3\2\2\2J\u0198\3\2\2\2L\u019f\3\2\2\2N\u01a7\3\2"+
		"\2\2PQ\5\4\3\2QR\7\2\2\3R\3\3\2\2\2ST\b\3\1\2Tx\7;\2\2Ux\5N(\2Vx\7\3\2"+
		"\2Wx\5\16\b\2Xx\5\22\n\2Yx\5\6\4\2Zx\5\22\n\2[x\5\24\13\2\\x\5\26\f\2"+
		"]x\5\30\r\2^x\5\32\16\2_x\7\4\2\2`x\5\20\t\2ab\7\5\2\2bc\5\b\5\2cd\7\6"+
		"\2\2dx\3\2\2\2ef\5*\26\2fj\7\7\2\2gi\5\f\7\2hg\3\2\2\2il\3\2\2\2jh\3\2"+
		"\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\b\2\2nx\3\2\2\2op\5*\26\2pq\7\t"+
		"\2\2qr\5\4\3\2rs\7\n\2\2st\5\4\3\5tx\3\2\2\2ux\5\34\17\2vx\5\60\31\2w"+
		"S\3\2\2\2wU\3\2\2\2wV\3\2\2\2wW\3\2\2\2wX\3\2\2\2wY\3\2\2\2wZ\3\2\2\2"+
		"w[\3\2\2\2w\\\3\2\2\2w]\3\2\2\2w^\3\2\2\2w_\3\2\2\2w`\3\2\2\2wa\3\2\2"+
		"\2we\3\2\2\2wo\3\2\2\2wu\3\2\2\2wv\3\2\2\2x~\3\2\2\2yz\f\17\2\2z{\7\66"+
		"\2\2{}\5\4\3\20|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\5"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\13\2\2\u0082\u0083\5\4\3\2\u0083"+
		"\7\3\2\2\2\u0084\u0085\b\5\1\2\u0085\u0086\5\4\3\2\u0086\u008c\3\2\2\2"+
		"\u0087\u0088\f\3\2\2\u0088\u0089\7\f\2\2\u0089\u008b\5\4\3\2\u008a\u0087"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\t\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\b\6\1\2\u0090\u0091\5\4\3\2"+
		"\u0091\u0097\3\2\2\2\u0092\u0093\f\3\2\2\u0093\u0094\7\r\2\2\u0094\u0096"+
		"\5\4\3\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\13\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\b\7\1"+
		"\2\u009b\u009c\7\67\2\2\u009c\u009d\7\16\2\2\u009d\u009e\5\4\3\2\u009e"+
		"\u00a6\3\2\2\2\u009f\u00a0\f\3\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a2\7\67"+
		"\2\2\u00a2\u00a3\7\16\2\2\u00a3\u00a5\5\4\3\2\u00a4\u009f\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\r\3\2\2\2"+
		"\u00a8\u00a6\3\2\2\2\u00a9\u00aa\b\b\1\2\u00aa\u00ab\7\67\2\2\u00ab\u00b6"+
		"\3\2\2\2\u00ac\u00ad\f\4\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00b5\7\67\2\2"+
		"\u00af\u00b0\f\3\2\2\u00b0\u00b1\7\20\2\2\u00b1\u00b2\5\4\3\2\u00b2\u00b3"+
		"\7\21\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00af\3\2\2\2"+
		"\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\17"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7\67\2\2\u00ba\u00be\7\5\2\2"+
		"\u00bb\u00bd\5\n\6\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c2\7\6\2\2\u00c2\21\3\2\2\2\u00c3\u00c4\5\16\b\2\u00c4\u00c5\7\22"+
		"\2\2\u00c5\u00c6\5\4\3\2\u00c6\23\3\2\2\2\u00c7\u00c8\7\23\2\2\u00c8\u00c9"+
		"\5\4\3\2\u00c9\u00ca\7\24\2\2\u00ca\u00cb\5\4\3\2\u00cb\u00cc\7\25\2\2"+
		"\u00cc\u00cd\5\4\3\2\u00cd\25\3\2\2\2\u00ce\u00cf\7\23\2\2\u00cf\u00d0"+
		"\5\4\3\2\u00d0\u00d1\7\24\2\2\u00d1\u00d2\5\4\3\2\u00d2\27\3\2\2\2\u00d3"+
		"\u00d4\7\26\2\2\u00d4\u00d5\5\4\3\2\u00d5\u00d6\7\27\2\2\u00d6\u00d7\5"+
		"\4\3\2\u00d7\31\3\2\2\2\u00d8\u00d9\7\30\2\2\u00d9\u00da\7\67\2\2\u00da"+
		"\u00db\7\31\2\2\u00db\u00dc\5\4\3\2\u00dc\u00dd\7\32\2\2\u00dd\u00de\5"+
		"\4\3\2\u00de\u00df\7\27\2\2\u00df\u00e0\5\4\3\2\u00e0\33\3\2\2\2\u00e1"+
		"\u00e2\7\33\2\2\u00e2\u00e3\5\36\20\2\u00e3\u00e4\7\34\2\2\u00e4\u00e5"+
		"\5\b\5\2\u00e5\u00e6\7\35\2\2\u00e6\35\3\2\2\2\u00e7\u00e8\b\20\1\2\u00e8"+
		"\u00e9\5 \21\2\u00e9\u00ee\3\2\2\2\u00ea\u00eb\f\3\2\2\u00eb\u00ed\5 "+
		"\21\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\37\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f5\5\"\22"+
		"\2\u00f2\u00f5\5,\27\2\u00f3\u00f5\5.\30\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5!\3\2\2\2\u00f6\u00f7\7\36\2\2\u00f7"+
		"\u00f8\5*\26\2\u00f8\u00f9\7\16\2\2\u00f9\u00fa\5$\23\2\u00fa#\3\2\2\2"+
		"\u00fb\u0107\5*\26\2\u00fc\u0100\7\7\2\2\u00fd\u00ff\5&\24\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0107\7\b\2\2\u0104\u0105\7\37"+
		"\2\2\u0105\u0107\5*\26\2\u0106\u00fb\3\2\2\2\u0106\u00fc\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107%\3\2\2\2\u0108\u0109\b\24\1\2\u0109\u010a\5(\25\2"+
		"\u010a\u0110\3\2\2\2\u010b\u010c\f\3\2\2\u010c\u010d\7\r\2\2\u010d\u010f"+
		"\5(\25\2\u010e\u010b\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\'\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\67\2"+
		"\2\u0114\u0115\7 \2\2\u0115\u0116\5*\26\2\u0116)\3\2\2\2\u0117\u0118\t"+
		"\2\2\2\u0118+\3\2\2\2\u0119\u011a\7%\2\2\u011a\u011b\7\67\2\2\u011b\u011c"+
		"\7\31\2\2\u011c\u0125\5\4\3\2\u011d\u011e\7%\2\2\u011e\u011f\7\67\2\2"+
		"\u011f\u0120\7&\2\2\u0120\u0121\5*\26\2\u0121\u0122\7\31\2\2\u0122\u0123"+
		"\5\4\3\2\u0123\u0125\3\2\2\2\u0124\u0119\3\2\2\2\u0124\u011d\3\2\2\2\u0125"+
		"-\3\2\2\2\u0126\u0127\7\'\2\2\u0127\u0128\7\67\2\2\u0128\u012c\7\5\2\2"+
		"\u0129\u012b\5&\24\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f"+
		"\u0130\7(\2\2\u0130\u013b\5\4\3\2\u0131\u0132\7\'\2\2\u0132\u0133\7\67"+
		"\2\2\u0133\u0134\7\5\2\2\u0134\u0135\5&\24\2\u0135\u0136\7)\2\2\u0136"+
		"\u0137\5*\26\2\u0137\u0138\7\16\2\2\u0138\u0139\5\4\3\2\u0139\u013b\3"+
		"\2\2\2\u013a\u0126\3\2\2\2\u013a\u0131\3\2\2\2\u013b/\3\2\2\2\u013c\u0140"+
		"\5\62\32\2\u013d\u0140\5\64\33\2\u013e\u0140\5\66\34\2\u013f\u013c\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\61\3\2\2\2\u0141\u0146"+
		"\58\35\2\u0142\u0146\5:\36\2\u0143\u0146\5<\37\2\u0144\u0146\5> \2\u0145"+
		"\u0141\3\2\2\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2"+
		"\2\2\u0146\63\3\2\2\2\u0147\u014c\5@!\2\u0148\u014c\5B\"\2\u0149\u014c"+
		"\5D#\2\u014a\u014c\5F$\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\65\3\2\2\2\u014d\u0153\5H%\2"+
		"\u014e\u0153\5J&\2\u014f\u0153\5L\'\2\u0150\u0153\5\26\f\2\u0151\u0153"+
		"\5\24\13\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2\2\2\u0152\u014f\3\2\2\2"+
		"\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\67\3\2\2\2\u0154\u0157"+
		"\7*\2\2\u0155\u0158\7;\2\2\u0156\u0158\5\64\33\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7\6\2\2\u015a9\3\2\2\2"+
		"\u015b\u015e\7+\2\2\u015c\u015f\5N(\2\u015d\u015f\5\66\34\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\7\6\2\2\u0161"+
		";\3\2\2\2\u0162\u0163\7,\2\2\u0163=\3\2\2\2\u0164\u0167\7-\2\2\u0165\u0168"+
		"\5N(\2\u0166\u0168\5\66\34\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016a\7\6\2\2\u016a?\3\2\2\2\u016b\u016c\7.\2\2\u016c"+
		"A\3\2\2\2\u016d\u0170\7/\2\2\u016e\u0171\5N(\2\u016f\u0171\5\66\34\2\u0170"+
		"\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7\6"+
		"\2\2\u0173C\3\2\2\2\u0174\u0177\7\60\2\2\u0175\u0178\7;\2\2\u0176\u0178"+
		"\5\64\33\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2"+
		"\u0179\u017c\7\61\2\2\u017a\u017d\5N(\2\u017b\u017d\5\66\34\2\u017c\u017a"+
		"\3\2\2\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0181\7\61\2\2"+
		"\u017f\u0182\5N(\2\u0180\u0182\5\66\34\2\u0181\u017f\3\2\2\2\u0181\u0180"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\7\6\2\2\u0184E\3\2\2\2\u0185"+
		"\u0188\7\62\2\2\u0186\u0189\7;\2\2\u0187\u0189\5\64\33\2\u0188\u0186\3"+
		"\2\2\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018d\7\61\2\2\u018b"+
		"\u018e\7;\2\2\u018c\u018e\5\64\33\2\u018d\u018b\3\2\2\2\u018d\u018c\3"+
		"\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\7\6\2\2\u0190G\3\2\2\2\u0191\u0194"+
		"\7\63\2\2\u0192\u0195\7;\2\2\u0193\u0195\5\64\33\2\u0194\u0192\3\2\2\2"+
		"\u0194\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\7\6\2\2\u0197I\3"+
		"\2\2\2\u0198\u019b\7\64\2\2\u0199\u019c\7;\2\2\u019a\u019c\5\64\33\2\u019b"+
		"\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7\6"+
		"\2\2\u019eK\3\2\2\2\u019f\u01a2\7\65\2\2\u01a0\u01a3\5N(\2\u01a1\u01a3"+
		"\5\66\34\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2"+
		"\u01a4\u01a5\7\6\2\2\u01a5M\3\2\2\2\u01a6\u01a8\78\2\2\u01a7\u01a6\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"O\3\2\2\2$jw~\u008c\u0097\u00a6\u00b4\u00b6\u00be\u00ee\u00f4\u0100\u0106"+
		"\u0110\u0124\u012c\u013a\u013f\u0145\u014b\u0152\u0157\u015e\u0167\u0170"+
		"\u0177\u017c\u0181\u0188\u018d\u0194\u019b\u01a2\u01a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}