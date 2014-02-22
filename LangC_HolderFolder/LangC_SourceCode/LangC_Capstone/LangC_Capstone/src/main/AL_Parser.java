package main;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class AL_Parser extends Parser {
	
	protected static final DFA[] _decisionToDFA;
	
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	
	public static final int T__15 = 1, T__14 = 2, T__13 = 3, T__12 = 4,
			T__11 = 5, T__10 = 6, T__9 = 7, T__8 = 8, T__7 = 9, T__6 = 10,
			T__5 = 11, T__4 = 12, T__3 = 13, T__2 = 14, T__1 = 15, T__0 = 16,
			ProgramHeader = 17, VariableHeader = 18, MethodHeader = 19,
			AND = 20, ARRAY = 21, AS = 22, BEGIN = 23, BREAK = 24, CASE = 25,
			CATCH = 26, CONSTANTLY = 27, CONTINUE = 28, DO = 29, ELSE = 30,
			END = 31, EXIT = 32, FILE = 33, FINALLY = 34, FOR = 35,
			FUNCTION = 36, IF = 37, IN = 38, IS = 39, LET = 40, OR = 41,
			PROGRAM = 42, SET = 43, SWITCH = 44, THIS = 45, TRY = 46,
			UNIMPLEMENTED = 47, WHILE = 48, IntegerLiteral = 49,
			FloatingPointLiteral = 50, BooleanLiteral = 51,
			CharacterLiteral = 52, StringLiteral = 53, NullLiteral = 54,
			LPAREN = 55, RPAREN = 56, LBRACK = 57, RBRACK = 58, SEMI = 59,
			COMMA = 60, DOT = 61, ASSIGN = 62, GT = 63, LT = 64, BANG = 65,
			TILDE = 66, QUESTION = 67, COLON = 68, EQUAL = 69, LE = 70,
			GE = 71, NOTEQUAL = 72, INC = 73, DEC = 74, ADD = 75, SUB = 76,
			MUL = 77, DIV = 78, BITAND = 79, BITOR = 80, CARET = 81, MOD = 82,
			QUOTE = 83, ADD_ASSIGN = 84, SUB_ASSIGN = 85, MUL_ASSIGN = 86,
			DIV_ASSIGN = 87, AND_ASSIGN = 88, OR_ASSIGN = 89, XOR_ASSIGN = 90,
			MOD_ASSIGN = 91, LSHIFT_ASSIGN = 92, RSHIFT_ASSIGN = 93,
			URSHIFT_ASSIGN = 94, Identifier = 95, VariableIdentifier = 96,
			AL_Letter = 97, AL_LetterOrDigit = 98, WS = 99, COMMENT = 100,
			LINE_COMMENT = 101;
	
	public static final String[] tokenNames = { "<INVALID>", "'double'", "'}'",
			"'boolean'", "'float'", "'char'", "'long'", "'short'", "'default'",
			"'int'", "'void'", "'{'", "':end program:'", "'byte'", "'return'",
			"'&&'", "':start program:'", "':alproject:'", "':variables:'",
			"':methods:'", "'and'", "'array'", "'as'", "'begin'", "'break'",
			"'case'", "'catch'", "'constantly'", "'continue'", "'do'",
			"'else'", "'end'", "'exit'", "'file'", "'finally'", "'for'",
			"'function'", "'if'", "'in'", "'is'", "'let'", "'||'", "'program'",
			"'set'", "'switch'", "'this'", "'try'", "'unimplemented'",
			"'while'", "IntegerLiteral", "FloatingPointLiteral",
			"BooleanLiteral", "CharacterLiteral", "StringLiteral", "'null'",
			"'('", "')'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'",
			"'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='",
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'",
			"'%'", "'\"'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='",
			"'^='", "'%='", "'<<='", "'>>='", "'>>>='", "Identifier",
			"VariableIdentifier", "AL_Letter", "AL_LetterOrDigit", "WS",
			"COMMENT", "LINE_COMMENT" };
	public static final int RULE_program = 0, RULE_programDeclaration = 1,
			RULE_mainProgram = 2, RULE_methodDeclaration = 3,
			RULE_methodBody = 4, RULE_block = 5, RULE_blockStatement = 6,
			RULE_statement = 7, RULE_switchBlockStatementGroup = 8,
			RULE_switchLabel = 9, RULE_forControl = 10, RULE_forInit = 11,
			RULE_enhancedForControl = 12, RULE_forUpdate = 13,
			RULE_parExpression = 14, RULE_expressionList = 15,
			RULE_statementExpression = 16, RULE_constantExpression = 17,
			RULE_formalParameters = 18, RULE_formalParameterList = 19,
			RULE_formalParameter = 20, RULE_variableDeclarators = 21,
			RULE_variableDeclaration = 22, RULE_variableDeclarationID = 23,
			RULE_variableInitialization = 24, RULE_expression = 25,
			RULE_primary = 26, RULE_literal = 27, RULE_type = 28,
			RULE_primitiveType = 29;
	public static final String[] ruleNames = { "program", "programDeclaration",
			"mainProgram", "methodDeclaration", "methodBody", "block",
			"blockStatement", "statement", "switchBlockStatementGroup",
			"switchLabel", "forControl", "forInit", "enhancedForControl",
			"forUpdate", "parExpression", "expressionList",
			"statementExpression", "constantExpression", "formalParameters",
			"formalParameterList", "formalParameter", "variableDeclarators",
			"variableDeclaration", "variableDeclarationID",
			"variableInitialization", "expression", "primary", "literal",
			"type", "primitiveType" };

	@Override
	public String getGrammarFileName() {
		return "AL_CombinedGrammar.g4";
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
		public ProgramDeclarationContext programDeclaration() {
			return getRuleContext(ProgramDeclarationContext.class, 0);
		}

		public TerminalNode ProgramHeader() {
			return getToken(AL_Parser.ProgramHeader, 0);
		}

		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class, i);
		}

		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class, i);
		}

		public TerminalNode MethodHeader() {
			return getToken(AL_Parser.MethodHeader, 0);
		}

		public TerminalNode VariableHeader() {
			return getToken(AL_Parser.VariableHeader, 0);
		}

		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}

		public MainProgramContext mainProgram() {
			return getRuleContext(MainProgramContext.class, 0);
		}

		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
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
				setState(61);
				_la = _input.LA(1);
				if (_la == ProgramHeader) {
					{
						setState(60);
						match(ProgramHeader);
					}
				}

				setState(63);
				programDeclaration();
				setState(65);
				_la = _input.LA(1);
				if (_la == VariableHeader) {
					{
						setState(64);
						match(VariableHeader);
					}
				}

				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LET) {
					{
						{
							setState(67);
							variableDeclaration();
						}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				_la = _input.LA(1);
				if (_la == MethodHeader) {
					{
						setState(73);
						match(MethodHeader);
					}
				}

				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == FUNCTION) {
					{
						{
							setState(76);
							methodDeclaration();
						}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				_la = _input.LA(1);
				if (_la == 16) {
					{
						setState(82);
						mainProgram();
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

	public static class ProgramDeclarationContext extends ParserRuleContext {
		public TerminalNode QUOTE(int i) {
			return getToken(AL_Parser.QUOTE, i);
		}

		public List<TerminalNode> QUOTE() {
			return getTokens(AL_Parser.QUOTE);
		}

		public TerminalNode Identifier() {
			return getToken(AL_Parser.Identifier, 0);
		}

		public TerminalNode PROGRAM() {
			return getToken(AL_Parser.PROGRAM, 0);
		}

		public TerminalNode THIS() {
			return getToken(AL_Parser.THIS, 0);
		}

		public ProgramDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_programDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.enterProgramDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitProgramDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitProgramDeclaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ProgramDeclarationContext programDeclaration()
			throws RecognitionException {
		ProgramDeclarationContext _localctx = new ProgramDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 2, RULE_programDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(85);
				match(THIS);
				setState(86);
				match(PROGRAM);
				setState(87);
				match(QUOTE);
				setState(88);
				match(Identifier);
				setState(89);
				match(QUOTE);
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
		enterRule(_localctx, 4, RULE_mainProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(91);
				match(16);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14)
						| (1L << BEGIN) | (1L << BREAK) | (1L << CONTINUE)
						| (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LET)
						| (1L << SWITCH) | (1L << WHILE)
						| (1L << IntegerLiteral) | (1L << FloatingPointLiteral)
						| (1L << BooleanLiteral) | (1L << CharacterLiteral)
						| (1L << StringLiteral) | (1L << NullLiteral)
						| (1L << LPAREN) | (1L << SEMI))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (BANG - 65))
								| (1L << (TILDE - 65))
								| (1L << (INC - 65))
								| (1L << (DEC - 65))
								| (1L << (ADD - 65))
								| (1L << (SUB - 65))
								| (1L << (Identifier - 65)) | (1L << (VariableIdentifier - 65)))) != 0)) {
					{
						{
							setState(92);
							blockStatement();
						}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(12);
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

		public TerminalNode FUNCTION() {
			return getToken(AL_Parser.FUNCTION, 0);
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
				((GrammarListener) listener)
						.enterMethodDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitMethodDeclaration(this);
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
		enterRule(_localctx, 6, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(100);
				match(FUNCTION);
				setState(103);
				switch (_input.LA(1)) {
				case 1:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 9:
				case 13: {
					setState(101);
					type();
				}
					break;
				case 10: {
					setState(102);
					match(10);
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(105);
				match(Identifier);
				setState(106);
				formalParameters();
				setState(109);
				switch (_input.LA(1)) {
				case BEGIN: {
					setState(107);
					methodBody();
				}
					break;
				case SEMI: {
					setState(108);
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
		enterRule(_localctx, 8, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(111);
				block();
				setState(112);
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}

		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class, i);
		}

		public TerminalNode BEGIN() {
			return getToken(AL_Parser.BEGIN, 0);
		}

		public TerminalNode END() {
			return getToken(AL_Parser.END, 0);
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
				return ((GrammarVisitor<? extends T>) visitor)
						.visitBlock(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(114);
				match(BEGIN);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14)
						| (1L << BEGIN) | (1L << BREAK) | (1L << CONTINUE)
						| (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LET)
						| (1L << SWITCH) | (1L << WHILE)
						| (1L << IntegerLiteral) | (1L << FloatingPointLiteral)
						| (1L << BooleanLiteral) | (1L << CharacterLiteral)
						| (1L << StringLiteral) | (1L << NullLiteral)
						| (1L << LPAREN) | (1L << SEMI))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (BANG - 65))
								| (1L << (TILDE - 65))
								| (1L << (INC - 65))
								| (1L << (DEC - 65))
								| (1L << (ADD - 65))
								| (1L << (SUB - 65))
								| (1L << (Identifier - 65)) | (1L << (VariableIdentifier - 65)))) != 0)) {
					{
						{
							setState(115);
							blockStatement();
						}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
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

		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class, 0);
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
				((GrammarListener) listener)
						.enterBlockStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitBlockStatement(this);
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
		enterRule(_localctx, 12, RULE_blockStatement);
		try {
			setState(127);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
					setState(123);
					variableDeclaration();
					setState(124);
					match(SEMI);
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
				enterOuterAlt(_localctx, 2);
				{
					setState(126);
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public TerminalNode VariableIdentifier() {
			return getToken(AL_Parser.VariableIdentifier, 0);
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
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(192);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
					setState(129);
					block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
					setState(130);
					match(IF);
					setState(131);
					parExpression();
					setState(132);
					statement();
					setState(135);
					switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
					case 1: {
						setState(133);
						match(ELSE);
						setState(134);
						statement();
					}
						break;
					}
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
					setState(137);
					match(FOR);
					setState(138);
					match(LPAREN);
					setState(139);
					forControl();
					setState(140);
					match(RPAREN);
					setState(141);
					statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
					setState(143);
					match(WHILE);
					setState(144);
					parExpression();
					setState(145);
					statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
					setState(147);
					match(DO);
					setState(148);
					statement();
					setState(149);
					match(WHILE);
					setState(150);
					parExpression();
					setState(151);
					match(SEMI);
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
					setState(153);
					match(SWITCH);
					setState(154);
					parExpression();
					setState(155);
					match(11);
					setState(159);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
					while (_alt != 2 && _alt != -1) {
						if (_alt == 1) {
							{
								{
									setState(156);
									switchBlockStatementGroup();
								}
							}
						}
						setState(161);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 12,
								_ctx);
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == 8 || _la == CASE) {
						{
							{
								setState(162);
								switchLabel();
							}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(168);
					match(2);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 7);
				{
					setState(170);
					match(14);
					setState(172);
					_la = _input.LA(1);
					if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (IntegerLiteral - 49))
							| (1L << (FloatingPointLiteral - 49))
							| (1L << (BooleanLiteral - 49))
							| (1L << (CharacterLiteral - 49))
							| (1L << (StringLiteral - 49))
							| (1L << (NullLiteral - 49))
							| (1L << (LPAREN - 49))
							| (1L << (BANG - 49))
							| (1L << (TILDE - 49))
							| (1L << (INC - 49))
							| (1L << (DEC - 49))
							| (1L << (ADD - 49))
							| (1L << (SUB - 49)) | (1L << (Identifier - 49)))) != 0)) {
						{
							setState(171);
							expression(0);
						}
					}

					setState(174);
					match(SEMI);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 8);
				{
					setState(175);
					match(BREAK);
					setState(177);
					_la = _input.LA(1);
					if (_la == VariableIdentifier) {
						{
							setState(176);
							match(VariableIdentifier);
						}
					}

					setState(179);
					match(SEMI);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 9);
				{
					setState(180);
					match(CONTINUE);
					setState(182);
					_la = _input.LA(1);
					if (_la == VariableIdentifier) {
						{
							setState(181);
							match(VariableIdentifier);
						}
					}

					setState(184);
					match(SEMI);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 10);
				{
					setState(185);
					match(SEMI);
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
				enterOuterAlt(_localctx, 11);
				{
					setState(186);
					statementExpression();
					setState(187);
					match(SEMI);
				}
				break;
			case VariableIdentifier:
				enterOuterAlt(_localctx, 12);
				{
					setState(189);
					match(VariableIdentifier);
					setState(190);
					match(COLON);
					setState(191);
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
		enterRule(_localctx, 16, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(194);
							switchLabel();
						}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == 8 || _la == CASE);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(199);
							blockStatement();
						}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14)
						| (1L << BEGIN) | (1L << BREAK) | (1L << CONTINUE)
						| (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LET)
						| (1L << SWITCH) | (1L << WHILE)
						| (1L << IntegerLiteral) | (1L << FloatingPointLiteral)
						| (1L << BooleanLiteral) | (1L << CharacterLiteral)
						| (1L << StringLiteral) | (1L << NullLiteral)
						| (1L << LPAREN) | (1L << SEMI))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (BANG - 65))
								| (1L << (TILDE - 65))
								| (1L << (INC - 65))
								| (1L << (DEC - 65))
								| (1L << (ADD - 65))
								| (1L << (SUB - 65))
								| (1L << (Identifier - 65)) | (1L << (VariableIdentifier - 65)))) != 0));
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
		enterRule(_localctx, 18, RULE_switchLabel);
		try {
			setState(210);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
					setState(204);
					match(CASE);
					setState(205);
					constantExpression();
					setState(206);
					match(COLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
					setState(208);
					match(8);
					setState(209);
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
		enterRule(_localctx, 20, RULE_forControl);
		int _la;
		try {
			setState(224);
			switch (_input.LA(1)) {
			case 1:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 9:
			case 13:
				enterOuterAlt(_localctx, 1);
				{
					setState(212);
					enhancedForControl();
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
				enterOuterAlt(_localctx, 2);
				{
					setState(214);
					_la = _input.LA(1);
					if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (LET - 40))
							| (1L << (IntegerLiteral - 40))
							| (1L << (FloatingPointLiteral - 40))
							| (1L << (BooleanLiteral - 40))
							| (1L << (CharacterLiteral - 40))
							| (1L << (StringLiteral - 40))
							| (1L << (NullLiteral - 40))
							| (1L << (LPAREN - 40))
							| (1L << (BANG - 40))
							| (1L << (TILDE - 40))
							| (1L << (INC - 40))
							| (1L << (DEC - 40))
							| (1L << (ADD - 40))
							| (1L << (SUB - 40)) | (1L << (Identifier - 40)))) != 0)) {
						{
							setState(213);
							forInit();
						}
					}

					setState(216);
					match(SEMI);
					setState(218);
					_la = _input.LA(1);
					if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (IntegerLiteral - 49))
							| (1L << (FloatingPointLiteral - 49))
							| (1L << (BooleanLiteral - 49))
							| (1L << (CharacterLiteral - 49))
							| (1L << (StringLiteral - 49))
							| (1L << (NullLiteral - 49))
							| (1L << (LPAREN - 49))
							| (1L << (BANG - 49))
							| (1L << (TILDE - 49))
							| (1L << (INC - 49))
							| (1L << (DEC - 49))
							| (1L << (ADD - 49))
							| (1L << (SUB - 49)) | (1L << (Identifier - 49)))) != 0)) {
						{
							setState(217);
							expression(0);
						}
					}

					setState(220);
					match(SEMI);
					setState(222);
					_la = _input.LA(1);
					if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (IntegerLiteral - 49))
							| (1L << (FloatingPointLiteral - 49))
							| (1L << (BooleanLiteral - 49))
							| (1L << (CharacterLiteral - 49))
							| (1L << (StringLiteral - 49))
							| (1L << (NullLiteral - 49))
							| (1L << (LPAREN - 49))
							| (1L << (BANG - 49))
							| (1L << (TILDE - 49))
							| (1L << (INC - 49))
							| (1L << (DEC - 49))
							| (1L << (ADD - 49))
							| (1L << (SUB - 49)) | (1L << (Identifier - 49)))) != 0)) {
						{
							setState(221);
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

		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class, 0);
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
		enterRule(_localctx, 22, RULE_forInit);
		try {
			setState(228);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
					setState(226);
					variableDeclaration();
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
				enterOuterAlt(_localctx, 2);
				{
					setState(227);
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
		public TerminalNode VariableIdentifier() {
			return getToken(AL_Parser.VariableIdentifier, 0);
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
				((GrammarListener) listener)
						.enterEnhancedForControl(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitEnhancedForControl(this);
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
		enterRule(_localctx, 24, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(230);
				type();
				setState(231);
				match(VariableIdentifier);
				setState(232);
				match(COLON);
				setState(233);
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
		enterRule(_localctx, 26, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(235);
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
				((GrammarListener) listener)
						.enterParExpression(this);
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
		enterRule(_localctx, 28, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(237);
				match(LPAREN);
				setState(238);
				expression(0);
				setState(239);
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
				((GrammarListener) listener)
						.enterExpressionList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitExpressionList(this);
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
		enterRule(_localctx, 30, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(241);
				expression(0);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(242);
							match(COMMA);
							setState(243);
							expression(0);
						}
					}
					setState(248);
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
				((GrammarListener) listener)
						.enterStatementExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitStatementExpression(this);
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
		enterRule(_localctx, 32, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(249);
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
				((GrammarListener) listener)
						.enterConstantExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitConstantExpression(this);
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
		enterRule(_localctx, 34, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(251);
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
				((GrammarListener) listener)
						.enterFormalParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitFormalParameters(this);
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
		enterRule(_localctx, 36, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(253);
				match(LPAREN);
				setState(255);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1)
						| (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6)
						| (1L << 7) | (1L << 9) | (1L << 13))) != 0)) {
					{
						setState(254);
						formalParameterList();
					}
				}

				setState(257);
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
				((GrammarListener) listener)
						.enterFormalParameterList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitFormalParameterList(this);
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
		enterRule(_localctx, 38, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(259);
				formalParameter();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(260);
							match(COMMA);
							setState(261);
							formalParameter();
						}
					}
					setState(266);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TerminalNode VariableIdentifier() {
			return getToken(AL_Parser.VariableIdentifier, 0);
		}

		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
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
				((GrammarListener) listener)
						.enterFormalParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitFormalParameter(this);
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
		enterRule(_localctx, 40, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(267);
				type();
				setState(268);
				match(VariableIdentifier);
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
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class, i);
		}

		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
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
				((GrammarListener) listener)
						.enterVariableDeclarators(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitVariableDeclarators(this);
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
		enterRule(_localctx, 42, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(270);
				variableDeclaration();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(271);
							match(COMMA);
							setState(272);
							variableDeclaration();
						}
					}
					setState(277);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationIDContext variableDeclarationID() {
			return getRuleContext(VariableDeclarationIDContext.class, 0);
		}

		public TerminalNode LET() {
			return getToken(AL_Parser.LET, 0);
		}

		public VariableInitializationContext variableInitialization() {
			return getRuleContext(VariableInitializationContext.class, 0);
		}

		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public VariableDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.enterVariableDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitVariableDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitVariableDeclaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration()
			throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 44, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(278);
				match(LET);
				setState(279);
				type();
				setState(280);
				variableDeclarationID();
				setState(283);
				_la = _input.LA(1);
				if (_la == ASSIGN) {
					{
						setState(281);
						match(ASSIGN);
						setState(282);
						variableInitialization();
					}
				}

				setState(285);
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

	public static class VariableDeclarationIDContext extends ParserRuleContext {
		public TerminalNode VariableIdentifier() {
			return getToken(AL_Parser.VariableIdentifier, 0);
		}

		public VariableDeclarationIDContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclarationID;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.enterVariableDeclarationID(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitVariableDeclarationID(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitVariableDeclarationID(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationIDContext variableDeclarationID()
			throws RecognitionException {
		VariableDeclarationIDContext _localctx = new VariableDeclarationIDContext(
				_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclarationID);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(287);
				match(VariableIdentifier);
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

	public static class VariableInitializationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public VariableInitializationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableInitialization;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.enterVariableInitialization(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener)
				((GrammarListener) listener)
						.exitVariableInitialization(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor)
						.visitVariableInitialization(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final VariableInitializationContext variableInitialization()
			throws RecognitionException {
		VariableInitializationContext _localctx = new VariableInitializationContext(
				_ctx, getState());
		enterRule(_localctx, 48, RULE_variableInitialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(289);
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode VariableIdentifier() {
			return getToken(AL_Parser.VariableIdentifier, 0);
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
		int _startState = 50;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(302);
				switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
				case 1: {
					setState(292);
					match(LPAREN);
					setState(293);
					type();
					setState(294);
					match(RPAREN);
					setState(295);
					expression(16);
				}
					break;

				case 2: {
					setState(297);
					_la = _input.LA(1);
					if (!(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (INC - 73))
							| (1L << (DEC - 73)) | (1L << (ADD - 73)) | (1L << (SUB - 73)))) != 0))) {
						_errHandler.recoverInline(this);
					}
					consume();
					setState(298);
					expression(14);
				}
					break;

				case 3: {
					setState(299);
					_la = _input.LA(1);
					if (!(_la == BANG || _la == TILDE)) {
						_errHandler.recoverInline(this);
					}
					consume();
					setState(300);
					expression(13);
				}
					break;

				case 4: {
					setState(301);
					primary();
				}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 36, _ctx);
				while (_alt != 2 && _alt != -1) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(380);
							switch (getInterpreter().adaptivePredict(_input,
									35, _ctx)) {
							case 1: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(304);
								if (!(12 >= _localctx._p))
									throw new FailedPredicateException(this,
											"12 >= $_p");
								setState(305);
								_la = _input.LA(1);
								if (!(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (MUL - 77))
										| (1L << (DIV - 77)) | (1L << (MOD - 77)))) != 0))) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(306);
								expression(13);
							}
								break;

							case 2: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(307);
								if (!(11 >= _localctx._p))
									throw new FailedPredicateException(this,
											"11 >= $_p");
								setState(308);
								_la = _input.LA(1);
								if (!(_la == ADD || _la == SUB)) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(309);
								expression(12);
							}
								break;

							case 3: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(310);
								if (!(10 >= _localctx._p))
									throw new FailedPredicateException(this,
											"10 >= $_p");
								setState(318);
								switch (getInterpreter().adaptivePredict(
										_input, 32, _ctx)) {
								case 1: {
									setState(311);
									match(LT);
									setState(312);
									match(LT);
								}
									break;

								case 2: {
									setState(313);
									match(GT);
									setState(314);
									match(GT);
									setState(315);
									match(GT);
								}
									break;

								case 3: {
									setState(316);
									match(GT);
									setState(317);
									match(GT);
								}
									break;
								}
								setState(320);
								expression(11);
							}
								break;

							case 4: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(321);
								if (!(9 >= _localctx._p))
									throw new FailedPredicateException(this,
											"9 >= $_p");
								setState(322);
								_la = _input.LA(1);
								if (!(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (GT - 63))
										| (1L << (LT - 63)) | (1L << (LE - 63)) | (1L << (GE - 63)))) != 0))) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(323);
								expression(10);
							}
								break;

							case 5: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(324);
								if (!(8 >= _localctx._p))
									throw new FailedPredicateException(this,
											"8 >= $_p");
								setState(325);
								_la = _input.LA(1);
								if (!(_la == EQUAL || _la == NOTEQUAL)) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(326);
								expression(9);
							}
								break;

							case 6: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(327);
								if (!(7 >= _localctx._p))
									throw new FailedPredicateException(this,
											"7 >= $_p");
								setState(328);
								match(BITAND);
								setState(329);
								expression(8);
							}
								break;

							case 7: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(330);
								if (!(6 >= _localctx._p))
									throw new FailedPredicateException(this,
											"6 >= $_p");
								setState(331);
								match(CARET);
								setState(332);
								expression(7);
							}
								break;

							case 8: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(333);
								if (!(5 >= _localctx._p))
									throw new FailedPredicateException(this,
											"5 >= $_p");
								setState(334);
								match(BITOR);
								setState(335);
								expression(6);
							}
								break;

							case 9: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(336);
								if (!(4 >= _localctx._p))
									throw new FailedPredicateException(this,
											"4 >= $_p");
								setState(337);
								match(15);
								setState(338);
								expression(5);
							}
								break;

							case 10: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(339);
								if (!(3 >= _localctx._p))
									throw new FailedPredicateException(this,
											"3 >= $_p");
								setState(340);
								match(OR);
								setState(341);
								expression(4);
							}
								break;

							case 11: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(342);
								if (!(1 >= _localctx._p))
									throw new FailedPredicateException(this,
											"1 >= $_p");
								setState(355);
								switch (_input.LA(1)) {
								case ASSIGN: {
									setState(343);
									match(ASSIGN);
								}
									break;
								case ADD_ASSIGN: {
									setState(344);
									match(ADD_ASSIGN);
								}
									break;
								case SUB_ASSIGN: {
									setState(345);
									match(SUB_ASSIGN);
								}
									break;
								case MUL_ASSIGN: {
									setState(346);
									match(MUL_ASSIGN);
								}
									break;
								case DIV_ASSIGN: {
									setState(347);
									match(DIV_ASSIGN);
								}
									break;
								case AND_ASSIGN: {
									setState(348);
									match(AND_ASSIGN);
								}
									break;
								case OR_ASSIGN: {
									setState(349);
									match(OR_ASSIGN);
								}
									break;
								case XOR_ASSIGN: {
									setState(350);
									match(XOR_ASSIGN);
								}
									break;
								case RSHIFT_ASSIGN: {
									setState(351);
									match(RSHIFT_ASSIGN);
								}
									break;
								case URSHIFT_ASSIGN: {
									setState(352);
									match(URSHIFT_ASSIGN);
								}
									break;
								case LSHIFT_ASSIGN: {
									setState(353);
									match(LSHIFT_ASSIGN);
								}
									break;
								case MOD_ASSIGN: {
									setState(354);
									match(MOD_ASSIGN);
								}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(357);
								expression(1);
							}
								break;

							case 12: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(358);
								if (!(2 >= _localctx._p))
									throw new FailedPredicateException(this,
											"2 >= $_p");
								setState(359);
								match(QUESTION);
								setState(360);
								expression(0);
								setState(361);
								match(COLON);
								setState(362);
								expression(3);
							}
								break;

							case 13: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(364);
								if (!(19 >= _localctx._p))
									throw new FailedPredicateException(this,
											"19 >= $_p");
								setState(365);
								match(DOT);
								setState(366);
								_la = _input.LA(1);
								if (!(_la == Identifier || _la == VariableIdentifier)) {
									_errHandler.recoverInline(this);
								}
								consume();
							}
								break;

							case 14: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(367);
								if (!(18 >= _localctx._p))
									throw new FailedPredicateException(this,
											"18 >= $_p");
								setState(368);
								match(LBRACK);
								setState(369);
								expression(0);
								setState(370);
								match(RBRACK);
							}
								break;

							case 15: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(372);
								if (!(17 >= _localctx._p))
									throw new FailedPredicateException(this,
											"17 >= $_p");
								setState(373);
								match(LPAREN);
								setState(375);
								_la = _input.LA(1);
								if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (IntegerLiteral - 49))
										| (1L << (FloatingPointLiteral - 49))
										| (1L << (BooleanLiteral - 49))
										| (1L << (CharacterLiteral - 49))
										| (1L << (StringLiteral - 49))
										| (1L << (NullLiteral - 49))
										| (1L << (LPAREN - 49))
										| (1L << (BANG - 49))
										| (1L << (TILDE - 49))
										| (1L << (INC - 49))
										| (1L << (DEC - 49))
										| (1L << (ADD - 49))
										| (1L << (SUB - 49)) | (1L << (Identifier - 49)))) != 0)) {
									{
										setState(374);
										expressionList();
									}
								}

								setState(377);
								match(RPAREN);
							}
								break;

							case 16: {
								_localctx = new ExpressionContext(_parentctx,
										_parentState, _p);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expression);
								setState(378);
								if (!(15 >= _localctx._p))
									throw new FailedPredicateException(this,
											"15 >= $_p");
								setState(379);
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
					setState(384);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 36, _ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(AL_Parser.Identifier, 0);
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
		enterRule(_localctx, 52, RULE_primary);
		try {
			setState(391);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
					setState(385);
					match(LPAREN);
					setState(386);
					expression(0);
					setState(387);
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
					setState(389);
					literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
					setState(390);
					match(Identifier);
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
		enterRule(_localctx, 54, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(393);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral)
						| (1L << FloatingPointLiteral)
						| (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0))) {
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
				return ((GrammarVisitor<? extends T>) visitor)
						.visitType(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(395);
				primitiveType();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LBRACK) {
					{
						{
							setState(396);
							match(LBRACK);
							setState(397);
							match(RBRACK);
						}
					}
					setState(402);
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
				((GrammarListener) listener)
						.enterPrimitiveType(this);
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
		enterRule(_localctx, 58, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(403);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1)
						| (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6)
						| (1L << 7) | (1L << 9) | (1L << 13))) != 0))) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
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
			return 19 >= _localctx._p;

		case 13:
			return 18 >= _localctx._p;

		case 14:
			return 17 >= _localctx._p;

		case 15:
			return 15 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3g\u0198\4\2\t\2\4"
			+ "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
			+ "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
			+ "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\5\2@"
			+ "\n\2\3\2\3\2\5\2D\n\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\5\2M\n\2\3\2\7\2"
			+ "P\n\2\f\2\16\2S\13\2\3\2\5\2V\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4"
			+ "`\n\4\f\4\16\4c\13\4\3\4\3\4\3\5\3\5\3\5\5\5j\n\5\3\5\3\5\3\5\3\5\5\5"
			+ "p\n\5\3\6\3\6\3\6\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\7\3\7\3\b\3\b\3\b"
			+ "\3\b\5\b\u0082\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\t\3\t\3\t\3"
			+ "\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"
			+ "\u00a0\n\t\f\t\16\t\u00a3\13\t\3\t\7\t\u00a6\n\t\f\t\16\t\u00a9\13\t\3"
			+ "\t\3\t\3\t\3\t\5\t\u00af\n\t\3\t\3\t\3\t\5\t\u00b4\n\t\3\t\3\t\3\t\5\t"
			+ "\u00b9\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c3\n\t\3\n\6\n\u00c6"
			+ "\n\n\r\n\16\n\u00c7\3\n\6\n\u00cb\n\n\r\n\16\n\u00cc\3\13\3\13\3\13\3"
			+ "\13\3\13\3\13\5\13\u00d5\n\13\3\f\3\f\5\f\u00d9\n\f\3\f\3\f\5\f\u00dd"
			+ "\n\f\3\f\3\f\5\f\u00e1\n\f\5\f\u00e3\n\f\3\r\3\r\5\r\u00e7\n\r\3\16\3"
			+ "\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00f7"
			+ "\n\21\f\21\16\21\u00fa\13\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u0102"
			+ "\n\24\3\24\3\24\3\25\3\25\3\25\7\25\u0109\n\25\f\25\16\25\u010c\13\25"
			+ "\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u0114\n\27\f\27\16\27\u0117\13\27"
			+ "\3\30\3\30\3\30\3\30\3\30\5\30\u011e\n\30\3\30\3\30\3\31\3\31\3\32\3\32"
			+ "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0131\n\33"
			+ "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"
			+ "\5\33\u0141\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"
			+ "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"
			+ "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0166\n\33\3\33"
			+ "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"
			+ "\3\33\3\33\3\33\5\33\u017a\n\33\3\33\3\33\3\33\7\33\u017f\n\33\f\33\16"
			+ "\33\u0182\13\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u018a\n\34\3\35\3\35"
			+ "\3\36\3\36\3\36\7\36\u0191\n\36\f\36\16\36\u0194\13\36\3\37\3\37\3\37"
			+ "\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\f"
			+ "\3\2KN\3\2CD\4\2OPTT\3\2MN\4\2ABHI\4\2GGJJ\3\2ab\3\2KL\3\2\638\6\2\3\3"
			+ "\5\t\13\13\17\17\u01c6\2?\3\2\2\2\4W\3\2\2\2\6]\3\2\2\2\bf\3\2\2\2\nq"
			+ "\3\2\2\2\ft\3\2\2\2\16\u0081\3\2\2\2\20\u00c2\3\2\2\2\22\u00c5\3\2\2\2"
			+ "\24\u00d4\3\2\2\2\26\u00e2\3\2\2\2\30\u00e6\3\2\2\2\32\u00e8\3\2\2\2\34"
			+ "\u00ed\3\2\2\2\36\u00ef\3\2\2\2 \u00f3\3\2\2\2\"\u00fb\3\2\2\2$\u00fd"
			+ "\3\2\2\2&\u00ff\3\2\2\2(\u0105\3\2\2\2*\u010d\3\2\2\2,\u0110\3\2\2\2."
			+ "\u0118\3\2\2\2\60\u0121\3\2\2\2\62\u0123\3\2\2\2\64\u0130\3\2\2\2\66\u0189"
			+ "\3\2\2\28\u018b\3\2\2\2:\u018d\3\2\2\2<\u0195\3\2\2\2>@\7\23\2\2?>\3\2"
			+ "\2\2?@\3\2\2\2@A\3\2\2\2AC\5\4\3\2BD\7\24\2\2CB\3\2\2\2CD\3\2\2\2DH\3"
			+ "\2\2\2EG\5.\30\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3"
			+ "\2\2\2KM\7\25\2\2LK\3\2\2\2LM\3\2\2\2MQ\3\2\2\2NP\5\b\5\2ON\3\2\2\2PS"
			+ "\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TV\5\6\4\2UT\3\2\2\2U"
			+ "V\3\2\2\2V\3\3\2\2\2WX\7/\2\2XY\7,\2\2YZ\7U\2\2Z[\7a\2\2[\\\7U\2\2\\\5"
			+ "\3\2\2\2]a\7\22\2\2^`\5\16\b\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2"
			+ "bd\3\2\2\2ca\3\2\2\2de\7\16\2\2e\7\3\2\2\2fi\7&\2\2gj\5:\36\2hj\7\f\2"
			+ "\2ig\3\2\2\2ih\3\2\2\2jk\3\2\2\2kl\7a\2\2lo\5&\24\2mp\5\n\6\2np\7=\2\2"
			+ "om\3\2\2\2on\3\2\2\2p\t\3\2\2\2qr\5\f\7\2rs\7=\2\2s\13\3\2\2\2tx\7\31"
			+ "\2\2uw\5\16\b\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3"
			+ "\2\2\2{|\7!\2\2|\r\3\2\2\2}~\5.\30\2~\177\7=\2\2\177\u0082\3\2\2\2\u0080"
			+ "\u0082\5\20\t\2\u0081}\3\2\2\2\u0081\u0080\3\2\2\2\u0082\17\3\2\2\2\u0083"
			+ "\u00c3\5\f\7\2\u0084\u0085\7\'\2\2\u0085\u0086\5\36\20\2\u0086\u0089\5"
			+ "\20\t\2\u0087\u0088\7 \2\2\u0088\u008a\5\20\t\2\u0089\u0087\3\2\2\2\u0089"
			+ "\u008a\3\2\2\2\u008a\u00c3\3\2\2\2\u008b\u008c\7%\2\2\u008c\u008d\79\2"
			+ "\2\u008d\u008e\5\26\f\2\u008e\u008f\7:\2\2\u008f\u0090\5\20\t\2\u0090"
			+ "\u00c3\3\2\2\2\u0091\u0092\7\62\2\2\u0092\u0093\5\36\20\2\u0093\u0094"
			+ "\5\20\t\2\u0094\u00c3\3\2\2\2\u0095\u0096\7\37\2\2\u0096\u0097\5\20\t"
			+ "\2\u0097\u0098\7\62\2\2\u0098\u0099\5\36\20\2\u0099\u009a\7=\2\2\u009a"
			+ "\u00c3\3\2\2\2\u009b\u009c\7.\2\2\u009c\u009d\5\36\20\2\u009d\u00a1\7"
			+ "\r\2\2\u009e\u00a0\5\22\n\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"
			+ "\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a7\3\2\2\2\u00a3\u00a1\3\2"
			+ "\2\2\u00a4\u00a6\5\24\13\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"
			+ "\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2"
			+ "\2\2\u00aa\u00ab\7\4\2\2\u00ab\u00c3\3\2\2\2\u00ac\u00ae\7\20\2\2\u00ad"
			+ "\u00af\5\64\33\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3"
			+ "\2\2\2\u00b0\u00c3\7=\2\2\u00b1\u00b3\7\32\2\2\u00b2\u00b4\7b\2\2\u00b3"
			+ "\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00c3\7="
			+ "\2\2\u00b6\u00b8\7\36\2\2\u00b7\u00b9\7b\2\2\u00b8\u00b7\3\2\2\2\u00b8"
			+ "\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c3\7=\2\2\u00bb\u00c3\7=\2"
			+ "\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\7=\2\2\u00be\u00c3\3\2\2\2\u00bf\u00c0"
			+ "\7b\2\2\u00c0\u00c1\7F\2\2\u00c1\u00c3\5\20\t\2\u00c2\u0083\3\2\2\2\u00c2"
			+ "\u0084\3\2\2\2\u00c2\u008b\3\2\2\2\u00c2\u0091\3\2\2\2\u00c2\u0095\3\2"
			+ "\2\2\u00c2\u009b\3\2\2\2\u00c2\u00ac\3\2\2\2\u00c2\u00b1\3\2\2\2\u00c2"
			+ "\u00b6\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bf\3\2"
			+ "\2\2\u00c3\21\3\2\2\2\u00c4\u00c6\5\24\13\2\u00c5\u00c4\3\2\2\2\u00c6"
			+ "\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2"
			+ "\2\2\u00c9\u00cb\5\16\b\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"
			+ "\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\23\3\2\2\2\u00ce\u00cf\7\33\2"
			+ "\2\u00cf\u00d0\5$\23\2\u00d0\u00d1\7F\2\2\u00d1\u00d5\3\2\2\2\u00d2\u00d3"
			+ "\7\n\2\2\u00d3\u00d5\7F\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"
			+ "\25\3\2\2\2\u00d6\u00e3\5\32\16\2\u00d7\u00d9\5\30\r\2\u00d8\u00d7\3\2"
			+ "\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\7=\2\2\u00db"
			+ "\u00dd\5\64\33\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3"
			+ "\2\2\2\u00de\u00e0\7=\2\2\u00df\u00e1\5\34\17\2\u00e0\u00df\3\2\2\2\u00e0"
			+ "\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e2\u00d8\3\2"
			+ "\2\2\u00e3\27\3\2\2\2\u00e4\u00e7\5.\30\2\u00e5\u00e7\5 \21\2\u00e6\u00e4"
			+ "\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\31\3\2\2\2\u00e8\u00e9\5:\36\2\u00e9"
			+ "\u00ea\7b\2\2\u00ea\u00eb\7F\2\2\u00eb\u00ec\5\64\33\2\u00ec\33\3\2\2"
			+ "\2\u00ed\u00ee\5 \21\2\u00ee\35\3\2\2\2\u00ef\u00f0\79\2\2\u00f0\u00f1"
			+ "\5\64\33\2\u00f1\u00f2\7:\2\2\u00f2\37\3\2\2\2\u00f3\u00f8\5\64\33\2\u00f4"
			+ "\u00f5\7>\2\2\u00f5\u00f7\5\64\33\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3"
			+ "\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9!\3\2\2\2\u00fa\u00f8"
			+ "\3\2\2\2\u00fb\u00fc\5\64\33\2\u00fc#\3\2\2\2\u00fd\u00fe\5\64\33\2\u00fe"
			+ "%\3\2\2\2\u00ff\u0101\79\2\2\u0100\u0102\5(\25\2\u0101\u0100\3\2\2\2\u0101"
			+ "\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7:\2\2\u0104\'\3\2\2\2"
			+ "\u0105\u010a\5*\26\2\u0106\u0107\7>\2\2\u0107\u0109\5*\26\2\u0108\u0106"
			+ "\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"
			+ ")\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\5:\36\2\u010e\u010f\7b\2\2\u010f"
			+ "+\3\2\2\2\u0110\u0115\5.\30\2\u0111\u0112\7>\2\2\u0112\u0114\5.\30\2\u0113"
			+ "\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"
			+ "\2\2\u0116-\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7*\2\2\u0119\u011a"
			+ "\5:\36\2\u011a\u011d\5\60\31\2\u011b\u011c\7@\2\2\u011c\u011e\5\62\32"
			+ "\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120"
			+ "\7=\2\2\u0120/\3\2\2\2\u0121\u0122\7b\2\2\u0122\61\3\2\2\2\u0123\u0124"
			+ "\5\64\33\2\u0124\63\3\2\2\2\u0125\u0126\b\33\1\2\u0126\u0127\79\2\2\u0127"
			+ "\u0128\5:\36\2\u0128\u0129\7:\2\2\u0129\u012a\5\64\33\2\u012a\u0131\3"
			+ "\2\2\2\u012b\u012c\t\2\2\2\u012c\u0131\5\64\33\2\u012d\u012e\t\3\2\2\u012e"
			+ "\u0131\5\64\33\2\u012f\u0131\5\66\34\2\u0130\u0125\3\2\2\2\u0130\u012b"
			+ "\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u012f\3\2\2\2\u0131\u0180\3\2\2\2\u0132"
			+ "\u0133\6\33\2\3\u0133\u0134\t\4\2\2\u0134\u017f\5\64\33\2\u0135\u0136"
			+ "\6\33\3\3\u0136\u0137\t\5\2\2\u0137\u017f\5\64\33\2\u0138\u0140\6\33\4"
			+ "\3\u0139\u013a\7B\2\2\u013a\u0141\7B\2\2\u013b\u013c\7A\2\2\u013c\u013d"
			+ "\7A\2\2\u013d\u0141\7A\2\2\u013e\u013f\7A\2\2\u013f\u0141\7A\2\2\u0140"
			+ "\u0139\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\3\2"
			+ "\2\2\u0142\u017f\5\64\33\2\u0143\u0144\6\33\5\3\u0144\u0145\t\6\2\2\u0145"
			+ "\u017f\5\64\33\2\u0146\u0147\6\33\6\3\u0147\u0148\t\7\2\2\u0148\u017f"
			+ "\5\64\33\2\u0149\u014a\6\33\7\3\u014a\u014b\7Q\2\2\u014b\u017f\5\64\33"
			+ "\2\u014c\u014d\6\33\b\3\u014d\u014e\7S\2\2\u014e\u017f\5\64\33\2\u014f"
			+ "\u0150\6\33\t\3\u0150\u0151\7R\2\2\u0151\u017f\5\64\33\2\u0152\u0153\6"
			+ "\33\n\3\u0153\u0154\7\21\2\2\u0154\u017f\5\64\33\2\u0155\u0156\6\33\13"
			+ "\3\u0156\u0157\7+\2\2\u0157\u017f\5\64\33\2\u0158\u0165\6\33\f\3\u0159"
			+ "\u0166\7@\2\2\u015a\u0166\7V\2\2\u015b\u0166\7W\2\2\u015c\u0166\7X\2\2"
			+ "\u015d\u0166\7Y\2\2\u015e\u0166\7Z\2\2\u015f\u0166\7[\2\2\u0160\u0166"
			+ "\7\\\2\2\u0161\u0166\7_\2\2\u0162\u0166\7`\2\2\u0163\u0166\7^\2\2\u0164"
			+ "\u0166\7]\2\2\u0165\u0159\3\2\2\2\u0165\u015a\3\2\2\2\u0165\u015b\3\2"
			+ "\2\2\u0165\u015c\3\2\2\2\u0165\u015d\3\2\2\2\u0165\u015e\3\2\2\2\u0165"
			+ "\u015f\3\2\2\2\u0165\u0160\3\2\2\2\u0165\u0161\3\2\2\2\u0165\u0162\3\2"
			+ "\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"
			+ "\u017f\5\64\33\2\u0168\u0169\6\33\r\3\u0169\u016a\7E\2\2\u016a\u016b\5"
			+ "\64\33\2\u016b\u016c\7F\2\2\u016c\u016d\5\64\33\2\u016d\u017f\3\2\2\2"
			+ "\u016e\u016f\6\33\16\3\u016f\u0170\7?\2\2\u0170\u017f\t\b\2\2\u0171\u0172"
			+ "\6\33\17\3\u0172\u0173\7;\2\2\u0173\u0174\5\64\33\2\u0174\u0175\7<\2\2"
			+ "\u0175\u017f\3\2\2\2\u0176\u0177\6\33\20\3\u0177\u0179\79\2\2\u0178\u017a"
			+ "\5 \21\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b"
			+ "\u017f\7:\2\2\u017c\u017d\6\33\21\3\u017d\u017f\t\t\2\2\u017e\u0132\3"
			+ "\2\2\2\u017e\u0135\3\2\2\2\u017e\u0138\3\2\2\2\u017e\u0143\3\2\2\2\u017e"
			+ "\u0146\3\2\2\2\u017e\u0149\3\2\2\2\u017e\u014c\3\2\2\2\u017e\u014f\3\2"
			+ "\2\2\u017e\u0152\3\2\2\2\u017e\u0155\3\2\2\2\u017e\u0158\3\2\2\2\u017e"
			+ "\u0168\3\2\2\2\u017e\u016e\3\2\2\2\u017e\u0171\3\2\2\2\u017e\u0176\3\2"
			+ "\2\2\u017e\u017c\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"
			+ "\u0181\3\2\2\2\u0181\65\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\79\2\2"
			+ "\u0184\u0185\5\64\33\2\u0185\u0186\7:\2\2\u0186\u018a\3\2\2\2\u0187\u018a"
			+ "\58\35\2\u0188\u018a\7a\2\2\u0189\u0183\3\2\2\2\u0189\u0187\3\2\2\2\u0189"
			+ "\u0188\3\2\2\2\u018a\67\3\2\2\2\u018b\u018c\t\n\2\2\u018c9\3\2\2\2\u018d"
			+ "\u0192\5<\37\2\u018e\u018f\7;\2\2\u018f\u0191\7<\2\2\u0190\u018e\3\2\2"
			+ "\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193;"
			+ "\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\t\13\2\2\u0196=\3\2\2\2)?CHL"
			+ "QUaiox\u0081\u0089\u00a1\u00a7\u00ae\u00b3\u00b8\u00c2\u00c7\u00cc\u00d4"
			+ "\u00d8\u00dc\u00e0\u00e2\u00e6\u00f8\u0101\u010a\u0115\u011d\u0130\u0140"
			+ "\u0165\u0179\u017e\u0180\u0189\u0192";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
