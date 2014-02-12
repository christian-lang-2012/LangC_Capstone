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
    public class SwitchLabelContext : ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return GetRuleContext<ConstantExpressionContext>(0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){

		}
		public override int GetRuleIndex() { return AL_Parser.RULE_switchLabel; }
		
		public override void EnterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).EnterSwitchLabel(this);
		}
		
		public override void ExitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitSwitchLabel(this);
		}
		
		public override T Accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitSwitchLabel(this);
			else return visitor.VisitChildren(this);
		}
	}
}
