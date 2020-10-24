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
		RULE_varDimensionsInit = 10, RULE_statues = 11, RULE_statue = 12, RULE_semicolon = 13, 
		RULE_varDimensions = 14, RULE_asignation = 15, RULE_funcCall = 16, RULE_returnFunc = 17, 
		RULE_read = 18, RULE_write = 19, RULE_xwrite = 20, RULE_ywrite = 21, RULE_decision = 22, 
		RULE_xdecision = 23, RULE_forloop = 24, RULE_whileloop = 25, RULE_arguments = 26, 
		RULE_rarguments = 27, RULE_expresion = 28, RULE_lessThanOrEqualExp = 29, 
		RULE_greaterThanOrEqualExp = 30, RULE_equalsExp = 31, RULE_differentExp = 32, 
		RULE_andExp = 33, RULE_orExp = 34, RULE_lessThan = 35, RULE_greaterThan = 36, 
		RULE_notExp = 37, RULE_exp = 38, RULE_plus = 39, RULE_minus = 40, RULE_termino = 41, 
		RULE_mult = 42, RULE_div = 43, RULE_mod = 44, RULE_factor = 45, RULE_type = 46, 
		RULE_cte = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "varBlock", "vars", "rvars", "xvars", "yvars", "funcBlock", 
			"params", "rparams", "varDimensionsInit", "statues", "statue", "semicolon", 
			"varDimensions", "asignation", "funcCall", "returnFunc", "read", "write", 
			"xwrite", "ywrite", "decision", "xdecision", "forloop", "whileloop", 
			"arguments", "rarguments", "expresion", "lessThanOrEqualExp", "greaterThanOrEqualExp", 
			"equalsExp", "differentExp", "andExp", "orExp", "lessThan", "greaterThan", 
			"notExp", "exp", "plus", "minus", "termino", "mult", "div", "mod", "factor", 
			"type", "cte"
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
			setState(96);
			match(PROGRAM);
			setState(97);
			match(ID);
			setState(98);
			match(SEMICOLON);
			setState(99);
			varBlock();
			setState(100);
			funcBlock();
			setState(101);
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
			setState(103);
			match(MAIN);
			setState(104);
			match(LP);
			setState(105);
			match(RP);
			setState(106);
			match(LCB);
			setState(107);
			statues();
			setState(108);
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
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(VAR);
				setState(111);
				vars();
				setState(112);
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
			setState(117);
			type();
			setState(118);
			xvars();
			setState(119);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				vars();
				setState(122);
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(ID);
				setState(128);
				yvars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(ID);
				setState(130);
				varDimensionsInit();
				setState(131);
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(COMMA);
				setState(136);
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
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				type();
				setState(141);
				match(MODULE);
				setState(142);
				match(ID);
				setState(143);
				match(LP);
				setState(144);
				params();
				setState(145);
				match(RP);
				setState(146);
				varBlock();
				setState(147);
				match(LCB);
				setState(148);
				statues();
				setState(149);
				match(RCB);
				setState(150);
				funcBlock();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(VOID);
				setState(153);
				match(MODULE);
				setState(154);
				match(ID);
				setState(155);
				match(LP);
				setState(156);
				params();
				setState(157);
				match(RP);
				setState(158);
				varBlock();
				setState(159);
				match(LCB);
				setState(160);
				statues();
				setState(161);
				match(RCB);
				setState(162);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				type();
				setState(168);
				match(ID);
				setState(169);
				rparams();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				type();
				setState(172);
				match(ID);
				setState(173);
				varDimensionsInit();
				setState(174);
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
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(COMMA);
				setState(180);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(LB);
				setState(185);
				match(INT);
				setState(186);
				match(RB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(LB);
				setState(188);
				match(INT);
				setState(189);
				match(RB);
				setState(190);
				match(LB);
				setState(191);
				match(INT);
				setState(192);
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
			setState(200);
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
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				statue();
				setState(197);
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
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
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
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				asignation();
				setState(203);
				semicolon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				funcCall();
				setState(206);
				semicolon();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				returnFunc();
				setState(209);
				semicolon();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				read();
				setState(212);
				semicolon();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				write();
				setState(215);
				semicolon();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				decision();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(218);
				whileloop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(219);
				forloop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(220);
				expresion();
				setState(221);
				semicolon();
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

	public static class SemicolonContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ParPlusPlusParser.SEMICOLON, 0); }
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
		enterRule(_localctx, 28, RULE_varDimensions);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(LB);
				setState(228);
				expresion();
				setState(229);
				match(RB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(LB);
				setState(232);
				expresion();
				setState(233);
				match(RB);
				setState(234);
				match(LB);
				setState(235);
				expresion();
				setState(236);
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
		enterRule(_localctx, 30, RULE_asignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ID);
			setState(242);
			varDimensions();
			setState(243);
			match(ASSIGN);
			setState(244);
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
		enterRule(_localctx, 32, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(ID);
			setState(247);
			match(LP);
			setState(248);
			arguments();
			setState(249);
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
		enterRule(_localctx, 34, RULE_returnFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(RETURN);
			setState(252);
			match(LP);
			setState(253);
			expresion();
			setState(254);
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
		enterRule(_localctx, 36, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(READ);
			setState(257);
			match(LP);
			setState(258);
			xvars();
			setState(259);
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
		enterRule(_localctx, 38, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(WRITE);
			setState(262);
			match(LP);
			setState(263);
			xwrite();
			setState(264);
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
		enterRule(_localctx, 40, RULE_xwrite);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				expresion();
				setState(267);
				ywrite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(STRING);
				setState(270);
				ywrite();
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
		enterRule(_localctx, 42, RULE_ywrite);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(COMMA);
				setState(274);
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
		enterRule(_localctx, 44, RULE_decision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(IF);
			setState(279);
			match(LP);
			setState(280);
			expresion();
			setState(281);
			match(RP);
			setState(282);
			match(THEN);
			setState(283);
			match(LCB);
			setState(284);
			statues();
			setState(285);
			match(RCB);
			setState(286);
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
		enterRule(_localctx, 46, RULE_xdecision);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(ELSE);
				setState(289);
				match(LCB);
				setState(290);
				statues();
				setState(291);
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
			case STRING:
			case CHAR:
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
		enterRule(_localctx, 48, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(FOR);
			setState(297);
			asignation();
			setState(298);
			match(TO);
			setState(299);
			expresion();
			setState(300);
			match(DO);
			setState(301);
			match(LCB);
			setState(302);
			statues();
			setState(303);
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
		enterRule(_localctx, 50, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(WHILE);
			setState(306);
			match(LP);
			setState(307);
			expresion();
			setState(308);
			match(RP);
			setState(309);
			match(DO);
			setState(310);
			match(LCB);
			setState(311);
			statues();
			setState(312);
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
		enterRule(_localctx, 52, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			expresion();
			setState(315);
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
		enterRule(_localctx, 54, RULE_rarguments);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(COMMA);
				setState(318);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LessThanOrEqualExpContext lessThanOrEqualExp() {
			return getRuleContext(LessThanOrEqualExpContext.class,0);
		}
		public GreaterThanOrEqualExpContext greaterThanOrEqualExp() {
			return getRuleContext(GreaterThanOrEqualExpContext.class,0);
		}
		public EqualsExpContext equalsExp() {
			return getRuleContext(EqualsExpContext.class,0);
		}
		public DifferentExpContext differentExp() {
			return getRuleContext(DifferentExpContext.class,0);
		}
		public AndExpContext andExp() {
			return getRuleContext(AndExpContext.class,0);
		}
		public OrExpContext orExp() {
			return getRuleContext(OrExpContext.class,0);
		}
		public LessThanContext lessThan() {
			return getRuleContext(LessThanContext.class,0);
		}
		public GreaterThanContext greaterThan() {
			return getRuleContext(GreaterThanContext.class,0);
		}
		public NotExpContext notExp() {
			return getRuleContext(NotExpContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expresion);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				lessThanOrEqualExp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				greaterThanOrEqualExp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				equalsExp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				differentExp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(327);
				andExp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(328);
				orExp();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(329);
				lessThan();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(330);
				greaterThan();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(331);
				notExp();
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

	public static class LessThanOrEqualExpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(ParPlusPlusParser.LTEQ, 0); }
		public LessThanOrEqualExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanOrEqualExp; }
	}

	public final LessThanOrEqualExpContext lessThanOrEqualExp() throws RecognitionException {
		LessThanOrEqualExpContext _localctx = new LessThanOrEqualExpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lessThanOrEqualExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			exp(0);
			setState(335);
			match(LTEQ);
			setState(336);
			exp(0);
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

	public static class GreaterThanOrEqualExpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode GTEQ() { return getToken(ParPlusPlusParser.GTEQ, 0); }
		public GreaterThanOrEqualExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanOrEqualExp; }
	}

	public final GreaterThanOrEqualExpContext greaterThanOrEqualExp() throws RecognitionException {
		GreaterThanOrEqualExpContext _localctx = new GreaterThanOrEqualExpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_greaterThanOrEqualExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			exp(0);
			setState(339);
			match(GTEQ);
			setState(340);
			exp(0);
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

	public static class EqualsExpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ParPlusPlusParser.EQ, 0); }
		public EqualsExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsExp; }
	}

	public final EqualsExpContext equalsExp() throws RecognitionException {
		EqualsExpContext _localctx = new EqualsExpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_equalsExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			exp(0);
			setState(343);
			match(EQ);
			setState(344);
			exp(0);
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

	public static class DifferentExpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(ParPlusPlusParser.NEQ, 0); }
		public DifferentExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_differentExp; }
	}

	public final DifferentExpContext differentExp() throws RecognitionException {
		DifferentExpContext _localctx = new DifferentExpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_differentExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			exp(0);
			setState(347);
			match(NEQ);
			setState(348);
			exp(0);
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

	public static class AndExpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(ParPlusPlusParser.AND, 0); }
		public AndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExp; }
	}

	public final AndExpContext andExp() throws RecognitionException {
		AndExpContext _localctx = new AndExpContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_andExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			exp(0);
			setState(351);
			match(AND);
			setState(352);
			exp(0);
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

	public static class OrExpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OR() { return getToken(ParPlusPlusParser.OR, 0); }
		public OrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExp; }
	}

	public final OrExpContext orExp() throws RecognitionException {
		OrExpContext _localctx = new OrExpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_orExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			exp(0);
			setState(355);
			match(OR);
			setState(356);
			exp(0);
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

	public static class LessThanContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LT() { return getToken(ParPlusPlusParser.LT, 0); }
		public LessThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThan; }
	}

	public final LessThanContext lessThan() throws RecognitionException {
		LessThanContext _localctx = new LessThanContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lessThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			exp(0);
			setState(359);
			match(LT);
			setState(360);
			exp(0);
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

	public static class GreaterThanContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode GT() { return getToken(ParPlusPlusParser.GT, 0); }
		public GreaterThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThan; }
	}

	public final GreaterThanContext greaterThan() throws RecognitionException {
		GreaterThanContext _localctx = new GreaterThanContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_greaterThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			exp(0);
			setState(363);
			match(GT);
			setState(364);
			exp(0);
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

	public static class NotExpContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ParPlusPlusParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExp; }
	}

	public final NotExpContext notExp() throws RecognitionException {
		NotExpContext _localctx = new NotExpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_notExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(NOT);
			setState(367);
			exp(0);
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
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(370);
			termino(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(380);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(372);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(373);
						plus();
						setState(374);
						termino(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(376);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(377);
						minus();
						setState(378);
						termino(0);
						}
						break;
					}
					} 
				}
				setState(384);
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

	public static class PlusContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ParPlusPlusParser.PLUS, 0); }
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(PLUS);
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

	public static class MinusContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(ParPlusPlusParser.MINUS, 0); }
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(MINUS);
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

	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_termino, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(390);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(404);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(392);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(393);
						mult();
						setState(394);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(396);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(397);
						div();
						setState(398);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(400);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(401);
						mod();
						setState(402);
						factor();
						}
						break;
					}
					} 
				}
				setState(408);
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

	public static class MultContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(ParPlusPlusParser.MULT, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(MULT);
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

	public static class DivContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(ParPlusPlusParser.DIV, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(DIV);
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

	public static class ModContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(ParPlusPlusParser.MOD, 0); }
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(MOD);
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
		enterRule(_localctx, 90, RULE_factor);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(LP);
				setState(417);
				expresion();
				setState(418);
				match(RP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				cte();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				match(MINUS);
				setState(422);
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
		enterRule(_localctx, 92, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
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
		public TerminalNode STRING() { return getToken(ParPlusPlusParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(ParPlusPlusParser.CHAR, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_cte);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(ID);
				setState(428);
				varDimensions();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				match(STRING);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				match(CHAR);
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
		case 38:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 41:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01b6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4v\n\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0088\n"+
		"\7\3\b\3\b\3\b\5\b\u008d\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a8\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b4\n\n\3\13\3\13\3\13"+
		"\5\13\u00b9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c5\n\f"+
		"\3\r\3\r\3\r\3\r\5\r\u00cb\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00e2\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00f2\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u0112\n\26\3\27\3\27\3\27\5\27"+
		"\u0117\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0129\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\5\35\u0143\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u014f\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u017f\n(\f(\16(\u0182\13"+
		"(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u0197\n"+
		"+\f+\16+\u019a\13+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01aa"+
		"\n/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01b4\n\61\3\61\2\4N"+
		"T\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJLNPRTVXZ\\^`\2\3\3\2\3\5\2\u01b4\2b\3\2\2\2\4i\3\2\2\2\6u\3\2\2\2"+
		"\bw\3\2\2\2\n\177\3\2\2\2\f\u0087\3\2\2\2\16\u008c\3\2\2\2\20\u00a7\3"+
		"\2\2\2\22\u00b3\3\2\2\2\24\u00b8\3\2\2\2\26\u00c4\3\2\2\2\30\u00ca\3\2"+
		"\2\2\32\u00e1\3\2\2\2\34\u00e3\3\2\2\2\36\u00f1\3\2\2\2 \u00f3\3\2\2\2"+
		"\"\u00f8\3\2\2\2$\u00fd\3\2\2\2&\u0102\3\2\2\2(\u0107\3\2\2\2*\u0111\3"+
		"\2\2\2,\u0116\3\2\2\2.\u0118\3\2\2\2\60\u0128\3\2\2\2\62\u012a\3\2\2\2"+
		"\64\u0133\3\2\2\2\66\u013c\3\2\2\28\u0142\3\2\2\2:\u014e\3\2\2\2<\u0150"+
		"\3\2\2\2>\u0154\3\2\2\2@\u0158\3\2\2\2B\u015c\3\2\2\2D\u0160\3\2\2\2F"+
		"\u0164\3\2\2\2H\u0168\3\2\2\2J\u016c\3\2\2\2L\u0170\3\2\2\2N\u0173\3\2"+
		"\2\2P\u0183\3\2\2\2R\u0185\3\2\2\2T\u0187\3\2\2\2V\u019b\3\2\2\2X\u019d"+
		"\3\2\2\2Z\u019f\3\2\2\2\\\u01a9\3\2\2\2^\u01ab\3\2\2\2`\u01b3\3\2\2\2"+
		"bc\7\7\2\2cd\7,\2\2de\7\22\2\2ef\5\6\4\2fg\5\20\t\2gh\5\4\3\2h\3\3\2\2"+
		"\2ij\7\n\2\2jk\7\30\2\2kl\7\31\2\2lm\7\26\2\2mn\5\30\r\2no\7\27\2\2o\5"+
		"\3\2\2\2pq\7\t\2\2qr\5\b\5\2rs\5\n\6\2sv\3\2\2\2tv\3\2\2\2up\3\2\2\2u"+
		"t\3\2\2\2v\7\3\2\2\2wx\5^\60\2xy\5\f\7\2yz\7\22\2\2z\t\3\2\2\2{|\5\b\5"+
		"\2|}\5\n\6\2}\u0080\3\2\2\2~\u0080\3\2\2\2\177{\3\2\2\2\177~\3\2\2\2\u0080"+
		"\13\3\2\2\2\u0081\u0082\7,\2\2\u0082\u0088\5\16\b\2\u0083\u0084\7,\2\2"+
		"\u0084\u0085\5\26\f\2\u0085\u0086\5\16\b\2\u0086\u0088\3\2\2\2\u0087\u0081"+
		"\3\2\2\2\u0087\u0083\3\2\2\2\u0088\r\3\2\2\2\u0089\u008a\7\23\2\2\u008a"+
		"\u008d\5\f\7\2\u008b\u008d\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\17\3\2\2\2\u008e\u008f\5^\60\2\u008f\u0090\7\b\2\2\u0090\u0091"+
		"\7,\2\2\u0091\u0092\7\30\2\2\u0092\u0093\5\22\n\2\u0093\u0094\7\31\2\2"+
		"\u0094\u0095\5\6\4\2\u0095\u0096\7\26\2\2\u0096\u0097\5\30\r\2\u0097\u0098"+
		"\7\27\2\2\u0098\u0099\5\20\t\2\u0099\u00a8\3\2\2\2\u009a\u009b\7\6\2\2"+
		"\u009b\u009c\7\b\2\2\u009c\u009d\7,\2\2\u009d\u009e\7\30\2\2\u009e\u009f"+
		"\5\22\n\2\u009f\u00a0\7\31\2\2\u00a0\u00a1\5\6\4\2\u00a1\u00a2\7\26\2"+
		"\2\u00a2\u00a3\5\30\r\2\u00a3\u00a4\7\27\2\2\u00a4\u00a5\5\20\t\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u008e\3\2\2\2\u00a7\u009a\3\2"+
		"\2\2\u00a7\u00a6\3\2\2\2\u00a8\21\3\2\2\2\u00a9\u00aa\5^\60\2\u00aa\u00ab"+
		"\7,\2\2\u00ab\u00ac\5\24\13\2\u00ac\u00b4\3\2\2\2\u00ad\u00ae\5^\60\2"+
		"\u00ae\u00af\7,\2\2\u00af\u00b0\5\26\f\2\u00b0\u00b1\5\24\13\2\u00b1\u00b4"+
		"\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\23\3\2\2\2\u00b5\u00b6\7\23\2\2\u00b6\u00b9\5\22"+
		"\n\2\u00b7\u00b9\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\25\3\2\2\2\u00ba\u00bb\7\24\2\2\u00bb\u00bc\7-\2\2\u00bc\u00c5\7\25\2"+
		"\2\u00bd\u00be\7\24\2\2\u00be\u00bf\7-\2\2\u00bf\u00c0\7\25\2\2\u00c0"+
		"\u00c1\7\24\2\2\u00c1\u00c2\7-\2\2\u00c2\u00c5\7\25\2\2\u00c3\u00c5\3"+
		"\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\27\3\2\2\2\u00c6\u00c7\5\32\16\2\u00c7\u00c8\5\30\r\2\u00c8\u00cb\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\31\3\2\2\2\u00cc\u00cd\5 \21\2\u00cd\u00ce\5\34\17\2\u00ce\u00e2\3\2"+
		"\2\2\u00cf\u00d0\5\"\22\2\u00d0\u00d1\5\34\17\2\u00d1\u00e2\3\2\2\2\u00d2"+
		"\u00d3\5$\23\2\u00d3\u00d4\5\34\17\2\u00d4\u00e2\3\2\2\2\u00d5\u00d6\5"+
		"&\24\2\u00d6\u00d7\5\34\17\2\u00d7\u00e2\3\2\2\2\u00d8\u00d9\5(\25\2\u00d9"+
		"\u00da\5\34\17\2\u00da\u00e2\3\2\2\2\u00db\u00e2\5.\30\2\u00dc\u00e2\5"+
		"\64\33\2\u00dd\u00e2\5\62\32\2\u00de\u00df\5:\36\2\u00df\u00e0\5\34\17"+
		"\2\u00e0\u00e2\3\2\2\2\u00e1\u00cc\3\2\2\2\u00e1\u00cf\3\2\2\2\u00e1\u00d2"+
		"\3\2\2\2\u00e1\u00d5\3\2\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1"+
		"\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\33\3\2\2"+
		"\2\u00e3\u00e4\7\22\2\2\u00e4\35\3\2\2\2\u00e5\u00e6\7\24\2\2\u00e6\u00e7"+
		"\5:\36\2\u00e7\u00e8\7\25\2\2\u00e8\u00f2\3\2\2\2\u00e9\u00ea\7\24\2\2"+
		"\u00ea\u00eb\5:\36\2\u00eb\u00ec\7\25\2\2\u00ec\u00ed\7\24\2\2\u00ed\u00ee"+
		"\5:\36\2\u00ee\u00ef\7\25\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00f2\3\2\2\2"+
		"\u00f1\u00e5\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\37"+
		"\3\2\2\2\u00f3\u00f4\7,\2\2\u00f4\u00f5\5\36\20\2\u00f5\u00f6\7(\2\2\u00f6"+
		"\u00f7\5:\36\2\u00f7!\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9\u00fa\7\30\2\2"+
		"\u00fa\u00fb\5\66\34\2\u00fb\u00fc\7\31\2\2\u00fc#\3\2\2\2\u00fd\u00fe"+
		"\7\r\2\2\u00fe\u00ff\7\30\2\2\u00ff\u0100\5:\36\2\u0100\u0101\7\31\2\2"+
		"\u0101%\3\2\2\2\u0102\u0103\7\16\2\2\u0103\u0104\7\30\2\2\u0104\u0105"+
		"\5\f\7\2\u0105\u0106\7\31\2\2\u0106\'\3\2\2\2\u0107\u0108\7\17\2\2\u0108"+
		"\u0109\7\30\2\2\u0109\u010a\5*\26\2\u010a\u010b\7\31\2\2\u010b)\3\2\2"+
		"\2\u010c\u010d\5:\36\2\u010d\u010e\5,\27\2\u010e\u0112\3\2\2\2\u010f\u0110"+
		"\7/\2\2\u0110\u0112\5,\27\2\u0111\u010c\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"+\3\2\2\2\u0113\u0114\7\23\2\2\u0114\u0117\5*\26\2\u0115\u0117\3\2\2\2"+
		"\u0116\u0113\3\2\2\2\u0116\u0115\3\2\2\2\u0117-\3\2\2\2\u0118\u0119\7"+
		"\13\2\2\u0119\u011a\7\30\2\2\u011a\u011b\5:\36\2\u011b\u011c\7\31\2\2"+
		"\u011c\u011d\7\20\2\2\u011d\u011e\7\26\2\2\u011e\u011f\5\30\r\2\u011f"+
		"\u0120\7\27\2\2\u0120\u0121\5\60\31\2\u0121/\3\2\2\2\u0122\u0123\7\f\2"+
		"\2\u0123\u0124\7\26\2\2\u0124\u0125\5\30\r\2\u0125\u0126\7\27\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0127\3\2"+
		"\2\2\u0129\61\3\2\2\2\u012a\u012b\7)\2\2\u012b\u012c\5 \21\2\u012c\u012d"+
		"\7\21\2\2\u012d\u012e\5:\36\2\u012e\u012f\7+\2\2\u012f\u0130\7\26\2\2"+
		"\u0130\u0131\5\30\r\2\u0131\u0132\7\27\2\2\u0132\63\3\2\2\2\u0133\u0134"+
		"\7*\2\2\u0134\u0135\7\30\2\2\u0135\u0136\5:\36\2\u0136\u0137\7\31\2\2"+
		"\u0137\u0138\7+\2\2\u0138\u0139\7\26\2\2\u0139\u013a\5\30\r\2\u013a\u013b"+
		"\7\27\2\2\u013b\65\3\2\2\2\u013c\u013d\5:\36\2\u013d\u013e\58\35\2\u013e"+
		"\67\3\2\2\2\u013f\u0140\7\23\2\2\u0140\u0143\5\66\34\2\u0141\u0143\3\2"+
		"\2\2\u0142\u013f\3\2\2\2\u0142\u0141\3\2\2\2\u01439\3\2\2\2\u0144\u014f"+
		"\5N(\2\u0145\u014f\5<\37\2\u0146\u014f\5> \2\u0147\u014f\5@!\2\u0148\u014f"+
		"\5B\"\2\u0149\u014f\5D#\2\u014a\u014f\5F$\2\u014b\u014f\5H%\2\u014c\u014f"+
		"\5J&\2\u014d\u014f\5L\'\2\u014e\u0144\3\2\2\2\u014e\u0145\3\2\2\2\u014e"+
		"\u0146\3\2\2\2\u014e\u0147\3\2\2\2\u014e\u0148\3\2\2\2\u014e\u0149\3\2"+
		"\2\2\u014e\u014a\3\2\2\2\u014e\u014b\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014d\3\2\2\2\u014f;\3\2\2\2\u0150\u0151\5N(\2\u0151\u0152\7!\2\2\u0152"+
		"\u0153\5N(\2\u0153=\3\2\2\2\u0154\u0155\5N(\2\u0155\u0156\7 \2\2\u0156"+
		"\u0157\5N(\2\u0157?\3\2\2\2\u0158\u0159\5N(\2\u0159\u015a\7\37\2\2\u015a"+
		"\u015b\5N(\2\u015bA\3\2\2\2\u015c\u015d\5N(\2\u015d\u015e\7\"\2\2\u015e"+
		"\u015f\5N(\2\u015fC\3\2\2\2\u0160\u0161\5N(\2\u0161\u0162\7%\2\2\u0162"+
		"\u0163\5N(\2\u0163E\3\2\2\2\u0164\u0165\5N(\2\u0165\u0166\7$\2\2\u0166"+
		"\u0167\5N(\2\u0167G\3\2\2\2\u0168\u0169\5N(\2\u0169\u016a\7\'\2\2\u016a"+
		"\u016b\5N(\2\u016bI\3\2\2\2\u016c\u016d\5N(\2\u016d\u016e\7&\2\2\u016e"+
		"\u016f\5N(\2\u016fK\3\2\2\2\u0170\u0171\7#\2\2\u0171\u0172\5N(\2\u0172"+
		"M\3\2\2\2\u0173\u0174\b(\1\2\u0174\u0175\5T+\2\u0175\u0180\3\2\2\2\u0176"+
		"\u0177\f\5\2\2\u0177\u0178\5P)\2\u0178\u0179\5T+\2\u0179\u017f\3\2\2\2"+
		"\u017a\u017b\f\4\2\2\u017b\u017c\5R*\2\u017c\u017d\5T+\2\u017d\u017f\3"+
		"\2\2\2\u017e\u0176\3\2\2\2\u017e\u017a\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181O\3\2\2\2\u0182\u0180\3\2\2\2"+
		"\u0183\u0184\7\32\2\2\u0184Q\3\2\2\2\u0185\u0186\7\33\2\2\u0186S\3\2\2"+
		"\2\u0187\u0188\b+\1\2\u0188\u0189\5\\/\2\u0189\u0198\3\2\2\2\u018a\u018b"+
		"\f\6\2\2\u018b\u018c\5V,\2\u018c\u018d\5\\/\2\u018d\u0197\3\2\2\2\u018e"+
		"\u018f\f\5\2\2\u018f\u0190\5X-\2\u0190\u0191\5\\/\2\u0191\u0197\3\2\2"+
		"\2\u0192\u0193\f\4\2\2\u0193\u0194\5Z.\2\u0194\u0195\5\\/\2\u0195\u0197"+
		"\3\2\2\2\u0196\u018a\3\2\2\2\u0196\u018e\3\2\2\2\u0196\u0192\3\2\2\2\u0197"+
		"\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199U\3\2\2\2"+
		"\u019a\u0198\3\2\2\2\u019b\u019c\7\34\2\2\u019cW\3\2\2\2\u019d\u019e\7"+
		"\35\2\2\u019eY\3\2\2\2\u019f\u01a0\7\36\2\2\u01a0[\3\2\2\2\u01a1\u01aa"+
		"\5\"\22\2\u01a2\u01a3\7\30\2\2\u01a3\u01a4\5:\36\2\u01a4\u01a5\7\31\2"+
		"\2\u01a5\u01aa\3\2\2\2\u01a6\u01aa\5`\61\2\u01a7\u01a8\7\33\2\2\u01a8"+
		"\u01aa\5`\61\2\u01a9\u01a1\3\2\2\2\u01a9\u01a2\3\2\2\2\u01a9\u01a6\3\2"+
		"\2\2\u01a9\u01a7\3\2\2\2\u01aa]\3\2\2\2\u01ab\u01ac\t\2\2\2\u01ac_\3\2"+
		"\2\2\u01ad\u01ae\7,\2\2\u01ae\u01b4\5\36\20\2\u01af\u01b4\7-\2\2\u01b0"+
		"\u01b4\7.\2\2\u01b1\u01b4\7/\2\2\u01b2\u01b4\7\60\2\2\u01b3\u01ad\3\2"+
		"\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b2\3\2\2\2\u01b4a\3\2\2\2\30u\177\u0087\u008c\u00a7\u00b3\u00b8\u00c4"+
		"\u00ca\u00e1\u00f1\u0111\u0116\u0128\u0142\u014e\u017e\u0180\u0196\u0198"+
		"\u01a9\u01b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}