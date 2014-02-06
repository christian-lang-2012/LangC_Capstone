using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using LangC_Capstone.Visitor;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using LangC_Capstone.Listeners;

namespace LangC_Capstone.Contexts
{
    public class BlockContext : ParserRuleContext {
		
        public BlockContext(ParserRuleContext parent, int invokingState) : base(parent, invokingState) 
        {

        }

        public ITerminalNode BEGIN() 
        { 
            return GetToken(AL_Parser.BEGIN, 0); 
        }
        
        public ITerminalNode END() 
        { 
            return GetToken(AL_Parser.END, 0); 
        }
        
        public IReadOnlyList<BlockStatementContext> blockStatement() 
        {
            return GetRuleContexts<BlockStatementContext>();
        }

        public BlockStatementContext blockStatement(int i) 
        {
            return GetRuleContext<BlockStatementContext>(i);
        }

        public override T Accept<T>(Antlr4.Runtime.Tree.IParseTreeVisitor<T> visitor)
        {
 	            if ( visitor is GrammarVisitor<T> ) 
                {
                    return ((GrammarVisitor<? extends T>)visitor).visitBlock(this);
                }
			    else
                {
                    return visitor.VisitChildren(this);
                }
        }
        

        public override int getRuleIndex() 
        { 
            return RULE_block; 
        }
        
		
		public override void enterRule(IParseTreeListener listener) 
        {
			if ( listener is GrammarListener ) ((GrammarListener)listener).enterBlock(this);
		}
		
		public override void exitRule(IParseTreeListener listener) 
        {
			if ( listener is GrammarListener ) ((GrammarListener)listener).exitBlock(this);
		}
		
		public override <T> T accept(ParseTreeVisitor<? extends T> visitor) 
    {
			if ( visitor is GrammarVisitor ) 
                return ((AL_CombinedGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else 
                return visitor.VisitChildren(this);
		}
}

