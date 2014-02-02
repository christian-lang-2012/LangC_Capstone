﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LangC_Capstone.Listeners
{
    class BaseListener : AL_CombinedGrammarListener {
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterExpression(@NotNull AL_CombinedGrammarParser.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitExpression(@NotNull AL_CombinedGrammarParser.ExpressionContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVariableInitialization(@NotNull AL_CombinedGrammarParser.VariableInitializationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVariableInitialization(@NotNull AL_CombinedGrammarParser.VariableInitializationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFormalParameter(@NotNull AL_CombinedGrammarParser.FormalParameterContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFormalParameter(@NotNull AL_CombinedGrammarParser.FormalParameterContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterExpressionList(@NotNull AL_CombinedGrammarParser.ExpressionListContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitExpressionList(@NotNull AL_CombinedGrammarParser.ExpressionListContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterStatementExpression(@NotNull AL_CombinedGrammarParser.StatementExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitStatementExpression(@NotNull AL_CombinedGrammarParser.StatementExpressionContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterBlock(@NotNull AL_CombinedGrammarParser.BlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitBlock(@NotNull AL_CombinedGrammarParser.BlockContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterBlockStatement(@NotNull AL_CombinedGrammarParser.BlockStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitBlockStatement(@NotNull AL_CombinedGrammarParser.BlockStatementContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterType(@NotNull AL_CombinedGrammarParser.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitType(@NotNull AL_CombinedGrammarParser.TypeContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVariableDeclarationID(@NotNull AL_CombinedGrammarParser.VariableDeclarationIDContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVariableDeclarationID(@NotNull AL_CombinedGrammarParser.VariableDeclarationIDContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMainProgram(@NotNull AL_CombinedGrammarParser.MainProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMainProgram(@NotNull AL_CombinedGrammarParser.MainProgramContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterForUpdate(@NotNull AL_CombinedGrammarParser.ForUpdateContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitForUpdate(@NotNull AL_CombinedGrammarParser.ForUpdateContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVariableDeclaration(@NotNull AL_CombinedGrammarParser.VariableDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVariableDeclaration(@NotNull AL_CombinedGrammarParser.VariableDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEnhancedForControl(@NotNull AL_CombinedGrammarParser.EnhancedForControlContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEnhancedForControl(@NotNull AL_CombinedGrammarParser.EnhancedForControlContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterPrimary(@NotNull AL_CombinedGrammarParser.PrimaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitPrimary(@NotNull AL_CombinedGrammarParser.PrimaryContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFormalParameterList(@NotNull AL_CombinedGrammarParser.FormalParameterListContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFormalParameterList(@NotNull AL_CombinedGrammarParser.FormalParameterListContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMethodDeclaration(@NotNull AL_CombinedGrammarParser.MethodDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMethodDeclaration(@NotNull AL_CombinedGrammarParser.MethodDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterProgramDeclaration(@NotNull AL_CombinedGrammarParser.ProgramDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitProgramDeclaration(@NotNull AL_CombinedGrammarParser.ProgramDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterParExpression(@NotNull AL_CombinedGrammarParser.ParExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitParExpression(@NotNull AL_CombinedGrammarParser.ParExpressionContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterSwitchLabel(@NotNull AL_CombinedGrammarParser.SwitchLabelContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitSwitchLabel(@NotNull AL_CombinedGrammarParser.SwitchLabelContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVariableDeclarators(@NotNull AL_CombinedGrammarParser.VariableDeclaratorsContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVariableDeclarators(@NotNull AL_CombinedGrammarParser.VariableDeclaratorsContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterStatement(@NotNull AL_CombinedGrammarParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitStatement(@NotNull AL_CombinedGrammarParser.StatementContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMethodBody(@NotNull AL_CombinedGrammarParser.MethodBodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMethodBody(@NotNull AL_CombinedGrammarParser.MethodBodyContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFormalParameters(@NotNull AL_CombinedGrammarParser.FormalParametersContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFormalParameters(@NotNull AL_CombinedGrammarParser.FormalParametersContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterPrimitiveType(@NotNull AL_CombinedGrammarParser.PrimitiveTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitPrimitiveType(@NotNull AL_CombinedGrammarParser.PrimitiveTypeContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterProgram(@NotNull AL_CombinedGrammarParser.ProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitProgram(@NotNull AL_CombinedGrammarParser.ProgramContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterConstantExpression(@NotNull AL_CombinedGrammarParser.ConstantExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitConstantExpression(@NotNull AL_CombinedGrammarParser.ConstantExpressionContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterForControl(@NotNull AL_CombinedGrammarParser.ForControlContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitForControl(@NotNull AL_CombinedGrammarParser.ForControlContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterForInit(@NotNull AL_CombinedGrammarParser.ForInitContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitForInit(@NotNull AL_CombinedGrammarParser.ForInitContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterLiteral(@NotNull AL_CombinedGrammarParser.LiteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitLiteral(@NotNull AL_CombinedGrammarParser.LiteralContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterSwitchBlockStatementGroup(@NotNull AL_CombinedGrammarParser.SwitchBlockStatementGroupContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitSwitchBlockStatementGroup(@NotNull AL_CombinedGrammarParser.SwitchBlockStatementGroupContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitTerminal(@NotNull TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitErrorNode(@NotNull ErrorNode node) { }

    }
}
