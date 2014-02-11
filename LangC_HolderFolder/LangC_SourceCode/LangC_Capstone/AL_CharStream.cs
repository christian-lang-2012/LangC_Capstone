using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LangC_Capstone
{
    public class AL_CharStream : ITokenStream
    {

        public IToken Get(int i)
        {
            throw new NotImplementedException();
        }

        public string GetText(IToken start, IToken stop)
        {
            throw new NotImplementedException();
        }

        public string GetText(RuleContext ctx)
        {
            throw new NotImplementedException();
        }

        public string GetText()
        {
            throw new NotImplementedException();
        }

        public string GetText(Antlr4.Runtime.Misc.Interval interval)
        {
            throw new NotImplementedException();
        }

        public IToken Lt(int k)
        {
            throw new NotImplementedException();
        }

        public ITokenSource TokenSource
        {
            get { throw new NotImplementedException(); }
        }

        public void Consume()
        {
            throw new NotImplementedException();
        }

        public int Index
        {
            get { throw new NotImplementedException(); }
        }

        public int La(int i)
        {
            throw new NotImplementedException();
        }

        public int Mark()
        {
            throw new NotImplementedException();
        }

        public void Release(int marker)
        {
            throw new NotImplementedException();
        }

        public void Seek(int index)
        {
            throw new NotImplementedException();
        }

        public int Size
        {
            get { throw new NotImplementedException(); }
        }

        public string SourceName
        {
            get { throw new NotImplementedException(); }
        }
    }
}
