package main;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class BaseListener implements GrammarListener {

	@Override
	public void enterVariableDeclarator(
			@NotNull AL_Parser.VariableDeclaratorContext ctx) {
		System.out.println("Start token: "+ctx.getStart().toString());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitVariableDeclarator(
			@NotNull AL_Parser.VariableDeclaratorContext ctx) {
		System.out.println("Start token: "+ctx.getStart().toString());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterExpression(@NotNull AL_Parser.ExpressionContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitExpression(@NotNull AL_Parser.ExpressionContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterVariableDeclaratorId(
			@NotNull AL_Parser.VariableDeclaratorIdContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitVariableDeclaratorId(
			@NotNull AL_Parser.VariableDeclaratorIdContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterFormalParameter(
			@NotNull AL_Parser.FormalParameterContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitFormalParameter(
			@NotNull AL_Parser.FormalParameterContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterMethodCall(@NotNull AL_Parser.MethodCallContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitMethodCall(@NotNull AL_Parser.MethodCallContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterExpressionList(@NotNull AL_Parser.ExpressionListContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitExpressionList(@NotNull AL_Parser.ExpressionListContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterStatementExpression(
			@NotNull AL_Parser.StatementExpressionContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitStatementExpression(
			@NotNull AL_Parser.StatementExpressionContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterVariableHeader(@NotNull AL_Parser.VariableHeaderContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitVariableHeader(@NotNull AL_Parser.VariableHeaderContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}
	

	@Override
	public void enterVariableInitializer(
			@NotNull AL_Parser.VariableInitializerContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitVariableInitializer(
			@NotNull AL_Parser.VariableInitializerContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterBlock(@NotNull AL_Parser.BlockContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitBlock(@NotNull AL_Parser.BlockContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterBlockStatement(@NotNull AL_Parser.BlockStatementContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitBlockStatement(@NotNull AL_Parser.BlockStatementContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterType(@NotNull AL_Parser.TypeContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitType(@NotNull AL_Parser.TypeContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterForUpdate(@NotNull AL_Parser.ForUpdateContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitForUpdate(@NotNull AL_Parser.ForUpdateContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterMainProgram(@NotNull AL_Parser.MainProgramContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitMainProgram(@NotNull AL_Parser.MainProgramContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterLocalVariableDeclarationStatement(
			@NotNull AL_Parser.LocalVariableDeclarationStatementContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitLocalVariableDeclarationStatement(
			@NotNull AL_Parser.LocalVariableDeclarationStatementContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterEnhancedForControl(
			@NotNull AL_Parser.EnhancedForControlContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitEnhancedForControl(
			@NotNull AL_Parser.EnhancedForControlContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterPrimary(@NotNull AL_Parser.PrimaryContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitPrimary(@NotNull AL_Parser.PrimaryContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterFormalParameterList(
			@NotNull AL_Parser.FormalParameterListContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitFormalParameterList(
			@NotNull AL_Parser.FormalParameterListContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterConstantlyDeclaration(
			@NotNull AL_Parser.ConstantlyDeclarationContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitConstantlyDeclaration(
			@NotNull AL_Parser.ConstantlyDeclarationContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterMethodDeclaration(
			@NotNull AL_Parser.MethodDeclarationContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitMethodDeclaration(
			@NotNull AL_Parser.MethodDeclarationContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterParExpression(@NotNull AL_Parser.ParExpressionContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitParExpression(@NotNull AL_Parser.ParExpressionContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterSwitchLabel(@NotNull AL_Parser.SwitchLabelContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitSwitchLabel(@NotNull AL_Parser.SwitchLabelContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterVariableIdentifier(
			@NotNull AL_Parser.VariableIdentifierContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitVariableIdentifier(
			@NotNull AL_Parser.VariableIdentifierContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterVariableDeclarators(
			@NotNull AL_Parser.VariableDeclaratorsContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitVariableDeclarators(
			@NotNull AL_Parser.VariableDeclaratorsContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterProgramHeader(@NotNull AL_Parser.ProgramHeaderContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitProgramHeader(@NotNull AL_Parser.ProgramHeaderContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterStatement(@NotNull AL_Parser.StatementContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitStatement(@NotNull AL_Parser.StatementContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterMethodHeader(@NotNull AL_Parser.MethodHeaderContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitMethodHeader(@NotNull AL_Parser.MethodHeaderContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterArguments(@NotNull AL_Parser.ArgumentsContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitArguments(@NotNull AL_Parser.ArgumentsContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterMethodBody(@NotNull AL_Parser.MethodBodyContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitMethodBody(@NotNull AL_Parser.MethodBodyContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterArrayInitializer(
			@NotNull AL_Parser.ArrayInitializerContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitArrayInitializer(
			@NotNull AL_Parser.ArrayInitializerContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterFormalParameters(
			@NotNull AL_Parser.FormalParametersContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitFormalParameters(
			@NotNull AL_Parser.FormalParametersContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterConstantExpression(
			@NotNull AL_Parser.ConstantExpressionContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitConstantExpression(
			@NotNull AL_Parser.ConstantExpressionContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterProgram(@NotNull AL_Parser.ProgramContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitProgram(@NotNull AL_Parser.ProgramContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterPrimitiveType(@NotNull AL_Parser.PrimitiveTypeContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitPrimitiveType(@NotNull AL_Parser.PrimitiveTypeContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterForControl(@NotNull AL_Parser.ForControlContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitForControl(@NotNull AL_Parser.ForControlContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterLastFormalParameter(
			@NotNull AL_Parser.LastFormalParameterContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitLastFormalParameter(
			@NotNull AL_Parser.LastFormalParameterContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterForInit(@NotNull AL_Parser.ForInitContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitForInit(@NotNull AL_Parser.ForInitContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterLocalVariableDeclaration(
			@NotNull AL_Parser.LocalVariableDeclarationContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitLocalVariableDeclaration(
			@NotNull AL_Parser.LocalVariableDeclarationContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterSwitchBlockStatementGroup(
			@NotNull AL_Parser.SwitchBlockStatementGroupContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitSwitchBlockStatementGroup(
			@NotNull AL_Parser.SwitchBlockStatementGroupContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterLiteral(@NotNull AL_Parser.LiteralContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitLiteral(@NotNull AL_Parser.LiteralContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void enterEveryRule(@NotNull ParserRuleContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void exitEveryRule(@NotNull ParserRuleContext ctx) {
		System.out.println("Start token: "+ctx.getStart());
		System.out.println("End token: "+ctx.getStop());
	}

	@Override
	public void visitErrorNode(@NotNull ErrorNode node) {
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// 
		
	}

}
