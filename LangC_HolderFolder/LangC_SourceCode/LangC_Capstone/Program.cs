using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LangC_Capstone
{
    class Program
    {
        static void Main(string[] args)
        {
            IO myIO = new IO();
            ExpressionParsing parsing = new ExpressionParsing();
            myIO.Initialize();
            parsing.ParseEntireExpression();
        }
    }
}
