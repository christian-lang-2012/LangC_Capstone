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

        void enterExpression(ExpressionContext ctx);

        void exitExpression(ExpressionContext ctx);

        void enterVariableInitialization(VariableInitializationContext ctx);

        void exitVariableInitialization(VariableInitializationContext ctx);

        void enterFormalParameter(FormalParameterContext ctx);

        void exitFormalParameter(FormalParameterContext ctx);

        void enterExpressionList(ExpressionListContext ctx);

        void exitExpressionList(ExpressionListContext ctx);

        void enterStatementExpression(StatementExpressionContext ctx);

        void exitStatementExpression(StatementExpressionContext ctx);

        void enterBlock(BlockContext ctx);

        void exitBlock(BlockContext ctx);

        void enterBlockStatement(BlockStatementContext ctx);

        void exitBlockStatement(BlockStatementContext ctx);

        void enterType(TypeContext ctx);

        void exitType(TypeContext ctx);

        void enterVariableDeclarationID(VariableDeclarationIDContext ctx);

        void exitVariableDeclarationID(VariableDeclarationIDContext ctx);

        void enterMainProgram(MainProgramContext ctx);

        void exitMainProgram(MainProgramContext ctx);

        void enterForUpdate(ForUpdateContext ctx);

        void exitForUpdate(ForUpdateContext ctx);

        void enterVariableDeclaration(VariableDeclarationContext ctx);

        void exitVariableDeclaration(VariableDeclarationContext ctx);

        void enterEnhancedForControl(EnhancedForControlContext ctx);

        void exitEnhancedForControl(EnhancedForControlContext ctx);

        void enterPrimary(PrimaryContext ctx);

        void exitPrimary(PrimaryContext ctx);

        void enterFormalParameterList(FormalParameterListContext ctx);

        void exitFormalParameterList(FormalParameterListContext ctx);

        void enterMethodDeclaration(MethodDeclarationContext ctx);

        void exitMethodDeclaration(MethodDeclarationContext ctx);

        void enterProgramDeclaration(ProgramDeclarationContext ctx);

        void exitProgramDeclaration(ProgramDeclarationContext ctx);

        void enterParExpression(ParExpressionContext ctx);

        void exitParExpression(ParExpressionContext ctx);

        void enterSwitchLabel(SwitchLabelContext ctx);

        void exitSwitchLabel(SwitchLabelContext ctx);

        void enterVariableDeclarators(VariableDeclaratorsContext ctx);

        void exitVariableDeclarators(VariableDeclaratorsContext ctx);

        void enterStatement(StatementContext ctx);

        void exitStatement(StatementContext ctx);

        void enterMethodBody(MethodBodyContext ctx);

        void exitMethodBody(MethodBodyContext ctx);

        void enterFormalParameters(FormalParametersContext ctx);

        void exitFormalParameters(FormalParametersContext ctx);

        void enterPrimitiveType(PrimitiveTypeContext ctx);

        void exitPrimitiveType(PrimitiveTypeContext ctx);

        void enterProgram(ProgramContext ctx);

        void exitProgram(ProgramContext ctx);

        void enterConstantExpression(ConstantExpressionContext ctx);

        void exitConstantExpression(ConstantExpressionContext ctx);

        void enterForControl(ForControlContext ctx);

        void exitForControl(ForControlContext ctx);

        void enterForInit(ForInitContext ctx);

        void exitForInit(ForInitContext ctx);

        void enterLiteral(LiteralContext ctx);

        void exitLiteral(LiteralContext ctx);

        void enterSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx);

        void exitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx);
    }
}
