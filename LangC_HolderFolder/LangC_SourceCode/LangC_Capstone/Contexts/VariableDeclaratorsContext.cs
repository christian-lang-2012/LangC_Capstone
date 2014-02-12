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
    public class VariableDeclaratorsContext : ParserRuleContext {
		public VariableDeclarationContext variableDeclaration(int i) {
			return GetRuleContext<VariableDeclarationContext>(i);
		}
		public IReadOnlyList<VariableDeclarationContext> variableDeclaration() {
			return GetRuleContexts<VariableDeclarationContext>();
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){

		}
		public override int GetRuleIndex() { return AL_Parser.RULE_variableDeclarators; }
		
		public override void EnterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).EnterVariableDeclarators(this);
		}
		
		public override void ExitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitVariableDeclarators(this);
		}
		
		public override T Accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitVariableDeclarators(this);
			else return visitor.VisitChildren(this);
		}
	}
}
