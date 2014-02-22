package main;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

public class AL_Lexer extends Lexer {
		protected static final DFA[] _decisionToDFA;
		protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
		public static final int
			T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
			T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
			ProgramHeader=17, VariableHeader=18, MethodHeader=19, AND=20, ARRAY=21, 
			AS=22, BEGIN=23, BREAK=24, CASE=25, CATCH=26, CONSTANTLY=27, CONTINUE=28, 
			DO=29, ELSE=30, END=31, EXIT=32, FILE=33, FINALLY=34, FOR=35, FUNCTION=36, 
			IF=37, IN=38, IS=39, LET=40, OR=41, PROGRAM=42, SET=43, SWITCH=44, THIS=45, 
			TRY=46, UNIMPLEMENTED=47, WHILE=48, IntegerLiteral=49, FloatingPointLiteral=50, 
			BooleanLiteral=51, CharacterLiteral=52, StringLiteral=53, NullLiteral=54, 
			LPAREN=55, RPAREN=56, LBRACK=57, RBRACK=58, SEMI=59, COMMA=60, DOT=61, 
			ASSIGN=62, GT=63, LT=64, BANG=65, TILDE=66, QUESTION=67, COLON=68, EQUAL=69, 
			LE=70, GE=71, NOTEQUAL=72, INC=73, DEC=74, ADD=75, SUB=76, MUL=77, DIV=78, 
			BITAND=79, BITOR=80, CARET=81, MOD=82, QUOTE=83, ADD_ASSIGN=84, SUB_ASSIGN=85, 
			MUL_ASSIGN=86, DIV_ASSIGN=87, AND_ASSIGN=88, OR_ASSIGN=89, XOR_ASSIGN=90, 
			MOD_ASSIGN=91, LSHIFT_ASSIGN=92, RSHIFT_ASSIGN=93, URSHIFT_ASSIGN=94, 
			Identifier=95, VariableIdentifier=96, AL_Letter=97, AL_LetterOrDigit=98, 
			WS=99, COMMENT=100, LINE_COMMENT=101;
		public static String[] modeNames = {
			"DEFAULT_MODE"
		};

		public static final String[] tokenNames = {
			"<INVALID>",
			"'double'", "'}'", "'boolean'", "'float'", "'char'", "'long'", "'short'", 
			"'default'", "'int'", "'void'", "'{'", "':end program:'", "'byte'", "'return'", 
			"'&&'", "':start program:'", "':alproject:'", "':variables:'", "':methods:'", 
			"'and'", "'array'", "'as'", "'begin'", "'break'", "'case'", "'catch'", 
			"'constantly'", "'continue'", "'do'", "'else'", "'end'", "'exit'", "'file'", 
			"'finally'", "'for'", "'function'", "'if'", "'in'", "'is'", "'let'", "'||'", 
			"'program'", "'set'", "'switch'", "'this'", "'try'", "'unimplemented'", 
			"'while'", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
			"CharacterLiteral", "StringLiteral", "'null'", "'('", "')'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'<='", "'>='", "'!='", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", 
			"'&'", "'|'", "'^'", "'%'", "'\"'", "'+='", "'-='", "'*='", "'/='", "'&='", 
			"'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "VariableIdentifier", 
			"AL_Letter", "AL_LetterOrDigit", "WS", "COMMENT", "LINE_COMMENT"
		};
		public static final String[] ruleNames = {
			"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
			"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ProgramHeader", 
			"VariableHeader", "MethodHeader", "AND", "ARRAY", "AS", "BEGIN", "BREAK", 
			"CASE", "CATCH", "CONSTANTLY", "CONTINUE", "DO", "ELSE", "END", "EXIT", 
			"FILE", "FINALLY", "FOR", "FUNCTION", "IF", "IN", "IS", "LET", "OR", "PROGRAM", 
			"SET", "SWITCH", "THIS", "TRY", "UNIMPLEMENTED", "WHILE", "IntegerLiteral", 
			"DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", 
			"IntegerTypeSuffix", "DecimalNumeral", "Digits", "Digit", "NonZeroDigit", 
			"DigitOrUnderscore", "Underscores", "HexNumeral", "HexDigits", "HexDigit", 
			"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitOrUnderscore", 
			"BinaryNumeral", "BinaryDigits", "BinaryDigit", "BinaryDigitOrUnderscore", 
			"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
			"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
			"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", 
			"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
			"StringCharacter", "EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
			"BITOR", "CARET", "MOD", "QUOTE", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "VariableIdentifier", 
			"AL_Letter", "AL_LetterOrDigit", "WS", "COMMENT", "LINE_COMMENT"
		};


		public AL_Lexer(CharStream input) {
			super(input);
			_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
		}

		@Override
		public String getGrammarFileName() { return "AL_CombinedGrammar.g4"; }

		@Override
		public String[] getTokenNames() { return tokenNames; }

		@Override
		public String[] getRuleNames() { return ruleNames; }

		@Override
		public String[] getModeNames() { return modeNames; }

		@Override
		public ATN getATN() { return _ATN; }

