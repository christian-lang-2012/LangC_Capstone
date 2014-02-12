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
    public class SwitchBlockStatementGroupContext : ParserRuleContext {
		public IReadOnlyList<BlockStatementContext> blockStatement() {
			return GetRuleContexts<BlockStatementContext>();
		}
		public SwitchLabelContext switchLabel(int i) {
			return GetRuleContext<SwitchLabelContext>(i);
		}
		public IReadOnlyList<SwitchLabelContext> switchLabel() {
			return GetRuleContexts<SwitchLabelContext>();
		}
		public BlockStatementContext blockStatement(int i) {
			return GetRuleContext<BlockStatementContext>(i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){

		}

		public override int GetRuleIndex() { return AL_Parser.RULE_switchBlockStatementGroup; }
		
		public override void EnterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).EnterSwitchBlockStatementGroup(this);
		}
		
		public override void ExitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitSwitchBlockStatementGroup(this);
		}
		
		public override T Accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.VisitChildren(this);
		}
	}
}
