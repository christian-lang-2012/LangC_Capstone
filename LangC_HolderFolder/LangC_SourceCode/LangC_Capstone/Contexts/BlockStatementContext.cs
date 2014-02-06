using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using LangC_Capstone.Listeners;
using LangC_Capstone.Visitor;
using Antlr4.Runtime.Tree;

namespace LangC_Capstone.Contexts
{
    public class BlockStatementContext : ParserRuleContext
    {

        public StatementContext statement()
        {
            return GetRuleContext<StatementContext>(0);
        }

        public VariableDeclarationContext variableDeclaration()
        {
            return GetRuleContext<VariableDeclarationContext>(0);
        }
        public BlockStatementContext(ParserRuleContext parent, int invokingState)
            : base(parent, invokingState)
        {

        }

        public override int getRuleIndex() { return AL_Parser.RULE_blockStatement; }


        public override void enterRule(IParseTreeListener listener)
        {
            if (listener is GrammarListener)
                ((GrammarListener)listener).EnterBlockStatement(this);
        }

        public override void exitRule(IParseTreeListener listener)
        {
            if (listener is GrammarListener) 
                ((GrammarListener)listener).ExitBlockStatement(this);
        }

        public override T accept<T>(IParseTreeVisitor<T> visitor)
        {
            if (visitor is GrammarVisitor<T>) 
                return ((GrammarVisitor<T>)visitor).visitBlockStatement(this);
            else 
                return visitor.VisitChildren(this);
        }
    }
}
