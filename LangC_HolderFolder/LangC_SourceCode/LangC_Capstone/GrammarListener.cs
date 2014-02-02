using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Tree;

namespace LangC_Capstone
{
    public interface GrammarListener : IParseTreeListener
    {
        /**
	 * Enter a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull AL_Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull Parser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#variableInitialization}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitialization(@NotNull Parser.VariableInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableInitialization}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitialization(@NotNull Parser.VariableInitializationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull Parser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull Parser.FormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull Parser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull Parser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull Parser.StatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull Parser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull Parser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull Parser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#variableDeclarationID}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationID(@NotNull Parser.VariableDeclarationIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableDeclarationID}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationID(@NotNull Parser.VariableDeclarationIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void enterMainProgram(@NotNull Parser.MainProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void exitMainProgram(@NotNull Parser.MainProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull Parser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull Parser.ForUpdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull Parser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(@NotNull Parser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(@NotNull Parser.EnhancedForControlContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull Parser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull Parser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull Parser.FormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull Parser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#programDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProgramDeclaration(@NotNull Parser.ProgramDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#programDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProgramDeclaration(@NotNull Parser.ProgramDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull Parser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull Parser.ParExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull Parser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull Parser.SwitchLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull Parser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull Parser.VariableDeclaratorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull Parser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull Parser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull Parser.MethodBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull Parser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull Parser.FormalParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull Parser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull Parser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull Parser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull Parser.ConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull Parser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull Parser.ForControlContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull Parser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull Parser.ForInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull Parser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull Parser.SwitchBlockStatementGroupContext ctx);
    }
}
