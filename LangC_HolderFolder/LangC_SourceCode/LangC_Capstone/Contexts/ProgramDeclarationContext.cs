using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LangC_Capstone.Contexts
{
    public class ProgramDeclarationContext : ParserRuleContext {
		
        public TerminalNode QUOTE(int i) {
			return getToken(AL_CombinedGrammarParser.QUOTE, i);
		}
		
        public List<TerminalNode> QUOTE() { return getTokens(AL_CombinedGrammarParser.QUOTE); }
		
        public TerminalNode Identifier() { return getToken(AL_CombinedGrammarParser.Identifier, 0); }
		
        public TerminalNode PROGRAM() { return getToken(AL_CombinedGrammarParser.PROGRAM, 0); }
		
        public TerminalNode THIS() { return getToken(AL_CombinedGrammarParser.THIS, 0); }
		
        public ProgramDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public override int getRuleIndex() { return RULE_programDeclaration; }

		public override void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AL_CombinedGrammarListener ) ((AL_CombinedGrammarListener)listener).enterProgramDeclaration(this);
		}

		public override void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AL_CombinedGrammarListener ) ((AL_CombinedGrammarListener)listener).exitProgramDeclaration(this);
		}
		
		public override <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AL_CombinedGrammarVisitor ) return ((AL_CombinedGrammarVisitor<? extends T>)visitor).visitProgramDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
}
