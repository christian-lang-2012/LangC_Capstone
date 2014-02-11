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
    public class MethodDeclarationContext : ParserRuleContext {
		public MethodBodyContext methodBody() {
			return GetRuleContext<MethodBodyContext>(0);
		}
		public ITerminalNode FUNCTION() { return GetToken(AL_Parser.FUNCTION, 0); }
		public FormalParametersContext formalParameters() {
			return GetRuleContext<FormalParametersContext>(0);
		}
		public ITerminalNode Identifier() { return GetToken(AL_Parser.Identifier, 0); }
		public TypeContext type() {
			return GetRuleContext<TypeContext>(0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){

		}
		public override int getRuleIndex() { return AL_Parser.RULE_methodDeclaration; }
		
		public override void enterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).EnterMethodDeclaration(this);
		}
		
		public void exitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitMethodDeclaration(this);
		}
		
		public override T accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitMethodDeclaration(this);
			else return visitor.VisitChildren(this);
		}
	}
}
