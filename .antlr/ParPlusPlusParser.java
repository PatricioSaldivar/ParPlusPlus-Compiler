// Generated from /Users/User/Documents/ITC/Semestre7/Compis/Proy-Final/ParPlusPlus-Compiler/ParPlusPlus.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParPlusPlusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, VOID=4, PROGRAM=5, MODULE=6, VAR=7, MAIN=8, IF=9, 
		ELSE=10, RETURN=11, READ=12, WRITE=13, THEN=14, TO=15, SEMICOLON=16, COMMA=17, 
		LB=18, RB=19, LCB=20, RCB=21, LP=22, RP=23, PLUS=24, MINUS=25, MULT=26, 
		DIV=27, MOD=28, EQ=29, GTEQ=30, LTEQ=31, NEQ=32, NOT=33, OR=34, AND=35, 
		GT=36, LT=37, ASSIGN=38, FOR=39, WHILE=40, DO=41, ID=42, INT=43, FLOAT=44, 
		STRING=45, CHAR=46, WHITESPACE=47;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_varBlock = 2, RULE_vars = 3, RULE_rvars = 4, 
		RULE_xvars = 5, RULE_yvars = 6, RULE_funcBlock = 7, RULE_params = 8, RULE_rparams = 9, 
		RULE_varDimensionsInit = 10, RULE_statues = 11, RULE_statue = 12, RULE_varDimensions = 13, 
		RULE_asignation = 14, RULE_funcCall = 15, RULE_returnFunc = 16, RULE_read = 17, 
		RULE_write = 18, RULE_xwrite = 19, RULE_ywrite = 20, RULE_decision = 21, 
		RULE_xdecision = 22, RULE_forloop = 23, RULE_whileloop = 24, RULE_arguments = 25, 
		RULE_rarguments = 26, RULE_expresion = 27, RULE_exp = 28, RULE_termino = 29, 
		RULE_factor = 30, RULE_type = 31, RULE_cte = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "varBlock", "vars", "rvars", "xvars", "yvars", "funcBlock", 
			"params", "rparams", "varDimensionsInit", "statues", "statue", "varDimensions", 
			"asignation", "funcCall", "returnFunc", "read", "write", "xwrite", "ywrite", 
			"decision", "xdecision", "forloop", "whileloop", "arguments", "rarguments", 
			"expresion", "exp", "termino", "factor", "type", "cte"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'char'", "'void'", "'program'", "'module'", 
			"'var'", "'main'", "'if'", "'else'", "'return'", "'read'", "'write'", 
			"'then'", "'to'", "';'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'>='", "'<='", "'!='", "'!'", 
			"'||'", "'&&'", "'>'", "'<'", "'='", "'for'", "'while'", "'do'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "VOID", "PROGRAM", "MODULE", "VAR", "MAIN", "IF", 
			"ELSE", "RETURN", "READ", "WRITE", "THEN", "TO", "SEMICOLON", "COMMA", 
			"LB", "RB", "LCB", "RCB", "LP", "RP", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "EQ", "GTEQ", "LTEQ", "NEQ", "NOT", "OR", "AND", "GT", "LT", "ASSIGN", 
			"FOR", "WHILE", "DO", "ID", "INT", "FLOAT", "STRING", "CHAR", "WHITESPACE"
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
	public String getGrammarFileName() { return "ParPlusPlus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParPlusPlusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(ParPlusPlusParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(ParPlusPlusParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParPlusPlusParser.SEMICOLON, 0); }
		public VarBlockContext varBlock() {
			return getRuleContext(VarBlockContext.class,0);
		}
		public FuncBlockContext funcBlock() {
			return getRuleContext(FuncBlockContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
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
			setState(66);
			match(PROGRAM);
			setState(67);
			match(ID);
			setState(68);
			match(SEMICOLON);
			setState(69);
			varBlock();
			setState(70);
			funcBlock();
			setState(71);
			main();
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(ParPlusPlusParser.MAIN, 0); }
		public TerminalNode LP() { return getToken(ParPlusPlusParser.LP, 0); }
		public TerminalNode RP() { return getToken(ParPlusPlusParser.RP, 0); }
		public TerminalNode LCB() { return getToken(ParPlusPlusParser.LCB, 0); }
		public StatuesContext statues() {
			return getRuleContext(StatuesContext.class,0);
		}
		public TerminalNode RCB() { return getToken(ParPlusPlusParser.RCB, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(MAIN);
			setState(74);
			match(LP);
			setState(75);
			match(RP);
			setState(76);
			match(LCB);
			setState(77);
			statues();
			setState(78);
			match(RCB);
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

	public static class VarBlockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ParPlusPlusParser.VAR, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public RvarsContext rvars() {
			return getRuleContext(RvarsContext.class,0);
		}
		public VarBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBlock; }
	}

	public final VarBlockContext varBlock() throws RecognitionException {
		VarBlockContext _localctx = new VarBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varBlock);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(VAR);
				setState(81);
				vars();
				setState(82);
				rvars();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case VOID:
			case MAIN:
			case LCB:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class VarsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public XvarsContext xvars() {
			return getRuleContext(XvarsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParPlusPlusParser.SEMICOLON, 0); }
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			type();
			setState(88);
			xvars();
			setState(89);
			match(SEMICOLON);
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

	public static class RvarsContext extends ParserRuleContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public RvarsContext rvars() {
			return getRuleContext(RvarsContext.class,0);
		}
		public RvarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvars; }
	}

	public final RvarsContext rvars() throws RecognitionException {
		RvarsContext _localctx = new RvarsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rvars);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				vars();
				setState(92);
				rvars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class XvarsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParPlusPlusParser.ID, 0); }
		public YvarsContext yvars() {
			return getRuleContext(YvarsContext.class,0);
		}
		public VarDimensionsInitContext varDimensionsInit() {
			return getRuleContext(VarDimensionsInitContext.class,0);
		}
		public XvarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xvars; }
	}

	public final XvarsContext xvars() throws RecognitionException {
		XvarsContext _localctx = new XvarsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_xvars);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(ID);
				setState(98);
				yvars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(ID);
				setState(100);
				varDimensionsInit();
				setState(101);
				yvars();
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

	public static class YvarsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ParPlusPlusParser.COMMA, 0); }
		public XvarsContext xvars() {
			return getRuleContext(XvarsContext.class,0);
		}
		public YvarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yvars; }
	}

	public final YvarsContext yvars() throws RecognitionException {
		YvarsContext _localctx = new YvarsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_yvars);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(COMMA);
				setState(106);
				xvars();
				}
				break;
			case SEMICOLON:
			case RP:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FuncBlockContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode MODULE() { return getToken(ParPlusPlusParser.MODULE, 0); }
		public TerminalNode ID() { return getToken(ParPlusPlusParser.ID, 0); }
		public TerminalNode LP() { return getToken(ParPlusPlusParser.LP, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParPlusPlusParser.RP, 0); }
		public VarBlockContext varBlock() {
			return getRuleContext(VarBlockContext.class,0);
		}
		public TerminalNode LCB() { return getToken(ParPlusPlusParser.LCB, 0); }
		public StatuesContext statues() {
			return getRuleContext(StatuesContext.class,0);
		}
		public TerminalNode RCB() { return getToken(ParPlusPlusParser.RCB, 0); }
		public FuncBlockContext funcBlock() {
			return getRuleContext(FuncBlockContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ParPlusPlusParser.VOID, 0); }
		public FuncBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBlock; }
	}

	public final FuncBlockContext funcBlock() throws RecognitionException {
		FuncBlockContext _localctx = new FuncBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcBlock);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				type();
				setState(111);
				match(MODULE);
				setState(112);
				match(ID);
				setState(113);
				match(LP);
				setState(114);
				params();
				setState(115);
				match(RP);
				setState(116);
				varBlock();
				setState(117);
				match(LCB);
				setState(118);
				statues();
				setState(119);
				match(RCB);
				setState(120);
				funcBlock();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(VOID);
				setState(123);
				match(MODULE);
				setState(124);
				match(ID);
				setState(125);
				match(LP);
				setState(126);
				params();
				setState(127);
				match(RP);
				setState(128);
				varBlock();
				setState(129);
				match(LCB);
				setState(130);
				statues();
				setState(131);
				match(RCB);
				setState(132);
				funcBlock();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ParamsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ParPlusPlusParser.ID, 0); }
		public RparamsContext rparams() {
			return getRuleContext(RparamsContext.class,0);
		}
		public VarDimensionsInitContext varDimensionsInit() {
			return getRuleContext(VarDimensionsInitContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				type();
				setState(138);
				match(ID);
				setState(139);
				rparams();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				type();
				setState(142);
				match(ID);
				setState(143);
				varDimensionsInit();
				setState(144);
				rparams();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class RparamsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ParPlusPlusParser.COMMA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public RparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rparams; }
	}

	public final RparamsContext rparams() throws RecognitionException {
		RparamsContext _localctx = new RparamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rparams);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(COMMA);
				setState(150);
				params();
				}
				break;
			case RP:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class VarDimensionsInitContext extends ParserRuleContext {
		public List<TerminalNode> LB() { return getTokens(ParPlusPlusParser.LB); }
		public TerminalNode LB(int i) {
			return getToken(ParPlusPlusParser.LB, i);
		}
		public List<TerminalNode> INT() { return getTokens(ParPlusPlusParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParPlusPlusParser.INT, i);
		}
		public List<TerminalNode> RB() { return getTokens(ParPlusPlusParser.RB); }
		public TerminalNode RB(int i) {
			return getToken(ParPlusPlusParser.RB, i);
		}
		public VarDimensionsInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDimensionsInit; }
	}

	public final VarDimensionsInitContext varDimensionsInit() throws RecognitionException {
		VarDimensionsInitContext _localctx = new VarDimensionsInitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDimensionsInit);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(LB);
				setState(155);
				match(INT);
				setState(156);
				match(RB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(LB);
				setState(158);
				match(INT);
				setState(159);
				match(RB);
				setState(160);
				match(LB);
				setState(161);
				match(INT);
				setState(162);
				match(RB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class StatuesContext extends ParserRuleContext {
		public StatueContext statue() {
			return getRuleContext(StatueContext.class,0);
		}
		public StatuesContext statues() {
			return getRuleContext(StatuesContext.class,0);
		}
		public StatuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statues; }
	}

	public final StatuesContext statues() throws RecognitionException {
		StatuesContext _localctx = new StatuesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statues);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case RETURN:
			case READ:
			case WRITE:
			case LP:
			case MINUS:
			case NOT:
			case FOR:
			case WHILE:
			case ID:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				statue();
				setState(167);
				statues();
				}
				break;
			case RCB:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatueContext extends ParserRuleContext {
		public AsignationContext asignation() {
			return getRuleContext(AsignationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParPlusPlusParser.SEMICOLON, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ReturnFuncContext returnFunc() {
			return getRuleContext(ReturnFuncContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public DecisionContext decision() {
			return getRuleContext(DecisionContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public StatueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statue; }
	}

	public final StatueContext statue() throws RecognitionException {
		StatueContext _localctx = new StatueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statue);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				asignation();
				setState(173);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				funcCall();
				setState(176);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				returnFunc();
				setState(179);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				read();
				setState(182);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				write();
				setState(185);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				decision();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(188);
				whileloop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(189);
				forloop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(190);
				expresion();
				setState(191);
				match(SEMICOLON);
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

	public static class VarDimensionsContext extends ParserRuleContext {
		public List<TerminalNode> LB() { return getTokens(ParPlusPlusParser.LB); }
		public TerminalNode LB(int i) {
			return getToken(ParPlusPlusParser.LB, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> RB() { return getTokens(ParPlusPlusParser.RB); }
		public TerminalNode RB(int i) {
			return getToken(ParPlusPlusParser.RB, i);
		}
		public VarDimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDimensions; }
	}

	public final VarDimensionsContext varDimensions() throws RecognitionException {
		VarDimensionsContext _localctx = new VarDimensionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varDimensions);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(LB);
				setState(196);
				expresion();
				setState(197);
				match(RB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(LB);
				setState(200);
				expresion();
				setState(201);
				match(RB);
				setState(202);
				match(LB);
				setState(203);
				expresion();
				setState(204);
				match(RB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class AsignationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParPlusPlusParser.ID, 0); }
		public VarDimensionsContext varDimensions() {
			return getRuleContext(VarDimensionsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ParPlusPlusParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignation; }
	}

	public final AsignationContext asignation() throws RecognitionException {
		AsignationContext _localctx = new AsignationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_asignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(ID);
			setState(210);
			varDimensions();
			setState(211);
			match(ASSIGN);
			setState(212);
			expresion();
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

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParPlusPlusParser.ID, 0); }
		public TerminalNode LP() { return getToken(ParPlusPlusParser.LP, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParPlusPlusParser.RP, 0); }
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(ID);
			setState(215);
			match(LP);
			setState(216);
			arguments();
			setState(217);
			match(RP);
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

	public static class ReturnFuncContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ParPlusPlusParser.RETURN, 0); }
		public TerminalNode LP() { return getToken(ParPlusPlusParser.LP, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParPlusPlusParser.RP, 0); }
		public ReturnFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFunc; }
	}

	public final ReturnFuncContext returnFunc() throws RecognitionException {
		ReturnFuncContext _localctx = new ReturnFuncContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(RETURN);
			setState(220);
			match(LP);
			setState(221);
			expresion();
			setState(222);
			match(RP);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(ParPlusPlusParser.READ, 0); }
		public TerminalNode LP() { return getToken(ParPlusPlusParser.LP, 0); }
		public XvarsContext xvars() {
			return getRuleContext(XvarsContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParPlusPlusParser.RP, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(READ);
			setState(225);
			match(LP);
			setState(226);
			xvars();
			setState(227);
			match(RP);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(ParPlusPlusParser.WRITE, 0); }
		public TerminalNode LP() { return getToken(ParPlusPlusParser.LP, 0); }
		public XwriteContext xwrite() {
			return getRuleContext(XwriteContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParPlusPlusParser.RP, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(WRITE);
			setState(230);
			match(LP);
			setState(231);
			xwrite();
			setState(232);
			match(RP);
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

	public static class XwriteContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public YwriteContext ywrite() {
			return getRuleContext(YwriteContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ParPlusPlusParser.STRING, 0); }
		public XwriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xwrite; }
	}

	public final XwriteContext xwrite() throws RecognitionException {
		XwriteContext _localctx = new XwriteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_xwrite);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
			case MINUS:
			case NOT:
			case ID:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				expresion();
				setState(235);
				ywrite();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(STRING);
				setState(238);
				ywrite();
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

	public static class YwriteContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ParPlusPlusParser.COMMA, 0); }
		public XwriteContext xwrite() {
			return getRuleContext(XwriteContext.class,0);
		}
		public YwriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ywrite; }
	}

	public final YwriteContext ywrite() throws RecognitionException {
		YwriteContext _localctx = new YwriteContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ywrite);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(COMMA);
				setState(242);
				xwrite();
				}
				break;
			case RP:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DecisionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParPlusPlusParser.IF, 0); }
		public TerminalNode LP() { return getToken(ParPlusPlusParser.LP, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParPlusPlusParser.RP, 0); }
		public TerminalNode THEN() { return getToken(ParPlusPlusParser.THEN, 0); }
		public TerminalNode LCB() { return getToken(ParPlusPlusParser.LCB, 0); }
		public StatuesContext statues() {
			return getRuleContext(StatuesContext.class,0);
		}
		public TerminalNode RCB() { return getToken(ParPlusPlusParser.RCB, 0); }
		public XdecisionContext xdecision() {
			return getRuleContext(XdecisionContext.class,0);
		}
		public DecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decision; }
	}

	public final DecisionContext decision() throws RecognitionException {
		DecisionContext _localctx = new DecisionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_decision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(IF);
			setState(247);
			match(LP);
			setState(248);
			expresion();
			setState(249);
			match(RP);
			setState(250);
			match(THEN);
			setState(251);
			match(LCB);
			setState(252);
			statues();
			setState(253);
			match(RCB);
			setState(254);
			xdecision();
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

	public static class XdecisionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ParPlusPlusParser.ELSE, 0); }
		public TerminalNode LCB() { return getToken(ParPlusPlusParser.LCB, 0); }
		public StatuesContext statues() {
			return getRuleContext(StatuesContext.class,0);
		}
		public TerminalNode RCB() { return getToken(ParPlusPlusParser.RCB, 0); }
		public XdecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdecision; }
	}

	public final XdecisionContext xdecision() throws RecognitionException {
		XdecisionContext _localctx = new XdecisionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_xdecision);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(ELSE);
				setState(257);
				match(LCB);
				setState(258);
				statues();
				setState(259);
				match(RCB);
				}
				break;
			case IF:
			case RETURN:
			case READ:
			case WRITE:
			case RCB:
			case LP:
			case MINUS:
			case NOT:
			case FOR:
			case WHILE:
			case ID:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ParPlusPlusParser.FOR, 0); }
		public AsignationContext asignation() {
			return getRuleContext(AsignationContext.class,0);
		}
		public TerminalNode TO() { return getToken(ParPlusPlusParser.TO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DO() { return getToken(ParPlusPlusParser.DO, 0); }
		public TerminalNode LCB() { return getToken(ParPlusPlusParser.LCB, 0); }
		public StatuesContext statues() {
			return getRuleContext(StatuesContext.class,0);
		}
		public TerminalNode RCB() { return getToken(ParPlusPlusParser.RCB, 0); }
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(FOR);
			setState(265);
			asignation();
			setState(266);
			match(TO);
			setState(267);
			expresion();
			setState(268);
			match(DO);
			setState(269);
			match(LCB);
			setState(270);
			statues();
			setState(271);
			match(RCB);
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

	public static class WhileloopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParPlusPlusParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(ParPlusPlusParser.LP, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParPlusPlusParser.RP, 0); }
		public TerminalNode DO() { return getToken(ParPlusPlusParser.DO, 0); }
		public TerminalNode LCB() { return getToken(ParPlusPlusParser.LCB, 0); }
		public StatuesContext statues() {
			return getRuleContext(StatuesContext.class,0);
		}
		public TerminalNode RCB() { return getToken(ParPlusPlusParser.RCB, 0); }
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(WHILE);
			setState(274);
			match(LP);
			setState(275);
			expresion();
			setState(276);
			match(RP);
			setState(277);
			match(DO);
			setState(278);
			match(LCB);
			setState(279);
			statues();
			setState(280);
			match(RCB);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public RargumentsContext rarguments() {
			return getRuleContext(RargumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			expresion();
			setState(283);
			rarguments();
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

	public static class RargumentsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ParPlusPlusParser.COMMA, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public RargumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rarguments; }
	}

	public final RargumentsContext rarguments() throws RecognitionException {
		RargumentsContext _localctx = new RargumentsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_rarguments);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(COMMA);
				setState(286);
				arguments();
				}
				break;
			case RP:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpresionContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(ParPlusPlusParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(ParPlusPlusParser.GTEQ, 0); }
		public TerminalNode EQ() { return getToken(ParPlusPlusParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ParPlusPlusParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(ParPlusPlusParser.AND, 0); }
		public TerminalNode OR() { return getToken(ParPlusPlusParser.OR, 0); }
		public TerminalNode LT() { return getToken(ParPlusPlusParser.LT, 0); }
		public TerminalNode GT() { return getToken(ParPlusPlusParser.GT, 0); }
		public TerminalNode NOT() { return getToken(ParPlusPlusParser.NOT, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expresion);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				exp(0);
				setState(292);
				match(LTEQ);
				setState(293);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				exp(0);
				setState(296);
				match(GTEQ);
				setState(297);
				exp(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				exp(0);
				setState(300);
				match(EQ);
				setState(301);
				exp(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				exp(0);
				setState(304);
				match(NEQ);
				setState(305);
				exp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(307);
				exp(0);
				setState(308);
				match(AND);
				setState(309);
				exp(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(311);
				exp(0);
				setState(312);
				match(OR);
				setState(313);
				exp(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(315);
				exp(0);
				setState(316);
				match(LT);
				setState(317);
				exp(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(319);
				exp(0);
				setState(320);
				match(GT);
				setState(321);
				exp(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(323);
				match(NOT);
				setState(324);
				exp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ParPlusPlusParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ParPlusPlusParser.MINUS, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(328);
			termino(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(330);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(331);
						match(PLUS);
						setState(332);
						termino(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(333);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(334);
						match(MINUS);
						setState(335);
						termino(0);
						}
						break;
					}
					} 
				}
				setState(340);
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

	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode MULT() { return getToken(ParPlusPlusParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(ParPlusPlusParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ParPlusPlusParser.MOD, 0); }
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		return termino(0);
	}

	private TerminoContext termino(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminoContext _localctx = new TerminoContext(_ctx, _parentState);
		TerminoContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_termino, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(342);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(353);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(344);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(345);
						match(MULT);
						setState(346);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(347);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(348);
						match(DIV);
						setState(349);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(350);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(351);
						match(MOD);
						setState(352);
						factor();
						}
						break;
					}
					} 
				}
				setState(357);
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

	public static class FactorContext extends ParserRuleContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode LP() { return getToken(ParPlusPlusParser.LP, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParPlusPlusParser.RP, 0); }
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ParPlusPlusParser.MINUS, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_factor);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(LP);
				setState(360);
				expresion();
				setState(361);
				match(RP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				cte();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				match(MINUS);
				setState(365);
				cte();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
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

	public static class CteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParPlusPlusParser.ID, 0); }
		public VarDimensionsContext varDimensions() {
			return getRuleContext(VarDimensionsContext.class,0);
		}
		public TerminalNode INT() { return getToken(ParPlusPlusParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParPlusPlusParser.FLOAT, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cte);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(ID);
				setState(371);
				varDimensions();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				match(FLOAT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 29:
			return termino_sempred((TerminoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean termino_sempred(TerminoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u017b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6b\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u008a\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0096\n\n\3\13\3\13\3\13\5\13\u009b\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00a7\n\f\3\r\3\r\3\r\3\r\5\r\u00ad\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00c4\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00d2\n\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00f2\n\25\3\26"+
		"\3\26\3\26\5\26\u00f7\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0109\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0123\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0148\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u0153\n\36\f\36\16\36\u0156\13\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0164\n\37\f\37\16\37\u0167\13\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \5 \u0171\n \3!\3!\3\"\3\"\3\"\3\"\5\"\u0179\n"+
		"\"\3\"\2\4:<#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@B\2\3\3\2\3\5\2\u0186\2D\3\2\2\2\4K\3\2\2\2\6W\3\2\2\2\bY\3\2"+
		"\2\2\na\3\2\2\2\fi\3\2\2\2\16n\3\2\2\2\20\u0089\3\2\2\2\22\u0095\3\2\2"+
		"\2\24\u009a\3\2\2\2\26\u00a6\3\2\2\2\30\u00ac\3\2\2\2\32\u00c3\3\2\2\2"+
		"\34\u00d1\3\2\2\2\36\u00d3\3\2\2\2 \u00d8\3\2\2\2\"\u00dd\3\2\2\2$\u00e2"+
		"\3\2\2\2&\u00e7\3\2\2\2(\u00f1\3\2\2\2*\u00f6\3\2\2\2,\u00f8\3\2\2\2."+
		"\u0108\3\2\2\2\60\u010a\3\2\2\2\62\u0113\3\2\2\2\64\u011c\3\2\2\2\66\u0122"+
		"\3\2\2\28\u0147\3\2\2\2:\u0149\3\2\2\2<\u0157\3\2\2\2>\u0170\3\2\2\2@"+
		"\u0172\3\2\2\2B\u0178\3\2\2\2DE\7\7\2\2EF\7,\2\2FG\7\22\2\2GH\5\6\4\2"+
		"HI\5\20\t\2IJ\5\4\3\2J\3\3\2\2\2KL\7\n\2\2LM\7\30\2\2MN\7\31\2\2NO\7\26"+
		"\2\2OP\5\30\r\2PQ\7\27\2\2Q\5\3\2\2\2RS\7\t\2\2ST\5\b\5\2TU\5\n\6\2UX"+
		"\3\2\2\2VX\3\2\2\2WR\3\2\2\2WV\3\2\2\2X\7\3\2\2\2YZ\5@!\2Z[\5\f\7\2[\\"+
		"\7\22\2\2\\\t\3\2\2\2]^\5\b\5\2^_\5\n\6\2_b\3\2\2\2`b\3\2\2\2a]\3\2\2"+
		"\2a`\3\2\2\2b\13\3\2\2\2cd\7,\2\2dj\5\16\b\2ef\7,\2\2fg\5\26\f\2gh\5\16"+
		"\b\2hj\3\2\2\2ic\3\2\2\2ie\3\2\2\2j\r\3\2\2\2kl\7\23\2\2lo\5\f\7\2mo\3"+
		"\2\2\2nk\3\2\2\2nm\3\2\2\2o\17\3\2\2\2pq\5@!\2qr\7\b\2\2rs\7,\2\2st\7"+
		"\30\2\2tu\5\22\n\2uv\7\31\2\2vw\5\6\4\2wx\7\26\2\2xy\5\30\r\2yz\7\27\2"+
		"\2z{\5\20\t\2{\u008a\3\2\2\2|}\7\6\2\2}~\7\b\2\2~\177\7,\2\2\177\u0080"+
		"\7\30\2\2\u0080\u0081\5\22\n\2\u0081\u0082\7\31\2\2\u0082\u0083\5\6\4"+
		"\2\u0083\u0084\7\26\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7\27\2\2\u0086"+
		"\u0087\5\20\t\2\u0087\u008a\3\2\2\2\u0088\u008a\3\2\2\2\u0089p\3\2\2\2"+
		"\u0089|\3\2\2\2\u0089\u0088\3\2\2\2\u008a\21\3\2\2\2\u008b\u008c\5@!\2"+
		"\u008c\u008d\7,\2\2\u008d\u008e\5\24\13\2\u008e\u0096\3\2\2\2\u008f\u0090"+
		"\5@!\2\u0090\u0091\7,\2\2\u0091\u0092\5\26\f\2\u0092\u0093\5\24\13\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u008b\3\2\2\2\u0095\u008f\3\2"+
		"\2\2\u0095\u0094\3\2\2\2\u0096\23\3\2\2\2\u0097\u0098\7\23\2\2\u0098\u009b"+
		"\5\22\n\2\u0099\u009b\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0099\3\2\2\2"+
		"\u009b\25\3\2\2\2\u009c\u009d\7\24\2\2\u009d\u009e\7-\2\2\u009e\u00a7"+
		"\7\25\2\2\u009f\u00a0\7\24\2\2\u00a0\u00a1\7-\2\2\u00a1\u00a2\7\25\2\2"+
		"\u00a2\u00a3\7\24\2\2\u00a3\u00a4\7-\2\2\u00a4\u00a7\7\25\2\2\u00a5\u00a7"+
		"\3\2\2\2\u00a6\u009c\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\27\3\2\2\2\u00a8\u00a9\5\32\16\2\u00a9\u00aa\5\30\r\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\31\3\2\2\2\u00ae\u00af\5\36\20\2\u00af\u00b0\7\22\2\2\u00b0\u00c4\3\2"+
		"\2\2\u00b1\u00b2\5 \21\2\u00b2\u00b3\7\22\2\2\u00b3\u00c4\3\2\2\2\u00b4"+
		"\u00b5\5\"\22\2\u00b5\u00b6\7\22\2\2\u00b6\u00c4\3\2\2\2\u00b7\u00b8\5"+
		"$\23\2\u00b8\u00b9\7\22\2\2\u00b9\u00c4\3\2\2\2\u00ba\u00bb\5&\24\2\u00bb"+
		"\u00bc\7\22\2\2\u00bc\u00c4\3\2\2\2\u00bd\u00c4\5,\27\2\u00be\u00c4\5"+
		"\62\32\2\u00bf\u00c4\5\60\31\2\u00c0\u00c1\58\35\2\u00c1\u00c2\7\22\2"+
		"\2\u00c2\u00c4\3\2\2\2\u00c3\u00ae\3\2\2\2\u00c3\u00b1\3\2\2\2\u00c3\u00b4"+
		"\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3"+
		"\u00be\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\33\3\2\2"+
		"\2\u00c5\u00c6\7\24\2\2\u00c6\u00c7\58\35\2\u00c7\u00c8\7\25\2\2\u00c8"+
		"\u00d2\3\2\2\2\u00c9\u00ca\7\24\2\2\u00ca\u00cb\58\35\2\u00cb\u00cc\7"+
		"\25\2\2\u00cc\u00cd\7\24\2\2\u00cd\u00ce\58\35\2\u00ce\u00cf\7\25\2\2"+
		"\u00cf\u00d2\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00c9"+
		"\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\35\3\2\2\2\u00d3\u00d4\7,\2\2\u00d4"+
		"\u00d5\5\34\17\2\u00d5\u00d6\7(\2\2\u00d6\u00d7\58\35\2\u00d7\37\3\2\2"+
		"\2\u00d8\u00d9\7,\2\2\u00d9\u00da\7\30\2\2\u00da\u00db\5\64\33\2\u00db"+
		"\u00dc\7\31\2\2\u00dc!\3\2\2\2\u00dd\u00de\7\r\2\2\u00de\u00df\7\30\2"+
		"\2\u00df\u00e0\58\35\2\u00e0\u00e1\7\31\2\2\u00e1#\3\2\2\2\u00e2\u00e3"+
		"\7\16\2\2\u00e3\u00e4\7\30\2\2\u00e4\u00e5\5\f\7\2\u00e5\u00e6\7\31\2"+
		"\2\u00e6%\3\2\2\2\u00e7\u00e8\7\17\2\2\u00e8\u00e9\7\30\2\2\u00e9\u00ea"+
		"\5(\25\2\u00ea\u00eb\7\31\2\2\u00eb\'\3\2\2\2\u00ec\u00ed\58\35\2\u00ed"+
		"\u00ee\5*\26\2\u00ee\u00f2\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0\u00f2\5*\26"+
		"\2\u00f1\u00ec\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2)\3\2\2\2\u00f3\u00f4"+
		"\7\23\2\2\u00f4\u00f7\5(\25\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2\2\2"+
		"\u00f6\u00f5\3\2\2\2\u00f7+\3\2\2\2\u00f8\u00f9\7\13\2\2\u00f9\u00fa\7"+
		"\30\2\2\u00fa\u00fb\58\35\2\u00fb\u00fc\7\31\2\2\u00fc\u00fd\7\20\2\2"+
		"\u00fd\u00fe\7\26\2\2\u00fe\u00ff\5\30\r\2\u00ff\u0100\7\27\2\2\u0100"+
		"\u0101\5.\30\2\u0101-\3\2\2\2\u0102\u0103\7\f\2\2\u0103\u0104\7\26\2\2"+
		"\u0104\u0105\5\30\r\2\u0105\u0106\7\27\2\2\u0106\u0109\3\2\2\2\u0107\u0109"+
		"\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0107\3\2\2\2\u0109/\3\2\2\2\u010a"+
		"\u010b\7)\2\2\u010b\u010c\5\36\20\2\u010c\u010d\7\21\2\2\u010d\u010e\5"+
		"8\35\2\u010e\u010f\7+\2\2\u010f\u0110\7\26\2\2\u0110\u0111\5\30\r\2\u0111"+
		"\u0112\7\27\2\2\u0112\61\3\2\2\2\u0113\u0114\7*\2\2\u0114\u0115\7\30\2"+
		"\2\u0115\u0116\58\35\2\u0116\u0117\7\31\2\2\u0117\u0118\7+\2\2\u0118\u0119"+
		"\7\26\2\2\u0119\u011a\5\30\r\2\u011a\u011b\7\27\2\2\u011b\63\3\2\2\2\u011c"+
		"\u011d\58\35\2\u011d\u011e\5\66\34\2\u011e\65\3\2\2\2\u011f\u0120\7\23"+
		"\2\2\u0120\u0123\5\64\33\2\u0121\u0123\3\2\2\2\u0122\u011f\3\2\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\67\3\2\2\2\u0124\u0148\5:\36\2\u0125\u0126\5:\36"+
		"\2\u0126\u0127\7!\2\2\u0127\u0128\5:\36\2\u0128\u0148\3\2\2\2\u0129\u012a"+
		"\5:\36\2\u012a\u012b\7 \2\2\u012b\u012c\5:\36\2\u012c\u0148\3\2\2\2\u012d"+
		"\u012e\5:\36\2\u012e\u012f\7\37\2\2\u012f\u0130\5:\36\2\u0130\u0148\3"+
		"\2\2\2\u0131\u0132\5:\36\2\u0132\u0133\7\"\2\2\u0133\u0134\5:\36\2\u0134"+
		"\u0148\3\2\2\2\u0135\u0136\5:\36\2\u0136\u0137\7%\2\2\u0137\u0138\5:\36"+
		"\2\u0138\u0148\3\2\2\2\u0139\u013a\5:\36\2\u013a\u013b\7$\2\2\u013b\u013c"+
		"\5:\36\2\u013c\u0148\3\2\2\2\u013d\u013e\5:\36\2\u013e\u013f\7\'\2\2\u013f"+
		"\u0140\5:\36\2\u0140\u0148\3\2\2\2\u0141\u0142\5:\36\2\u0142\u0143\7&"+
		"\2\2\u0143\u0144\5:\36\2\u0144\u0148\3\2\2\2\u0145\u0146\7#\2\2\u0146"+
		"\u0148\5:\36\2\u0147\u0124\3\2\2\2\u0147\u0125\3\2\2\2\u0147\u0129\3\2"+
		"\2\2\u0147\u012d\3\2\2\2\u0147\u0131\3\2\2\2\u0147\u0135\3\2\2\2\u0147"+
		"\u0139\3\2\2\2\u0147\u013d\3\2\2\2\u0147\u0141\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u01489\3\2\2\2\u0149\u014a\b\36\1\2\u014a\u014b\5<\37\2\u014b\u0154"+
		"\3\2\2\2\u014c\u014d\f\5\2\2\u014d\u014e\7\32\2\2\u014e\u0153\5<\37\2"+
		"\u014f\u0150\f\4\2\2\u0150\u0151\7\33\2\2\u0151\u0153\5<\37\2\u0152\u014c"+
		"\3\2\2\2\u0152\u014f\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155;\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\b\37\1\2"+
		"\u0158\u0159\5> \2\u0159\u0165\3\2\2\2\u015a\u015b\f\6\2\2\u015b\u015c"+
		"\7\34\2\2\u015c\u0164\5> \2\u015d\u015e\f\5\2\2\u015e\u015f\7\35\2\2\u015f"+
		"\u0164\5> \2\u0160\u0161\f\4\2\2\u0161\u0162\7\36\2\2\u0162\u0164\5> "+
		"\2\u0163\u015a\3\2\2\2\u0163\u015d\3\2\2\2\u0163\u0160\3\2\2\2\u0164\u0167"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166=\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u0171\5 \21\2\u0169\u016a\7\30\2\2\u016a\u016b\5"+
		"8\35\2\u016b\u016c\7\31\2\2\u016c\u0171\3\2\2\2\u016d\u0171\5B\"\2\u016e"+
		"\u016f\7\33\2\2\u016f\u0171\5B\"\2\u0170\u0168\3\2\2\2\u0170\u0169\3\2"+
		"\2\2\u0170\u016d\3\2\2\2\u0170\u016e\3\2\2\2\u0171?\3\2\2\2\u0172\u0173"+
		"\t\2\2\2\u0173A\3\2\2\2\u0174\u0175\7,\2\2\u0175\u0179\5\34\17\2\u0176"+
		"\u0179\7-\2\2\u0177\u0179\7.\2\2\u0178\u0174\3\2\2\2\u0178\u0176\3\2\2"+
		"\2\u0178\u0177\3\2\2\2\u0179C\3\2\2\2\30Wain\u0089\u0095\u009a\u00a6\u00ac"+
		"\u00c3\u00d1\u00f1\u00f6\u0108\u0122\u0147\u0152\u0154\u0163\u0165\u0170"+
		"\u0178";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}