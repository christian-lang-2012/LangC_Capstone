package main;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class BaseListener implements GrammarListener {

	@Override
	public void enterExpression(@NotNull AL_Parser.ExpressionContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitExpression(@NotNull AL_Parser.ExpressionContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterVariableInitialization(
			@NotNull AL_Parser.VariableInitializationContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitVariableInitialization(
			@NotNull AL_Parser.VariableInitializationContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterFormalParameter(
			@NotNull AL_Parser.FormalParameterContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitFormalParameter(
			@NotNull AL_Parser.FormalParameterContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterExpressionList(@NotNull AL_Parser.ExpressionListContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitExpressionList(@NotNull AL_Parser.ExpressionListContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterStatementExpression(
			@NotNull AL_Parser.StatementExpressionContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitStatementExpression(
			@NotNull AL_Parser.StatementExpressionContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterBlock(@NotNull AL_Parser.BlockContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitBlock(@NotNull AL_Parser.BlockContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterBlockStatement(@NotNull AL_Parser.BlockStatementContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitBlockStatement(@NotNull AL_Parser.BlockStatementContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterType(@NotNull AL_Parser.TypeContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitType(@NotNull AL_Parser.TypeContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterVariableDeclarationID(
			@NotNull AL_Parser.VariableDeclarationIDContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitVariableDeclarationID(
			@NotNull AL_Parser.VariableDeclarationIDContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterMainProgram(@NotNull AL_Parser.MainProgramContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitMainProgram(@NotNull AL_Parser.MainProgramContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterForUpdate(@NotNull AL_Parser.ForUpdateContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitForUpdate(@NotNull AL_Parser.ForUpdateContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterVariableDeclaration(
			@NotNull AL_Parser.VariableDeclarationContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitVariableDeclaration(
			@NotNull AL_Parser.VariableDeclarationContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterEnhancedForControl(
			@NotNull AL_Parser.EnhancedForControlContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitEnhancedForControl(
			@NotNull AL_Parser.EnhancedForControlContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterPrimary(@NotNull AL_Parser.PrimaryContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitPrimary(@NotNull AL_Parser.PrimaryContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterFormalParameterList(
			@NotNull AL_Parser.FormalParameterListContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitFormalParameterList(
			@NotNull AL_Parser.FormalParameterListContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterMethodDeclaration(
			@NotNull AL_Parser.MethodDeclarationContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitMethodDeclaration(
			@NotNull AL_Parser.MethodDeclarationContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterProgramDeclaration(
			@NotNull AL_Parser.ProgramDeclarationContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitProgramDeclaration(
			@NotNull AL_Parser.ProgramDeclarationContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterParExpression(@NotNull AL_Parser.ParExpressionContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitParExpression(@NotNull AL_Parser.ParExpressionContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterSwitchLabel(@NotNull AL_Parser.SwitchLabelContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitSwitchLabel(@NotNull AL_Parser.SwitchLabelContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterVariableDeclarators(
			@NotNull AL_Parser.VariableDeclaratorsContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitVariableDeclarators(
			@NotNull AL_Parser.VariableDeclaratorsContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterStatement(@NotNull AL_Parser.StatementContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitStatement(@NotNull AL_Parser.StatementContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterMethodBody(@NotNull AL_Parser.MethodBodyContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitMethodBody(@NotNull AL_Parser.MethodBodyContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterFormalParameters(
			@NotNull AL_Parser.FormalParametersContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitFormalParameters(
			@NotNull AL_Parser.FormalParametersContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterPrimitiveType(@NotNull AL_Parser.PrimitiveTypeContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitPrimitiveType(@NotNull AL_Parser.PrimitiveTypeContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterProgram(@NotNull AL_Parser.ProgramContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitProgram(@NotNull AL_Parser.ProgramContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterConstantExpression(
			@NotNull AL_Parser.ConstantExpressionContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitConstantExpression(
			@NotNull AL_Parser.ConstantExpressionContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterForControl(@NotNull AL_Parser.ForControlContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitForControl(@NotNull AL_Parser.ForControlContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterForInit(@NotNull AL_Parser.ForInitContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitForInit(@NotNull AL_Parser.ForInitContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterLiteral(@NotNull AL_Parser.LiteralContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitLiteral(@NotNull AL_Parser.LiteralContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterSwitchBlockStatementGroup(
			@NotNull AL_Parser.SwitchBlockStatementGroupContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitSwitchBlockStatementGroup(
			@NotNull AL_Parser.SwitchBlockStatementGroupContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void enterEveryRule(@NotNull ParserRuleContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void exitEveryRule(@NotNull ParserRuleContext ctx) {
		System.out.println("Start"+ctx.getStart());
	}

	@Override
	public void visitTerminal(@NotNull TerminalNode node) {
	}

	@Override
	public void visitErrorNode(@NotNull ErrorNode node) {
	}

}
