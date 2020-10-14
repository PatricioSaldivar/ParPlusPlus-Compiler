// Generated from .\ParPlusPlus.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');
var ParPlusPlusListener = require('./ParPlusPlusListener').ParPlusPlusListener;
var grammarFileName = "ParPlusPlus.g4";


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u00031\u017b\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004",
    "\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004",
    "\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014\t",
    "\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017\t\u0017\u0004",
    "\u0018\t\u0018\u0004\u0019\t\u0019\u0004\u001a\t\u001a\u0004\u001b\t",
    "\u001b\u0004\u001c\t\u001c\u0004\u001d\t\u001d\u0004\u001e\t\u001e\u0004",
    "\u001f\t\u001f\u0004 \t \u0004!\t!\u0004\"\t\"\u0003\u0002\u0003\u0002",
    "\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003",
    "\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004",
    "X\n\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006b\n\u0006\u0003\u0007",
    "\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007",
    "j\n\u0007\u0003\b\u0003\b\u0003\b\u0005\bo\n\b\u0003\t\u0003\t\u0003",
    "\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003",
    "\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003",
    "\t\u0003\t\u0003\t\u0003\t\u0003\t\u0005\t\u008a\n\t\u0003\n\u0003\n",
    "\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0005",
    "\n\u0096\n\n\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u009b\n",
    "\u000b\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003",
    "\f\u0003\f\u0003\f\u0005\f\u00a7\n\f\u0003\r\u0003\r\u0003\r\u0003\r",
    "\u0005\r\u00ad\n\r\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003",
    "\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003",
    "\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003",
    "\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u00c4",
    "\n\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f",
    "\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f",
    "\u0003\u000f\u0005\u000f\u00d2\n\u000f\u0003\u0010\u0003\u0010\u0003",
    "\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003",
    "\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003",
    "\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003",
    "\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003",
    "\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u00f2\n\u0015",
    "\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u00f7\n\u0016\u0003",
    "\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003",
    "\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003",
    "\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0109\n\u0018",
    "\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019",
    "\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a",
    "\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a",
    "\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001c",
    "\u0005\u001c\u0123\n\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003",
    "\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003",
    "\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003",
    "\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003",
    "\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003",
    "\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003",
    "\u001d\u0003\u001d\u0005\u001d\u0148\n\u001d\u0003\u001e\u0003\u001e",
    "\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e",
    "\u0003\u001e\u0007\u001e\u0153\n\u001e\f\u001e\u000e\u001e\u0156\u000b",
    "\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003",
    "\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003",
    "\u001f\u0007\u001f\u0164\n\u001f\f\u001f\u000e\u001f\u0167\u000b\u001f",
    "\u0003 \u0003 \u0003 \u0003 \u0003 \u0003 \u0003 \u0003 \u0005 \u0171",
    "\n \u0003!\u0003!\u0003\"\u0003\"\u0003\"\u0003\"\u0005\"\u0179\n\"",
    "\u0003\"\u0002\u0004:<#\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014",
    "\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0002\u0003\u0003",
    "\u0002\u0003\u0005\u0002\u0186\u0002D\u0003\u0002\u0002\u0002\u0004",
    "K\u0003\u0002\u0002\u0002\u0006W\u0003\u0002\u0002\u0002\bY\u0003\u0002",
    "\u0002\u0002\na\u0003\u0002\u0002\u0002\fi\u0003\u0002\u0002\u0002\u000e",
    "n\u0003\u0002\u0002\u0002\u0010\u0089\u0003\u0002\u0002\u0002\u0012",
    "\u0095\u0003\u0002\u0002\u0002\u0014\u009a\u0003\u0002\u0002\u0002\u0016",
    "\u00a6\u0003\u0002\u0002\u0002\u0018\u00ac\u0003\u0002\u0002\u0002\u001a",
    "\u00c3\u0003\u0002\u0002\u0002\u001c\u00d1\u0003\u0002\u0002\u0002\u001e",
    "\u00d3\u0003\u0002\u0002\u0002 \u00d8\u0003\u0002\u0002\u0002\"\u00dd",
    "\u0003\u0002\u0002\u0002$\u00e2\u0003\u0002\u0002\u0002&\u00e7\u0003",
    "\u0002\u0002\u0002(\u00f1\u0003\u0002\u0002\u0002*\u00f6\u0003\u0002",
    "\u0002\u0002,\u00f8\u0003\u0002\u0002\u0002.\u0108\u0003\u0002\u0002",
    "\u00020\u010a\u0003\u0002\u0002\u00022\u0113\u0003\u0002\u0002\u0002",
    "4\u011c\u0003\u0002\u0002\u00026\u0122\u0003\u0002\u0002\u00028\u0147",
    "\u0003\u0002\u0002\u0002:\u0149\u0003\u0002\u0002\u0002<\u0157\u0003",
    "\u0002\u0002\u0002>\u0170\u0003\u0002\u0002\u0002@\u0172\u0003\u0002",
    "\u0002\u0002B\u0178\u0003\u0002\u0002\u0002DE\u0007\u0007\u0002\u0002",
    "EF\u0007,\u0002\u0002FG\u0007\u0012\u0002\u0002GH\u0005\u0006\u0004",
    "\u0002HI\u0005\u0010\t\u0002IJ\u0005\u0004\u0003\u0002J\u0003\u0003",
    "\u0002\u0002\u0002KL\u0007\n\u0002\u0002LM\u0007\u0018\u0002\u0002M",
    "N\u0007\u0019\u0002\u0002NO\u0007\u0016\u0002\u0002OP\u0005\u0018\r",
    "\u0002PQ\u0007\u0017\u0002\u0002Q\u0005\u0003\u0002\u0002\u0002RS\u0007",
    "\t\u0002\u0002ST\u0005\b\u0005\u0002TU\u0005\n\u0006\u0002UX\u0003\u0002",
    "\u0002\u0002VX\u0003\u0002\u0002\u0002WR\u0003\u0002\u0002\u0002WV\u0003",
    "\u0002\u0002\u0002X\u0007\u0003\u0002\u0002\u0002YZ\u0005@!\u0002Z[",
    "\u0005\f\u0007\u0002[\\\u0007\u0012\u0002\u0002\\\t\u0003\u0002\u0002",
    "\u0002]^\u0005\b\u0005\u0002^_\u0005\n\u0006\u0002_b\u0003\u0002\u0002",
    "\u0002`b\u0003\u0002\u0002\u0002a]\u0003\u0002\u0002\u0002a`\u0003\u0002",
    "\u0002\u0002b\u000b\u0003\u0002\u0002\u0002cd\u0007,\u0002\u0002dj\u0005",
    "\u000e\b\u0002ef\u0007,\u0002\u0002fg\u0005\u0016\f\u0002gh\u0005\u000e",
    "\b\u0002hj\u0003\u0002\u0002\u0002ic\u0003\u0002\u0002\u0002ie\u0003",
    "\u0002\u0002\u0002j\r\u0003\u0002\u0002\u0002kl\u0007\u0013\u0002\u0002",
    "lo\u0005\f\u0007\u0002mo\u0003\u0002\u0002\u0002nk\u0003\u0002\u0002",
    "\u0002nm\u0003\u0002\u0002\u0002o\u000f\u0003\u0002\u0002\u0002pq\u0005",
    "@!\u0002qr\u0007\b\u0002\u0002rs\u0007,\u0002\u0002st\u0007\u0018\u0002",
    "\u0002tu\u0005\u0012\n\u0002uv\u0007\u0019\u0002\u0002vw\u0005\u0006",
    "\u0004\u0002wx\u0007\u0016\u0002\u0002xy\u0005\u0018\r\u0002yz\u0007",
    "\u0017\u0002\u0002z{\u0005\u0010\t\u0002{\u008a\u0003\u0002\u0002\u0002",
    "|}\u0007\u0006\u0002\u0002}~\u0007\b\u0002\u0002~\u007f\u0007,\u0002",
    "\u0002\u007f\u0080\u0007\u0018\u0002\u0002\u0080\u0081\u0005\u0012\n",
    "\u0002\u0081\u0082\u0007\u0019\u0002\u0002\u0082\u0083\u0005\u0006\u0004",
    "\u0002\u0083\u0084\u0007\u0016\u0002\u0002\u0084\u0085\u0005\u0018\r",
    "\u0002\u0085\u0086\u0007\u0017\u0002\u0002\u0086\u0087\u0005\u0010\t",
    "\u0002\u0087\u008a\u0003\u0002\u0002\u0002\u0088\u008a\u0003\u0002\u0002",
    "\u0002\u0089p\u0003\u0002\u0002\u0002\u0089|\u0003\u0002\u0002\u0002",
    "\u0089\u0088\u0003\u0002\u0002\u0002\u008a\u0011\u0003\u0002\u0002\u0002",
    "\u008b\u008c\u0005@!\u0002\u008c\u008d\u0007,\u0002\u0002\u008d\u008e",
    "\u0005\u0014\u000b\u0002\u008e\u0096\u0003\u0002\u0002\u0002\u008f\u0090",
    "\u0005@!\u0002\u0090\u0091\u0007,\u0002\u0002\u0091\u0092\u0005\u0016",
    "\f\u0002\u0092\u0093\u0005\u0014\u000b\u0002\u0093\u0096\u0003\u0002",
    "\u0002\u0002\u0094\u0096\u0003\u0002\u0002\u0002\u0095\u008b\u0003\u0002",
    "\u0002\u0002\u0095\u008f\u0003\u0002\u0002\u0002\u0095\u0094\u0003\u0002",
    "\u0002\u0002\u0096\u0013\u0003\u0002\u0002\u0002\u0097\u0098\u0007\u0013",
    "\u0002\u0002\u0098\u009b\u0005\u0012\n\u0002\u0099\u009b\u0003\u0002",
    "\u0002\u0002\u009a\u0097\u0003\u0002\u0002\u0002\u009a\u0099\u0003\u0002",
    "\u0002\u0002\u009b\u0015\u0003\u0002\u0002\u0002\u009c\u009d\u0007\u0014",
    "\u0002\u0002\u009d\u009e\u0007-\u0002\u0002\u009e\u00a7\u0007\u0015",
    "\u0002\u0002\u009f\u00a0\u0007\u0014\u0002\u0002\u00a0\u00a1\u0007-",
    "\u0002\u0002\u00a1\u00a2\u0007\u0015\u0002\u0002\u00a2\u00a3\u0007\u0014",
    "\u0002\u0002\u00a3\u00a4\u0007-\u0002\u0002\u00a4\u00a7\u0007\u0015",
    "\u0002\u0002\u00a5\u00a7\u0003\u0002\u0002\u0002\u00a6\u009c\u0003\u0002",
    "\u0002\u0002\u00a6\u009f\u0003\u0002\u0002\u0002\u00a6\u00a5\u0003\u0002",
    "\u0002\u0002\u00a7\u0017\u0003\u0002\u0002\u0002\u00a8\u00a9\u0005\u001a",
    "\u000e\u0002\u00a9\u00aa\u0005\u0018\r\u0002\u00aa\u00ad\u0003\u0002",
    "\u0002\u0002\u00ab\u00ad\u0003\u0002\u0002\u0002\u00ac\u00a8\u0003\u0002",
    "\u0002\u0002\u00ac\u00ab\u0003\u0002\u0002\u0002\u00ad\u0019\u0003\u0002",
    "\u0002\u0002\u00ae\u00af\u0005\u001e\u0010\u0002\u00af\u00b0\u0007\u0012",
    "\u0002\u0002\u00b0\u00c4\u0003\u0002\u0002\u0002\u00b1\u00b2\u0005 ",
    "\u0011\u0002\u00b2\u00b3\u0007\u0012\u0002\u0002\u00b3\u00c4\u0003\u0002",
    "\u0002\u0002\u00b4\u00b5\u0005\"\u0012\u0002\u00b5\u00b6\u0007\u0012",
    "\u0002\u0002\u00b6\u00c4\u0003\u0002\u0002\u0002\u00b7\u00b8\u0005$",
    "\u0013\u0002\u00b8\u00b9\u0007\u0012\u0002\u0002\u00b9\u00c4\u0003\u0002",
    "\u0002\u0002\u00ba\u00bb\u0005&\u0014\u0002\u00bb\u00bc\u0007\u0012",
    "\u0002\u0002\u00bc\u00c4\u0003\u0002\u0002\u0002\u00bd\u00c4\u0005,",
    "\u0017\u0002\u00be\u00c4\u00052\u001a\u0002\u00bf\u00c4\u00050\u0019",
    "\u0002\u00c0\u00c1\u00058\u001d\u0002\u00c1\u00c2\u0007\u0012\u0002",
    "\u0002\u00c2\u00c4\u0003\u0002\u0002\u0002\u00c3\u00ae\u0003\u0002\u0002",
    "\u0002\u00c3\u00b1\u0003\u0002\u0002\u0002\u00c3\u00b4\u0003\u0002\u0002",
    "\u0002\u00c3\u00b7\u0003\u0002\u0002\u0002\u00c3\u00ba\u0003\u0002\u0002",
    "\u0002\u00c3\u00bd\u0003\u0002\u0002\u0002\u00c3\u00be\u0003\u0002\u0002",
    "\u0002\u00c3\u00bf\u0003\u0002\u0002\u0002\u00c3\u00c0\u0003\u0002\u0002",
    "\u0002\u00c4\u001b\u0003\u0002\u0002\u0002\u00c5\u00c6\u0007\u0014\u0002",
    "\u0002\u00c6\u00c7\u00058\u001d\u0002\u00c7\u00c8\u0007\u0015\u0002",
    "\u0002\u00c8\u00d2\u0003\u0002\u0002\u0002\u00c9\u00ca\u0007\u0014\u0002",
    "\u0002\u00ca\u00cb\u00058\u001d\u0002\u00cb\u00cc\u0007\u0015\u0002",
    "\u0002\u00cc\u00cd\u0007\u0014\u0002\u0002\u00cd\u00ce\u00058\u001d",
    "\u0002\u00ce\u00cf\u0007\u0015\u0002\u0002\u00cf\u00d2\u0003\u0002\u0002",
    "\u0002\u00d0\u00d2\u0003\u0002\u0002\u0002\u00d1\u00c5\u0003\u0002\u0002",
    "\u0002\u00d1\u00c9\u0003\u0002\u0002\u0002\u00d1\u00d0\u0003\u0002\u0002",
    "\u0002\u00d2\u001d\u0003\u0002\u0002\u0002\u00d3\u00d4\u0007,\u0002",
    "\u0002\u00d4\u00d5\u0005\u001c\u000f\u0002\u00d5\u00d6\u0007(\u0002",
    "\u0002\u00d6\u00d7\u00058\u001d\u0002\u00d7\u001f\u0003\u0002\u0002",
    "\u0002\u00d8\u00d9\u0007,\u0002\u0002\u00d9\u00da\u0007\u0018\u0002",
    "\u0002\u00da\u00db\u00054\u001b\u0002\u00db\u00dc\u0007\u0019\u0002",
    "\u0002\u00dc!\u0003\u0002\u0002\u0002\u00dd\u00de\u0007\r\u0002\u0002",
    "\u00de\u00df\u0007\u0018\u0002\u0002\u00df\u00e0\u00058\u001d\u0002",
    "\u00e0\u00e1\u0007\u0019\u0002\u0002\u00e1#\u0003\u0002\u0002\u0002",
    "\u00e2\u00e3\u0007\u000e\u0002\u0002\u00e3\u00e4\u0007\u0018\u0002\u0002",
    "\u00e4\u00e5\u0005\f\u0007\u0002\u00e5\u00e6\u0007\u0019\u0002\u0002",
    "\u00e6%\u0003\u0002\u0002\u0002\u00e7\u00e8\u0007\u000f\u0002\u0002",
    "\u00e8\u00e9\u0007\u0018\u0002\u0002\u00e9\u00ea\u0005(\u0015\u0002",
    "\u00ea\u00eb\u0007\u0019\u0002\u0002\u00eb\'\u0003\u0002\u0002\u0002",
    "\u00ec\u00ed\u00058\u001d\u0002\u00ed\u00ee\u0005*\u0016\u0002\u00ee",
    "\u00f2\u0003\u0002\u0002\u0002\u00ef\u00f0\u0007/\u0002\u0002\u00f0",
    "\u00f2\u0005*\u0016\u0002\u00f1\u00ec\u0003\u0002\u0002\u0002\u00f1",
    "\u00ef\u0003\u0002\u0002\u0002\u00f2)\u0003\u0002\u0002\u0002\u00f3",
    "\u00f4\u0007\u0013\u0002\u0002\u00f4\u00f7\u0005(\u0015\u0002\u00f5",
    "\u00f7\u0003\u0002\u0002\u0002\u00f6\u00f3\u0003\u0002\u0002\u0002\u00f6",
    "\u00f5\u0003\u0002\u0002\u0002\u00f7+\u0003\u0002\u0002\u0002\u00f8",
    "\u00f9\u0007\u000b\u0002\u0002\u00f9\u00fa\u0007\u0018\u0002\u0002\u00fa",
    "\u00fb\u00058\u001d\u0002\u00fb\u00fc\u0007\u0019\u0002\u0002\u00fc",
    "\u00fd\u0007\u0010\u0002\u0002\u00fd\u00fe\u0007\u0016\u0002\u0002\u00fe",
    "\u00ff\u0005\u0018\r\u0002\u00ff\u0100\u0007\u0017\u0002\u0002\u0100",
    "\u0101\u0005.\u0018\u0002\u0101-\u0003\u0002\u0002\u0002\u0102\u0103",
    "\u0007\f\u0002\u0002\u0103\u0104\u0007\u0016\u0002\u0002\u0104\u0105",
    "\u0005\u0018\r\u0002\u0105\u0106\u0007\u0017\u0002\u0002\u0106\u0109",
    "\u0003\u0002\u0002\u0002\u0107\u0109\u0003\u0002\u0002\u0002\u0108\u0102",
    "\u0003\u0002\u0002\u0002\u0108\u0107\u0003\u0002\u0002\u0002\u0109/",
    "\u0003\u0002\u0002\u0002\u010a\u010b\u0007)\u0002\u0002\u010b\u010c",
    "\u0005\u001e\u0010\u0002\u010c\u010d\u0007\u0011\u0002\u0002\u010d\u010e",
    "\u00058\u001d\u0002\u010e\u010f\u0007+\u0002\u0002\u010f\u0110\u0007",
    "\u0016\u0002\u0002\u0110\u0111\u0005\u0018\r\u0002\u0111\u0112\u0007",
    "\u0017\u0002\u0002\u01121\u0003\u0002\u0002\u0002\u0113\u0114\u0007",
    "*\u0002\u0002\u0114\u0115\u0007\u0018\u0002\u0002\u0115\u0116\u0005",
    "8\u001d\u0002\u0116\u0117\u0007\u0019\u0002\u0002\u0117\u0118\u0007",
    "+\u0002\u0002\u0118\u0119\u0007\u0016\u0002\u0002\u0119\u011a\u0005",
    "\u0018\r\u0002\u011a\u011b\u0007\u0017\u0002\u0002\u011b3\u0003\u0002",
    "\u0002\u0002\u011c\u011d\u00058\u001d\u0002\u011d\u011e\u00056\u001c",
    "\u0002\u011e5\u0003\u0002\u0002\u0002\u011f\u0120\u0007\u0013\u0002",
    "\u0002\u0120\u0123\u00054\u001b\u0002\u0121\u0123\u0003\u0002\u0002",
    "\u0002\u0122\u011f\u0003\u0002\u0002\u0002\u0122\u0121\u0003\u0002\u0002",
    "\u0002\u01237\u0003\u0002\u0002\u0002\u0124\u0148\u0005:\u001e\u0002",
    "\u0125\u0126\u0005:\u001e\u0002\u0126\u0127\u0007!\u0002\u0002\u0127",
    "\u0128\u0005:\u001e\u0002\u0128\u0148\u0003\u0002\u0002\u0002\u0129",
    "\u012a\u0005:\u001e\u0002\u012a\u012b\u0007 \u0002\u0002\u012b\u012c",
    "\u0005:\u001e\u0002\u012c\u0148\u0003\u0002\u0002\u0002\u012d\u012e",
    "\u0005:\u001e\u0002\u012e\u012f\u0007\u001f\u0002\u0002\u012f\u0130",
    "\u0005:\u001e\u0002\u0130\u0148\u0003\u0002\u0002\u0002\u0131\u0132",
    "\u0005:\u001e\u0002\u0132\u0133\u0007\"\u0002\u0002\u0133\u0134\u0005",
    ":\u001e\u0002\u0134\u0148\u0003\u0002\u0002\u0002\u0135\u0136\u0005",
    ":\u001e\u0002\u0136\u0137\u0007%\u0002\u0002\u0137\u0138\u0005:\u001e",
    "\u0002\u0138\u0148\u0003\u0002\u0002\u0002\u0139\u013a\u0005:\u001e",
    "\u0002\u013a\u013b\u0007$\u0002\u0002\u013b\u013c\u0005:\u001e\u0002",
    "\u013c\u0148\u0003\u0002\u0002\u0002\u013d\u013e\u0005:\u001e\u0002",
    "\u013e\u013f\u0007\'\u0002\u0002\u013f\u0140\u0005:\u001e\u0002\u0140",
    "\u0148\u0003\u0002\u0002\u0002\u0141\u0142\u0005:\u001e\u0002\u0142",
    "\u0143\u0007&\u0002\u0002\u0143\u0144\u0005:\u001e\u0002\u0144\u0148",
    "\u0003\u0002\u0002\u0002\u0145\u0146\u0007#\u0002\u0002\u0146\u0148",
    "\u0005:\u001e\u0002\u0147\u0124\u0003\u0002\u0002\u0002\u0147\u0125",
    "\u0003\u0002\u0002\u0002\u0147\u0129\u0003\u0002\u0002\u0002\u0147\u012d",
    "\u0003\u0002\u0002\u0002\u0147\u0131\u0003\u0002\u0002\u0002\u0147\u0135",
    "\u0003\u0002\u0002\u0002\u0147\u0139\u0003\u0002\u0002\u0002\u0147\u013d",
    "\u0003\u0002\u0002\u0002\u0147\u0141\u0003\u0002\u0002\u0002\u0147\u0145",
    "\u0003\u0002\u0002\u0002\u01489\u0003\u0002\u0002\u0002\u0149\u014a",
    "\b\u001e\u0001\u0002\u014a\u014b\u0005<\u001f\u0002\u014b\u0154\u0003",
    "\u0002\u0002\u0002\u014c\u014d\f\u0005\u0002\u0002\u014d\u014e\u0007",
    "\u001a\u0002\u0002\u014e\u0153\u0005<\u001f\u0002\u014f\u0150\f\u0004",
    "\u0002\u0002\u0150\u0151\u0007\u001b\u0002\u0002\u0151\u0153\u0005<",
    "\u001f\u0002\u0152\u014c\u0003\u0002\u0002\u0002\u0152\u014f\u0003\u0002",
    "\u0002\u0002\u0153\u0156\u0003\u0002\u0002\u0002\u0154\u0152\u0003\u0002",
    "\u0002\u0002\u0154\u0155\u0003\u0002\u0002\u0002\u0155;\u0003\u0002",
    "\u0002\u0002\u0156\u0154\u0003\u0002\u0002\u0002\u0157\u0158\b\u001f",
    "\u0001\u0002\u0158\u0159\u0005> \u0002\u0159\u0165\u0003\u0002\u0002",
    "\u0002\u015a\u015b\f\u0006\u0002\u0002\u015b\u015c\u0007\u001c\u0002",
    "\u0002\u015c\u0164\u0005> \u0002\u015d\u015e\f\u0005\u0002\u0002\u015e",
    "\u015f\u0007\u001d\u0002\u0002\u015f\u0164\u0005> \u0002\u0160\u0161",
    "\f\u0004\u0002\u0002\u0161\u0162\u0007\u001e\u0002\u0002\u0162\u0164",
    "\u0005> \u0002\u0163\u015a\u0003\u0002\u0002\u0002\u0163\u015d\u0003",
    "\u0002\u0002\u0002\u0163\u0160\u0003\u0002\u0002\u0002\u0164\u0167\u0003",
    "\u0002\u0002\u0002\u0165\u0163\u0003\u0002\u0002\u0002\u0165\u0166\u0003",
    "\u0002\u0002\u0002\u0166=\u0003\u0002\u0002\u0002\u0167\u0165\u0003",
    "\u0002\u0002\u0002\u0168\u0171\u0005 \u0011\u0002\u0169\u016a\u0007",
    "\u0018\u0002\u0002\u016a\u016b\u00058\u001d\u0002\u016b\u016c\u0007",
    "\u0019\u0002\u0002\u016c\u0171\u0003\u0002\u0002\u0002\u016d\u0171\u0005",
    "B\"\u0002\u016e\u016f\u0007\u001b\u0002\u0002\u016f\u0171\u0005B\"\u0002",
    "\u0170\u0168\u0003\u0002\u0002\u0002\u0170\u0169\u0003\u0002\u0002\u0002",
    "\u0170\u016d\u0003\u0002\u0002\u0002\u0170\u016e\u0003\u0002\u0002\u0002",
    "\u0171?\u0003\u0002\u0002\u0002\u0172\u0173\t\u0002\u0002\u0002\u0173",
    "A\u0003\u0002\u0002\u0002\u0174\u0175\u0007,\u0002\u0002\u0175\u0179",
    "\u0005\u001c\u000f\u0002\u0176\u0179\u0007-\u0002\u0002\u0177\u0179",
    "\u0007.\u0002\u0002\u0178\u0174\u0003\u0002\u0002\u0002\u0178\u0176",
    "\u0003\u0002\u0002\u0002\u0178\u0177\u0003\u0002\u0002\u0002\u0179C",
    "\u0003\u0002\u0002\u0002\u0018Wain\u0089\u0095\u009a\u00a6\u00ac\u00c3",
    "\u00d1\u00f1\u00f6\u0108\u0122\u0147\u0152\u0154\u0163\u0165\u0170\u0178"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'int'", "'float'", "'char'", "'void'", "'program'", 
                     "'module'", "'var'", "'main'", "'if'", "'else'", "'return'", 
                     "'read'", "'write'", "'then'", "'to'", "';'", "','", 
                     "'['", "']'", "'{'", "'}'", "'('", "')'", "'+'", "'-'", 
                     "'*'", "'/'", "'%'", "'=='", "'>='", "'<='", "'!='", 
                     "'!'", "'||'", "'&&'", "'>'", "'<'", "'='", "'for'", 
                     "'while'", "'do'" ];

