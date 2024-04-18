using System.IO;
using static System.Console;

namespace FilesIO
{
    
    internal class Program
    {
        
        public static void Main(string[] args)
        {
            
            string fileName;
            Write("Enter a filename >> ");
            fileName = ReadLine();
            if(File.Exists(fileName))
            {
                WriteLine("File exists");
                WriteLine("File was created " +
                          File.GetCreationTime(fileName));
                WriteLine("File was last written to " +
                          File.GetLastWriteTime(fileName));
            }
            else
            {
                WriteLine("File does not exist");
            }
            
        }//end main
        
    }//end class

    class DirectoryInformation
    {
        
        public void directoryInformation()
        {
            
            string directoryName;
            string[] listOfFiles;
            Write("Enter a Folder >> ");
            directoryName = ReadLine();
            if (Directory.Exists(directoryName))
            {
                WriteLine("Directory exists, and it contains the following: ");
                listOfFiles = Directory.GetFiles(directoryName);
                for (int x = 0; x < listOfFiles.Length; ++x)
                    WriteLine("     {0}", listOfFiles[x]);
            }
            else
            {
                WriteLine("Directory does not exist.");
            }


        }//end method
        
    }//end class

    class FileStreamer
    {

        public void fileStreamer()
        {

            FileStream outFile = new FileStream("SomeText.txt", 
                FileMode.Create, FileAccess.Write);
            StreamWriter writer = new StreamWriter(outFile);
            Write("Enter some text >> ");
            string text = ReadLine();
            writer.WriteLine(text);
            //Error occurs if the next two statements are reversed
            writer.Close();
            outFile.Close();

        }
        
    }
    
}//end namespace