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
    public class VariableInitializationContext : ParserRuleContext {
		
        public ExpressionContext expression() {
			return GetRuleContext<ExpressionContext>(0);
		}
		
        public VariableInitializationContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState)
        {

		}
	    
        public override int getRuleIndex() { return AL_Parser.RULE_variableInitialization; }
		
        public override void enterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) 
                ((GrammarListener)listener).EnterVariableInitialization(this);
		}
		
		public override void exitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitVariableInitialization(this);
		}
		
		public override T accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitVariableInitialization(this);
			else return visitor.VisitChildren(this);
		}
	}
}
