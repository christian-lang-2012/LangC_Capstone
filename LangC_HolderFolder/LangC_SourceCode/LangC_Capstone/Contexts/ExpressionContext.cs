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
    public class ExpressionContext : ParserRuleContext
    {
        public int _p;

        public ExpressionContext expression(int i)
        {
            return GetRuleContext<ExpressionContext>(i);
        }
        public ITerminalNode VariableIdentifier() { return GetToken(AL_Parser.VariableIdentifier, 0); }
        public PrimaryContext primary()
        {
            return GetRuleContext<PrimaryContext>(0);
        }
        public ExpressionListContext expressionList()
        {
            return GetRuleContext<ExpressionListContext>(0);
        }
        public ITerminalNode Identifier() { return GetToken(AL_Parser.Identifier, 0); }
        public TypeContext type()
        {
            return GetRuleContext<TypeContext>(0);
        }
        public IReadOnlyList<ExpressionContext> expression()
        {
            return GetRuleContexts<ExpressionContext>();
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState)
            : base(parent, invokingState)
        {

        }

        public ExpressionContext(ParserRuleContext parent, int invokingState, int _p)
            : base(parent, invokingState)
        {
            this._p = _p;
        }
        public override int getRuleIndex() { return AL_Parser.RULE_expression; }

        public override void enterRule(IParseTreeListener listener)
        {
            if (listener is GrammarListener) ((GrammarListener)listener).EnterExpression(this);
        }

        public override void exitRule(IParseTreeListener listener)
        {
            if (listener is GrammarListener) ((GrammarListener)listener).ExitExpression(this);
        }

        public override T accept<T>(IParseTreeVisitor<T> visitor)
        {
            if (visitor is GrammarVisitor<T>) return ((GrammarVisitor<T>)visitor).visitExpression(this);
            else return visitor.VisitChildren(this);
        }
    }
}
