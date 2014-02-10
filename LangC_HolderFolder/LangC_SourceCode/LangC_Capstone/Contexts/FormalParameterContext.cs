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
    public class FormalParameterContext : ParserRuleContext {
		public ITerminalNode VariableIdentifier() { return GetToken(AL_Parser.VariableIdentifier, 0); }
		public TypeContext type() {
			return GetRuleContext<TypeContext>(0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){
		}

		public override int getRuleIndex() { return AL_Parser.RULE_formalParameter; }
		
		public override void enterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) 
                ((GrammarListener)listener).EnterFormalParameter(this);
		}
		
		public override void exitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitFormalParameter(this);
		}
		
		public override T accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitFormalParameter(this);
			else return visitor.VisitChildren(this);
		}
	}
}
