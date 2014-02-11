using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Dfa;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using LangC_Capstone.Contexts;

namespace LangC_Capstone
{
    public class AL_Parser : Parser
    {
        protected static DFA[] _decisionToDFA;
        protected static PredictionContextCache _sharedContextCache = new PredictionContextCache();

        public static string _serializedATN =
        @"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3g\u0198\4\2\t\2\4" +
        @"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
        @"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
        @"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
        @"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\5\2@" +
        @"\n\2\3\2\3\2\5\2D\n\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\5\2M\n\2\3\2\7\2" +
        @"P\n\2\f\2\16\2S\13\2\3\2\5\2V\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4" +
        @"`\n\4\f\4\16\4c\13\4\3\4\3\4\3\5\3\5\3\5\5\5j\n\5\3\5\3\5\3\5\3\5\5\5" +
        @"p\n\5\3\6\3\6\3\6\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\7\3\7\3\b\3\b\3\b" +
        @"\3\b\5\b\u0082\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\t\3\t\3\t\3" +
        @"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t" +
        @"\u00a0\n\t\f\t\16\t\u00a3\13\t\3\t\7\t\u00a6\n\t\f\t\16\t\u00a9\13\t\3" +
        @"\t\3\t\3\t\3\t\5\t\u00af\n\t\3\t\3\t\3\t\5\t\u00b4\n\t\3\t\3\t\3\t\5\t" +
        @"\u00b9\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c3\n\t\3\n\6\n\u00c6" +
        @"\n\n\r\n\16\n\u00c7\3\n\6\n\u00cb\n\n\r\n\16\n\u00cc\3\13\3\13\3\13\3" +
        @"\13\3\13\3\13\5\13\u00d5\n\13\3\f\3\f\5\f\u00d9\n\f\3\f\3\f\5\f\u00dd" +
        @"\n\f\3\f\3\f\5\f\u00e1\n\f\5\f\u00e3\n\f\3\r\3\r\5\r\u00e7\n\r\3\16\3" +
        @"\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00f7" +
        @"\n\21\f\21\16\21\u00fa\13\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u0102" +
        @"\n\24\3\24\3\24\3\25\3\25\3\25\7\25\u0109\n\25\f\25\16\25\u010c\13\25" +
        @"\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u0114\n\27\f\27\16\27\u0117\13\27" +
        @"\3\30\3\30\3\30\3\30\3\30\5\30\u011e\n\30\3\30\3\30\3\31\3\31\3\32\3\32" +
        @"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0131\n\33" +
        @"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33" +
        @"\5\33\u0141\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33" +
        @"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33" +
        @"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0166\n\33\3\33" +
        @"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33" +
        @"\3\33\3\33\3\33\5\33\u017a\n\33\3\33\3\33\3\33\7\33\u017f\n\33\f\33\16" +
        @"\33\u0182\13\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u018a\n\34\3\35\3\35" +
        @"\3\36\3\36\3\36\7\36\u0191\n\36\f\36\16\36\u0194\13\36\3\37\3\37\3\37" +
        @"\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""$&(*,.\60\62\64\668:<\2\f" +
        @"\3\2KN\3\2CD\4\2OPTT\3\2MN\4\2ABHI\4\2GGJJ\3\2ab\3\2KL\3\2\638\6\2\3\3" +
        @"\5\t\13\13\17\17\u01c6\2?\3\2\2\2\4W\3\2\2\2\6]\3\2\2\2\bf\3\2\2\2\nq" +
        @"\3\2\2\2\ft\3\2\2\2\16\u0081\3\2\2\2\20\u00c2\3\2\2\2\22\u00c5\3\2\2\2" +
        @"\24\u00d4\3\2\2\2\26\u00e2\3\2\2\2\30\u00e6\3\2\2\2\32\u00e8\3\2\2\2\34" +
        @"\u00ed\3\2\2\2\36\u00ef\3\2\2\2 \u00f3\3\2\2\2\""\u00fb\3\2\2\2$\u00fd" +
        @"\3\2\2\2&\u00ff\3\2\2\2(\u0105\3\2\2\2*\u010d\3\2\2\2,\u0110\3\2\2\2." +
        @"\u0118\3\2\2\2\60\u0121\3\2\2\2\62\u0123\3\2\2\2\64\u0130\3\2\2\2\66\u0189" +
        @"\3\2\2\28\u018b\3\2\2\2:\u018d\3\2\2\2<\u0195\3\2\2\2>@\7\23\2\2?>\3\2" +
        @"\2\2?@\3\2\2\2@A\3\2\2\2AC\5\4\3\2BD\7\24\2\2CB\3\2\2\2CD\3\2\2\2DH\3" +
        @"\2\2\2EG\5.\30\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3" +
        @"\2\2\2KM\7\25\2\2LK\3\2\2\2LM\3\2\2\2MQ\3\2\2\2NP\5\b\5\2ON\3\2\2\2PS" +
        @"\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TV\5\6\4\2UT\3\2\2\2U" +
        @"V\3\2\2\2V\3\3\2\2\2WX\7/\2\2XY\7,\2\2YZ\7U\2\2Z[\7a\2\2[\\\7U\2\2\\\5" +
        @"\3\2\2\2]a\7\22\2\2^`\5\16\b\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2" +
        @"bd\3\2\2\2ca\3\2\2\2de\7\16\2\2e\7\3\2\2\2fi\7&\2\2gj\5:\36\2hj\7\f\2" +
        @"\2ig\3\2\2\2ih\3\2\2\2jk\3\2\2\2kl\7a\2\2lo\5&\24\2mp\5\n\6\2np\7=\2\2" +
        @"om\3\2\2\2on\3\2\2\2p\t\3\2\2\2qr\5\f\7\2rs\7=\2\2s\13\3\2\2\2tx\7\31" +
        @"\2\2uw\5\16\b\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3" +
        @"\2\2\2{|\7!\2\2|\r\3\2\2\2}~\5.\30\2~\177\7=\2\2\177\u0082\3\2\2\2\u0080" +
        @"\u0082\5\20\t\2\u0081}\3\2\2\2\u0081\u0080\3\2\2\2\u0082\17\3\2\2\2\u0083" +
        @"\u00c3\5\f\7\2\u0084\u0085\7\'\2\2\u0085\u0086\5\36\20\2\u0086\u0089\5" +
        @"\20\t\2\u0087\u0088\7 \2\2\u0088\u008a\5\20\t\2\u0089\u0087\3\2\2\2\u0089" +
        @"\u008a\3\2\2\2\u008a\u00c3\3\2\2\2\u008b\u008c\7%\2\2\u008c\u008d\79\2" +
        @"\2\u008d\u008e\5\26\f\2\u008e\u008f\7:\2\2\u008f\u0090\5\20\t\2\u0090" +
        @"\u00c3\3\2\2\2\u0091\u0092\7\62\2\2\u0092\u0093\5\36\20\2\u0093\u0094" +
        @"\5\20\t\2\u0094\u00c3\3\2\2\2\u0095\u0096\7\37\2\2\u0096\u0097\5\20\t" +
        @"\2\u0097\u0098\7\62\2\2\u0098\u0099\5\36\20\2\u0099\u009a\7=\2\2\u009a" +
        @"\u00c3\3\2\2\2\u009b\u009c\7.\2\2\u009c\u009d\5\36\20\2\u009d\u00a1\7" +
        @"\r\2\2\u009e\u00a0\5\22\n\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1" +
        @"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a7\3\2\2\2\u00a3\u00a1\3\2" +
        @"\2\2\u00a4\u00a6\5\24\13\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7" +
        @"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2" +
        @"\2\2\u00aa\u00ab\7\4\2\2\u00ab\u00c3\3\2\2\2\u00ac\u00ae\7\20\2\2\u00ad" +
        @"\u00af\5\64\33\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3" +
        @"\2\2\2\u00b0\u00c3\7=\2\2\u00b1\u00b3\7\32\2\2\u00b2\u00b4\7b\2\2\u00b3" +
        @"\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00c3\7=" +
        @"\2\2\u00b6\u00b8\7\36\2\2\u00b7\u00b9\7b\2\2\u00b8\u00b7\3\2\2\2\u00b8" +
        @"\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c3\7=\2\2\u00bb\u00c3\7=\2" +
        @"\2\u00bc\u00bd\5\""\22\2\u00bd\u00be\7=\2\2\u00be\u00c3\3\2\2\2\u00bf\u00c0" +
        @"\7b\2\2\u00c0\u00c1\7F\2\2\u00c1\u00c3\5\20\t\2\u00c2\u0083\3\2\2\2\u00c2" +
        @"\u0084\3\2\2\2\u00c2\u008b\3\2\2\2\u00c2\u0091\3\2\2\2\u00c2\u0095\3\2" +
        @"\2\2\u00c2\u009b\3\2\2\2\u00c2\u00ac\3\2\2\2\u00c2\u00b1\3\2\2\2\u00c2" +
        @"\u00b6\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bf\3\2" +
        @"\2\2\u00c3\21\3\2\2\2\u00c4\u00c6\5\24\13\2\u00c5\u00c4\3\2\2\2\u00c6" +
        @"\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2" +
        @"\2\2\u00c9\u00cb\5\16\b\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc" +
        @"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\23\3\2\2\2\u00ce\u00cf\7\33\2" +
        @"\2\u00cf\u00d0\5$\23\2\u00d0\u00d1\7F\2\2\u00d1\u00d5\3\2\2\2\u00d2\u00d3" +
        @"\7\n\2\2\u00d3\u00d5\7F\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5" +
        @"\25\3\2\2\2\u00d6\u00e3\5\32\16\2\u00d7\u00d9\5\30\r\2\u00d8\u00d7\3\2" +
        @"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\7=\2\2\u00db" +
        @"\u00dd\5\64\33\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3" +
        @"\2\2\2\u00de\u00e0\7=\2\2\u00df\u00e1\5\34\17\2\u00e0\u00df\3\2\2\2\u00e0" +
        @"\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e2\u00d8\3\2" +
        @"\2\2\u00e3\27\3\2\2\2\u00e4\u00e7\5.\30\2\u00e5\u00e7\5 \21\2\u00e6\u00e4" +
        @"\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\31\3\2\2\2\u00e8\u00e9\5:\36\2\u00e9" +
        @"\u00ea\7b\2\2\u00ea\u00eb\7F\2\2\u00eb\u00ec\5\64\33\2\u00ec\33\3\2\2" +
        @"\2\u00ed\u00ee\5 \21\2\u00ee\35\3\2\2\2\u00ef\u00f0\79\2\2\u00f0\u00f1" +
        @"\5\64\33\2\u00f1\u00f2\7:\2\2\u00f2\37\3\2\2\2\u00f3\u00f8\5\64\33\2\u00f4" +
        @"\u00f5\7>\2\2\u00f5\u00f7\5\64\33\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3" +
        @"\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9!\3\2\2\2\u00fa\u00f8" +
        @"\3\2\2\2\u00fb\u00fc\5\64\33\2\u00fc#\3\2\2\2\u00fd\u00fe\5\64\33\2\u00fe" +
        @"%\3\2\2\2\u00ff\u0101\79\2\2\u0100\u0102\5(\25\2\u0101\u0100\3\2\2\2\u0101" +
        @"\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7:\2\2\u0104\'\3\2\2\2" +
        @"\u0105\u010a\5*\26\2\u0106\u0107\7>\2\2\u0107\u0109\5*\26\2\u0108\u0106" +
        @"\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b" +
        @")\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\5:\36\2\u010e\u010f\7b\2\2\u010f" +
        @"+\3\2\2\2\u0110\u0115\5.\30\2\u0111\u0112\7>\2\2\u0112\u0114\5.\30\2\u0113" +
        @"\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2" +
        @"\2\2\u0116-\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7*\2\2\u0119\u011a" +
        @"\5:\36\2\u011a\u011d\5\60\31\2\u011b\u011c\7@\2\2\u011c\u011e\5\62\32" +
        @"\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120" +
        @"\7=\2\2\u0120/\3\2\2\2\u0121\u0122\7b\2\2\u0122\61\3\2\2\2\u0123\u0124" +
        @"\5\64\33\2\u0124\63\3\2\2\2\u0125\u0126\b\33\1\2\u0126\u0127\79\2\2\u0127" +
        @"\u0128\5:\36\2\u0128\u0129\7:\2\2\u0129\u012a\5\64\33\2\u012a\u0131\3" +
        @"\2\2\2\u012b\u012c\t\2\2\2\u012c\u0131\5\64\33\2\u012d\u012e\t\3\2\2\u012e" +
        @"\u0131\5\64\33\2\u012f\u0131\5\66\34\2\u0130\u0125\3\2\2\2\u0130\u012b" +
        @"\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u012f\3\2\2\2\u0131\u0180\3\2\2\2\u0132" +
        @"\u0133\6\33\2\3\u0133\u0134\t\4\2\2\u0134\u017f\5\64\33\2\u0135\u0136" +
        @"\6\33\3\3\u0136\u0137\t\5\2\2\u0137\u017f\5\64\33\2\u0138\u0140\6\33\4" +
        @"\3\u0139\u013a\7B\2\2\u013a\u0141\7B\2\2\u013b\u013c\7A\2\2\u013c\u013d" +
        @"\7A\2\2\u013d\u0141\7A\2\2\u013e\u013f\7A\2\2\u013f\u0141\7A\2\2\u0140" +
        @"\u0139\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\3\2" +
        @"\2\2\u0142\u017f\5\64\33\2\u0143\u0144\6\33\5\3\u0144\u0145\t\6\2\2\u0145" +
        @"\u017f\5\64\33\2\u0146\u0147\6\33\6\3\u0147\u0148\t\7\2\2\u0148\u017f" +
        @"\5\64\33\2\u0149\u014a\6\33\7\3\u014a\u014b\7Q\2\2\u014b\u017f\5\64\33" +
        @"\2\u014c\u014d\6\33\b\3\u014d\u014e\7S\2\2\u014e\u017f\5\64\33\2\u014f" +
        @"\u0150\6\33\t\3\u0150\u0151\7R\2\2\u0151\u017f\5\64\33\2\u0152\u0153\6" +
        @"\33\n\3\u0153\u0154\7\21\2\2\u0154\u017f\5\64\33\2\u0155\u0156\6\33\13" +
        @"\3\u0156\u0157\7+\2\2\u0157\u017f\5\64\33\2\u0158\u0165\6\33\f\3\u0159" +
        @"\u0166\7@\2\2\u015a\u0166\7V\2\2\u015b\u0166\7W\2\2\u015c\u0166\7X\2\2" +
        @"\u015d\u0166\7Y\2\2\u015e\u0166\7Z\2\2\u015f\u0166\7[\2\2\u0160\u0166" +
        @"\7\\\2\2\u0161\u0166\7_\2\2\u0162\u0166\7`\2\2\u0163\u0166\7^\2\2\u0164" +
        @"\u0166\7]\2\2\u0165\u0159\3\2\2\2\u0165\u015a\3\2\2\2\u0165\u015b\3\2" +
        @"\2\2\u0165\u015c\3\2\2\2\u0165\u015d\3\2\2\2\u0165\u015e\3\2\2\2\u0165" +
        @"\u015f\3\2\2\2\u0165\u0160\3\2\2\2\u0165\u0161\3\2\2\2\u0165\u0162\3\2" +
        @"\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167" +
        @"\u017f\5\64\33\2\u0168\u0169\6\33\r\3\u0169\u016a\7E\2\2\u016a\u016b\5" +
        @"\64\33\2\u016b\u016c\7F\2\2\u016c\u016d\5\64\33\2\u016d\u017f\3\2\2\2" +
        @"\u016e\u016f\6\33\16\3\u016f\u0170\7?\2\2\u0170\u017f\t\b\2\2\u0171\u0172" +
        @"\6\33\17\3\u0172\u0173\7;\2\2\u0173\u0174\5\64\33\2\u0174\u0175\7<\2\2" +
        @"\u0175\u017f\3\2\2\2\u0176\u0177\6\33\20\3\u0177\u0179\79\2\2\u0178\u017a" +
        @"\5 \21\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b" +
        @"\u017f\7:\2\2\u017c\u017d\6\33\21\3\u017d\u017f\t\t\2\2\u017e\u0132\3" +
        @"\2\2\2\u017e\u0135\3\2\2\2\u017e\u0138\3\2\2\2\u017e\u0143\3\2\2\2\u017e" +
        @"\u0146\3\2\2\2\u017e\u0149\3\2\2\2\u017e\u014c\3\2\2\2\u017e\u014f\3\2" +
        @"\2\2\u017e\u0152\3\2\2\2\u017e\u0155\3\2\2\2\u017e\u0158\3\2\2\2\u017e" +
        @"\u0168\3\2\2\2\u017e\u016e\3\2\2\2\u017e\u0171\3\2\2\2\u017e\u0176\3\2" +
        @"\2\2\u017e\u017c\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180" +
        @"\u0181\3\2\2\2\u0181\65\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\79\2\2" +
        @"\u0184\u0185\5\64\33\2\u0185\u0186\7:\2\2\u0186\u018a\3\2\2\2\u0187\u018a" +
        @"\58\35\2\u0188\u018a\7a\2\2\u0189\u0183\3\2\2\2\u0189\u0187\3\2\2\2\u0189" +
        @"\u0188\3\2\2\2\u018a\67\3\2\2\2\u018b\u018c\t\n\2\2\u018c9\3\2\2\2\u018d" +
        @"\u0192\5<\37\2\u018e\u018f\7;\2\2\u018f\u0191\7<\2\2\u0190\u018e\3\2\2" +
        @"\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193;" +
        @"\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\t\13\2\2\u0196=\3\2\2\2)?CHL" +
        @"QUaiox\u0081\u0089\u00a1\u00a7\u00ae\u00b3\u00b8\u00c2\u00c7\u00cc\u00d4" +
        @"\u00d8\u00dc\u00e0\u00e2\u00e6\u00f8\u0101\u010a\u0115\u011d\u0130\u0140" +
        @"\u0165\u0179\u017e\u0180\u0189\u0192";

