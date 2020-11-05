// Generated from ParPlusPlus.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');
var ParPlusPlusListener = require('./ParPlusPlusListener').ParPlusPlusListener;
var grammarFileName = "ParPlusPlus.g4";


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u00031\u01eb\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004",
    "\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004",
    "\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014\t",
    "\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017\t\u0017\u0004",
    "\u0018\t\u0018\u0004\u0019\t\u0019\u0004\u001a\t\u001a\u0004\u001b\t",
    "\u001b\u0004\u001c\t\u001c\u0004\u001d\t\u001d\u0004\u001e\t\u001e\u0004",
    "\u001f\t\u001f\u0004 \t \u0004!\t!\u0004\"\t\"\u0004#\t#\u0004$\t$\u0004",
    "%\t%\u0004&\t&\u0004\'\t\'\u0004(\t(\u0004)\t)\u0004*\t*\u0004+\t+\u0004",
    ",\t,\u0004-\t-\u0004.\t.\u0004/\t/\u00040\t0\u00041\t1\u00042\t2\u0004",
    "3\t3\u00044\t4\u00045\t5\u00046\t6\u00047\t7\u00048\t8\u00049\t9\u0003",
    "\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003",
    "\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003",
    "\u0004\u0005\u0004\u0086\n\u0004\u0003\u0005\u0003\u0005\u0003\u0005",
    "\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006",
    "\u0090\n\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003",
    "\u0007\u0003\u0007\u0005\u0007\u0098\n\u0007\u0003\b\u0003\b\u0003\b",
    "\u0005\b\u009d\n\b\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003",
    "\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003",
    "\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003",
    "\t\u0003\t\u0003\t\u0005\t\u00ba\n\t\u0003\n\u0003\n\u0003\u000b\u0003",
    "\u000b\u0005\u000b\u00c0\n\u000b\u0003\f\u0003\f\u0003\f\u0003\f\u0003",
    "\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0005\f\u00cc\n\f\u0003\r",
    "\u0003\r\u0003\r\u0005\r\u00d1\n\r\u0003\u000e\u0003\u000e\u0003\u000e",
    "\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e",
    "\u0003\u000e\u0005\u000e\u00dd\n\u000e\u0003\u000f\u0003\u000f\u0003",
    "\u000f\u0003\u000f\u0005\u000f\u00e3\n\u000f\u0003\u0010\u0003\u0010",
    "\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u00eb\n",
    "\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003",
    "\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003",
    "\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003",
    "\u0011\u0005\u0011\u00ff\n\u0011\u0003\u0012\u0003\u0012\u0003\u0013",
    "\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013",
    "\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013",
    "\u010f\n\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003",
    "\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003",
    "\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003",
    "\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003",
    "\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003",
    "\u0019\u0003\u0019\u0005\u0019\u012f\n\u0019\u0003\u001a\u0003\u001a",
    "\u0003\u001a\u0005\u001a\u0134\n\u001a\u0003\u001b\u0003\u001b\u0003",
    "\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003",
    "\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003",
    "\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0005\u001d\u0148\n\u001d",
    "\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f",
    "\u0003\u001f\u0003\u001f\u0003 \u0003 \u0003 \u0003 \u0003 \u0003!\u0003",
    "!\u0003!\u0003\"\u0003\"\u0003\"\u0003\"\u0003\"\u0003#\u0003#\u0003",
    "#\u0003#\u0003#\u0003$\u0003$\u0003$\u0003$\u0005$\u0168\n$\u0003%\u0003",
    "%\u0003%\u0003%\u0003%\u0005%\u016f\n%\u0003&\u0003&\u0003&\u0003&\u0003",
    "&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003",
    "&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003",
    "&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003",
    "&\u0003&\u0005&\u0195\n&\u0003\'\u0003\'\u0003(\u0003(\u0003)\u0003",
    ")\u0003*\u0003*\u0003+\u0003+\u0003,\u0003,\u0003-\u0003-\u0003.\u0003",
    ".\u0003/\u0003/\u00030\u00030\u00030\u00030\u00030\u00030\u00030\u0003",
    "0\u00030\u00030\u00030\u00070\u01b4\n0\f0\u000e0\u01b7\u000b0\u0003",
    "1\u00031\u00032\u00032\u00033\u00033\u00033\u00033\u00033\u00033\u0003",
    "3\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00073\u01cc",
    "\n3\f3\u000e3\u01cf\u000b3\u00034\u00034\u00035\u00035\u00036\u0003",
    "6\u00037\u00037\u00037\u00037\u00037\u00037\u00037\u00037\u00057\u01df",
    "\n7\u00038\u00038\u00039\u00039\u00039\u00039\u00039\u00039\u00059\u01e9",
    "\n9\u00039\u0002\u0004^d:\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012",
    "\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ",
    "\\^`bdfhjlnp\u0002\u0003\u0003\u0002\u0003\u0005\u0002\u01e3\u0002r",
    "\u0003\u0002\u0002\u0002\u0004y\u0003\u0002\u0002\u0002\u0006\u0085",
    "\u0003\u0002\u0002\u0002\b\u0087\u0003\u0002\u0002\u0002\n\u008f\u0003",
    "\u0002\u0002\u0002\f\u0097\u0003\u0002\u0002\u0002\u000e\u009c\u0003",
    "\u0002\u0002\u0002\u0010\u00b9\u0003\u0002\u0002\u0002\u0012\u00bb\u0003",
    "\u0002\u0002\u0002\u0014\u00bf\u0003\u0002\u0002\u0002\u0016\u00cb\u0003",
    "\u0002\u0002\u0002\u0018\u00d0\u0003\u0002\u0002\u0002\u001a\u00dc\u0003",
    "\u0002\u0002\u0002\u001c\u00e2\u0003\u0002\u0002\u0002\u001e\u00ea\u0003",
    "\u0002\u0002\u0002 \u00fe\u0003\u0002\u0002\u0002\"\u0100\u0003\u0002",
    "\u0002\u0002$\u010e\u0003\u0002\u0002\u0002&\u0110\u0003\u0002\u0002",
    "\u0002(\u0115\u0003\u0002\u0002\u0002*\u011a\u0003\u0002\u0002\u0002",
    ",\u011f\u0003\u0002\u0002\u0002.\u0124\u0003\u0002\u0002\u00020\u012e",
    "\u0003\u0002\u0002\u00022\u0133\u0003\u0002\u0002\u00024\u0135\u0003",
    "\u0002\u0002\u00026\u013b\u0003\u0002\u0002\u00028\u0147\u0003\u0002",
    "\u0002\u0002:\u0149\u0003\u0002\u0002\u0002<\u014d\u0003\u0002\u0002",
    "\u0002>\u0151\u0003\u0002\u0002\u0002@\u0156\u0003\u0002\u0002\u0002",
    "B\u0159\u0003\u0002\u0002\u0002D\u015e\u0003\u0002\u0002\u0002F\u0167",
    "\u0003\u0002\u0002\u0002H\u016e\u0003\u0002\u0002\u0002J\u0194\u0003",
    "\u0002\u0002\u0002L\u0196\u0003\u0002\u0002\u0002N\u0198\u0003\u0002",
    "\u0002\u0002P\u019a\u0003\u0002\u0002\u0002R\u019c\u0003\u0002\u0002",
    "\u0002T\u019e\u0003\u0002\u0002\u0002V\u01a0\u0003\u0002\u0002\u0002",
    "X\u01a2\u0003\u0002\u0002\u0002Z\u01a4\u0003\u0002\u0002\u0002\\\u01a6",
    "\u0003\u0002\u0002\u0002^\u01a8\u0003\u0002\u0002\u0002`\u01b8\u0003",
    "\u0002\u0002\u0002b\u01ba\u0003\u0002\u0002\u0002d\u01bc\u0003\u0002",
    "\u0002\u0002f\u01d0\u0003\u0002\u0002\u0002h\u01d2\u0003\u0002\u0002",
    "\u0002j\u01d4\u0003\u0002\u0002\u0002l\u01de\u0003\u0002\u0002\u0002",
    "n\u01e0\u0003\u0002\u0002\u0002p\u01e8\u0003\u0002\u0002\u0002rs\u0007",
    "\u0007\u0002\u0002st\u0007,\u0002\u0002tu\u0007\u0012\u0002\u0002uv",
    "\u0005\u0006\u0004\u0002vw\u0005\u0010\t\u0002wx\u0005\u0004\u0003\u0002",
    "x\u0003\u0003\u0002\u0002\u0002yz\u0007\n\u0002\u0002z{\u0007\u0018",
    "\u0002\u0002{|\u0007\u0019\u0002\u0002|}\u0007\u0016\u0002\u0002}~\u0005",
    "\u001c\u000f\u0002~\u007f\u0007\u0017\u0002\u0002\u007f\u0005\u0003",
    "\u0002\u0002\u0002\u0080\u0081\u0007\t\u0002\u0002\u0081\u0082\u0005",
    "\b\u0005\u0002\u0082\u0083\u0005\n\u0006\u0002\u0083\u0086\u0003\u0002",
    "\u0002\u0002\u0084\u0086\u0003\u0002\u0002\u0002\u0085\u0080\u0003\u0002",
    "\u0002\u0002\u0085\u0084\u0003\u0002\u0002\u0002\u0086\u0007\u0003\u0002",
    "\u0002\u0002\u0087\u0088\u0005n8\u0002\u0088\u0089\u0005\f\u0007\u0002",
    "\u0089\u008a\u0007\u0012\u0002\u0002\u008a\t\u0003\u0002\u0002\u0002",
    "\u008b\u008c\u0005\b\u0005\u0002\u008c\u008d\u0005\n\u0006\u0002\u008d",
    "\u0090\u0003\u0002\u0002\u0002\u008e\u0090\u0003\u0002\u0002\u0002\u008f",
    "\u008b\u0003\u0002\u0002\u0002\u008f\u008e\u0003\u0002\u0002\u0002\u0090",
    "\u000b\u0003\u0002\u0002\u0002\u0091\u0092\u0007,\u0002\u0002\u0092",
    "\u0098\u0005\u000e\b\u0002\u0093\u0094\u0007,\u0002\u0002\u0094\u0095",
    "\u0005\u001a\u000e\u0002\u0095\u0096\u0005\u000e\b\u0002\u0096\u0098",
    "\u0003\u0002\u0002\u0002\u0097\u0091\u0003\u0002\u0002\u0002\u0097\u0093",
    "\u0003\u0002\u0002\u0002\u0098\r\u0003\u0002\u0002\u0002\u0099\u009a",
    "\u0007\u0013\u0002\u0002\u009a\u009d\u0005\f\u0007\u0002\u009b\u009d",
    "\u0003\u0002\u0002\u0002\u009c\u0099\u0003\u0002\u0002\u0002\u009c\u009b",
    "\u0003\u0002\u0002\u0002\u009d\u000f\u0003\u0002\u0002\u0002\u009e\u009f",
    "\u0005n8\u0002\u009f\u00a0\u0007\b\u0002\u0002\u00a0\u00a1\u0007,\u0002",
    "\u0002\u00a1\u00a2\u0007\u0018\u0002\u0002\u00a2\u00a3\u0005\u0016\f",
    "\u0002\u00a3\u00a4\u0007\u0019\u0002\u0002\u00a4\u00a5\u0005\u0006\u0004",
    "\u0002\u00a5\u00a6\u0007\u0016\u0002\u0002\u00a6\u00a7\u0005\u001e\u0010",
    "\u0002\u00a7\u00a8\u0007\u0017\u0002\u0002\u00a8\u00a9\u0005\u0012\n",
    "\u0002\u00a9\u00aa\u0005\u0010\t\u0002\u00aa\u00ba\u0003\u0002\u0002",
    "\u0002\u00ab\u00ac\u0007\u0006\u0002\u0002\u00ac\u00ad\u0007\b\u0002",
    "\u0002\u00ad\u00ae\u0007,\u0002\u0002\u00ae\u00af\u0007\u0018\u0002",
    "\u0002\u00af\u00b0\u0005\u0016\f\u0002\u00b0\u00b1\u0007\u0019\u0002",
    "\u0002\u00b1\u00b2\u0005\u0006\u0004\u0002\u00b2\u00b3\u0007\u0016\u0002",
    "\u0002\u00b3\u00b4\u0005\u001c\u000f\u0002\u00b4\u00b5\u0007\u0017\u0002",
    "\u0002\u00b5\u00b6\u0005\u0012\n\u0002\u00b6\u00b7\u0005\u0010\t\u0002",
    "\u00b7\u00ba\u0003\u0002\u0002\u0002\u00b8\u00ba\u0003\u0002\u0002\u0002",
    "\u00b9\u009e\u0003\u0002\u0002\u0002\u00b9\u00ab\u0003\u0002\u0002\u0002",
    "\u00b9\u00b8\u0003\u0002\u0002\u0002\u00ba\u0011\u0003\u0002\u0002\u0002",
    "\u00bb\u00bc\u0003\u0002\u0002\u0002\u00bc\u0013\u0003\u0002\u0002\u0002",
    "\u00bd\u00c0\u0005n8\u0002\u00be\u00c0\u0007\u0006\u0002\u0002\u00bf",
    "\u00bd\u0003\u0002\u0002\u0002\u00bf\u00be\u0003\u0002\u0002\u0002\u00c0",
    "\u0015\u0003\u0002\u0002\u0002\u00c1\u00c2\u0005n8\u0002\u00c2\u00c3",
    "\u0007,\u0002\u0002\u00c3\u00c4\u0005\u0018\r\u0002\u00c4\u00cc\u0003",
    "\u0002\u0002\u0002\u00c5\u00c6\u0005n8\u0002\u00c6\u00c7\u0007,\u0002",
    "\u0002\u00c7\u00c8\u0005\u001a\u000e\u0002\u00c8\u00c9\u0005\u0018\r",
    "\u0002\u00c9\u00cc\u0003\u0002\u0002\u0002\u00ca\u00cc\u0003\u0002\u0002",
    "\u0002\u00cb\u00c1\u0003\u0002\u0002\u0002\u00cb\u00c5\u0003\u0002\u0002",
    "\u0002\u00cb\u00ca\u0003\u0002\u0002\u0002\u00cc\u0017\u0003\u0002\u0002",
    "\u0002\u00cd\u00ce\u0007\u0013\u0002\u0002\u00ce\u00d1\u0005\u0016\f",
    "\u0002\u00cf\u00d1\u0003\u0002\u0002\u0002\u00d0\u00cd\u0003\u0002\u0002",
    "\u0002\u00d0\u00cf\u0003\u0002\u0002\u0002\u00d1\u0019\u0003\u0002\u0002",
    "\u0002\u00d2\u00d3\u0007\u0014\u0002\u0002\u00d3\u00d4\u0007-\u0002",
    "\u0002\u00d4\u00dd\u0007\u0015\u0002\u0002\u00d5\u00d6\u0007\u0014\u0002",
    "\u0002\u00d6\u00d7\u0007-\u0002\u0002\u00d7\u00d8\u0007\u0015\u0002",
    "\u0002\u00d8\u00d9\u0007\u0014\u0002\u0002\u00d9\u00da\u0007-\u0002",
    "\u0002\u00da\u00dd\u0007\u0015\u0002\u0002\u00db\u00dd\u0003\u0002\u0002",
    "\u0002\u00dc\u00d2\u0003\u0002\u0002\u0002\u00dc\u00d5\u0003\u0002\u0002",
    "\u0002\u00dc\u00db\u0003\u0002\u0002\u0002\u00dd\u001b\u0003\u0002\u0002",
    "\u0002\u00de\u00df\u0005 \u0011\u0002\u00df\u00e0\u0005\u001c\u000f",
    "\u0002\u00e0\u00e3\u0003\u0002\u0002\u0002\u00e1\u00e3\u0003\u0002\u0002",
    "\u0002\u00e2\u00de\u0003\u0002\u0002\u0002\u00e2\u00e1\u0003\u0002\u0002",
    "\u0002\u00e3\u001d\u0003\u0002\u0002\u0002\u00e4\u00e5\u0005 \u0011",
    "\u0002\u00e5\u00e6\u0005\u001e\u0010\u0002\u00e6\u00eb\u0003\u0002\u0002",
    "\u0002\u00e7\u00e8\u0005*\u0016\u0002\u00e8\u00e9\u0005\"\u0012\u0002",
    "\u00e9\u00eb\u0003\u0002\u0002\u0002\u00ea\u00e4\u0003\u0002\u0002\u0002",
    "\u00ea\u00e7\u0003\u0002\u0002\u0002\u00eb\u001f\u0003\u0002\u0002\u0002",
    "\u00ec\u00ed\u0005&\u0014\u0002\u00ed\u00ee\u0005\"\u0012\u0002\u00ee",
    "\u00ff\u0003\u0002\u0002\u0002\u00ef\u00f0\u0005(\u0015\u0002\u00f0",
    "\u00f1\u0005\"\u0012\u0002\u00f1\u00ff\u0003\u0002\u0002\u0002\u00f2",
    "\u00f3\u0005,\u0017\u0002\u00f3\u00f4\u0005\"\u0012\u0002\u00f4\u00ff",
    "\u0003\u0002\u0002\u0002\u00f5\u00f6\u0005.\u0018\u0002\u00f6\u00f7",
    "\u0005\"\u0012\u0002\u00f7\u00ff\u0003\u0002\u0002\u0002\u00f8\u00ff",
    "\u00054\u001b\u0002\u00f9\u00ff\u0005@!\u0002\u00fa\u00ff\u0005:\u001e",
    "\u0002\u00fb\u00fc\u0005J&\u0002\u00fc\u00fd\u0005\"\u0012\u0002\u00fd",
    "\u00ff\u0003\u0002\u0002\u0002\u00fe\u00ec\u0003\u0002\u0002\u0002\u00fe",
    "\u00ef\u0003\u0002\u0002\u0002\u00fe\u00f2\u0003\u0002\u0002\u0002\u00fe",
    "\u00f5\u0003\u0002\u0002\u0002\u00fe\u00f8\u0003\u0002\u0002\u0002\u00fe",
    "\u00f9\u0003\u0002\u0002\u0002\u00fe\u00fa\u0003\u0002\u0002\u0002\u00fe",
    "\u00fb\u0003\u0002\u0002\u0002\u00ff!\u0003\u0002\u0002\u0002\u0100",
    "\u0101\u0007\u0012\u0002\u0002\u0101#\u0003\u0002\u0002\u0002\u0102",
    "\u0103\u0007\u0014\u0002\u0002\u0103\u0104\u0005J&\u0002\u0104\u0105",
    "\u0007\u0015\u0002\u0002\u0105\u010f\u0003\u0002\u0002\u0002\u0106\u0107",
    "\u0007\u0014\u0002\u0002\u0107\u0108\u0005J&\u0002\u0108\u0109\u0007",
    "\u0015\u0002\u0002\u0109\u010a\u0007\u0014\u0002\u0002\u010a\u010b\u0005",
    "J&\u0002\u010b\u010c\u0007\u0015\u0002\u0002\u010c\u010f\u0003\u0002",
    "\u0002\u0002\u010d\u010f\u0003\u0002\u0002\u0002\u010e\u0102\u0003\u0002",
    "\u0002\u0002\u010e\u0106\u0003\u0002\u0002\u0002\u010e\u010d\u0003\u0002",
    "\u0002\u0002\u010f%\u0003\u0002\u0002\u0002\u0110\u0111\u0007,\u0002",
    "\u0002\u0111\u0112\u0005$\u0013\u0002\u0112\u0113\u0007(\u0002\u0002",
    "\u0113\u0114\u0005J&\u0002\u0114\'\u0003\u0002\u0002\u0002\u0115\u0116",
    "\u0007,\u0002\u0002\u0116\u0117\u0007\u0018\u0002\u0002\u0117\u0118",
    "\u0005F$\u0002\u0118\u0119\u0007\u0019\u0002\u0002\u0119)\u0003\u0002",
    "\u0002\u0002\u011a\u011b\u0007\r\u0002\u0002\u011b\u011c\u0007\u0018",
    "\u0002\u0002\u011c\u011d\u0005J&\u0002\u011d\u011e\u0007\u0019\u0002",
    "\u0002\u011e+\u0003\u0002\u0002\u0002\u011f\u0120\u0007\u000e\u0002",
    "\u0002\u0120\u0121\u0007\u0018\u0002\u0002\u0121\u0122\u0005\f\u0007",
    "\u0002\u0122\u0123\u0007\u0019\u0002\u0002\u0123-\u0003\u0002\u0002",
    "\u0002\u0124\u0125\u0007\u000f\u0002\u0002\u0125\u0126\u0007\u0018\u0002",
    "\u0002\u0126\u0127\u00050\u0019\u0002\u0127\u0128\u0007\u0019\u0002",
    "\u0002\u0128/\u0003\u0002\u0002\u0002\u0129\u012a\u0005J&\u0002\u012a",
    "\u012b\u00052\u001a\u0002\u012b\u012f\u0003\u0002\u0002\u0002\u012c",
    "\u012d\u0007/\u0002\u0002\u012d\u012f\u00052\u001a\u0002\u012e\u0129",
    "\u0003\u0002\u0002\u0002\u012e\u012c\u0003\u0002\u0002\u0002\u012f1",
    "\u0003\u0002\u0002\u0002\u0130\u0131\u0007\u0013\u0002\u0002\u0131\u0134",
    "\u00050\u0019\u0002\u0132\u0134\u0003\u0002\u0002\u0002\u0133\u0130",
    "\u0003\u0002\u0002\u0002\u0133\u0132\u0003\u0002\u0002\u0002\u01343",
    "\u0003\u0002\u0002\u0002\u0135\u0136\u0007\u000b\u0002\u0002\u0136\u0137",
    "\u0007\u0018\u0002\u0002\u0137\u0138\u0005J&\u0002\u0138\u0139\u0007",
    "\u0019\u0002\u0002\u0139\u013a\u00056\u001c\u0002\u013a5\u0003\u0002",
    "\u0002\u0002\u013b\u013c\u0007\u0010\u0002\u0002\u013c\u013d\u0007\u0016",
    "\u0002\u0002\u013d\u013e\u0005\u001c\u000f\u0002\u013e\u013f\u0007\u0017",
    "\u0002\u0002\u013f\u0140\u00058\u001d\u0002\u01407\u0003\u0002\u0002",
    "\u0002\u0141\u0142\u0007\f\u0002\u0002\u0142\u0143\u0007\u0016\u0002",
    "\u0002\u0143\u0144\u0005\u001c\u000f\u0002\u0144\u0145\u0007\u0017\u0002",
    "\u0002\u0145\u0148\u0003\u0002\u0002\u0002\u0146\u0148\u0003\u0002\u0002",
    "\u0002\u0147\u0141\u0003\u0002\u0002\u0002\u0147\u0146\u0003\u0002\u0002",
    "\u0002\u01489\u0003\u0002\u0002\u0002\u0149\u014a\u0007)\u0002\u0002",
    "\u014a\u014b\u0005&\u0014\u0002\u014b\u014c\u0005<\u001f\u0002\u014c",
    ";\u0003\u0002\u0002\u0002\u014d\u014e\u0007\u0011\u0002\u0002\u014e",
    "\u014f\u0005J&\u0002\u014f\u0150\u0005> \u0002\u0150=\u0003\u0002\u0002",
    "\u0002\u0151\u0152\u0007+\u0002\u0002\u0152\u0153\u0007\u0016\u0002",
    "\u0002\u0153\u0154\u0005\u001c\u000f\u0002\u0154\u0155\u0007\u0017\u0002",
    "\u0002\u0155?\u0003\u0002\u0002\u0002\u0156\u0157\u0007*\u0002\u0002",
    "\u0157\u0158\u0005B\"\u0002\u0158A\u0003\u0002\u0002\u0002\u0159\u015a",
    "\u0007\u0018\u0002\u0002\u015a\u015b\u0005J&\u0002\u015b\u015c\u0007",
    "\u0019\u0002\u0002\u015c\u015d\u0005D#\u0002\u015dC\u0003\u0002\u0002",
    "\u0002\u015e\u015f\u0007+\u0002\u0002\u015f\u0160\u0007\u0016\u0002",
    "\u0002\u0160\u0161\u0005\u001c\u000f\u0002\u0161\u0162\u0007\u0017\u0002",
    "\u0002\u0162E\u0003\u0002\u0002\u0002\u0163\u0164\u0005J&\u0002\u0164",
    "\u0165\u0005H%\u0002\u0165\u0168\u0003\u0002\u0002\u0002\u0166\u0168",
    "\u0003\u0002\u0002\u0002\u0167\u0163\u0003\u0002\u0002\u0002\u0167\u0166",
    "\u0003\u0002\u0002\u0002\u0168G\u0003\u0002\u0002\u0002\u0169\u016a",
    "\u0007\u0013\u0002\u0002\u016a\u016b\u0005J&\u0002\u016b\u016c\u0005",
    "H%\u0002\u016c\u016f\u0003\u0002\u0002\u0002\u016d\u016f\u0003\u0002",
    "\u0002\u0002\u016e\u0169\u0003\u0002\u0002\u0002\u016e\u016d\u0003\u0002",
    "\u0002\u0002\u016fI\u0003\u0002\u0002\u0002\u0170\u0195\u0005^0\u0002",
    "\u0171\u0172\u0005^0\u0002\u0172\u0173\u0005L\'\u0002\u0173\u0174\u0005",
    "^0\u0002\u0174\u0195\u0003\u0002\u0002\u0002\u0175\u0176\u0005^0\u0002",
    "\u0176\u0177\u0005N(\u0002\u0177\u0178\u0005^0\u0002\u0178\u0195\u0003",
    "\u0002\u0002\u0002\u0179\u017a\u0005^0\u0002\u017a\u017b\u0005P)\u0002",
    "\u017b\u017c\u0005^0\u0002\u017c\u0195\u0003\u0002\u0002\u0002\u017d",
    "\u017e\u0005^0\u0002\u017e\u017f\u0005R*\u0002\u017f\u0180\u0005^0\u0002",
    "\u0180\u0195\u0003\u0002\u0002\u0002\u0181\u0182\u0005^0\u0002\u0182",
    "\u0183\u0005T+\u0002\u0183\u0184\u0005^0\u0002\u0184\u0195\u0003\u0002",
    "\u0002\u0002\u0185\u0186\u0005^0\u0002\u0186\u0187\u0005V,\u0002\u0187",
    "\u0188\u0005^0\u0002\u0188\u0195\u0003\u0002\u0002\u0002\u0189\u018a",
    "\u0005^0\u0002\u018a\u018b\u0005X-\u0002\u018b\u018c\u0005^0\u0002\u018c",
    "\u0195\u0003\u0002\u0002\u0002\u018d\u018e\u0005^0\u0002\u018e\u018f",
    "\u0005Z.\u0002\u018f\u0190\u0005^0\u0002\u0190\u0195\u0003\u0002\u0002",
    "\u0002\u0191\u0192\u0005\\/\u0002\u0192\u0193\u0005J&\u0002\u0193\u0195",
    "\u0003\u0002\u0002\u0002\u0194\u0170\u0003\u0002\u0002\u0002\u0194\u0171",
    "\u0003\u0002\u0002\u0002\u0194\u0175\u0003\u0002\u0002\u0002\u0194\u0179",
    "\u0003\u0002\u0002\u0002\u0194\u017d\u0003\u0002\u0002\u0002\u0194\u0181",
    "\u0003\u0002\u0002\u0002\u0194\u0185\u0003\u0002\u0002\u0002\u0194\u0189",
    "\u0003\u0002\u0002\u0002\u0194\u018d\u0003\u0002\u0002\u0002\u0194\u0191",
    "\u0003\u0002\u0002\u0002\u0195K\u0003\u0002\u0002\u0002\u0196\u0197",
    "\u0007!\u0002\u0002\u0197M\u0003\u0002\u0002\u0002\u0198\u0199\u0007",
    " \u0002\u0002\u0199O\u0003\u0002\u0002\u0002\u019a\u019b\u0007\u001f",
    "\u0002\u0002\u019bQ\u0003\u0002\u0002\u0002\u019c\u019d\u0007\"\u0002",
    "\u0002\u019dS\u0003\u0002\u0002\u0002\u019e\u019f\u0007%\u0002\u0002",
    "\u019fU\u0003\u0002\u0002\u0002\u01a0\u01a1\u0007$\u0002\u0002\u01a1",
    "W\u0003\u0002\u0002\u0002\u01a2\u01a3\u0007\'\u0002\u0002\u01a3Y\u0003",
    "\u0002\u0002\u0002\u01a4\u01a5\u0007&\u0002\u0002\u01a5[\u0003\u0002",
    "\u0002\u0002\u01a6\u01a7\u0007#\u0002\u0002\u01a7]\u0003\u0002\u0002",
    "\u0002\u01a8\u01a9\b0\u0001\u0002\u01a9\u01aa\u0005d3\u0002\u01aa\u01b5",
    "\u0003\u0002\u0002\u0002\u01ab\u01ac\f\u0005\u0002\u0002\u01ac\u01ad",
    "\u0005`1\u0002\u01ad\u01ae\u0005d3\u0002\u01ae\u01b4\u0003\u0002\u0002",
    "\u0002\u01af\u01b0\f\u0004\u0002\u0002\u01b0\u01b1\u0005b2\u0002\u01b1",
    "\u01b2\u0005d3\u0002\u01b2\u01b4\u0003\u0002\u0002\u0002\u01b3\u01ab",
    "\u0003\u0002\u0002\u0002\u01b3\u01af\u0003\u0002\u0002\u0002\u01b4\u01b7",
    "\u0003\u0002\u0002\u0002\u01b5\u01b3\u0003\u0002\u0002\u0002\u01b5\u01b6",
    "\u0003\u0002\u0002\u0002\u01b6_\u0003\u0002\u0002\u0002\u01b7\u01b5",
    "\u0003\u0002\u0002\u0002\u01b8\u01b9\u0007\u001a\u0002\u0002\u01b9a",
    "\u0003\u0002\u0002\u0002\u01ba\u01bb\u0007\u001b\u0002\u0002\u01bbc",
    "\u0003\u0002\u0002\u0002\u01bc\u01bd\b3\u0001\u0002\u01bd\u01be\u0005",
    "l7\u0002\u01be\u01cd\u0003\u0002\u0002\u0002\u01bf\u01c0\f\u0006\u0002",
    "\u0002\u01c0\u01c1\u0005f4\u0002\u01c1\u01c2\u0005l7\u0002\u01c2\u01cc",
    "\u0003\u0002\u0002\u0002\u01c3\u01c4\f\u0005\u0002\u0002\u01c4\u01c5",
    "\u0005h5\u0002\u01c5\u01c6\u0005l7\u0002\u01c6\u01cc\u0003\u0002\u0002",
    "\u0002\u01c7\u01c8\f\u0004\u0002\u0002\u01c8\u01c9\u0005j6\u0002\u01c9",
    "\u01ca\u0005l7\u0002\u01ca\u01cc\u0003\u0002\u0002\u0002\u01cb\u01bf",
    "\u0003\u0002\u0002\u0002\u01cb\u01c3\u0003\u0002\u0002\u0002\u01cb\u01c7",
    "\u0003\u0002\u0002\u0002\u01cc\u01cf\u0003\u0002\u0002\u0002\u01cd\u01cb",
    "\u0003\u0002\u0002\u0002\u01cd\u01ce\u0003\u0002\u0002\u0002\u01cee",
    "\u0003\u0002\u0002\u0002\u01cf\u01cd\u0003\u0002\u0002\u0002\u01d0\u01d1",
    "\u0007\u001c\u0002\u0002\u01d1g\u0003\u0002\u0002\u0002\u01d2\u01d3",
    "\u0007\u001d\u0002\u0002\u01d3i\u0003\u0002\u0002\u0002\u01d4\u01d5",
    "\u0007\u001e\u0002\u0002\u01d5k\u0003\u0002\u0002\u0002\u01d6\u01df",
    "\u0005(\u0015\u0002\u01d7\u01d8\u0007\u0018\u0002\u0002\u01d8\u01d9",
    "\u0005J&\u0002\u01d9\u01da\u0007\u0019\u0002\u0002\u01da\u01df\u0003",
    "\u0002\u0002\u0002\u01db\u01df\u0005p9\u0002\u01dc\u01dd\u0007\u001b",
    "\u0002\u0002\u01dd\u01df\u0005p9\u0002\u01de\u01d6\u0003\u0002\u0002",
    "\u0002\u01de\u01d7\u0003\u0002\u0002\u0002\u01de\u01db\u0003\u0002\u0002",
    "\u0002\u01de\u01dc\u0003\u0002\u0002\u0002\u01dfm\u0003\u0002\u0002",
    "\u0002\u01e0\u01e1\t\u0002\u0002\u0002\u01e1o\u0003\u0002\u0002\u0002",
    "\u01e2\u01e3\u0007,\u0002\u0002\u01e3\u01e9\u0005$\u0013\u0002\u01e4",
    "\u01e9\u0007-\u0002\u0002\u01e5\u01e9\u0007.\u0002\u0002\u01e6\u01e9",
    "\u0007/\u0002\u0002\u01e7\u01e9\u00070\u0002\u0002\u01e8\u01e2\u0003",
    "\u0002\u0002\u0002\u01e8\u01e4\u0003\u0002\u0002\u0002\u01e8\u01e5\u0003",
    "\u0002\u0002\u0002\u01e8\u01e6\u0003\u0002\u0002\u0002\u01e8\u01e7\u0003",
    "\u0002\u0002\u0002\u01e9q\u0003\u0002\u0002\u0002\u001b\u0085\u008f",
    "\u0097\u009c\u00b9\u00bf\u00cb\u00d0\u00dc\u00e2\u00ea\u00fe\u010e\u012e",
    "\u0133\u0147\u0167\u016e\u0194\u01b3\u01b5\u01cb\u01cd\u01de\u01e8"].join("");


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
                   "yvars", "funcBlock", "funcEnd", "funcType", "params", 
                   "rparams", "varDimensionsInit", "statues", "statuesWithReturn", 
                   "statue", "semicolon", "varDimensions", "asignation", 
                   "funcCall", "returnFunc", "read", "write", "xwrite", 
                   "ywrite", "decision", "decisiontwo", "xdecision", "forloop", 
                   "forlooptwo", "forloopthree", "whileloop", "whilelooptwo", 
                   "whileloopthree", "arguments", "rarguments", "expresion", 
                   "lessThanOrEqualExp", "greaterThanOrEqualExp", "equalsExp", 
                   "differentExp", "andExp", "orExp", "lessThan", "greaterThan", 
                   "notExp", "exp", "plus", "minus", "termino", "mult", 
                   "div", "mod", "factor", "type", "cte" ];

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
ParPlusPlusParser.RULE_funcEnd = 8;
ParPlusPlusParser.RULE_funcType = 9;
ParPlusPlusParser.RULE_params = 10;
ParPlusPlusParser.RULE_rparams = 11;
ParPlusPlusParser.RULE_varDimensionsInit = 12;
ParPlusPlusParser.RULE_statues = 13;
ParPlusPlusParser.RULE_statuesWithReturn = 14;
ParPlusPlusParser.RULE_statue = 15;
ParPlusPlusParser.RULE_semicolon = 16;
ParPlusPlusParser.RULE_varDimensions = 17;
ParPlusPlusParser.RULE_asignation = 18;
ParPlusPlusParser.RULE_funcCall = 19;
ParPlusPlusParser.RULE_returnFunc = 20;
ParPlusPlusParser.RULE_read = 21;
ParPlusPlusParser.RULE_write = 22;
ParPlusPlusParser.RULE_xwrite = 23;
ParPlusPlusParser.RULE_ywrite = 24;
ParPlusPlusParser.RULE_decision = 25;
ParPlusPlusParser.RULE_decisiontwo = 26;
ParPlusPlusParser.RULE_xdecision = 27;
ParPlusPlusParser.RULE_forloop = 28;
ParPlusPlusParser.RULE_forlooptwo = 29;
ParPlusPlusParser.RULE_forloopthree = 30;
ParPlusPlusParser.RULE_whileloop = 31;
ParPlusPlusParser.RULE_whilelooptwo = 32;
ParPlusPlusParser.RULE_whileloopthree = 33;
ParPlusPlusParser.RULE_arguments = 34;
ParPlusPlusParser.RULE_rarguments = 35;
ParPlusPlusParser.RULE_expresion = 36;
ParPlusPlusParser.RULE_lessThanOrEqualExp = 37;
ParPlusPlusParser.RULE_greaterThanOrEqualExp = 38;
ParPlusPlusParser.RULE_equalsExp = 39;
ParPlusPlusParser.RULE_differentExp = 40;
ParPlusPlusParser.RULE_andExp = 41;
ParPlusPlusParser.RULE_orExp = 42;
ParPlusPlusParser.RULE_lessThan = 43;
ParPlusPlusParser.RULE_greaterThan = 44;
ParPlusPlusParser.RULE_notExp = 45;
ParPlusPlusParser.RULE_exp = 46;
ParPlusPlusParser.RULE_plus = 47;
ParPlusPlusParser.RULE_minus = 48;
ParPlusPlusParser.RULE_termino = 49;
ParPlusPlusParser.RULE_mult = 50;
ParPlusPlusParser.RULE_div = 51;
ParPlusPlusParser.RULE_mod = 52;
ParPlusPlusParser.RULE_factor = 53;
ParPlusPlusParser.RULE_type = 54;
ParPlusPlusParser.RULE_cte = 55;


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
        this.state = 112;
        this.match(ParPlusPlusParser.PROGRAM);
        this.state = 113;
        this.match(ParPlusPlusParser.ID);
        this.state = 114;
        this.match(ParPlusPlusParser.SEMICOLON);
        this.state = 115;
        this.varBlock();
        this.state = 116;
        this.funcBlock();
        this.state = 117;
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
        this.state = 119;
        this.match(ParPlusPlusParser.MAIN);
        this.state = 120;
        this.match(ParPlusPlusParser.LP);
        this.state = 121;
        this.match(ParPlusPlusParser.RP);
        this.state = 122;
        this.match(ParPlusPlusParser.LCB);
        this.state = 123;
        this.statues();
        this.state = 124;
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
        this.state = 131;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.VAR:
            this.enterOuterAlt(localctx, 1);
            this.state = 126;
            this.match(ParPlusPlusParser.VAR);
            this.state = 127;
            this.vars();
            this.state = 128;
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
        this.state = 133;
        this.type();
        this.state = 134;
        this.xvars();
        this.state = 135;
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
        this.state = 141;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,1,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 137;
            this.vars();
            this.state = 138;
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
        this.state = 149;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,2,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 143;
            this.match(ParPlusPlusParser.ID);
            this.state = 144;
            this.yvars();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 145;
            this.match(ParPlusPlusParser.ID);
            this.state = 146;
            this.varDimensionsInit();
            this.state = 147;
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
        this.state = 154;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.COMMA:
            this.enterOuterAlt(localctx, 1);
            this.state = 151;
            this.match(ParPlusPlusParser.COMMA);
            this.state = 152;
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