		@Override
		public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
			switch (ruleIndex) {
			case 138: WS_action((RuleContext)_localctx, actionIndex); break;

			case 139: COMMENT_action((RuleContext)_localctx, actionIndex); break;

			case 140: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
			}
		}
		private void WS_action(RuleContext _localctx, int actionIndex) {
			switch (actionIndex) {
			case 0: skip();  break;
			}
		}
		private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
			switch (actionIndex) {
			case 2: skip();  break;
			}
		}
		private void COMMENT_action(RuleContext _localctx, int actionIndex) {
			switch (actionIndex) {
			case 1: skip();  break;
			}
		}

		public static final String _serializedATN =
			"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2g\u03ec\b\1\4\2\t"+
			"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
			"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
			"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
			"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
			"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
			",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
			"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
			"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
			"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
			"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
			"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
			"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
			"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
			"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
			"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
			"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
			"\t\u008e\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
			"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
			"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
			"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
			"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
			"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
			"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
			"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
			"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
			"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3"+
			"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
			"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
			"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
			"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\""+
			"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
			"%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3"+
			"+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3"+
			"/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
			"\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u024e"+
			"\n\62\3\63\3\63\5\63\u0252\n\63\3\64\3\64\5\64\u0256\n\64\3\65\3\65\5"+
			"\65\u025a\n\65\3\66\3\66\5\66\u025e\n\66\3\67\3\67\38\38\38\58\u0265\n"+
			"8\38\38\38\58\u026a\n8\58\u026c\n8\39\39\79\u0270\n9\f9\169\u0273\139"+
			"\39\59\u0276\n9\3:\3:\5:\u027a\n:\3;\3;\3<\3<\5<\u0280\n<\3=\6=\u0283"+
			"\n=\r=\16=\u0284\3>\3>\3>\3>\3?\3?\7?\u028d\n?\f?\16?\u0290\13?\3?\5?"+
			"\u0293\n?\3@\3@\3A\3A\5A\u0299\nA\3B\3B\5B\u029d\nB\3B\3B\3C\3C\7C\u02a3"+
			"\nC\fC\16C\u02a6\13C\3C\5C\u02a9\nC\3D\3D\3E\3E\5E\u02af\nE\3F\3F\3F\3"+
			"F\3G\3G\7G\u02b7\nG\fG\16G\u02ba\13G\3G\5G\u02bd\nG\3H\3H\3I\3I\5I\u02c3"+
			"\nI\3J\3J\5J\u02c7\nJ\3K\3K\3K\5K\u02cc\nK\3K\5K\u02cf\nK\3K\5K\u02d2"+
			"\nK\3K\3K\3K\5K\u02d7\nK\3K\5K\u02da\nK\3K\3K\3K\5K\u02df\nK\3K\3K\3K"+
			"\5K\u02e4\nK\3L\3L\3L\3M\3M\3N\5N\u02ec\nN\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q"+
			"\5Q\u02f7\nQ\3R\3R\5R\u02fb\nR\3R\3R\3R\5R\u0300\nR\3R\3R\5R\u0304\nR"+
			"\3S\3S\3S\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0314\nU\3V\3V\3V\3V\3V"+
			"\3V\3V\3V\5V\u031e\nV\3W\3W\3X\3X\5X\u0324\nX\3X\3X\3Y\6Y\u0329\nY\rY"+
			"\16Y\u032a\3Z\3Z\5Z\u032f\nZ\3[\3[\3[\3[\5[\u0335\n[\3\\\3\\\3\\\3\\\3"+
			"\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0342\n\\\3]\3]\3]\3]\3]\3]\3]\3^\3^\3"+
			"_\3_\3_\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3"+
			"i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3n\3o\3o\3o\3p\3p\3p\3q\3q\3q\3r\3"+
			"r\3r\3s\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3"+
			"}\3}\3}\3~\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
			"\3\u0081\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084"+
			"\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
			"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\7\u0088\u03b9"+
			"\n\u0088\f\u0088\16\u0088\u03bc\13\u0088\3\u0089\3\u0089\3\u0089\3\u008a"+
			"\3\u008a\3\u008a\3\u008a\5\u008a\u03c5\n\u008a\3\u008b\3\u008b\3\u008b"+
			"\3\u008b\5\u008b\u03cb\n\u008b\3\u008c\6\u008c\u03ce\n\u008c\r\u008c\16"+
			"\u008c\u03cf\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u03d8"+
			"\n\u008d\f\u008d\16\u008d\u03db\13\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
			"\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u03e6\n\u008e\f\u008e"+
			"\16\u008e\u03e9\13\u008e\3\u008e\3\u008e\3\u03d9\u008f\3\3\1\5\4\1\7\5"+
			"\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17"+
			"\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61"+
			"\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1"+
			"K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\2\1g\2"+
			"\1i\2\1k\2\1m\2\1o\2\1q\2\1s\2\1u\2\1w\2\1y\2\1{\2\1}\2\1\177\2\1\u0081"+
			"\2\1\u0083\2\1\u0085\2\1\u0087\2\1\u0089\2\1\u008b\2\1\u008d\2\1\u008f"+
			"\2\1\u0091\2\1\u0093\64\1\u0095\2\1\u0097\2\1\u0099\2\1\u009b\2\1\u009d"+
			"\2\1\u009f\2\1\u00a1\2\1\u00a3\2\1\u00a5\2\1\u00a7\2\1\u00a9\65\1\u00ab"+
			"\66\1\u00ad\2\1\u00af\67\1\u00b1\2\1\u00b3\2\1\u00b5\2\1\u00b7\2\1\u00b9"+
			"\2\1\u00bb\2\1\u00bd8\1\u00bf9\1\u00c1:\1\u00c3;\1\u00c5<\1\u00c7=\1\u00c9"+
			">\1\u00cb?\1\u00cd@\1\u00cfA\1\u00d1B\1\u00d3C\1\u00d5D\1\u00d7E\1\u00d9"+
			"F\1\u00dbG\1\u00ddH\1\u00dfI\1\u00e1J\1\u00e3K\1\u00e5L\1\u00e7M\1\u00e9"+
			"N\1\u00ebO\1\u00edP\1\u00efQ\1\u00f1R\1\u00f3S\1\u00f5T\1\u00f7U\1\u00f9"+
			"V\1\u00fbW\1\u00fdX\1\u00ffY\1\u0101Z\1\u0103[\1\u0105\\\1\u0107]\1\u0109"+
			"^\1\u010b_\1\u010d`\1\u010fa\1\u0111b\1\u0113c\1\u0115d\1\u0117e\2\u0119"+
			"f\3\u011bg\4\3\2\30\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DD"+
			"dd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\n\2$"+
			"$))^^ddhhppttvv\3\2\62\65\4\2&&C|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01"+
			"\3\2\udc02\ue001\6\2&&\62;C\\aa\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u03fc"+
			"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
			"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
			"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
			"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
			"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
			"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
			"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
			"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
			"\2\2\2\2c\3\2\2\2\2\u0093\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00af"+
			"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
			"\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd"+
			"\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2"+
			"\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df"+
			"\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2"+
			"\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1"+
			"\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2"+
			"\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103"+
			"\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2"+
			"\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113\3\2\2\2\2\u0115"+
			"\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011b\3\2\2\2\3\u011d\3\2\2"+
			"\2\5\u0124\3\2\2\2\7\u0126\3\2\2\2\t\u012e\3\2\2\2\13\u0134\3\2\2\2\r"+
			"\u0139\3\2\2\2\17\u013e\3\2\2\2\21\u0144\3\2\2\2\23\u014c\3\2\2\2\25\u0150"+
			"\3\2\2\2\27\u0155\3\2\2\2\31\u0157\3\2\2\2\33\u0165\3\2\2\2\35\u016a\3"+
			"\2\2\2\37\u0171\3\2\2\2!\u0174\3\2\2\2#\u0184\3\2\2\2%\u0190\3\2\2\2\'"+
			"\u019c\3\2\2\2)\u01a6\3\2\2\2+\u01aa\3\2\2\2-\u01b0\3\2\2\2/\u01b3\3\2"+
			"\2\2\61\u01b9\3\2\2\2\63\u01bf\3\2\2\2\65\u01c4\3\2\2\2\67\u01ca\3\2\2"+
			"\29\u01d5\3\2\2\2;\u01de\3\2\2\2=\u01e1\3\2\2\2?\u01e6\3\2\2\2A\u01ea"+
			"\3\2\2\2C\u01ef\3\2\2\2E\u01f4\3\2\2\2G\u01fc\3\2\2\2I\u0200\3\2\2\2K"+
			"\u0209\3\2\2\2M\u020c\3\2\2\2O\u020f\3\2\2\2Q\u0212\3\2\2\2S\u0216\3\2"+
			"\2\2U\u0219\3\2\2\2W\u0221\3\2\2\2Y\u0225\3\2\2\2[\u022c\3\2\2\2]\u0231"+
			"\3\2\2\2_\u0235\3\2\2\2a\u0243\3\2\2\2c\u024d\3\2\2\2e\u024f\3\2\2\2g"+
			"\u0253\3\2\2\2i\u0257\3\2\2\2k\u025b\3\2\2\2m\u025f\3\2\2\2o\u026b\3\2"+
			"\2\2q\u026d\3\2\2\2s\u0279\3\2\2\2u\u027b\3\2\2\2w\u027f\3\2\2\2y\u0282"+
			"\3\2\2\2{\u0286\3\2\2\2}\u028a\3\2\2\2\177\u0294\3\2\2\2\u0081\u0298\3"+
			"\2\2\2\u0083\u029a\3\2\2\2\u0085\u02a0\3\2\2\2\u0087\u02aa\3\2\2\2\u0089"+
			"\u02ae\3\2\2\2\u008b\u02b0\3\2\2\2\u008d\u02b4\3\2\2\2\u008f\u02be\3\2"+
			"\2\2\u0091\u02c2\3\2\2\2\u0093\u02c6\3\2\2\2\u0095\u02e3\3\2\2\2\u0097"+
			"\u02e5\3\2\2\2\u0099\u02e8\3\2\2\2\u009b\u02eb\3\2\2\2\u009d\u02ef\3\2"+
			"\2\2\u009f\u02f1\3\2\2\2\u00a1\u02f3\3\2\2\2\u00a3\u0303\3\2\2\2\u00a5"+
			"\u0305\3\2\2\2\u00a7\u0308\3\2\2\2\u00a9\u0313\3\2\2\2\u00ab\u031d\3\2"+
			"\2\2\u00ad\u031f\3\2\2\2\u00af\u0321\3\2\2\2\u00b1\u0328\3\2\2\2\u00b3"+
			"\u032e\3\2\2\2\u00b5\u0334\3\2\2\2\u00b7\u0341\3\2\2\2\u00b9\u0343\3\2"+
			"\2\2\u00bb\u034a\3\2\2\2\u00bd\u034c\3\2\2\2\u00bf\u0351\3\2\2\2\u00c1"+
			"\u0353\3\2\2\2\u00c3\u0355\3\2\2\2\u00c5\u0357\3\2\2\2\u00c7\u0359\3\2"+
			"\2\2\u00c9\u035b\3\2\2\2\u00cb\u035d\3\2\2\2\u00cd\u035f\3\2\2\2\u00cf"+
			"\u0361\3\2\2\2\u00d1\u0363\3\2\2\2\u00d3\u0365\3\2\2\2\u00d5\u0367\3\2"+
			"\2\2\u00d7\u0369\3\2\2\2\u00d9\u036b\3\2\2\2\u00db\u036d\3\2\2\2\u00dd"+
			"\u0370\3\2\2\2\u00df\u0373\3\2\2\2\u00e1\u0376\3\2\2\2\u00e3\u0379\3\2"+
			"\2\2\u00e5\u037c\3\2\2\2\u00e7\u037f\3\2\2\2\u00e9\u0381\3\2\2\2\u00eb"+
			"\u0383\3\2\2\2\u00ed\u0385\3\2\2\2\u00ef\u0387\3\2\2\2\u00f1\u0389\3\2"+
			"\2\2\u00f3\u038b\3\2\2\2\u00f5\u038d\3\2\2\2\u00f7\u038f\3\2\2\2\u00f9"+
			"\u0391\3\2\2\2\u00fb\u0394\3\2\2\2\u00fd\u0397\3\2\2\2\u00ff\u039a\3\2"+
			"\2\2\u0101\u039d\3\2\2\2\u0103\u03a0\3\2\2\2\u0105\u03a3\3\2\2\2\u0107"+
			"\u03a6\3\2\2\2\u0109\u03a9\3\2\2\2\u010b\u03ad\3\2\2\2\u010d\u03b1\3\2"+
			"\2\2\u010f\u03b6\3\2\2\2\u0111\u03bd\3\2\2\2\u0113\u03c4\3\2\2\2\u0115"+
			"\u03ca\3\2\2\2\u0117\u03cd\3\2\2\2\u0119\u03d3\3\2\2\2\u011b\u03e1\3\2"+
			"\2\2\u011d\u011e\7f\2\2\u011e\u011f\7q\2\2\u011f\u0120\7w\2\2\u0120\u0121"+
			"\7d\2\2\u0121\u0122\7n\2\2\u0122\u0123\7g\2\2\u0123\4\3\2\2\2\u0124\u0125"+
			"\7\177\2\2\u0125\6\3\2\2\2\u0126\u0127\7d\2\2\u0127\u0128\7q\2\2\u0128"+
			"\u0129\7q\2\2\u0129\u012a\7n\2\2\u012a\u012b\7g\2\2\u012b\u012c\7c\2\2"+
			"\u012c\u012d\7p\2\2\u012d\b\3\2\2\2\u012e\u012f\7h\2\2\u012f\u0130\7n"+
			"\2\2\u0130\u0131\7q\2\2\u0131\u0132\7c\2\2\u0132\u0133\7v\2\2\u0133\n"+
			"\3\2\2\2\u0134\u0135\7e\2\2\u0135\u0136\7j\2\2\u0136\u0137\7c\2\2\u0137"+
			"\u0138\7t\2\2\u0138\f\3\2\2\2\u0139\u013a\7n\2\2\u013a\u013b\7q\2\2\u013b"+
			"\u013c\7p\2\2\u013c\u013d\7i\2\2\u013d\16\3\2\2\2\u013e\u013f\7u\2\2\u013f"+
			"\u0140\7j\2\2\u0140\u0141\7q\2\2\u0141\u0142\7t\2\2\u0142\u0143\7v\2\2"+
			"\u0143\20\3\2\2\2\u0144\u0145\7f\2\2\u0145\u0146\7g\2\2\u0146\u0147\7"+
			"h\2\2\u0147\u0148\7c\2\2\u0148\u0149\7w\2\2\u0149\u014a\7n\2\2\u014a\u014b"+
			"\7v\2\2\u014b\22\3\2\2\2\u014c\u014d\7k\2\2\u014d\u014e\7p\2\2\u014e\u014f"+
			"\7v\2\2\u014f\24\3\2\2\2\u0150\u0151\7x\2\2\u0151\u0152\7q\2\2\u0152\u0153"+
			"\7k\2\2\u0153\u0154\7f\2\2\u0154\26\3\2\2\2\u0155\u0156\7}\2\2\u0156\30"+
			"\3\2\2\2\u0157\u0158\7<\2\2\u0158\u0159\7g\2\2\u0159\u015a\7p\2\2\u015a"+
			"\u015b\7f\2\2\u015b\u015c\7\"\2\2\u015c\u015d\7r\2\2\u015d\u015e\7t\2"+
			"\2\u015e\u015f\7q\2\2\u015f\u0160\7i\2\2\u0160\u0161\7t\2\2\u0161\u0162"+
			"\7c\2\2\u0162\u0163\7o\2\2\u0163\u0164\7<\2\2\u0164\32\3\2\2\2\u0165\u0166"+
			"\7d\2\2\u0166\u0167\7{\2\2\u0167\u0168\7v\2\2\u0168\u0169\7g\2\2\u0169"+
			"\34\3\2\2\2\u016a\u016b\7t\2\2\u016b\u016c\7g\2\2\u016c\u016d\7v\2\2\u016d"+
			"\u016e\7w\2\2\u016e\u016f\7t\2\2\u016f\u0170\7p\2\2\u0170\36\3\2\2\2\u0171"+
			"\u0172\7(\2\2\u0172\u0173\7(\2\2\u0173 \3\2\2\2\u0174\u0175\7<\2\2\u0175"+
			"\u0176\7u\2\2\u0176\u0177\7v\2\2\u0177\u0178\7c\2\2\u0178\u0179\7t\2\2"+
			"\u0179\u017a\7v\2\2\u017a\u017b\7\"\2\2\u017b\u017c\7r\2\2\u017c\u017d"+
			"\7t\2\2\u017d\u017e\7q\2\2\u017e\u017f\7i\2\2\u017f\u0180\7t\2\2\u0180"+
			"\u0181\7c\2\2\u0181\u0182\7o\2\2\u0182\u0183\7<\2\2\u0183\"\3\2\2\2\u0184"+
			"\u0185\7<\2\2\u0185\u0186\7c\2\2\u0186\u0187\7n\2\2\u0187\u0188\7r\2\2"+
			"\u0188\u0189\7t\2\2\u0189\u018a\7q\2\2\u018a\u018b\7l\2\2\u018b\u018c"+
			"\7g\2\2\u018c\u018d\7e\2\2\u018d\u018e\7v\2\2\u018e\u018f\7<\2\2\u018f"+
			"$\3\2\2\2\u0190\u0191\7<\2\2\u0191\u0192\7x\2\2\u0192\u0193\7c\2\2\u0193"+
			"\u0194\7t\2\2\u0194\u0195\7k\2\2\u0195\u0196\7c\2\2\u0196\u0197\7d\2\2"+
			"\u0197\u0198\7n\2\2\u0198\u0199\7g\2\2\u0199\u019a\7u\2\2\u019a\u019b"+
			"\7<\2\2\u019b&\3\2\2\2\u019c\u019d\7<\2\2\u019d\u019e\7o\2\2\u019e\u019f"+
			"\7g\2\2\u019f\u01a0\7v\2\2\u01a0\u01a1\7j\2\2\u01a1\u01a2\7q\2\2\u01a2"+
			"\u01a3\7f\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5\7<\2\2\u01a5(\3\2\2\2\u01a6"+
			"\u01a7\7c\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9\7f\2\2\u01a9*\3\2\2\2\u01aa"+
			"\u01ab\7c\2\2\u01ab\u01ac\7t\2\2\u01ac\u01ad\7t\2\2\u01ad\u01ae\7c\2\2"+
			"\u01ae\u01af\7{\2\2\u01af,\3\2\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7u\2"+
			"\2\u01b2.\3\2\2\2\u01b3\u01b4\7d\2\2\u01b4\u01b5\7g\2\2\u01b5\u01b6\7"+
			"i\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7p\2\2\u01b8\60\3\2\2\2\u01b9\u01ba"+
			"\7d\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7c\2\2\u01bd"+
			"\u01be\7m\2\2\u01be\62\3\2\2\2\u01bf\u01c0\7e\2\2\u01c0\u01c1\7c\2\2\u01c1"+
			"\u01c2\7u\2\2\u01c2\u01c3\7g\2\2\u01c3\64\3\2\2\2\u01c4\u01c5\7e\2\2\u01c5"+
			"\u01c6\7c\2\2\u01c6\u01c7\7v\2\2\u01c7\u01c8\7e\2\2\u01c8\u01c9\7j\2\2"+
			"\u01c9\66\3\2\2\2\u01ca\u01cb\7e\2\2\u01cb\u01cc\7q\2\2\u01cc\u01cd\7"+
			"p\2\2\u01cd\u01ce\7u\2\2\u01ce\u01cf\7v\2\2\u01cf\u01d0\7c\2\2\u01d0\u01d1"+
			"\7p\2\2\u01d1\u01d2\7v\2\2\u01d2\u01d3\7n\2\2\u01d3\u01d4\7{\2\2\u01d4"+
			"8\3\2\2\2\u01d5\u01d6\7e\2\2\u01d6\u01d7\7q\2\2\u01d7\u01d8\7p\2\2\u01d8"+
			"\u01d9\7v\2\2\u01d9\u01da\7k\2\2\u01da\u01db\7p\2\2\u01db\u01dc\7w\2\2"+
			"\u01dc\u01dd\7g\2\2\u01dd:\3\2\2\2\u01de\u01df\7f\2\2\u01df\u01e0\7q\2"+
			"\2\u01e0<\3\2\2\2\u01e1\u01e2\7g\2\2\u01e2\u01e3\7n\2\2\u01e3\u01e4\7"+
			"u\2\2\u01e4\u01e5\7g\2\2\u01e5>\3\2\2\2\u01e6\u01e7\7g\2\2\u01e7\u01e8"+
			"\7p\2\2\u01e8\u01e9\7f\2\2\u01e9@\3\2\2\2\u01ea\u01eb\7g\2\2\u01eb\u01ec"+
			"\7z\2\2\u01ec\u01ed\7k\2\2\u01ed\u01ee\7v\2\2\u01eeB\3\2\2\2\u01ef\u01f0"+
			"\7h\2\2\u01f0\u01f1\7k\2\2\u01f1\u01f2\7n\2\2\u01f2\u01f3\7g\2\2\u01f3"+
			"D\3\2\2\2\u01f4\u01f5\7h\2\2\u01f5\u01f6\7k\2\2\u01f6\u01f7\7p\2\2\u01f7"+
			"\u01f8\7c\2\2\u01f8\u01f9\7n\2\2\u01f9\u01fa\7n\2\2\u01fa\u01fb\7{\2\2"+
			"\u01fbF\3\2\2\2\u01fc\u01fd\7h\2\2\u01fd\u01fe\7q\2\2\u01fe\u01ff\7t\2"+
			"\2\u01ffH\3\2\2\2\u0200\u0201\7h\2\2\u0201\u0202\7w\2\2\u0202\u0203\7"+
			"p\2\2\u0203\u0204\7e\2\2\u0204\u0205\7v\2\2\u0205\u0206\7k\2\2\u0206\u0207"+
			"\7q\2\2\u0207\u0208\7p\2\2\u0208J\3\2\2\2\u0209\u020a\7k\2\2\u020a\u020b"+
			"\7h\2\2\u020bL\3\2\2\2\u020c\u020d\7k\2\2\u020d\u020e\7p\2\2\u020eN\3"+
			"\2\2\2\u020f\u0210\7k\2\2\u0210\u0211\7u\2\2\u0211P\3\2\2\2\u0212\u0213"+
			"\7n\2\2\u0213\u0214\7g\2\2\u0214\u0215\7v\2\2\u0215R\3\2\2\2\u0216\u0217"+
			"\7~\2\2\u0217\u0218\7~\2\2\u0218T\3\2\2\2\u0219\u021a\7r\2\2\u021a\u021b"+
			"\7t\2\2\u021b\u021c\7q\2\2\u021c\u021d\7i\2\2\u021d\u021e\7t\2\2\u021e"+
			"\u021f\7c\2\2\u021f\u0220\7o\2\2\u0220V\3\2\2\2\u0221\u0222\7u\2\2\u0222"+
			"\u0223\7g\2\2\u0223\u0224\7v\2\2\u0224X\3\2\2\2\u0225\u0226\7u\2\2\u0226"+
			"\u0227\7y\2\2\u0227\u0228\7k\2\2\u0228\u0229\7v\2\2\u0229\u022a\7e\2\2"+
			"\u022a\u022b\7j\2\2\u022bZ\3\2\2\2\u022c\u022d\7v\2\2\u022d\u022e\7j\2"+
			"\2\u022e\u022f\7k\2\2\u022f\u0230\7u\2\2\u0230\\\3\2\2\2\u0231\u0232\7"+
			"v\2\2\u0232\u0233\7t\2\2\u0233\u0234\7{\2\2\u0234^\3\2\2\2\u0235\u0236"+
			"\7w\2\2\u0236\u0237\7p\2\2\u0237\u0238\7k\2\2\u0238\u0239\7o\2\2\u0239"+
			"\u023a\7r\2\2\u023a\u023b\7n\2\2\u023b\u023c\7g\2\2\u023c\u023d\7o\2\2"+
			"\u023d\u023e\7g\2\2\u023e\u023f\7p\2\2\u023f\u0240\7v\2\2\u0240\u0241"+
			"\7g\2\2\u0241\u0242\7f\2\2\u0242`\3\2\2\2\u0243\u0244\7y\2\2\u0244\u0245"+
			"\7j\2\2\u0245\u0246\7k\2\2\u0246\u0247\7n\2\2\u0247\u0248\7g\2\2\u0248"+
			"b\3\2\2\2\u0249\u024e\5e\63\2\u024a\u024e\5g\64\2\u024b\u024e\5i\65\2"+
			"\u024c\u024e\5k\66\2\u024d\u0249\3\2\2\2\u024d\u024a\3\2\2\2\u024d\u024b"+
			"\3\2\2\2\u024d\u024c\3\2\2\2\u024ed\3\2\2\2\u024f\u0251\5o8\2\u0250\u0252"+
			"\5m\67\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252f\3\2\2\2\u0253"+
			"\u0255\5{>\2\u0254\u0256\5m\67\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2"+
			"\2\u0256h\3\2\2\2\u0257\u0259\5\u0083B\2\u0258\u025a\5m\67\2\u0259\u0258"+
			"\3\2\2\2\u0259\u025a\3\2\2\2\u025aj\3\2\2\2\u025b\u025d\5\u008bF\2\u025c"+
			"\u025e\5m\67\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025el\3\2\2\2"+
			"\u025f\u0260\t\2\2\2\u0260n\3\2\2\2\u0261\u026c\7\62\2\2\u0262\u0269\5"+
			"u;\2\u0263\u0265\5q9\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u026a"+
			"\3\2\2\2\u0266\u0267\5y=\2\u0267\u0268\5q9\2\u0268\u026a\3\2\2\2\u0269"+
			"\u0264\3\2\2\2\u0269\u0266\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u0261\3\2"+
			"\2\2\u026b\u0262\3\2\2\2\u026cp\3\2\2\2\u026d\u0275\5s:\2\u026e\u0270"+
			"\5w<\2\u026f\u026e\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271"+
			"\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0276\5s"+
			":\2\u0275\u0271\3\2\2\2\u0275\u0276\3\2\2\2\u0276r\3\2\2\2\u0277\u027a"+
			"\7\62\2\2\u0278\u027a\5u;\2\u0279\u0277\3\2\2\2\u0279\u0278\3\2\2\2\u027a"+
			"t\3\2\2\2\u027b\u027c\t\3\2\2\u027cv\3\2\2\2\u027d\u0280\5s:\2\u027e\u0280"+
			"\7a\2\2\u027f\u027d\3\2\2\2\u027f\u027e\3\2\2\2\u0280x\3\2\2\2\u0281\u0283"+
			"\7a\2\2\u0282\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0282\3\2\2\2\u0284"+
			"\u0285\3\2\2\2\u0285z\3\2\2\2\u0286\u0287\7\62\2\2\u0287\u0288\t\4\2\2"+
			"\u0288\u0289\5}?\2\u0289|\3\2\2\2\u028a\u0292\5\177@\2\u028b\u028d\5\u0081"+
			"A\2\u028c\u028b\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e"+
			"\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0293\5\177"+
			"@\2\u0292\u028e\3\2\2\2\u0292\u0293\3\2\2\2\u0293~\3\2\2\2\u0294\u0295"+
			"\t\5\2\2\u0295\u0080\3\2\2\2\u0296\u0299\5\177@\2\u0297\u0299\7a\2\2\u0298"+
			"\u0296\3\2\2\2\u0298\u0297\3\2\2\2\u0299\u0082\3\2\2\2\u029a\u029c\7\62"+
			"\2\2\u029b\u029d\5y=\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e"+
			"\3\2\2\2\u029e\u029f\5\u0085C\2\u029f\u0084\3\2\2\2\u02a0\u02a8\5\u0087"+
			"D\2\u02a1\u02a3\5\u0089E\2\u02a2\u02a1\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4"+
			"\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\3\2\2\2\u02a6\u02a4\3\2"+
			"\2\2\u02a7\u02a9\5\u0087D\2\u02a8\u02a4\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
			"\u0086\3\2\2\2\u02aa\u02ab\t\6\2\2\u02ab\u0088\3\2\2\2\u02ac\u02af\5\u0087"+
			"D\2\u02ad\u02af\7a\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2\u02af\u008a"+
			"\3\2\2\2\u02b0\u02b1\7\62\2\2\u02b1\u02b2\t\7\2\2\u02b2\u02b3\5\u008d"+
			"G\2\u02b3\u008c\3\2\2\2\u02b4\u02bc\5\u008fH\2\u02b5\u02b7\5\u0091I\2"+
			"\u02b6\u02b5\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9"+
			"\3\2\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bd\5\u008fH"+
			"\2\u02bc\u02b8\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u008e\3\2\2\2\u02be\u02bf"+
			"\t\b\2\2\u02bf\u0090\3\2\2\2\u02c0\u02c3\5\u008fH\2\u02c1\u02c3\7a\2\2"+
			"\u02c2\u02c0\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3\u0092\3\2\2\2\u02c4\u02c7"+
			"\5\u0095K\2\u02c5\u02c7\5\u00a1Q\2\u02c6\u02c4\3\2\2\2\u02c6\u02c5\3\2"+
			"\2\2\u02c7\u0094\3\2\2\2\u02c8\u02c9\5q9\2\u02c9\u02cb\7\60\2\2\u02ca"+
			"\u02cc\5q9\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\3\2\2"+
			"\2\u02cd\u02cf\5\u0097L\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
			"\u02d1\3\2\2\2\u02d0\u02d2\5\u009fP\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2"+
			"\3\2\2\2\u02d2\u02e4\3\2\2\2\u02d3\u02d4\7\60\2\2\u02d4\u02d6\5q9\2\u02d5"+
			"\u02d7\5\u0097L\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d9"+
			"\3\2\2\2\u02d8\u02da\5\u009fP\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2"+
			"\2\u02da\u02e4\3\2\2\2\u02db\u02dc\5q9\2\u02dc\u02de\5\u0097L\2\u02dd"+
			"\u02df\5\u009fP\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e4"+
			"\3\2\2\2\u02e0\u02e1\5q9\2\u02e1\u02e2\5\u009fP\2\u02e2\u02e4\3\2\2\2"+
			"\u02e3\u02c8\3\2\2\2\u02e3\u02d3\3\2\2\2\u02e3\u02db\3\2\2\2\u02e3\u02e0"+
			"\3\2\2\2\u02e4\u0096\3\2\2\2\u02e5\u02e6\5\u0099M\2\u02e6\u02e7\5\u009b"+
			"N\2\u02e7\u0098\3\2\2\2\u02e8\u02e9\t\t\2\2\u02e9\u009a\3\2\2\2\u02ea"+
			"\u02ec\5\u009dO\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed"+
			"\3\2\2\2\u02ed\u02ee\5q9\2\u02ee\u009c\3\2\2\2\u02ef\u02f0\t\n\2\2\u02f0"+
			"\u009e\3\2\2\2\u02f1\u02f2\t\13\2\2\u02f2\u00a0\3\2\2\2\u02f3\u02f4\5"+
			"\u00a3R\2\u02f4\u02f6\5\u00a5S\2\u02f5\u02f7\5\u009fP\2\u02f6\u02f5\3"+
			"\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u00a2\3\2\2\2\u02f8\u02fa\5{>\2\u02f9"+
			"\u02fb\7\60\2\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u0304\3"+
			"\2\2\2\u02fc\u02fd\7\62\2\2\u02fd\u02ff\t\4\2\2\u02fe\u0300\5}?\2\u02ff"+
			"\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\7\60"+
			"\2\2\u0302\u0304\5}?\2\u0303\u02f8\3\2\2\2\u0303\u02fc\3\2\2\2\u0304\u00a4"+
			"\3\2\2\2\u0305\u0306\5\u00a7T\2\u0306\u0307\5\u009bN\2\u0307\u00a6\3\2"+
			"\2\2\u0308\u0309\t\f\2\2\u0309\u00a8\3\2\2\2\u030a\u030b\7v\2\2\u030b"+
			"\u030c\7t\2\2\u030c\u030d\7w\2\2\u030d\u0314\7g\2\2\u030e\u030f\7h\2\2"+
			"\u030f\u0310\7c\2\2\u0310\u0311\7n\2\2\u0311\u0312\7u\2\2\u0312\u0314"+
			"\7g\2\2\u0313\u030a\3\2\2\2\u0313\u030e\3\2\2\2\u0314\u00aa\3\2\2\2\u0315"+
			"\u0316\7)\2\2\u0316\u0317\5\u00adW\2\u0317\u0318\7)\2\2\u0318\u031e\3"+
			"\2\2\2\u0319\u031a\7)\2\2\u031a\u031b\5\u00b5[\2\u031b\u031c\7)\2\2\u031c"+
			"\u031e\3\2\2\2\u031d\u0315\3\2\2\2\u031d\u0319\3\2\2\2\u031e\u00ac\3\2"+
			"\2\2\u031f\u0320\n\r\2\2\u0320\u00ae\3\2\2\2\u0321\u0323\7$\2\2\u0322"+
			"\u0324\5\u00b1Y\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325"+
			"\3\2\2\2\u0325\u0326\7$\2\2\u0326\u00b0\3\2\2\2\u0327\u0329\5\u00b3Z\2"+
			"\u0328\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b"+
			"\3\2\2\2\u032b\u00b2\3\2\2\2\u032c\u032f\n\16\2\2\u032d\u032f\5\u00b5"+
			"[\2\u032e\u032c\3\2\2\2\u032e\u032d\3\2\2\2\u032f\u00b4\3\2\2\2\u0330"+
			"\u0331\7^\2\2\u0331\u0335\t\17\2\2\u0332\u0335\5\u00b7\\\2\u0333\u0335"+
			"\5\u00b9]\2\u0334\u0330\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0333\3\2\2"+
			"\2\u0335\u00b6\3\2\2\2\u0336\u0337\7^\2\2\u0337\u0342\5\u0087D\2\u0338"+
			"\u0339\7^\2\2\u0339\u033a\5\u0087D\2\u033a\u033b\5\u0087D\2\u033b\u0342"+
			"\3\2\2\2\u033c\u033d\7^\2\2\u033d\u033e\5\u00bb^\2\u033e\u033f\5\u0087"+
			"D\2\u033f\u0340\5\u0087D\2\u0340\u0342\3\2\2\2\u0341\u0336\3\2\2\2\u0341"+
			"\u0338\3\2\2\2\u0341\u033c\3\2\2\2\u0342\u00b8\3\2\2\2\u0343\u0344\7^"+
			"\2\2\u0344\u0345\7w\2\2\u0345\u0346\5\177@\2\u0346\u0347\5\177@\2\u0347"+
			"\u0348\5\177@\2\u0348\u0349\5\177@\2\u0349\u00ba\3\2\2\2\u034a\u034b\t"+
			"\20\2\2\u034b\u00bc\3\2\2\2\u034c\u034d\7p\2\2\u034d\u034e\7w\2\2\u034e"+
			"\u034f\7n\2\2\u034f\u0350\7n\2\2\u0350\u00be\3\2\2\2\u0351\u0352\7*\2"+
			"\2\u0352\u00c0\3\2\2\2\u0353\u0354\7+\2\2\u0354\u00c2\3\2\2\2\u0355\u0356"+
			"\7]\2\2\u0356\u00c4\3\2\2\2\u0357\u0358\7_\2\2\u0358\u00c6\3\2\2\2\u0359"+
			"\u035a\7=\2\2\u035a\u00c8\3\2\2\2\u035b\u035c\7.\2\2\u035c\u00ca\3\2\2"+
			"\2\u035d\u035e\7\60\2\2\u035e\u00cc\3\2\2\2\u035f\u0360\7?\2\2\u0360\u00ce"+
			"\3\2\2\2\u0361\u0362\7@\2\2\u0362\u00d0\3\2\2\2\u0363\u0364\7>\2\2\u0364"+
			"\u00d2\3\2\2\2\u0365\u0366\7#\2\2\u0366\u00d4\3\2\2\2\u0367\u0368\7\u0080"+
			"\2\2\u0368\u00d6\3\2\2\2\u0369\u036a\7A\2\2\u036a\u00d8\3\2\2\2\u036b"+
			"\u036c\7<\2\2\u036c\u00da\3\2\2\2\u036d\u036e\7?\2\2\u036e\u036f\7?\2"+
			"\2\u036f\u00dc\3\2\2\2\u0370\u0371\7>\2\2\u0371\u0372\7?\2\2\u0372\u00de"+
			"\3\2\2\2\u0373\u0374\7@\2\2\u0374\u0375\7?\2\2\u0375\u00e0\3\2\2\2\u0376"+
			"\u0377\7#\2\2\u0377\u0378\7?\2\2\u0378\u00e2\3\2\2\2\u0379\u037a\7-\2"+
			"\2\u037a\u037b\7-\2\2\u037b\u00e4\3\2\2\2\u037c\u037d\7/\2\2\u037d\u037e"+
			"\7/\2\2\u037e\u00e6\3\2\2\2\u037f\u0380\7-\2\2\u0380\u00e8\3\2\2\2\u0381"+
			"\u0382\7/\2\2\u0382\u00ea\3\2\2\2\u0383\u0384\7,\2\2\u0384\u00ec\3\2\2"+
			"\2\u0385\u0386\7\61\2\2\u0386\u00ee\3\2\2\2\u0387\u0388\7(\2\2\u0388\u00f0"+
			"\3\2\2\2\u0389\u038a\7~\2\2\u038a\u00f2\3\2\2\2\u038b\u038c\7`\2\2\u038c"+
			"\u00f4\3\2\2\2\u038d\u038e\7\'\2\2\u038e\u00f6\3\2\2\2\u038f\u0390\7$"+
			"\2\2\u0390\u00f8\3\2\2\2\u0391\u0392\7-\2\2\u0392\u0393\7?\2\2\u0393\u00fa"+
			"\3\2\2\2\u0394\u0395\7/\2\2\u0395\u0396\7?\2\2\u0396\u00fc\3\2\2\2\u0397"+
			"\u0398\7,\2\2\u0398\u0399\7?\2\2\u0399\u00fe\3\2\2\2\u039a\u039b\7\61"+
			"\2\2\u039b\u039c\7?\2\2\u039c\u0100\3\2\2\2\u039d\u039e\7(\2\2\u039e\u039f"+
			"\7?\2\2\u039f\u0102\3\2\2\2\u03a0\u03a1\7~\2\2\u03a1\u03a2\7?\2\2\u03a2"+
			"\u0104\3\2\2\2\u03a3\u03a4\7`\2\2\u03a4\u03a5\7?\2\2\u03a5\u0106\3\2\2"+
			"\2\u03a6\u03a7\7\'\2\2\u03a7\u03a8\7?\2\2\u03a8\u0108\3\2\2\2\u03a9\u03aa"+
			"\7>\2\2\u03aa\u03ab\7>\2\2\u03ab\u03ac\7?\2\2\u03ac\u010a\3\2\2\2\u03ad"+
			"\u03ae\7@\2\2\u03ae\u03af\7@\2\2\u03af\u03b0\7?\2\2\u03b0\u010c\3\2\2"+
			"\2\u03b1\u03b2\7@\2\2\u03b2\u03b3\7@\2\2\u03b3\u03b4\7@\2\2\u03b4\u03b5"+
			"\7?\2\2\u03b5\u010e\3\2\2\2\u03b6\u03ba\5\u0113\u008a\2\u03b7\u03b9\5"+
			"\u0115\u008b\2\u03b8\u03b7\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2"+
			"\2\2\u03ba\u03bb\3\2\2\2\u03bb\u0110\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd"+
			"\u03be\7%\2\2\u03be\u03bf\5\u010f\u0088\2\u03bf\u0112\3\2\2\2\u03c0\u03c5"+
			"\t\21\2\2\u03c1\u03c5\n\22\2\2\u03c2\u03c3\t\23\2\2\u03c3\u03c5\t\24\2"+
			"\2\u03c4\u03c0\3\2\2\2\u03c4\u03c1\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5\u0114"+
			"\3\2\2\2\u03c6\u03cb\t\25\2\2\u03c7\u03cb\n\22\2\2\u03c8\u03c9\t\23\2"+
			"\2\u03c9\u03cb\t\24\2\2\u03ca\u03c6\3\2\2\2\u03ca\u03c7\3\2\2\2\u03ca"+
			"\u03c8\3\2\2\2\u03cb\u0116\3\2\2\2\u03cc\u03ce\t\26\2\2\u03cd\u03cc\3"+
			"\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0"+
			"\u03d1\3\2\2\2\u03d1\u03d2\b\u008c\2\2\u03d2\u0118\3\2\2\2\u03d3\u03d4"+
			"\7\61\2\2\u03d4\u03d5\7,\2\2\u03d5\u03d9\3\2\2\2\u03d6\u03d8\13\2\2\2"+
			"\u03d7\u03d6\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9\u03da\3\2\2\2\u03d9\u03d7"+
			"\3\2\2\2\u03da\u03dc\3\2\2\2\u03db\u03d9\3\2\2\2\u03dc\u03dd\7,\2\2\u03dd"+
			"\u03de\7\61\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\b\u008d\3\2\u03e0\u011a"+
			"\3\2\2\2\u03e1\u03e2\7\61\2\2\u03e2\u03e3\7\61\2\2\u03e3\u03e7\3\2\2\2"+
			"\u03e4\u03e6\n\27\2\2\u03e5\u03e4\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5"+
			"\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea"+
			"\u03eb\b\u008e\4\2\u03eb\u011c\3\2\2\2\64\2\u024d\u0251\u0255\u0259\u025d"+
			"\u0264\u0269\u026b\u0271\u0275\u0279\u027f\u0284\u028e\u0292\u0298\u029c"+
			"\u02a4\u02a8\u02ae\u02b8\u02bc\u02c2\u02c6\u02cb\u02ce\u02d1\u02d6\u02d9"+
			"\u02de\u02e3\u02eb\u02f6\u02fa\u02ff\u0303\u0313\u031d\u0323\u032a\u032e"+
			"\u0334\u0341\u03ba\u03c4\u03ca\u03cf\u03d9\u03e7";
		
		public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN.toCharArray());
		
		static {
			
			_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
			
			for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
				_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
			}
		}

}
