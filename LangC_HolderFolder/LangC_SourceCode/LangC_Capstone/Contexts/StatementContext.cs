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
    public class StatementContext : ParserRuleContext {
		public IReadOnlyList<StatementContext> statement() {
			return GetRuleContexts<StatementContext>();
		}
		public ITerminalNode VariableIdentifier() { return GetToken(AL_Parser.VariableIdentifier, 0); }
		
        public SwitchLabelContext switchLabel(int i) {
			return GetRuleContext<SwitchLabelContext>(i);
		}
		
        public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return GetRuleContext<SwitchBlockStatementGroupContext>(i);
		}
		public StatementExpressionContext statementExpression() {
			return GetRuleContext<StatementExpressionContext>(0);
		}
		public ForControlContext forControl() {
			return GetRuleContext<ForControlContext>(0);
		}
		public IReadOnlyList<SwitchLabelContext> switchLabel() {
			return GetRuleContexts<SwitchLabelContext>();
		}
		public ParExpressionContext parExpression() {
			return GetRuleContext<ParExpressionContext>(0);
		}
		public ExpressionContext expression() {
			return GetRuleContext<ExpressionContext>(0);
		}
		public StatementContext statement(int i) {
			return GetRuleContext<StatementContext>(i);
		}
		public BlockContext block() {
			return GetRuleContext<BlockContext>(0);
		}
		public IReadOnlyList<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return GetRuleContexts<SwitchBlockStatementGroupContext>();
		}
		public StatementContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){

		}
		
        public override int getRuleIndex() { return AL_Parser.RULE_statement; }
		
		public override void enterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).EnterStatement(this);
		}
		
		public override void exitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitStatement(this);
		}
		
		public override T accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitStatement(this);
			else return visitor.VisitChildren(this);
		}
	}
}