FuncBlockContext.prototype.statuesWithReturn = function() {
    return this.getTypedRuleContext(StatuesWithReturnContext,0);
};

FuncBlockContext.prototype.RCB = function() {
    return this.getToken(ParPlusPlusParser.RCB, 0);
};

FuncBlockContext.prototype.funcEnd = function() {
    return this.getTypedRuleContext(FuncEndContext,0);
};

FuncBlockContext.prototype.funcBlock = function() {
    return this.getTypedRuleContext(FuncBlockContext,0);
};

FuncBlockContext.prototype.VOID = function() {
    return this.getToken(ParPlusPlusParser.VOID, 0);
};

FuncBlockContext.prototype.statues = function() {
    return this.getTypedRuleContext(StatuesContext,0);
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
        this.state = 183;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.T__0:
        case ParPlusPlusParser.T__1:
        case ParPlusPlusParser.T__2:
            this.enterOuterAlt(localctx, 1);
            this.state = 156;
            this.type();
            this.state = 157;
            this.match(ParPlusPlusParser.MODULE);
            this.state = 158;
            this.match(ParPlusPlusParser.ID);
            this.state = 159;
            this.match(ParPlusPlusParser.LP);
            this.state = 160;
            this.params();
            this.state = 161;
            this.match(ParPlusPlusParser.RP);
            this.state = 162;
            this.varBlock();
            this.state = 163;
            this.match(ParPlusPlusParser.LCB);
            this.state = 164;
            this.statuesWithReturn();
            this.state = 165;
            this.match(ParPlusPlusParser.RCB);
            this.state = 166;
            this.funcEnd();
            this.state = 167;
            this.funcBlock();
            break;
        case ParPlusPlusParser.VOID:
            this.enterOuterAlt(localctx, 2);
            this.state = 169;
            this.match(ParPlusPlusParser.VOID);
            this.state = 170;
            this.match(ParPlusPlusParser.MODULE);
            this.state = 171;
            this.match(ParPlusPlusParser.ID);
            this.state = 172;
            this.match(ParPlusPlusParser.LP);
            this.state = 173;
            this.params();
            this.state = 174;
            this.match(ParPlusPlusParser.RP);
            this.state = 175;
            this.varBlock();
            this.state = 176;
            this.match(ParPlusPlusParser.LCB);
            this.state = 177;
            this.statues();
            this.state = 178;
            this.match(ParPlusPlusParser.RCB);
            this.state = 179;
            this.funcEnd();
            this.state = 180;
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


function FuncEndContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_funcEnd;
    return this;
}

FuncEndContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FuncEndContext.prototype.constructor = FuncEndContext;


FuncEndContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterFuncEnd(this);
	}
};

FuncEndContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitFuncEnd(this);
	}
};




ParPlusPlusParser.FuncEndContext = FuncEndContext;

ParPlusPlusParser.prototype.funcEnd = function() {

    var localctx = new FuncEndContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, ParPlusPlusParser.RULE_funcEnd);
    try {
        this.enterOuterAlt(localctx, 1);

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


function FuncTypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_funcType;
    return this;
}

FuncTypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FuncTypeContext.prototype.constructor = FuncTypeContext;

FuncTypeContext.prototype.type = function() {
    return this.getTypedRuleContext(TypeContext,0);
};

FuncTypeContext.prototype.VOID = function() {
    return this.getToken(ParPlusPlusParser.VOID, 0);
};

FuncTypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterFuncType(this);
	}
};

FuncTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitFuncType(this);
	}
};




ParPlusPlusParser.FuncTypeContext = FuncTypeContext;

ParPlusPlusParser.prototype.funcType = function() {

    var localctx = new FuncTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 18, ParPlusPlusParser.RULE_funcType);
    try {
        this.state = 189;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.T__0:
        case ParPlusPlusParser.T__1:
        case ParPlusPlusParser.T__2:
            this.enterOuterAlt(localctx, 1);
            this.state = 187;
            this.type();
            break;
        case ParPlusPlusParser.VOID:
            this.enterOuterAlt(localctx, 2);
            this.state = 188;
            this.match(ParPlusPlusParser.VOID);
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
    this.enterRule(localctx, 20, ParPlusPlusParser.RULE_params);
    try {
        this.state = 201;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,6,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 191;
            this.type();
            this.state = 192;
            this.match(ParPlusPlusParser.ID);
            this.state = 193;
            this.rparams();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 195;
            this.type();
            this.state = 196;
            this.match(ParPlusPlusParser.ID);
            this.state = 197;
            this.varDimensionsInit();
            this.state = 198;
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
    this.enterRule(localctx, 22, ParPlusPlusParser.RULE_rparams);
    try {
        this.state = 206;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.COMMA:
            this.enterOuterAlt(localctx, 1);
            this.state = 203;
            this.match(ParPlusPlusParser.COMMA);
            this.state = 204;
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
    this.enterRule(localctx, 24, ParPlusPlusParser.RULE_varDimensionsInit);
    try {
        this.state = 218;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,8,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 208;
            this.match(ParPlusPlusParser.LB);
            this.state = 209;
            this.match(ParPlusPlusParser.INT);
            this.state = 210;
            this.match(ParPlusPlusParser.RB);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 211;
            this.match(ParPlusPlusParser.LB);
            this.state = 212;
            this.match(ParPlusPlusParser.INT);
            this.state = 213;
            this.match(ParPlusPlusParser.RB);
            this.state = 214;
            this.match(ParPlusPlusParser.LB);
            this.state = 215;
            this.match(ParPlusPlusParser.INT);
            this.state = 216;
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
    this.enterRule(localctx, 26, ParPlusPlusParser.RULE_statues);
    try {
        this.state = 224;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.IF:
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
        case ParPlusPlusParser.STRING:
        case ParPlusPlusParser.CHAR:
            this.enterOuterAlt(localctx, 1);
            this.state = 220;
            this.statue();
            this.state = 221;
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


function StatuesWithReturnContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_statuesWithReturn;
    return this;
}

StatuesWithReturnContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatuesWithReturnContext.prototype.constructor = StatuesWithReturnContext;

StatuesWithReturnContext.prototype.statue = function() {
    return this.getTypedRuleContext(StatueContext,0);
};

StatuesWithReturnContext.prototype.statuesWithReturn = function() {
    return this.getTypedRuleContext(StatuesWithReturnContext,0);
};

StatuesWithReturnContext.prototype.returnFunc = function() {
    return this.getTypedRuleContext(ReturnFuncContext,0);
};

StatuesWithReturnContext.prototype.semicolon = function() {
    return this.getTypedRuleContext(SemicolonContext,0);
};

StatuesWithReturnContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterStatuesWithReturn(this);
	}
};

StatuesWithReturnContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitStatuesWithReturn(this);
	}
};




