using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LangC_Capstone.Contexts
{
    public class ProgramContext : ParserRuleContext 
    {
		public ProgramDeclarationContext programDeclaration() 
        {
			return getRuleContext(ProgramDeclarationContext.class,0);
		}
		
        public TerminalNode ProgramHeader() { return getToken(AL_CombinedGrammarParser.ProgramHeader, 0); }
	    	
        public MethodDeclarationContext methodDeclaration(int i) 
        {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		
        public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public TerminalNode MethodHeader() { return getToken(AL_CombinedGrammarParser.MethodHeader, 0); }
		public TerminalNode VariableHeader() { return getToken(AL_CombinedGrammarParser.VariableHeader, 0); }
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MainProgramContext mainProgram() {
			return getRuleContext(MainProgramContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AL_CombinedGrammarListener ) ((AL_CombinedGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AL_CombinedGrammarListener ) ((AL_CombinedGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AL_CombinedGrammarVisitor ) return ((AL_CombinedGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}
}
