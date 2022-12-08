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
		RULE_plus = 5, RULE_mult = 6, RULE_value = 7, RULE_instruction = 8, RULE_negation = 9, 
		RULE_expr_seq = 10, RULE_expr_list = 11, RULE_field_list = 12, RULE_field = 13, 
		RULE_lvalue = 14, RULE_functionCall = 15, RULE_assignement = 16, RULE_ifthenelse = 17, 
		RULE_whiledo = 18, RULE_for_ = 19, RULE_let_in_end = 20, RULE_declaration_list = 21, 
		RULE_declaration = 22, RULE_type_declaration = 23, RULE_type = 24, RULE_type_fields = 25, 
		RULE_type_field = 26, RULE_variable_declaration = 27, RULE_function_declaration = 28, 
		RULE_stdlib = 29, RULE_print_ = 30, RULE_printi = 31, RULE_flush_ = 32, 
		RULE_exit_ = 33, RULE_getchar_ = 34, RULE_chr_ = 35, RULE_substring_ = 36, 
		RULE_concat_ = 37, RULE_ord_ = 38, RULE_size_ = 39, RULE_not_ = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expr", "or", "and", "compare", "plus", "mult", "value", "instruction", 
			"negation", "expr_seq", "expr_list", "field_list", "field", "lvalue", 
			"functionCall", "assignement", "ifthenelse", "whiledo", "for_", "let_in_end", 
			"declaration_list", "declaration", "type_declaration", "type", "type_fields", 
			"type_field", "variable_declaration", "function_declaration", "stdlib", 
			"print_", "printi", "flush_", "exit_", "getchar_", "chr_", "substring_", 
			"concat_", "ord_", "size_", "not_"
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
			setState(82);
			expr();
			setState(83);
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
			setState(85);
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
			setState(87);
			and();
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					match(T__0);
					setState(89);
					and();
					}
					} 
				}
				setState(94);
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
			setState(95);
			compare();
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					match(T__1);
					setState(97);
					compare();
					}
					} 
				}
				setState(102);
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
			setState(103);
			plus();
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(105);
					plus();
					}
					} 
				}
				setState(110);
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
			setState(111);
			mult();
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					_la = _input.LA(1);
					if ( !(_la==T__8 || _la==T__9) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(113);
					mult();
					}
					} 
				}
				setState(118);
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
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(119);
				value();
				}
				break;
			case 2:
				{
				setState(120);
				instruction();
				}
				break;
			}
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					_la = _input.LA(1);
					if ( !(_la==T__10 || _la==T__11) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(124);
						value();
						}
						break;
					case 2:
						{
						setState(125);
						instruction();
						}
						break;
					}
					}
					} 
				}
				setState(132);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NilContext extends ValueContext {
		public NilContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Break_Context extends ValueContext {
		public Break_Context(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitBreak_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesContext extends ValueContext {
		public Expr_seqContext expr_seq() {
			return getRuleContext(Expr_seqContext.class,0);
		}
		public ParenthesesContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeInstanceContext extends ValueContext {
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public TypeInstanceContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitTypeInstance(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringNodeContext extends ValueContext {
		public TerminalNode STRING() { return getToken(tigerParser.STRING, 0); }
		public StringNodeContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitStringNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntNodeContext extends ValueContext {
		public TerminalNode INT() { return getToken(tigerParser.INT, 0); }
		public IntNodeContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitIntNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(STRING);
				}
				break;
			case INT:
				_localctx = new IntNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(INT);
				}
				break;
			case T__12:
				_localctx = new NilContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(T__12);
				}
				break;
			case T__13:
				_localctx = new Break_Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new ParenthesesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(T__14);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__25) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDF) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					setState(138);
					expr_seq();
					}
				}

				setState(141);
				match(T__15);
				}
				break;
			case IDF:
				_localctx = new TypeInstanceContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				match(IDF);
				setState(153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(143);
					match(T__16);
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDF) {
						{
						setState(144);
						field_list();
						}
					}

					setState(147);
					match(T__17);
					}
					break;
				case T__18:
					{
					setState(148);
					match(T__18);
					setState(149);
					expr();
					setState(150);
					match(T__19);
					setState(151);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class InstructionContext extends ParserRuleContext {
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
		public Let_in_endContext let_in_end() {
			return getRuleContext(Let_in_endContext.class,0);
		}
		public StdlibContext stdlib() {
			return getRuleContext(StdlibContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruction);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				lvalue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				assignement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				negation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				ifthenelse();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				whiledo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				for_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				functionCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(164);
				let_in_end();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(165);
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
		enterRule(_localctx, 18, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__9);
			setState(169);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		Expr_seqContext _localctx = new Expr_seqContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_seq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			expr();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(172);
				match(T__20);
				setState(173);
				expr();
				}
				}
				setState(178);
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

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			expr();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(180);
				match(T__21);
				setState(181);
				expr();
				}
				}
				setState(186);
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

	public static class Field_listContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
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
		Field_listContext _localctx = new Field_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			field();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(188);
				match(T__21);
				setState(189);
				field();
				}
				}
				setState(194);
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(IDF);
			setState(196);
			match(T__3);
			setState(197);
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

	public static class LvalueContext extends ParserRuleContext {
		public List<TerminalNode> IDF() { return getTokens(tigerParser.IDF); }
		public TerminalNode IDF(int i) {
			return getToken(tigerParser.IDF, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IDF);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18 || _la==T__22) {
				{
				setState(206);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
					{
					setState(200);
					match(T__22);
					setState(201);
					match(IDF);
					}
					break;
				case T__18:
					{
					setState(202);
					match(T__18);
					setState(203);
					expr();
					setState(204);
					match(T__23);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(210);
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
		enterRule(_localctx, 30, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(IDF);
			setState(212);
			match(T__14);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__25) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDF) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(213);
				expr_list();
				}
			}

			setState(216);
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
		enterRule(_localctx, 32, RULE_assignement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			lvalue();
			setState(219);
			match(T__24);
			setState(220);
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
		enterRule(_localctx, 34, RULE_ifthenelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__25);
			setState(223);
			expr();
			setState(224);
			match(T__26);
			setState(225);
			expr();
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(226);
				match(T__27);
				setState(227);
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
		enterRule(_localctx, 36, RULE_whiledo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__28);
			setState(231);
			expr();
			setState(232);
			match(T__29);
			setState(233);
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
		enterRule(_localctx, 38, RULE_for_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__30);
			setState(236);
			match(IDF);
			setState(237);
			match(T__24);
			setState(238);
			expr();
			setState(239);
			match(T__31);
			setState(240);
			expr();
			setState(241);
			match(T__29);
			setState(242);
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
		enterRule(_localctx, 40, RULE_let_in_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__32);
			setState(245);
			declaration_list();
			setState(246);
			match(T__33);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__25) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDF) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(247);
				expr_seq();
				}
			}

			setState(250);
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
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
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
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(252);
				declaration();
				}
				}
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__38) | (1L << T__39))) != 0) );
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
		enterRule(_localctx, 44, RULE_declaration);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				type_declaration();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				variable_declaration();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
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
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
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
		enterRule(_localctx, 46, RULE_type_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__35);
			setState(263);
			match(IDF);
			setState(264);
			match(T__3);
			setState(265);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends TypeContext {
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
		public IdentifierContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeDec1Context extends TypeContext {
		public Type_fieldsContext type_fields() {
			return getRuleContext(Type_fieldsContext.class,0);
		}
		public TypeDec1Context(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitTypeDec1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeDec2Context extends TypeContext {
		public TerminalNode IDF() { return getToken(tigerParser.IDF, 0); }
		public TypeDec2Context(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tigerVisitor ) return ((tigerVisitor<? extends T>)visitor).visitTypeDec2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(IDF);
				}
				break;
			case T__16:
				_localctx = new TypeDec1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(T__16);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDF) {
					{
					setState(269);
					type_fields();
					}
				}

				setState(272);
				match(T__17);
				}
				break;
			case T__36:
				_localctx = new TypeDec2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				match(T__36);
				setState(274);
				match(IDF);
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
		public List<Type_fieldContext> type_field() {
			return getRuleContexts(Type_fieldContext.class);
		}
		public Type_fieldContext type_field(int i) {
			return getRuleContext(Type_fieldContext.class,i);
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
		Type_fieldsContext _localctx = new Type_fieldsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			type_field();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(278);
				match(T__21);
				setState(279);
				type_field();
				}
				}
				setState(284);
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

	public static class Type_fieldContext extends ParserRuleContext {
		public List<TerminalNode> IDF() { return getTokens(tigerParser.IDF); }
		public TerminalNode IDF(int i) {
			return getToken(tigerParser.IDF, i);
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
		enterRule(_localctx, 52, RULE_type_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(IDF);
			setState(286);
			match(T__37);
			setState(287);
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
		public List<TerminalNode> IDF() { return getTokens(tigerParser.IDF); }
		public TerminalNode IDF(int i) {
			return getToken(tigerParser.IDF, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 54, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__38);
			setState(290);
			match(IDF);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(291);
				match(T__37);
				setState(292);
				match(IDF);
				}
			}

			setState(295);
			match(T__24);
			setState(296);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public List<TerminalNode> IDF() { return getTokens(tigerParser.IDF); }
		public TerminalNode IDF(int i) {
			return getToken(tigerParser.IDF, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_fieldsContext type_fields() {
			return getRuleContext(Type_fieldsContext.class,0);
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
		enterRule(_localctx, 56, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__39);
			setState(299);
			match(IDF);
			setState(300);
			match(T__14);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDF) {
				{
				setState(301);
				type_fields();
				}
			}

			setState(304);
			match(T__15);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(305);
				match(T__37);
				setState(306);
				match(IDF);
				}
			}

			setState(309);
			match(T__3);
			setState(310);
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
		enterRule(_localctx, 58, RULE_stdlib);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				print_();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				printi();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				flush_();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				exit_();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				getchar_();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 6);
				{
				setState(317);
				chr_();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 7);
				{
				setState(318);
				substring_();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 8);
				{
				setState(319);
				concat_();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 9);
				{
				setState(320);
				ord_();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 10);
				{
				setState(321);
				size_();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 11);
				{
				setState(322);
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
		enterRule(_localctx, 60, RULE_print_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__40);
			setState(326);
			expr();
			setState(327);
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
		enterRule(_localctx, 62, RULE_printi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__41);
			setState(330);
			expr();
			setState(331);
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
		enterRule(_localctx, 64, RULE_flush_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		enterRule(_localctx, 66, RULE_exit_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(T__43);
			setState(336);
			expr();
			setState(337);
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
		enterRule(_localctx, 68, RULE_getchar_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		enterRule(_localctx, 70, RULE_chr_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__45);
			setState(342);
			expr();
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
		enterRule(_localctx, 72, RULE_substring_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__46);
			setState(346);
			expr_list();
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
		enterRule(_localctx, 74, RULE_concat_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__47);
			setState(350);
			expr_list();
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
		enterRule(_localctx, 76, RULE_ord_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__48);
			setState(354);
			expr();
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
		enterRule(_localctx, 78, RULE_size_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__49);
			setState(358);
			expr();
			setState(359);
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
		enterRule(_localctx, 80, RULE_not_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__50);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0170\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3\5\3\5\3\5\7\5e\n\5"+
		"\f\5\16\5h\13\5\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\7\3\7\3\7\7\7u\n"+
		"\7\f\7\16\7x\13\7\3\b\3\b\5\b|\n\b\3\b\3\b\3\b\5\b\u0081\n\b\7\b\u0083"+
		"\n\b\f\b\16\b\u0086\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0094\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009c\n\t\5\t\u009e"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a9\n\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\7\f\u00b1\n\f\f\f\16\f\u00b4\13\f\3\r\3\r\3\r\7\r\u00b9\n"+
		"\r\f\r\16\r\u00bc\13\r\3\16\3\16\3\16\7\16\u00c1\n\16\f\16\16\16\u00c4"+
		"\13\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d1"+
		"\n\20\f\20\16\20\u00d4\13\20\3\21\3\21\3\21\5\21\u00d9\n\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e7\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\5\26\u00fb\n\26\3\26\3\26\3\27\6\27\u0100\n\27\r\27\16"+
		"\27\u0101\3\30\3\30\3\30\5\30\u0107\n\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\5\32\u0111\n\32\3\32\3\32\3\32\5\32\u0116\n\32\3\33\3\33\3"+
		"\33\7\33\u011b\n\33\f\33\16\33\u011e\13\33\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\5\35\u0128\n\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36"+
		"\u0131\n\36\3\36\3\36\3\36\5\36\u0136\n\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0146\n\37\3 \3 \3 \3"+
		" \3!\3!\3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\2\2+\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\5\3\2\5"+
		"\n\3\2\13\f\3\2\r\16\2\u0179\2T\3\2\2\2\4W\3\2\2\2\6Y\3\2\2\2\ba\3\2\2"+
		"\2\ni\3\2\2\2\fq\3\2\2\2\16{\3\2\2\2\20\u009d\3\2\2\2\22\u00a8\3\2\2\2"+
		"\24\u00aa\3\2\2\2\26\u00ad\3\2\2\2\30\u00b5\3\2\2\2\32\u00bd\3\2\2\2\34"+
		"\u00c5\3\2\2\2\36\u00c9\3\2\2\2 \u00d5\3\2\2\2\"\u00dc\3\2\2\2$\u00e0"+
		"\3\2\2\2&\u00e8\3\2\2\2(\u00ed\3\2\2\2*\u00f6\3\2\2\2,\u00ff\3\2\2\2."+
		"\u0106\3\2\2\2\60\u0108\3\2\2\2\62\u0115\3\2\2\2\64\u0117\3\2\2\2\66\u011f"+
		"\3\2\2\28\u0123\3\2\2\2:\u012c\3\2\2\2<\u0145\3\2\2\2>\u0147\3\2\2\2@"+
		"\u014b\3\2\2\2B\u014f\3\2\2\2D\u0151\3\2\2\2F\u0155\3\2\2\2H\u0157\3\2"+
		"\2\2J\u015b\3\2\2\2L\u015f\3\2\2\2N\u0163\3\2\2\2P\u0167\3\2\2\2R\u016b"+
		"\3\2\2\2TU\5\4\3\2UV\7\2\2\3V\3\3\2\2\2WX\5\6\4\2X\5\3\2\2\2Y^\5\b\5\2"+
		"Z[\7\3\2\2[]\5\b\5\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\7\3\2"+
		"\2\2`^\3\2\2\2af\5\n\6\2bc\7\4\2\2ce\5\n\6\2db\3\2\2\2eh\3\2\2\2fd\3\2"+
		"\2\2fg\3\2\2\2g\t\3\2\2\2hf\3\2\2\2in\5\f\7\2jk\t\2\2\2km\5\f\7\2lj\3"+
		"\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\13\3\2\2\2pn\3\2\2\2qv\5\16\b\2"+
		"rs\t\3\2\2su\5\16\b\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\r\3\2\2"+
		"\2xv\3\2\2\2y|\5\20\t\2z|\5\22\n\2{y\3\2\2\2{z\3\2\2\2|\u0084\3\2\2\2"+
		"}\u0080\t\4\2\2~\u0081\5\20\t\2\177\u0081\5\22\n\2\u0080~\3\2\2\2\u0080"+
		"\177\3\2\2\2\u0081\u0083\3\2\2\2\u0082}\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\17\3\2\2\2\u0086\u0084\3\2\2"+
		"\2\u0087\u009e\78\2\2\u0088\u009e\7\67\2\2\u0089\u009e\7\17\2\2\u008a"+
		"\u009e\7\20\2\2\u008b\u008d\7\21\2\2\u008c\u008e\5\26\f\2\u008d\u008c"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u009e\7\22\2\2"+
		"\u0090\u009b\7\66\2\2\u0091\u0093\7\23\2\2\u0092\u0094\5\32\16\2\u0093"+
		"\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u009c\7\24"+
		"\2\2\u0096\u0097\7\25\2\2\u0097\u0098\5\4\3\2\u0098\u0099\7\26\2\2\u0099"+
		"\u009a\5\4\3\2\u009a\u009c\3\2\2\2\u009b\u0091\3\2\2\2\u009b\u0096\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u0087\3\2\2\2\u009d\u0088\3\2\2\2\u009d"+
		"\u0089\3\2\2\2\u009d\u008a\3\2\2\2\u009d\u008b\3\2\2\2\u009d\u0090\3\2"+
		"\2\2\u009e\21\3\2\2\2\u009f\u00a9\5\36\20\2\u00a0\u00a9\5\"\22\2\u00a1"+
		"\u00a9\5\24\13\2\u00a2\u00a9\5$\23\2\u00a3\u00a9\5&\24\2\u00a4\u00a9\5"+
		"(\25\2\u00a5\u00a9\5 \21\2\u00a6\u00a9\5*\26\2\u00a7\u00a9\5<\37\2\u00a8"+
		"\u009f\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a2\3\2"+
		"\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\23\3\2\2\2\u00aa\u00ab\7\f\2"+
		"\2\u00ab\u00ac\5\4\3\2\u00ac\25\3\2\2\2\u00ad\u00b2\5\4\3\2\u00ae\u00af"+
		"\7\27\2\2\u00af\u00b1\5\4\3\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\27\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b5\u00ba\5\4\3\2\u00b6\u00b7\7\30\2\2\u00b7\u00b9\5\4\3\2"+
		"\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\31\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c2\5\34\17\2\u00be"+
		"\u00bf\7\30\2\2\u00bf\u00c1\5\34\17\2\u00c0\u00be\3\2\2\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\33\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7\66\2\2\u00c6\u00c7\7\6\2\2\u00c7\u00c8\5"+
		"\4\3\2\u00c8\35\3\2\2\2\u00c9\u00d2\7\66\2\2\u00ca\u00cb\7\31\2\2\u00cb"+
		"\u00d1\7\66\2\2\u00cc\u00cd\7\25\2\2\u00cd\u00ce\5\4\3\2\u00ce\u00cf\7"+
		"\32\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\37\3\2\2"+
		"\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\66\2\2\u00d6\u00d8\7\21\2\2\u00d7"+
		"\u00d9\5\30\r\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3"+
		"\2\2\2\u00da\u00db\7\22\2\2\u00db!\3\2\2\2\u00dc\u00dd\5\36\20\2\u00dd"+
		"\u00de\7\33\2\2\u00de\u00df\5\4\3\2\u00df#\3\2\2\2\u00e0\u00e1\7\34\2"+
		"\2\u00e1\u00e2\5\4\3\2\u00e2\u00e3\7\35\2\2\u00e3\u00e6\5\4\3\2\u00e4"+
		"\u00e5\7\36\2\2\u00e5\u00e7\5\4\3\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3"+
		"\2\2\2\u00e7%\3\2\2\2\u00e8\u00e9\7\37\2\2\u00e9\u00ea\5\4\3\2\u00ea\u00eb"+
		"\7 \2\2\u00eb\u00ec\5\4\3\2\u00ec\'\3\2\2\2\u00ed\u00ee\7!\2\2\u00ee\u00ef"+
		"\7\66\2\2\u00ef\u00f0\7\33\2\2\u00f0\u00f1\5\4\3\2\u00f1\u00f2\7\"\2\2"+
		"\u00f2\u00f3\5\4\3\2\u00f3\u00f4\7 \2\2\u00f4\u00f5\5\4\3\2\u00f5)\3\2"+
		"\2\2\u00f6\u00f7\7#\2\2\u00f7\u00f8\5,\27\2\u00f8\u00fa\7$\2\2\u00f9\u00fb"+
		"\5\26\f\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2"+
		"\u00fc\u00fd\7%\2\2\u00fd+\3\2\2\2\u00fe\u0100\5.\30\2\u00ff\u00fe\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"-\3\2\2\2\u0103\u0107\5\60\31\2\u0104\u0107\58\35\2\u0105\u0107\5:\36"+
		"\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107/"+
		"\3\2\2\2\u0108\u0109\7&\2\2\u0109\u010a\7\66\2\2\u010a\u010b\7\6\2\2\u010b"+
		"\u010c\5\62\32\2\u010c\61\3\2\2\2\u010d\u0116\7\66\2\2\u010e\u0110\7\23"+
		"\2\2\u010f\u0111\5\64\33\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0116\7\24\2\2\u0113\u0114\7\'\2\2\u0114\u0116\7"+
		"\66\2\2\u0115\u010d\3\2\2\2\u0115\u010e\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\63\3\2\2\2\u0117\u011c\5\66\34\2\u0118\u0119\7\30\2\2\u0119\u011b\5\66"+
		"\34\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\65\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7\66\2"+
		"\2\u0120\u0121\7(\2\2\u0121\u0122\7\66\2\2\u0122\67\3\2\2\2\u0123\u0124"+
		"\7)\2\2\u0124\u0127\7\66\2\2\u0125\u0126\7(\2\2\u0126\u0128\7\66\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7\33"+
		"\2\2\u012a\u012b\5\4\3\2\u012b9\3\2\2\2\u012c\u012d\7*\2\2\u012d\u012e"+
		"\7\66\2\2\u012e\u0130\7\21\2\2\u012f\u0131\5\64\33\2\u0130\u012f\3\2\2"+
		"\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0135\7\22\2\2\u0133"+
		"\u0134\7(\2\2\u0134\u0136\7\66\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\6\2\2\u0138\u0139\5\4\3\2\u0139"+
		";\3\2\2\2\u013a\u0146\5> \2\u013b\u0146\5@!\2\u013c\u0146\5B\"\2\u013d"+
		"\u0146\5D#\2\u013e\u0146\5F$\2\u013f\u0146\5H%\2\u0140\u0146\5J&\2\u0141"+
		"\u0146\5L\'\2\u0142\u0146\5N(\2\u0143\u0146\5P)\2\u0144\u0146\5R*\2\u0145"+
		"\u013a\3\2\2\2\u0145\u013b\3\2\2\2\u0145\u013c\3\2\2\2\u0145\u013d\3\2"+
		"\2\2\u0145\u013e\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0140\3\2\2\2\u0145"+
		"\u0141\3\2\2\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2"+
		"\2\2\u0146=\3\2\2\2\u0147\u0148\7+\2\2\u0148\u0149\5\4\3\2\u0149\u014a"+
		"\7\22\2\2\u014a?\3\2\2\2\u014b\u014c\7,\2\2\u014c\u014d\5\4\3\2\u014d"+
		"\u014e\7\22\2\2\u014eA\3\2\2\2\u014f\u0150\7-\2\2\u0150C\3\2\2\2\u0151"+
		"\u0152\7.\2\2\u0152\u0153\5\4\3\2\u0153\u0154\7\22\2\2\u0154E\3\2\2\2"+
		"\u0155\u0156\7/\2\2\u0156G\3\2\2\2\u0157\u0158\7\60\2\2\u0158\u0159\5"+
		"\4\3\2\u0159\u015a\7\22\2\2\u015aI\3\2\2\2\u015b\u015c\7\61\2\2\u015c"+
		"\u015d\5\30\r\2\u015d\u015e\7\22\2\2\u015eK\3\2\2\2\u015f\u0160\7\62\2"+
		"\2\u0160\u0161\5\30\r\2\u0161\u0162\7\22\2\2\u0162M\3\2\2\2\u0163\u0164"+
		"\7\63\2\2\u0164\u0165\5\4\3\2\u0165\u0166\7\22\2\2\u0166O\3\2\2\2\u0167"+
		"\u0168\7\64\2\2\u0168\u0169\5\4\3\2\u0169\u016a\7\22\2\2\u016aQ\3\2\2"+
		"\2\u016b\u016c\7\65\2\2\u016c\u016d\5\4\3\2\u016d\u016e\7\22\2\2\u016e"+
		"S\3\2\2\2\37^fnv{\u0080\u0084\u008d\u0093\u009b\u009d\u00a8\u00b2\u00ba"+
		"\u00c2\u00d0\u00d2\u00d8\u00e6\u00fa\u0101\u0106\u0110\u0115\u011c\u0127"+
		"\u0130\u0135\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}