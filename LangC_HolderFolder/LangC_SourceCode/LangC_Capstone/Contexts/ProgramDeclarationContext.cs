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
    public class ProgramDeclarationContext : ParserRuleContext {
		
        public ITerminalNode QUOTE(int i) {
			return GetToken(AL_Parser.QUOTE, i);
		}
		
        public IReadOnlyList<ITerminalNode> QUOTE() { return GetTokens(AL_Parser.QUOTE); }
		
        public ITerminalNode Identifier() { return GetToken(AL_Parser.Identifier, 0); }
		
        public ITerminalNode PROGRAM() { return GetToken(AL_Parser.PROGRAM, 0); }
		
        public ITerminalNode THIS() { return GetToken(AL_Parser.THIS, 0); }
		
        public ProgramDeclarationContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){

		}
		public override int GetRuleIndex() { return AL_Parser.RULE_programDeclaration; }

		public override void EnterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).EnterProgramDeclaration(this);
		}

		public override void ExitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitProgramDeclaration(this);
		}
		
		public override T Accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitProgramDeclaration(this);
			else return visitor.VisitChildren(this);
		}
	}
}
