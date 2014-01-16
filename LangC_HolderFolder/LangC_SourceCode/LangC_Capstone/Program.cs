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
            string path = "C:\\Users\\Christian\\LangC_Capstone\\LangC_HolderFolder\\LangC_DocumentationFolder\\SampleAL.txt";
            Tokenizer tokenizer = new Tokenizer(path);
            tokenizer.readFile();
        }
    }
}