ParPlusPlusParser.StatuesWithReturnContext = StatuesWithReturnContext;

ParPlusPlusParser.prototype.statuesWithReturn = function() {

    var localctx = new StatuesWithReturnContext(this, this._ctx, this.state);
    this.enterRule(localctx, 28, ParPlusPlusParser.RULE_statuesWithReturn);
    try {
        this.state = 232;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.IF:
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
        case ParPlusPlusParser.STRING:
        case ParPlusPlusParser.CHAR:
            this.enterOuterAlt(localctx, 1);
            this.state = 226;
            this.statue();
            this.state = 227;
            this.statuesWithReturn();
            break;
        case ParPlusPlusParser.RETURN:
            this.enterOuterAlt(localctx, 2);
            this.state = 229;
            this.returnFunc();
            this.state = 230;
            this.semicolon();
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

StatueContext.prototype.semicolon = function() {
    return this.getTypedRuleContext(SemicolonContext,0);
};

StatueContext.prototype.funcCall = function() {
    return this.getTypedRuleContext(FuncCallContext,0);
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
    this.enterRule(localctx, 30, ParPlusPlusParser.RULE_statue);
    try {
        this.state = 252;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,11,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 234;
            this.asignation();
            this.state = 235;
            this.semicolon();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 237;
            this.funcCall();
            this.state = 238;
            this.semicolon();
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 240;
            this.read();
            this.state = 241;
            this.semicolon();
            break;

        case 4:
            this.enterOuterAlt(localctx, 4);
            this.state = 243;
            this.write();
            this.state = 244;
            this.semicolon();
            break;

        case 5:
            this.enterOuterAlt(localctx, 5);
            this.state = 246;
            this.decision();
            break;

        case 6:
            this.enterOuterAlt(localctx, 6);
            this.state = 247;
            this.whileloop();
            break;

        case 7:
            this.enterOuterAlt(localctx, 7);
            this.state = 248;
            this.forloop();
            break;

        case 8:
            this.enterOuterAlt(localctx, 8);
            this.state = 249;
            this.expresion();
            this.state = 250;
            this.semicolon();
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


function SemicolonContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_semicolon;
    return this;
}

SemicolonContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
SemicolonContext.prototype.constructor = SemicolonContext;

SemicolonContext.prototype.SEMICOLON = function() {
    return this.getToken(ParPlusPlusParser.SEMICOLON, 0);
};

SemicolonContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterSemicolon(this);
	}
};

SemicolonContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitSemicolon(this);
	}
};




