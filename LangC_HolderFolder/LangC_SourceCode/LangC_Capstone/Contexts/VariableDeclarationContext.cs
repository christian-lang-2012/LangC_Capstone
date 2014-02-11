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
    public class VariableDeclarationContext : ParserRuleContext {
		public VariableDeclarationIDContext variableDeclarationID() {
			return GetRuleContext<VariableDeclarationIDContext>(0);
		}
		
        public ITerminalNode LET() { return GetToken(AL_Parser.LET, 0); }
		
        public VariableInitializationContext variableInitialization() {
			return GetRuleContext<VariableInitializationContext>(0);
		}
		
        public TypeContext type() {
			return GetRuleContext<TypeContext>(0);
		}
		
        public VariableDeclarationContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){

		}
		
        public override int getRuleIndex() { return AL_Parser.RULE_variableDeclaration; }
		
		public override void enterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).EnterVariableDeclaration(this);
		}
		
		public override void exitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitVariableDeclaration(this);
		}
		
		public override T accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitVariableDeclaration(this);
			else return visitor.VisitChildren(this);
		}
	}
}