        public static ATN _ATN = ATNSimulator.Deserialize(_serializedATN.ToCharArray());

        public AL_Parser(ITokenStream input)
            : base(input)
        {
            _decisionToDFA = new DFA[_ATN.GetNumberOfDecisions()];

            for (int i = 0; i < _ATN.GetNumberOfDecisions(); i++)
            {
                _decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
            }
            _interp = new ParserATNSimulator(this, _ATN);
        }


        public const int
        T__15 = 1,
        T__14 = 2,
        T__13 = 3,
        T__12 = 4,
        T__11 = 5,
        T__10 = 6,
        T__9 = 7,
        T__8 = 8,
        T__7 = 9,
        T__6 = 10,
        T__5 = 11,
        T__4 = 12,
        T__3 = 13,
        T__2 = 14,
        T__1 = 15,
        T__0 = 16,
        ProgramHeader = 17,
        VariableHeader = 18,
        MethodHeader = 19,
        AND = 20,
        ARRAY = 21,
        AS = 22,
        BEGIN = 23,
        BREAK = 24,
        CASE = 25,
        CATCH = 26,
        CONSTANTLY = 27,
        CONTINUE = 28,
        DO = 29,
        ELSE = 30,
        END = 31,
        EXIT = 32,
        FILE = 33,
        FINALLY = 34,
        FOR = 35,
        FUNCTION = 36,
        IF = 37,
        IN = 38,
        IS = 39,
        LET = 40,
        OR = 41,
        PROGRAM = 42,
        SET = 43,
        SWITCH = 44,
        THIS = 45,
        TRY = 46,
        UNIMPLEMENTED = 47,
        WHILE = 48,
        IntegerLiteral = 49,
        FloatingPointLiteral = 50,
        BooleanLiteral = 51,
        CharacterLiteral = 52,
        StringLiteral = 53,
        NullLiteral = 54,
        LPAREN = 55,
        RPAREN = 56,
        LBRACK = 57,
        RBRACK = 58,
        SEMI = 59,
        COMMA = 60,
        DOT = 61,
        ASSIGN = 62,
        GT = 63,
        LT = 64,
        BANG = 65,
        TILDE = 66,
        QUESTION = 67,
        COLON = 68,
        EQUAL = 69,
        LE = 70,
        GE = 71,
        NOTEQUAL = 72,
        INC = 73,
        DEC = 74,
        ADD = 75,
        SUB = 76,
        MUL = 77,
        DIV = 78,
        BITAND = 79,
        BITOR = 80,
        CARET = 81,
        MOD = 82,
        QUOTE = 83,
        ADD_ASSIGN = 84,
        SUB_ASSIGN = 85,
        MUL_ASSIGN = 86,
        DIV_ASSIGN = 87,
        AND_ASSIGN = 88,
        OR_ASSIGN = 89,
        XOR_ASSIGN = 90,
        MOD_ASSIGN = 91,
        LSHIFT_ASSIGN = 92,
        RSHIFT_ASSIGN = 93,
        URSHIFT_ASSIGN = 94,
        Identifier = 95,
        VariableIdentifier = 96,
        AL_Letter = 97,
        AL_LetterOrDigit = 98,
        WS = 99,
        COMMENT = 100,
        LINE_COMMENT = 101;


