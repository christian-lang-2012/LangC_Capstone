package main;

import java.util.List;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class AL_Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int ALPROJECT = 1, BEGIN = 2, BEGINPROGRAM = 3,
			BOOLEAN = 4, BREAK = 5, BYTE = 6, CASE = 7, CHAR = 8,
			CONSTANTLY = 9, CONTINUE = 10, DEFAULT = 11, DO = 12, DOUBLE = 13,
			ELSE = 14, END = 15, ENDPROGRAM = 16, FLOAT = 17, FOR = 18,
			FUNCTION = 19, IF = 20, INT = 21, LET = 22, LONG = 23,
			METHODHEADER = 24, PROGRAM = 25, RETURN = 26, SHORT = 27,
			STRING = 28, SWITCH = 29, THIS = 30, VARIABLEHEADER = 31,
			VOID = 32, WHILE = 33, LPAREN = 34, RPAREN = 35, LCURLY = 36,
			RCURLY = 37, LBRACK = 38, RBRACK = 39, SEMI = 40, COMMA = 41,
			DOT = 42, ELLIPSES = 43, ASSIGN = 44, GT = 45, LT = 46, BANG = 47,
			TILDE = 48, QUESTION = 49, COLON = 50, EQUAL = 51, LE = 52,
			GE = 53, NOTEQUAL = 54, INC = 55, DEC = 56, ADD = 57, SUB = 58,
			MUL = 59, DIV = 60, BITAND = 61, BITOR = 62, CARET = 63, MOD = 64,
			QUOTE = 65, HASHTAG = 66, OR = 67, AND = 68, ADD_ASSIGN = 69,
			SUB_ASSIGN = 70, MUL_ASSIGN = 71, DIV_ASSIGN = 72, AND_ASSIGN = 73,
			OR_ASSIGN = 74, XOR_ASSIGN = 75, MOD_ASSIGN = 76,
			LSHIFT_ASSIGN = 77, RSHIFT_ASSIGN = 78, URSHIFT_ASSIGN = 79,
			IntegerLiteral = 80, FloatingPointLiteral = 81,
			BooleanLiteral = 82, CharacterLiteral = 83, StringLiteral = 84,
			NullLiteral = 85, Identifier = 86, Letter = 87, LetterOrDigit = 88,
			WS = 89;
	public static final String[] tokenNames = { "<INVALID>", "ALPROJECT",
			"'begin'", "':begin program:'", "'boolean'", "'break'", "'byte'",
			"'case'", "'char'", "'constantly'", "'continue'", "'default'",
			"'do'", "'double'", "'else'", "'end'", "':end program:'",
			"'float'", "'for'", "'function'", "'if'", "'int'", "'let'",
			"'long'", "METHODHEADER", "'program'", "'return'", "'short'",
			"'string'", "'switch'", "'this'", "VARIABLEHEADER", "'void'",
			"'while'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','",
			"'.'", "'...'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'",
			"'=='", "'<='", "'>='", "'!='", "'++'", "'--'", "'+'", "'-'",
			"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'\"'", "'#'", "'||'",
			"'&&'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='",
			"'%='", "'<<='", "'>>='", "'>>>='", "IntegerLiteral",
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral",
			"StringLiteral", "'null'", "Identifier", "Letter", "LetterOrDigit",
			"WS" };
	public static final int RULE_program = 0, RULE_programHeader = 1,
			RULE_variableHeader = 2, RULE_methodHeader = 3,
			RULE_mainProgram = 4, RULE_constantlyDeclaration = 5,
			RULE_variableDeclarators = 6, RULE_variableDeclarator = 7,
			RULE_variableDeclaratorId = 8, RULE_variableInitializer = 9,
			RULE_arrayInitializer = 10, RULE_variableIdentifier = 11,
			RULE_expression = 12, RULE_expressionList = 13, RULE_primary = 14,
			RULE_methodCall = 15, RULE_arguments = 16, RULE_literal = 17,
			RULE_type = 18, RULE_primitiveType = 19,
			RULE_methodDeclaration = 20, RULE_methodBody = 21, RULE_block = 22,
			RULE_blockStatement = 23,
			RULE_localVariableDeclarationStatement = 24,
			RULE_localVariableDeclaration = 25, RULE_formalParameters = 26,
			RULE_formalParameterList = 27, RULE_formalParameter = 28,
			RULE_lastFormalParameter = 29, RULE_statement = 30,
			RULE_parExpression = 31, RULE_forControl = 32, RULE_forInit = 33,
			RULE_enhancedForControl = 34, RULE_forUpdate = 35,
			RULE_switchBlockStatementGroup = 36, RULE_switchLabel = 37,
			RULE_constantExpression = 38, RULE_statementExpression = 39;
	public static final String[] ruleNames = { "program", "programHeader",
			"variableHeader", "methodHeader", "mainProgram",
			"constantlyDeclaration", "variableDeclarators",
			"variableDeclarator", "variableDeclaratorId",
			"variableInitializer", "arrayInitializer", "variableIdentifier",
			"expression", "expressionList", "primary", "methodCall",
			"arguments", "literal", "type", "primitiveType",
			"methodDeclaration", "methodBody", "block", "blockStatement",
			"localVariableDeclarationStatement", "localVariableDeclaration",
			"formalParameters", "formalParameterList", "formalParameter",
			"lastFormalParameter", "statement", "parExpression", "forControl",
			"forInit", "enhancedForControl", "forUpdate",
			"switchBlockStatementGroup", "switchLabel", "constantExpression",
			"statementExpression" };

	@Override
	public String getGrammarFileName() {
		return "ALCombinedGrammar.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public AL_Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class, 0);
		}

		public List<VariableDeclaratorsContext> variableDeclarators() {
			return getRuleContexts(VariableDeclaratorsContext.class);
		}

		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class, i);
		}

		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}

		public VariableDeclaratorsContext variableDeclarators(int i) {
			return getRuleContext(VariableDeclaratorsContext.class, i);
		}

		public VariableHeaderContext variableHeader() {
			return getRuleContext(VariableHeaderContext.class, 0);
		}

		public MainProgramContext mainProgram() {
			return getRuleContext(MainProgramContext.class, 0);
		}

		public ProgramHeaderContext programHeader() {
			return getRuleContext(ProgramHeaderContext.class, 0);
		}

		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_program;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterProgram(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitProgram(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitProgram(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(80);
				programHeader();
				setState(81);
				variableHeader();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LET) {
					{
						{
							setState(82);
							variableDeclarators();
						}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				methodHeader();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == FUNCTION) {
					{
						{
							setState(89);
							methodDeclaration();
						}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				mainProgram();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramHeaderContext extends ParserRuleContext {
		public TerminalNode ALPROJECT() {
			return getToken(AL_Parser.ALPROJECT, 0);
		}

		public ProgramHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_programHeader;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterProgramHeader(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitProgramHeader(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitProgramHeader(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ProgramHeaderContext programHeader()
			throws RecognitionException {
		ProgramHeaderContext _localctx = new ProgramHeaderContext(_ctx,
				getState());
		enterRule(_localctx, 2, RULE_programHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(97);
				match(ALPROJECT);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableHeaderContext extends ParserRuleContext {
		public TerminalNode VARIABLEHEADER() {
			return getToken(AL_Parser.VARIABLEHEADER, 0);
		}

		public VariableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableHeader;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterVariableHeader(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitVariableHeader(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitVariableHeader(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final VariableHeaderContext variableHeader()
			throws RecognitionException {
		VariableHeaderContext _localctx = new VariableHeaderContext(_ctx,
				getState());
		enterRule(_localctx, 4, RULE_variableHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(99);
				match(VARIABLEHEADER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public TerminalNode METHODHEADER() {
			return getToken(AL_Parser.METHODHEADER, 0);
		}

		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodHeader;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterMethodHeader(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitMethodHeader(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitMethodHeader(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx,
				getState());
		enterRule(_localctx, 6, RULE_methodHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(101);
				match(METHODHEADER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainProgramContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}

		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class, i);
		}

		public MainProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_mainProgram;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterMainProgram(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitMainProgram(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitMainProgram(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final MainProgramContext mainProgram() throws RecognitionException {
		MainProgramContext _localctx = new MainProgramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(103);
				match(BEGINPROGRAM);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN)
						| (1L << BREAK) | (1L << CONTINUE) | (1L << DO)
						| (1L << FOR) | (1L << IF) | (1L << LET)
						| (1L << RETURN) | (1L << SWITCH) | (1L << WHILE)
						| (1L << LPAREN) | (1L << SEMI) | (1L << BANG)
						| (1L << TILDE) | (1L << INC) | (1L << DEC)
						| (1L << ADD) | (1L << SUB))) != 0)
						|| ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (HASHTAG - 66))
								| (1L << (IntegerLiteral - 66))
								| (1L << (FloatingPointLiteral - 66))
								| (1L << (BooleanLiteral - 66))
								| (1L << (CharacterLiteral - 66))
								| (1L << (StringLiteral - 66))
								| (1L << (NullLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
						{
							setState(104);
							blockStatement();
						}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(ENDPROGRAM);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantlyDeclarationContext extends ParserRuleContext {
		public ConstantlyDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constantlyDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterConstantlyDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitConstantlyDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitConstantlyDeclaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ConstantlyDeclarationContext constantlyDeclaration()
			throws RecognitionException {
		ConstantlyDeclarationContext _localctx = new ConstantlyDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 10, RULE_constantlyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(112);
				match(CONSTANTLY);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class, i);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}

		public VariableDeclaratorsContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclarators;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterVariableDeclarators(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitVariableDeclarators(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitVariableDeclarators(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators()
			throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(
				_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(114);
				match(LET);
				setState(115);
				primitiveType();
				setState(116);
				variableDeclarator();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(117);
							match(COMMA);
							setState(118);
							variableDeclarator();
						}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public ConstantlyDeclarationContext constantlyDeclaration() {
			return getRuleContext(ConstantlyDeclarationContext.class, 0);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class, 0);
		}

		public VariableDeclaratorContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclarator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterVariableDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitVariableDeclarator(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitVariableDeclarator(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator()
			throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(
				_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(126);
				variableDeclaratorId();
				setState(128);
				_la = _input.LA(1);
				if (_la == CONSTANTLY) {
					{
						setState(127);
						constantlyDeclaration();
					}
				}

				setState(132);
				_la = _input.LA(1);
				if (_la == ASSIGN) {
					{
						setState(130);
						match(ASSIGN);
						setState(131);
						variableInitializer();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class, 0);
		}

		public VariableDeclaratorIdContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclaratorId;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterVariableDeclaratorId(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitVariableDeclaratorId(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitVariableDeclaratorId(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId()
			throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(
				_ctx, getState());
		enterRule(_localctx, 16, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(134);
				variableIdentifier();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LBRACK) {
					{
						{
							setState(135);
							match(LBRACK);
							setState(136);
							match(RBRACK);
						}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class, 0);
		}

		public VariableInitializerContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterVariableInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitVariableInitializer(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitVariableInitializer(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer()
			throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(
				_ctx, getState());
		enterRule(_localctx, 18, RULE_variableInitializer);
		try {
			setState(144);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
					setState(142);
					arrayInitializer();
				}
				break;
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case HASHTAG:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
					setState(143);
					expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class, i);
		}

		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}

		public ArrayInitializerContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterArrayInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitArrayInitializer(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitArrayInitializer(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer()
			throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx,
				getState());
		enterRule(_localctx, 20, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(146);
				match(LCURLY);
				setState(158);
				_la = _input.LA(1);
				if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (LPAREN - 34))
						| (1L << (LCURLY - 34))
						| (1L << (BANG - 34))
						| (1L << (TILDE - 34))
						| (1L << (INC - 34))
						| (1L << (DEC - 34))
						| (1L << (ADD - 34))
						| (1L << (SUB - 34))
						| (1L << (HASHTAG - 34))
						| (1L << (IntegerLiteral - 34))
						| (1L << (FloatingPointLiteral - 34))
						| (1L << (BooleanLiteral - 34))
						| (1L << (CharacterLiteral - 34))
						| (1L << (StringLiteral - 34))
						| (1L << (NullLiteral - 34)) | (1L << (Identifier - 34)))) != 0)) {
					{
						setState(147);
						variableInitializer();
						setState(152);
						_errHandler.sync(this);
						_alt = getInterpreter()
								.adaptivePredict(_input, 8, _ctx);
						while (_alt != 2 && _alt != -1) {
							if (_alt == 1) {
								{
									{
										setState(148);
										match(COMMA);
										setState(149);
										variableInitializer();
									}
								}
							}
							setState(154);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 8,
									_ctx);
						}
						setState(156);
						_la = _input.LA(1);
						if (_la == COMMA) {
							{
								setState(155);
								match(COMMA);
							}
						}

					}
				}

				setState(160);
				match(RCURLY);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(AL_Parser.Identifier, 0);
		}

		public VariableIdentifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableIdentifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterVariableIdentifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitVariableIdentifier(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitVariableIdentifier(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final VariableIdentifierContext variableIdentifier()
			throws RecognitionException {
		VariableIdentifierContext _localctx = new VariableIdentifierContext(
				_ctx, getState());
		enterRule(_localctx, 22, RULE_variableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(162);
				match(HASHTAG);
				setState(163);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(AL_Parser.Identifier, 0);
		}

		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionContext(ParserRuleContext parent, int invokingState,
				int _p) {
			super(parent, invokingState);
			this._p = _p;
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitExpression(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitExpression(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState,
				_p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(176);
				switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
				case 1: {
					setState(166);
					match(LPAREN);
					setState(167);
					type();
					setState(168);
					match(RPAREN);
					setState(169);
					expression(16);
				}
					break;

				case 2: {
					setState(171);
					_la = _input.LA(1);
					if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC)
							| (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0))) {
						_errHandler.recoverInline(this);
					}
					consume();
					setState(172);
					expression(14);
				}
					break;

				case 3: {
					setState(173);
					_la = _input.LA(1);
					if (!(_la == BANG || _la == TILDE)) {
						_errHandler.recoverInline(this);
					}
					consume();
					setState(174);
					expression(13);
				}
					break;

				case 4: {
					setState(175);
					primary();
				}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
				while (_alt != 2 && _alt != -1) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(257);
							switch (getInterpreter().adaptivePredict(_input,
									15, _ctx)) {
							case 1: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(178);
								if (!(12 >= _localctx._p))
									throw new FailedPredicateException(this,
											"12 >= $_p");
								setState(179);
								_la = _input.LA(1);
								if (!(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (MUL - 59))
										| (1L << (DIV - 59)) | (1L << (MOD - 59)))) != 0))) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(180);
								expression(13);
							}
								break;

							case 2: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(181);
								if (!(11 >= _localctx._p))
									throw new FailedPredicateException(this,
											"11 >= $_p");
								setState(182);
								_la = _input.LA(1);
								if (!(_la == ADD || _la == SUB)) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(183);
								expression(12);
							}
								break;

							case 3: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(184);
								if (!(10 >= _localctx._p))
									throw new FailedPredicateException(this,
											"10 >= $_p");
								setState(192);
								switch (getInterpreter().adaptivePredict(
										_input, 12, _ctx)) {
								case 1: {
									setState(185);
									match(LT);
									setState(186);
									match(LT);
								}
									break;

								case 2: {
									setState(187);
									match(GT);
									setState(188);
									match(GT);
									setState(189);
									match(GT);
								}
									break;

								case 3: {
									setState(190);
									match(GT);
									setState(191);
									match(GT);
								}
									break;
								}
								setState(194);
								expression(11);
							}
								break;

							case 4: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(195);
								if (!(9 >= _localctx._p))
									throw new FailedPredicateException(this,
											"9 >= $_p");
								setState(196);
								_la = _input.LA(1);
								if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT)
										| (1L << LT) | (1L << LE) | (1L << GE))) != 0))) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(197);
								expression(10);
							}
								break;

							case 5: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(198);
								if (!(8 >= _localctx._p))
									throw new FailedPredicateException(this,
											"8 >= $_p");
								setState(199);
								_la = _input.LA(1);
								if (!(_la == EQUAL || _la == NOTEQUAL)) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(200);
								expression(9);
							}
								break;

							case 6: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(201);
								if (!(7 >= _localctx._p))
									throw new FailedPredicateException(this,
											"7 >= $_p");
								setState(202);
								match(BITAND);
								setState(203);
								expression(8);
							}
								break;

							case 7: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(204);
								if (!(6 >= _localctx._p))
									throw new FailedPredicateException(this,
											"6 >= $_p");
								setState(205);
								match(CARET);
								setState(206);
								expression(7);
							}
								break;

							case 8: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(207);
								if (!(5 >= _localctx._p))
									throw new FailedPredicateException(this,
											"5 >= $_p");
								setState(208);
								match(BITOR);
								setState(209);
								expression(6);
							}
								break;

							case 9: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(210);
								if (!(4 >= _localctx._p))
									throw new FailedPredicateException(this,
											"4 >= $_p");
								setState(211);
								match(AND);
								setState(212);
								expression(5);
							}
								break;

							case 10: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(213);
								if (!(3 >= _localctx._p))
									throw new FailedPredicateException(this,
											"3 >= $_p");
								setState(214);
								match(OR);
								setState(215);
								expression(4);
							}
								break;

							case 11: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(216);
								if (!(1 >= _localctx._p))
									throw new FailedPredicateException(this,
											"1 >= $_p");
								setState(229);
								switch (_input.LA(1)) {
								case ASSIGN: {
									setState(217);
									match(ASSIGN);
								}
									break;
								case ADD_ASSIGN: {
									setState(218);
									match(ADD_ASSIGN);
								}
									break;
								case SUB_ASSIGN: {
									setState(219);
									match(SUB_ASSIGN);
								}
									break;
								case MUL_ASSIGN: {
									setState(220);
									match(MUL_ASSIGN);
								}
									break;
								case DIV_ASSIGN: {
									setState(221);
									match(DIV_ASSIGN);
								}
									break;
								case AND_ASSIGN: {
									setState(222);
									match(AND_ASSIGN);
								}
									break;
								case OR_ASSIGN: {
									setState(223);
									match(OR_ASSIGN);
								}
									break;
								case XOR_ASSIGN: {
									setState(224);
									match(XOR_ASSIGN);
								}
									break;
								case RSHIFT_ASSIGN: {
									setState(225);
									match(RSHIFT_ASSIGN);
								}
									break;
								case URSHIFT_ASSIGN: {
									setState(226);
									match(URSHIFT_ASSIGN);
								}
									break;
								case LSHIFT_ASSIGN: {
									setState(227);
									match(LSHIFT_ASSIGN);
								}
									break;
								case MOD_ASSIGN: {
									setState(228);
									match(MOD_ASSIGN);
								}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(231);
								expression(1);
							}
								break;

							case 12: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(232);
								if (!(2 >= _localctx._p))
									throw new FailedPredicateException(this,
											"2 >= $_p");
								setState(233);
								match(QUESTION);
								setState(234);
								expression(0);
								setState(235);
								match(COLON);
								setState(236);
								expression(3);
							}
								break;

							case 13: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(238);
								if (!(20 >= _localctx._p))
									throw new FailedPredicateException(this,
											"20 >= $_p");
								setState(239);
								match(DOT);
								setState(240);
								match(Identifier);
							}
								break;

							case 14: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(241);
								if (!(19 >= _localctx._p))
									throw new FailedPredicateException(this,
											"19 >= $_p");
								setState(242);
								match(DOT);
								setState(243);
								match(THIS);
							}
								break;

							case 15: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(244);
								if (!(18 >= _localctx._p))
									throw new FailedPredicateException(this,
											"18 >= $_p");
								setState(245);
								match(LBRACK);
								setState(246);
								expression(0);
								setState(247);
								match(RBRACK);
							}
								break;

							case 16: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(249);
								if (!(17 >= _localctx._p))
									throw new FailedPredicateException(this,
											"17 >= $_p");
								setState(250);
								match(LPAREN);
								setState(252);
								_la = _input.LA(1);
								if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (LPAREN - 34))
										| (1L << (BANG - 34))
										| (1L << (TILDE - 34))
										| (1L << (INC - 34))
										| (1L << (DEC - 34))
										| (1L << (ADD - 34))
										| (1L << (SUB - 34))
										| (1L << (HASHTAG - 34))
										| (1L << (IntegerLiteral - 34))
										| (1L << (FloatingPointLiteral - 34))
										| (1L << (BooleanLiteral - 34))
										| (1L << (CharacterLiteral - 34))
										| (1L << (StringLiteral - 34))
										| (1L << (NullLiteral - 34)) | (1L << (Identifier - 34)))) != 0)) {
									{
										setState(251);
										expressionList();
									}
								}

								setState(254);
								match(RPAREN);
							}
								break;

							case 17: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(255);
								if (!(15 >= _localctx._p))
									throw new FailedPredicateException(this,
											"15 >= $_p");
								setState(256);
								_la = _input.LA(1);
								if (!(_la == INC || _la == DEC)) {
									_errHandler.recoverInline(this);
								}
								consume();
							}
								break;
							}
						}
					}
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expressionList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterExpressionList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitExpressionList(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitExpressionList(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList()
			throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx,
				getState());
		enterRule(_localctx, 26, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(262);
				expression(0);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(263);
							match(COMMA);
							setState(264);
							expression(0);
						}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class, 0);
		}

		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class, 0);
		}

		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterPrimary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitPrimary(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitPrimary(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
					setState(270);
					match(LPAREN);
					setState(271);
					expression(0);
					setState(272);
					match(RPAREN);
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
					setState(274);
					literal();
				}
				break;
			case HASHTAG:
				enterOuterAlt(_localctx, 3);
				{
					setState(275);
					variableIdentifier();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
					setState(276);
					methodCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(AL_Parser.Identifier, 0);
		}

		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class, 0);
		}

		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodCall;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterMethodCall(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitMethodCall(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitMethodCall(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(279);
				match(Identifier);
				setState(280);
				arguments();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class, 0);
		}

		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arguments;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterArguments(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitArguments(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitArguments(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(282);
				match(LPAREN);
				setState(284);
				_la = _input.LA(1);
				if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (LPAREN - 34))
						| (1L << (BANG - 34))
						| (1L << (TILDE - 34))
						| (1L << (INC - 34))
						| (1L << (DEC - 34))
						| (1L << (ADD - 34))
						| (1L << (SUB - 34))
						| (1L << (HASHTAG - 34))
						| (1L << (IntegerLiteral - 34))
						| (1L << (FloatingPointLiteral - 34))
						| (1L << (BooleanLiteral - 34))
						| (1L << (CharacterLiteral - 34))
						| (1L << (StringLiteral - 34))
						| (1L << (NullLiteral - 34)) | (1L << (Identifier - 34)))) != 0)) {
					{
						setState(283);
						expressionList();
					}
				}

				setState(286);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() {
			return getToken(AL_Parser.NullLiteral, 0);
		}

		public TerminalNode CharacterLiteral() {
			return getToken(AL_Parser.CharacterLiteral, 0);
		}

		public TerminalNode IntegerLiteral() {
			return getToken(AL_Parser.IntegerLiteral, 0);
		}

		public TerminalNode StringLiteral() {
			return getToken(AL_Parser.StringLiteral, 0);
		}

		public TerminalNode FloatingPointLiteral() {
			return getToken(AL_Parser.FloatingPointLiteral, 0);
		}

		public TerminalNode BooleanLiteral() {
			return getToken(AL_Parser.BooleanLiteral, 0);
		}

		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_literal;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterLiteral(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitLiteral(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitLiteral(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(288);
				_la = _input.LA(1);
				if (!(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (IntegerLiteral - 80))
						| (1L << (FloatingPointLiteral - 80))
						| (1L << (BooleanLiteral - 80))
						| (1L << (CharacterLiteral - 80))
						| (1L << (StringLiteral - 80)) | (1L << (NullLiteral - 80)))) != 0))) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_type;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitType(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor).visitType(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(290);
				primitiveType();
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LBRACK) {
					{
						{
							setState(291);
							match(LBRACK);
							setState(292);
							match(RBRACK);
						}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primitiveType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterPrimitiveType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitPrimitiveType(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitPrimitiveType(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType()
			throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx,
				getState());
		enterRule(_localctx, 38, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(298);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << SHORT) | (1L << STRING))) != 0))) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class, 0);
		}

		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(AL_Parser.Identifier, 0);
		}

		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public MethodDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterMethodDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitMethodDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitMethodDeclaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration()
			throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx,
				getState());
		enterRule(_localctx, 40, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(300);
				match(FUNCTION);
				setState(303);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
				case STRING: {
					setState(301);
					type();
				}
					break;
				case VOID: {
					setState(302);
					match(VOID);
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(305);
				match(Identifier);
				setState(306);
				formalParameters();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LBRACK) {
					{
						{
							setState(307);
							match(LBRACK);
							setState(308);
							match(RBRACK);
						}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(316);
				switch (_input.LA(1)) {
				case BEGIN: {
					setState(314);
					methodBody();
				}
					break;
				case SEMI: {
					setState(315);
					match(SEMI);
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterMethodBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitMethodBody(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitMethodBody(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(318);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}

		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class, i);
		}

		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_block;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitBlock(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor).visitBlock(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(320);
				match(BEGIN);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN)
						| (1L << BREAK) | (1L << CONTINUE) | (1L << DO)
						| (1L << FOR) | (1L << IF) | (1L << LET)
						| (1L << RETURN) | (1L << SWITCH) | (1L << WHILE)
						| (1L << LPAREN) | (1L << SEMI) | (1L << BANG)
						| (1L << TILDE) | (1L << INC) | (1L << DEC)
						| (1L << ADD) | (1L << SUB))) != 0)
						|| ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (HASHTAG - 66))
								| (1L << (IntegerLiteral - 66))
								| (1L << (FloatingPointLiteral - 66))
								| (1L << (BooleanLiteral - 66))
								| (1L << (CharacterLiteral - 66))
								| (1L << (StringLiteral - 66))
								| (1L << (NullLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
						{
							setState(321);
							blockStatement();
						}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(327);
				match(END);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(
					LocalVariableDeclarationStatementContext.class, 0);
		}

		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_blockStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterBlockStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitBlockStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitBlockStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement()
			throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx,
				getState());
		enterRule(_localctx, 46, RULE_blockStatement);
		try {
			setState(331);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
					setState(329);
					localVariableDeclarationStatement();
				}
				break;
			case BEGIN:
			case BREAK:
			case CONTINUE:
			case DO:
			case FOR:
			case IF:
			case RETURN:
			case SWITCH:
			case WHILE:
			case LPAREN:
			case SEMI:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case HASHTAG:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
					setState(330);
					statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends
			ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class, 0);
		}

		public LocalVariableDeclarationStatementContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_localVariableDeclarationStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.enterLocalVariableDeclarationStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitLocalVariableDeclarationStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitLocalVariableDeclarationStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement()
			throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(
				_ctx, getState());
		enterRule(_localctx, 48, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(333);
				localVariableDeclaration();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends
			ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class, 0);
		}

		public LocalVariableDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_localVariableDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.enterLocalVariableDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitLocalVariableDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitLocalVariableDeclaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration()
			throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 50, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(335);
				variableDeclarators();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class, 0);
		}

		public FormalParametersContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_formalParameters;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterFormalParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitFormalParameters(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitFormalParameters(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters()
			throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx,
				getState());
		enterRule(_localctx, 52, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(337);
				match(LPAREN);
				setState(339);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << SHORT) | (1L << STRING))) != 0)) {
					{
						setState(338);
						formalParameterList();
					}
				}

				setState(341);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}

		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class, 0);
		}

		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class, i);
		}

		public FormalParameterListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_formalParameterList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterFormalParameterList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitFormalParameterList(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitFormalParameterList(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList()
			throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(
				_ctx, getState());
		enterRule(_localctx, 54, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(356);
			switch (getInterpreter().adaptivePredict(_input, 29, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(343);
					formalParameter();
					setState(348);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
					while (_alt != 2 && _alt != -1) {
						if (_alt == 1) {
							{
								{
									setState(344);
									match(COMMA);
									setState(345);
									formalParameter();
								}
							}
						}
						setState(350);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 27,
								_ctx);
					}
					setState(353);
					_la = _input.LA(1);
					if (_la == COMMA) {
						{
							setState(351);
							match(COMMA);
							setState(352);
							lastFormalParameter();
						}
					}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(355);
					lastFormalParameter();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public FormalParameterContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_formalParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterFormalParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitFormalParameter(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitFormalParameter(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter()
			throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx,
				getState());
		enterRule(_localctx, 56, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(358);
				type();
				setState(359);
				variableDeclaratorId();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public LastFormalParameterContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_lastFormalParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterLastFormalParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitLastFormalParameter(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitLastFormalParameter(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter()
			throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(
				_ctx, getState());
		enterRule(_localctx, 58, RULE_lastFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(361);
				type();
				setState(362);
				match(ELLIPSES);
				setState(363);
				variableDeclaratorId();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class, i);
		}

		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class, i);
		}

		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class, 0);
		}

		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class, 0);
		}

		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}

		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(429);
			switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(365);
					block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(366);
					match(IF);
					setState(367);
					parExpression();
					setState(368);
					statement();
					setState(371);
					switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
					case 1: {
						setState(369);
						match(ELSE);
						setState(370);
						statement();
					}
						break;
					}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(373);
					match(FOR);
					setState(374);
					match(LPAREN);
					setState(375);
					forControl();
					setState(376);
					match(RPAREN);
					setState(377);
					statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(379);
					match(WHILE);
					setState(380);
					parExpression();
					setState(381);
					statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(383);
					match(DO);
					setState(384);
					statement();
					setState(385);
					match(WHILE);
					setState(386);
					parExpression();
					setState(387);
					match(SEMI);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(389);
					match(SWITCH);
					setState(390);
					parExpression();
					setState(391);
					match(LCURLY);
					setState(395);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
					while (_alt != 2 && _alt != -1) {
						if (_alt == 1) {
							{
								{
									setState(392);
									switchBlockStatementGroup();
								}
							}
						}
						setState(397);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 31,
								_ctx);
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == CASE || _la == DEFAULT) {
						{
							{
								setState(398);
								switchLabel();
							}
						}
						setState(403);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(404);
					match(RCURLY);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(406);
					match(RETURN);
					setState(408);
					_la = _input.LA(1);
					if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (LPAREN - 34))
							| (1L << (BANG - 34))
							| (1L << (TILDE - 34))
							| (1L << (INC - 34))
							| (1L << (DEC - 34))
							| (1L << (ADD - 34))
							| (1L << (SUB - 34))
							| (1L << (HASHTAG - 34))
							| (1L << (IntegerLiteral - 34))
							| (1L << (FloatingPointLiteral - 34))
							| (1L << (BooleanLiteral - 34))
							| (1L << (CharacterLiteral - 34))
							| (1L << (StringLiteral - 34))
							| (1L << (NullLiteral - 34)) | (1L << (Identifier - 34)))) != 0)) {
						{
							setState(407);
							expression(0);
						}
					}

					setState(410);
					match(SEMI);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(411);
					match(BREAK);
					setState(413);
					_la = _input.LA(1);
					if (_la == HASHTAG) {
						{
							setState(412);
							variableIdentifier();
						}
					}

					setState(415);
					match(SEMI);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
					setState(416);
					match(CONTINUE);
					setState(418);
					_la = _input.LA(1);
					if (_la == HASHTAG) {
						{
							setState(417);
							variableIdentifier();
						}
					}

					setState(420);
					match(SEMI);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
					setState(421);
					match(SEMI);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
					setState(422);
					statementExpression();
					setState(423);
					match(SEMI);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
					setState(425);
					variableIdentifier();
					setState(426);
					match(COLON);
					setState(427);
					statement();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterParExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitParExpression(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitParExpression(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression()
			throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx,
				getState());
		enterRule(_localctx, 62, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(431);
				match(LPAREN);
				setState(432);
				expression(0);
				setState(433);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class, 0);
		}

		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class, 0);
		}

		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forControl;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterForControl(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitForControl(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitForControl(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forControl);
		int _la;
		try {
			setState(447);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
					setState(435);
					enhancedForControl();
				}
				break;
			case LET:
			case LPAREN:
			case SEMI:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case HASHTAG:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
					setState(437);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET)
							| (1L << LPAREN) | (1L << BANG) | (1L << TILDE)
							| (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)
							|| ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (HASHTAG - 66))
									| (1L << (IntegerLiteral - 66))
									| (1L << (FloatingPointLiteral - 66))
									| (1L << (BooleanLiteral - 66))
									| (1L << (CharacterLiteral - 66))
									| (1L << (StringLiteral - 66))
									| (1L << (NullLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
						{
							setState(436);
							forInit();
						}
					}

					setState(439);
					match(SEMI);
					setState(441);
					_la = _input.LA(1);
					if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (LPAREN - 34))
							| (1L << (BANG - 34))
							| (1L << (TILDE - 34))
							| (1L << (INC - 34))
							| (1L << (DEC - 34))
							| (1L << (ADD - 34))
							| (1L << (SUB - 34))
							| (1L << (HASHTAG - 34))
							| (1L << (IntegerLiteral - 34))
							| (1L << (FloatingPointLiteral - 34))
							| (1L << (BooleanLiteral - 34))
							| (1L << (CharacterLiteral - 34))
							| (1L << (StringLiteral - 34))
							| (1L << (NullLiteral - 34)) | (1L << (Identifier - 34)))) != 0)) {
						{
							setState(440);
							expression(0);
						}
					}

					setState(443);
					match(SEMI);
					setState(445);
					_la = _input.LA(1);
					if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (LPAREN - 34))
							| (1L << (BANG - 34))
							| (1L << (TILDE - 34))
							| (1L << (INC - 34))
							| (1L << (DEC - 34))
							| (1L << (ADD - 34))
							| (1L << (SUB - 34))
							| (1L << (HASHTAG - 34))
							| (1L << (IntegerLiteral - 34))
							| (1L << (FloatingPointLiteral - 34))
							| (1L << (BooleanLiteral - 34))
							| (1L << (CharacterLiteral - 34))
							| (1L << (StringLiteral - 34))
							| (1L << (NullLiteral - 34)) | (1L << (Identifier - 34)))) != 0)) {
						{
							setState(444);
							forUpdate();
						}
					}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class, 0);
		}

		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class, 0);
		}

		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forInit;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterForInit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitForInit(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitForInit(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forInit);
		try {
			setState(451);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
					setState(449);
					localVariableDeclaration();
				}
				break;
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case HASHTAG:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
					setState(450);
					expressionList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class, 0);
		}

		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public EnhancedForControlContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enhancedForControl;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterEnhancedForControl(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitEnhancedForControl(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitEnhancedForControl(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl()
			throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(
				_ctx, getState());
		enterRule(_localctx, 68, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(453);
				type();
				setState(454);
				variableIdentifier();
				setState(455);
				match(COLON);
				setState(456);
				expression(0);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class, 0);
		}

		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forUpdate;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterForUpdate(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitForUpdate(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitForUpdate(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(458);
				expressionList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends
			ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}

		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class, i);
		}

		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}

		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class, i);
		}

		public SwitchBlockStatementGroupContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_switchBlockStatementGroup;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.enterSwitchBlockStatementGroup(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitSwitchBlockStatementGroup(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitSwitchBlockStatementGroup(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup()
			throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(
				_ctx, getState());
		enterRule(_localctx, 72, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(460);
							switchLabel();
						}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == CASE || _la == DEFAULT);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(465);
							blockStatement();
						}
					}
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN)
						| (1L << BREAK) | (1L << CONTINUE) | (1L << DO)
						| (1L << FOR) | (1L << IF) | (1L << LET)
						| (1L << RETURN) | (1L << SWITCH) | (1L << WHILE)
						| (1L << LPAREN) | (1L << SEMI) | (1L << BANG)
						| (1L << TILDE) | (1L << INC) | (1L << DEC)
						| (1L << ADD) | (1L << SUB))) != 0)
						|| ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (HASHTAG - 66))
								| (1L << (IntegerLiteral - 66))
								| (1L << (FloatingPointLiteral - 66))
								| (1L << (BooleanLiteral - 66))
								| (1L << (CharacterLiteral - 66))
								| (1L << (StringLiteral - 66))
								| (1L << (NullLiteral - 66)) | (1L << (Identifier - 66)))) != 0));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class, 0);
		}

		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_switchLabel;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterSwitchLabel(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitSwitchLabel(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitSwitchLabel(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_switchLabel);
		try {
			setState(476);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
					setState(470);
					match(CASE);
					setState(471);
					constantExpression();
					setState(472);
					match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
					setState(474);
					match(DEFAULT);
					setState(475);
					match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ConstantExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constantExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterConstantExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitConstantExpression(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitConstantExpression(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression()
			throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 76, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(478);
				expression(0);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public StatementExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statementExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).enterStatementExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener).exitStatementExpression(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitStatementExpression(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression()
			throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 78, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(480);
				expression(0);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expression_sempred((ExpressionContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expression_sempred(ExpressionContext _localctx,
			int predIndex) {
		switch (predIndex) {
		case 0:
			return 12 >= _localctx._p;

		case 1:
			return 11 >= _localctx._p;

		case 2:
			return 10 >= _localctx._p;

		case 3:
			return 9 >= _localctx._p;

		case 4:
			return 8 >= _localctx._p;

		case 5:
			return 7 >= _localctx._p;

		case 6:
			return 6 >= _localctx._p;

		case 7:
			return 5 >= _localctx._p;

		case 8:
			return 4 >= _localctx._p;

		case 9:
			return 3 >= _localctx._p;

		case 10:
			return 1 >= _localctx._p;

		case 11:
			return 2 >= _localctx._p;

		case 12:
			return 20 >= _localctx._p;

		case 13:
			return 19 >= _localctx._p;

		case 14:
			return 18 >= _localctx._p;

		case 15:
			return 17 >= _localctx._p;

		case 16:
			return 15 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3[\u01e5\4\2\t\2\4"
			+ "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
			+ "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
			+ "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
			+ "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\7"
			+ "\2V\n\2\f\2\16\2Y\13\2\3\2\3\2\7\2]\n\2\f\2\16\2`\13\2\3\2\3\2\3\3\3\3"
			+ "\3\4\3\4\3\5\3\5\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6\3\7\3\7\3\b\3"
			+ "\b\3\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\b\3\b\3\t\3\t\5\t\u0083\n\t\3"
			+ "\t\3\t\5\t\u0087\n\t\3\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f\13\n\3\13"
			+ "\3\13\5\13\u0093\n\13\3\f\3\f\3\f\3\f\7\f\u0099\n\f\f\f\16\f\u009c\13"
			+ "\f\3\f\5\f\u009f\n\f\5\f\u00a1\n\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"
			+ "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b3\n\16\3\16\3\16\3\16"
			+ "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c3\n\16"
			+ "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"
			+ "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"
			+ "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e8\n\16\3\16\3\16\3\16\3\16"
			+ "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"
			+ "\3\16\3\16\3\16\5\16\u00ff\n\16\3\16\3\16\3\16\7\16\u0104\n\16\f\16\16"
			+ "\16\u0107\13\16\3\17\3\17\3\17\7\17\u010c\n\17\f\17\16\17\u010f\13\17"
			+ "\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0118\n\20\3\21\3\21\3\21\3\22"
			+ "\3\22\5\22\u011f\n\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\7\24\u0128\n"
			+ "\24\f\24\16\24\u012b\13\24\3\25\3\25\3\26\3\26\3\26\5\26\u0132\n\26\3"
			+ "\26\3\26\3\26\3\26\7\26\u0138\n\26\f\26\16\26\u013b\13\26\3\26\3\26\5"
			+ "\26\u013f\n\26\3\27\3\27\3\30\3\30\7\30\u0145\n\30\f\30\16\30\u0148\13"
			+ "\30\3\30\3\30\3\31\3\31\5\31\u014e\n\31\3\32\3\32\3\33\3\33\3\34\3\34"
			+ "\5\34\u0156\n\34\3\34\3\34\3\35\3\35\3\35\7\35\u015d\n\35\f\35\16\35\u0160"
			+ "\13\35\3\35\3\35\5\35\u0164\n\35\3\35\5\35\u0167\n\35\3\36\3\36\3\36\3"
			+ "\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u0176\n \3 \3 \3 \3 \3 \3 \3 "
			+ "\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u018c\n \f \16 \u018f\13 \3"
			+ " \7 \u0192\n \f \16 \u0195\13 \3 \3 \3 \3 \5 \u019b\n \3 \3 \3 \5 \u01a0"
			+ "\n \3 \3 \3 \5 \u01a5\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01b0\n \3!\3!"
			+ "\3!\3!\3\"\3\"\5\"\u01b8\n\"\3\"\3\"\5\"\u01bc\n\"\3\"\3\"\5\"\u01c0\n"
			+ "\"\5\"\u01c2\n\"\3#\3#\5#\u01c6\n#\3$\3$\3$\3$\3$\3%\3%\3&\6&\u01d0\n"
			+ "&\r&\16&\u01d1\3&\6&\u01d5\n&\r&\16&\u01d6\3\'\3\'\3\'\3\'\3\'\3\'\5\'"
			+ "\u01df\n\'\3(\3(\3)\3)\3)\2*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""
			+ "$&(*,.\60\62\64\668:<>@BDFHJLNP\2\13\3\29<\3\2\61\62\4\2=>BB\3\2;<\4\2"
			+ "/\60\66\67\4\2\65\6588\3\29:\3\2RW\n\2\6\6\b\b\n\n\17\17\23\23\27\27\31"
			+ "\31\35\36\u0211\2R\3\2\2\2\4c\3\2\2\2\6e\3\2\2\2\bg\3\2\2\2\ni\3\2\2\2"
			+ "\fr\3\2\2\2\16t\3\2\2\2\20\u0080\3\2\2\2\22\u0088\3\2\2\2\24\u0092\3\2"
			+ "\2\2\26\u0094\3\2\2\2\30\u00a4\3\2\2\2\32\u00b2\3\2\2\2\34\u0108\3\2\2"
			+ "\2\36\u0117\3\2\2\2 \u0119\3\2\2\2\"\u011c\3\2\2\2$\u0122\3\2\2\2&\u0124"
			+ "\3\2\2\2(\u012c\3\2\2\2*\u012e\3\2\2\2,\u0140\3\2\2\2.\u0142\3\2\2\2\60"
			+ "\u014d\3\2\2\2\62\u014f\3\2\2\2\64\u0151\3\2\2\2\66\u0153\3\2\2\28\u0166"
			+ "\3\2\2\2:\u0168\3\2\2\2<\u016b\3\2\2\2>\u01af\3\2\2\2@\u01b1\3\2\2\2B"
			+ "\u01c1\3\2\2\2D\u01c5\3\2\2\2F\u01c7\3\2\2\2H\u01cc\3\2\2\2J\u01cf\3\2"
			+ "\2\2L\u01de\3\2\2\2N\u01e0\3\2\2\2P\u01e2\3\2\2\2RS\5\4\3\2SW\5\6\4\2"
			+ "TV\5\16\b\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2"
			+ "\2Z^\5\b\5\2[]\5*\26\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2"
			+ "\2\2`^\3\2\2\2ab\5\n\6\2b\3\3\2\2\2cd\7\3\2\2d\5\3\2\2\2ef\7!\2\2f\7\3"
			+ "\2\2\2gh\7\32\2\2h\t\3\2\2\2im\7\5\2\2jl\5\60\31\2kj\3\2\2\2lo\3\2\2\2"
			+ "mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\22\2\2q\13\3\2\2\2rs\7\13"
			+ "\2\2s\r\3\2\2\2tu\7\30\2\2uv\5(\25\2v{\5\20\t\2wx\7+\2\2xz\5\20\t\2yw"
			+ "\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7*\2\2"
			+ "\177\17\3\2\2\2\u0080\u0082\5\22\n\2\u0081\u0083\5\f\7\2\u0082\u0081\3"
			+ "\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0085\7.\2\2\u0085"
			+ "\u0087\5\24\13\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\21\3\2"
			+ "\2\2\u0088\u008d\5\30\r\2\u0089\u008a\7(\2\2\u008a\u008c\7)\2\2\u008b"
			+ "\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"
			+ "\2\2\u008e\23\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0093\5\26\f\2\u0091\u0093"
			+ "\5\32\16\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\25\3\2\2\2\u0094"
			+ "\u00a0\7&\2\2\u0095\u009a\5\24\13\2\u0096\u0097\7+\2\2\u0097\u0099\5\24"
			+ "\13\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"
			+ "\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\7+"
			+ "\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0"
			+ "\u0095\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\'"
			+ "\2\2\u00a3\27\3\2\2\2\u00a4\u00a5\7D\2\2\u00a5\u00a6\7X\2\2\u00a6\31\3"
			+ "\2\2\2\u00a7\u00a8\b\16\1\2\u00a8\u00a9\7$\2\2\u00a9\u00aa\5&\24\2\u00aa"
			+ "\u00ab\7%\2\2\u00ab\u00ac\5\32\16\2\u00ac\u00b3\3\2\2\2\u00ad\u00ae\t"
			+ "\2\2\2\u00ae\u00b3\5\32\16\2\u00af\u00b0\t\3\2\2\u00b0\u00b3\5\32\16\2"
			+ "\u00b1\u00b3\5\36\20\2\u00b2\u00a7\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00af"
			+ "\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u0105\3\2\2\2\u00b4\u00b5\6\16\2\3"
			+ "\u00b5\u00b6\t\4\2\2\u00b6\u0104\5\32\16\2\u00b7\u00b8\6\16\3\3\u00b8"
			+ "\u00b9\t\5\2\2\u00b9\u0104\5\32\16\2\u00ba\u00c2\6\16\4\3\u00bb\u00bc"
			+ "\7\60\2\2\u00bc\u00c3\7\60\2\2\u00bd\u00be\7/\2\2\u00be\u00bf\7/\2\2\u00bf"
			+ "\u00c3\7/\2\2\u00c0\u00c1\7/\2\2\u00c1\u00c3\7/\2\2\u00c2\u00bb\3\2\2"
			+ "\2\u00c2\u00bd\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u0104"
			+ "\5\32\16\2\u00c5\u00c6\6\16\5\3\u00c6\u00c7\t\6\2\2\u00c7\u0104\5\32\16"
			+ "\2\u00c8\u00c9\6\16\6\3\u00c9\u00ca\t\7\2\2\u00ca\u0104\5\32\16\2\u00cb"
			+ "\u00cc\6\16\7\3\u00cc\u00cd\7?\2\2\u00cd\u0104\5\32\16\2\u00ce\u00cf\6"
			+ "\16\b\3\u00cf\u00d0\7A\2\2\u00d0\u0104\5\32\16\2\u00d1\u00d2\6\16\t\3"
			+ "\u00d2\u00d3\7@\2\2\u00d3\u0104\5\32\16\2\u00d4\u00d5\6\16\n\3\u00d5\u00d6"
			+ "\7F\2\2\u00d6\u0104\5\32\16\2\u00d7\u00d8\6\16\13\3\u00d8\u00d9\7E\2\2"
			+ "\u00d9\u0104\5\32\16\2\u00da\u00e7\6\16\f\3\u00db\u00e8\7.\2\2\u00dc\u00e8"
			+ "\7G\2\2\u00dd\u00e8\7H\2\2\u00de\u00e8\7I\2\2\u00df\u00e8\7J\2\2\u00e0"
			+ "\u00e8\7K\2\2\u00e1\u00e8\7L\2\2\u00e2\u00e8\7M\2\2\u00e3\u00e8\7P\2\2"
			+ "\u00e4\u00e8\7Q\2\2\u00e5\u00e8\7O\2\2\u00e6\u00e8\7N\2\2\u00e7\u00db"
			+ "\3\2\2\2\u00e7\u00dc\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7"
			+ "\u00df\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e2\3\2"
			+ "\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"
			+ "\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u0104\5\32\16\2\u00ea\u00eb\6"
			+ "\16\r\3\u00eb\u00ec\7\63\2\2\u00ec\u00ed\5\32\16\2\u00ed\u00ee\7\64\2"
			+ "\2\u00ee\u00ef\5\32\16\2\u00ef\u0104\3\2\2\2\u00f0\u00f1\6\16\16\3\u00f1"
			+ "\u00f2\7,\2\2\u00f2\u0104\7X\2\2\u00f3\u00f4\6\16\17\3\u00f4\u00f5\7,"
			+ "\2\2\u00f5\u0104\7 \2\2\u00f6\u00f7\6\16\20\3\u00f7\u00f8\7(\2\2\u00f8"
			+ "\u00f9\5\32\16\2\u00f9\u00fa\7)\2\2\u00fa\u0104\3\2\2\2\u00fb\u00fc\6"
			+ "\16\21\3\u00fc\u00fe\7$\2\2\u00fd\u00ff\5\34\17\2\u00fe\u00fd\3\2\2\2"
			+ "\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0104\7%\2\2\u0101\u0102"
			+ "\6\16\22\3\u0102\u0104\t\b\2\2\u0103\u00b4\3\2\2\2\u0103\u00b7\3\2\2\2"
			+ "\u0103\u00ba\3\2\2\2\u0103\u00c5\3\2\2\2\u0103\u00c8\3\2\2\2\u0103\u00cb"
			+ "\3\2\2\2\u0103\u00ce\3\2\2\2\u0103\u00d1\3\2\2\2\u0103\u00d4\3\2\2\2\u0103"
			+ "\u00d7\3\2\2\2\u0103\u00da\3\2\2\2\u0103\u00ea\3\2\2\2\u0103\u00f0\3\2"
			+ "\2\2\u0103\u00f3\3\2\2\2\u0103\u00f6\3\2\2\2\u0103\u00fb\3\2\2\2\u0103"
			+ "\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"
			+ "\2\2\u0106\33\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010d\5\32\16\2\u0109"
			+ "\u010a\7+\2\2\u010a\u010c\5\32\16\2\u010b\u0109\3\2\2\2\u010c\u010f\3"
			+ "\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\35\3\2\2\2\u010f"
			+ "\u010d\3\2\2\2\u0110\u0111\7$\2\2\u0111\u0112\5\32\16\2\u0112\u0113\7"
			+ "%\2\2\u0113\u0118\3\2\2\2\u0114\u0118\5$\23\2\u0115\u0118\5\30\r\2\u0116"
			+ "\u0118\5 \21\2\u0117\u0110\3\2\2\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2"
			+ "\2\2\u0117\u0116\3\2\2\2\u0118\37\3\2\2\2\u0119\u011a\7X\2\2\u011a\u011b"
			+ "\5\"\22\2\u011b!\3\2\2\2\u011c\u011e\7$\2\2\u011d\u011f\5\34\17\2\u011e"
			+ "\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7%"
			+ "\2\2\u0121#\3\2\2\2\u0122\u0123\t\t\2\2\u0123%\3\2\2\2\u0124\u0129\5("
			+ "\25\2\u0125\u0126\7(\2\2\u0126\u0128\7)\2\2\u0127\u0125\3\2\2\2\u0128"
			+ "\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\'\3\2\2\2"
			+ "\u012b\u0129\3\2\2\2\u012c\u012d\t\n\2\2\u012d)\3\2\2\2\u012e\u0131\7"
			+ "\25\2\2\u012f\u0132\5&\24\2\u0130\u0132\7\"\2\2\u0131\u012f\3\2\2\2\u0131"
			+ "\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7X\2\2\u0134\u0139\5\66"
			+ "\34\2\u0135\u0136\7(\2\2\u0136\u0138\7)\2\2\u0137\u0135\3\2\2\2\u0138"
			+ "\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013e\3\2"
			+ "\2\2\u013b\u0139\3\2\2\2\u013c\u013f\5,\27\2\u013d\u013f\7*\2\2\u013e"
			+ "\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f+\3\2\2\2\u0140\u0141\5.\30\2"
			+ "\u0141-\3\2\2\2\u0142\u0146\7\4\2\2\u0143\u0145\5\60\31\2\u0144\u0143"
			+ "\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"
			+ "\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7\21\2\2\u014a/\3\2\2\2"
			+ "\u014b\u014e\5\62\32\2\u014c\u014e\5> \2\u014d\u014b\3\2\2\2\u014d\u014c"
			+ "\3\2\2\2\u014e\61\3\2\2\2\u014f\u0150\5\64\33\2\u0150\63\3\2\2\2\u0151"
			+ "\u0152\5\16\b\2\u0152\65\3\2\2\2\u0153\u0155\7$\2\2\u0154\u0156\58\35"
			+ "\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158"
			+ "\7%\2\2\u0158\67\3\2\2\2\u0159\u015e\5:\36\2\u015a\u015b\7+\2\2\u015b"
			+ "\u015d\5:\36\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2"
			+ "\2\2\u015e\u015f\3\2\2\2\u015f\u0163\3\2\2\2\u0160\u015e\3\2\2\2\u0161"
			+ "\u0162\7+\2\2\u0162\u0164\5<\37\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2"
			+ "\2\2\u0164\u0167\3\2\2\2\u0165\u0167\5<\37\2\u0166\u0159\3\2\2\2\u0166"
			+ "\u0165\3\2\2\2\u01679\3\2\2\2\u0168\u0169\5&\24\2\u0169\u016a\5\22\n\2"
			+ "\u016a;\3\2\2\2\u016b\u016c\5&\24\2\u016c\u016d\7-\2\2\u016d\u016e\5\22"
			+ "\n\2\u016e=\3\2\2\2\u016f\u01b0\5.\30\2\u0170\u0171\7\26\2\2\u0171\u0172"
			+ "\5@!\2\u0172\u0175\5> \2\u0173\u0174\7\20\2\2\u0174\u0176\5> \2\u0175"
			+ "\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u01b0\3\2\2\2\u0177\u0178\7\24"
			+ "\2\2\u0178\u0179\7$\2\2\u0179\u017a\5B\"\2\u017a\u017b\7%\2\2\u017b\u017c"
			+ "\5> \2\u017c\u01b0\3\2\2\2\u017d\u017e\7#\2\2\u017e\u017f\5@!\2\u017f"
			+ "\u0180\5> \2\u0180\u01b0\3\2\2\2\u0181\u0182\7\16\2\2\u0182\u0183\5> "
			+ "\2\u0183\u0184\7#\2\2\u0184\u0185\5@!\2\u0185\u0186\7*\2\2\u0186\u01b0"
			+ "\3\2\2\2\u0187\u0188\7\37\2\2\u0188\u0189\5@!\2\u0189\u018d\7&\2\2\u018a"
			+ "\u018c\5J&\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2"
			+ "\2\u018d\u018e\3\2\2\2\u018e\u0193\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0192"
			+ "\5L\'\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193"
			+ "\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7\'"
			+ "\2\2\u0197\u01b0\3\2\2\2\u0198\u019a\7\34\2\2\u0199\u019b\5\32\16\2\u019a"
			+ "\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01b0\7*"
			+ "\2\2\u019d\u019f\7\7\2\2\u019e\u01a0\5\30\r\2\u019f\u019e\3\2\2\2\u019f"
			+ "\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01b0\7*\2\2\u01a2\u01a4\7\f"
			+ "\2\2\u01a3\u01a5\5\30\r\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"
			+ "\u01a6\3\2\2\2\u01a6\u01b0\7*\2\2\u01a7\u01b0\7*\2\2\u01a8\u01a9\5P)\2"
			+ "\u01a9\u01aa\7*\2\2\u01aa\u01b0\3\2\2\2\u01ab\u01ac\5\30\r\2\u01ac\u01ad"
			+ "\7\64\2\2\u01ad\u01ae\5> \2\u01ae\u01b0\3\2\2\2\u01af\u016f\3\2\2\2\u01af"
			+ "\u0170\3\2\2\2\u01af\u0177\3\2\2\2\u01af\u017d\3\2\2\2\u01af\u0181\3\2"
			+ "\2\2\u01af\u0187\3\2\2\2\u01af\u0198\3\2\2\2\u01af\u019d\3\2\2\2\u01af"
			+ "\u01a2\3\2\2\2\u01af\u01a7\3\2\2\2\u01af\u01a8\3\2\2\2\u01af\u01ab\3\2"
			+ "\2\2\u01b0?\3\2\2\2\u01b1\u01b2\7$\2\2\u01b2\u01b3\5\32\16\2\u01b3\u01b4"
			+ "\7%\2\2\u01b4A\3\2\2\2\u01b5\u01c2\5F$\2\u01b6\u01b8\5D#\2\u01b7\u01b6"
			+ "\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\7*\2\2\u01ba"
			+ "\u01bc\5\32\16\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3"
			+ "\2\2\2\u01bd\u01bf\7*\2\2\u01be\u01c0\5H%\2\u01bf\u01be\3\2\2\2\u01bf"
			+ "\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01b5\3\2\2\2\u01c1\u01b7\3\2"
			+ "\2\2\u01c2C\3\2\2\2\u01c3\u01c6\5\64\33\2\u01c4\u01c6\5\34\17\2\u01c5"
			+ "\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6E\3\2\2\2\u01c7\u01c8\5&\24\2"
			+ "\u01c8\u01c9\5\30\r\2\u01c9\u01ca\7\64\2\2\u01ca\u01cb\5\32\16\2\u01cb"
			+ "G\3\2\2\2\u01cc\u01cd\5\34\17\2\u01cdI\3\2\2\2\u01ce\u01d0\5L\'\2\u01cf"
			+ "\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2"
			+ "\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d5\5\60\31\2\u01d4\u01d3\3\2\2\2\u01d5"
			+ "\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7K\3\2\2\2"
			+ "\u01d8\u01d9\7\t\2\2\u01d9\u01da\5N(\2\u01da\u01db\7\64\2\2\u01db\u01df"
			+ "\3\2\2\2\u01dc\u01dd\7\r\2\2\u01dd\u01df\7\64\2\2\u01de\u01d8\3\2\2\2"
			+ "\u01de\u01dc\3\2\2\2\u01dfM\3\2\2\2\u01e0\u01e1\5\32\16\2\u01e1O\3\2\2"
			+ "\2\u01e2\u01e3\5\32\16\2\u01e3Q\3\2\2\2/W^m{\u0082\u0086\u008d\u0092\u009a"
			+ "\u009e\u00a0\u00b2\u00c2\u00e7\u00fe\u0103\u0105\u010d\u0117\u011e\u0129"
			+ "\u0131\u0139\u013e\u0146\u014d\u0155\u015e\u0163\u0166\u0175\u018d\u0193"
			+ "\u019a\u019f\u01a4\u01af\u01b7\u01bb\u01bf\u01c1\u01c5\u01d1\u01d6\u01de";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

}