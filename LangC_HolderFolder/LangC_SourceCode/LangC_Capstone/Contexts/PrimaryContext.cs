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
    public class PrimaryContext : ParserRuleContext {
		public ITerminalNode Identifier() { return GetToken(AL_Parser.Identifier, 0); }
		public ExpressionContext expression() {
			return GetRuleContext<ExpressionContext>(0);
		}
		public LiteralContext literal() {
			return GetRuleContext<LiteralContext>(0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){

		}

		public override int GetRuleIndex() { return AL_Parser.RULE_primary; }
		
		public override void EnterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).EnterPrimary(this);
		}
		
		public override void ExitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitPrimary(this);
		}
		
		public override T Accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitPrimary(this);
			else return visitor.VisitChildren(this);
		}
	}
}