        public override string[] TokenNames
        {
            get
            {
                return new string[] 
                {
		            "<INVALID>", "'double'", "'}'", "'boolean'", "'float'", "'char'", "'long'", 
		            "'short'", "'default'", "'int'", "'void'", "'{'", "':end program:'", "'byte'", 
		            "'return'", "'&&'", "':start program:'", "':alproject:'", "':variables:'", 
		            "':methods:'", "'and'", "'array'", "'as'", "'begin'", "'break'", "'case'", 
		            "'catch'", "'constantly'", "'continue'", "'do'", "'else'", "'end'", "'exit'", 
		            "'file'", "'finally'", "'for'", "'function'", "'if'", "'in'", "'is'", 
		            "'let'", "'||'", "'program'", "'set'", "'switch'", "'this'", "'try'", 
		            "'unimplemented'", "'while'", "IntegerLiteral", "FloatingPointLiteral", 
		            "BooleanLiteral", "CharacterLiteral", "StringLiteral", "'null'", "'('", 
		            "')'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
		            "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'++'", "'--'", "'+'", 
		            "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'\"'", "'+='", "'-='", 
		            "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", 
		            "Identifier", "VariableIdentifier", "AL_Letter", "AL_LetterOrDigit", "WS", 
		            "COMMENT", "LINE_COMMENT"
	            };
            }
        }

