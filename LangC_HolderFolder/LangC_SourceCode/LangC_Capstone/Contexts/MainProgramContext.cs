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
    public  class MainProgramContext : ParserRuleContext {
		public IReadOnlyList<BlockStatementContext> blockStatement() {
			return GetRuleContexts<BlockStatementContext>();
		}
		public BlockStatementContext blockStatement(int i) {
			return GetRuleContext<BlockStatementContext>(i);
		}
		public MainProgramContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState){
		}
		public override int getRuleIndex() { return AL_Parser.RULE_mainProgram; }
		
		public override void enterRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).EnterMainProgram(this);
		}
		
		public override void exitRule(IParseTreeListener listener) {
			if ( listener is GrammarListener ) ((GrammarListener)listener).ExitMainProgram(this);
		}
		
		public override T accept<T>(IParseTreeVisitor<T> visitor) {
			if ( visitor is GrammarVisitor<T> ) return ((GrammarVisitor<T>)visitor).visitMainProgram(this);
			else return visitor.VisitChildren(this);
		}
	}
}
