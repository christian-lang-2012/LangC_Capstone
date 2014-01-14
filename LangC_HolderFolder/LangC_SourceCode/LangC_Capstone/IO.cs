using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace LangC_Capstone
{
    public class IO
    {
        public char InputChar { get; set; }
        string path = "C:\\Users\\Christian\\LangC_Capstone\\LangC_HolderFolder\\LangC_DocumentationFolder\\SampleAL.txt";

        private string inputString;

        public IO()
        {
            
        }

        public void checkForCorrectHeader()
        {
            string properHeader = ":alproject:";
            bool isFirstLine = true;

            try
            {
                using (StreamReader sr = new StreamReader(path))
                {
                    string line;
                    while ((line = sr.ReadLine()) != null)
                    {
                        if (isFirstLine)
                        {
                            if (line != properHeader)
                            {
                                Console.WriteLine("Invalid File Header");
                                break;
                            }
                            else
                            {
                                isFirstLine = false;
                                Console.WriteLine(line);
                            }
                        }
                        else
                        {
                            Console.WriteLine(line);
                        }
                    }
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("The file could not be read: ");
                Console.WriteLine(e.Message);
            }
        }

        public void readNextChar()
        {
            inputString = Console.In.ReadLine();
            if (inputString.Length == 1)
            {
                char[] look = inputString.ToCharArray();
                InputChar = look[0];
            }
        }

        public void Error(string s)
        {
            Console.WriteLine();
            Console.WriteLine("Error: " + s + ".");
        }

        public void Abort(string s)
        {
            Error(s);
            Environment.Exit(0);
        }

        public void Expected(string s)
        {
            Abort(s + " expected");
        }

        public void Match(char c)
        {
            if (InputChar == c)
            {
                readNextChar();
            }
            else
            {
                Expected("" + c + "");
            }
        }

        public bool IsAlpha(char c)
        {
            return Char.IsLetter(c);
        }

        public bool IsNumber(char c)
        {
            return Char.IsNumber(c);
        }

        public char GetName()
        {
            if(!IsAlpha(InputChar))
                Expected("Name");

            char c = InputChar;
            readNextChar();

            return Char.ToUpper(c);
        }

        public char GetNumber()
        {
            if (!IsNumber(InputChar))
                Expected("Integer");

            char c = InputChar;

            readNextChar();

            return c;
        }

        public void WriteLine(string line)
        {
            Console.WriteLine(line);
        }

        public void Initialize()
        {
            readNextChar();
        }

    }
}
