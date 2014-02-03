using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using LangC_Capstone.Contexts;

namespace LangC_Capstone.Visitor
{
    public class BaseVIsitor<T> : AbstractParseTreeVisitor<T>, GrammarVisitor<T>
    {
        public override T visitExpression(ExpressionContext ctx) { return VisitChildren(ctx); }

        public override T visitVariableInitialization(VariableInitializationContext ctx) { return VisitChildren(ctx); }

        public override T visitFormalParameter(FormalParameterContext ctx) { return VisitChildren(ctx); }

        public override T visitExpressionList(ExpressionListContext ctx) { return VisitChildren(ctx); }

        public override T visitStatementExpression(StatementExpressionContext ctx) { return VisitChildren(ctx); }

        public override T visitBlock(BlockContext ctx) { return VisitChildren(ctx); }

        public override T visitBlockStatement(BlockStatementContext ctx) { return VisitChildren(ctx); }

        public override T visitType(TypeContext ctx) { return VisitChildren(ctx); }

        public override T visitVariableDeclarationID(VariableDeclarationIDContext ctx) { return VisitChildren(ctx); }

        public override T visitMainProgram(MainProgramContext ctx) { return VisitChildren(ctx); }

        public override T visitForUpdate(ForUpdateContext ctx) { return VisitChildren(ctx); }

        public override T visitVariableDeclaration(VariableDeclarationContext ctx) { return VisitChildren(ctx); }

        public override T visitEnhancedForControl(EnhancedForControlContext ctx) { return VisitChildren(ctx); }

        public override T visitPrimary(PrimaryContext ctx) { return VisitChildren(ctx); }

        public override T visitFormalParameterList(FormalParameterListContext ctx) { return VisitChildren(ctx); }

        public override T visitMethodDeclaration(MethodDeclarationContext ctx) { return VisitChildren(ctx); }

        public override T visitProgramDeclaration(ProgramDeclarationContext ctx) { return VisitChildren(ctx); }

        public override T visitParExpression(ParExpressionContext ctx) { return VisitChildren(ctx); }

        public override T visitSwitchLabel(SwitchLabelContext ctx) { return VisitChildren(ctx); }

        public override T visitVariableDeclarators(VariableDeclaratorsContext ctx) { return VisitChildren(ctx); }

        public override T visitStatement(StatementContext ctx) { return VisitChildren(ctx); }

        public override T visitMethodBody(MethodBodyContext ctx) { return VisitChildren(ctx); }

        public override T visitFormalParameters(FormalParametersContext ctx) { return VisitChildren(ctx); }

        public override T visitPrimitiveType(PrimitiveTypeContext ctx) { return VisitChildren(ctx); }

        public override T visitProgram(ProgramContext ctx) { return VisitChildren(ctx); }

        public override T visitConstantExpression(ConstantExpressionContext ctx) { return VisitChildren(ctx); }

        public override T visitForControl(ForControlContext ctx) { return VisitChildren(ctx); }

        public override T visitForInit(ForInitContext ctx) { return VisitChildren(ctx); }

        public override T visitLiteral(LiteralContext ctx) { return VisitChildren(ctx); }

        public override T visitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) { return VisitChildren(ctx); }
    }
}