var symbolicNames = [ null, null, null, null, "VOID", "PROGRAM", "MODULE", 
                      "VAR", "MAIN", "IF", "ELSE", "RETURN", "READ", "WRITE", 
                      "THEN", "TO", "SEMICOLON", "COMMA", "LB", "RB", "LCB", 
                      "RCB", "LP", "RP", "PLUS", "MINUS", "MULT", "DIV", 
                      "MOD", "EQ", "GTEQ", "LTEQ", "NEQ", "NOT", "OR", "AND", 
                      "GT", "LT", "ASSIGN", "FOR", "WHILE", "DO", "ID", 
                      "INT", "FLOAT", "STRING", "CHAR", "WHITESPACE" ];

var ruleNames =  [ "program", "main", "varBlock", "vars", "rvars", "xvars", 
                   "yvars", "funcBlock", "params", "rparams", "varDimensionsInit", 
                   "statues", "statue", "varDimensions", "asignation", "funcCall", 
                   "returnFunc", "read", "write", "xwrite", "ywrite", "decision", 
                   "xdecision", "forloop", "whileloop", "arguments", "rarguments", 
                   "expresion", "exp", "termino", "factor", "type", "cte" ];

function ParPlusPlusParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

ParPlusPlusParser.prototype = Object.create(antlr4.Parser.prototype);
ParPlusPlusParser.prototype.constructor = ParPlusPlusParser;

