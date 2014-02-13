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
        public T visitExpression(ExpressionContext ctx) 
        { 
            return VisitChildren(ctx); 
        }

        public T visitVariableInitialization(VariableInitializationContext ctx) 
        { 
            return VisitChildren(ctx); 
        }

        public T visitFormalParameter(FormalParameterContext ctx) 
        { 
            return VisitChildren(ctx);
        }

        public T visitExpressionList(ExpressionListContext ctx)
        { 
            return VisitChildren(ctx); 
        }

        public T visitStatementExpression(StatementExpressionContext ctx)
        {
            return VisitChildren(ctx); 
        }

        public T visitBlock(BlockContext ctx) 
        { 
            return VisitChildren(ctx); 
        }

        public T visitBlockStatement(BlockStatementContext ctx) 
        { 
            return VisitChildren(ctx); 
        }

        public T visitType(TypeContext ctx) 
        { 
            return VisitChildren(ctx); 
        }

        public T visitVariableDeclarationID(VariableDeclarationIDContext ctx) 
        { 
            return VisitChildren(ctx); 
        }

        public T visitMainProgram(MainProgramContext ctx) 
        { 
            return VisitChildren(ctx);
        }

        public T visitForUpdate(ForUpdateContext ctx) 
        { 
            return VisitChildren(ctx);
        }

        public T visitVariableDeclaration(VariableDeclarationContext ctx) 
        {
            return VisitChildren(ctx); 
        }

        public T visitEnhancedForControl(EnhancedForControlContext ctx) 
        { 
            return VisitChildren(ctx);
        }

        public T visitPrimary(PrimaryContext ctx)
        { 
            return VisitChildren(ctx); 
        }

        public T visitFormalParameterList(FormalParameterListContext ctx) 
        {
            return VisitChildren(ctx);
        }

        public T visitMethodDeclaration(MethodDeclarationContext ctx) 
        {
            return VisitChildren(ctx);
        }

        public T visitProgramDeclaration(ProgramDeclarationContext ctx) 
        { 
            return VisitChildren(ctx); 
        }

        public T visitParExpression(ParExpressionContext ctx)
        {
            return VisitChildren(ctx); 
        }

        public T visitSwitchLabel(SwitchLabelContext ctx) 
        { 
            return VisitChildren(ctx);
        }

        public T visitVariableDeclarators(VariableDeclaratorsContext ctx) 
        { 
            return VisitChildren(ctx);
        }

        public T visitStatement(StatementContext ctx) 
        {
            return VisitChildren(ctx); 
        }

        public T visitMethodBody(MethodBodyContext ctx) 
        { 
            return VisitChildren(ctx);
        }

        public T visitFormalParameters(FormalParametersContext ctx)
        { 
            return VisitChildren(ctx); 
        }

        public T visitPrimitiveType(PrimitiveTypeContext ctx) 
        { 
            return VisitChildren(ctx); 
        }

        public T visitProgram(ProgramContext ctx) 
        { 
            return VisitChildren(ctx); 
        }

        public T visitConstantExpression(ConstantExpressionContext ctx) 
        { 
            return VisitChildren(ctx); 
        }

        public T visitForControl(ForControlContext ctx) 
        { 
            return VisitChildren(ctx); 
        }

        public T visitForInit(ForInitContext ctx)
        { 
            return VisitChildren(ctx); 
        }

        public T visitLiteral(LiteralContext ctx) 
        { 
            return VisitChildren(ctx);
        }

        public T visitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) 
        { 
            return VisitChildren(ctx);
        }
    }
}
