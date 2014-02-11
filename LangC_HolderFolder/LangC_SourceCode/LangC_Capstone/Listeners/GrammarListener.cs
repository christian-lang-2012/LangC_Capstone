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
    public class GrammarListener : IParseTreeListener
    {

        public virtual void EnterExpression(ExpressionContext ctx);

        public void ExitExpression(ExpressionContext ctx);

        public void EnterVariableInitialization(VariableInitializationContext ctx);

        public void ExitVariableInitialization(VariableInitializationContext ctx);

        public void EnterFormalParameter(FormalParameterContext ctx);

        public void ExitFormalParameter(FormalParameterContext ctx);

        public void EnterExpressionList(ExpressionListContext ctx);

        public void ExitExpressionList(ExpressionListContext ctx);

        public void EnterStatementExpression(StatementExpressionContext ctx);

        public void ExitStatementExpression(StatementExpressionContext ctx);

        public void EnterBlock(BlockContext ctx);

        public void ExitBlock(BlockContext ctx);

        public void EnterBlockStatement(BlockStatementContext ctx);

        public void ExitBlockStatement(BlockStatementContext ctx);

        public void EnterType(TypeContext ctx);

        public void ExitType(TypeContext ctx);

        public void EnterVariableDeclarationID(VariableDeclarationIDContext ctx);

        public void ExitVariableDeclarationID(VariableDeclarationIDContext ctx);

        public void EnterMainProgram(MainProgramContext ctx);

        public void exitMainProgram(MainProgramContext ctx);

        public void EnterForUpdate(ForUpdateContext ctx);

        public void ExitForUpdate(ForUpdateContext ctx);

        public void EnterVariableDeclaration(VariableDeclarationContext ctx);

        public void ExitVariableDeclaration(VariableDeclarationContext ctx);

        public void EnterEnhancedForControl(EnhancedForControlContext ctx);

        public void ExitEnhancedForControl(EnhancedForControlContext ctx);

        public void EnterPrimary(PrimaryContext ctx);

        public void ExitPrimary(PrimaryContext ctx);

        public void EnterFormalParameterList(FormalParameterListContext ctx);

        public void ExitFormalParameterList(FormalParameterListContext ctx);

        public void EnterMethodDeclaration(MethodDeclarationContext ctx);

        public void ExitMethodDeclaration(MethodDeclarationContext ctx);

        public void EnterProgramDeclaration(ProgramDeclarationContext ctx);

        public void ExitProgramDeclaration(ProgramDeclarationContext ctx);

        public void EnterParExpression(ParExpressionContext ctx);

        public void ExitParExpression(ParExpressionContext ctx);

        public void EnterSwitchLabel(SwitchLabelContext ctx);

        public void ExitSwitchLabel(SwitchLabelContext ctx);

        public void EnterVariableDeclarators(VariableDeclaratorsContext ctx);

        public void ExitVariableDeclarators(VariableDeclaratorsContext ctx);

        public void EnterStatement(StatementContext ctx);

        public void ExitStatement(StatementContext ctx);

        public void EnterMethodBody(MethodBodyContext ctx);

        public void ExitMethodBody(MethodBodyContext ctx);

        public void EnterFormalParameters(FormalParametersContext ctx);

        public void ExitFormalParameters(FormalParametersContext ctx);

        public void EnterPrimitiveType(PrimitiveTypeContext ctx);

        public void ExitPrimitiveType(PrimitiveTypeContext ctx);

        public void EnterProgram(ProgramContext ctx);

        public void ExitProgram(ProgramContext ctx);

        public void EnterConstantExpression(ConstantExpressionContext ctx);

        public void ExitConstantExpression(ConstantExpressionContext ctx);

        public void EnterForControl(ForControlContext ctx);

        public void ExitForControl(ForControlContext ctx);

        public void EnterForInit(ForInitContext ctx);

        public void ExitForInit(ForInitContext ctx);

        public void EnterLiteral(LiteralContext ctx);

        public void ExitLiteral(LiteralContext ctx);

        public void EnterSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx);

        public void ExitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx);
    }
}
