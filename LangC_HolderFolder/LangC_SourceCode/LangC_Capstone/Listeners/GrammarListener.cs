﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4;

namespace LangC_Capstone.Listeners
{
    public class GrammarListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull AL_CombinedGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull AL_CombinedGrammarParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#variableInitialization}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitialization(@NotNull AL_CombinedGrammarParser.VariableInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#variableInitialization}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitialization(@NotNull AL_CombinedGrammarParser.VariableInitializationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull AL_CombinedGrammarParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull AL_CombinedGrammarParser.FormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull AL_CombinedGrammarParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull AL_CombinedGrammarParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull AL_CombinedGrammarParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull AL_CombinedGrammarParser.StatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull AL_CombinedGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull AL_CombinedGrammarParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull AL_CombinedGrammarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull AL_CombinedGrammarParser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull AL_CombinedGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull AL_CombinedGrammarParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#variableDeclarationID}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationID(@NotNull AL_CombinedGrammarParser.VariableDeclarationIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#variableDeclarationID}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationID(@NotNull AL_CombinedGrammarParser.VariableDeclarationIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void enterMainProgram(@NotNull AL_CombinedGrammarParser.MainProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void exitMainProgram(@NotNull AL_CombinedGrammarParser.MainProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull AL_CombinedGrammarParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull AL_CombinedGrammarParser.ForUpdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull AL_CombinedGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull AL_CombinedGrammarParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(@NotNull AL_CombinedGrammarParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(@NotNull AL_CombinedGrammarParser.EnhancedForControlContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull AL_CombinedGrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull AL_CombinedGrammarParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull AL_CombinedGrammarParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull AL_CombinedGrammarParser.FormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull AL_CombinedGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull AL_CombinedGrammarParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#programDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProgramDeclaration(@NotNull AL_CombinedGrammarParser.ProgramDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#programDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProgramDeclaration(@NotNull AL_CombinedGrammarParser.ProgramDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull AL_CombinedGrammarParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull AL_CombinedGrammarParser.ParExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull AL_CombinedGrammarParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull AL_CombinedGrammarParser.SwitchLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull AL_CombinedGrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull AL_CombinedGrammarParser.VariableDeclaratorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull AL_CombinedGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull AL_CombinedGrammarParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull AL_CombinedGrammarParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull AL_CombinedGrammarParser.MethodBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull AL_CombinedGrammarParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull AL_CombinedGrammarParser.FormalParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull AL_CombinedGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull AL_CombinedGrammarParser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull AL_CombinedGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull AL_CombinedGrammarParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull AL_CombinedGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull AL_CombinedGrammarParser.ConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull AL_CombinedGrammarParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull AL_CombinedGrammarParser.ForControlContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull AL_CombinedGrammarParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull AL_CombinedGrammarParser.ForInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull AL_CombinedGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull AL_CombinedGrammarParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link AL_CombinedGrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull AL_CombinedGrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link AL_CombinedGrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull AL_CombinedGrammarParser.SwitchBlockStatementGroupContext ctx);
    }
}
