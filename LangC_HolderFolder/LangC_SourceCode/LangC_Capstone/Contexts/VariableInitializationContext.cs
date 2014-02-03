using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
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
	    
        public override int getRuleIndex() { return RULE_variableInitialization; }
		
        public override void enterRule(IParseTreeListener listener) {
			if ( listener is GrarmmarListener ) 
                ((GrarmmarListener)listener).enterVariableInitialization(this);
		}
		
		public override void exitRule(IParseTreeListener listener) {
			if ( listener instanceof AL_CombinedGrammarListener ) ((AL_CombinedGrammarListener)listener).exitVariableInitialization(this);
		}
		
		public override <T> T accept(IParseTreeVisitor<? extends T> visitor) {
			if ( visitor is GrammarVisitor ) return ((AL_CombinedGrammarVisitor<? extends T>)visitor).visitVariableInitialization(this);
			else return visitor.visitChildren(this);
		}
	}
}