        public static int
            RULE_program = 0, RULE_programDeclaration = 1, RULE_mainProgram = 2, RULE_methodDeclaration = 3,
            RULE_methodBody = 4, RULE_block = 5, RULE_blockStatement = 6, RULE_statement = 7,
            RULE_switchBlockStatementGroup = 8, RULE_switchLabel = 9, RULE_forControl = 10,
            RULE_forInit = 11, RULE_enhancedForControl = 12, RULE_forUpdate = 13,
            RULE_parExpression = 14, RULE_expressionList = 15, RULE_statementExpression = 16,
            RULE_constantExpression = 17, RULE_formalParameters = 18, RULE_formalParameterList = 19,
            RULE_formalParameter = 20, RULE_variableDeclarators = 21, RULE_variableDeclaration = 22,
            RULE_variableDeclarationID = 23, RULE_variableInitialization = 24, RULE_expression = 25,
            RULE_primary = 26, RULE_literal = 27, RULE_type = 28, RULE_primitiveType = 29;

        public override string[] RuleNames
        {
            get
            {
                return new string[] 
                {
		            "program", "programDeclaration", "mainProgram", "methodDeclaration", "methodBody", 
		            "block", "blockStatement", "statement", "switchBlockStatementGroup", "switchLabel", 
		            "forControl", "forInit", "enhancedForControl", "forUpdate", "parExpression", 
		            "expressionList", "statementExpression", "constantExpression", "formalParameters", 
		            "formalParameterList", "formalParameter", "variableDeclarators", "variableDeclaration", 
		            "variableDeclarationID", "variableInitialization", "expression", "primary", 
		            "literal", "type", "primitiveType"
	            };
            }
        }

        public override string GrammarFileName
        {
            get
            {
                return "AL_CombinedGrammar.g4";
            }
        }



        public ProgramContext program()
        {
            ProgramContext _localctx = new ProgramContext(_ctx, State);
            EnterRule(_localctx, 0, RULE_program);
            int _la;
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = 61;
                    _la = _input.La(1);
                    if (_la == ProgramHeader)
                    {
                        {
                            State = 60; Match(ProgramHeader);
                        }
                    }

                    State = 63; programDeclaration();
                    State = 65;
                    _la = _input.La(1);
                    if (_la == VariableHeader)
                    {
                        {
                            State = 64; Match(VariableHeader);
                        }
                    }

                    State = 70;
                    _errHandler.Sync(this);
                    _la = _input.La(1);
                    while (_la == LET)
                    {
                        {
                            {
                                State = 67; variableDeclaration();
                            }
                        }
                        State = 72;
                        _errHandler.Sync(this);
                        _la = _input.La(1);
                    }
                    State = 74;
                    _la = _input.La(1);
                    if (_la == MethodHeader)
                    {
                        {
                            State = 73; Match(MethodHeader);
                        }
                    }

                    State = 79;
                    _errHandler.Sync(this);
                    _la = _input.La(1);
                    while (_la == FUNCTION)
                    {
                        {
                            {
                                State = (76); methodDeclaration();
                            }
                        }
                        State = (81);
                        _errHandler.Sync(this);
                        _la = _input.La(1);
                    }
                    State = (83);
                    _la = _input.La(1);
                    if (_la == 16)
                    {
                        {
                            State = (82); mainProgram();
                        }
                    }

                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }

            return _localctx;
        }

