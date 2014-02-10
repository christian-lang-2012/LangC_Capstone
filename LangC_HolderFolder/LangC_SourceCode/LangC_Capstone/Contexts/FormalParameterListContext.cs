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
    public class FormalParameterListContext : ParserRuleContext {
		public IReadOnlyList<FormalParameterContext> formalParameter() {
			return GetRuleContexts<FormalParameterContext>();
		}
		public FormalParameterContext formalParameter(int i) {
			return GetRuleContext<FormalParameterContext>(i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){
		}
		
        public override int getRuleIndex() { return AL_Parser.RULE_formalParameterList; }
		
		public override void enterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) 
                ((GrammarListener)listener).EnterFormalParameterList(this);
		}
		
		public override void exitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) 
                ((GrammarListener)listener).ExitFormalParameterList(this);
		}
		
		public T accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) 
                return ((GrammarVisitor<T>)visitor).visitFormalParameterList(this);
			else 
                return visitor.VisitChildren(this);
		}
	}
}
