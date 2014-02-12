using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using LangC_Capstone.Listeners;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using LangC_Capstone.Visitor;

namespace LangC_Capstone.Contexts
{
    public class ConstantExpressionContext : ParserRuleContext {
		
        public ExpressionContext expression() {
			return GetRuleContext<ExpressionContext>(0);
		}
		
        public ConstantExpressionContext(ParserRuleContext parent, int invokingState) :
            base(parent, invokingState){
		}
		
        public override int GetRuleIndex() { return AL_Parser.RULE_constantExpression; }
	
		public override void EnterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).EnterConstantExpression(this);
		}
		
		public override void ExitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitConstantExpression(this);
		}
		
		public override T Accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitConstantExpression(this);
			else return visitor.VisitChildren(this);
		}
	}
}
