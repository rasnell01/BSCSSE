using System;
using System.Media;
using System.Threading;

namespace Chapter1
{

    class Chapter1
    {
        
        public static void Main()
        {

            PersonalInfo();
            Lyrics();
            WriteBlinkingText();
        }//end main
        static void PersonalInfo()
        {
            string name = "Ryan Snell";
            string birthday = "06 Dec 1982";
            string cellPhoneNumber = "4041441-3523";
            
            Console.WriteLine(name + " " + birthday + " " + cellPhoneNumber);
            
        }//end method

        static void Lyrics()
        {
            
            Console.WriteLine("Do you have the time, to listen to me whine?");
            Console.WriteLine("about nothing and everything all at once.");
            Console.WriteLine("I am one of those, melodramtic fools,");
            Console.WriteLine("neurotic to the bone.");
            
        }//end method 
        
        
            static void WriteBlinkingText()
            {
                for (int i = 0; i < 5; i++)
                {
                    int delay = 2000;
                    bool visible = true;
                    while (true)
                    {

                        Console.ForegroundColor = ConsoleColor.Red;
                        Console.WriteLine("\a");
                        Console.WriteLine("    XXXXXXXXX    ");
                        Console.WriteLine("  XXX       XXX  ");
                        Console.WriteLine(" XXX         XXX ");
                        Console.WriteLine("XXX           XXX");
                        Console.WriteLine("XXX     KEIF  XXX");
                        Console.WriteLine("XXX           XXX");
                        Console.WriteLine(" XXX         XXX ");
                        Console.WriteLine("  XXX       XXX  ");
                        Console.WriteLine("    XXXXXXXXX    ");
                        Console.WriteLine("        X      ");
                        Console.WriteLine("    [ALL WAY]  ");
                        Console.WriteLine("        X      ");
                        Console.WriteLine("        X      ");
                        Console.WriteLine("        X      ");
                        Console.WriteLine("        X      ");
                        Console.WriteLine("        X      ");
                        Console.WriteLine("        X      ");
                        
                        Thread.Sleep(delay);
                        visible = !visible;
                        i++;    
                    }//end while
                    
                }//end for
                
            }//end method
            
    }//end class
    
}//end namespace