ParPlusPlusParser.SemicolonContext = SemicolonContext;

ParPlusPlusParser.prototype.semicolon = function() {

    var localctx = new SemicolonContext(this, this._ctx, this.state);
    this.enterRule(localctx, 32, ParPlusPlusParser.RULE_semicolon);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 254;
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
    this.enterRule(localctx, 34, ParPlusPlusParser.RULE_varDimensions);
    try {
        this.state = 268;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,12,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 256;
            this.match(ParPlusPlusParser.LB);
            this.state = 257;
            this.expresion();
            this.state = 258;
            this.match(ParPlusPlusParser.RB);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 260;
            this.match(ParPlusPlusParser.LB);
            this.state = 261;
            this.expresion();
            this.state = 262;
            this.match(ParPlusPlusParser.RB);
            this.state = 263;
            this.match(ParPlusPlusParser.LB);
            this.state = 264;
            this.expresion();
            this.state = 265;
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
    this.enterRule(localctx, 36, ParPlusPlusParser.RULE_asignation);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 270;
        this.match(ParPlusPlusParser.ID);
        this.state = 271;
        this.varDimensions();
        this.state = 272;
        this.match(ParPlusPlusParser.ASSIGN);
        this.state = 273;
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
    this.enterRule(localctx, 38, ParPlusPlusParser.RULE_funcCall);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 275;
        this.match(ParPlusPlusParser.ID);
        this.state = 276;
        this.match(ParPlusPlusParser.LP);
        this.state = 277;
        this.arguments();
        this.state = 278;
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
    this.enterRule(localctx, 40, ParPlusPlusParser.RULE_returnFunc);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 280;
        this.match(ParPlusPlusParser.RETURN);
        this.state = 281;
        this.match(ParPlusPlusParser.LP);
        this.state = 282;
        this.expresion();
        this.state = 283;
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
    this.enterRule(localctx, 42, ParPlusPlusParser.RULE_read);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 285;
        this.match(ParPlusPlusParser.READ);
        this.state = 286;
        this.match(ParPlusPlusParser.LP);
        this.state = 287;
        this.xvars();
        this.state = 288;
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
    this.enterRule(localctx, 44, ParPlusPlusParser.RULE_write);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 290;
        this.match(ParPlusPlusParser.WRITE);
        this.state = 291;
        this.match(ParPlusPlusParser.LP);
        this.state = 292;
        this.xwrite();
        this.state = 293;
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
    this.enterRule(localctx, 46, ParPlusPlusParser.RULE_xwrite);
    try {
        this.state = 300;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,13,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 295;
            this.expresion();
            this.state = 296;
            this.ywrite();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 298;
            this.match(ParPlusPlusParser.STRING);
            this.state = 299;
            this.ywrite();
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
    this.enterRule(localctx, 48, ParPlusPlusParser.RULE_ywrite);
    try {
        this.state = 305;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.COMMA:
            this.enterOuterAlt(localctx, 1);
            this.state = 302;
            this.match(ParPlusPlusParser.COMMA);
            this.state = 303;
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

DecisionContext.prototype.decisiontwo = function() {
    return this.getTypedRuleContext(DecisiontwoContext,0);
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
    this.enterRule(localctx, 50, ParPlusPlusParser.RULE_decision);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 307;
        this.match(ParPlusPlusParser.IF);
        this.state = 308;
        this.match(ParPlusPlusParser.LP);
        this.state = 309;
        this.expresion();
        this.state = 310;
        this.match(ParPlusPlusParser.RP);
        this.state = 311;
        this.decisiontwo();
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


function DecisiontwoContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_decisiontwo;
    return this;
}

DecisiontwoContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
DecisiontwoContext.prototype.constructor = DecisiontwoContext;

DecisiontwoContext.prototype.THEN = function() {
    return this.getToken(ParPlusPlusParser.THEN, 0);
};

DecisiontwoContext.prototype.LCB = function() {
    return this.getToken(ParPlusPlusParser.LCB, 0);
};

DecisiontwoContext.prototype.statues = function() {
    return this.getTypedRuleContext(StatuesContext,0);
};

DecisiontwoContext.prototype.RCB = function() {
    return this.getToken(ParPlusPlusParser.RCB, 0);
};

DecisiontwoContext.prototype.xdecision = function() {
    return this.getTypedRuleContext(XdecisionContext,0);
};

DecisiontwoContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterDecisiontwo(this);
	}
};

DecisiontwoContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitDecisiontwo(this);
	}
};




