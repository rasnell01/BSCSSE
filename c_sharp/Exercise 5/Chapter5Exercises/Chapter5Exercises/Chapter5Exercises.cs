using System;
using System.Globalization;
using System.Threading;
using static System.Console;

namespace Chapter5Exercises
{
    
    internal class Chapter5Exercises
    {
        
        public static void Main(string[] args)
        {
            
            homeSales();
            perfect();
            countVowels();
            guessingGame();
            
        }//end main
        
        /* Danielle, Edward, and Francis are three salespeople at Holiday Homes. Write an
        application named HomeSales that prompts the user for a salesperson initial (D, E,
        or F ). Either uppercase or lowercase initials are valid. While the user does not type Z,
        continue by prompting for the amount of a sale. Issue an error message for any invalid
        initials entered. Keep a running total of the amounts sold by each salesperson. After
        the user types Z or z for an initial, display each salesperson’s total, a grand total for all
        sales, and the name of the salesperson with the highest total. */
        static void homeSales()
        {

            string[] salesPeople = { "Danielle", "Edward", "Francis" };
            char initials;
            float[] salesDanielle = new float[10];
            float[] salesEdward = new float[10];
            float[] salesFrancis = new float[10];
            
            WriteLine("These are the current sales reps: {0}",string.Join(", ", salesPeople));
            WriteLine("Enter the first initial of the salesperson: ");
            string temp = ReadLine();
            initials = Convert.ToChar(temp);
            
            while (initials != 'z' || initials != 'Z')
            {
                
                if (initials == 'D' || initials == 'd')
                {
                    for (int i = 0; i < salesDanielle.Length; i++)
                    {
                        WriteLine("In for loop");
                        WriteLine("Enter the sales amount: ");
                        string tempD = ReadLine();
                        float danielle = float.Parse(tempD, CultureInfo.InvariantCulture.NumberFormat);
                        salesDanielle[i] = danielle;
                        WriteLine("Input {0} saved.", danielle);
                    }
                }
                else if (initials == 'E' || initials == 'e')
                {
                    for (int i = 0; i < salesEdward.Length; i++)
                    {
                        WriteLine("Enter the sales amount: ");
                        string tempE = ReadLine();
                        float edward = float.Parse(tempE, CultureInfo.InvariantCulture.NumberFormat);
                        salesDanielle[i] = edward;
                        WriteLine("Input {0} saved.", edward);
                    }
                }
                else if (initials == 'F' || initials == 'f')
                {
                    for (int i = 0; i < salesFrancis.Length; i++)
                    {
                        WriteLine("Enter the sales amount: ");
                        string tempF = ReadLine();
                        float francis = float.Parse(tempF, CultureInfo.InvariantCulture.NumberFormat);
                        salesDanielle[i] = francis;
                        WriteLine("Input {0} saved.", francis);
                    }
                }
                else 
                { 
                    WriteLine("You have failed to select a sales person, try again.");
                }//end elseif
                
            }//end while
            
            WriteLine(salesDanielle);
            WriteLine(salesEdward);
            WriteLine(salesFrancis);
            
        }//end method
        
        /* Write an application named Perfect that displays every perfect number from 1
        through 10,000. A number is perfect if it equals the sum of all the smaller positive
        integers that divide evenly into it. For example, 6 is perfect because 1, 2, and 3 divide
        evenly into it and their sum is 6. */
        static void perfect()
        {
            
            
            
        }//end method
        
        /* Write a program named CountVowels that accepts a phrase from the user and counts
        the number of vowels in the phrase. For this exercise, count both uppercase and
        lowercase vowels, but do not consider y to be a vowel. */
        static void countVowels()
        {
            
            
            
        }//end method
        
        /* Modify the GuessingGame2 program to create a program called GuessingGame3
        in which the player is criticized for making a “dumb” guess. For example, if the player
        guesses that the random number is 4 and is told that the guess is too low, and then the
        player subsequently makes a guess lower than 4, display a message that the user should
        have known not to make such a low guess. */
        static void guessingGame()
        {
            
            
            
        }//end method
        
    }//end class
    
}//end namespace