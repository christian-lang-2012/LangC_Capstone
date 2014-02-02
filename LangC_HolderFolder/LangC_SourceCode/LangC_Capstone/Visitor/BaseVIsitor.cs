using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using LangC_Capstone.Contexts;

namespace LangC_Capstone.Visitor
{
    public class BaseVIsitor : GrammarVisitor, AbstractParseTreeVisitor<T> {

	public override T visitExpression(ExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitVariableInitialization(@NotNull AL_CombinedGrammarParser.VariableInitializationContext ctx) { return visitChildren(ctx); }

	@Override public T visitFormalParameter(@NotNull AL_CombinedGrammarParser.FormalParameterContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpressionList(@NotNull AL_CombinedGrammarParser.ExpressionListContext ctx) { return visitChildren(ctx); }

	@Override public T visitStatementExpression(@NotNull AL_CombinedGrammarParser.StatementExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitBlock(@NotNull AL_CombinedGrammarParser.BlockContext ctx) { return visitChildren(ctx); }

	@Override public T visitBlockStatement(@NotNull AL_CombinedGrammarParser.BlockStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitType(@NotNull AL_CombinedGrammarParser.TypeContext ctx) { return visitChildren(ctx); }

	@Override public T visitVariableDeclarationID(@NotNull AL_CombinedGrammarParser.VariableDeclarationIDContext ctx) { return visitChildren(ctx); }

	@Override public T visitMainProgram(@NotNull AL_CombinedGrammarParser.MainProgramContext ctx) { return visitChildren(ctx); }

	@Override public T visitForUpdate(@NotNull AL_CombinedGrammarParser.ForUpdateContext ctx) { return visitChildren(ctx); }

	@Override public T visitVariableDeclaration(@NotNull AL_CombinedGrammarParser.VariableDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitEnhancedForControl(@NotNull AL_CombinedGrammarParser.EnhancedForControlContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrimary(@NotNull AL_CombinedGrammarParser.PrimaryContext ctx) { return visitChildren(ctx); }

	@Override public T visitFormalParameterList(@NotNull AL_CombinedGrammarParser.FormalParameterListContext ctx) { return visitChildren(ctx); }

	@Override public T visitMethodDeclaration(@NotNull AL_CombinedGrammarParser.MethodDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitProgramDeclaration(@NotNull AL_CombinedGrammarParser.ProgramDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitParExpression(@NotNull AL_CombinedGrammarParser.ParExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitSwitchLabel(@NotNull AL_CombinedGrammarParser.SwitchLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitVariableDeclarators(@NotNull AL_CombinedGrammarParser.VariableDeclaratorsContext ctx) { return visitChildren(ctx); }

	@Override public T visitStatement(@NotNull AL_CombinedGrammarParser.StatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitMethodBody(@NotNull AL_CombinedGrammarParser.MethodBodyContext ctx) { return visitChildren(ctx); }

	@Override public T visitFormalParameters(@NotNull AL_CombinedGrammarParser.FormalParametersContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrimitiveType(@NotNull AL_CombinedGrammarParser.PrimitiveTypeContext ctx) { return visitChildren(ctx); }

	@Override public T visitProgram(@NotNull AL_CombinedGrammarParser.ProgramContext ctx) { return visitChildren(ctx); }

	@Override public T visitConstantExpression(@NotNull AL_CombinedGrammarParser.ConstantExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitForControl(@NotNull AL_CombinedGrammarParser.ForControlContext ctx) { return visitChildren(ctx); }

	@Override public T visitForInit(@NotNull AL_CombinedGrammarParser.ForInitContext ctx) { return visitChildren(ctx); }

	@Override public T visitLiteral(@NotNull AL_CombinedGrammarParser.LiteralContext ctx) { return visitChildren(ctx); }

	@Override public T visitSwitchBlockStatementGroup(@NotNull AL_CombinedGrammarParser.SwitchBlockStatementGroupContext ctx) { return visitChildren(ctx); }

}
