using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4;
using Antlr4.Runtime.Tree;
using LangC_Capstone.Contexts;

namespace LangC_Capstone.Listeners
{
    public abstract class GrammarListener : IParseTreeListener
    {

        public abstract void EnterExpression(ExpressionContext ctx);

        public abstract void ExitExpression(ExpressionContext ctx);

        public abstract void EnterVariableInitialization(VariableInitializationContext ctx);

        public abstract void ExitVariableInitialization(VariableInitializationContext ctx);

        public abstract void EnterFormalParameter(FormalParameterContext ctx);

        public abstract void ExitFormalParameter(FormalParameterContext ctx);

        public abstract void EnterExpressionList(ExpressionListContext ctx);

        public abstract void ExitExpressionList(ExpressionListContext ctx);

        public abstract void EnterStatementExpression(StatementExpressionContext ctx);

        public abstract void ExitStatementExpression(StatementExpressionContext ctx);

        public abstract void EnterBlock(BlockContext ctx);

        public abstract void ExitBlock(BlockContext ctx);

        public abstract void EnterBlockStatement(BlockStatementContext ctx);

        public abstract void ExitBlockStatement(BlockStatementContext ctx);

        public abstract void EnterType(TypeContext ctx);

        public abstract void ExitType(TypeContext ctx);

        public abstract void EnterVariableDeclarationID(VariableDeclarationIDContext ctx);

        public abstract void ExitVariableDeclarationID(VariableDeclarationIDContext ctx);

        public abstract void EnterMainProgram(MainProgramContext ctx);

        public abstract void ExitMainProgram(MainProgramContext ctx);

        public abstract void EnterForUpdate(ForUpdateContext ctx);

        public abstract void ExitForUpdate(ForUpdateContext ctx);

        public abstract void EnterVariableDeclaration(VariableDeclarationContext ctx);

        public abstract void ExitVariableDeclaration(VariableDeclarationContext ctx);

        public abstract void EnterEnhancedForControl(EnhancedForControlContext ctx);

        public abstract void ExitEnhancedForControl(EnhancedForControlContext ctx);

        public abstract void EnterPrimary(PrimaryContext ctx);

        public abstract void ExitPrimary(PrimaryContext ctx);

        public abstract void EnterFormalParameterList(FormalParameterListContext ctx);

        public abstract void ExitFormalParameterList(FormalParameterListContext ctx);

        public abstract void EnterMethodDeclaration(MethodDeclarationContext ctx);

        public abstract void ExitMethodDeclaration(MethodDeclarationContext ctx);

        public abstract void EnterProgramDeclaration(ProgramDeclarationContext ctx);

        public abstract void ExitProgramDeclaration(ProgramDeclarationContext ctx);

        public abstract void EnterParExpression(ParExpressionContext ctx);

        public abstract void ExitParExpression(ParExpressionContext ctx);

        public abstract void EnterSwitchLabel(SwitchLabelContext ctx);

        public abstract void ExitSwitchLabel(SwitchLabelContext ctx);

        public abstract void EnterVariableDeclarators(VariableDeclaratorsContext ctx);

        public abstract void ExitVariableDeclarators(VariableDeclaratorsContext ctx);

        public abstract void EnterStatement(StatementContext ctx);

        public abstract void ExitStatement(StatementContext ctx);

        public abstract void EnterMethodBody(MethodBodyContext ctx);

        public abstract void ExitMethodBody(MethodBodyContext ctx);

        public abstract void EnterFormalParameters(FormalParametersContext ctx);

        public abstract void ExitFormalParameters(FormalParametersContext ctx);

        public abstract void EnterPrimitiveType(PrimitiveTypeContext ctx);

        public abstract void ExitPrimitiveType(PrimitiveTypeContext ctx);

        public abstract void EnterProgram(ProgramContext ctx);

        public abstract void ExitProgram(ProgramContext ctx);

        public abstract void EnterConstantExpression(ConstantExpressionContext ctx);

        public abstract void ExitConstantExpression(ConstantExpressionContext ctx);

        public abstract void EnterForControl(ForControlContext ctx);

        public abstract void ExitForControl(ForControlContext ctx);

        public abstract void EnterForInit(ForInitContext ctx);

        public abstract void ExitForInit(ForInitContext ctx);

        public abstract void EnterLiteral(LiteralContext ctx);

        public abstract void ExitLiteral(LiteralContext ctx);

        public abstract void EnterSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx);

        public abstract void ExitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx);

        public abstract void EnterEveryRule(Antlr4.Runtime.ParserRuleContext ctx);

        public abstract void ExitEveryRule(Antlr4.Runtime.ParserRuleContext ctx);

        public abstract void VisitErrorNode(IErrorNode node);

        public abstract void VisitTerminal(ITerminalNode node);
    }
}
