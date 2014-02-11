using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LangC_Capstone
{
    class Program
    {
        static void Main(string[] args)
        {
            string path = "C:\\Users\\Christian\\LangC_Capstone\\LangC_HolderFolder\\LangC_DocumentationFolder\\SampleAL.txt";

            StreamReader sr = new StreamReader(path);

            AntlrInputStream input = new AntlrInputStream(sr);
            AL_Lexer lexer = new AL_Lexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AL_Parser parser = new AL_Parser(tokens);            

        }
    }
}
