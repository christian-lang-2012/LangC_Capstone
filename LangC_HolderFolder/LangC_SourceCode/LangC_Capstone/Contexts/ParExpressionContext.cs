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
    public  class ParExpressionContext : ParserRuleContext {
		public ExpressionContext expression() {
			return GetRuleContext<ExpressionContext>(0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){

		}
		public override int getRuleIndex() { return AL_Parser.RULE_parExpression; }
		
		public override void enterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).EnterParExpression(this);
		}
		
		public override void exitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitParExpression(this);
		}
		
		public override T accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitParExpression(this);
			else return visitor.VisitChildren(this);
		}
	}

}