Object.defineProperty(ParPlusPlusParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

ParPlusPlusParser.EOF = antlr4.Token.EOF;
ParPlusPlusParser.T__0 = 1;
ParPlusPlusParser.T__1 = 2;
ParPlusPlusParser.T__2 = 3;
ParPlusPlusParser.VOID = 4;
ParPlusPlusParser.PROGRAM = 5;
ParPlusPlusParser.MODULE = 6;
ParPlusPlusParser.VAR = 7;
ParPlusPlusParser.MAIN = 8;
ParPlusPlusParser.IF = 9;
ParPlusPlusParser.ELSE = 10;
ParPlusPlusParser.RETURN = 11;
ParPlusPlusParser.READ = 12;
ParPlusPlusParser.WRITE = 13;
ParPlusPlusParser.THEN = 14;
ParPlusPlusParser.TO = 15;
ParPlusPlusParser.SEMICOLON = 16;
ParPlusPlusParser.COMMA = 17;
ParPlusPlusParser.LB = 18;
ParPlusPlusParser.RB = 19;
ParPlusPlusParser.LCB = 20;
ParPlusPlusParser.RCB = 21;
ParPlusPlusParser.LP = 22;
ParPlusPlusParser.RP = 23;
ParPlusPlusParser.PLUS = 24;
ParPlusPlusParser.MINUS = 25;
ParPlusPlusParser.MULT = 26;
ParPlusPlusParser.DIV = 27;
ParPlusPlusParser.MOD = 28;
ParPlusPlusParser.EQ = 29;
ParPlusPlusParser.GTEQ = 30;
ParPlusPlusParser.LTEQ = 31;
ParPlusPlusParser.NEQ = 32;
ParPlusPlusParser.NOT = 33;
ParPlusPlusParser.OR = 34;
ParPlusPlusParser.AND = 35;
ParPlusPlusParser.GT = 36;
ParPlusPlusParser.LT = 37;
ParPlusPlusParser.ASSIGN = 38;
ParPlusPlusParser.FOR = 39;
ParPlusPlusParser.WHILE = 40;
ParPlusPlusParser.DO = 41;
ParPlusPlusParser.ID = 42;
ParPlusPlusParser.INT = 43;
ParPlusPlusParser.FLOAT = 44;
ParPlusPlusParser.STRING = 45;
ParPlusPlusParser.CHAR = 46;
ParPlusPlusParser.WHITESPACE = 47;

ParPlusPlusParser.RULE_program = 0;
ParPlusPlusParser.RULE_main = 1;
ParPlusPlusParser.RULE_varBlock = 2;
ParPlusPlusParser.RULE_vars = 3;
ParPlusPlusParser.RULE_rvars = 4;
ParPlusPlusParser.RULE_xvars = 5;
ParPlusPlusParser.RULE_yvars = 6;
ParPlusPlusParser.RULE_funcBlock = 7;
ParPlusPlusParser.RULE_params = 8;
ParPlusPlusParser.RULE_rparams = 9;
ParPlusPlusParser.RULE_varDimensionsInit = 10;
ParPlusPlusParser.RULE_statues = 11;
ParPlusPlusParser.RULE_statue = 12;
ParPlusPlusParser.RULE_varDimensions = 13;
ParPlusPlusParser.RULE_asignation = 14;
ParPlusPlusParser.RULE_funcCall = 15;
ParPlusPlusParser.RULE_returnFunc = 16;
ParPlusPlusParser.RULE_read = 17;
ParPlusPlusParser.RULE_write = 18;
ParPlusPlusParser.RULE_xwrite = 19;
ParPlusPlusParser.RULE_ywrite = 20;
ParPlusPlusParser.RULE_decision = 21;
ParPlusPlusParser.RULE_xdecision = 22;
ParPlusPlusParser.RULE_forloop = 23;
ParPlusPlusParser.RULE_whileloop = 24;
ParPlusPlusParser.RULE_arguments = 25;
ParPlusPlusParser.RULE_rarguments = 26;
ParPlusPlusParser.RULE_expresion = 27;
ParPlusPlusParser.RULE_exp = 28;
ParPlusPlusParser.RULE_termino = 29;
ParPlusPlusParser.RULE_factor = 30;
ParPlusPlusParser.RULE_type = 31;
ParPlusPlusParser.RULE_cte = 32;


function ProgramContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_program;
    return this;
}

ProgramContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ProgramContext.prototype.constructor = ProgramContext;

ProgramContext.prototype.PROGRAM = function() {
    return this.getToken(ParPlusPlusParser.PROGRAM, 0);
};

ProgramContext.prototype.ID = function() {
    return this.getToken(ParPlusPlusParser.ID, 0);
};

ProgramContext.prototype.SEMICOLON = function() {
    return this.getToken(ParPlusPlusParser.SEMICOLON, 0);
};

ProgramContext.prototype.varBlock = function() {
    return this.getTypedRuleContext(VarBlockContext,0);
};

ProgramContext.prototype.funcBlock = function() {
    return this.getTypedRuleContext(FuncBlockContext,0);
};

ProgramContext.prototype.main = function() {
    return this.getTypedRuleContext(MainContext,0);
};

ProgramContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterProgram(this);
	}
};

ProgramContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitProgram(this);
	}
};




ParPlusPlusParser.ProgramContext = ProgramContext;

ParPlusPlusParser.prototype.program = function() {

    var localctx = new ProgramContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, ParPlusPlusParser.RULE_program);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 66;
        this.match(ParPlusPlusParser.PROGRAM);
        this.state = 67;
        this.match(ParPlusPlusParser.ID);
        this.state = 68;
        this.match(ParPlusPlusParser.SEMICOLON);
        this.state = 69;
        this.varBlock();
        this.state = 70;
        this.funcBlock();
        this.state = 71;
        this.main();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function MainContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_main;
    return this;
}

MainContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
MainContext.prototype.constructor = MainContext;

MainContext.prototype.MAIN = function() {
    return this.getToken(ParPlusPlusParser.MAIN, 0);
};

MainContext.prototype.LP = function() {
    return this.getToken(ParPlusPlusParser.LP, 0);
};

MainContext.prototype.RP = function() {
    return this.getToken(ParPlusPlusParser.RP, 0);
};

MainContext.prototype.LCB = function() {
    return this.getToken(ParPlusPlusParser.LCB, 0);
};

MainContext.prototype.statues = function() {
    return this.getTypedRuleContext(StatuesContext,0);
};

MainContext.prototype.RCB = function() {
    return this.getToken(ParPlusPlusParser.RCB, 0);
};

MainContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterMain(this);
	}
};

MainContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitMain(this);
	}
};




ParPlusPlusParser.MainContext = MainContext;

ParPlusPlusParser.prototype.main = function() {

    var localctx = new MainContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, ParPlusPlusParser.RULE_main);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 73;
        this.match(ParPlusPlusParser.MAIN);
        this.state = 74;
        this.match(ParPlusPlusParser.LP);
        this.state = 75;
        this.match(ParPlusPlusParser.RP);
        this.state = 76;
        this.match(ParPlusPlusParser.LCB);
        this.state = 77;
        this.statues();
        this.state = 78;
        this.match(ParPlusPlusParser.RCB);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function VarBlockContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_varBlock;
    return this;
}

VarBlockContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
VarBlockContext.prototype.constructor = VarBlockContext;

VarBlockContext.prototype.VAR = function() {
    return this.getToken(ParPlusPlusParser.VAR, 0);
};

VarBlockContext.prototype.vars = function() {
    return this.getTypedRuleContext(VarsContext,0);
};

VarBlockContext.prototype.rvars = function() {
    return this.getTypedRuleContext(RvarsContext,0);
};

VarBlockContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterVarBlock(this);
	}
};

VarBlockContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitVarBlock(this);
	}
};




ParPlusPlusParser.VarBlockContext = VarBlockContext;

ParPlusPlusParser.prototype.varBlock = function() {

    var localctx = new VarBlockContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, ParPlusPlusParser.RULE_varBlock);
    try {
        this.state = 85;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.VAR:
            this.enterOuterAlt(localctx, 1);
            this.state = 80;
            this.match(ParPlusPlusParser.VAR);
            this.state = 81;
            this.vars();
            this.state = 82;
            this.rvars();
            break;
        case ParPlusPlusParser.T__0:
        case ParPlusPlusParser.T__1:
        case ParPlusPlusParser.T__2:
        case ParPlusPlusParser.VOID:
        case ParPlusPlusParser.MAIN:
        case ParPlusPlusParser.LCB:
            this.enterOuterAlt(localctx, 2);

            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function VarsContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_vars;
    return this;
}

VarsContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
VarsContext.prototype.constructor = VarsContext;

VarsContext.prototype.type = function() {
    return this.getTypedRuleContext(TypeContext,0);
};

VarsContext.prototype.xvars = function() {
    return this.getTypedRuleContext(XvarsContext,0);
};

VarsContext.prototype.SEMICOLON = function() {
    return this.getToken(ParPlusPlusParser.SEMICOLON, 0);
};

VarsContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterVars(this);
	}
};

VarsContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitVars(this);
	}
};




ParPlusPlusParser.VarsContext = VarsContext;

ParPlusPlusParser.prototype.vars = function() {

    var localctx = new VarsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, ParPlusPlusParser.RULE_vars);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 87;
        this.type();
        this.state = 88;
        this.xvars();
        this.state = 89;
        this.match(ParPlusPlusParser.SEMICOLON);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function RvarsContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_rvars;
    return this;
}

RvarsContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
RvarsContext.prototype.constructor = RvarsContext;

RvarsContext.prototype.vars = function() {
    return this.getTypedRuleContext(VarsContext,0);
};

RvarsContext.prototype.rvars = function() {
    return this.getTypedRuleContext(RvarsContext,0);
};

RvarsContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterRvars(this);
	}
};

RvarsContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitRvars(this);
	}
};




ParPlusPlusParser.RvarsContext = RvarsContext;

ParPlusPlusParser.prototype.rvars = function() {

    var localctx = new RvarsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, ParPlusPlusParser.RULE_rvars);
    try {
        this.state = 95;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,1,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 91;
            this.vars();
            this.state = 92;
            this.rvars();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);

            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function XvarsContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_xvars;
    return this;
}

XvarsContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
XvarsContext.prototype.constructor = XvarsContext;

XvarsContext.prototype.ID = function() {
    return this.getToken(ParPlusPlusParser.ID, 0);
};

XvarsContext.prototype.yvars = function() {
    return this.getTypedRuleContext(YvarsContext,0);
};

XvarsContext.prototype.varDimensionsInit = function() {
    return this.getTypedRuleContext(VarDimensionsInitContext,0);
};

XvarsContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterXvars(this);
	}
};

XvarsContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitXvars(this);
	}
};




ParPlusPlusParser.XvarsContext = XvarsContext;

ParPlusPlusParser.prototype.xvars = function() {

    var localctx = new XvarsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, ParPlusPlusParser.RULE_xvars);
    try {
        this.state = 103;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,2,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 97;
            this.match(ParPlusPlusParser.ID);
            this.state = 98;
            this.yvars();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 99;
            this.match(ParPlusPlusParser.ID);
            this.state = 100;
            this.varDimensionsInit();
            this.state = 101;
            this.yvars();
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function YvarsContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_yvars;
    return this;
}

YvarsContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
YvarsContext.prototype.constructor = YvarsContext;

YvarsContext.prototype.COMMA = function() {
    return this.getToken(ParPlusPlusParser.COMMA, 0);
};

YvarsContext.prototype.xvars = function() {
    return this.getTypedRuleContext(XvarsContext,0);
};

YvarsContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterYvars(this);
	}
};

YvarsContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitYvars(this);
	}
};




ParPlusPlusParser.YvarsContext = YvarsContext;

ParPlusPlusParser.prototype.yvars = function() {

    var localctx = new YvarsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, ParPlusPlusParser.RULE_yvars);
    try {
        this.state = 108;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.COMMA:
            this.enterOuterAlt(localctx, 1);
            this.state = 105;
            this.match(ParPlusPlusParser.COMMA);
            this.state = 106;
            this.xvars();
            break;
        case ParPlusPlusParser.SEMICOLON:
        case ParPlusPlusParser.RP:
            this.enterOuterAlt(localctx, 2);

            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function FuncBlockContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_funcBlock;
    return this;
}

FuncBlockContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FuncBlockContext.prototype.constructor = FuncBlockContext;

FuncBlockContext.prototype.type = function() {
    return this.getTypedRuleContext(TypeContext,0);
};

FuncBlockContext.prototype.MODULE = function() {
    return this.getToken(ParPlusPlusParser.MODULE, 0);
};

FuncBlockContext.prototype.ID = function() {
    return this.getToken(ParPlusPlusParser.ID, 0);
};

FuncBlockContext.prototype.LP = function() {
    return this.getToken(ParPlusPlusParser.LP, 0);
};

FuncBlockContext.prototype.params = function() {
    return this.getTypedRuleContext(ParamsContext,0);
};

FuncBlockContext.prototype.RP = function() {
    return this.getToken(ParPlusPlusParser.RP, 0);
};

FuncBlockContext.prototype.varBlock = function() {
    return this.getTypedRuleContext(VarBlockContext,0);
};

FuncBlockContext.prototype.LCB = function() {
    return this.getToken(ParPlusPlusParser.LCB, 0);
};

FuncBlockContext.prototype.statues = function() {
    return this.getTypedRuleContext(StatuesContext,0);
};

FuncBlockContext.prototype.RCB = function() {
    return this.getToken(ParPlusPlusParser.RCB, 0);
};

FuncBlockContext.prototype.funcBlock = function() {
    return this.getTypedRuleContext(FuncBlockContext,0);
};

FuncBlockContext.prototype.VOID = function() {
    return this.getToken(ParPlusPlusParser.VOID, 0);
};

FuncBlockContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterFuncBlock(this);
	}
};

FuncBlockContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitFuncBlock(this);
	}
};




ParPlusPlusParser.FuncBlockContext = FuncBlockContext;

