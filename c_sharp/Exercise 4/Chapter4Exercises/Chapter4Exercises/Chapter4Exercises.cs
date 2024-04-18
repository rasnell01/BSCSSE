using System;
using System.Threading;
using static System.Console;

namespace Chapter4Exercises
{
    
    internal class Chapter4Exercises
    {
        
        public static void Main(string[] args)
        {
            
            hurricane();
            checkDigit();
            rockPaperScissors();
            lottery();
            
        }//end main
        
        /* The Saffir-Simpson Hurricane Scale classifies hurricanes into five categories numbered
        1 through 5. Write an application named Hurricane that outputs a hurricane’s
        category based on the user’s input of the wind speed. Category 5 hurricanes have
        sustained winds of at least 157 miles per hour. The minimum sustained wind speeds
        for categories 4 through 1 are 130, 111, 96, and 74 miles per hour, respectively. Any
        storm with winds of less than 74 miles per hour is not a hurricane. */
        static void hurricane()
        {
            
            int windSpeed;
            
            WriteLine("Please enter the wind speed in mph: ");
            string temp = ReadLine();
            windSpeed = Convert.ToInt32(temp);
            
            if (windSpeed >= 74 && windSpeed < 96)
            {
                WriteLine("This is a category 1 hurricane.");
            } 
            else if (windSpeed >= 96 && windSpeed < 111)
            {
                WriteLine("This is a category 2 hurricane.");
            }
            else if (windSpeed >=111 && windSpeed < 130)
            {
                WriteLine("This is a category 3 hurricane.");
            }
            else if (windSpeed >= 130 && windSpeed < 157)
            {
                WriteLine("This is a category 4 hurricane.");
            }
            else if (windSpeed >= 157)
            {
                WriteLine("This is a category 5 hurricane.");
            }
            else
            {
                WriteLine("This is not hurricane.");
            }//end elseif
            
        }//end method
        
        /* Account numbers sometimes contain a check digit that is the result of a mathematical
        calculation. The inclusion of the digit in an account number helps ascertain whether
        the number is a valid one. Write an application named CheckDigit that asks a user
        to enter a four-digit account number and determines whether it is a valid number.
        The number is valid if the fourth digit is the remainder when the number represented
        by the first three digits of the four-digit number is divided by 7. For example, 7770 is
        valid, because 0 is the remainder when 777 is divided by 7. */
        static void checkDigit()
        {

            int accountNumber;
            const int CHECK_NUMBER = 7;
            int firstThree;
            int lastDigit;
            
            WriteLine("Please enter your four digit account number: ");
            string temp = ReadLine();
            accountNumber = Convert.ToInt32(temp);
            

        }//end method
        
        /* In the game Rock Paper Scissors, two players simultaneously choose one of three
        options: rock, paper, or scissors. If both players choose the same option, then the
        result is a tie. However, if they choose differently, the winner is determined as follows:
        •• Rock beats scissors, because a rock can break a pair of scissors.
        •• Scissors beats paper, because scissors can cut paper.
        •• Paper beats rock, because a piece of paper can cover a rock. 
        Create a game in which the computer randomly chooses rock, paper, or scissors. Let
        the user enter a character, r, p, or s, each representing one of the three choices. Then,
        determine the winner. Save the application as RockPaperScissors.cs.*/
        static void rockPaperScissors()
        {
            //1 is r, 2 is p, 3 is s
            Random ranNumberGenerator = new Random();
            int randomNumber;
            randomNumber = ranNumberGenerator.Next(1, 3);
            char choice;
            char[] rockPaperScissors = {'r','p','s'};
            
            
            WriteLine("Enter your choice of rock paper or scissors using r, p or s: ");
            string temp = ReadLine();
            choice = Convert.ToChar(temp);

            if (choice == 'r' )
            {
                if (randomNumber == 1)
                {   
                    WriteLine("You chose {0} and the computer chose r. It is a draw", choice);
                } 
                else if (randomNumber == 2)
                {
                    WriteLine("You chose {0} and the computer chose p. You loose.", choice);
                }
                else if (randomNumber == 3)
                {
                    WriteLine("You chose {0} and the computer chose s. You won!", choice);
                }
                
            }
            else if (choice == 'p')
            {
                if (randomNumber == 2)
                {   
                    WriteLine("You chose {0} and the computer chose p. It is a draw", choice);
                } 
                else if (randomNumber == 3)
                {
                    WriteLine("You chose {0} and the computer chose s. You loose.", choice);
                }
                else if (randomNumber == 1)
                {
                    WriteLine("You chose {0} and the computer chose r. You won!", choice);
                }
                
            }
            else if (choice == 's')
            {
                if (randomNumber == 3)
                {   
                    WriteLine("You chose {0} and the computer chose s. It is a draw", choice);
                } 
                else if (randomNumber == 1)
                {
                    WriteLine("You chose {0} and the computer chose r. You loose.", choice);
                }
                else if (randomNumber == 2)
                {
                    WriteLine("You chose {0} and the computer chose p. You won!", choice);
                }
                
            }
            else
            {
                WriteLine("You have entered an invalid choice.");
            }


        }//end method
        
        /* Create a lottery game application named Lottery. Generate three random numbers,
        each between 1 and 4. Allow the user to guess three numbers. Compare each of the
        user’s guesses to the three random numbers, and display a message that includes the
        user’s guess, the randomly determined three-digit number, and the amount of money
        the user has won as follows: 
        
        ** Any one matching 10
        ** Two matching 100
        ** Three matching, not in order 1000
        ** Three matching in exact order 10,000
        ** No matches 0
        
        Make certain that your application accommodates repeating digits. For example, if a
        user guesses 1, 2, and 3, and the randomly generated digits are 1, 1, and 1, do not give
        the user credit for three correct guesses—just one. */

        static void lottery()
        {
            
            
            
            
        }//end method
        
    }//end class
    
}//end namespace