ParPlusPlusParser.DecisiontwoContext = DecisiontwoContext;

ParPlusPlusParser.prototype.decisiontwo = function() {

    var localctx = new DecisiontwoContext(this, this._ctx, this.state);
    this.enterRule(localctx, 52, ParPlusPlusParser.RULE_decisiontwo);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 313;
        this.match(ParPlusPlusParser.THEN);
        this.state = 314;
        this.match(ParPlusPlusParser.LCB);
        this.state = 315;
        this.statues();
        this.state = 316;
        this.match(ParPlusPlusParser.RCB);
        this.state = 317;
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
    this.enterRule(localctx, 54, ParPlusPlusParser.RULE_xdecision);
    try {
        this.state = 325;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.ELSE:
            this.enterOuterAlt(localctx, 1);
            this.state = 319;
            this.match(ParPlusPlusParser.ELSE);
            this.state = 320;
            this.match(ParPlusPlusParser.LCB);
            this.state = 321;
            this.statues();
            this.state = 322;
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
        case ParPlusPlusParser.STRING:
        case ParPlusPlusParser.CHAR:
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

ForloopContext.prototype.forlooptwo = function() {
    return this.getTypedRuleContext(ForlooptwoContext,0);
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
    this.enterRule(localctx, 56, ParPlusPlusParser.RULE_forloop);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 327;
        this.match(ParPlusPlusParser.FOR);
        this.state = 328;
        this.asignation();
        this.state = 329;
        this.forlooptwo();
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


function ForlooptwoContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_forlooptwo;
    return this;
}

ForlooptwoContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ForlooptwoContext.prototype.constructor = ForlooptwoContext;

ForlooptwoContext.prototype.TO = function() {
    return this.getToken(ParPlusPlusParser.TO, 0);
};

ForlooptwoContext.prototype.expresion = function() {
    return this.getTypedRuleContext(ExpresionContext,0);
};

ForlooptwoContext.prototype.forloopthree = function() {
    return this.getTypedRuleContext(ForloopthreeContext,0);
};

ForlooptwoContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterForlooptwo(this);
	}
};

ForlooptwoContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitForlooptwo(this);
	}
};




ParPlusPlusParser.ForlooptwoContext = ForlooptwoContext;

ParPlusPlusParser.prototype.forlooptwo = function() {

    var localctx = new ForlooptwoContext(this, this._ctx, this.state);
    this.enterRule(localctx, 58, ParPlusPlusParser.RULE_forlooptwo);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 331;
        this.match(ParPlusPlusParser.TO);
        this.state = 332;
        this.expresion();
        this.state = 333;
        this.forloopthree();
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


function ForloopthreeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_forloopthree;
    return this;
}

ForloopthreeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ForloopthreeContext.prototype.constructor = ForloopthreeContext;

ForloopthreeContext.prototype.DO = function() {
    return this.getToken(ParPlusPlusParser.DO, 0);
};

ForloopthreeContext.prototype.LCB = function() {
    return this.getToken(ParPlusPlusParser.LCB, 0);
};

ForloopthreeContext.prototype.statues = function() {
    return this.getTypedRuleContext(StatuesContext,0);
};

ForloopthreeContext.prototype.RCB = function() {
    return this.getToken(ParPlusPlusParser.RCB, 0);
};

ForloopthreeContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterForloopthree(this);
	}
};

ForloopthreeContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitForloopthree(this);
	}
};




ParPlusPlusParser.ForloopthreeContext = ForloopthreeContext;

ParPlusPlusParser.prototype.forloopthree = function() {

    var localctx = new ForloopthreeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 60, ParPlusPlusParser.RULE_forloopthree);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 335;
        this.match(ParPlusPlusParser.DO);
        this.state = 336;
        this.match(ParPlusPlusParser.LCB);
        this.state = 337;
        this.statues();
        this.state = 338;
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

WhileloopContext.prototype.whilelooptwo = function() {
    return this.getTypedRuleContext(WhilelooptwoContext,0);
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
    this.enterRule(localctx, 62, ParPlusPlusParser.RULE_whileloop);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 340;
        this.match(ParPlusPlusParser.WHILE);
        this.state = 341;
        this.whilelooptwo();
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


function WhilelooptwoContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_whilelooptwo;
    return this;
}

WhilelooptwoContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
WhilelooptwoContext.prototype.constructor = WhilelooptwoContext;

WhilelooptwoContext.prototype.LP = function() {
    return this.getToken(ParPlusPlusParser.LP, 0);
};

WhilelooptwoContext.prototype.expresion = function() {
    return this.getTypedRuleContext(ExpresionContext,0);
};

WhilelooptwoContext.prototype.RP = function() {
    return this.getToken(ParPlusPlusParser.RP, 0);
};

WhilelooptwoContext.prototype.whileloopthree = function() {
    return this.getTypedRuleContext(WhileloopthreeContext,0);
};

WhilelooptwoContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterWhilelooptwo(this);
	}
};

WhilelooptwoContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitWhilelooptwo(this);
	}
};




ParPlusPlusParser.WhilelooptwoContext = WhilelooptwoContext;

ParPlusPlusParser.prototype.whilelooptwo = function() {

    var localctx = new WhilelooptwoContext(this, this._ctx, this.state);
    this.enterRule(localctx, 64, ParPlusPlusParser.RULE_whilelooptwo);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 343;
        this.match(ParPlusPlusParser.LP);
        this.state = 344;
        this.expresion();
        this.state = 345;
        this.match(ParPlusPlusParser.RP);
        this.state = 346;
        this.whileloopthree();
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


function WhileloopthreeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_whileloopthree;
    return this;
}

WhileloopthreeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
WhileloopthreeContext.prototype.constructor = WhileloopthreeContext;

WhileloopthreeContext.prototype.DO = function() {
    return this.getToken(ParPlusPlusParser.DO, 0);
};

WhileloopthreeContext.prototype.LCB = function() {
    return this.getToken(ParPlusPlusParser.LCB, 0);
};

WhileloopthreeContext.prototype.statues = function() {
    return this.getTypedRuleContext(StatuesContext,0);
};

WhileloopthreeContext.prototype.RCB = function() {
    return this.getToken(ParPlusPlusParser.RCB, 0);
};

WhileloopthreeContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterWhileloopthree(this);
	}
};

WhileloopthreeContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitWhileloopthree(this);
	}
};




ParPlusPlusParser.WhileloopthreeContext = WhileloopthreeContext;

