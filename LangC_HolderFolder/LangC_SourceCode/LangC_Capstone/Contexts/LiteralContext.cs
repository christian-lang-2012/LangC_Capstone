﻿using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LangC_Capstone.Contexts
{
    public class LiteralContext : ParserRuleContext {
		public ITerminalNode NullLiteral() { return getToken(AL_CombinedGrammarParser.NullLiteral, 0); }
		public ITerminalNode CharacterLiteral() { return getToken(AL_CombinedGrammarParser.CharacterLiteral, 0); }
		public ITerminalNode IntegerLiteral() { return getToken(AL_CombinedGrammarParser.IntegerLiteral, 0); }
		public ITerminalNode StringLiteral() { return getToken(AL_CombinedGrammarParser.StringLiteral, 0); }
		public ITerminalNode FloatingPointLiteral() { return getToken(AL_CombinedGrammarParser.FloatingPointLiteral, 0); }
		public ITerminalNode BooleanLiteral() { return getToken(AL_CombinedGrammarParser.BooleanLiteral, 0); }
		
        public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		
        @Override public int getRuleIndex() { return RULE_literal; }
		
        @Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AL_CombinedGrammarListener ) ((AL_CombinedGrammarListener)listener).enterLiteral(this);
		}
		
        @Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AL_CombinedGrammarListener ) ((AL_CombinedGrammarListener)listener).exitLiteral(this);
		}
		
        @Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AL_CombinedGrammarVisitor ) return ((AL_CombinedGrammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
}
