using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LangC_Capstone.Contexts
{
    public class BlockContext : ParserRuleContext {
		
        public BlockContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState) 
        {

        }
        
        //public List<BlockStatementContext> blockStatement() 
        //{
        //    return GetRuleContexts<BlockStatementContext>();
        //}

        //public BlockStatementContext blockStatement(int i) 
        //{
        //    return GetRuleContext(BlockStatementContext.class, i);
        //}

        //public TerminalNode BEGIN() { return getToken(AL_CombinedGrammarParser.BEGIN, 0); }
        //public TerminalNode END() { return getToken(AL_CombinedGrammarParser.END, 0); }
		
        public override T Accept<T>(Antlr4.Runtime.Tree.IParseTreeVisitor<T> visitor)
        {
 	            if ( visitor is AL_CombinedGrammarVisitor ) 
                {
                    return ((AL_CombinedGrammarVisitor<? extends T>)visitor).visitBlock(this);
                }
			    else
                {
                    return visitor.visitChildren(this);
                }
        }
        

        public override int getRuleIndex() { return RULE_block; }
        
		
		public override void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AL_CombinedGrammarListener ) ((AL_CombinedGrammarListener)listener).enterBlock(this);
		}
		
		public override void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AL_CombinedGrammarListener ) ((AL_CombinedGrammarListener)listener).exitBlock(this);
		}
		
		public override <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AL_CombinedGrammarVisitor ) return ((AL_CombinedGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
}

