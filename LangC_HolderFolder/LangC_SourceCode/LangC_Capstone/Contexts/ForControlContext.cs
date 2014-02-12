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
    public class ForControlContext : ParserRuleContext {
		
        public ForInitContext forInit() {
			return GetRuleContext<ForInitContext>(0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return GetRuleContext<EnhancedForControlContext>(0);
		}
		public ExpressionContext expression() {
			return GetRuleContext<ExpressionContext>(0);
		}
		public ForUpdateContext forUpdate() {
			return GetRuleContext<ForUpdateContext>(0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){
		}
		
        public override int GetRuleIndex() { return AL_Parser.RULE_forControl; }
		
		public override void EnterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) 
                ((GrammarListener)listener).EnterForControl(this);
		}
		
		public override void ExitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) 
                ((GrammarListener)listener).ExitForControl(this);
		}
		
		public override T Accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) 
                return ((GrammarVisitor<T>)visitor).visitForControl(this);
			else 
                return visitor.VisitChildren(this);
		}
	}
}
