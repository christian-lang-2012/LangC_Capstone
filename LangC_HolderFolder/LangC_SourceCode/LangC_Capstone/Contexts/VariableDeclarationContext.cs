using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LangC_Capstone.Contexts
{
    public class VariableDeclarationContext : ParserRuleContext {
		public VariableDeclarationIDContext variableDeclarationID() {
			return getRuleContext(VariableDeclarationIDContext.class,0);
		}
		public TerminalNode LET() { return getToken(AL_CombinedGrammarParser.LET, 0); }
		public VariableInitializationContext variableInitialization() {
			return getRuleContext(VariableInitializationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AL_CombinedGrammarListener ) ((AL_CombinedGrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AL_CombinedGrammarListener ) ((AL_CombinedGrammarListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AL_CombinedGrammarVisitor ) return ((AL_CombinedGrammarVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
}
