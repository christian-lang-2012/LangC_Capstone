using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LangC_Capstone
{
    public class ExpressionParsing
    {
        IO io = new IO();

        public void Term()
        {
            this.MathFactor();
            
            do
            {
                io.WriteLine("MOVE D0,-(SP)");
                if (io.InputChar == '*')
                {
                    ParseMultiply();
                }
                else if (io.InputChar == '/')
                {
                    ParseDivide();
                }
                else
                {
                    io.Expected("Multiplication or Division Operator");
                }
            }
            while (io.InputChar == '*' || io.InputChar == '/');

            io.WriteLine("MOVE #," + io.GetNumber() + ",D0");
        }

        public void ParseAdd()
        {
            io.Match('+');
            Term();
            io.WriteLine("ADD (SP)+,D0");
        }

        public void ParseSubtract()
        {
            io.Match('-');
            Term();
            io.WriteLine("SUB (SP)+,D0");
            io.WriteLine("NEG D0");
        }

        public void ParseMultiply()
        {
            io.Match('*');
            Term();
            io.WriteLine("MULS (SP)+,D0");
        }

        public void ParseDivide()
        {
            io.Match('/');
            Term();
            io.WriteLine("MOVE (SP)+,D0");
            io.WriteLine("DIVS D1,D0");
        }

        public void MathFactor()
        {
            io.WriteLine("MOVE #" + io.GetNumber() + ",D0");
        }

        public void ParseEntireExpression()
        {
            Term();
            do
            {
                io.WriteLine("MOVE D0,-(SP)");
                if (io.InputChar == '+')
                {
                    ParseAdd();
                }
                else if (io.InputChar == '-')
                {
                    ParseSubtract();
                }
                else
                {
                    io.Expected("Addition or Subtraction Operator");
                }
            }
            while (io.InputChar == '+' || io.InputChar == '-');
        }
    }
}