ParPlusPlusParser.prototype.funcBlock = function() {

    var localctx = new FuncBlockContext(this, this._ctx, this.state);
    this.enterRule(localctx, 14, ParPlusPlusParser.RULE_funcBlock);
    try {
        this.state = 135;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.T__0:
        case ParPlusPlusParser.T__1:
        case ParPlusPlusParser.T__2:
            this.enterOuterAlt(localctx, 1);
            this.state = 110;
            this.type();
            this.state = 111;
            this.match(ParPlusPlusParser.MODULE);
            this.state = 112;
            this.match(ParPlusPlusParser.ID);
            this.state = 113;
            this.match(ParPlusPlusParser.LP);
            this.state = 114;
            this.params();
            this.state = 115;
            this.match(ParPlusPlusParser.RP);
            this.state = 116;
            this.varBlock();
            this.state = 117;
            this.match(ParPlusPlusParser.LCB);
            this.state = 118;
            this.statues();
            this.state = 119;
            this.match(ParPlusPlusParser.RCB);
            this.state = 120;
            this.funcBlock();
            break;
        case ParPlusPlusParser.VOID:
            this.enterOuterAlt(localctx, 2);
            this.state = 122;
            this.match(ParPlusPlusParser.VOID);
            this.state = 123;
            this.match(ParPlusPlusParser.MODULE);
            this.state = 124;
            this.match(ParPlusPlusParser.ID);
            this.state = 125;
            this.match(ParPlusPlusParser.LP);
            this.state = 126;
            this.params();
            this.state = 127;
            this.match(ParPlusPlusParser.RP);
            this.state = 128;
            this.varBlock();
            this.state = 129;
            this.match(ParPlusPlusParser.LCB);
            this.state = 130;
            this.statues();
            this.state = 131;
            this.match(ParPlusPlusParser.RCB);
            this.state = 132;
            this.funcBlock();
            break;
        case ParPlusPlusParser.MAIN:
            this.enterOuterAlt(localctx, 3);

            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ParamsContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_params;
    return this;
}

ParamsContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ParamsContext.prototype.constructor = ParamsContext;

ParamsContext.prototype.type = function() {
    return this.getTypedRuleContext(TypeContext,0);
};

ParamsContext.prototype.ID = function() {
    return this.getToken(ParPlusPlusParser.ID, 0);
};

ParamsContext.prototype.rparams = function() {
    return this.getTypedRuleContext(RparamsContext,0);
};

ParamsContext.prototype.varDimensionsInit = function() {
    return this.getTypedRuleContext(VarDimensionsInitContext,0);
};

ParamsContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterParams(this);
	}
};

ParamsContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitParams(this);
	}
};




ParPlusPlusParser.ParamsContext = ParamsContext;

ParPlusPlusParser.prototype.params = function() {

    var localctx = new ParamsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, ParPlusPlusParser.RULE_params);
    try {
        this.state = 147;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,5,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 137;
            this.type();
            this.state = 138;
            this.match(ParPlusPlusParser.ID);
            this.state = 139;
            this.rparams();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 141;
            this.type();
            this.state = 142;
            this.match(ParPlusPlusParser.ID);
            this.state = 143;
            this.varDimensionsInit();
            this.state = 144;
            this.rparams();
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);

            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function RparamsContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_rparams;
    return this;
}

RparamsContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
RparamsContext.prototype.constructor = RparamsContext;

RparamsContext.prototype.COMMA = function() {
    return this.getToken(ParPlusPlusParser.COMMA, 0);
};

RparamsContext.prototype.params = function() {
    return this.getTypedRuleContext(ParamsContext,0);
};

RparamsContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterRparams(this);
	}
};

RparamsContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitRparams(this);
	}
};




ParPlusPlusParser.RparamsContext = RparamsContext;

ParPlusPlusParser.prototype.rparams = function() {

    var localctx = new RparamsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 18, ParPlusPlusParser.RULE_rparams);
    try {
        this.state = 152;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.COMMA:
            this.enterOuterAlt(localctx, 1);
            this.state = 149;
            this.match(ParPlusPlusParser.COMMA);
            this.state = 150;
            this.params();
            break;
        case ParPlusPlusParser.RP:
            this.enterOuterAlt(localctx, 2);

            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function VarDimensionsInitContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_varDimensionsInit;
    return this;
}

VarDimensionsInitContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
VarDimensionsInitContext.prototype.constructor = VarDimensionsInitContext;

VarDimensionsInitContext.prototype.LB = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(ParPlusPlusParser.LB);
    } else {
        return this.getToken(ParPlusPlusParser.LB, i);
    }
};


VarDimensionsInitContext.prototype.INT = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(ParPlusPlusParser.INT);
    } else {
        return this.getToken(ParPlusPlusParser.INT, i);
    }
};


VarDimensionsInitContext.prototype.RB = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(ParPlusPlusParser.RB);
    } else {
        return this.getToken(ParPlusPlusParser.RB, i);
    }
};


VarDimensionsInitContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterVarDimensionsInit(this);
	}
};

VarDimensionsInitContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitVarDimensionsInit(this);
	}
};




ParPlusPlusParser.VarDimensionsInitContext = VarDimensionsInitContext;

ParPlusPlusParser.prototype.varDimensionsInit = function() {

    var localctx = new VarDimensionsInitContext(this, this._ctx, this.state);
    this.enterRule(localctx, 20, ParPlusPlusParser.RULE_varDimensionsInit);
    try {
        this.state = 164;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,7,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 154;
            this.match(ParPlusPlusParser.LB);
            this.state = 155;
            this.match(ParPlusPlusParser.INT);
            this.state = 156;
            this.match(ParPlusPlusParser.RB);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 157;
            this.match(ParPlusPlusParser.LB);
            this.state = 158;
            this.match(ParPlusPlusParser.INT);
            this.state = 159;
            this.match(ParPlusPlusParser.RB);
            this.state = 160;
            this.match(ParPlusPlusParser.LB);
            this.state = 161;
            this.match(ParPlusPlusParser.INT);
            this.state = 162;
            this.match(ParPlusPlusParser.RB);
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);

            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function StatuesContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_statues;
    return this;
}

StatuesContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatuesContext.prototype.constructor = StatuesContext;

StatuesContext.prototype.statue = function() {
    return this.getTypedRuleContext(StatueContext,0);
};

StatuesContext.prototype.statues = function() {
    return this.getTypedRuleContext(StatuesContext,0);
};

StatuesContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterStatues(this);
	}
};

StatuesContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitStatues(this);
	}
};




ParPlusPlusParser.StatuesContext = StatuesContext;

ParPlusPlusParser.prototype.statues = function() {

    var localctx = new StatuesContext(this, this._ctx, this.state);
    this.enterRule(localctx, 22, ParPlusPlusParser.RULE_statues);
    try {
        this.state = 170;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.IF:
        case ParPlusPlusParser.RETURN:
        case ParPlusPlusParser.READ:
        case ParPlusPlusParser.WRITE:
        case ParPlusPlusParser.LP:
        case ParPlusPlusParser.MINUS:
        case ParPlusPlusParser.NOT:
        case ParPlusPlusParser.FOR:
        case ParPlusPlusParser.WHILE:
        case ParPlusPlusParser.ID:
        case ParPlusPlusParser.INT:
        case ParPlusPlusParser.FLOAT:
            this.enterOuterAlt(localctx, 1);
            this.state = 166;
            this.statue();
            this.state = 167;
            this.statues();
            break;
        case ParPlusPlusParser.RCB:
            this.enterOuterAlt(localctx, 2);

            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function StatueContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_statue;
    return this;
}

StatueContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatueContext.prototype.constructor = StatueContext;

StatueContext.prototype.asignation = function() {
    return this.getTypedRuleContext(AsignationContext,0);
};

StatueContext.prototype.SEMICOLON = function() {
    return this.getToken(ParPlusPlusParser.SEMICOLON, 0);
};

StatueContext.prototype.funcCall = function() {
    return this.getTypedRuleContext(FuncCallContext,0);
};

StatueContext.prototype.returnFunc = function() {
    return this.getTypedRuleContext(ReturnFuncContext,0);
};

StatueContext.prototype.read = function() {
    return this.getTypedRuleContext(ReadContext,0);
};

StatueContext.prototype.write = function() {
    return this.getTypedRuleContext(WriteContext,0);
};

StatueContext.prototype.decision = function() {
    return this.getTypedRuleContext(DecisionContext,0);
};

StatueContext.prototype.whileloop = function() {
    return this.getTypedRuleContext(WhileloopContext,0);
};

StatueContext.prototype.forloop = function() {
    return this.getTypedRuleContext(ForloopContext,0);
};

StatueContext.prototype.expresion = function() {
    return this.getTypedRuleContext(ExpresionContext,0);
};

StatueContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterStatue(this);
	}
};

StatueContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitStatue(this);
	}
};




ParPlusPlusParser.StatueContext = StatueContext;

ParPlusPlusParser.prototype.statue = function() {

    var localctx = new StatueContext(this, this._ctx, this.state);
    this.enterRule(localctx, 24, ParPlusPlusParser.RULE_statue);
    try {
        this.state = 193;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,9,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 172;
            this.asignation();
            this.state = 173;
            this.match(ParPlusPlusParser.SEMICOLON);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 175;
            this.funcCall();
            this.state = 176;
            this.match(ParPlusPlusParser.SEMICOLON);
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 178;
            this.returnFunc();
            this.state = 179;
            this.match(ParPlusPlusParser.SEMICOLON);
            break;

        case 4:
            this.enterOuterAlt(localctx, 4);
            this.state = 181;
            this.read();
            this.state = 182;
            this.match(ParPlusPlusParser.SEMICOLON);
            break;

        case 5:
            this.enterOuterAlt(localctx, 5);
            this.state = 184;
            this.write();
            this.state = 185;
            this.match(ParPlusPlusParser.SEMICOLON);
            break;

        case 6:
            this.enterOuterAlt(localctx, 6);
            this.state = 187;
            this.decision();
            break;

        case 7:
            this.enterOuterAlt(localctx, 7);
            this.state = 188;
            this.whileloop();
            break;

        case 8:
            this.enterOuterAlt(localctx, 8);
            this.state = 189;
            this.forloop();
            break;

        case 9:
            this.enterOuterAlt(localctx, 9);
            this.state = 190;
            this.expresion();
            this.state = 191;
            this.match(ParPlusPlusParser.SEMICOLON);
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function VarDimensionsContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_varDimensions;
    return this;
}

VarDimensionsContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
VarDimensionsContext.prototype.constructor = VarDimensionsContext;

VarDimensionsContext.prototype.LB = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(ParPlusPlusParser.LB);
    } else {
        return this.getToken(ParPlusPlusParser.LB, i);
    }
};


VarDimensionsContext.prototype.expresion = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpresionContext);
    } else {
        return this.getTypedRuleContext(ExpresionContext,i);
    }
};

VarDimensionsContext.prototype.RB = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(ParPlusPlusParser.RB);
    } else {
        return this.getToken(ParPlusPlusParser.RB, i);
    }
};


VarDimensionsContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterVarDimensions(this);
	}
};

VarDimensionsContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitVarDimensions(this);
	}
};




ParPlusPlusParser.VarDimensionsContext = VarDimensionsContext;

ParPlusPlusParser.prototype.varDimensions = function() {

    var localctx = new VarDimensionsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 26, ParPlusPlusParser.RULE_varDimensions);
    try {
        this.state = 207;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,10,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 195;
            this.match(ParPlusPlusParser.LB);
            this.state = 196;
            this.expresion();
            this.state = 197;
            this.match(ParPlusPlusParser.RB);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 199;
            this.match(ParPlusPlusParser.LB);
            this.state = 200;
            this.expresion();
            this.state = 201;
            this.match(ParPlusPlusParser.RB);
            this.state = 202;
            this.match(ParPlusPlusParser.LB);
            this.state = 203;
            this.expresion();
            this.state = 204;
            this.match(ParPlusPlusParser.RB);
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);

            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function AsignationContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_asignation;
    return this;
}

AsignationContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
AsignationContext.prototype.constructor = AsignationContext;

AsignationContext.prototype.ID = function() {
    return this.getToken(ParPlusPlusParser.ID, 0);
};

AsignationContext.prototype.varDimensions = function() {
    return this.getTypedRuleContext(VarDimensionsContext,0);
};

AsignationContext.prototype.ASSIGN = function() {
    return this.getToken(ParPlusPlusParser.ASSIGN, 0);
};

AsignationContext.prototype.expresion = function() {
    return this.getTypedRuleContext(ExpresionContext,0);
};

AsignationContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterAsignation(this);
	}
};

AsignationContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitAsignation(this);
	}
};




ParPlusPlusParser.AsignationContext = AsignationContext;

ParPlusPlusParser.prototype.asignation = function() {

    var localctx = new AsignationContext(this, this._ctx, this.state);
    this.enterRule(localctx, 28, ParPlusPlusParser.RULE_asignation);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 209;
        this.match(ParPlusPlusParser.ID);
        this.state = 210;
        this.varDimensions();
        this.state = 211;
        this.match(ParPlusPlusParser.ASSIGN);
        this.state = 212;
        this.expresion();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function FuncCallContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_funcCall;
    return this;
}

FuncCallContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FuncCallContext.prototype.constructor = FuncCallContext;

FuncCallContext.prototype.ID = function() {
    return this.getToken(ParPlusPlusParser.ID, 0);
};

FuncCallContext.prototype.LP = function() {
    return this.getToken(ParPlusPlusParser.LP, 0);
};

FuncCallContext.prototype.arguments = function() {
    return this.getTypedRuleContext(ArgumentsContext,0);
};

FuncCallContext.prototype.RP = function() {
    return this.getToken(ParPlusPlusParser.RP, 0);
};

FuncCallContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterFuncCall(this);
	}
};

FuncCallContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitFuncCall(this);
	}
};




ParPlusPlusParser.FuncCallContext = FuncCallContext;

ParPlusPlusParser.prototype.funcCall = function() {

    var localctx = new FuncCallContext(this, this._ctx, this.state);
    this.enterRule(localctx, 30, ParPlusPlusParser.RULE_funcCall);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 214;
        this.match(ParPlusPlusParser.ID);
        this.state = 215;
        this.match(ParPlusPlusParser.LP);
        this.state = 216;
        this.arguments();
        this.state = 217;
        this.match(ParPlusPlusParser.RP);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ReturnFuncContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_returnFunc;
    return this;
}

ReturnFuncContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ReturnFuncContext.prototype.constructor = ReturnFuncContext;

ReturnFuncContext.prototype.RETURN = function() {
    return this.getToken(ParPlusPlusParser.RETURN, 0);
};

ReturnFuncContext.prototype.LP = function() {
    return this.getToken(ParPlusPlusParser.LP, 0);
};

ReturnFuncContext.prototype.expresion = function() {
    return this.getTypedRuleContext(ExpresionContext,0);
};

ReturnFuncContext.prototype.RP = function() {
    return this.getToken(ParPlusPlusParser.RP, 0);
};

ReturnFuncContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterReturnFunc(this);
	}
};

ReturnFuncContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitReturnFunc(this);
	}
};




ParPlusPlusParser.ReturnFuncContext = ReturnFuncContext;

ParPlusPlusParser.prototype.returnFunc = function() {

    var localctx = new ReturnFuncContext(this, this._ctx, this.state);
    this.enterRule(localctx, 32, ParPlusPlusParser.RULE_returnFunc);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 219;
        this.match(ParPlusPlusParser.RETURN);
        this.state = 220;
        this.match(ParPlusPlusParser.LP);
        this.state = 221;
        this.expresion();
        this.state = 222;
        this.match(ParPlusPlusParser.RP);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ReadContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_read;
    return this;
}

ReadContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ReadContext.prototype.constructor = ReadContext;

ReadContext.prototype.READ = function() {
    return this.getToken(ParPlusPlusParser.READ, 0);
};

ReadContext.prototype.LP = function() {
    return this.getToken(ParPlusPlusParser.LP, 0);
};

ReadContext.prototype.xvars = function() {
    return this.getTypedRuleContext(XvarsContext,0);
};

ReadContext.prototype.RP = function() {
    return this.getToken(ParPlusPlusParser.RP, 0);
};

ReadContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterRead(this);
	}
};

ReadContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitRead(this);
	}
};




ParPlusPlusParser.ReadContext = ReadContext;

ParPlusPlusParser.prototype.read = function() {

    var localctx = new ReadContext(this, this._ctx, this.state);
    this.enterRule(localctx, 34, ParPlusPlusParser.RULE_read);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 224;
        this.match(ParPlusPlusParser.READ);
        this.state = 225;
        this.match(ParPlusPlusParser.LP);
        this.state = 226;
        this.xvars();
        this.state = 227;
        this.match(ParPlusPlusParser.RP);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function WriteContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_write;
    return this;
}

WriteContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
WriteContext.prototype.constructor = WriteContext;

WriteContext.prototype.WRITE = function() {
    return this.getToken(ParPlusPlusParser.WRITE, 0);
};

WriteContext.prototype.LP = function() {
    return this.getToken(ParPlusPlusParser.LP, 0);
};

WriteContext.prototype.xwrite = function() {
    return this.getTypedRuleContext(XwriteContext,0);
};

WriteContext.prototype.RP = function() {
    return this.getToken(ParPlusPlusParser.RP, 0);
};

WriteContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterWrite(this);
	}
};

WriteContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitWrite(this);
	}
};




ParPlusPlusParser.WriteContext = WriteContext;

ParPlusPlusParser.prototype.write = function() {

    var localctx = new WriteContext(this, this._ctx, this.state);
    this.enterRule(localctx, 36, ParPlusPlusParser.RULE_write);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 229;
        this.match(ParPlusPlusParser.WRITE);
        this.state = 230;
        this.match(ParPlusPlusParser.LP);
        this.state = 231;
        this.xwrite();
        this.state = 232;
        this.match(ParPlusPlusParser.RP);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function XwriteContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_xwrite;
    return this;
}

XwriteContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
XwriteContext.prototype.constructor = XwriteContext;

XwriteContext.prototype.expresion = function() {
    return this.getTypedRuleContext(ExpresionContext,0);
};

XwriteContext.prototype.ywrite = function() {
    return this.getTypedRuleContext(YwriteContext,0);
};

XwriteContext.prototype.STRING = function() {
    return this.getToken(ParPlusPlusParser.STRING, 0);
};

XwriteContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterXwrite(this);
	}
};

XwriteContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitXwrite(this);
	}
};




ParPlusPlusParser.XwriteContext = XwriteContext;

ParPlusPlusParser.prototype.xwrite = function() {

    var localctx = new XwriteContext(this, this._ctx, this.state);
    this.enterRule(localctx, 38, ParPlusPlusParser.RULE_xwrite);
    try {
        this.state = 239;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.LP:
        case ParPlusPlusParser.MINUS:
        case ParPlusPlusParser.NOT:
        case ParPlusPlusParser.ID:
        case ParPlusPlusParser.INT:
        case ParPlusPlusParser.FLOAT:
            this.enterOuterAlt(localctx, 1);
            this.state = 234;
            this.expresion();
            this.state = 235;
            this.ywrite();
            break;
        case ParPlusPlusParser.STRING:
            this.enterOuterAlt(localctx, 2);
            this.state = 237;
            this.match(ParPlusPlusParser.STRING);
            this.state = 238;
            this.ywrite();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function YwriteContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_ywrite;
    return this;
}

YwriteContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
YwriteContext.prototype.constructor = YwriteContext;

YwriteContext.prototype.COMMA = function() {
    return this.getToken(ParPlusPlusParser.COMMA, 0);
};

YwriteContext.prototype.xwrite = function() {
    return this.getTypedRuleContext(XwriteContext,0);
};

YwriteContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterYwrite(this);
	}
};

YwriteContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitYwrite(this);
	}
};




ParPlusPlusParser.YwriteContext = YwriteContext;

ParPlusPlusParser.prototype.ywrite = function() {

    var localctx = new YwriteContext(this, this._ctx, this.state);
    this.enterRule(localctx, 40, ParPlusPlusParser.RULE_ywrite);
    try {
        this.state = 244;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.COMMA:
            this.enterOuterAlt(localctx, 1);
            this.state = 241;
            this.match(ParPlusPlusParser.COMMA);
            this.state = 242;
            this.xwrite();
            break;
        case ParPlusPlusParser.RP:
            this.enterOuterAlt(localctx, 2);

            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function DecisionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_decision;
    return this;
}

DecisionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
DecisionContext.prototype.constructor = DecisionContext;

DecisionContext.prototype.IF = function() {
    return this.getToken(ParPlusPlusParser.IF, 0);
};

DecisionContext.prototype.LP = function() {
    return this.getToken(ParPlusPlusParser.LP, 0);
};

DecisionContext.prototype.expresion = function() {
    return this.getTypedRuleContext(ExpresionContext,0);
};

DecisionContext.prototype.RP = function() {
    return this.getToken(ParPlusPlusParser.RP, 0);
};

DecisionContext.prototype.THEN = function() {
    return this.getToken(ParPlusPlusParser.THEN, 0);
};

DecisionContext.prototype.LCB = function() {
    return this.getToken(ParPlusPlusParser.LCB, 0);
};

DecisionContext.prototype.statues = function() {
    return this.getTypedRuleContext(StatuesContext,0);
};

DecisionContext.prototype.RCB = function() {
    return this.getToken(ParPlusPlusParser.RCB, 0);
};

DecisionContext.prototype.xdecision = function() {
    return this.getTypedRuleContext(XdecisionContext,0);
};

DecisionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterDecision(this);
	}
};

DecisionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitDecision(this);
	}
};




ParPlusPlusParser.DecisionContext = DecisionContext;

ParPlusPlusParser.prototype.decision = function() {

    var localctx = new DecisionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 42, ParPlusPlusParser.RULE_decision);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 246;
        this.match(ParPlusPlusParser.IF);
        this.state = 247;
        this.match(ParPlusPlusParser.LP);
        this.state = 248;
        this.expresion();
        this.state = 249;
        this.match(ParPlusPlusParser.RP);
        this.state = 250;
        this.match(ParPlusPlusParser.THEN);
        this.state = 251;
        this.match(ParPlusPlusParser.LCB);
        this.state = 252;
        this.statues();
        this.state = 253;
        this.match(ParPlusPlusParser.RCB);
        this.state = 254;
        this.xdecision();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function XdecisionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_xdecision;
    return this;
}

XdecisionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
XdecisionContext.prototype.constructor = XdecisionContext;

XdecisionContext.prototype.ELSE = function() {
    return this.getToken(ParPlusPlusParser.ELSE, 0);
};

XdecisionContext.prototype.LCB = function() {
    return this.getToken(ParPlusPlusParser.LCB, 0);
};

XdecisionContext.prototype.statues = function() {
    return this.getTypedRuleContext(StatuesContext,0);
};

XdecisionContext.prototype.RCB = function() {
    return this.getToken(ParPlusPlusParser.RCB, 0);
};

XdecisionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterXdecision(this);
	}
};

XdecisionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitXdecision(this);
	}
};




ParPlusPlusParser.XdecisionContext = XdecisionContext;

ParPlusPlusParser.prototype.xdecision = function() {

    var localctx = new XdecisionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 44, ParPlusPlusParser.RULE_xdecision);
    try {
        this.state = 262;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.ELSE:
            this.enterOuterAlt(localctx, 1);
            this.state = 256;
            this.match(ParPlusPlusParser.ELSE);
            this.state = 257;
            this.match(ParPlusPlusParser.LCB);
            this.state = 258;
            this.statues();
            this.state = 259;
            this.match(ParPlusPlusParser.RCB);
            break;
        case ParPlusPlusParser.IF:
        case ParPlusPlusParser.RETURN:
        case ParPlusPlusParser.READ:
        case ParPlusPlusParser.WRITE:
        case ParPlusPlusParser.RCB:
        case ParPlusPlusParser.LP:
        case ParPlusPlusParser.MINUS:
        case ParPlusPlusParser.NOT:
        case ParPlusPlusParser.FOR:
        case ParPlusPlusParser.WHILE:
        case ParPlusPlusParser.ID:
        case ParPlusPlusParser.INT:
        case ParPlusPlusParser.FLOAT:
            this.enterOuterAlt(localctx, 2);

            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ForloopContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_forloop;
    return this;
}

ForloopContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ForloopContext.prototype.constructor = ForloopContext;

ForloopContext.prototype.FOR = function() {
    return this.getToken(ParPlusPlusParser.FOR, 0);
};

ForloopContext.prototype.asignation = function() {
    return this.getTypedRuleContext(AsignationContext,0);
};

ForloopContext.prototype.TO = function() {
    return this.getToken(ParPlusPlusParser.TO, 0);
};

ForloopContext.prototype.expresion = function() {
    return this.getTypedRuleContext(ExpresionContext,0);
};

ForloopContext.prototype.DO = function() {
    return this.getToken(ParPlusPlusParser.DO, 0);
};

ForloopContext.prototype.LCB = function() {
    return this.getToken(ParPlusPlusParser.LCB, 0);
};

ForloopContext.prototype.statues = function() {
    return this.getTypedRuleContext(StatuesContext,0);
};

ForloopContext.prototype.RCB = function() {
    return this.getToken(ParPlusPlusParser.RCB, 0);
};

ForloopContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterForloop(this);
	}
};

ForloopContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitForloop(this);
	}
};




ParPlusPlusParser.ForloopContext = ForloopContext;

ParPlusPlusParser.prototype.forloop = function() {

    var localctx = new ForloopContext(this, this._ctx, this.state);
    this.enterRule(localctx, 46, ParPlusPlusParser.RULE_forloop);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 264;
        this.match(ParPlusPlusParser.FOR);
        this.state = 265;
        this.asignation();
        this.state = 266;
        this.match(ParPlusPlusParser.TO);
        this.state = 267;
        this.expresion();
        this.state = 268;
        this.match(ParPlusPlusParser.DO);
        this.state = 269;
        this.match(ParPlusPlusParser.LCB);
        this.state = 270;
        this.statues();
        this.state = 271;
        this.match(ParPlusPlusParser.RCB);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function WhileloopContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_whileloop;
    return this;
}

WhileloopContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
WhileloopContext.prototype.constructor = WhileloopContext;

WhileloopContext.prototype.WHILE = function() {
    return this.getToken(ParPlusPlusParser.WHILE, 0);
};

WhileloopContext.prototype.LP = function() {
    return this.getToken(ParPlusPlusParser.LP, 0);
};

WhileloopContext.prototype.expresion = function() {
    return this.getTypedRuleContext(ExpresionContext,0);
};

WhileloopContext.prototype.RP = function() {
    return this.getToken(ParPlusPlusParser.RP, 0);
};

WhileloopContext.prototype.DO = function() {
    return this.getToken(ParPlusPlusParser.DO, 0);
};

WhileloopContext.prototype.LCB = function() {
    return this.getToken(ParPlusPlusParser.LCB, 0);
};

WhileloopContext.prototype.statues = function() {
    return this.getTypedRuleContext(StatuesContext,0);
};

WhileloopContext.prototype.RCB = function() {
    return this.getToken(ParPlusPlusParser.RCB, 0);
};

WhileloopContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterWhileloop(this);
	}
};

WhileloopContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitWhileloop(this);
	}
};




ParPlusPlusParser.WhileloopContext = WhileloopContext;

ParPlusPlusParser.prototype.whileloop = function() {

    var localctx = new WhileloopContext(this, this._ctx, this.state);
    this.enterRule(localctx, 48, ParPlusPlusParser.RULE_whileloop);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 273;
        this.match(ParPlusPlusParser.WHILE);
        this.state = 274;
        this.match(ParPlusPlusParser.LP);
        this.state = 275;
        this.expresion();
        this.state = 276;
        this.match(ParPlusPlusParser.RP);
        this.state = 277;
        this.match(ParPlusPlusParser.DO);
        this.state = 278;
        this.match(ParPlusPlusParser.LCB);
        this.state = 279;
        this.statues();
        this.state = 280;
        this.match(ParPlusPlusParser.RCB);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ArgumentsContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_arguments;
    return this;
}

ArgumentsContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ArgumentsContext.prototype.constructor = ArgumentsContext;

ArgumentsContext.prototype.expresion = function() {
    return this.getTypedRuleContext(ExpresionContext,0);
};

ArgumentsContext.prototype.rarguments = function() {
    return this.getTypedRuleContext(RargumentsContext,0);
};

ArgumentsContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterArguments(this);
	}
};

ArgumentsContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitArguments(this);
	}
};




ParPlusPlusParser.ArgumentsContext = ArgumentsContext;

ParPlusPlusParser.prototype.arguments = function() {

    var localctx = new ArgumentsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 50, ParPlusPlusParser.RULE_arguments);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 282;
        this.expresion();
        this.state = 283;
        this.rarguments();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function RargumentsContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_rarguments;
    return this;
}

RargumentsContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
RargumentsContext.prototype.constructor = RargumentsContext;

RargumentsContext.prototype.COMMA = function() {
    return this.getToken(ParPlusPlusParser.COMMA, 0);
};

RargumentsContext.prototype.arguments = function() {
    return this.getTypedRuleContext(ArgumentsContext,0);
};

RargumentsContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterRarguments(this);
	}
};

RargumentsContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitRarguments(this);
	}
};




ParPlusPlusParser.RargumentsContext = RargumentsContext;

ParPlusPlusParser.prototype.rarguments = function() {

    var localctx = new RargumentsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 52, ParPlusPlusParser.RULE_rarguments);
    try {
        this.state = 288;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.COMMA:
            this.enterOuterAlt(localctx, 1);
            this.state = 285;
            this.match(ParPlusPlusParser.COMMA);
            this.state = 286;
            this.arguments();
            break;
        case ParPlusPlusParser.RP:
            this.enterOuterAlt(localctx, 2);

            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ExpresionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_expresion;
    return this;
}

ExpresionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ExpresionContext.prototype.constructor = ExpresionContext;

ExpresionContext.prototype.exp = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpContext);
    } else {
        return this.getTypedRuleContext(ExpContext,i);
    }
};

ExpresionContext.prototype.LTEQ = function() {
    return this.getToken(ParPlusPlusParser.LTEQ, 0);
};

ExpresionContext.prototype.GTEQ = function() {
    return this.getToken(ParPlusPlusParser.GTEQ, 0);
};

ExpresionContext.prototype.EQ = function() {
    return this.getToken(ParPlusPlusParser.EQ, 0);
};

ExpresionContext.prototype.NEQ = function() {
    return this.getToken(ParPlusPlusParser.NEQ, 0);
};

ExpresionContext.prototype.AND = function() {
    return this.getToken(ParPlusPlusParser.AND, 0);
};

ExpresionContext.prototype.OR = function() {
    return this.getToken(ParPlusPlusParser.OR, 0);
};

ExpresionContext.prototype.LT = function() {
    return this.getToken(ParPlusPlusParser.LT, 0);
};

ExpresionContext.prototype.GT = function() {
    return this.getToken(ParPlusPlusParser.GT, 0);
};

ExpresionContext.prototype.NOT = function() {
    return this.getToken(ParPlusPlusParser.NOT, 0);
};

ExpresionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterExpresion(this);
	}
};

ExpresionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitExpresion(this);
	}
};




ParPlusPlusParser.ExpresionContext = ExpresionContext;

ParPlusPlusParser.prototype.expresion = function() {

    var localctx = new ExpresionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 54, ParPlusPlusParser.RULE_expresion);
    try {
        this.state = 325;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,15,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 290;
            this.exp(0);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 291;
            this.exp(0);
            this.state = 292;
            this.match(ParPlusPlusParser.LTEQ);
            this.state = 293;
            this.exp(0);
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 295;
            this.exp(0);
            this.state = 296;
            this.match(ParPlusPlusParser.GTEQ);
            this.state = 297;
            this.exp(0);
            break;

        case 4:
            this.enterOuterAlt(localctx, 4);
            this.state = 299;
            this.exp(0);
            this.state = 300;
            this.match(ParPlusPlusParser.EQ);
            this.state = 301;
            this.exp(0);
            break;

        case 5:
            this.enterOuterAlt(localctx, 5);
            this.state = 303;
            this.exp(0);
            this.state = 304;
            this.match(ParPlusPlusParser.NEQ);
            this.state = 305;
            this.exp(0);
            break;

        case 6:
            this.enterOuterAlt(localctx, 6);
            this.state = 307;
            this.exp(0);
            this.state = 308;
            this.match(ParPlusPlusParser.AND);
            this.state = 309;
            this.exp(0);
            break;

        case 7:
            this.enterOuterAlt(localctx, 7);
            this.state = 311;
            this.exp(0);
            this.state = 312;
            this.match(ParPlusPlusParser.OR);
            this.state = 313;
            this.exp(0);
            break;

        case 8:
            this.enterOuterAlt(localctx, 8);
            this.state = 315;
            this.exp(0);
            this.state = 316;
            this.match(ParPlusPlusParser.LT);
            this.state = 317;
            this.exp(0);
            break;

        case 9:
            this.enterOuterAlt(localctx, 9);
            this.state = 319;
            this.exp(0);
            this.state = 320;
            this.match(ParPlusPlusParser.GT);
            this.state = 321;
            this.exp(0);
            break;

        case 10:
            this.enterOuterAlt(localctx, 10);
            this.state = 323;
            this.match(ParPlusPlusParser.NOT);
            this.state = 324;
            this.exp(0);
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ExpContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_exp;
    return this;
}

ExpContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ExpContext.prototype.constructor = ExpContext;

ExpContext.prototype.termino = function() {
    return this.getTypedRuleContext(TerminoContext,0);
};

ExpContext.prototype.exp = function() {
    return this.getTypedRuleContext(ExpContext,0);
};

ExpContext.prototype.PLUS = function() {
    return this.getToken(ParPlusPlusParser.PLUS, 0);
};

ExpContext.prototype.MINUS = function() {
    return this.getToken(ParPlusPlusParser.MINUS, 0);
};

ExpContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterExp(this);
	}
};

ExpContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitExp(this);
	}
};



ParPlusPlusParser.prototype.exp = function(_p) {
	if(_p===undefined) {
	    _p = 0;
	}
    var _parentctx = this._ctx;
    var _parentState = this.state;
    var localctx = new ExpContext(this, this._ctx, _parentState);
    var _prevctx = localctx;
    var _startState = 56;
    this.enterRecursionRule(localctx, 56, ParPlusPlusParser.RULE_exp, _p);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 328;
        this.termino(0);
        this._ctx.stop = this._input.LT(-1);
        this.state = 338;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,17,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                if(this._parseListeners!==null) {
                    this.triggerExitRuleEvent();
                }
                _prevctx = localctx;
                this.state = 336;
                this._errHandler.sync(this);
                var la_ = this._interp.adaptivePredict(this._input,16,this._ctx);
                switch(la_) {
                case 1:
                    localctx = new ExpContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, ParPlusPlusParser.RULE_exp);
                    this.state = 330;
                    if (!( this.precpred(this._ctx, 3))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
                    }
                    this.state = 331;
                    this.match(ParPlusPlusParser.PLUS);
                    this.state = 332;
                    this.termino(0);
                    break;

                case 2:
                    localctx = new ExpContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, ParPlusPlusParser.RULE_exp);
                    this.state = 333;
                    if (!( this.precpred(this._ctx, 2))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 2)");
                    }
                    this.state = 334;
                    this.match(ParPlusPlusParser.MINUS);
                    this.state = 335;
                    this.termino(0);
                    break;

                } 
            }
            this.state = 340;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,17,this._ctx);
        }

    } catch( error) {
        if(error instanceof antlr4.error.RecognitionException) {
	        localctx.exception = error;
	        this._errHandler.reportError(this, error);
	        this._errHandler.recover(this, error);
	    } else {
	    	throw error;
	    }
    } finally {
        this.unrollRecursionContexts(_parentctx)
    }
    return localctx;
};


function TerminoContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_termino;
    return this;
}

TerminoContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
TerminoContext.prototype.constructor = TerminoContext;

TerminoContext.prototype.factor = function() {
    return this.getTypedRuleContext(FactorContext,0);
};

TerminoContext.prototype.termino = function() {
    return this.getTypedRuleContext(TerminoContext,0);
};

TerminoContext.prototype.MULT = function() {
    return this.getToken(ParPlusPlusParser.MULT, 0);
};

TerminoContext.prototype.DIV = function() {
    return this.getToken(ParPlusPlusParser.DIV, 0);
};

TerminoContext.prototype.MOD = function() {
    return this.getToken(ParPlusPlusParser.MOD, 0);
};

TerminoContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterTermino(this);
	}
};

TerminoContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitTermino(this);
	}
};



ParPlusPlusParser.prototype.termino = function(_p) {
	if(_p===undefined) {
	    _p = 0;
	}
    var _parentctx = this._ctx;
    var _parentState = this.state;
    var localctx = new TerminoContext(this, this._ctx, _parentState);
    var _prevctx = localctx;
    var _startState = 58;
    this.enterRecursionRule(localctx, 58, ParPlusPlusParser.RULE_termino, _p);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 342;
        this.factor();
        this._ctx.stop = this._input.LT(-1);
        this.state = 355;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,19,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                if(this._parseListeners!==null) {
                    this.triggerExitRuleEvent();
                }
                _prevctx = localctx;
                this.state = 353;
                this._errHandler.sync(this);
                var la_ = this._interp.adaptivePredict(this._input,18,this._ctx);
                switch(la_) {
                case 1:
                    localctx = new TerminoContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, ParPlusPlusParser.RULE_termino);
                    this.state = 344;
                    if (!( this.precpred(this._ctx, 4))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
                    }
                    this.state = 345;
                    this.match(ParPlusPlusParser.MULT);
                    this.state = 346;
                    this.factor();
                    break;

                case 2:
                    localctx = new TerminoContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, ParPlusPlusParser.RULE_termino);
                    this.state = 347;
                    if (!( this.precpred(this._ctx, 3))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
                    }
                    this.state = 348;
                    this.match(ParPlusPlusParser.DIV);
                    this.state = 349;
                    this.factor();
                    break;

                case 3:
                    localctx = new TerminoContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, ParPlusPlusParser.RULE_termino);
                    this.state = 350;
                    if (!( this.precpred(this._ctx, 2))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 2)");
                    }
                    this.state = 351;
                    this.match(ParPlusPlusParser.MOD);
                    this.state = 352;
                    this.factor();
                    break;

                } 
            }
            this.state = 357;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,19,this._ctx);
        }

    } catch( error) {
        if(error instanceof antlr4.error.RecognitionException) {
	        localctx.exception = error;
	        this._errHandler.reportError(this, error);
	        this._errHandler.recover(this, error);
	    } else {
	    	throw error;
	    }
    } finally {
        this.unrollRecursionContexts(_parentctx)
    }
    return localctx;
};


function FactorContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_factor;
    return this;
}

FactorContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FactorContext.prototype.constructor = FactorContext;

FactorContext.prototype.funcCall = function() {
    return this.getTypedRuleContext(FuncCallContext,0);
};

FactorContext.prototype.LP = function() {
    return this.getToken(ParPlusPlusParser.LP, 0);
};

FactorContext.prototype.expresion = function() {
    return this.getTypedRuleContext(ExpresionContext,0);
};

FactorContext.prototype.RP = function() {
    return this.getToken(ParPlusPlusParser.RP, 0);
};

FactorContext.prototype.cte = function() {
    return this.getTypedRuleContext(CteContext,0);
};

FactorContext.prototype.MINUS = function() {
    return this.getToken(ParPlusPlusParser.MINUS, 0);
};

FactorContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterFactor(this);
	}
};

FactorContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitFactor(this);
	}
};




ParPlusPlusParser.FactorContext = FactorContext;

ParPlusPlusParser.prototype.factor = function() {

    var localctx = new FactorContext(this, this._ctx, this.state);
    this.enterRule(localctx, 60, ParPlusPlusParser.RULE_factor);
    try {
        this.state = 366;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,20,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 358;
            this.funcCall();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 359;
            this.match(ParPlusPlusParser.LP);
            this.state = 360;
            this.expresion();
            this.state = 361;
            this.match(ParPlusPlusParser.RP);
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 363;
            this.cte();
            break;

        case 4:
            this.enterOuterAlt(localctx, 4);
            this.state = 364;
            this.match(ParPlusPlusParser.MINUS);
            this.state = 365;
            this.cte();
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function TypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_type;
    return this;
}

TypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
TypeContext.prototype.constructor = TypeContext;


TypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterType(this);
	}
};

TypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitType(this);
	}
};




ParPlusPlusParser.TypeContext = TypeContext;

ParPlusPlusParser.prototype.type = function() {

    var localctx = new TypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 62, ParPlusPlusParser.RULE_type);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 368;
        _la = this._input.LA(1);
        if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ParPlusPlusParser.T__0) | (1 << ParPlusPlusParser.T__1) | (1 << ParPlusPlusParser.T__2))) !== 0))) {
        this._errHandler.recoverInline(this);
        }
        else {
        	this._errHandler.reportMatch(this);
            this.consume();
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function CteContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_cte;
    return this;
}

CteContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
CteContext.prototype.constructor = CteContext;

CteContext.prototype.ID = function() {
    return this.getToken(ParPlusPlusParser.ID, 0);
};

CteContext.prototype.varDimensions = function() {
    return this.getTypedRuleContext(VarDimensionsContext,0);
};

CteContext.prototype.INT = function() {
    return this.getToken(ParPlusPlusParser.INT, 0);
};

CteContext.prototype.FLOAT = function() {
    return this.getToken(ParPlusPlusParser.FLOAT, 0);
};

CteContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterCte(this);
	}
};

CteContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitCte(this);
	}
};




ParPlusPlusParser.CteContext = CteContext;

ParPlusPlusParser.prototype.cte = function() {

    var localctx = new CteContext(this, this._ctx, this.state);
    this.enterRule(localctx, 64, ParPlusPlusParser.RULE_cte);
    try {
        this.state = 374;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.ID:
            this.enterOuterAlt(localctx, 1);
            this.state = 370;
            this.match(ParPlusPlusParser.ID);
            this.state = 371;
            this.varDimensions();
            break;
        case ParPlusPlusParser.INT:
            this.enterOuterAlt(localctx, 2);
            this.state = 372;
            this.match(ParPlusPlusParser.INT);
            break;
        case ParPlusPlusParser.FLOAT:
            this.enterOuterAlt(localctx, 3);
            this.state = 373;
            this.match(ParPlusPlusParser.FLOAT);
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


ParPlusPlusParser.prototype.sempred = function(localctx, ruleIndex, predIndex) {
	switch(ruleIndex) {
	case 28:
			return this.exp_sempred(localctx, predIndex);
	case 29:
			return this.termino_sempred(localctx, predIndex);
    default:
        throw "No predicate with index:" + ruleIndex;
   }
};

ParPlusPlusParser.prototype.exp_sempred = function(localctx, predIndex) {
	switch(predIndex) {
		case 0:
			return this.precpred(this._ctx, 3);
		case 1:
			return this.precpred(this._ctx, 2);
		default:
			throw "No predicate with index:" + predIndex;
	}
};

ParPlusPlusParser.prototype.termino_sempred = function(localctx, predIndex) {
	switch(predIndex) {
		case 2:
			return this.precpred(this._ctx, 4);
		case 3:
			return this.precpred(this._ctx, 3);
		case 4:
			return this.precpred(this._ctx, 2);
		default:
			throw "No predicate with index:" + predIndex;
	}
};


exports.ParPlusPlusParser = ParPlusPlusParser;
