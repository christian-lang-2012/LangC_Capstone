package main;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AL_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull AL_Parser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#variableInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitialization(@NotNull AL_Parser.VariableInitializationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(@NotNull AL_Parser.FormalParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull AL_Parser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(@NotNull AL_Parser.StatementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull AL_Parser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull AL_Parser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull AL_Parser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#variableDeclarationID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationID(@NotNull AL_Parser.VariableDeclarationIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#mainProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProgram(@NotNull AL_Parser.MainProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(@NotNull AL_Parser.ForUpdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull AL_Parser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(@NotNull AL_Parser.EnhancedForControlContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull AL_Parser.PrimaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(@NotNull AL_Parser.FormalParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull AL_Parser.MethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#programDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramDeclaration(@NotNull AL_Parser.ProgramDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(@NotNull AL_Parser.ParExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(@NotNull AL_Parser.SwitchLabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(@NotNull AL_Parser.VariableDeclaratorsContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull AL_Parser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(@NotNull AL_Parser.MethodBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(@NotNull AL_Parser.FormalParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull AL_Parser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull AL_Parser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(@NotNull AL_Parser.ConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(@NotNull AL_Parser.ForControlContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(@NotNull AL_Parser.ForInitContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull AL_Parser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link AL_Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(@NotNull AL_Parser.SwitchBlockStatementGroupContext ctx);
}
