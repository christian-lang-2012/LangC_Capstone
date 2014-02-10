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
    public class ForInitContext : ParserRuleContext {
		public ExpressionListContext expressionList() {
			return GetRuleContext<ExpressionListContext>(0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return GetRuleContext<VariableDeclarationContext>(0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){
		}
		public override int getRuleIndex() { return AL_Parser.RULE_forInit; }
		
		public override void enterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) 
                ((GrammarListener)listener).EnterForInit(this);
		}
		
		public override void exitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) 
                ((GrammarListener)listener).ExitForInit(this);
		}
		
		public T accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) 
                return ((GrammarVisitor<T>)visitor).visitForInit(this);
			else 
                return visitor.VisitChildren(this);
		}
	}
}