        /// <summary>
        /// <exception cref="RecognitionException"></exception>
        /// </summary>
        /// <returns></returns>
        public ProgramDeclarationContext programDeclaration()
        {
            ProgramDeclarationContext _localctx = new ProgramDeclarationContext(_ctx, State);
            EnterRule(_localctx, 2, RULE_programDeclaration);
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (85); Match(THIS);
                    State = (86); Match(PROGRAM);
                    State = (87); Match(QUOTE);
                    State = (88); Match(Identifier);
                    State = (89); Match(QUOTE);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public MainProgramContext mainProgram()
        {
            MainProgramContext _localctx = new MainProgramContext(_ctx, State);
            EnterRule(_localctx, 4, RULE_mainProgram);
            int _la;
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (91); Match(16);
                    State = (95);
                    _errHandler.Sync(this);
                    _la = _input.La(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << BEGIN) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LET) | (1L << SWITCH) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << SEMI))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)) | (1L << (VariableIdentifier - 65)))) != 0))
                    {
                        {
                            {
                                State = (92); blockStatement();
                            }
                        }
                        State = (97);
                        _errHandler.Sync(this);
                        _la = _input.La(1);
                    }
                    State = (98); Match(12);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }
        public MethodDeclarationContext methodDeclaration()
        {
            MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, State);
            EnterRule(_localctx, 6, RULE_methodDeclaration);
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (100); Match(FUNCTION);
                    State = (103);
                    switch (_input.La(1))
                    {
                        case 1:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 9:
                        case 13:
                            {
                                State = (101); type();
                            }
                            break;
                        case 10:
                            {
                                State = (102); Match(10);
                            }
                            break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    State = (105); Match(Identifier);
                    State = (106); formalParameters();
                    State = (109);
                    switch (_input.La(1))
                    {
                        case BEGIN:
                            {
                                State = (107); methodBody();
                            }
                            break;
                        case SEMI:
                            {
                                State = (108); Match(SEMI);
                            }
                            break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }
        public MethodBodyContext methodBody()
        {
            MethodBodyContext _localctx = new MethodBodyContext(_ctx, State);
            EnterRule(_localctx, 8, RULE_methodBody);
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (111); block();
                    State = (112); Match(SEMI);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public BlockContext block()
        {
            BlockContext _localctx = new BlockContext(_ctx, State);
            EnterRule(_localctx, 10, RULE_block);
            int _la;
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (114); Match(BEGIN);
                    State = (118);
                    _errHandler.Sync(this);
                    _la = _input.La(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << BEGIN) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LET) | (1L << SWITCH) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << SEMI))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)) | (1L << (VariableIdentifier - 65)))) != 0))
                    {
                        {
                            {
                                State = (115); blockStatement();
                            }
                        }
                        State = (120);
                        _errHandler.Sync(this);
                        _la = _input.La(1);
                    }
                    State = (121); Match(END);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public BlockStatementContext blockStatement()
        {
            BlockStatementContext _localctx = new BlockStatementContext(_ctx, State);
            EnterRule(_localctx, 12, RULE_blockStatement);
            try
            {
                State = (127);
                switch (_input.La(1))
                {
                    case LET:
                        EnterOuterAlt(_localctx, 1);
                        {
                            State = (123); variableDeclaration();
                            State = (124); Match(SEMI);
                        }
                        break;
                    case 14:
                    case BEGIN:
                    case BREAK:
                    case CONTINUE:
                    case DO:
                    case FOR:
                    case IF:
                    case SWITCH:
                    case WHILE:
                    case IntegerLiteral:
                    case FloatingPointLiteral:
                    case BooleanLiteral:
                    case CharacterLiteral:
                    case StringLiteral:
                    case NullLiteral:
                    case LPAREN:
                    case SEMI:
                    case BANG:
                    case TILDE:
                    case INC:
                    case DEC:
                    case ADD:
                    case SUB:
                    case Identifier:
                    case VariableIdentifier:
                        EnterOuterAlt(_localctx, 2);
                        {
                            State = (126); statement();
                        }
                        break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }


        public StatementContext statement()
        {
            StatementContext _localctx = new StatementContext(_ctx, State);
            EnterRule(_localctx, 14, RULE_statement);
            int _la;
            try
            {
                int _alt;
                State = (192);
                switch (_input.La(1))
                {
                    case BEGIN:
                        EnterOuterAlt(_localctx, 1);
                        {
                            State = (129); block();
                        }
                        break;
                    case IF:
                        EnterOuterAlt(_localctx, 2);
                        {
                            State = (130); Match(IF);
                            State = (131); parExpression();
                            State = (132); statement();
                            State = (135);
                            switch (Interpreter.AdaptivePredict(_input, 11, _ctx))
                            {
                                case 1:
                                    {
                                        State = (133); Match(ELSE);
                                        State = (134); statement();
                                    }
                                    break;
                            }
                        }
                        break;
                    case FOR:
                        EnterOuterAlt(_localctx, 3);
                        {
                            State = (137); Match(FOR);
                            State = (138); Match(LPAREN);
                            State = (139); forControl();
                            State = (140); Match(RPAREN);
                            State = (141); statement();
                        }
                        break;
                    case WHILE:
                        EnterOuterAlt(_localctx, 4);
                        {
                            State = (143); Match(WHILE);
                            State = (144); parExpression();
                            State = (145); statement();
                        }
                        break;
                    case DO:
                        EnterOuterAlt(_localctx, 5);
                        {
                            State = (147); Match(DO);
                            State = (148); statement();
                            State = (149); Match(WHILE);
                            State = (150); parExpression();
                            State = (151); Match(SEMI);
                        }
                        break;
                    case SWITCH:
                        EnterOuterAlt(_localctx, 6);
                        {
                            State = (153); Match(SWITCH);
                            State = (154); parExpression();
                            State = (155); Match(11);
                            State = (159);
                            _errHandler.Sync(this);
                            _alt = Interpreter.AdaptivePredict(_input, 12, _ctx);
                            while (_alt != 2 && _alt != -1)
                            {
                                if (_alt == 1)
                                {
                                    {
                                        {
                                            State = (156); switchBlockStatementGroup();
                                        }
                                    }
                                }
                                State = (161);
                                _errHandler.Sync(this);
                                _alt = Interpreter.AdaptivePredict(_input, 12, _ctx);
                            }
                            State = (165);
                            _errHandler.Sync(this);
                            _la = _input.La(1);
                            while (_la == 8 || _la == CASE)
                            {
                                {
                                    {
                                        State = (162); switchLabel();
                                    }
                                }
                                State = (167);
                                _errHandler.Sync(this);
                                _la = _input.La(1);
                            }
                            State = (168); Match(2);
                        }
                        break;
                    case 14:
                        EnterOuterAlt(_localctx, 7);
                        {
                            State = (170); Match(14);
                            State = (172);
                            _la = _input.La(1);
                            if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (IntegerLiteral - 49)) | (1L << (FloatingPointLiteral - 49)) | (1L << (BooleanLiteral - 49)) | (1L << (CharacterLiteral - 49)) | (1L << (StringLiteral - 49)) | (1L << (NullLiteral - 49)) | (1L << (LPAREN - 49)) | (1L << (BANG - 49)) | (1L << (TILDE - 49)) | (1L << (INC - 49)) | (1L << (DEC - 49)) | (1L << (ADD - 49)) | (1L << (SUB - 49)) | (1L << (Identifier - 49)))) != 0))
                            {
                                {
                                    State = (171); expression(0);
                                }
                            }

                            State = (174); Match(SEMI);
                        }
                        break;
                    case BREAK:
                        EnterOuterAlt(_localctx, 8);
                        {
                            State = (175); Match(BREAK);
                            State = (177);
                            _la = _input.La(1);
                            if (_la == VariableIdentifier)
                            {
                                {
                                    State = (176); Match(VariableIdentifier);
                                }
                            }

                            State = (179); Match(SEMI);
                        }
                        break;
                    case CONTINUE:
                        EnterOuterAlt(_localctx, 9);
                        {
                            State = (180); Match(CONTINUE);
                            State = (182);
                            _la = _input.La(1);
                            if (_la == VariableIdentifier)
                            {
                                {
                                    State = (181); Match(VariableIdentifier);
                                }
                            }

                            State = (184); Match(SEMI);
                        }
                        break;
                    case SEMI:
                        EnterOuterAlt(_localctx, 10);
                        {
                            State = (185); Match(SEMI);
                        }
                        break;
                    case IntegerLiteral:
                    case FloatingPointLiteral:
                    case BooleanLiteral:
                    case CharacterLiteral:
                    case StringLiteral:
                    case NullLiteral:
                    case LPAREN:
                    case BANG:
                    case TILDE:
                    case INC:
                    case DEC:
                    case ADD:
                    case SUB:
                    case Identifier:
                        EnterOuterAlt
                            (_localctx, 11);
                        {
                            State = (186); statementExpression();
                            State = (187); Match(SEMI);
                        }
                        break;
                    case VariableIdentifier:
                        EnterOuterAlt
                            (_localctx, 12);
                        {
                            State = (189); Match(VariableIdentifier);
                            State = (190); Match(COLON);
                            State = (191); statement();
                        }
                        break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }


        public SwitchBlockStatementGroupContext switchBlockStatementGroup()
        {
            SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, State);
            EnterRule(_localctx, 16, RULE_switchBlockStatementGroup);
            int _la;
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (195);
                    _errHandler.Sync(this);
                    _la = _input.La(1);
                    do
                    {
                        {
                            {
                                State = (194); switchLabel();
                            }
                        }
                        State = (197);
                        _errHandler.Sync(this);
                        _la = _input.La(1);
                    } while (_la == 8 || _la == CASE);
                    State = (200);
                    _errHandler.Sync(this);
                    _la = _input.La(1);
                    do
                    {
                        {
                            {
                                State = (199); blockStatement();
                            }
                        }
                        State = (202);
                        _errHandler.Sync(this);
                        _la = _input.La(1);
                    } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << BEGIN) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LET) | (1L << SWITCH) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << SEMI))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)) | (1L << (VariableIdentifier - 65)))) != 0));
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public SwitchLabelContext switchLabel()
        {
            SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, State);
            EnterRule(_localctx, 18, RULE_switchLabel);
            try
            {
                State = (210);
                switch (_input.La(1))
                {
                    case CASE:
                        EnterOuterAlt(_localctx, 1);
                        {
                            State = (204); Match(CASE);
                            State = (205); constantExpression();
                            State = (206); Match(COLON);
                        }
                        break;
                    case 8:
                        EnterOuterAlt(_localctx, 2);
                        {
                            State = (208); Match(8);
                            State = (209); Match(COLON);
                        }
                        break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public ForControlContext forControl()
        {
            ForControlContext _localctx = new ForControlContext(_ctx, State);
            EnterRule(_localctx, 20, RULE_forControl);
            int _la;
            try
            {
                State = (224);
                switch (_input.La(1))
                {
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 13:
                        EnterOuterAlt(_localctx, 1);
                        {
                            State = (212); enhancedForControl();
                        }
                        break;
                    case LET:
                    case IntegerLiteral:
                    case FloatingPointLiteral:
                    case BooleanLiteral:
                    case CharacterLiteral:
                    case StringLiteral:
                    case NullLiteral:
                    case LPAREN:
                    case SEMI:
                    case BANG:
                    case TILDE:
                    case INC:
                    case DEC:
                    case ADD:
                    case SUB:
                    case Identifier:
                        EnterOuterAlt(_localctx, 2);
                        {
                            State = (214);
                            _la = _input.La(1);
                            if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (LET - 40)) | (1L << (IntegerLiteral - 40)) | (1L << (FloatingPointLiteral - 40)) | (1L << (BooleanLiteral - 40)) | (1L << (CharacterLiteral - 40)) | (1L << (StringLiteral - 40)) | (1L << (NullLiteral - 40)) | (1L << (LPAREN - 40)) | (1L << (BANG - 40)) | (1L << (TILDE - 40)) | (1L << (INC - 40)) | (1L << (DEC - 40)) | (1L << (ADD - 40)) | (1L << (SUB - 40)) | (1L << (Identifier - 40)))) != 0))
                            {
                                {
                                    State = (213); forInit();
                                }
                            }

                            State = (216); Match(SEMI);
                            State = (218);
                            _la = _input.La(1);
                            if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (IntegerLiteral - 49)) | (1L << (FloatingPointLiteral - 49)) | (1L << (BooleanLiteral - 49)) | (1L << (CharacterLiteral - 49)) | (1L << (StringLiteral - 49)) | (1L << (NullLiteral - 49)) | (1L << (LPAREN - 49)) | (1L << (BANG - 49)) | (1L << (TILDE - 49)) | (1L << (INC - 49)) | (1L << (DEC - 49)) | (1L << (ADD - 49)) | (1L << (SUB - 49)) | (1L << (Identifier - 49)))) != 0))
                            {
                                {
                                    State = (217); expression(0);
                                }
                            }

                            State = (220); Match(SEMI);
                            State = (222);
                            _la = _input.La(1);
                            if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (IntegerLiteral - 49)) | (1L << (FloatingPointLiteral - 49)) | (1L << (BooleanLiteral - 49)) | (1L << (CharacterLiteral - 49)) | (1L << (StringLiteral - 49)) | (1L << (NullLiteral - 49)) | (1L << (LPAREN - 49)) | (1L << (BANG - 49)) | (1L << (TILDE - 49)) | (1L << (INC - 49)) | (1L << (DEC - 49)) | (1L << (ADD - 49)) | (1L << (SUB - 49)) | (1L << (Identifier - 49)))) != 0))
                            {
                                {
                                    State = (221); forUpdate();
                                }
                            }

                        }
                        break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }


        public ForInitContext forInit()
        {
            ForInitContext _localctx = new ForInitContext(_ctx, State);
            EnterRule(_localctx, 22, RULE_forInit);
            try
            {
                State = (228);
                switch (_input.La(1))
                {
                    case LET:
                        EnterOuterAlt(_localctx, 1);
                        {
                            State = (226); variableDeclaration();
                        }
                        break;
                    case IntegerLiteral:
                    case FloatingPointLiteral:
                    case BooleanLiteral:
                    case CharacterLiteral:
                    case StringLiteral:
                    case NullLiteral:
                    case LPAREN:
                    case BANG:
                    case TILDE:
                    case INC:
                    case DEC:
                    case ADD:
                    case SUB:
                    case Identifier:
                        EnterOuterAlt(_localctx, 2);
                        {
                            State = (227); expressionList();
                        }
                        break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public EnhancedForControlContext enhancedForControl()
        {
            EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, State);
            EnterRule(_localctx, 24, RULE_enhancedForControl);
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (230); type();
                    State = (231); Match(VariableIdentifier);
                    State = (232); Match(COLON);
                    State = (233); expression(0);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public ForUpdateContext forUpdate()
        {
            ForUpdateContext _localctx = new ForUpdateContext(_ctx, State);
            EnterRule(_localctx, 26, RULE_forUpdate);
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (235); expressionList();
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public ParExpressionContext parExpression()
        {
            ParExpressionContext _localctx = new ParExpressionContext(_ctx, State);
            EnterRule(_localctx, 28, RULE_parExpression);
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (237); Match(LPAREN);
                    State = (238); expression(0);
                    State = (239); Match(RPAREN);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public ExpressionListContext expressionList()
        {
            ExpressionListContext _localctx = new ExpressionListContext(_ctx, State);
            EnterRule(_localctx, 30, RULE_expressionList);
            int _la;
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (241); expression(0);
                    State = (246);
                    _errHandler.Sync(this);
                    _la = _input.La(1);
                    while (_la == COMMA)
                    {
                        {
                            {
                                State = (242); Match(COMMA);
                                State = (243); expression(0);
                            }
                        }
                        State = (248);
                        _errHandler.Sync(this);
                        _la = _input.La(1);
                    }
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public StatementExpressionContext statementExpression()
        {
            StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, State);
            EnterRule(_localctx, 32, RULE_statementExpression);
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (249); expression(0);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public ConstantExpressionContext constantExpression()
        {
            ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, State);
            EnterRule(_localctx, 34, RULE_constantExpression);
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (251); expression(0);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }


        public FormalParametersContext formalParameters()
        {
            FormalParametersContext _localctx = new FormalParametersContext(_ctx, State);
            EnterRule(_localctx, 36, RULE_formalParameters);
            int _la;
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (253); Match(LPAREN);
                    State = (255);
                    _la = _input.La(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 9) | (1L << 13))) != 0))
                    {
                        {
                            State = (254); formalParameterList();
                        }
                    }

                    State = (257); Match(RPAREN);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public FormalParameterListContext formalParameterList()
        {
            FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, State);
            EnterRule(_localctx, 38, RULE_formalParameterList);
            int _la;
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (259); formalParameter();
                    State = (264);
                    _errHandler.Sync(this);
                    _la = _input.La(1);
                    while (_la == COMMA)
                    {
                        {
                            {
                                State = (260); Match(COMMA);
                                State = (261); formalParameter();
                            }
                        }
                        State = (266);
                        _errHandler.Sync(this);
                        _la = _input.La(1);
                    }
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public FormalParameterContext formalParameter()
        {
            FormalParameterContext _localctx = new FormalParameterContext(_ctx, State);
            EnterRule(_localctx, 40, RULE_formalParameter);
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (267); type();
                    State = (268); Match(VariableIdentifier);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public VariableDeclaratorsContext variableDeclarators()
        {
            VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, State);
            EnterRule(_localctx, 42, RULE_variableDeclarators);
            int _la;
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (270); variableDeclaration();
                    State = (275);
                    _errHandler.Sync(this);
                    _la = _input.La(1);
                    while (_la == COMMA)
                    {
                        {
                            {
                                State = (271); Match(COMMA);
                                State = (272); variableDeclaration();
                            }
                        }
                        State = (277);
                        _errHandler.Sync(this);
                        _la = _input.La(1);
                    }
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public VariableDeclarationContext variableDeclaration()
        {
            VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, State);
            EnterRule(_localctx, 44, RULE_variableDeclaration);
            int _la;
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (278); Match(LET);
                    State = (279); type();
                    State = (280); variableDeclarationID();
                    State = (283);
                    _la = _input.La(1);
                    if (_la == ASSIGN)
                    {
                        {
                            State = (281); Match(ASSIGN);
                            State = (282); variableInitialization();
                        }
                    }

                    State = (285); Match(SEMI);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public VariableDeclarationIDContext variableDeclarationID()
        {
            VariableDeclarationIDContext _localctx = new VariableDeclarationIDContext(_ctx, State);
            EnterRule(_localctx, 46, RULE_variableDeclarationID);
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (287); Match(VariableIdentifier);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public VariableInitializationContext variableInitialization()
        {
            VariableInitializationContext _localctx = new VariableInitializationContext(_ctx, State);
            EnterRule(_localctx, 48, RULE_variableInitialization);
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (289); expression(0);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public ExpressionContext expression(int _p)
        {
            ParserRuleContext _parentctx = _ctx;
            int _parentState = State;
            ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
            ExpressionContext _prevctx = _localctx;
            int _startState = 50;
            EnterRecursionRule(_localctx, RULE_expression);
            int _la;
            try
            {
                int _alt;
                EnterOuterAlt(_localctx, 1);
                {
                    State = (302);
                    switch (Interpreter.AdaptivePredict(_input, 31, _ctx))
                    {
                        case 1:
                            {
                                State = (292); Match(LPAREN);
                                State = (293); type();
                                State = (294); Match(RPAREN);
                                State = (295); expression(16);
                            }
                            break;

                        case 2:
                            {
                                State = (297);
                                _la = _input.La(1);
                                if (!(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (ADD - 73)) | (1L << (SUB - 73)))) != 0)))
                                {
                                    _errHandler.RecoverInline(this);
                                }
                                Consume();
                                State = (298); expression(14);
                            }
                            break;

                        case 3:
                            {
                                State = (299);
                                _la = _input.La(1);
                                if (!(_la == BANG || _la == TILDE))
                                {
                                    _errHandler.RecoverInline(this);
                                }
                                Consume();
                                State = (300); expression(13);
                            }
                            break;

                        case 4:
                            {
                                State = (301); primary();
                            }
                            break;
                    }
                    _ctx.stop = _input.Lt(-1);
                    State = (382);
                    _errHandler.Sync(this);
                    _alt = Interpreter.AdaptivePredict(_input, 36, _ctx);
                    while (_alt != 2 && _alt != -1)
                    {
                        if (_alt == 1)
                        {
                            if (_parseListeners != null) TriggerExitRuleEvent();
                            _prevctx = _localctx;
                            {
                                State = (380);
                                switch (Interpreter.AdaptivePredict(_input, 35, _ctx))
                                {
                                    case 1:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (304);
                                            if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
                                            State = (305);
                                            _la = _input.La(1);
                                            if (!(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (MUL - 77)) | (1L << (DIV - 77)) | (1L << (MOD - 77)))) != 0)))
                                            {
                                                _errHandler.RecoverInline(this);
                                            }
                                            Consume();
                                            State = (306); expression(13);
                                        }
                                        break;

                                    case 2:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (307);
                                            if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
                                            State = (308);
                                            _la = _input.La(1);
                                            if (!(_la == ADD || _la == SUB))
                                            {
                                                _errHandler.RecoverInline(this);
                                            }
                                            Consume();
                                            State = (309); expression(12);
                                        }
                                        break;

                                    case 3:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (310);
                                            if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
                                            State = (318);
                                            switch (Interpreter.AdaptivePredict(_input, 32, _ctx))
                                            {
                                                case 1:
                                                    {
                                                        State = (311); Match(LT);
                                                        State = (312); Match(LT);
                                                    }
                                                    break;

                                                case 2:
                                                    {
                                                        State = (313); Match(GT);
                                                        State = (314); Match(GT);
                                                        State = (315); Match(GT);
                                                    }
                                                    break;

                                                case 3:
                                                    {
                                                        State = (316); Match(GT);
                                                        State = (317); Match(GT);
                                                    }
                                                    break;
                                            }
                                            State = (320); expression(11);
                                        }
                                        break;

                                    case 4:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (321);
                                            if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
                                            State = (322);
                                            _la = _input.La(1);
                                            if (!(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (GT - 63)) | (1L << (LT - 63)) | (1L << (LE - 63)) | (1L << (GE - 63)))) != 0)))
                                            {
                                                _errHandler.RecoverInline(this);
                                            }
                                            Consume();
                                            State = (323); expression(10);
                                        }
                                        break;

                                    case 5:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (324);
                                            if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
                                            State = (325);
                                            _la = _input.La(1);
                                            if (!(_la == EQUAL || _la == NOTEQUAL))
                                            {
                                                _errHandler.RecoverInline(this);
                                            }
                                            Consume();
                                            State = (326); expression(9);
                                        }
                                        break;

                                    case 6:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (327);
                                            if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
                                            State = (328); Match(BITAND);
                                            State = (329); expression(8);
                                        }
                                        break;

                                    case 7:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (330);
                                            if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
                                            State = (331); Match(CARET);
                                            State = (332); expression(7);
                                        }
                                        break;

                                    case 8:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (333);
                                            if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
                                            State = (334); Match(BITOR);
                                            State = (335); expression(6);
                                        }
                                        break;

                                    case 9:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (336);
                                            if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
                                            State = (337); Match(15);
                                            State = (338); expression(5);
                                        }
                                        break;

                                    case 10:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (339);
                                            if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
                                            State = (340); Match(OR);
                                            State = (341); expression(4);
                                        }
                                        break;

                                    case 11:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (342);
                                            if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
                                            State = (355);
                                            switch (_input.La(1))
                                            {
                                                case ASSIGN:
                                                    {
                                                        State = (343); Match(ASSIGN);
                                                    }
                                                    break;
                                                case ADD_ASSIGN:
                                                    {
                                                        State = (344); Match(ADD_ASSIGN);
                                                    }
                                                    break;
                                                case SUB_ASSIGN:
                                                    {
                                                        State = (345); Match(SUB_ASSIGN);
                                                    }
                                                    break;
                                                case MUL_ASSIGN:
                                                    {
                                                        State = (346); Match(MUL_ASSIGN);
                                                    }
                                                    break;
                                                case DIV_ASSIGN:
                                                    {
                                                        State = (347); Match(DIV_ASSIGN);
                                                    }
                                                    break;
                                                case AND_ASSIGN:
                                                    {
                                                        State = (348); Match(AND_ASSIGN);
                                                    }
                                                    break;
                                                case OR_ASSIGN:
                                                    {
                                                        State = (349); Match(OR_ASSIGN);
                                                    }
                                                    break;
                                                case XOR_ASSIGN:
                                                    {
                                                        State = (350); Match(XOR_ASSIGN);
                                                    }
                                                    break;
                                                case RSHIFT_ASSIGN:
                                                    {
                                                        State = (351); Match(RSHIFT_ASSIGN);
                                                    }
                                                    break;
                                                case URSHIFT_ASSIGN:
                                                    {
                                                        State = (352); Match(URSHIFT_ASSIGN);
                                                    }
                                                    break;
                                                case LSHIFT_ASSIGN:
                                                    {
                                                        State = (353); Match(LSHIFT_ASSIGN);
                                                    }
                                                    break;
                                                case MOD_ASSIGN:
                                                    {
                                                        State = (354); Match(MOD_ASSIGN);
                                                    }
                                                    break;
                                                default:
                                                    throw new NoViableAltException(this);
                                            }
                                            State = (357); expression(1);
                                        }
                                        break;

                                    case 12:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (358);
                                            if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
                                            State = (359); Match(QUESTION);
                                            State = (360); expression(0);
                                            State = (361); Match(COLON);
                                            State = (362); expression(3);
                                        }
                                        break;

                                    case 13:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (364);
                                            if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
                                            State = (365); Match(DOT);
                                            State = (366);
                                            _la = _input.La(1);
                                            if (!(_la == Identifier || _la == VariableIdentifier))
                                            {
                                                _errHandler.RecoverInline(this);
                                            }
                                            Consume();
                                        }
                                        break;

                                    case 14:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (367);
                                            if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
                                            State = (368); Match(LBRACK);
                                            State = (369); expression(0);
                                            State = (370); Match(RBRACK);
                                        }
                                        break;

                                    case 15:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (372);
                                            if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
                                            State = (373); Match(LPAREN);
                                            State = (375);
                                            _la = _input.La(1);
                                            if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (IntegerLiteral - 49)) | (1L << (FloatingPointLiteral - 49)) | (1L << (BooleanLiteral - 49)) | (1L << (CharacterLiteral - 49)) | (1L << (StringLiteral - 49)) | (1L << (NullLiteral - 49)) | (1L << (LPAREN - 49)) | (1L << (BANG - 49)) | (1L << (TILDE - 49)) | (1L << (INC - 49)) | (1L << (DEC - 49)) | (1L << (ADD - 49)) | (1L << (SUB - 49)) | (1L << (Identifier - 49)))) != 0))
                                            {
                                                {
                                                    State = (374); expressionList();
                                                }
                                            }

                                            State = (377); Match(RPAREN);
                                        }
                                        break;

                                    case 16:
                                        {
                                            _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                            PushNewRecursionContext(_localctx, _startState, RULE_expression);
                                            State = (378);
                                            if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
                                            State = (379);
                                            _la = _input.La(1);
                                            if (!(_la == INC || _la == DEC))
                                            {
                                                _errHandler.RecoverInline(this);
                                            }
                                            Consume();
                                        }
                                        break;
                                }
                            }
                        }
                        State = (384);
                        _errHandler.Sync(this);
                        _alt = Interpreter.AdaptivePredict(_input, 36, _ctx);
                    }
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                UnrollRecursionContexts(_parentctx);
            }
            return _localctx;
        }

        public PrimaryContext primary()
        {
            PrimaryContext _localctx = new PrimaryContext(_ctx, State);
            EnterRule(_localctx, 52, RULE_primary);
            try
            {
                State = (391);
                switch (_input.La(1))
                {
                    case LPAREN:
                        EnterOuterAlt(_localctx, 1);
                        {
                            State = (385); Match(LPAREN);
                            State = (386); expression(0);
                            State = (387); Match(RPAREN);
                        }
                        break;
                    case IntegerLiteral:
                    case FloatingPointLiteral:
                    case BooleanLiteral:
                    case CharacterLiteral:
                    case StringLiteral:
                    case NullLiteral:
                        EnterOuterAlt(_localctx, 2);
                        {
                            State = (389); literal();
                        }
                        break;
                    case Identifier:
                        EnterOuterAlt(_localctx, 3);
                        {
                            State = (390); Match(Identifier);
                        }
                        break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public LiteralContext literal()
        {
            LiteralContext _localctx = new LiteralContext(_ctx, State);
            EnterRule(_localctx, 54, RULE_literal);
            int _la;
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (393);
                    _la = _input.La(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)))
                    {
                        _errHandler.RecoverInline(this);
                    }
                    Consume();
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public TypeContext type()
        {
            TypeContext _localctx = new TypeContext(_ctx, State);
            EnterRule(_localctx, 56, RULE_type);
            int _la;
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (395); primitiveType();
                    State = (400);
                    _errHandler.Sync(this);
                    _la = _input.La(1);
                    while (_la == LBRACK)
                    {
                        {
                            {
                                State = (396); Match(LBRACK);
                                State = (397); Match(RBRACK);
                            }
                        }
                        State = (402);
                        _errHandler.Sync(this);
                        _la = _input.La(1);
                    }
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public PrimitiveTypeContext primitiveType()
        {
            PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, State);
            EnterRule(_localctx, 58, RULE_primitiveType);
            int _la;
            try
            {
                EnterOuterAlt(_localctx, 1);
                {
                    State = (403);
                    _la = _input.La(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 9) | (1L << 13))) != 0)))
                    {
                        _errHandler.RecoverInline(this);
                    }
                    Consume();
                }
            }
            catch (RecognitionException re)
            {
                _localctx.exception = re;
                _errHandler.ReportError(this, re);
                _errHandler.Recover(this, re);
            }
            finally
            {
                ExitRule();
            }
            return _localctx;
        }

        public bool sempred(RuleContext _localctx, int ruleIndex, int predIndex)
        {
            switch (ruleIndex)
            {
                case 25: return expression_sempred((ExpressionContext)_localctx, predIndex);
            }
            return true;
        }

        private bool expression_sempred(ExpressionContext _localctx, int predIndex)
        {
            switch (predIndex)
            {
                case 0: return 12 >= _localctx._p;

                case 1: return 11 >= _localctx._p;

                case 2: return 10 >= _localctx._p;

                case 3: return 9 >= _localctx._p;

                case 4: return 8 >= _localctx._p;

                case 5: return 7 >= _localctx._p;

                case 6: return 6 >= _localctx._p;

                case 7: return 5 >= _localctx._p;

                case 8: return 4 >= _localctx._p;

                case 9: return 3 >= _localctx._p;

                case 10: return 1 >= _localctx._p;

                case 11: return 2 >= _localctx._p;

                case 12: return 19 >= _localctx._p;

                case 13: return 18 >= _localctx._p;

                case 14: return 17 >= _localctx._p;

                case 15: return 15 >= _localctx._p;
            }
            return true;
        }
    }
}