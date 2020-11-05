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
		RULE_xvars = 5, RULE_yvars = 6, RULE_funcBlock = 7, RULE_funcEnd = 8, 
		RULE_funcType = 9, RULE_params = 10, RULE_rparams = 11, RULE_varDimensionsInit = 12, 
		RULE_statues = 13, RULE_statuesWithReturn = 14, RULE_statue = 15, RULE_semicolon = 16, 
		RULE_varDimensions = 17, RULE_asignation = 18, RULE_funcCall = 19, RULE_returnFunc = 20, 
		RULE_read = 21, RULE_write = 22, RULE_xwrite = 23, RULE_ywrite = 24, RULE_decision = 25, 
		RULE_decisiontwo = 26, RULE_xdecision = 27, RULE_forloop = 28, RULE_forlooptwo = 29, 
		RULE_forloopthree = 30, RULE_whileloop = 31, RULE_whilelooptwo = 32, RULE_whileloopthree = 33, 
		RULE_arguments = 34, RULE_rarguments = 35, RULE_expresion = 36, RULE_lessThanOrEqualExp = 37, 
		RULE_greaterThanOrEqualExp = 38, RULE_equalsExp = 39, RULE_differentExp = 40, 
		RULE_andExp = 41, RULE_orExp = 42, RULE_lessThan = 43, RULE_greaterThan = 44, 
		RULE_notExp = 45, RULE_exp = 46, RULE_plus = 47, RULE_minus = 48, RULE_termino = 49, 
		RULE_mult = 50, RULE_div = 51, RULE_mod = 52, RULE_factor = 53, RULE_type = 54, 
		RULE_cte = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "varBlock", "vars", "rvars", "xvars", "yvars", "funcBlock", 
			"funcEnd", "funcType", "params", "rparams", "varDimensionsInit", "statues", 
			"statuesWithReturn", "statue", "semicolon", "varDimensions", "asignation", 
			"funcCall", "returnFunc", "read", "write", "xwrite", "ywrite", "decision", 
			"decisiontwo", "xdecision", "forloop", "forlooptwo", "forloopthree", 
			"whileloop", "whilelooptwo", "whileloopthree", "arguments", "rarguments", 
			"expresion", "lessThanOrEqualExp", "greaterThanOrEqualExp", "equalsExp", 
			"differentExp", "andExp", "orExp", "lessThan", "greaterThan", "notExp", 
			"exp", "plus", "minus", "termino", "mult", "div", "mod", "factor", "type", 
			"cte"
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
			setState(112);
			match(PROGRAM);
			setState(113);
			match(ID);
			setState(114);
			match(SEMICOLON);
			setState(115);
			varBlock();
			setState(116);
			funcBlock();
			setState(117);
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
			setState(119);
			match(MAIN);
			setState(120);
			match(LP);
			setState(121);
			match(RP);
			setState(122);
			match(LCB);
			setState(123);
			statues();
			setState(124);
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(VAR);
				setState(127);
				vars();
				setState(128);
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
			setState(133);
			type();
			setState(134);
			xvars();
			setState(135);
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				vars();
				setState(138);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(ID);
				setState(144);
				yvars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(ID);
				setState(146);
				varDimensionsInit();
				setState(147);
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(COMMA);
				setState(152);
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
		public StatuesWithReturnContext statuesWithReturn() {
			return getRuleContext(StatuesWithReturnContext.class,0);
		}
		public TerminalNode RCB() { return getToken(ParPlusPlusParser.RCB, 0); }
		public FuncEndContext funcEnd() {
			return getRuleContext(FuncEndContext.class,0);
		}
		public FuncBlockContext funcBlock() {
			return getRuleContext(FuncBlockContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ParPlusPlusParser.VOID, 0); }
		public StatuesContext statues() {
			return getRuleContext(StatuesContext.class,0);
		}
		public FuncBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBlock; }
	}

	public final FuncBlockContext funcBlock() throws RecognitionException {
		FuncBlockContext _localctx = new FuncBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcBlock);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				type();
				setState(157);
				match(MODULE);
				setState(158);
				match(ID);
				setState(159);
				match(LP);
				setState(160);
				params();
				setState(161);
				match(RP);
				setState(162);
				varBlock();
				setState(163);
				match(LCB);
				setState(164);
				statuesWithReturn();
				setState(165);
				match(RCB);
				setState(166);
				funcEnd();
				setState(167);
				funcBlock();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(VOID);
				setState(170);
				match(MODULE);
				setState(171);
				match(ID);
				setState(172);
				match(LP);
				setState(173);
				params();
				setState(174);
				match(RP);
				setState(175);
				varBlock();
				setState(176);
				match(LCB);
				setState(177);
				statues();
				setState(178);
				match(RCB);
				setState(179);
				funcEnd();
				setState(180);
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

	public static class FuncEndContext extends ParserRuleContext {
		public FuncEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcEnd; }
	}

	public final FuncEndContext funcEnd() throws RecognitionException {
		FuncEndContext _localctx = new FuncEndContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ParPlusPlusParser.VOID, 0); }
		public FuncTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcType; }
	}

	public final FuncTypeContext funcType() throws RecognitionException {
		FuncTypeContext _localctx = new FuncTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcType);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(VOID);
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
		enterRule(_localctx, 20, RULE_params);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				type();
				setState(192);
				match(ID);
				setState(193);
				rparams();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				type();
				setState(196);
				match(ID);
				setState(197);
				varDimensionsInit();
				setState(198);
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
		enterRule(_localctx, 22, RULE_rparams);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(COMMA);
				setState(204);
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
		enterRule(_localctx, 24, RULE_varDimensionsInit);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(LB);
				setState(209);
				match(INT);
				setState(210);
				match(RB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(LB);
				setState(212);
				match(INT);
				setState(213);
				match(RB);
				setState(214);
				match(LB);
				setState(215);
				match(INT);
				setState(216);
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
		enterRule(_localctx, 26, RULE_statues);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
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
				setState(220);
				statue();
				setState(221);
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

	public static class StatuesWithReturnContext extends ParserRuleContext {
		public StatueContext statue() {
			return getRuleContext(StatueContext.class,0);
		}
		public StatuesWithReturnContext statuesWithReturn() {
			return getRuleContext(StatuesWithReturnContext.class,0);
		}
		public ReturnFuncContext returnFunc() {
			return getRuleContext(ReturnFuncContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public StatuesWithReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statuesWithReturn; }
	}

	public final StatuesWithReturnContext statuesWithReturn() throws RecognitionException {
		StatuesWithReturnContext _localctx = new StatuesWithReturnContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statuesWithReturn);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
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
				setState(226);
				statue();
				setState(227);
				statuesWithReturn();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				returnFunc();
				setState(230);
				semicolon();
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
		enterRule(_localctx, 30, RULE_statue);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				asignation();
				setState(235);
				semicolon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				funcCall();
				setState(238);
				semicolon();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				read();
				setState(241);
				semicolon();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				write();
				setState(244);
				semicolon();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				decision();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				whileloop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(248);
				forloop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				expresion();
				setState(250);
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
		enterRule(_localctx, 32, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 34, RULE_varDimensions);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(LB);
				setState(257);
				expresion();
				setState(258);
				match(RB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(LB);
				setState(261);
				expresion();
				setState(262);
				match(RB);
				setState(263);
				match(LB);
				setState(264);
				expresion();
				setState(265);
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
		enterRule(_localctx, 36, RULE_asignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
			setState(271);
			varDimensions();
			setState(272);
			match(ASSIGN);
			setState(273);
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
		enterRule(_localctx, 38, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ID);
			setState(276);
			match(LP);
			setState(277);
			arguments();
			setState(278);
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
		enterRule(_localctx, 40, RULE_returnFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(RETURN);
			setState(281);
			match(LP);
			setState(282);
			expresion();
			setState(283);
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
		enterRule(_localctx, 42, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(READ);
			setState(286);
			match(LP);
			setState(287);
			xvars();
			setState(288);
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
		enterRule(_localctx, 44, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(WRITE);
			setState(291);
			match(LP);
			setState(292);
			xwrite();
			setState(293);
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
		enterRule(_localctx, 46, RULE_xwrite);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				expresion();
				setState(296);
				ywrite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(STRING);
				setState(299);
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
		enterRule(_localctx, 48, RULE_ywrite);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(COMMA);
				setState(303);
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
		public DecisiontwoContext decisiontwo() {
			return getRuleContext(DecisiontwoContext.class,0);
		}
		public DecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decision; }
	}

	public final DecisionContext decision() throws RecognitionException {
		DecisionContext _localctx = new DecisionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_decision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(IF);
			setState(308);
			match(LP);
			setState(309);
			expresion();
			setState(310);
			match(RP);
			setState(311);
			decisiontwo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecisiontwoContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(ParPlusPlusParser.THEN, 0); }
		public TerminalNode LCB() { return getToken(ParPlusPlusParser.LCB, 0); }
		public StatuesContext statues() {
			return getRuleContext(StatuesContext.class,0);
		}
		public TerminalNode RCB() { return getToken(ParPlusPlusParser.RCB, 0); }
		public XdecisionContext xdecision() {
			return getRuleContext(XdecisionContext.class,0);
		}
		public DecisiontwoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decisiontwo; }
	}

	public final DecisiontwoContext decisiontwo() throws RecognitionException {
		DecisiontwoContext _localctx = new DecisiontwoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_decisiontwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(THEN);
			setState(314);
			match(LCB);
			setState(315);
			statues();
			setState(316);
			match(RCB);
			setState(317);
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
		enterRule(_localctx, 54, RULE_xdecision);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(ELSE);
				setState(320);
				match(LCB);
				setState(321);
				statues();
				setState(322);
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
		public ForlooptwoContext forlooptwo() {
			return getRuleContext(ForlooptwoContext.class,0);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(FOR);
			setState(328);
			asignation();
			setState(329);
			forlooptwo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForlooptwoContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(ParPlusPlusParser.TO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ForloopthreeContext forloopthree() {
			return getRuleContext(ForloopthreeContext.class,0);
		}
		public ForlooptwoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forlooptwo; }
	}

	public final ForlooptwoContext forlooptwo() throws RecognitionException {
		ForlooptwoContext _localctx = new ForlooptwoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forlooptwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(TO);
			setState(332);
			expresion();
			setState(333);
			forloopthree();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForloopthreeContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ParPlusPlusParser.DO, 0); }
		public TerminalNode LCB() { return getToken(ParPlusPlusParser.LCB, 0); }
		public StatuesContext statues() {
			return getRuleContext(StatuesContext.class,0);
		}
		public TerminalNode RCB() { return getToken(ParPlusPlusParser.RCB, 0); }
		public ForloopthreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloopthree; }
	}

	public final ForloopthreeContext forloopthree() throws RecognitionException {
		ForloopthreeContext _localctx = new ForloopthreeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forloopthree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(DO);
			setState(336);
			match(LCB);
			setState(337);
			statues();
			setState(338);
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
		public WhilelooptwoContext whilelooptwo() {
			return getRuleContext(WhilelooptwoContext.class,0);
		}
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(WHILE);
			setState(341);
			whilelooptwo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilelooptwoContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ParPlusPlusParser.LP, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ParPlusPlusParser.RP, 0); }
		public WhileloopthreeContext whileloopthree() {
			return getRuleContext(WhileloopthreeContext.class,0);
		}
		public WhilelooptwoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilelooptwo; }
	}

	public final WhilelooptwoContext whilelooptwo() throws RecognitionException {
		WhilelooptwoContext _localctx = new WhilelooptwoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_whilelooptwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(LP);
			setState(344);
			expresion();
			setState(345);
			match(RP);
			setState(346);
			whileloopthree();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileloopthreeContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ParPlusPlusParser.DO, 0); }
		public TerminalNode LCB() { return getToken(ParPlusPlusParser.LCB, 0); }
		public StatuesContext statues() {
			return getRuleContext(StatuesContext.class,0);
		}
		public TerminalNode RCB() { return getToken(ParPlusPlusParser.RCB, 0); }
		public WhileloopthreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloopthree; }
	}

	public final WhileloopthreeContext whileloopthree() throws RecognitionException {
		WhileloopthreeContext _localctx = new WhileloopthreeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whileloopthree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(DO);
			setState(349);
			match(LCB);
			setState(350);
			statues();
			setState(351);
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
		enterRule(_localctx, 68, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			expresion();
			setState(354);
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
		enterRule(_localctx, 70, RULE_rarguments);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(COMMA);
				setState(357);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expresion);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				exp(0);
				setState(363);
				lessThanOrEqualExp();
				setState(364);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				exp(0);
				setState(367);
				greaterThanOrEqualExp();
				setState(368);
				exp(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				exp(0);
				setState(371);
				equalsExp();
				setState(372);
				exp(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				exp(0);
				setState(375);
				differentExp();
				setState(376);
				exp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(378);
				exp(0);
				setState(379);
				andExp();
				setState(380);
				exp(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(382);
				exp(0);
				setState(383);
				orExp();
				setState(384);
				exp(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(386);
				exp(0);
				setState(387);
				lessThan();
				setState(388);
				exp(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(390);
				exp(0);
				setState(391);
				greaterThan();
				setState(392);
				exp(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(394);
				notExp();
				setState(395);
				expresion();
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
		public TerminalNode LTEQ() { return getToken(ParPlusPlusParser.LTEQ, 0); }
		public LessThanOrEqualExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanOrEqualExp; }
	}

	public final LessThanOrEqualExpContext lessThanOrEqualExp() throws RecognitionException {
		LessThanOrEqualExpContext _localctx = new LessThanOrEqualExpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lessThanOrEqualExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(LTEQ);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode GTEQ() { return getToken(ParPlusPlusParser.GTEQ, 0); }
		public GreaterThanOrEqualExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanOrEqualExp; }
	}

	public final GreaterThanOrEqualExpContext greaterThanOrEqualExp() throws RecognitionException {
		GreaterThanOrEqualExpContext _localctx = new GreaterThanOrEqualExpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_greaterThanOrEqualExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(GTEQ);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode EQ() { return getToken(ParPlusPlusParser.EQ, 0); }
		public EqualsExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsExp; }
	}

	public final EqualsExpContext equalsExp() throws RecognitionException {
		EqualsExpContext _localctx = new EqualsExpContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_equalsExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(EQ);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode NEQ() { return getToken(ParPlusPlusParser.NEQ, 0); }
		public DifferentExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_differentExp; }
	}

	public final DifferentExpContext differentExp() throws RecognitionException {
		DifferentExpContext _localctx = new DifferentExpContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_differentExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(NEQ);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode AND() { return getToken(ParPlusPlusParser.AND, 0); }
		public AndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExp; }
	}

	public final AndExpContext andExp() throws RecognitionException {
		AndExpContext _localctx = new AndExpContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_andExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(AND);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OR() { return getToken(ParPlusPlusParser.OR, 0); }
		public OrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExp; }
	}

	public final OrExpContext orExp() throws RecognitionException {
		OrExpContext _localctx = new OrExpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_orExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(OR);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LT() { return getToken(ParPlusPlusParser.LT, 0); }
		public LessThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThan; }
	}

	public final LessThanContext lessThan() throws RecognitionException {
		LessThanContext _localctx = new LessThanContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lessThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(LT);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode GT() { return getToken(ParPlusPlusParser.GT, 0); }
		public GreaterThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThan; }
	}

	public final GreaterThanContext greaterThan() throws RecognitionException {
		GreaterThanContext _localctx = new GreaterThanContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_greaterThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(GT);
			}
		}
		catch (RecognitionException re) {
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
		public NotExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExp; }
	}

	public final NotExpContext notExp() throws RecognitionException {
		NotExpContext _localctx = new NotExpContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_notExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(NOT);
			}
		}
		catch (RecognitionException re) {
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(418);
			termino(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(420);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(421);
						plus();
						setState(422);
						termino(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(424);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(425);
						minus();
						setState(426);
						termino(0);
						}
						break;
					}
					} 
				}
				setState(432);
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

	public static class PlusContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ParPlusPlusParser.PLUS, 0); }
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		enterRule(_localctx, 96, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_termino, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(438);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(452);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(440);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(441);
						mult();
						setState(442);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(444);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(445);
						div();
						setState(446);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(448);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(449);
						mod();
						setState(450);
						factor();
						}
						break;
					}
					} 
				}
				setState(456);
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

	public static class MultContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(ParPlusPlusParser.MULT, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
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
		enterRule(_localctx, 102, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
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
		enterRule(_localctx, 104, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
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
		enterRule(_localctx, 106, RULE_factor);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(LP);
				setState(465);
				expresion();
				setState(466);
				match(RP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				cte();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(469);
				match(MINUS);
				setState(470);
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
		enterRule(_localctx, 108, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
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
		enterRule(_localctx, 110, RULE_cte);
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				match(ID);
				setState(476);
				varDimensions();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				match(STRING);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
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
		case 46:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 49:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01e6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\u0086\n\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0090\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u0098\n\7\3\b\3\b\3\b\5\b\u009d\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00ba\n\t\3\n\3\n\3\13\3\13\5\13\u00c0\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cc\n\f\3\r\3\r\3\r\5\r\u00d1\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00dd\n\16\3\17\3\17"+
		"\3\17\3\17\5\17\u00e3\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00eb\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00ff\n\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u010f\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u012f\n\31\3\32\3\32\3\32\5\32\u0134\n\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0148"+
		"\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\5%\u016a\n%\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0190\n&\3\'\3\'\3(\3(\3)\3)\3*"+
		"\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\7\60\u01af\n\60\f\60\16\60\u01b2\13\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\7\63\u01c7\n\63\f\63\16\63\u01ca\13\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u01da\n\67"+
		"\38\38\39\39\39\39\39\39\59\u01e4\n9\39\2\4^d:\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\3"+
		"\3\2\3\5\2\u01dd\2r\3\2\2\2\4y\3\2\2\2\6\u0085\3\2\2\2\b\u0087\3\2\2\2"+
		"\n\u008f\3\2\2\2\f\u0097\3\2\2\2\16\u009c\3\2\2\2\20\u00b9\3\2\2\2\22"+
		"\u00bb\3\2\2\2\24\u00bf\3\2\2\2\26\u00cb\3\2\2\2\30\u00d0\3\2\2\2\32\u00dc"+
		"\3\2\2\2\34\u00e2\3\2\2\2\36\u00ea\3\2\2\2 \u00fe\3\2\2\2\"\u0100\3\2"+
		"\2\2$\u010e\3\2\2\2&\u0110\3\2\2\2(\u0115\3\2\2\2*\u011a\3\2\2\2,\u011f"+
		"\3\2\2\2.\u0124\3\2\2\2\60\u012e\3\2\2\2\62\u0133\3\2\2\2\64\u0135\3\2"+
		"\2\2\66\u013b\3\2\2\28\u0147\3\2\2\2:\u0149\3\2\2\2<\u014d\3\2\2\2>\u0151"+
		"\3\2\2\2@\u0156\3\2\2\2B\u0159\3\2\2\2D\u015e\3\2\2\2F\u0163\3\2\2\2H"+
		"\u0169\3\2\2\2J\u018f\3\2\2\2L\u0191\3\2\2\2N\u0193\3\2\2\2P\u0195\3\2"+
		"\2\2R\u0197\3\2\2\2T\u0199\3\2\2\2V\u019b\3\2\2\2X\u019d\3\2\2\2Z\u019f"+
		"\3\2\2\2\\\u01a1\3\2\2\2^\u01a3\3\2\2\2`\u01b3\3\2\2\2b\u01b5\3\2\2\2"+
		"d\u01b7\3\2\2\2f\u01cb\3\2\2\2h\u01cd\3\2\2\2j\u01cf\3\2\2\2l\u01d9\3"+
		"\2\2\2n\u01db\3\2\2\2p\u01e3\3\2\2\2rs\7\7\2\2st\7,\2\2tu\7\22\2\2uv\5"+
		"\6\4\2vw\5\20\t\2wx\5\4\3\2x\3\3\2\2\2yz\7\n\2\2z{\7\30\2\2{|\7\31\2\2"+
		"|}\7\26\2\2}~\5\34\17\2~\177\7\27\2\2\177\5\3\2\2\2\u0080\u0081\7\t\2"+
		"\2\u0081\u0082\5\b\5\2\u0082\u0083\5\n\6\2\u0083\u0086\3\2\2\2\u0084\u0086"+
		"\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0084\3\2\2\2\u0086\7\3\2\2\2\u0087"+
		"\u0088\5n8\2\u0088\u0089\5\f\7\2\u0089\u008a\7\22\2\2\u008a\t\3\2\2\2"+
		"\u008b\u008c\5\b\5\2\u008c\u008d\5\n\6\2\u008d\u0090\3\2\2\2\u008e\u0090"+
		"\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008e\3\2\2\2\u0090\13\3\2\2\2\u0091"+
		"\u0092\7,\2\2\u0092\u0098\5\16\b\2\u0093\u0094\7,\2\2\u0094\u0095\5\32"+
		"\16\2\u0095\u0096\5\16\b\2\u0096\u0098\3\2\2\2\u0097\u0091\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0098\r\3\2\2\2\u0099\u009a\7\23\2\2\u009a\u009d\5\f\7"+
		"\2\u009b\u009d\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009b\3\2\2\2\u009d\17"+
		"\3\2\2\2\u009e\u009f\5n8\2\u009f\u00a0\7\b\2\2\u00a0\u00a1\7,\2\2\u00a1"+
		"\u00a2\7\30\2\2\u00a2\u00a3\5\26\f\2\u00a3\u00a4\7\31\2\2\u00a4\u00a5"+
		"\5\6\4\2\u00a5\u00a6\7\26\2\2\u00a6\u00a7\5\36\20\2\u00a7\u00a8\7\27\2"+
		"\2\u00a8\u00a9\5\22\n\2\u00a9\u00aa\5\20\t\2\u00aa\u00ba\3\2\2\2\u00ab"+
		"\u00ac\7\6\2\2\u00ac\u00ad\7\b\2\2\u00ad\u00ae\7,\2\2\u00ae\u00af\7\30"+
		"\2\2\u00af\u00b0\5\26\f\2\u00b0\u00b1\7\31\2\2\u00b1\u00b2\5\6\4\2\u00b2"+
		"\u00b3\7\26\2\2\u00b3\u00b4\5\34\17\2\u00b4\u00b5\7\27\2\2\u00b5\u00b6"+
		"\5\22\n\2\u00b6\u00b7\5\20\t\2\u00b7\u00ba\3\2\2\2\u00b8\u00ba\3\2\2\2"+
		"\u00b9\u009e\3\2\2\2\u00b9\u00ab\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\21"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\23\3\2\2\2\u00bd\u00c0\5n8\2\u00be"+
		"\u00c0\7\6\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\25\3\2\2"+
		"\2\u00c1\u00c2\5n8\2\u00c2\u00c3\7,\2\2\u00c3\u00c4\5\30\r\2\u00c4\u00cc"+
		"\3\2\2\2\u00c5\u00c6\5n8\2\u00c6\u00c7\7,\2\2\u00c7\u00c8\5\32\16\2\u00c8"+
		"\u00c9\5\30\r\2\u00c9\u00cc\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c1\3"+
		"\2\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\27\3\2\2\2\u00cd"+
		"\u00ce\7\23\2\2\u00ce\u00d1\5\26\f\2\u00cf\u00d1\3\2\2\2\u00d0\u00cd\3"+
		"\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\31\3\2\2\2\u00d2\u00d3\7\24\2\2\u00d3"+
		"\u00d4\7-\2\2\u00d4\u00dd\7\25\2\2\u00d5\u00d6\7\24\2\2\u00d6\u00d7\7"+
		"-\2\2\u00d7\u00d8\7\25\2\2\u00d8\u00d9\7\24\2\2\u00d9\u00da\7-\2\2\u00da"+
		"\u00dd\7\25\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d2\3\2\2\2\u00dc\u00d5\3"+
		"\2\2\2\u00dc\u00db\3\2\2\2\u00dd\33\3\2\2\2\u00de\u00df\5 \21\2\u00df"+
		"\u00e0\5\34\17\2\u00e0\u00e3\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00de\3"+
		"\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\35\3\2\2\2\u00e4\u00e5\5 \21\2\u00e5"+
		"\u00e6\5\36\20\2\u00e6\u00eb\3\2\2\2\u00e7\u00e8\5*\26\2\u00e8\u00e9\5"+
		"\"\22\2\u00e9\u00eb\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb"+
		"\37\3\2\2\2\u00ec\u00ed\5&\24\2\u00ed\u00ee\5\"\22\2\u00ee\u00ff\3\2\2"+
		"\2\u00ef\u00f0\5(\25\2\u00f0\u00f1\5\"\22\2\u00f1\u00ff\3\2\2\2\u00f2"+
		"\u00f3\5,\27\2\u00f3\u00f4\5\"\22\2\u00f4\u00ff\3\2\2\2\u00f5\u00f6\5"+
		".\30\2\u00f6\u00f7\5\"\22\2\u00f7\u00ff\3\2\2\2\u00f8\u00ff\5\64\33\2"+
		"\u00f9\u00ff\5@!\2\u00fa\u00ff\5:\36\2\u00fb\u00fc\5J&\2\u00fc\u00fd\5"+
		"\"\22\2\u00fd\u00ff\3\2\2\2\u00fe\u00ec\3\2\2\2\u00fe\u00ef\3\2\2\2\u00fe"+
		"\u00f2\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00f9\3\2"+
		"\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff!\3\2\2\2\u0100\u0101"+
		"\7\22\2\2\u0101#\3\2\2\2\u0102\u0103\7\24\2\2\u0103\u0104\5J&\2\u0104"+
		"\u0105\7\25\2\2\u0105\u010f\3\2\2\2\u0106\u0107\7\24\2\2\u0107\u0108\5"+
		"J&\2\u0108\u0109\7\25\2\2\u0109\u010a\7\24\2\2\u010a\u010b\5J&\2\u010b"+
		"\u010c\7\25\2\2\u010c\u010f\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0102\3"+
		"\2\2\2\u010e\u0106\3\2\2\2\u010e\u010d\3\2\2\2\u010f%\3\2\2\2\u0110\u0111"+
		"\7,\2\2\u0111\u0112\5$\23\2\u0112\u0113\7(\2\2\u0113\u0114\5J&\2\u0114"+
		"\'\3\2\2\2\u0115\u0116\7,\2\2\u0116\u0117\7\30\2\2\u0117\u0118\5F$\2\u0118"+
		"\u0119\7\31\2\2\u0119)\3\2\2\2\u011a\u011b\7\r\2\2\u011b\u011c\7\30\2"+
		"\2\u011c\u011d\5J&\2\u011d\u011e\7\31\2\2\u011e+\3\2\2\2\u011f\u0120\7"+
		"\16\2\2\u0120\u0121\7\30\2\2\u0121\u0122\5\f\7\2\u0122\u0123\7\31\2\2"+
		"\u0123-\3\2\2\2\u0124\u0125\7\17\2\2\u0125\u0126\7\30\2\2\u0126\u0127"+
		"\5\60\31\2\u0127\u0128\7\31\2\2\u0128/\3\2\2\2\u0129\u012a\5J&\2\u012a"+
		"\u012b\5\62\32\2\u012b\u012f\3\2\2\2\u012c\u012d\7/\2\2\u012d\u012f\5"+
		"\62\32\2\u012e\u0129\3\2\2\2\u012e\u012c\3\2\2\2\u012f\61\3\2\2\2\u0130"+
		"\u0131\7\23\2\2\u0131\u0134\5\60\31\2\u0132\u0134\3\2\2\2\u0133\u0130"+
		"\3\2\2\2\u0133\u0132\3\2\2\2\u0134\63\3\2\2\2\u0135\u0136\7\13\2\2\u0136"+
		"\u0137\7\30\2\2\u0137\u0138\5J&\2\u0138\u0139\7\31\2\2\u0139\u013a\5\66"+
		"\34\2\u013a\65\3\2\2\2\u013b\u013c\7\20\2\2\u013c\u013d\7\26\2\2\u013d"+
		"\u013e\5\34\17\2\u013e\u013f\7\27\2\2\u013f\u0140\58\35\2\u0140\67\3\2"+
		"\2\2\u0141\u0142\7\f\2\2\u0142\u0143\7\26\2\2\u0143\u0144\5\34\17\2\u0144"+
		"\u0145\7\27\2\2\u0145\u0148\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0141\3"+
		"\2\2\2\u0147\u0146\3\2\2\2\u01489\3\2\2\2\u0149\u014a\7)\2\2\u014a\u014b"+
		"\5&\24\2\u014b\u014c\5<\37\2\u014c;\3\2\2\2\u014d\u014e\7\21\2\2\u014e"+
		"\u014f\5J&\2\u014f\u0150\5> \2\u0150=\3\2\2\2\u0151\u0152\7+\2\2\u0152"+
		"\u0153\7\26\2\2\u0153\u0154\5\34\17\2\u0154\u0155\7\27\2\2\u0155?\3\2"+
		"\2\2\u0156\u0157\7*\2\2\u0157\u0158\5B\"\2\u0158A\3\2\2\2\u0159\u015a"+
		"\7\30\2\2\u015a\u015b\5J&\2\u015b\u015c\7\31\2\2\u015c\u015d\5D#\2\u015d"+
		"C\3\2\2\2\u015e\u015f\7+\2\2\u015f\u0160\7\26\2\2\u0160\u0161\5\34\17"+
		"\2\u0161\u0162\7\27\2\2\u0162E\3\2\2\2\u0163\u0164\5J&\2\u0164\u0165\5"+
		"H%\2\u0165G\3\2\2\2\u0166\u0167\7\23\2\2\u0167\u016a\5F$\2\u0168\u016a"+
		"\3\2\2\2\u0169\u0166\3\2\2\2\u0169\u0168\3\2\2\2\u016aI\3\2\2\2\u016b"+
		"\u0190\5^\60\2\u016c\u016d\5^\60\2\u016d\u016e\5L\'\2\u016e\u016f\5^\60"+
		"\2\u016f\u0190\3\2\2\2\u0170\u0171\5^\60\2\u0171\u0172\5N(\2\u0172\u0173"+
		"\5^\60\2\u0173\u0190\3\2\2\2\u0174\u0175\5^\60\2\u0175\u0176\5P)\2\u0176"+
		"\u0177\5^\60\2\u0177\u0190\3\2\2\2\u0178\u0179\5^\60\2\u0179\u017a\5R"+
		"*\2\u017a\u017b\5^\60\2\u017b\u0190\3\2\2\2\u017c\u017d\5^\60\2\u017d"+
		"\u017e\5T+\2\u017e\u017f\5^\60\2\u017f\u0190\3\2\2\2\u0180\u0181\5^\60"+
		"\2\u0181\u0182\5V,\2\u0182\u0183\5^\60\2\u0183\u0190\3\2\2\2\u0184\u0185"+
		"\5^\60\2\u0185\u0186\5X-\2\u0186\u0187\5^\60\2\u0187\u0190\3\2\2\2\u0188"+
		"\u0189\5^\60\2\u0189\u018a\5Z.\2\u018a\u018b\5^\60\2\u018b\u0190\3\2\2"+
		"\2\u018c\u018d\5\\/\2\u018d\u018e\5J&\2\u018e\u0190\3\2\2\2\u018f\u016b"+
		"\3\2\2\2\u018f\u016c\3\2\2\2\u018f\u0170\3\2\2\2\u018f\u0174\3\2\2\2\u018f"+
		"\u0178\3\2\2\2\u018f\u017c\3\2\2\2\u018f\u0180\3\2\2\2\u018f\u0184\3\2"+
		"\2\2\u018f\u0188\3\2\2\2\u018f\u018c\3\2\2\2\u0190K\3\2\2\2\u0191\u0192"+
		"\7!\2\2\u0192M\3\2\2\2\u0193\u0194\7 \2\2\u0194O\3\2\2\2\u0195\u0196\7"+
		"\37\2\2\u0196Q\3\2\2\2\u0197\u0198\7\"\2\2\u0198S\3\2\2\2\u0199\u019a"+
		"\7%\2\2\u019aU\3\2\2\2\u019b\u019c\7$\2\2\u019cW\3\2\2\2\u019d\u019e\7"+
		"\'\2\2\u019eY\3\2\2\2\u019f\u01a0\7&\2\2\u01a0[\3\2\2\2\u01a1\u01a2\7"+
		"#\2\2\u01a2]\3\2\2\2\u01a3\u01a4\b\60\1\2\u01a4\u01a5\5d\63\2\u01a5\u01b0"+
		"\3\2\2\2\u01a6\u01a7\f\5\2\2\u01a7\u01a8\5`\61\2\u01a8\u01a9\5d\63\2\u01a9"+
		"\u01af\3\2\2\2\u01aa\u01ab\f\4\2\2\u01ab\u01ac\5b\62\2\u01ac\u01ad\5d"+
		"\63\2\u01ad\u01af\3\2\2\2\u01ae\u01a6\3\2\2\2\u01ae\u01aa\3\2\2\2\u01af"+
		"\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1_\3\2\2\2"+
		"\u01b2\u01b0\3\2\2\2\u01b3\u01b4\7\32\2\2\u01b4a\3\2\2\2\u01b5\u01b6\7"+
		"\33\2\2\u01b6c\3\2\2\2\u01b7\u01b8\b\63\1\2\u01b8\u01b9\5l\67\2\u01b9"+
		"\u01c8\3\2\2\2\u01ba\u01bb\f\6\2\2\u01bb\u01bc\5f\64\2\u01bc\u01bd\5l"+
		"\67\2\u01bd\u01c7\3\2\2\2\u01be\u01bf\f\5\2\2\u01bf\u01c0\5h\65\2\u01c0"+
		"\u01c1\5l\67\2\u01c1\u01c7\3\2\2\2\u01c2\u01c3\f\4\2\2\u01c3\u01c4\5j"+
		"\66\2\u01c4\u01c5\5l\67\2\u01c5\u01c7\3\2\2\2\u01c6\u01ba\3\2\2\2\u01c6"+
		"\u01be\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2"+
		"\2\2\u01c8\u01c9\3\2\2\2\u01c9e\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc"+
		"\7\34\2\2\u01ccg\3\2\2\2\u01cd\u01ce\7\35\2\2\u01cei\3\2\2\2\u01cf\u01d0"+
		"\7\36\2\2\u01d0k\3\2\2\2\u01d1\u01da\5(\25\2\u01d2\u01d3\7\30\2\2\u01d3"+
		"\u01d4\5J&\2\u01d4\u01d5\7\31\2\2\u01d5\u01da\3\2\2\2\u01d6\u01da\5p9"+
		"\2\u01d7\u01d8\7\33\2\2\u01d8\u01da\5p9\2\u01d9\u01d1\3\2\2\2\u01d9\u01d2"+
		"\3\2\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01d7\3\2\2\2\u01dam\3\2\2\2\u01db"+
		"\u01dc\t\2\2\2\u01dco\3\2\2\2\u01dd\u01de\7,\2\2\u01de\u01e4\5$\23\2\u01df"+
		"\u01e4\7-\2\2\u01e0\u01e4\7.\2\2\u01e1\u01e4\7/\2\2\u01e2\u01e4\7\60\2"+
		"\2\u01e3\u01dd\3\2\2\2\u01e3\u01df\3\2\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e1"+
		"\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4q\3\2\2\2\32\u0085\u008f\u0097\u009c"+
		"\u00b9\u00bf\u00cb\u00d0\u00dc\u00e2\u00ea\u00fe\u010e\u012e\u0133\u0147"+
		"\u0169\u018f\u01ae\u01b0\u01c6\u01c8\u01d9\u01e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}