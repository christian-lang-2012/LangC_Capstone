using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using LangC_Capstone.Contexts;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

namespace LangC_Capstone.Listeners
{
    public class BaseListener : GrammarListener
    {

        public override void EnterExpression(ExpressionContext ctx) { }

        public override void ExitExpression(ExpressionContext ctx) { }

        public override void EnterVariableInitialization(VariableInitializationContext ctx) { }

        public override void ExitVariableInitialization(VariableInitializationContext ctx) { }

        public override void EnterFormalParameter(FormalParameterContext ctx) { }

        public override void ExitFormalParameter(FormalParameterContext ctx) { }

        public override void EnterExpressionList(ExpressionListContext ctx) { }

        public override void ExitExpressionList(ExpressionListContext ctx) { }

        public override void EnterStatementExpression(StatementExpressionContext ctx) { }

        public override void ExitStatementExpression(StatementExpressionContext ctx) { }

        public override void EnterBlock(BlockContext ctx) { }

        public override void ExitBlock(BlockContext ctx) { }

        public override void EnterBlockStatement(BlockStatementContext ctx) { }

        public override void ExitBlockStatement(BlockStatementContext ctx) { }

        public override void EnterType(TypeContext ctx) { }

        public override void ExitType(TypeContext ctx) { }

        public override void EnterVariableDeclarationID(VariableDeclarationIDContext ctx) { }

        public override void ExitVariableDeclarationID(VariableDeclarationIDContext ctx) { }

        public override void EnterMainProgram(MainProgramContext ctx) { }

        public override void ExitMainProgram(MainProgramContext ctx) { }

        public override void EnterForUpdate(ForUpdateContext ctx) { }

        public override void ExitForUpdate(ForUpdateContext ctx) { }

        public override void EnterVariableDeclaration(VariableDeclarationContext ctx) { }

        public override void ExitVariableDeclaration(VariableDeclarationContext ctx) { }

        public override void EnterEnhancedForControl(EnhancedForControlContext ctx) { }

        public override void ExitEnhancedForControl(EnhancedForControlContext ctx) { }

        public override void EnterPrimary(PrimaryContext ctx) { }

        public override void ExitPrimary(PrimaryContext ctx) { }

        public override void EnterFormalParameterList(FormalParameterListContext ctx) { }

        public override void ExitFormalParameterList(FormalParameterListContext ctx) { }

        public override void EnterMethodDeclaration(MethodDeclarationContext ctx) { }

        public override void ExitMethodDeclaration(MethodDeclarationContext ctx) { }

        public override void EnterProgramDeclaration(ProgramDeclarationContext ctx) { }

        public override void ExitProgramDeclaration(ProgramDeclarationContext ctx) { }

        public override void EnterParExpression(ParExpressionContext ctx) { }

        public override void ExitParExpression(ParExpressionContext ctx) { }

        public override void EnterSwitchLabel(SwitchLabelContext ctx) { }

        public override void ExitSwitchLabel(SwitchLabelContext ctx) { }

        public override void EnterVariableDeclarators(VariableDeclaratorsContext ctx) { }

        public override void ExitVariableDeclarators(VariableDeclaratorsContext ctx) { }

        public override void EnterStatement(StatementContext ctx) { }

        public override void ExitStatement(StatementContext ctx) { }

        public override void EnterMethodBody(MethodBodyContext ctx) { }

        public override void ExitMethodBody(MethodBodyContext ctx) { }

        public override void EnterFormalParameters(FormalParametersContext ctx) { }

        public override void ExitFormalParameters(FormalParametersContext ctx) { }

        public override void EnterPrimitiveType(PrimitiveTypeContext ctx) { }

        public override void ExitPrimitiveType(PrimitiveTypeContext ctx) { }

        public override void EnterProgram(ProgramContext ctx) { }

        public override void ExitProgram(ProgramContext ctx) { }

        public override void EnterConstantExpression(ConstantExpressionContext ctx) { }

        public override void ExitConstantExpression(ConstantExpressionContext ctx) { }

        public override void EnterForControl(ForControlContext ctx) { }

        public override void ExitForControl(ForControlContext ctx) { }

        public override void EnterForInit(ForInitContext ctx) { }

        public override void ExitForInit(ForInitContext ctx) { }

        public override void EnterLiteral(LiteralContext ctx) { }

        public override void ExitLiteral(LiteralContext ctx) { }

        public override void EnterSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) { }

        public override void ExitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) { }

        public override void EnterEveryRule(ParserRuleContext ctx) { }

        public override void ExitEveryRule(ParserRuleContext ctx) { }

        public override void VisitTerminal(ITerminalNode node) { }

        public override void VisitErrorNode(IErrorNode node) { }
    }
}
