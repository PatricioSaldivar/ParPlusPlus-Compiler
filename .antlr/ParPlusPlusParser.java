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
		RULE_rarguments = 26, RULE_expresion = 27, RULE_lessThanOrEqualExp = 28, 
		RULE_greaterThanOrEqualExp = 29, RULE_equalsExp = 30, RULE_differentExp = 31, 
		RULE_andExp = 32, RULE_orExp = 33, RULE_lessThan = 34, RULE_greaterThan = 35, 
		RULE_notExp = 36, RULE_exp = 37, RULE_termino = 38, RULE_factor = 39, 
		RULE_type = 40, RULE_cte = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "varBlock", "vars", "rvars", "xvars", "yvars", "funcBlock", 
			"params", "rparams", "varDimensionsInit", "statues", "statue", "varDimensions", 
			"asignation", "funcCall", "returnFunc", "read", "write", "xwrite", "ywrite", 
			"decision", "xdecision", "forloop", "whileloop", "arguments", "rarguments", 
			"expresion", "lessThanOrEqualExp", "greaterThanOrEqualExp", "equalsExp", 
			"differentExp", "andExp", "orExp", "lessThan", "greaterThan", "notExp", 
			"exp", "termino", "factor", "type", "cte"
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
			setState(84);
			match(PROGRAM);
			setState(85);
			match(ID);
			setState(86);
			match(SEMICOLON);
			setState(87);
			varBlock();
			setState(88);
			funcBlock();
			setState(89);
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
			setState(91);
			match(MAIN);
			setState(92);
			match(LP);
			setState(93);
			match(RP);
			setState(94);
			match(LCB);
			setState(95);
			statues();
			setState(96);
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
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(VAR);
				setState(99);
				vars();
				setState(100);
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
			setState(105);
			type();
			setState(106);
			xvars();
			setState(107);
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				vars();
				setState(110);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(ID);
				setState(116);
				yvars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(ID);
				setState(118);
				varDimensionsInit();
				setState(119);
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(COMMA);
				setState(124);
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				type();
				setState(129);
				match(MODULE);
				setState(130);
				match(ID);
				setState(131);
				match(LP);
				setState(132);
				params();
				setState(133);
				match(RP);
				setState(134);
				varBlock();
				setState(135);
				match(LCB);
				setState(136);
				statues();
				setState(137);
				match(RCB);
				setState(138);
				funcBlock();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(VOID);
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				type();
				setState(156);
				match(ID);
				setState(157);
				rparams();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				type();
				setState(160);
				match(ID);
				setState(161);
				varDimensionsInit();
				setState(162);
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
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(COMMA);
				setState(168);
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
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(LB);
				setState(173);
				match(INT);
				setState(174);
				match(RB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(LB);
				setState(176);
				match(INT);
				setState(177);
				match(RB);
				setState(178);
				match(LB);
				setState(179);
				match(INT);
				setState(180);
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
			setState(188);
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
				setState(184);
				statue();
				setState(185);
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
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				asignation();
				setState(191);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				funcCall();
				setState(194);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				returnFunc();
				setState(197);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				read();
				setState(200);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				write();
				setState(203);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				decision();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				whileloop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				forloop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				expresion();
				setState(209);
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
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(LB);
				setState(214);
				expresion();
				setState(215);
				match(RB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(LB);
				setState(218);
				expresion();
				setState(219);
				match(RB);
				setState(220);
				match(LB);
				setState(221);
				expresion();
				setState(222);
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
			setState(227);
			match(ID);
			setState(228);
			varDimensions();
			setState(229);
			match(ASSIGN);
			setState(230);
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
			setState(232);
			match(ID);
			setState(233);
			match(LP);
			setState(234);
			arguments();
			setState(235);
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
			setState(237);
			match(RETURN);
			setState(238);
			match(LP);
			setState(239);
			expresion();
			setState(240);
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
			setState(242);
			match(READ);
			setState(243);
			match(LP);
			setState(244);
			xvars();
			setState(245);
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
			setState(247);
			match(WRITE);
			setState(248);
			match(LP);
			setState(249);
			xwrite();
			setState(250);
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
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				expresion();
				setState(253);
				ywrite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(STRING);
				setState(256);
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
		enterRule(_localctx, 40, RULE_ywrite);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(COMMA);
				setState(260);
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
			setState(264);
			match(IF);
			setState(265);
			match(LP);
			setState(266);
			expresion();
			setState(267);
			match(RP);
			setState(268);
			match(THEN);
			setState(269);
			match(LCB);
			setState(270);
			statues();
			setState(271);
			match(RCB);
			setState(272);
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
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(ELSE);
				setState(275);
				match(LCB);
				setState(276);
				statues();
				setState(277);
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
		enterRule(_localctx, 46, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(FOR);
			setState(283);
			asignation();
			setState(284);
			match(TO);
			setState(285);
			expresion();
			setState(286);
			match(DO);
			setState(287);
			match(LCB);
			setState(288);
			statues();
			setState(289);
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
			setState(291);
			match(WHILE);
			setState(292);
			match(LP);
			setState(293);
			expresion();
			setState(294);
			match(RP);
			setState(295);
			match(DO);
			setState(296);
			match(LCB);
			setState(297);
			statues();
			setState(298);
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
			setState(300);
			expresion();
			setState(301);
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
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(COMMA);
				setState(304);
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
		enterRule(_localctx, 54, RULE_expresion);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				lessThanOrEqualExp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				greaterThanOrEqualExp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				equalsExp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(312);
				differentExp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(313);
				andExp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(314);
				orExp();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(315);
				lessThan();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(316);
				greaterThan();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(317);
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
		enterRule(_localctx, 56, RULE_lessThanOrEqualExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			exp(0);
			setState(321);
			match(LTEQ);
			setState(322);
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
		enterRule(_localctx, 58, RULE_greaterThanOrEqualExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			exp(0);
			setState(325);
			match(GTEQ);
			setState(326);
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
		enterRule(_localctx, 60, RULE_equalsExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			exp(0);
			setState(329);
			match(EQ);
			setState(330);
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
		enterRule(_localctx, 62, RULE_differentExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			exp(0);
			setState(333);
			match(NEQ);
			setState(334);
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
		enterRule(_localctx, 64, RULE_andExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			exp(0);
			setState(337);
			match(AND);
			setState(338);
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
		enterRule(_localctx, 66, RULE_orExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			exp(0);
			setState(341);
			match(OR);
			setState(342);
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
		enterRule(_localctx, 68, RULE_lessThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			exp(0);
			setState(345);
			match(LT);
			setState(346);
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
		enterRule(_localctx, 70, RULE_greaterThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			exp(0);
			setState(349);
			match(GT);
			setState(350);
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
		enterRule(_localctx, 72, RULE_notExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(NOT);
			setState(353);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(356);
			termino(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(364);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(358);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(359);
						match(PLUS);
						setState(360);
						termino(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(361);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(362);
						match(MINUS);
						setState(363);
						termino(0);
						}
						break;
					}
					} 
				}
				setState(368);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_termino, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(370);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(381);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(372);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(373);
						match(MULT);
						setState(374);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(375);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(376);
						match(DIV);
						setState(377);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(378);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(379);
						match(MOD);
						setState(380);
						factor();
						}
						break;
					}
					} 
				}
				setState(385);
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
		enterRule(_localctx, 78, RULE_factor);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(LP);
				setState(388);
				expresion();
				setState(389);
				match(RP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				cte();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				match(MINUS);
				setState(393);
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
		enterRule(_localctx, 80, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
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
		enterRule(_localctx, 82, RULE_cte);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(ID);
				setState(399);
				varDimensions();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				match(STRING);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(403);
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
		case 37:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 38:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0199\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\5\4j\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6t\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7|\n\7\3\b\3\b\3\b\5\b\u0081\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u009c\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a8\n"+
		"\n\3\13\3\13\3\13\5\13\u00ad\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00b9\n\f\3\r\3\r\3\r\3\r\5\r\u00bf\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00d6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00e4\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0104\n\25\3\26\3\26"+
		"\3\26\5\26\u0109\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u011b\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\5\34\u0135\n\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0141\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u016f\n"+
		"\'\f\'\16\'\u0172\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0180\n"+
		"(\f(\16(\u0183\13(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u018d\n)\3*\3*\3+\3+\3+"+
		"\3+\3+\3+\5+\u0197\n+\3+\2\4LN,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\3\3\2\3\5\2\u019d\2V\3\2\2\2\4"+
		"]\3\2\2\2\6i\3\2\2\2\bk\3\2\2\2\ns\3\2\2\2\f{\3\2\2\2\16\u0080\3\2\2\2"+
		"\20\u009b\3\2\2\2\22\u00a7\3\2\2\2\24\u00ac\3\2\2\2\26\u00b8\3\2\2\2\30"+
		"\u00be\3\2\2\2\32\u00d5\3\2\2\2\34\u00e3\3\2\2\2\36\u00e5\3\2\2\2 \u00ea"+
		"\3\2\2\2\"\u00ef\3\2\2\2$\u00f4\3\2\2\2&\u00f9\3\2\2\2(\u0103\3\2\2\2"+
		"*\u0108\3\2\2\2,\u010a\3\2\2\2.\u011a\3\2\2\2\60\u011c\3\2\2\2\62\u0125"+
		"\3\2\2\2\64\u012e\3\2\2\2\66\u0134\3\2\2\28\u0140\3\2\2\2:\u0142\3\2\2"+
		"\2<\u0146\3\2\2\2>\u014a\3\2\2\2@\u014e\3\2\2\2B\u0152\3\2\2\2D\u0156"+
		"\3\2\2\2F\u015a\3\2\2\2H\u015e\3\2\2\2J\u0162\3\2\2\2L\u0165\3\2\2\2N"+
		"\u0173\3\2\2\2P\u018c\3\2\2\2R\u018e\3\2\2\2T\u0196\3\2\2\2VW\7\7\2\2"+
		"WX\7,\2\2XY\7\22\2\2YZ\5\6\4\2Z[\5\20\t\2[\\\5\4\3\2\\\3\3\2\2\2]^\7\n"+
		"\2\2^_\7\30\2\2_`\7\31\2\2`a\7\26\2\2ab\5\30\r\2bc\7\27\2\2c\5\3\2\2\2"+
		"de\7\t\2\2ef\5\b\5\2fg\5\n\6\2gj\3\2\2\2hj\3\2\2\2id\3\2\2\2ih\3\2\2\2"+
		"j\7\3\2\2\2kl\5R*\2lm\5\f\7\2mn\7\22\2\2n\t\3\2\2\2op\5\b\5\2pq\5\n\6"+
		"\2qt\3\2\2\2rt\3\2\2\2so\3\2\2\2sr\3\2\2\2t\13\3\2\2\2uv\7,\2\2v|\5\16"+
		"\b\2wx\7,\2\2xy\5\26\f\2yz\5\16\b\2z|\3\2\2\2{u\3\2\2\2{w\3\2\2\2|\r\3"+
		"\2\2\2}~\7\23\2\2~\u0081\5\f\7\2\177\u0081\3\2\2\2\u0080}\3\2\2\2\u0080"+
		"\177\3\2\2\2\u0081\17\3\2\2\2\u0082\u0083\5R*\2\u0083\u0084\7\b\2\2\u0084"+
		"\u0085\7,\2\2\u0085\u0086\7\30\2\2\u0086\u0087\5\22\n\2\u0087\u0088\7"+
		"\31\2\2\u0088\u0089\5\6\4\2\u0089\u008a\7\26\2\2\u008a\u008b\5\30\r\2"+
		"\u008b\u008c\7\27\2\2\u008c\u008d\5\20\t\2\u008d\u009c\3\2\2\2\u008e\u008f"+
		"\7\6\2\2\u008f\u0090\7\b\2\2\u0090\u0091\7,\2\2\u0091\u0092\7\30\2\2\u0092"+
		"\u0093\5\22\n\2\u0093\u0094\7\31\2\2\u0094\u0095\5\6\4\2\u0095\u0096\7"+
		"\26\2\2\u0096\u0097\5\30\r\2\u0097\u0098\7\27\2\2\u0098\u0099\5\20\t\2"+
		"\u0099\u009c\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0082\3\2\2\2\u009b\u008e"+
		"\3\2\2\2\u009b\u009a\3\2\2\2\u009c\21\3\2\2\2\u009d\u009e\5R*\2\u009e"+
		"\u009f\7,\2\2\u009f\u00a0\5\24\13\2\u00a0\u00a8\3\2\2\2\u00a1\u00a2\5"+
		"R*\2\u00a2\u00a3\7,\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\5\24\13\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7\u00a1\3\2"+
		"\2\2\u00a7\u00a6\3\2\2\2\u00a8\23\3\2\2\2\u00a9\u00aa\7\23\2\2\u00aa\u00ad"+
		"\5\22\n\2\u00ab\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00ab\3\2\2\2"+
		"\u00ad\25\3\2\2\2\u00ae\u00af\7\24\2\2\u00af\u00b0\7-\2\2\u00b0\u00b9"+
		"\7\25\2\2\u00b1\u00b2\7\24\2\2\u00b2\u00b3\7-\2\2\u00b3\u00b4\7\25\2\2"+
		"\u00b4\u00b5\7\24\2\2\u00b5\u00b6\7-\2\2\u00b6\u00b9\7\25\2\2\u00b7\u00b9"+
		"\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\27\3\2\2\2\u00ba\u00bb\5\32\16\2\u00bb\u00bc\5\30\r\2\u00bc\u00bf\3\2"+
		"\2\2\u00bd\u00bf\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\31\3\2\2\2\u00c0\u00c1\5\36\20\2\u00c1\u00c2\7\22\2\2\u00c2\u00d6\3\2"+
		"\2\2\u00c3\u00c4\5 \21\2\u00c4\u00c5\7\22\2\2\u00c5\u00d6\3\2\2\2\u00c6"+
		"\u00c7\5\"\22\2\u00c7\u00c8\7\22\2\2\u00c8\u00d6\3\2\2\2\u00c9\u00ca\5"+
		"$\23\2\u00ca\u00cb\7\22\2\2\u00cb\u00d6\3\2\2\2\u00cc\u00cd\5&\24\2\u00cd"+
		"\u00ce\7\22\2\2\u00ce\u00d6\3\2\2\2\u00cf\u00d6\5,\27\2\u00d0\u00d6\5"+
		"\62\32\2\u00d1\u00d6\5\60\31\2\u00d2\u00d3\58\35\2\u00d3\u00d4\7\22\2"+
		"\2\u00d4\u00d6\3\2\2\2\u00d5\u00c0\3\2\2\2\u00d5\u00c3\3\2\2\2\u00d5\u00c6"+
		"\3\2\2\2\u00d5\u00c9\3\2\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5"+
		"\u00d0\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6\33\3\2\2"+
		"\2\u00d7\u00d8\7\24\2\2\u00d8\u00d9\58\35\2\u00d9\u00da\7\25\2\2\u00da"+
		"\u00e4\3\2\2\2\u00db\u00dc\7\24\2\2\u00dc\u00dd\58\35\2\u00dd\u00de\7"+
		"\25\2\2\u00de\u00df\7\24\2\2\u00df\u00e0\58\35\2\u00e0\u00e1\7\25\2\2"+
		"\u00e1\u00e4\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00d7\3\2\2\2\u00e3\u00db"+
		"\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\35\3\2\2\2\u00e5\u00e6\7,\2\2\u00e6"+
		"\u00e7\5\34\17\2\u00e7\u00e8\7(\2\2\u00e8\u00e9\58\35\2\u00e9\37\3\2\2"+
		"\2\u00ea\u00eb\7,\2\2\u00eb\u00ec\7\30\2\2\u00ec\u00ed\5\64\33\2\u00ed"+
		"\u00ee\7\31\2\2\u00ee!\3\2\2\2\u00ef\u00f0\7\r\2\2\u00f0\u00f1\7\30\2"+
		"\2\u00f1\u00f2\58\35\2\u00f2\u00f3\7\31\2\2\u00f3#\3\2\2\2\u00f4\u00f5"+
		"\7\16\2\2\u00f5\u00f6\7\30\2\2\u00f6\u00f7\5\f\7\2\u00f7\u00f8\7\31\2"+
		"\2\u00f8%\3\2\2\2\u00f9\u00fa\7\17\2\2\u00fa\u00fb\7\30\2\2\u00fb\u00fc"+
		"\5(\25\2\u00fc\u00fd\7\31\2\2\u00fd\'\3\2\2\2\u00fe\u00ff\58\35\2\u00ff"+
		"\u0100\5*\26\2\u0100\u0104\3\2\2\2\u0101\u0102\7/\2\2\u0102\u0104\5*\26"+
		"\2\u0103\u00fe\3\2\2\2\u0103\u0101\3\2\2\2\u0104)\3\2\2\2\u0105\u0106"+
		"\7\23\2\2\u0106\u0109\5(\25\2\u0107\u0109\3\2\2\2\u0108\u0105\3\2\2\2"+
		"\u0108\u0107\3\2\2\2\u0109+\3\2\2\2\u010a\u010b\7\13\2\2\u010b\u010c\7"+
		"\30\2\2\u010c\u010d\58\35\2\u010d\u010e\7\31\2\2\u010e\u010f\7\20\2\2"+
		"\u010f\u0110\7\26\2\2\u0110\u0111\5\30\r\2\u0111\u0112\7\27\2\2\u0112"+
		"\u0113\5.\30\2\u0113-\3\2\2\2\u0114\u0115\7\f\2\2\u0115\u0116\7\26\2\2"+
		"\u0116\u0117\5\30\r\2\u0117\u0118\7\27\2\2\u0118\u011b\3\2\2\2\u0119\u011b"+
		"\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0119\3\2\2\2\u011b/\3\2\2\2\u011c"+
		"\u011d\7)\2\2\u011d\u011e\5\36\20\2\u011e\u011f\7\21\2\2\u011f\u0120\5"+
		"8\35\2\u0120\u0121\7+\2\2\u0121\u0122\7\26\2\2\u0122\u0123\5\30\r\2\u0123"+
		"\u0124\7\27\2\2\u0124\61\3\2\2\2\u0125\u0126\7*\2\2\u0126\u0127\7\30\2"+
		"\2\u0127\u0128\58\35\2\u0128\u0129\7\31\2\2\u0129\u012a\7+\2\2\u012a\u012b"+
		"\7\26\2\2\u012b\u012c\5\30\r\2\u012c\u012d\7\27\2\2\u012d\63\3\2\2\2\u012e"+
		"\u012f\58\35\2\u012f\u0130\5\66\34\2\u0130\65\3\2\2\2\u0131\u0132\7\23"+
		"\2\2\u0132\u0135\5\64\33\2\u0133\u0135\3\2\2\2\u0134\u0131\3\2\2\2\u0134"+
		"\u0133\3\2\2\2\u0135\67\3\2\2\2\u0136\u0141\5L\'\2\u0137\u0141\5:\36\2"+
		"\u0138\u0141\5<\37\2\u0139\u0141\5> \2\u013a\u0141\5@!\2\u013b\u0141\5"+
		"B\"\2\u013c\u0141\5D#\2\u013d\u0141\5F$\2\u013e\u0141\5H%\2\u013f\u0141"+
		"\5J&\2\u0140\u0136\3\2\2\2\u0140\u0137\3\2\2\2\u0140\u0138\3\2\2\2\u0140"+
		"\u0139\3\2\2\2\u0140\u013a\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u013c\3\2"+
		"\2\2\u0140\u013d\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141"+
		"9\3\2\2\2\u0142\u0143\5L\'\2\u0143\u0144\7!\2\2\u0144\u0145\5L\'\2\u0145"+
		";\3\2\2\2\u0146\u0147\5L\'\2\u0147\u0148\7 \2\2\u0148\u0149\5L\'\2\u0149"+
		"=\3\2\2\2\u014a\u014b\5L\'\2\u014b\u014c\7\37\2\2\u014c\u014d\5L\'\2\u014d"+
		"?\3\2\2\2\u014e\u014f\5L\'\2\u014f\u0150\7\"\2\2\u0150\u0151\5L\'\2\u0151"+
		"A\3\2\2\2\u0152\u0153\5L\'\2\u0153\u0154\7%\2\2\u0154\u0155\5L\'\2\u0155"+
		"C\3\2\2\2\u0156\u0157\5L\'\2\u0157\u0158\7$\2\2\u0158\u0159\5L\'\2\u0159"+
		"E\3\2\2\2\u015a\u015b\5L\'\2\u015b\u015c\7\'\2\2\u015c\u015d\5L\'\2\u015d"+
		"G\3\2\2\2\u015e\u015f\5L\'\2\u015f\u0160\7&\2\2\u0160\u0161\5L\'\2\u0161"+
		"I\3\2\2\2\u0162\u0163\7#\2\2\u0163\u0164\5L\'\2\u0164K\3\2\2\2\u0165\u0166"+
		"\b\'\1\2\u0166\u0167\5N(\2\u0167\u0170\3\2\2\2\u0168\u0169\f\5\2\2\u0169"+
		"\u016a\7\32\2\2\u016a\u016f\5N(\2\u016b\u016c\f\4\2\2\u016c\u016d\7\33"+
		"\2\2\u016d\u016f\5N(\2\u016e\u0168\3\2\2\2\u016e\u016b\3\2\2\2\u016f\u0172"+
		"\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171M\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0173\u0174\b(\1\2\u0174\u0175\5P)\2\u0175\u0181\3\2\2"+
		"\2\u0176\u0177\f\6\2\2\u0177\u0178\7\34\2\2\u0178\u0180\5P)\2\u0179\u017a"+
		"\f\5\2\2\u017a\u017b\7\35\2\2\u017b\u0180\5P)\2\u017c\u017d\f\4\2\2\u017d"+
		"\u017e\7\36\2\2\u017e\u0180\5P)\2\u017f\u0176\3\2\2\2\u017f\u0179\3\2"+
		"\2\2\u017f\u017c\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182O\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u018d\5 \21\2"+
		"\u0185\u0186\7\30\2\2\u0186\u0187\58\35\2\u0187\u0188\7\31\2\2\u0188\u018d"+
		"\3\2\2\2\u0189\u018d\5T+\2\u018a\u018b\7\33\2\2\u018b\u018d\5T+\2\u018c"+
		"\u0184\3\2\2\2\u018c\u0185\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018dQ\3\2\2\2\u018e\u018f\t\2\2\2\u018fS\3\2\2\2\u0190\u0191\7,"+
		"\2\2\u0191\u0197\5\34\17\2\u0192\u0197\7-\2\2\u0193\u0197\7.\2\2\u0194"+
		"\u0197\7/\2\2\u0195\u0197\7\60\2\2\u0196\u0190\3\2\2\2\u0196\u0192\3\2"+
		"\2\2\u0196\u0193\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2\2\2\u0197"+
		"U\3\2\2\2\30is{\u0080\u009b\u00a7\u00ac\u00b8\u00be\u00d5\u00e3\u0103"+
		"\u0108\u011a\u0134\u0140\u016e\u0170\u017f\u0181\u018c\u0196";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}