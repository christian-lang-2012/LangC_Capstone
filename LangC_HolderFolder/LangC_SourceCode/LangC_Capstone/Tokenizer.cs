using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace LangC_Capstone
{
    public class Tokenizer
    {
        public char InputChar { get; set; }
        string path = "";
        string fileText = "";
        string[] tokens;

        private string inputString;

        public Tokenizer(string inputPath)
        {
            path = inputPath;
        }

        public void readFile()
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
                                Console.WriteLine("Invalid file header.");
                                break;
                            }
                            else
                            {
                                isFirstLine = false;
                                fileText = fileText + line;
                            }
                        }
                        else
                        {
                            fileText = fileText + line;                            
                        }
                    }

                    tokens = fileText.Split(new string[] { Environment.NewLine }, StringSplitOptions.None);

                    foreach(string s in tokens)
                        Console.WriteLine(s);
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("The file could not be read: ");
                Console.WriteLine(e.Message);
            }
        }
    }
}
