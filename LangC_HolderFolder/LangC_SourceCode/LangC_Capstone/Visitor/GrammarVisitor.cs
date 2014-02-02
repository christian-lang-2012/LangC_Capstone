using LangC_Capstone.Contexts;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LangC_Capstone.Visitor
{
    public class GrammarVisitor : ParseTreeVisitor<T> {
	
	T visitExpression(ExpressionContext ctx);

	T visitVariableInitialization(VariableInitializationContext ctx);

	T visitFormalParameter(FormalParameterContext ctx);
	
	T visitExpressionList(ExpressionListContext ctx);

	T visitStatementExpression(StatementExpressionContext ctx);

	T visitBlock(BlockContext ctx);

	T visitBlockStatement(BlockStatementContext ctx);

	T visitType(TypeContext ctx);

	T visitVariableDeclarationID(VariableDeclarationIDContext ctx);

	T visitMainProgram(MainProgramContext ctx);

	T visitForUpdate(ForUpdateContext ctx);

    T visitVariableDeclaration(VariableDeclarationContext ctx);

	T visitEnhancedForControl(EnhancedForControlContext ctx);

	T visitPrimary(PrimaryContext ctx);

	T visitFormalParameterList(FormalParameterListContext ctx);

	T visitMethodDeclaration(MethodDeclarationContext ctx);

	T visitProgramDeclaration(ProgramDeclarationContext ctx);

	T visitParExpression(ParExpressionContext ctx);

	T visitSwitchLabel(SwitchLabelContext ctx);

	T visitVariableDeclarators(VariableDeclaratorsContext ctx);

	T visitStatement(StatementContext ctx);

	T visitMethodBody(MethodBodyContext ctx);

	T visitFormalParameters(FormalParametersContext ctx);

	T visitPrimitiveType(PrimitiveTypeContext ctx);

	T visitProgram(ProgramContext ctx);

	T visitConstantExpression(ConstantExpressionContext ctx);

	T visitForControl(ForControlContext ctx);

	T visitForInit(ForInitContext ctx);

	T visitLiteral(LiteralContext ctx);

	T visitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx);

    }
}
