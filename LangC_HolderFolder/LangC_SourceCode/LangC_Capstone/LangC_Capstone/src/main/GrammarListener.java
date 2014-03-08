package main;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ALCombinedGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull AL_Parser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull AL_Parser.VariableDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull AL_Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull AL_Parser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull AL_Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull AL_Parser.VariableDeclaratorIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull AL_Parser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull AL_Parser.FormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(@NotNull AL_Parser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(@NotNull AL_Parser.MethodCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull AL_Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull AL_Parser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull AL_Parser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull AL_Parser.StatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#variableHeader}.
	 * @param ctx the parse tree
	 */
	void enterVariableHeader(@NotNull AL_Parser.VariableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#variableHeader}.
	 * @param ctx the parse tree
	 */
	void exitVariableHeader(@NotNull AL_Parser.VariableHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull AL_Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull AL_Parser.VariableInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull AL_Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull AL_Parser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull AL_Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull AL_Parser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull AL_Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull AL_Parser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull AL_Parser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull AL_Parser.ForUpdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void enterMainProgram(@NotNull AL_Parser.MainProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void exitMainProgram(@NotNull AL_Parser.MainProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull AL_Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull AL_Parser.LocalVariableDeclarationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(@NotNull AL_Parser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(@NotNull AL_Parser.EnhancedForControlContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull AL_Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull AL_Parser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull AL_Parser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull AL_Parser.FormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#constantlyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantlyDeclaration(@NotNull AL_Parser.ConstantlyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#constantlyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantlyDeclaration(@NotNull AL_Parser.ConstantlyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull AL_Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull AL_Parser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull AL_Parser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull AL_Parser.ParExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull AL_Parser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull AL_Parser.SwitchLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(@NotNull AL_Parser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(@NotNull AL_Parser.VariableIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull AL_Parser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull AL_Parser.VariableDeclaratorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#programHeader}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeader(@NotNull AL_Parser.ProgramHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#programHeader}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeader(@NotNull AL_Parser.ProgramHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull AL_Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull AL_Parser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(@NotNull AL_Parser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(@NotNull AL_Parser.MethodHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull AL_Parser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull AL_Parser.ArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull AL_Parser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull AL_Parser.MethodBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull AL_Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull AL_Parser.ArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull AL_Parser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull AL_Parser.FormalParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull AL_Parser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull AL_Parser.ConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull AL_Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull AL_Parser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull AL_Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull AL_Parser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull AL_Parser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull AL_Parser.ForControlContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(@NotNull AL_Parser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(@NotNull AL_Parser.LastFormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull AL_Parser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull AL_Parser.ForInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull AL_Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull AL_Parser.LocalVariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull AL_Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull AL_Parser.SwitchBlockStatementGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull AL_Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull AL_Parser.LiteralContext ctx);
}