ParPlusPlusParser.prototype.whileloopthree = function() {

    var localctx = new WhileloopthreeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 66, ParPlusPlusParser.RULE_whileloopthree);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 348;
        this.match(ParPlusPlusParser.DO);
        this.state = 349;
        this.match(ParPlusPlusParser.LCB);
        this.state = 350;
        this.statues();
        this.state = 351;
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
    this.enterRule(localctx, 68, ParPlusPlusParser.RULE_arguments);
    try {
        this.state = 357;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.LP:
        case ParPlusPlusParser.MINUS:
        case ParPlusPlusParser.NOT:
        case ParPlusPlusParser.ID:
        case ParPlusPlusParser.INT:
        case ParPlusPlusParser.FLOAT:
        case ParPlusPlusParser.STRING:
        case ParPlusPlusParser.CHAR:
            this.enterOuterAlt(localctx, 1);
            this.state = 353;
            this.expresion();
            this.state = 354;
            this.rarguments();
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

RargumentsContext.prototype.expresion = function() {
    return this.getTypedRuleContext(ExpresionContext,0);
};

RargumentsContext.prototype.rarguments = function() {
    return this.getTypedRuleContext(RargumentsContext,0);
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
    this.enterRule(localctx, 70, ParPlusPlusParser.RULE_rarguments);
    try {
        this.state = 364;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.COMMA:
            this.enterOuterAlt(localctx, 1);
            this.state = 359;
            this.match(ParPlusPlusParser.COMMA);
            this.state = 360;
            this.expresion();
            this.state = 361;
            this.rarguments();
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

ExpresionContext.prototype.lessThanOrEqualExp = function() {
    return this.getTypedRuleContext(LessThanOrEqualExpContext,0);
};

ExpresionContext.prototype.greaterThanOrEqualExp = function() {
    return this.getTypedRuleContext(GreaterThanOrEqualExpContext,0);
};

ExpresionContext.prototype.equalsExp = function() {
    return this.getTypedRuleContext(EqualsExpContext,0);
};

ExpresionContext.prototype.differentExp = function() {
    return this.getTypedRuleContext(DifferentExpContext,0);
};

ExpresionContext.prototype.andExp = function() {
    return this.getTypedRuleContext(AndExpContext,0);
};

ExpresionContext.prototype.orExp = function() {
    return this.getTypedRuleContext(OrExpContext,0);
};

ExpresionContext.prototype.lessThan = function() {
    return this.getTypedRuleContext(LessThanContext,0);
};

ExpresionContext.prototype.greaterThan = function() {
    return this.getTypedRuleContext(GreaterThanContext,0);
};

ExpresionContext.prototype.notExp = function() {
    return this.getTypedRuleContext(NotExpContext,0);
};

ExpresionContext.prototype.expresion = function() {
    return this.getTypedRuleContext(ExpresionContext,0);
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
    this.enterRule(localctx, 72, ParPlusPlusParser.RULE_expresion);
    try {
        this.state = 402;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,18,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 366;
            this.exp(0);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 367;
            this.exp(0);
            this.state = 368;
            this.lessThanOrEqualExp();
            this.state = 369;
            this.exp(0);
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 371;
            this.exp(0);
            this.state = 372;
            this.greaterThanOrEqualExp();
            this.state = 373;
            this.exp(0);
            break;

        case 4:
            this.enterOuterAlt(localctx, 4);
            this.state = 375;
            this.exp(0);
            this.state = 376;
            this.equalsExp();
            this.state = 377;
            this.exp(0);
            break;

        case 5:
            this.enterOuterAlt(localctx, 5);
            this.state = 379;
            this.exp(0);
            this.state = 380;
            this.differentExp();
            this.state = 381;
            this.exp(0);
            break;

        case 6:
            this.enterOuterAlt(localctx, 6);
            this.state = 383;
            this.exp(0);
            this.state = 384;
            this.andExp();
            this.state = 385;
            this.exp(0);
            break;

        case 7:
            this.enterOuterAlt(localctx, 7);
            this.state = 387;
            this.exp(0);
            this.state = 388;
            this.orExp();
            this.state = 389;
            this.exp(0);
            break;

        case 8:
            this.enterOuterAlt(localctx, 8);
            this.state = 391;
            this.exp(0);
            this.state = 392;
            this.lessThan();
            this.state = 393;
            this.exp(0);
            break;

        case 9:
            this.enterOuterAlt(localctx, 9);
            this.state = 395;
            this.exp(0);
            this.state = 396;
            this.greaterThan();
            this.state = 397;
            this.exp(0);
            break;

        case 10:
            this.enterOuterAlt(localctx, 10);
            this.state = 399;
            this.notExp();
            this.state = 400;
            this.expresion();
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


function LessThanOrEqualExpContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_lessThanOrEqualExp;
    return this;
}

LessThanOrEqualExpContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
LessThanOrEqualExpContext.prototype.constructor = LessThanOrEqualExpContext;

LessThanOrEqualExpContext.prototype.LTEQ = function() {
    return this.getToken(ParPlusPlusParser.LTEQ, 0);
};

LessThanOrEqualExpContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterLessThanOrEqualExp(this);
	}
};

LessThanOrEqualExpContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitLessThanOrEqualExp(this);
	}
};




ParPlusPlusParser.LessThanOrEqualExpContext = LessThanOrEqualExpContext;

ParPlusPlusParser.prototype.lessThanOrEqualExp = function() {

    var localctx = new LessThanOrEqualExpContext(this, this._ctx, this.state);
    this.enterRule(localctx, 74, ParPlusPlusParser.RULE_lessThanOrEqualExp);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 404;
        this.match(ParPlusPlusParser.LTEQ);
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


function GreaterThanOrEqualExpContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_greaterThanOrEqualExp;
    return this;
}

GreaterThanOrEqualExpContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
GreaterThanOrEqualExpContext.prototype.constructor = GreaterThanOrEqualExpContext;

GreaterThanOrEqualExpContext.prototype.GTEQ = function() {
    return this.getToken(ParPlusPlusParser.GTEQ, 0);
};

GreaterThanOrEqualExpContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterGreaterThanOrEqualExp(this);
	}
};

GreaterThanOrEqualExpContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitGreaterThanOrEqualExp(this);
	}
};




ParPlusPlusParser.GreaterThanOrEqualExpContext = GreaterThanOrEqualExpContext;

ParPlusPlusParser.prototype.greaterThanOrEqualExp = function() {

    var localctx = new GreaterThanOrEqualExpContext(this, this._ctx, this.state);
    this.enterRule(localctx, 76, ParPlusPlusParser.RULE_greaterThanOrEqualExp);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 406;
        this.match(ParPlusPlusParser.GTEQ);
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


function EqualsExpContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_equalsExp;
    return this;
}

EqualsExpContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
EqualsExpContext.prototype.constructor = EqualsExpContext;

EqualsExpContext.prototype.EQ = function() {
    return this.getToken(ParPlusPlusParser.EQ, 0);
};

EqualsExpContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterEqualsExp(this);
	}
};

EqualsExpContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitEqualsExp(this);
	}
};




ParPlusPlusParser.EqualsExpContext = EqualsExpContext;

ParPlusPlusParser.prototype.equalsExp = function() {

    var localctx = new EqualsExpContext(this, this._ctx, this.state);
    this.enterRule(localctx, 78, ParPlusPlusParser.RULE_equalsExp);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 408;
        this.match(ParPlusPlusParser.EQ);
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


function DifferentExpContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_differentExp;
    return this;
}

DifferentExpContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
DifferentExpContext.prototype.constructor = DifferentExpContext;

DifferentExpContext.prototype.NEQ = function() {
    return this.getToken(ParPlusPlusParser.NEQ, 0);
};

DifferentExpContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterDifferentExp(this);
	}
};

DifferentExpContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitDifferentExp(this);
	}
};




ParPlusPlusParser.DifferentExpContext = DifferentExpContext;

ParPlusPlusParser.prototype.differentExp = function() {

    var localctx = new DifferentExpContext(this, this._ctx, this.state);
    this.enterRule(localctx, 80, ParPlusPlusParser.RULE_differentExp);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 410;
        this.match(ParPlusPlusParser.NEQ);
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


function AndExpContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_andExp;
    return this;
}

AndExpContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
AndExpContext.prototype.constructor = AndExpContext;

AndExpContext.prototype.AND = function() {
    return this.getToken(ParPlusPlusParser.AND, 0);
};

AndExpContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterAndExp(this);
	}
};

AndExpContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitAndExp(this);
	}
};




ParPlusPlusParser.AndExpContext = AndExpContext;

ParPlusPlusParser.prototype.andExp = function() {

    var localctx = new AndExpContext(this, this._ctx, this.state);
    this.enterRule(localctx, 82, ParPlusPlusParser.RULE_andExp);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 412;
        this.match(ParPlusPlusParser.AND);
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


function OrExpContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_orExp;
    return this;
}

OrExpContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
OrExpContext.prototype.constructor = OrExpContext;

OrExpContext.prototype.OR = function() {
    return this.getToken(ParPlusPlusParser.OR, 0);
};

OrExpContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterOrExp(this);
	}
};

OrExpContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitOrExp(this);
	}
};




ParPlusPlusParser.OrExpContext = OrExpContext;

ParPlusPlusParser.prototype.orExp = function() {

    var localctx = new OrExpContext(this, this._ctx, this.state);
    this.enterRule(localctx, 84, ParPlusPlusParser.RULE_orExp);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 414;
        this.match(ParPlusPlusParser.OR);
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


function LessThanContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_lessThan;
    return this;
}

LessThanContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
LessThanContext.prototype.constructor = LessThanContext;

LessThanContext.prototype.LT = function() {
    return this.getToken(ParPlusPlusParser.LT, 0);
};

LessThanContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterLessThan(this);
	}
};

LessThanContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitLessThan(this);
	}
};




ParPlusPlusParser.LessThanContext = LessThanContext;

ParPlusPlusParser.prototype.lessThan = function() {

    var localctx = new LessThanContext(this, this._ctx, this.state);
    this.enterRule(localctx, 86, ParPlusPlusParser.RULE_lessThan);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 416;
        this.match(ParPlusPlusParser.LT);
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


function GreaterThanContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_greaterThan;
    return this;
}

GreaterThanContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
GreaterThanContext.prototype.constructor = GreaterThanContext;

GreaterThanContext.prototype.GT = function() {
    return this.getToken(ParPlusPlusParser.GT, 0);
};

GreaterThanContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterGreaterThan(this);
	}
};

GreaterThanContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitGreaterThan(this);
	}
};




ParPlusPlusParser.GreaterThanContext = GreaterThanContext;

ParPlusPlusParser.prototype.greaterThan = function() {

    var localctx = new GreaterThanContext(this, this._ctx, this.state);
    this.enterRule(localctx, 88, ParPlusPlusParser.RULE_greaterThan);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 418;
        this.match(ParPlusPlusParser.GT);
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


function NotExpContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_notExp;
    return this;
}

NotExpContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
NotExpContext.prototype.constructor = NotExpContext;

NotExpContext.prototype.NOT = function() {
    return this.getToken(ParPlusPlusParser.NOT, 0);
};

NotExpContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterNotExp(this);
	}
};

NotExpContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitNotExp(this);
	}
};




ParPlusPlusParser.NotExpContext = NotExpContext;

ParPlusPlusParser.prototype.notExp = function() {

    var localctx = new NotExpContext(this, this._ctx, this.state);
    this.enterRule(localctx, 90, ParPlusPlusParser.RULE_notExp);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 420;
        this.match(ParPlusPlusParser.NOT);
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

ExpContext.prototype.plus = function() {
    return this.getTypedRuleContext(PlusContext,0);
};

ExpContext.prototype.minus = function() {
    return this.getTypedRuleContext(MinusContext,0);
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
    var _startState = 92;
    this.enterRecursionRule(localctx, 92, ParPlusPlusParser.RULE_exp, _p);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 423;
        this.termino(0);
        this._ctx.stop = this._input.LT(-1);
        this.state = 435;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,20,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                if(this._parseListeners!==null) {
                    this.triggerExitRuleEvent();
                }
                _prevctx = localctx;
                this.state = 433;
                this._errHandler.sync(this);
                var la_ = this._interp.adaptivePredict(this._input,19,this._ctx);
                switch(la_) {
                case 1:
                    localctx = new ExpContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, ParPlusPlusParser.RULE_exp);
                    this.state = 425;
                    if (!( this.precpred(this._ctx, 3))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
                    }
                    this.state = 426;
                    this.plus();
                    this.state = 427;
                    this.termino(0);
                    break;

                case 2:
                    localctx = new ExpContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, ParPlusPlusParser.RULE_exp);
                    this.state = 429;
                    if (!( this.precpred(this._ctx, 2))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 2)");
                    }
                    this.state = 430;
                    this.minus();
                    this.state = 431;
                    this.termino(0);
                    break;

                } 
            }
            this.state = 437;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,20,this._ctx);
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


function PlusContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_plus;
    return this;
}

PlusContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
PlusContext.prototype.constructor = PlusContext;

PlusContext.prototype.PLUS = function() {
    return this.getToken(ParPlusPlusParser.PLUS, 0);
};

PlusContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterPlus(this);
	}
};

PlusContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitPlus(this);
	}
};




ParPlusPlusParser.PlusContext = PlusContext;

ParPlusPlusParser.prototype.plus = function() {

    var localctx = new PlusContext(this, this._ctx, this.state);
    this.enterRule(localctx, 94, ParPlusPlusParser.RULE_plus);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 438;
        this.match(ParPlusPlusParser.PLUS);
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


function MinusContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_minus;
    return this;
}

MinusContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
MinusContext.prototype.constructor = MinusContext;

MinusContext.prototype.MINUS = function() {
    return this.getToken(ParPlusPlusParser.MINUS, 0);
};

MinusContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterMinus(this);
	}
};

MinusContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitMinus(this);
	}
};




ParPlusPlusParser.MinusContext = MinusContext;

ParPlusPlusParser.prototype.minus = function() {

    var localctx = new MinusContext(this, this._ctx, this.state);
    this.enterRule(localctx, 96, ParPlusPlusParser.RULE_minus);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 440;
        this.match(ParPlusPlusParser.MINUS);
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

TerminoContext.prototype.mult = function() {
    return this.getTypedRuleContext(MultContext,0);
};

TerminoContext.prototype.div = function() {
    return this.getTypedRuleContext(DivContext,0);
};

TerminoContext.prototype.mod = function() {
    return this.getTypedRuleContext(ModContext,0);
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
    var _startState = 98;
    this.enterRecursionRule(localctx, 98, ParPlusPlusParser.RULE_termino, _p);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 443;
        this.factor();
        this._ctx.stop = this._input.LT(-1);
        this.state = 459;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,22,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                if(this._parseListeners!==null) {
                    this.triggerExitRuleEvent();
                }
                _prevctx = localctx;
                this.state = 457;
                this._errHandler.sync(this);
                var la_ = this._interp.adaptivePredict(this._input,21,this._ctx);
                switch(la_) {
                case 1:
                    localctx = new TerminoContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, ParPlusPlusParser.RULE_termino);
                    this.state = 445;
                    if (!( this.precpred(this._ctx, 4))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
                    }
                    this.state = 446;
                    this.mult();
                    this.state = 447;
                    this.factor();
                    break;

                case 2:
                    localctx = new TerminoContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, ParPlusPlusParser.RULE_termino);
                    this.state = 449;
                    if (!( this.precpred(this._ctx, 3))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
                    }
                    this.state = 450;
                    this.div();
                    this.state = 451;
                    this.factor();
                    break;

                case 3:
                    localctx = new TerminoContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, ParPlusPlusParser.RULE_termino);
                    this.state = 453;
                    if (!( this.precpred(this._ctx, 2))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 2)");
                    }
                    this.state = 454;
                    this.mod();
                    this.state = 455;
                    this.factor();
                    break;

                } 
            }
            this.state = 461;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,22,this._ctx);
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


function MultContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_mult;
    return this;
}

MultContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
MultContext.prototype.constructor = MultContext;

MultContext.prototype.MULT = function() {
    return this.getToken(ParPlusPlusParser.MULT, 0);
};

MultContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterMult(this);
	}
};

MultContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitMult(this);
	}
};




ParPlusPlusParser.MultContext = MultContext;

ParPlusPlusParser.prototype.mult = function() {

    var localctx = new MultContext(this, this._ctx, this.state);
    this.enterRule(localctx, 100, ParPlusPlusParser.RULE_mult);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 462;
        this.match(ParPlusPlusParser.MULT);
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


function DivContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_div;
    return this;
}

DivContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
DivContext.prototype.constructor = DivContext;

DivContext.prototype.DIV = function() {
    return this.getToken(ParPlusPlusParser.DIV, 0);
};

DivContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterDiv(this);
	}
};

DivContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitDiv(this);
	}
};




ParPlusPlusParser.DivContext = DivContext;

ParPlusPlusParser.prototype.div = function() {

    var localctx = new DivContext(this, this._ctx, this.state);
    this.enterRule(localctx, 102, ParPlusPlusParser.RULE_div);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 464;
        this.match(ParPlusPlusParser.DIV);
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


function ModContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ParPlusPlusParser.RULE_mod;
    return this;
}

ModContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ModContext.prototype.constructor = ModContext;

ModContext.prototype.MOD = function() {
    return this.getToken(ParPlusPlusParser.MOD, 0);
};

ModContext.prototype.enterRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.enterMod(this);
	}
};

ModContext.prototype.exitRule = function(listener) {
    if(listener instanceof ParPlusPlusListener ) {
        listener.exitMod(this);
	}
};




ParPlusPlusParser.ModContext = ModContext;

ParPlusPlusParser.prototype.mod = function() {

    var localctx = new ModContext(this, this._ctx, this.state);
    this.enterRule(localctx, 104, ParPlusPlusParser.RULE_mod);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 466;
        this.match(ParPlusPlusParser.MOD);
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
    this.enterRule(localctx, 106, ParPlusPlusParser.RULE_factor);
    try {
        this.state = 476;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,23,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 468;
            this.funcCall();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 469;
            this.match(ParPlusPlusParser.LP);
            this.state = 470;
            this.expresion();
            this.state = 471;
            this.match(ParPlusPlusParser.RP);
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 473;
            this.cte();
            break;

        case 4:
            this.enterOuterAlt(localctx, 4);
            this.state = 474;
            this.match(ParPlusPlusParser.MINUS);
            this.state = 475;
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
    this.enterRule(localctx, 108, ParPlusPlusParser.RULE_type);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 478;
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

CteContext.prototype.STRING = function() {
    return this.getToken(ParPlusPlusParser.STRING, 0);
};

CteContext.prototype.CHAR = function() {
    return this.getToken(ParPlusPlusParser.CHAR, 0);
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
    this.enterRule(localctx, 110, ParPlusPlusParser.RULE_cte);
    try {
        this.state = 486;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ParPlusPlusParser.ID:
            this.enterOuterAlt(localctx, 1);
            this.state = 480;
            this.match(ParPlusPlusParser.ID);
            this.state = 481;
            this.varDimensions();
            break;
        case ParPlusPlusParser.INT:
            this.enterOuterAlt(localctx, 2);
            this.state = 482;
            this.match(ParPlusPlusParser.INT);
            break;
        case ParPlusPlusParser.FLOAT:
            this.enterOuterAlt(localctx, 3);
            this.state = 483;
            this.match(ParPlusPlusParser.FLOAT);
            break;
        case ParPlusPlusParser.STRING:
            this.enterOuterAlt(localctx, 4);
            this.state = 484;
            this.match(ParPlusPlusParser.STRING);
            break;
        case ParPlusPlusParser.CHAR:
            this.enterOuterAlt(localctx, 5);
            this.state = 485;
            this.match(ParPlusPlusParser.CHAR);
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
	case 46:
			return this.exp_sempred(localctx, predIndex);
	case 49:
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
