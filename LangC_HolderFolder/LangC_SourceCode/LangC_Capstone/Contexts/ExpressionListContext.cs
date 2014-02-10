using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using LangC_Capstone.Listeners;
using LangC_Capstone.Visitor;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LangC_Capstone.Contexts
{
    public class ExpressionListContext : ParserRuleContext
    {
        public ExpressionContext expression(int i)
        {
            return GetRuleContext<ExpressionContext>(i);
        }
        public IReadOnlyList<ExpressionContext> expression()
        {
            return GetRuleContexts<ExpressionContext>();
        }
        public ExpressionListContext(ParserRuleContext parent, int invokingState)
            : base(parent, invokingState)
        {
        }

        public override int getRuleIndex() { return AL_Parser.RULE_expressionList; }

        public override void enterRule(IParseTreeListener listener)
        {
            if (listener is GrammarListener) 
                ((GrammarListener)listener).EnterExpressionList(this);
        }

        public override void exitRule(IParseTreeListener listener)
        {
            if (listener is GrammarListener) 
                ((GrammarListener)listener).ExitExpressionList(this);
        }

        public override T accept<T>(IParseTreeVisitor<T> visitor)
        {
            if (visitor is GrammarVisitor<T>) 
                return ((GrammarVisitor<T>)visitor).visitExpressionList(this);
            else 
                return visitor.VisitChildren(this);
        }
    }
}
