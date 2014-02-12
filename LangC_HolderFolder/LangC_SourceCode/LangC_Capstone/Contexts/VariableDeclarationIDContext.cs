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
    public class VariableDeclarationIDContext : ParserRuleContext {
		public ITerminalNode VariableIdentifier() { return GetToken(AL_Parser.VariableIdentifier, 0); }
		public VariableDeclarationIDContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){

		}
		public override int GetRuleIndex() { return AL_Parser.RULE_variableDeclarationID; }
		
		public override void EnterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).EnterVariableDeclarationID(this);
		}
		
		public override void ExitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitVariableDeclarationID(this);
		}
		
		public override T Accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitVariableDeclarationID(this);
			else return visitor.VisitChildren(this);

		}
	}
}
