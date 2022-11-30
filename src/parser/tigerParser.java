// Generated from ./tiger.g by ANTLR 4.9.2

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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, IDF=52, INT=53, 
		STRING=54, COMMENT=55, WS=56;
	public static final int
		RULE_program = 0, RULE_expr = 1, RULE_or = 2, RULE_and = 3, RULE_compare = 4, 
		RULE_plus = 5, RULE_mult = 6, RULE_value = 7, RULE_negation = 8, RULE_expr_seq = 9, 
		RULE_expr_list = 10, RULE_field_list = 11, RULE_lvalue = 12, RULE_functionCall = 13, 
		RULE_assignement = 14, RULE_ifthenelse = 15, RULE_whiledo = 16, RULE_for_ = 17, 
		RULE_let_in_end = 18, RULE_declaration_list = 19, RULE_declaration = 20, 
		RULE_type_declaration = 21, RULE_type = 22, RULE_type_fields = 23, RULE_type_field = 24, 
		RULE_type_IDF = 25, RULE_variable_declaration = 26, RULE_function_declaration = 27, 
		RULE_stdlib = 28, RULE_print_ = 29, RULE_printi = 30, RULE_flush_ = 31, 
		RULE_exit_ = 32, RULE_getchar_ = 33, RULE_chr_ = 34, RULE_substring_ = 35, 
		RULE_concat_ = 36, RULE_ord_ = 37, RULE_size_ = 38, RULE_not_ = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expr", "or", "and", "compare", "plus", "mult", "value", "negation", 
			"expr_seq", "expr_list", "field_list", "lvalue", "functionCall", "assignement", 
			"ifthenelse", "whiledo", "for_", "let_in_end", "declaration_list", "declaration", 
			"type_declaration", "type", "type_fields", "type_field", "type_IDF", 
			"variable_declaration", "function_declaration", "stdlib", "print_", "printi", 
			"flush_", "exit_", "getchar_", "chr_", "substring_", "concat_", "ord_", 
			"size_", "not_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'&'", "'<>'", "'='", "'>='", "'<='", "'>'", "'<'", "'+'", 
			"'-'", "'*'", "'/'", "'nil'", "'break'", "'('", "')'", "'{'", "'}'", 
			"'['", "'] of '", "';'", "','", "'.'", "']'", "':='", "'if '", "'then'", 
			"'else'", "'while'", "'do'", "'for'", "'to'", "'let'", "'in'", "'end'", 
			"'type '", "'array of '", "':'", "'var '", "'function'", "'print('", 
			"'printi('", "'flush()'", "'exit('", "'getchar()'", "'chr('", "'substring('", 
			"'concat('", "'ord('", "'size('", "'not('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "IDF", "INT", "STRING", "COMMENT", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			expr();
			setState(81);
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
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			or();
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

	public static class OrContext extends ParserRuleContext {
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_or);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			and();
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					match(T__0);
					setState(87);
					and();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class AndContext extends ParserRuleContext {
		public List<CompareContext> compare() {
			return getRuleContexts(CompareContext.class);
		}
		public CompareContext compare(int i) {
			return getRuleContext(CompareContext.class,i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_and);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			compare();
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					match(T__1);
					setState(95);
					compare();
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class CompareContext extends ParserRuleContext {
		public List<PlusContext> plus() {
			return getRuleContexts(PlusContext.class);
		}
		public PlusContext plus(int i) {
			return getRuleContext(PlusContext.class,i);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compare);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			plus();
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(103);
					plus();
					}
					} 
				}
				setState(108);
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
			exitRule();
		}
		return _localctx;
	}

	public static class PlusContext extends ParserRuleContext {
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_plus);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			mult();
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					_la = _input.LA(1);
					if ( !(_la==T__8 || _la==T__9) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(111);
					mult();
					}
					} 
				}
				setState(116);
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
			exitRule();
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mult);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			value();
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118);
					_la = _input.LA(1);
					if ( !(_la==T__10 || _la==T__11) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(119);
					value();
					}
					} 
				}
				setState(124);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(tigerParser.STRING, 0); }
		public TerminalNode INT() { return getToken(tigerParser.INT, 0); }
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public Let_in_endContext let_in_end() {
			return getRuleContext(Let_in_endContext.class,0);
		}
		public StdlibContext stdlib() {
			return getRuleContext(StdlibContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				lvalue(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				assignement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				negation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
				ifthenelse();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(132);
				whiledo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(133);
				for_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(134);
				match(T__13);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(135);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(136);
				match(T__14);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__25) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDF) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					setState(137);
					expr_seq(0);
					}
				}

				setState(140);
				match(T__15);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(141);
				type_IDF();
				setState(152);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(142);
					match(T__16);
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDF) {
						{
						setState(143);
						field_list(0);
						}
					}

					setState(146);
					match(T__17);
					}
					break;
				case T__18:
					{
					setState(147);
					match(T__18);
					setState(148);
					expr();
					setState(149);
					match(T__19);
					setState(150);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(154);
				let_in_end();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(155);
				stdlib();
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

	public static class NegationContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__9);
			setState(159);
			expr();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitExpr_seq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_seqContext expr_seq() throws RecognitionException {
		return expr_seq(0);
	}

	private Expr_seqContext expr_seq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_seqContext _localctx = new Expr_seqContext(_ctx, _parentState);
		Expr_seqContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr_seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(162);
			expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_seqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_seq);
					setState(164);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(165);
					match(T__20);
					setState(166);
					expr();
					}
					} 
				}
				setState(171);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		return expr_list(0);
	}

	private Expr_listContext expr_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_listContext _localctx = new Expr_listContext(_ctx, _parentState);
		Expr_listContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(173);
			expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_list);
					setState(175);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(176);
					match(T__21);
					setState(177);
					expr();
					}
					} 
				}
				setState(182);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitField_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_listContext field_list() throws RecognitionException {
		return field_list(0);
	}

	private Field_listContext field_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Field_listContext _localctx = new Field_listContext(_ctx, _parentState);
		Field_listContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_field_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(184);
			match(IDF);
			setState(185);
			match(T__3);
			setState(186);
			expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Field_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_field_list);
					setState(188);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(189);
					match(T__21);
					setState(190);
					match(IDF);
					setState(191);
					match(T__3);
					setState(192);
					expr();
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(199);
			match(IDF);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(201);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(202);
						match(T__22);
						setState(203);
						match(IDF);
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(204);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(205);
						match(T__18);
						setState(206);
						expr();
						setState(207);
						match(T__23);
						}
						break;
					}
					} 
				}
				setState(213);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(IDF);
			setState(215);
			match(T__14);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__25) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDF) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(216);
				expr_list(0);
				}
			}

			setState(219);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitAssignement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignementContext assignement() throws RecognitionException {
		AssignementContext _localctx = new AssignementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			lvalue(0);
			setState(222);
			match(T__24);
			setState(223);
			expr();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitIfthenelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfthenelseContext ifthenelse() throws RecognitionException {
		IfthenelseContext _localctx = new IfthenelseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifthenelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__25);
			setState(226);
			expr();
			setState(227);
			match(T__26);
			setState(228);
			expr();
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(229);
				match(T__27);
				setState(230);
				expr();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitWhiledo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhiledoContext whiledo() throws RecognitionException {
		WhiledoContext _localctx = new WhiledoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whiledo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__28);
			setState(234);
			expr();
			setState(235);
			match(T__29);
			setState(236);
			expr();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitFor_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_Context for_() throws RecognitionException {
		For_Context _localctx = new For_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__30);
			setState(239);
			match(IDF);
			setState(240);
			match(T__24);
			setState(241);
			expr();
			setState(242);
			match(T__31);
			setState(243);
			expr();
			setState(244);
			match(T__29);
			setState(245);
			expr();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitLet_in_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_in_endContext let_in_end() throws RecognitionException {
		Let_in_endContext _localctx = new Let_in_endContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_let_in_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__32);
			setState(248);
			declaration_list(0);
			setState(249);
			match(T__33);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__25) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDF) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(250);
				expr_seq(0);
				}
			}

			setState(253);
			match(T__34);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitDeclaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		return declaration_list(0);
	}

	private Declaration_listContext declaration_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, _parentState);
		Declaration_listContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_declaration_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(256);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Declaration_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declaration_list);
					setState(258);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(259);
					declaration();
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaration);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				type_declaration();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				variable_declaration();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitType_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__35);
			setState(271);
			type_IDF();
			setState(272);
			match(T__3);
			setState(273);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				type_IDF();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__16);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDF) {
					{
					{
					setState(277);
					type_fields(0);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				match(T__17);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(T__36);
				setState(285);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitType_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_fieldsContext type_fields() throws RecognitionException {
		return type_fields(0);
	}

	private Type_fieldsContext type_fields(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_fieldsContext _localctx = new Type_fieldsContext(_ctx, _parentState);
		Type_fieldsContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_type_fields, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(289);
			type_field();
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_fieldsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type_fields);
					setState(291);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(292);
					match(T__21);
					setState(293);
					type_field();
					}
					} 
				}
				setState(298);
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

	public static class Type_fieldContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
		public Type_IDFContext type_IDF() {
			return getRuleContext(Type_IDFContext.class,0);
		}
		public Type_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitType_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_fieldContext type_field() throws RecognitionException {
		Type_fieldContext _localctx = new Type_fieldContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(IDF);
			setState(300);
			match(T__37);
			setState(301);
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
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
		public Type_IDFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_IDF; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitType_IDF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_IDFContext type_IDF() throws RecognitionException {
		Type_IDFContext _localctx = new Type_IDFContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type_IDF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IDF);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variable_declaration);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(T__38);
				setState(306);
				match(IDF);
				setState(307);
				match(T__24);
				setState(308);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(T__38);
				setState(310);
				match(IDF);
				setState(311);
				match(T__37);
				setState(312);
				type_IDF();
				setState(313);
				match(T__24);
				setState(314);
				expr();
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
		public Type_fieldsContext type_fields() {
			return getRuleContext(Type_fieldsContext.class,0);
		}
		public Type_IDFContext type_IDF() {
			return getRuleContext(Type_IDFContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(T__39);
			setState(319);
			match(IDF);
			setState(320);
			match(T__14);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDF) {
				{
				setState(321);
				type_fields(0);
				}
			}

			setState(324);
			match(T__15);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(325);
				match(T__37);
				setState(326);
				type_IDF();
				}
			}

			setState(329);
			match(T__3);
			setState(330);
			expr();
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
		public StdlibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdlib; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitStdlib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StdlibContext stdlib() throws RecognitionException {
		StdlibContext _localctx = new StdlibContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stdlib);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				print_();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				printi();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				flush_();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				exit_();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				getchar_();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
				chr_();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 7);
				{
				setState(338);
				substring_();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 8);
				{
				setState(339);
				concat_();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 9);
				{
				setState(340);
				ord_();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 10);
				{
				setState(341);
				size_();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 11);
				{
				setState(342);
				not_();
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

	public static class Print_Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitPrint_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_Context print_() throws RecognitionException {
		Print_Context _localctx = new Print_Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_print_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__40);
			setState(346);
			expr();
			setState(347);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitPrinti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintiContext printi() throws RecognitionException {
		PrintiContext _localctx = new PrintiContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_printi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__41);
			setState(350);
			expr();
			setState(351);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitFlush_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flush_Context flush_() throws RecognitionException {
		Flush_Context _localctx = new Flush_Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_flush_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__42);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitExit_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_Context exit_() throws RecognitionException {
		Exit_Context _localctx = new Exit_Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_exit_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__43);
			setState(356);
			expr();
			setState(357);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitGetchar_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getchar_Context getchar_() throws RecognitionException {
		Getchar_Context _localctx = new Getchar_Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_getchar_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__44);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitChr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chr_Context chr_() throws RecognitionException {
		Chr_Context _localctx = new Chr_Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_chr_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__45);
			setState(362);
			expr();
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

	public static class Substring_Context extends ParserRuleContext {
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Substring_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substring_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitSubstring_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Substring_Context substring_() throws RecognitionException {
		Substring_Context _localctx = new Substring_Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_substring_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__46);
			setState(366);
			expr_list(0);
			setState(367);
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
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Concat_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitConcat_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concat_Context concat_() throws RecognitionException {
		Concat_Context _localctx = new Concat_Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_concat_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__47);
			setState(370);
			expr_list(0);
			setState(371);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitOrd_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ord_Context ord_() throws RecognitionException {
		Ord_Context _localctx = new Ord_Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_ord_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(T__48);
			setState(374);
			expr();
			setState(375);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitSize_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Size_Context size_() throws RecognitionException {
		Size_Context _localctx = new Size_Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_size_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__49);
			setState(378);
			expr();
			setState(379);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitNot_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_Context not_() throws RecognitionException {
		Not_Context _localctx = new Not_Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_not_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__50);
			setState(382);
			expr();
			setState(383);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_seq_sempred((Expr_seqContext)_localctx, predIndex);
		case 10:
			return expr_list_sempred((Expr_listContext)_localctx, predIndex);
		case 11:
			return field_list_sempred((Field_listContext)_localctx, predIndex);
		case 12:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
		case 19:
			return declaration_list_sempred((Declaration_listContext)_localctx, predIndex);
		case 23:
			return type_fields_sempred((Type_fieldsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_seq_sempred(Expr_seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_list_sempred(Expr_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean field_list_sempred(Field_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declaration_list_sempred(Declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_fields_sempred(Type_fieldsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\5\3\5\3\5\7\5c\n\5\f\5\16"+
		"\5f\13\5\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\7\3\7\3\7\7\7s\n\7\f\7"+
		"\16\7v\13\7\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008d\n\t\3\t\3\t\3\t\3\t\5\t\u0093"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009b\n\t\3\t\3\t\5\t\u009f\n\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00aa\n\13\f\13\16\13\u00ad"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b5\n\f\f\f\16\f\u00b8\13\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c4\n\r\f\r\16\r\u00c7\13\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00d4\n\16"+
		"\f\16\16\16\u00d7\13\16\3\17\3\17\3\17\5\17\u00dc\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ea\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\5\24\u00fe\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0107"+
		"\n\25\f\25\16\25\u010a\13\25\3\26\3\26\3\26\5\26\u010f\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0119\n\30\f\30\16\30\u011c\13\30"+
		"\3\30\3\30\3\30\5\30\u0121\n\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0129"+
		"\n\31\f\31\16\31\u012c\13\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u013f\n\34\3\35\3\35"+
		"\3\35\3\35\5\35\u0145\n\35\3\35\3\35\3\35\5\35\u014a\n\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u015a"+
		"\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\2\b\24\26\30\32(\60*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNP\2\5\3\2\5\n\3\2\13\f\3\2\r\16\2\u018d\2"+
		"R\3\2\2\2\4U\3\2\2\2\6W\3\2\2\2\b_\3\2\2\2\ng\3\2\2\2\fo\3\2\2\2\16w\3"+
		"\2\2\2\20\u009e\3\2\2\2\22\u00a0\3\2\2\2\24\u00a3\3\2\2\2\26\u00ae\3\2"+
		"\2\2\30\u00b9\3\2\2\2\32\u00c8\3\2\2\2\34\u00d8\3\2\2\2\36\u00df\3\2\2"+
		"\2 \u00e3\3\2\2\2\"\u00eb\3\2\2\2$\u00f0\3\2\2\2&\u00f9\3\2\2\2(\u0101"+
		"\3\2\2\2*\u010e\3\2\2\2,\u0110\3\2\2\2.\u0120\3\2\2\2\60\u0122\3\2\2\2"+
		"\62\u012d\3\2\2\2\64\u0131\3\2\2\2\66\u013e\3\2\2\28\u0140\3\2\2\2:\u0159"+
		"\3\2\2\2<\u015b\3\2\2\2>\u015f\3\2\2\2@\u0163\3\2\2\2B\u0165\3\2\2\2D"+
		"\u0169\3\2\2\2F\u016b\3\2\2\2H\u016f\3\2\2\2J\u0173\3\2\2\2L\u0177\3\2"+
		"\2\2N\u017b\3\2\2\2P\u017f\3\2\2\2RS\5\4\3\2ST\7\2\2\3T\3\3\2\2\2UV\5"+
		"\6\4\2V\5\3\2\2\2W\\\5\b\5\2XY\7\3\2\2Y[\5\b\5\2ZX\3\2\2\2[^\3\2\2\2\\"+
		"Z\3\2\2\2\\]\3\2\2\2]\7\3\2\2\2^\\\3\2\2\2_d\5\n\6\2`a\7\4\2\2ac\5\n\6"+
		"\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\t\3\2\2\2fd\3\2\2\2gl\5\f"+
		"\7\2hi\t\2\2\2ik\5\f\7\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\13\3"+
		"\2\2\2nl\3\2\2\2ot\5\16\b\2pq\t\3\2\2qs\5\16\b\2rp\3\2\2\2sv\3\2\2\2t"+
		"r\3\2\2\2tu\3\2\2\2u\r\3\2\2\2vt\3\2\2\2w|\5\20\t\2xy\t\4\2\2y{\5\20\t"+
		"\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\17\3\2\2\2~|\3\2\2\2\177\u009f"+
		"\78\2\2\u0080\u009f\7\67\2\2\u0081\u009f\7\17\2\2\u0082\u009f\5\32\16"+
		"\2\u0083\u009f\5\36\20\2\u0084\u009f\5\22\n\2\u0085\u009f\5 \21\2\u0086"+
		"\u009f\5\"\22\2\u0087\u009f\5$\23\2\u0088\u009f\7\20\2\2\u0089\u009f\5"+
		"\34\17\2\u008a\u008c\7\21\2\2\u008b\u008d\5\24\13\2\u008c\u008b\3\2\2"+
		"\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u009f\7\22\2\2\u008f"+
		"\u009a\5\64\33\2\u0090\u0092\7\23\2\2\u0091\u0093\5\30\r\2\u0092\u0091"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009b\7\24\2\2"+
		"\u0095\u0096\7\25\2\2\u0096\u0097\5\4\3\2\u0097\u0098\7\26\2\2\u0098\u0099"+
		"\5\4\3\2\u0099\u009b\3\2\2\2\u009a\u0090\3\2\2\2\u009a\u0095\3\2\2\2\u009b"+
		"\u009f\3\2\2\2\u009c\u009f\5&\24\2\u009d\u009f\5:\36\2\u009e\177\3\2\2"+
		"\2\u009e\u0080\3\2\2\2\u009e\u0081\3\2\2\2\u009e\u0082\3\2\2\2\u009e\u0083"+
		"\3\2\2\2\u009e\u0084\3\2\2\2\u009e\u0085\3\2\2\2\u009e\u0086\3\2\2\2\u009e"+
		"\u0087\3\2\2\2\u009e\u0088\3\2\2\2\u009e\u0089\3\2\2\2\u009e\u008a\3\2"+
		"\2\2\u009e\u008f\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\21\3\2\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\5\4\3\2\u00a2\23\3\2\2\2\u00a3"+
		"\u00a4\b\13\1\2\u00a4\u00a5\5\4\3\2\u00a5\u00ab\3\2\2\2\u00a6\u00a7\f"+
		"\3\2\2\u00a7\u00a8\7\27\2\2\u00a8\u00aa\5\4\3\2\u00a9\u00a6\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\25\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\b\f\1\2\u00af\u00b0\5\4\3\2\u00b0\u00b6"+
		"\3\2\2\2\u00b1\u00b2\f\3\2\2\u00b2\u00b3\7\30\2\2\u00b3\u00b5\5\4\3\2"+
		"\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\27\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\b\r\1\2\u00ba"+
		"\u00bb\7\66\2\2\u00bb\u00bc\7\6\2\2\u00bc\u00bd\5\4\3\2\u00bd\u00c5\3"+
		"\2\2\2\u00be\u00bf\f\3\2\2\u00bf\u00c0\7\30\2\2\u00c0\u00c1\7\66\2\2\u00c1"+
		"\u00c2\7\6\2\2\u00c2\u00c4\5\4\3\2\u00c3\u00be\3\2\2\2\u00c4\u00c7\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\31\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c8\u00c9\b\16\1\2\u00c9\u00ca\7\66\2\2\u00ca\u00d5\3\2\2\2"+
		"\u00cb\u00cc\f\4\2\2\u00cc\u00cd\7\31\2\2\u00cd\u00d4\7\66\2\2\u00ce\u00cf"+
		"\f\3\2\2\u00cf\u00d0\7\25\2\2\u00d0\u00d1\5\4\3\2\u00d1\u00d2\7\32\2\2"+
		"\u00d2\u00d4\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4\u00d7"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\33\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\7\66\2\2\u00d9\u00db\7\21\2\2\u00da\u00dc\5"+
		"\26\f\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\7\22\2\2\u00de\35\3\2\2\2\u00df\u00e0\5\32\16\2\u00e0\u00e1\7\33"+
		"\2\2\u00e1\u00e2\5\4\3\2\u00e2\37\3\2\2\2\u00e3\u00e4\7\34\2\2\u00e4\u00e5"+
		"\5\4\3\2\u00e5\u00e6\7\35\2\2\u00e6\u00e9\5\4\3\2\u00e7\u00e8\7\36\2\2"+
		"\u00e8\u00ea\5\4\3\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea!\3"+
		"\2\2\2\u00eb\u00ec\7\37\2\2\u00ec\u00ed\5\4\3\2\u00ed\u00ee\7 \2\2\u00ee"+
		"\u00ef\5\4\3\2\u00ef#\3\2\2\2\u00f0\u00f1\7!\2\2\u00f1\u00f2\7\66\2\2"+
		"\u00f2\u00f3\7\33\2\2\u00f3\u00f4\5\4\3\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6"+
		"\5\4\3\2\u00f6\u00f7\7 \2\2\u00f7\u00f8\5\4\3\2\u00f8%\3\2\2\2\u00f9\u00fa"+
		"\7#\2\2\u00fa\u00fb\5(\25\2\u00fb\u00fd\7$\2\2\u00fc\u00fe\5\24\13\2\u00fd"+
		"\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7%"+
		"\2\2\u0100\'\3\2\2\2\u0101\u0102\b\25\1\2\u0102\u0103\5*\26\2\u0103\u0108"+
		"\3\2\2\2\u0104\u0105\f\3\2\2\u0105\u0107\5*\26\2\u0106\u0104\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109)\3\2\2\2"+
		"\u010a\u0108\3\2\2\2\u010b\u010f\5,\27\2\u010c\u010f\5\66\34\2\u010d\u010f"+
		"\58\35\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f"+
		"+\3\2\2\2\u0110\u0111\7&\2\2\u0111\u0112\5\64\33\2\u0112\u0113\7\6\2\2"+
		"\u0113\u0114\5.\30\2\u0114-\3\2\2\2\u0115\u0121\5\64\33\2\u0116\u011a"+
		"\7\23\2\2\u0117\u0119\5\60\31\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2"+
		"\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011d\u0121\7\24\2\2\u011e\u011f\7\'\2\2\u011f\u0121\5\64\33"+
		"\2\u0120\u0115\3\2\2\2\u0120\u0116\3\2\2\2\u0120\u011e\3\2\2\2\u0121/"+
		"\3\2\2\2\u0122\u0123\b\31\1\2\u0123\u0124\5\62\32\2\u0124\u012a\3\2\2"+
		"\2\u0125\u0126\f\3\2\2\u0126\u0127\7\30\2\2\u0127\u0129\5\62\32\2\u0128"+
		"\u0125\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\61\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\66\2\2\u012e\u012f"+
		"\7(\2\2\u012f\u0130\5\64\33\2\u0130\63\3\2\2\2\u0131\u0132\7\66\2\2\u0132"+
		"\65\3\2\2\2\u0133\u0134\7)\2\2\u0134\u0135\7\66\2\2\u0135\u0136\7\33\2"+
		"\2\u0136\u013f\5\4\3\2\u0137\u0138\7)\2\2\u0138\u0139\7\66\2\2\u0139\u013a"+
		"\7(\2\2\u013a\u013b\5\64\33\2\u013b\u013c\7\33\2\2\u013c\u013d\5\4\3\2"+
		"\u013d\u013f\3\2\2\2\u013e\u0133\3\2\2\2\u013e\u0137\3\2\2\2\u013f\67"+
		"\3\2\2\2\u0140\u0141\7*\2\2\u0141\u0142\7\66\2\2\u0142\u0144\7\21\2\2"+
		"\u0143\u0145\5\60\31\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0149\7\22\2\2\u0147\u0148\7(\2\2\u0148\u014a\5\64\33\2"+
		"\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c"+
		"\7\6\2\2\u014c\u014d\5\4\3\2\u014d9\3\2\2\2\u014e\u015a\5<\37\2\u014f"+
		"\u015a\5> \2\u0150\u015a\5@!\2\u0151\u015a\5B\"\2\u0152\u015a\5D#\2\u0153"+
		"\u015a\5F$\2\u0154\u015a\5H%\2\u0155\u015a\5J&\2\u0156\u015a\5L\'\2\u0157"+
		"\u015a\5N(\2\u0158\u015a\5P)\2\u0159\u014e\3\2\2\2\u0159\u014f\3\2\2\2"+
		"\u0159\u0150\3\2\2\2\u0159\u0151\3\2\2\2\u0159\u0152\3\2\2\2\u0159\u0153"+
		"\3\2\2\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a;\3\2\2\2\u015b\u015c\7+\2\2\u015c"+
		"\u015d\5\4\3\2\u015d\u015e\7\22\2\2\u015e=\3\2\2\2\u015f\u0160\7,\2\2"+
		"\u0160\u0161\5\4\3\2\u0161\u0162\7\22\2\2\u0162?\3\2\2\2\u0163\u0164\7"+
		"-\2\2\u0164A\3\2\2\2\u0165\u0166\7.\2\2\u0166\u0167\5\4\3\2\u0167\u0168"+
		"\7\22\2\2\u0168C\3\2\2\2\u0169\u016a\7/\2\2\u016aE\3\2\2\2\u016b\u016c"+
		"\7\60\2\2\u016c\u016d\5\4\3\2\u016d\u016e\7\22\2\2\u016eG\3\2\2\2\u016f"+
		"\u0170\7\61\2\2\u0170\u0171\5\26\f\2\u0171\u0172\7\22\2\2\u0172I\3\2\2"+
		"\2\u0173\u0174\7\62\2\2\u0174\u0175\5\26\f\2\u0175\u0176\7\22\2\2\u0176"+
		"K\3\2\2\2\u0177\u0178\7\63\2\2\u0178\u0179\5\4\3\2\u0179\u017a\7\22\2"+
		"\2\u017aM\3\2\2\2\u017b\u017c\7\64\2\2\u017c\u017d\5\4\3\2\u017d\u017e"+
		"\7\22\2\2\u017eO\3\2\2\2\u017f\u0180\7\65\2\2\u0180\u0181\5\4\3\2\u0181"+
		"\u0182\7\22\2\2\u0182Q\3\2\2\2\34\\dlt|\u008c\u0092\u009a\u009e\u00ab"+
		"\u00b6\u00c5\u00d3\u00d5\u00db\u00e9\u00fd\u0108\u010e\u011a\u0120\u012a"+
		"\u013e\u0144\u0149\u0159";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}