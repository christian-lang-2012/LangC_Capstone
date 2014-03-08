package main;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class BaseListener implements GrammarListener {

	@Override
	public void enterVariableDeclarator(
			@NotNull AL_Parser.VariableDeclaratorContext ctx) {
	}

	@Override
	public void exitVariableDeclarator(
			@NotNull AL_Parser.VariableDeclaratorContext ctx) {
	}

	@Override
	public void enterExpression(@NotNull AL_Parser.ExpressionContext ctx) {
	}

	@Override
	public void exitExpression(@NotNull AL_Parser.ExpressionContext ctx) {
	}

	@Override
	public void enterVariableDeclaratorId(
			@NotNull AL_Parser.VariableDeclaratorIdContext ctx) {
	}

	@Override
	public void exitVariableDeclaratorId(
			@NotNull AL_Parser.VariableDeclaratorIdContext ctx) {
	}

	@Override
	public void enterFormalParameter(
			@NotNull AL_Parser.FormalParameterContext ctx) {
	}

	@Override
	public void exitFormalParameter(
			@NotNull AL_Parser.FormalParameterContext ctx) {
	}

	@Override
	public void enterMethodCall(@NotNull AL_Parser.MethodCallContext ctx) {
	}

	@Override
	public void exitMethodCall(@NotNull AL_Parser.MethodCallContext ctx) {
	}

	@Override
	public void enterExpressionList(@NotNull AL_Parser.ExpressionListContext ctx) {
	}

	@Override
	public void exitExpressionList(@NotNull AL_Parser.ExpressionListContext ctx) {
	}

	@Override
	public void enterStatementExpression(
			@NotNull AL_Parser.StatementExpressionContext ctx) {
	}

	@Override
	public void exitStatementExpression(
			@NotNull AL_Parser.StatementExpressionContext ctx) {
	}

	@Override
	public void enterVariableHeader(@NotNull AL_Parser.VariableHeaderContext ctx) {
	}

	@Override
	public void exitVariableHeader(@NotNull AL_Parser.VariableHeaderContext ctx) {
	}

	@Override
	public void enterVariableInitializer(
			@NotNull AL_Parser.VariableInitializerContext ctx) {
	}

	@Override
	public void exitVariableInitializer(
			@NotNull AL_Parser.VariableInitializerContext ctx) {
	}

	@Override
	public void enterBlock(@NotNull AL_Parser.BlockContext ctx) {
	}

	@Override
	public void exitBlock(@NotNull AL_Parser.BlockContext ctx) {
	}

	@Override
	public void enterBlockStatement(@NotNull AL_Parser.BlockStatementContext ctx) {
	}

	@Override
	public void exitBlockStatement(@NotNull AL_Parser.BlockStatementContext ctx) {
	}

	@Override
	public void enterType(@NotNull AL_Parser.TypeContext ctx) {
	}

	@Override
	public void exitType(@NotNull AL_Parser.TypeContext ctx) {
	}

	@Override
	public void enterForUpdate(@NotNull AL_Parser.ForUpdateContext ctx) {
	}

	@Override
	public void exitForUpdate(@NotNull AL_Parser.ForUpdateContext ctx) {
	}

	@Override
	public void enterMainProgram(@NotNull AL_Parser.MainProgramContext ctx) {
	}

	@Override
	public void exitMainProgram(@NotNull AL_Parser.MainProgramContext ctx) {
	}

	@Override
	public void enterLocalVariableDeclarationStatement(
			@NotNull AL_Parser.LocalVariableDeclarationStatementContext ctx) {
	}

	@Override
	public void exitLocalVariableDeclarationStatement(
			@NotNull AL_Parser.LocalVariableDeclarationStatementContext ctx) {
	}

	@Override
	public void enterEnhancedForControl(
			@NotNull AL_Parser.EnhancedForControlContext ctx) {
	}

	@Override
	public void exitEnhancedForControl(
			@NotNull AL_Parser.EnhancedForControlContext ctx) {
	}

	@Override
	public void enterPrimary(@NotNull AL_Parser.PrimaryContext ctx) {
	}

	@Override
	public void exitPrimary(@NotNull AL_Parser.PrimaryContext ctx) {
	}

	@Override
	public void enterFormalParameterList(
			@NotNull AL_Parser.FormalParameterListContext ctx) {
	}

	@Override
	public void exitFormalParameterList(
			@NotNull AL_Parser.FormalParameterListContext ctx) {
	}

	@Override
	public void enterConstantlyDeclaration(
			@NotNull AL_Parser.ConstantlyDeclarationContext ctx) {
	}

	@Override
	public void exitConstantlyDeclaration(
			@NotNull AL_Parser.ConstantlyDeclarationContext ctx) {
	}

	@Override
	public void enterMethodDeclaration(
			@NotNull AL_Parser.MethodDeclarationContext ctx) {
	}

	@Override
	public void exitMethodDeclaration(
			@NotNull AL_Parser.MethodDeclarationContext ctx) {
	}

	@Override
	public void enterParExpression(@NotNull AL_Parser.ParExpressionContext ctx) {
	}

	@Override
	public void exitParExpression(@NotNull AL_Parser.ParExpressionContext ctx) {
	}

	@Override
	public void enterSwitchLabel(@NotNull AL_Parser.SwitchLabelContext ctx) {
	}

	@Override
	public void exitSwitchLabel(@NotNull AL_Parser.SwitchLabelContext ctx) {
	}

	@Override
	public void enterVariableIdentifier(
			@NotNull AL_Parser.VariableIdentifierContext ctx) {
	}

	@Override
	public void exitVariableIdentifier(
			@NotNull AL_Parser.VariableIdentifierContext ctx) {
	}

	@Override
	public void enterVariableDeclarators(
			@NotNull AL_Parser.VariableDeclaratorsContext ctx) {
	}

	@Override
	public void exitVariableDeclarators(
			@NotNull AL_Parser.VariableDeclaratorsContext ctx) {
	}

	@Override
	public void enterProgramHeader(@NotNull AL_Parser.ProgramHeaderContext ctx) {
	}

	@Override
	public void exitProgramHeader(@NotNull AL_Parser.ProgramHeaderContext ctx) {
	}

	@Override
	public void enterStatement(@NotNull AL_Parser.StatementContext ctx) {
	}

	@Override
	public void exitStatement(@NotNull AL_Parser.StatementContext ctx) {
	}

	@Override
	public void enterMethodHeader(@NotNull AL_Parser.MethodHeaderContext ctx) {
	}

	@Override
	public void exitMethodHeader(@NotNull AL_Parser.MethodHeaderContext ctx) {
	}

	@Override
	public void enterArguments(@NotNull AL_Parser.ArgumentsContext ctx) {
	}

	@Override
	public void exitArguments(@NotNull AL_Parser.ArgumentsContext ctx) {
	}

	@Override
	public void enterMethodBody(@NotNull AL_Parser.MethodBodyContext ctx) {
	}

	@Override
	public void exitMethodBody(@NotNull AL_Parser.MethodBodyContext ctx) {
	}

	@Override
	public void enterArrayInitializer(
			@NotNull AL_Parser.ArrayInitializerContext ctx) {
	}

	@Override
	public void exitArrayInitializer(
			@NotNull AL_Parser.ArrayInitializerContext ctx) {
	}

	@Override
	public void enterFormalParameters(
			@NotNull AL_Parser.FormalParametersContext ctx) {
	}

	@Override
	public void exitFormalParameters(
			@NotNull AL_Parser.FormalParametersContext ctx) {
	}

	@Override
	public void enterConstantExpression(
			@NotNull AL_Parser.ConstantExpressionContext ctx) {
	}

	@Override
	public void exitConstantExpression(
			@NotNull AL_Parser.ConstantExpressionContext ctx) {
	}

	@Override
	public void enterProgram(@NotNull AL_Parser.ProgramContext ctx) {
	}

	@Override
	public void exitProgram(@NotNull AL_Parser.ProgramContext ctx) {
	}

	@Override
	public void enterPrimitiveType(@NotNull AL_Parser.PrimitiveTypeContext ctx) {
	}

	@Override
	public void exitPrimitiveType(@NotNull AL_Parser.PrimitiveTypeContext ctx) {
	}

	@Override
	public void enterForControl(@NotNull AL_Parser.ForControlContext ctx) {
	}

	@Override
	public void exitForControl(@NotNull AL_Parser.ForControlContext ctx) {
	}

	@Override
	public void enterLastFormalParameter(
			@NotNull AL_Parser.LastFormalParameterContext ctx) {
	}

	@Override
	public void exitLastFormalParameter(
			@NotNull AL_Parser.LastFormalParameterContext ctx) {
	}

	@Override
	public void enterForInit(@NotNull AL_Parser.ForInitContext ctx) {
	}

	@Override
	public void exitForInit(@NotNull AL_Parser.ForInitContext ctx) {
	}

	@Override
	public void enterLocalVariableDeclaration(
			@NotNull AL_Parser.LocalVariableDeclarationContext ctx) {
	}

	@Override
	public void exitLocalVariableDeclaration(
			@NotNull AL_Parser.LocalVariableDeclarationContext ctx) {
	}

	@Override
	public void enterSwitchBlockStatementGroup(
			@NotNull AL_Parser.SwitchBlockStatementGroupContext ctx) {
	}

	@Override
	public void exitSwitchBlockStatementGroup(
			@NotNull AL_Parser.SwitchBlockStatementGroupContext ctx) {
	}

	@Override
	public void enterLiteral(@NotNull AL_Parser.LiteralContext ctx) {
	}

	@Override
	public void exitLiteral(@NotNull AL_Parser.LiteralContext ctx) {
	}

	@Override
	public void enterEveryRule(@NotNull ParserRuleContext ctx) {
	}

	@Override
	public void exitEveryRule(@NotNull ParserRuleContext ctx) {
	}

	@Override
	public void visitErrorNode(@NotNull ErrorNode node) {
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// 
		
	}

}
