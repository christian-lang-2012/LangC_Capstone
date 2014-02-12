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
    public class ProgramContext : ParserRuleContext 
    {
		public ProgramDeclarationContext programDeclaration() 
        {
			return GetRuleContext<ProgramDeclarationContext>(0);
		}
		
        public ITerminalNode ProgramHeader() { return GetToken(AL_Parser.ProgramHeader, 0); }
	    	
        public MethodDeclarationContext methodDeclaration(int i) 
        {
			return GetRuleContext<MethodDeclarationContext>(i);
		}
		
        public VariableDeclarationContext variableDeclaration(int i) {
			return GetRuleContext<VariableDeclarationContext>(i);
		}
		
        public ITerminalNode MethodHeader() { return GetToken(AL_Parser.MethodHeader, 0); }
		
        public ITerminalNode VariableHeader() { return GetToken(AL_Parser.VariableHeader, 0); }
		
        public IReadOnlyList<MethodDeclarationContext> methodDeclaration() {
			return GetRuleContexts<MethodDeclarationContext>();
		}
		public MainProgramContext mainProgram() {
			return GetRuleContext<MainProgramContext>(0);
		}
		public IReadOnlyList<VariableDeclarationContext> variableDeclaration() {
			return GetRuleContexts<VariableDeclarationContext>();
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){

		}
		public override int GetRuleIndex() { return AL_Parser.RULE_program; }
		
		public override void EnterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).EnterProgram(this);
		}
		
		public override void ExitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitProgram(this);
		}
		
		public override T Accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitProgram(this);
			else return visitor.VisitChildren(this);
		}
	}
}
