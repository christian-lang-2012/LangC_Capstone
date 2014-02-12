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
    public class LiteralContext : ParserRuleContext {
		public ITerminalNode NullLiteral() { return GetToken(AL_Parser.NullLiteral, 0); }
		public ITerminalNode CharacterLiteral() { return GetToken(AL_Parser.CharacterLiteral, 0); }
		public ITerminalNode IntegerLiteral() { return GetToken(AL_Parser.IntegerLiteral, 0); }
		public ITerminalNode StringLiteral() { return GetToken(AL_Parser.StringLiteral, 0); }
		public ITerminalNode FloatingPointLiteral() { return GetToken(AL_Parser.FloatingPointLiteral, 0); }
		public ITerminalNode BooleanLiteral() { return GetToken(AL_Parser.BooleanLiteral, 0); }
		
        public LiteralContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){

		}
		
        public override int GetRuleIndex() { return AL_Parser.RULE_literal; }
		
		public override void EnterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).EnterLiteral(this);
		}
		
		public override void ExitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitLiteral(this);
		}
		
		public override T Accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitLiteral(this);
			else return visitor.VisitChildren(this);
		}
	}
}
