// Generated from /Users/User/Documents/ITC/Semestre7/Compis/Proy-Final/ParPlusPlus-Compiler/antlr4AutoGen/ParPlusPlus.g4 by ANTLR 4.8
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
		RULE_xvars = 5, RULE_yvars = 6, RULE_funcBlock = 7, RULE_funcType = 8, 
		RULE_params = 9, RULE_rparams = 10, RULE_varDimensionsInit = 11, RULE_statues = 12, 
		RULE_statuesWithReturn = 13, RULE_statue = 14, RULE_semicolon = 15, RULE_varDimensions = 16, 
		RULE_asignation = 17, RULE_funcCall = 18, RULE_returnFunc = 19, RULE_read = 20, 
		RULE_write = 21, RULE_xwrite = 22, RULE_ywrite = 23, RULE_decision = 24, 
		RULE_decisiontwo = 25, RULE_xdecision = 26, RULE_forloop = 27, RULE_forlooptwo = 28, 
		RULE_forloopthree = 29, RULE_whileloop = 30, RULE_whilelooptwo = 31, RULE_whileloopthree = 32, 
		RULE_arguments = 33, RULE_rarguments = 34, RULE_expresion = 35, RULE_lessThanOrEqualExp = 36, 
		RULE_greaterThanOrEqualExp = 37, RULE_equalsExp = 38, RULE_differentExp = 39, 
		RULE_andExp = 40, RULE_orExp = 41, RULE_lessThan = 42, RULE_greaterThan = 43, 
		RULE_notExp = 44, RULE_exp = 45, RULE_plus = 46, RULE_minus = 47, RULE_termino = 48, 
		RULE_mult = 49, RULE_div = 50, RULE_mod = 51, RULE_factor = 52, RULE_type = 53, 
		RULE_cte = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "varBlock", "vars", "rvars", "xvars", "yvars", "funcBlock", 
			"funcType", "params", "rparams", "varDimensionsInit", "statues", "statuesWithReturn", 
			"statue", "semicolon", "varDimensions", "asignation", "funcCall", "returnFunc", 
			"read", "write", "xwrite", "ywrite", "decision", "decisiontwo", "xdecision", 
			"forloop", "forlooptwo", "forloopthree", "whileloop", "whilelooptwo", 
			"whileloopthree", "arguments", "rarguments", "expresion", "lessThanOrEqualExp", 
			"greaterThanOrEqualExp", "equalsExp", "differentExp", "andExp", "orExp", 
			"lessThan", "greaterThan", "notExp", "exp", "plus", "minus", "termino", 
			"mult", "div", "mod", "factor", "type", "cte"
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
			setState(110);
			match(PROGRAM);
			setState(111);
			match(ID);
			setState(112);
			match(SEMICOLON);
			setState(113);
			varBlock();
			setState(114);
			funcBlock();
			setState(115);
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
			setState(117);
			match(MAIN);
			setState(118);
			match(LP);
			setState(119);
			match(RP);
			setState(120);
			match(LCB);
			setState(121);
			statues();
			setState(122);
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
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(VAR);
				setState(125);
				vars();
				setState(126);
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
			setState(131);
			type();
			setState(132);
			xvars();
			setState(133);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				vars();
				setState(136);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(ID);
				setState(142);
				yvars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(ID);
				setState(144);
				varDimensionsInit();
				setState(145);
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
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(COMMA);
				setState(150);
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
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				type();
				setState(155);
				match(MODULE);
				setState(156);
				match(ID);
				setState(157);
				match(LP);
				setState(158);
				params();
				setState(159);
				match(RP);
				setState(160);
				varBlock();
				setState(161);
				match(LCB);
				setState(162);
				statuesWithReturn();
				setState(163);
				match(RCB);
				setState(164);
				funcBlock();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(VOID);
				setState(167);
				match(MODULE);
				setState(168);
				match(ID);
				setState(169);
				match(LP);
				setState(170);
				params();
				setState(171);
				match(RP);
				setState(172);
				varBlock();
				setState(173);
				match(LCB);
				setState(174);
				statues();
				setState(175);
				match(RCB);
				setState(176);
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
		enterRule(_localctx, 16, RULE_funcType);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
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
		enterRule(_localctx, 18, RULE_params);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				type();
				setState(186);
				match(ID);
				setState(187);
				rparams();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				type();
				setState(190);
				match(ID);
				setState(191);
				varDimensionsInit();
				setState(192);
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
		enterRule(_localctx, 20, RULE_rparams);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(COMMA);
				setState(198);
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
		enterRule(_localctx, 22, RULE_varDimensionsInit);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(LB);
				setState(203);
				match(INT);
				setState(204);
				match(RB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(LB);
				setState(206);
				match(INT);
				setState(207);
				match(RB);
				setState(208);
				match(LB);
				setState(209);
				match(INT);
				setState(210);
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
		enterRule(_localctx, 24, RULE_statues);
		try {
			setState(218);
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
				setState(214);
				statue();
				setState(215);
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
		enterRule(_localctx, 26, RULE_statuesWithReturn);
		try {
			setState(226);
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
				statuesWithReturn();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				returnFunc();
				setState(224);
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
		enterRule(_localctx, 28, RULE_statue);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				asignation();
				setState(229);
				semicolon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				funcCall();
				setState(232);
				semicolon();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				read();
				setState(235);
				semicolon();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				write();
				setState(238);
				semicolon();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				decision();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				whileloop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				forloop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				expresion();
				setState(244);
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
		enterRule(_localctx, 30, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
		enterRule(_localctx, 32, RULE_varDimensions);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(LB);
				setState(251);
				expresion();
				setState(252);
				match(RB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(LB);
				setState(255);
				expresion();
				setState(256);
				match(RB);
				setState(257);
				match(LB);
				setState(258);
				expresion();
				setState(259);
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
		enterRule(_localctx, 34, RULE_asignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ID);
			setState(265);
			varDimensions();
			setState(266);
			match(ASSIGN);
			setState(267);
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
		enterRule(_localctx, 36, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(ID);
			setState(270);
			match(LP);
			setState(271);
			arguments();
			setState(272);
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
		enterRule(_localctx, 38, RULE_returnFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(RETURN);
			setState(275);
			match(LP);
			setState(276);
			expresion();
			setState(277);
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
		enterRule(_localctx, 40, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(READ);
			setState(280);
			match(LP);
			setState(281);
			xvars();
			setState(282);
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
		enterRule(_localctx, 42, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(WRITE);
			setState(285);
			match(LP);
			setState(286);
			xwrite();
			setState(287);
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
		enterRule(_localctx, 44, RULE_xwrite);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				expresion();
				setState(290);
				ywrite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(STRING);
				setState(293);
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
		enterRule(_localctx, 46, RULE_ywrite);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(COMMA);
				setState(297);
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
		enterRule(_localctx, 48, RULE_decision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(IF);
			setState(302);
			match(LP);
			setState(303);
			expresion();
			setState(304);
			match(RP);
			setState(305);
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
		enterRule(_localctx, 50, RULE_decisiontwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(THEN);
			setState(308);
			match(LCB);
			setState(309);
			statues();
			setState(310);
			match(RCB);
			setState(311);
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
		enterRule(_localctx, 52, RULE_xdecision);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(ELSE);
				setState(314);
				match(LCB);
				setState(315);
				statues();
				setState(316);
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
		enterRule(_localctx, 54, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(FOR);
			setState(322);
			asignation();
			setState(323);
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
		enterRule(_localctx, 56, RULE_forlooptwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(TO);
			setState(326);
			expresion();
			setState(327);
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
		enterRule(_localctx, 58, RULE_forloopthree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(DO);
			setState(330);
			match(LCB);
			setState(331);
			statues();
			setState(332);
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
		enterRule(_localctx, 60, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(WHILE);
			setState(335);
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
		enterRule(_localctx, 62, RULE_whilelooptwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(LP);
			setState(338);
			expresion();
			setState(339);
			match(RP);
			setState(340);
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
		enterRule(_localctx, 64, RULE_whileloopthree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(DO);
			setState(343);
			match(LCB);
			setState(344);
			statues();
			setState(345);
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
		enterRule(_localctx, 66, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			expresion();
			setState(348);
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
		enterRule(_localctx, 68, RULE_rarguments);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(COMMA);
				setState(351);
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
		enterRule(_localctx, 70, RULE_expresion);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				exp(0);
				setState(357);
				lessThanOrEqualExp();
				setState(358);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				exp(0);
				setState(361);
				greaterThanOrEqualExp();
				setState(362);
				exp(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				exp(0);
				setState(365);
				equalsExp();
				setState(366);
				exp(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				exp(0);
				setState(369);
				differentExp();
				setState(370);
				exp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(372);
				exp(0);
				setState(373);
				andExp();
				setState(374);
				exp(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(376);
				exp(0);
				setState(377);
				orExp();
				setState(378);
				exp(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(380);
				exp(0);
				setState(381);
				lessThan();
				setState(382);
				exp(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(384);
				exp(0);
				setState(385);
				greaterThan();
				setState(386);
				exp(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(388);
				notExp();
				setState(389);
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
		enterRule(_localctx, 72, RULE_lessThanOrEqualExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
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
		enterRule(_localctx, 74, RULE_greaterThanOrEqualExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
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
		enterRule(_localctx, 76, RULE_equalsExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
		enterRule(_localctx, 78, RULE_differentExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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
		enterRule(_localctx, 80, RULE_andExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
		enterRule(_localctx, 82, RULE_orExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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
		enterRule(_localctx, 84, RULE_lessThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		enterRule(_localctx, 86, RULE_greaterThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		enterRule(_localctx, 88, RULE_notExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(412);
			termino(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(422);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(414);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(415);
						plus();
						setState(416);
						termino(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(418);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(419);
						minus();
						setState(420);
						termino(0);
						}
						break;
					}
					} 
				}
				setState(426);
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
		enterRule(_localctx, 92, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
		enterRule(_localctx, 94, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_termino, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(432);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(448);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(446);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(434);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(435);
						mult();
						setState(436);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(438);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(439);
						div();
						setState(440);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(442);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(443);
						mod();
						setState(444);
						factor();
						}
						break;
					}
					} 
				}
				setState(450);
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
		enterRule(_localctx, 98, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
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
		enterRule(_localctx, 100, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
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
		enterRule(_localctx, 102, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
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
		enterRule(_localctx, 104, RULE_factor);
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(LP);
				setState(459);
				expresion();
				setState(460);
				match(RP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				cte();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				match(MINUS);
				setState(464);
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
		enterRule(_localctx, 106, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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
		enterRule(_localctx, 108, RULE_cte);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(ID);
				setState(470);
				varDimensions();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				match(STRING);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(474);
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
		case 45:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 48:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01e0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\u0084\n\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\5\6\u008e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0096"+
		"\n\7\3\b\3\b\3\b\5\b\u009b\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b6"+
		"\n\t\3\n\3\n\5\n\u00ba\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00c6\n\13\3\f\3\f\3\f\5\f\u00cb\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00d7\n\r\3\16\3\16\3\16\3\16\5\16\u00dd\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e5\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00f9\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0109\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u0129\n\30\3\31\3\31\3\31\5\31"+
		"\u012e\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0142\n\34\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\5$\u0164\n$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\5%\u018a\n%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,"+
		"\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u01a9\n/\f/\16/\u01ac"+
		"\13/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u01c1\n\62\f\62\16\62\u01c4\13\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u01d4\n\66\3\67\3\67\38\38\38\38\38\38\58\u01de\n8\38\2\4\\b9\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjln\2\3\3\2\3\5\2\u01d8\2p\3\2\2\2\4w\3\2\2\2\6\u0083\3"+
		"\2\2\2\b\u0085\3\2\2\2\n\u008d\3\2\2\2\f\u0095\3\2\2\2\16\u009a\3\2\2"+
		"\2\20\u00b5\3\2\2\2\22\u00b9\3\2\2\2\24\u00c5\3\2\2\2\26\u00ca\3\2\2\2"+
		"\30\u00d6\3\2\2\2\32\u00dc\3\2\2\2\34\u00e4\3\2\2\2\36\u00f8\3\2\2\2 "+
		"\u00fa\3\2\2\2\"\u0108\3\2\2\2$\u010a\3\2\2\2&\u010f\3\2\2\2(\u0114\3"+
		"\2\2\2*\u0119\3\2\2\2,\u011e\3\2\2\2.\u0128\3\2\2\2\60\u012d\3\2\2\2\62"+
		"\u012f\3\2\2\2\64\u0135\3\2\2\2\66\u0141\3\2\2\28\u0143\3\2\2\2:\u0147"+
		"\3\2\2\2<\u014b\3\2\2\2>\u0150\3\2\2\2@\u0153\3\2\2\2B\u0158\3\2\2\2D"+
		"\u015d\3\2\2\2F\u0163\3\2\2\2H\u0189\3\2\2\2J\u018b\3\2\2\2L\u018d\3\2"+
		"\2\2N\u018f\3\2\2\2P\u0191\3\2\2\2R\u0193\3\2\2\2T\u0195\3\2\2\2V\u0197"+
		"\3\2\2\2X\u0199\3\2\2\2Z\u019b\3\2\2\2\\\u019d\3\2\2\2^\u01ad\3\2\2\2"+
		"`\u01af\3\2\2\2b\u01b1\3\2\2\2d\u01c5\3\2\2\2f\u01c7\3\2\2\2h\u01c9\3"+
		"\2\2\2j\u01d3\3\2\2\2l\u01d5\3\2\2\2n\u01dd\3\2\2\2pq\7\7\2\2qr\7,\2\2"+
		"rs\7\22\2\2st\5\6\4\2tu\5\20\t\2uv\5\4\3\2v\3\3\2\2\2wx\7\n\2\2xy\7\30"+
		"\2\2yz\7\31\2\2z{\7\26\2\2{|\5\32\16\2|}\7\27\2\2}\5\3\2\2\2~\177\7\t"+
		"\2\2\177\u0080\5\b\5\2\u0080\u0081\5\n\6\2\u0081\u0084\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083~\3\2\2\2\u0083\u0082\3\2\2\2\u0084\7\3\2\2\2\u0085\u0086"+
		"\5l\67\2\u0086\u0087\5\f\7\2\u0087\u0088\7\22\2\2\u0088\t\3\2\2\2\u0089"+
		"\u008a\5\b\5\2\u008a\u008b\5\n\6\2\u008b\u008e\3\2\2\2\u008c\u008e\3\2"+
		"\2\2\u008d\u0089\3\2\2\2\u008d\u008c\3\2\2\2\u008e\13\3\2\2\2\u008f\u0090"+
		"\7,\2\2\u0090\u0096\5\16\b\2\u0091\u0092\7,\2\2\u0092\u0093\5\30\r\2\u0093"+
		"\u0094\5\16\b\2\u0094\u0096\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0091\3"+
		"\2\2\2\u0096\r\3\2\2\2\u0097\u0098\7\23\2\2\u0098\u009b\5\f\7\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0099\3\2\2\2\u009b\17\3\2\2"+
		"\2\u009c\u009d\5l\67\2\u009d\u009e\7\b\2\2\u009e\u009f\7,\2\2\u009f\u00a0"+
		"\7\30\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00a2\7\31\2\2\u00a2\u00a3\5\6\4"+
		"\2\u00a3\u00a4\7\26\2\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6\7\27\2\2\u00a6"+
		"\u00a7\5\20\t\2\u00a7\u00b6\3\2\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\7"+
		"\b\2\2\u00aa\u00ab\7,\2\2\u00ab\u00ac\7\30\2\2\u00ac\u00ad\5\24\13\2\u00ad"+
		"\u00ae\7\31\2\2\u00ae\u00af\5\6\4\2\u00af\u00b0\7\26\2\2\u00b0\u00b1\5"+
		"\32\16\2\u00b1\u00b2\7\27\2\2\u00b2\u00b3\5\20\t\2\u00b3\u00b6\3\2\2\2"+
		"\u00b4\u00b6\3\2\2\2\u00b5\u009c\3\2\2\2\u00b5\u00a8\3\2\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6\21\3\2\2\2\u00b7\u00ba\5l\67\2\u00b8\u00ba\7\6\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\23\3\2\2\2\u00bb\u00bc\5l\67"+
		"\2\u00bc\u00bd\7,\2\2\u00bd\u00be\5\26\f\2\u00be\u00c6\3\2\2\2\u00bf\u00c0"+
		"\5l\67\2\u00c0\u00c1\7,\2\2\u00c1\u00c2\5\30\r\2\u00c2\u00c3\5\26\f\2"+
		"\u00c3\u00c6\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00bb\3\2\2\2\u00c5\u00bf"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\25\3\2\2\2\u00c7\u00c8\7\23\2\2\u00c8"+
		"\u00cb\5\24\13\2\u00c9\u00cb\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c9\3"+
		"\2\2\2\u00cb\27\3\2\2\2\u00cc\u00cd\7\24\2\2\u00cd\u00ce\7-\2\2\u00ce"+
		"\u00d7\7\25\2\2\u00cf\u00d0\7\24\2\2\u00d0\u00d1\7-\2\2\u00d1\u00d2\7"+
		"\25\2\2\u00d2\u00d3\7\24\2\2\u00d3\u00d4\7-\2\2\u00d4\u00d7\7\25\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00cc\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7\31\3\2\2\2\u00d8\u00d9\5\36\20\2\u00d9\u00da\5\32\16\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00db\3\2"+
		"\2\2\u00dd\33\3\2\2\2\u00de\u00df\5\36\20\2\u00df\u00e0\5\34\17\2\u00e0"+
		"\u00e5\3\2\2\2\u00e1\u00e2\5(\25\2\u00e2\u00e3\5 \21\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00de\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\35\3\2\2\2\u00e6\u00e7"+
		"\5$\23\2\u00e7\u00e8\5 \21\2\u00e8\u00f9\3\2\2\2\u00e9\u00ea\5&\24\2\u00ea"+
		"\u00eb\5 \21\2\u00eb\u00f9\3\2\2\2\u00ec\u00ed\5*\26\2\u00ed\u00ee\5 "+
		"\21\2\u00ee\u00f9\3\2\2\2\u00ef\u00f0\5,\27\2\u00f0\u00f1\5 \21\2\u00f1"+
		"\u00f9\3\2\2\2\u00f2\u00f9\5\62\32\2\u00f3\u00f9\5> \2\u00f4\u00f9\58"+
		"\35\2\u00f5\u00f6\5H%\2\u00f6\u00f7\5 \21\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00e6\3\2\2\2\u00f8\u00e9\3\2\2\2\u00f8\u00ec\3\2\2\2\u00f8\u00ef\3\2"+
		"\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8"+
		"\u00f5\3\2\2\2\u00f9\37\3\2\2\2\u00fa\u00fb\7\22\2\2\u00fb!\3\2\2\2\u00fc"+
		"\u00fd\7\24\2\2\u00fd\u00fe\5H%\2\u00fe\u00ff\7\25\2\2\u00ff\u0109\3\2"+
		"\2\2\u0100\u0101\7\24\2\2\u0101\u0102\5H%\2\u0102\u0103\7\25\2\2\u0103"+
		"\u0104\7\24\2\2\u0104\u0105\5H%\2\u0105\u0106\7\25\2\2\u0106\u0109\3\2"+
		"\2\2\u0107\u0109\3\2\2\2\u0108\u00fc\3\2\2\2\u0108\u0100\3\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109#\3\2\2\2\u010a\u010b\7,\2\2\u010b\u010c\5\"\22\2"+
		"\u010c\u010d\7(\2\2\u010d\u010e\5H%\2\u010e%\3\2\2\2\u010f\u0110\7,\2"+
		"\2\u0110\u0111\7\30\2\2\u0111\u0112\5D#\2\u0112\u0113\7\31\2\2\u0113\'"+
		"\3\2\2\2\u0114\u0115\7\r\2\2\u0115\u0116\7\30\2\2\u0116\u0117\5H%\2\u0117"+
		"\u0118\7\31\2\2\u0118)\3\2\2\2\u0119\u011a\7\16\2\2\u011a\u011b\7\30\2"+
		"\2\u011b\u011c\5\f\7\2\u011c\u011d\7\31\2\2\u011d+\3\2\2\2\u011e\u011f"+
		"\7\17\2\2\u011f\u0120\7\30\2\2\u0120\u0121\5.\30\2\u0121\u0122\7\31\2"+
		"\2\u0122-\3\2\2\2\u0123\u0124\5H%\2\u0124\u0125\5\60\31\2\u0125\u0129"+
		"\3\2\2\2\u0126\u0127\7/\2\2\u0127\u0129\5\60\31\2\u0128\u0123\3\2\2\2"+
		"\u0128\u0126\3\2\2\2\u0129/\3\2\2\2\u012a\u012b\7\23\2\2\u012b\u012e\5"+
		".\30\2\u012c\u012e\3\2\2\2\u012d\u012a\3\2\2\2\u012d\u012c\3\2\2\2\u012e"+
		"\61\3\2\2\2\u012f\u0130\7\13\2\2\u0130\u0131\7\30\2\2\u0131\u0132\5H%"+
		"\2\u0132\u0133\7\31\2\2\u0133\u0134\5\64\33\2\u0134\63\3\2\2\2\u0135\u0136"+
		"\7\20\2\2\u0136\u0137\7\26\2\2\u0137\u0138\5\32\16\2\u0138\u0139\7\27"+
		"\2\2\u0139\u013a\5\66\34\2\u013a\65\3\2\2\2\u013b\u013c\7\f\2\2\u013c"+
		"\u013d\7\26\2\2\u013d\u013e\5\32\16\2\u013e\u013f\7\27\2\2\u013f\u0142"+
		"\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013b\3\2\2\2\u0141\u0140\3\2\2\2\u0142"+
		"\67\3\2\2\2\u0143\u0144\7)\2\2\u0144\u0145\5$\23\2\u0145\u0146\5:\36\2"+
		"\u01469\3\2\2\2\u0147\u0148\7\21\2\2\u0148\u0149\5H%\2\u0149\u014a\5<"+
		"\37\2\u014a;\3\2\2\2\u014b\u014c\7+\2\2\u014c\u014d\7\26\2\2\u014d\u014e"+
		"\5\32\16\2\u014e\u014f\7\27\2\2\u014f=\3\2\2\2\u0150\u0151\7*\2\2\u0151"+
		"\u0152\5@!\2\u0152?\3\2\2\2\u0153\u0154\7\30\2\2\u0154\u0155\5H%\2\u0155"+
		"\u0156\7\31\2\2\u0156\u0157\5B\"\2\u0157A\3\2\2\2\u0158\u0159\7+\2\2\u0159"+
		"\u015a\7\26\2\2\u015a\u015b\5\32\16\2\u015b\u015c\7\27\2\2\u015cC\3\2"+
		"\2\2\u015d\u015e\5H%\2\u015e\u015f\5F$\2\u015fE\3\2\2\2\u0160\u0161\7"+
		"\23\2\2\u0161\u0164\5D#\2\u0162\u0164\3\2\2\2\u0163\u0160\3\2\2\2\u0163"+
		"\u0162\3\2\2\2\u0164G\3\2\2\2\u0165\u018a\5\\/\2\u0166\u0167\5\\/\2\u0167"+
		"\u0168\5J&\2\u0168\u0169\5\\/\2\u0169\u018a\3\2\2\2\u016a\u016b\5\\/\2"+
		"\u016b\u016c\5L\'\2\u016c\u016d\5\\/\2\u016d\u018a\3\2\2\2\u016e\u016f"+
		"\5\\/\2\u016f\u0170\5N(\2\u0170\u0171\5\\/\2\u0171\u018a\3\2\2\2\u0172"+
		"\u0173\5\\/\2\u0173\u0174\5P)\2\u0174\u0175\5\\/\2\u0175\u018a\3\2\2\2"+
		"\u0176\u0177\5\\/\2\u0177\u0178\5R*\2\u0178\u0179\5\\/\2\u0179\u018a\3"+
		"\2\2\2\u017a\u017b\5\\/\2\u017b\u017c\5T+\2\u017c\u017d\5\\/\2\u017d\u018a"+
		"\3\2\2\2\u017e\u017f\5\\/\2\u017f\u0180\5V,\2\u0180\u0181\5\\/\2\u0181"+
		"\u018a\3\2\2\2\u0182\u0183\5\\/\2\u0183\u0184\5X-\2\u0184\u0185\5\\/\2"+
		"\u0185\u018a\3\2\2\2\u0186\u0187\5Z.\2\u0187\u0188\5H%\2\u0188\u018a\3"+
		"\2\2\2\u0189\u0165\3\2\2\2\u0189\u0166\3\2\2\2\u0189\u016a\3\2\2\2\u0189"+
		"\u016e\3\2\2\2\u0189\u0172\3\2\2\2\u0189\u0176\3\2\2\2\u0189\u017a\3\2"+
		"\2\2\u0189\u017e\3\2\2\2\u0189\u0182\3\2\2\2\u0189\u0186\3\2\2\2\u018a"+
		"I\3\2\2\2\u018b\u018c\7!\2\2\u018cK\3\2\2\2\u018d\u018e\7 \2\2\u018eM"+
		"\3\2\2\2\u018f\u0190\7\37\2\2\u0190O\3\2\2\2\u0191\u0192\7\"\2\2\u0192"+
		"Q\3\2\2\2\u0193\u0194\7%\2\2\u0194S\3\2\2\2\u0195\u0196\7$\2\2\u0196U"+
		"\3\2\2\2\u0197\u0198\7\'\2\2\u0198W\3\2\2\2\u0199\u019a\7&\2\2\u019aY"+
		"\3\2\2\2\u019b\u019c\7#\2\2\u019c[\3\2\2\2\u019d\u019e\b/\1\2\u019e\u019f"+
		"\5b\62\2\u019f\u01aa\3\2\2\2\u01a0\u01a1\f\5\2\2\u01a1\u01a2\5^\60\2\u01a2"+
		"\u01a3\5b\62\2\u01a3\u01a9\3\2\2\2\u01a4\u01a5\f\4\2\2\u01a5\u01a6\5`"+
		"\61\2\u01a6\u01a7\5b\62\2\u01a7\u01a9\3\2\2\2\u01a8\u01a0\3\2\2\2\u01a8"+
		"\u01a4\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab]\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7\32\2\2\u01ae_\3"+
		"\2\2\2\u01af\u01b0\7\33\2\2\u01b0a\3\2\2\2\u01b1\u01b2\b\62\1\2\u01b2"+
		"\u01b3\5j\66\2\u01b3\u01c2\3\2\2\2\u01b4\u01b5\f\6\2\2\u01b5\u01b6\5d"+
		"\63\2\u01b6\u01b7\5j\66\2\u01b7\u01c1\3\2\2\2\u01b8\u01b9\f\5\2\2\u01b9"+
		"\u01ba\5f\64\2\u01ba\u01bb\5j\66\2\u01bb\u01c1\3\2\2\2\u01bc\u01bd\f\4"+
		"\2\2\u01bd\u01be\5h\65\2\u01be\u01bf\5j\66\2\u01bf\u01c1\3\2\2\2\u01c0"+
		"\u01b4\3\2\2\2\u01c0\u01b8\3\2\2\2\u01c0\u01bc\3\2\2\2\u01c1\u01c4\3\2"+
		"\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3c\3\2\2\2\u01c4\u01c2"+
		"\3\2\2\2\u01c5\u01c6\7\34\2\2\u01c6e\3\2\2\2\u01c7\u01c8\7\35\2\2\u01c8"+
		"g\3\2\2\2\u01c9\u01ca\7\36\2\2\u01cai\3\2\2\2\u01cb\u01d4\5&\24\2\u01cc"+
		"\u01cd\7\30\2\2\u01cd\u01ce\5H%\2\u01ce\u01cf\7\31\2\2\u01cf\u01d4\3\2"+
		"\2\2\u01d0\u01d4\5n8\2\u01d1\u01d2\7\33\2\2\u01d2\u01d4\5n8\2\u01d3\u01cb"+
		"\3\2\2\2\u01d3\u01cc\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4"+
		"k\3\2\2\2\u01d5\u01d6\t\2\2\2\u01d6m\3\2\2\2\u01d7\u01d8\7,\2\2\u01d8"+
		"\u01de\5\"\22\2\u01d9\u01de\7-\2\2\u01da\u01de\7.\2\2\u01db\u01de\7/\2"+
		"\2\u01dc\u01de\7\60\2\2\u01dd\u01d7\3\2\2\2\u01dd\u01d9\3\2\2\2\u01dd"+
		"\u01da\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01deo\3\2\2\2"+
		"\32\u0083\u008d\u0095\u009a\u00b5\u00b9\u00c5\u00ca\u00d6\u00dc\u00e4"+
		"\u00f8\u0108\u0128\u012d\u0141\u0163\u0189\u01a8\u01aa\u01c0\u01c2\u01d3"+
		"\u01dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}