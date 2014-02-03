using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using LangC_Capstone.Contexts;
using Antlr4.Runtime;

namespace LangC_Capstone.Listeners
{
    public class BaseListener : GrammarListener
    {

        public override void enterExpression(ExpressionContext ctx) { }

        public override void exitExpression(ExpressionContext ctx) { }

        public override void enterVariableInitialization(VariableInitializationContext ctx) { }

        public override void exitVariableInitialization(VariableInitializationContext ctx) { }

        public void enterFormalParameter(FormalParameterContext ctx) { }

        public void exitFormalParameter(FormalParameterContext ctx) { }

        public void enterExpressionList(ExpressionListContext ctx) { }

        public void exitExpressionList(ExpressionListContext ctx) { }

        public void enterStatementExpression(StatementExpressionContext ctx) { }

        public void exitStatementExpression(StatementExpressionContext ctx) { }

        public void enterBlock(BlockContext ctx) { }

        public void exitBlock(BlockContext ctx) { }

        public void enterBlockStatement(BlockStatementContext ctx) { }

        public void exitBlockStatement(BlockStatementContext ctx) { }

        public void enterType(TypeContext ctx) { }

        public void exitType(TypeContext ctx) { }

        public void enterVariableDeclarationID(VariableDeclarationIDContext ctx) { }

        public void exitVariableDeclarationID(VariableDeclarationIDContext ctx) { }

        public void enterMainProgram(MainProgramContext ctx) { }

        public void exitMainProgram(MainProgramContext ctx) { }

        public void enterForUpdate(ForUpdateContext ctx) { }

        public void exitForUpdate(ForUpdateContext ctx) { }

        public void enterVariableDeclaration(VariableDeclarationContext ctx) { }

        public void exitVariableDeclaration(VariableDeclarationContext ctx) { }

        public void enterEnhancedForControl(EnhancedForControlContext ctx) { }

        public void exitEnhancedForControl(EnhancedForControlContext ctx) { }

        public void enterPrimary(PrimaryContext ctx) { }

        public void exitPrimary(PrimaryContext ctx) { }

        public void enterFormalParameterList(FormalParameterListContext ctx) { }

        public void exitFormalParameterList(FormalParameterListContext ctx) { }

        public void enterMethodDeclaration(MethodDeclarationContext ctx) { }

        public void exitMethodDeclaration(MethodDeclarationContext ctx) { }

        public void enterProgramDeclaration(ProgramDeclarationContext ctx) { }

        public void exitProgramDeclaration(ProgramDeclarationContext ctx) { }

        public void enterParExpression(ParExpressionContext ctx) { }

        public void exitParExpression(ParExpressionContext ctx) { }

        public void enterSwitchLabel(SwitchLabelContext ctx) { }

        public void exitSwitchLabel(SwitchLabelContext ctx) { }

        public void enterVariableDeclarators(VariableDeclaratorsContext ctx) { }

        public void exitVariableDeclarators(VariableDeclaratorsContext ctx) { }

        public void enterStatement(StatementContext ctx) { }

        public void exitStatement(StatementContext ctx) { }

        public void enterMethodBody(MethodBodyContext ctx) { }

        public void exitMethodBody(MethodBodyContext ctx) { }

        public void enterFormalParameters(FormalParametersContext ctx) { }

        public void exitFormalParameters(FormalParametersContext ctx) { }

        public void enterPrimitiveType(PrimitiveTypeContext ctx) { }

        public void exitPrimitiveType(PrimitiveTypeContext ctx) { }

        public void enterProgram(ProgramContext ctx) { }

        public void exitProgram(ProgramContext ctx) { }

        public void enterConstantExpression(ConstantExpressionContext ctx) { }

        public void exitConstantExpression(ConstantExpressionContext ctx) { }

        public void enterForControl(ForControlContext ctx) { }

        public void exitForControl(ForControlContext ctx) { }

        public void enterForInit(ForInitContext ctx) { }

        public void exitForInit(ForInitContext ctx) { }

        public void enterLiteral(LiteralContext ctx) { }

        public void exitLiteral(LiteralContext ctx) { }

        public void enterSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) { }

        public void exitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) { }

        public void enterEveryRule(ParserRuleContext ctx) { }

        public void exitEveryRule(ParserRuleContext ctx) { }

        public void visitTerminal(TerminalNode node) { }

        public void visitErrorNode(ErrorNode node) { }
    }
}
