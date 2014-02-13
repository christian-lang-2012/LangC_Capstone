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
        Dictionary<string, string> properties = new Dictionary<string, string>();

        public override void EnterExpression(ExpressionContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitExpression(ExpressionContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterVariableInitialization(VariableInitializationContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitVariableInitialization(VariableInitializationContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterFormalParameter(FormalParameterContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitFormalParameter(FormalParameterContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterExpressionList(ExpressionListContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);

        }
        public override void ExitExpressionList(ExpressionListContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterStatementExpression(StatementExpressionContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitStatementExpression(StatementExpressionContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterBlock(BlockContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitBlock(BlockContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterBlockStatement(BlockStatementContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitBlockStatement(BlockStatementContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterType(TypeContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitType(TypeContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterVariableDeclarationID(VariableDeclarationIDContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitVariableDeclarationID(VariableDeclarationIDContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterMainProgram(MainProgramContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitMainProgram(MainProgramContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterForUpdate(ForUpdateContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitForUpdate(ForUpdateContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterVariableDeclaration(VariableDeclarationContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitVariableDeclaration(VariableDeclarationContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterEnhancedForControl(EnhancedForControlContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitEnhancedForControl(EnhancedForControlContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterPrimary(PrimaryContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitPrimary(PrimaryContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }


        public override void EnterFormalParameterList(FormalParameterListContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitFormalParameterList(FormalParameterListContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterMethodDeclaration(MethodDeclarationContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitMethodDeclaration(MethodDeclarationContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterProgramDeclaration(ProgramDeclarationContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitProgramDeclaration(ProgramDeclarationContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterParExpression(ParExpressionContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitParExpression(ParExpressionContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterSwitchLabel(SwitchLabelContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitSwitchLabel(SwitchLabelContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterVariableDeclarators(VariableDeclaratorsContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitVariableDeclarators(VariableDeclaratorsContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterStatement(StatementContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitStatement(StatementContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterMethodBody(MethodBodyContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitMethodBody(MethodBodyContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }


        public override void EnterFormalParameters(FormalParametersContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitFormalParameters(FormalParametersContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterPrimitiveType(PrimitiveTypeContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitPrimitiveType(PrimitiveTypeContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterProgram(ProgramContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitProgram(ProgramContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterConstantExpression(ConstantExpressionContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitConstantExpression(ConstantExpressionContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterForControl(ForControlContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitForControl(ForControlContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterForInit(ForInitContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitForInit(ForInitContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterLiteral(LiteralContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitLiteral(LiteralContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void EnterEveryRule(ParserRuleContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void ExitEveryRule(ParserRuleContext ctx)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void VisitTerminal(ITerminalNode node)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }

        public override void VisitErrorNode(IErrorNode node)
        {
            string tokenId = ctx.GetRuleIndex().ToString();
            string value = ctx.GetText();
            properties.Add(tokenId, value);
        }
    }
}
