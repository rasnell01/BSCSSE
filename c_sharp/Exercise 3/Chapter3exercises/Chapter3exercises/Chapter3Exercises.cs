using System;
using System.Collections.Generic;
using System.Threading;
using static System.Console;

namespace Chapter3exercises
{
    
    internal class Chapter3Exercises
    {
        
        static void Main(string[] args)
        {
            
            moveEstimartorGUI();
            eggsInteractiveGUI();
            makeChangeGUI();
            monthNamesGUI();
            
        }//end main
        
        /* Write a program named MoveEstimatorGUI that prompts a user for the number
        of hours for a moving job and the number of miles involved in the move. After the
        user clicks a Button, display the moving fee which includes a base rate of $200 plus
        $150 per hour and $2 per mile. */
        static void moveEstimartorGUI()
        {
            
            const double BASE_RATE = 200;
            const double HOURLY_RATE = 150;
            const int PER_MILE = 2;
            double hours;
            double miles;
            double totalCost;
            
            WriteLine("How many hours will the job take to complete?");
            string temp = ReadLine();
            hours = Convert.ToDouble(temp);
            
            WriteLine("How many miles is it in total?");
            temp = ReadLine();
            miles = Convert.ToDouble(temp);

            totalCost = (hours * HOURLY_RATE) + (miles * PER_MILE) + (BASE_RATE);
            WriteLine("The cost for the job is ${0}.", totalCost);
            
        } //end method
        
        /* Write a GUI program named EggsInteractiveGUI that allows a user to input the
        number of eggs produced in a month by each of five chickens. Sum the eggs, then display
        the total in dozens and eggs. For example, a total of 127 eggs is 10 dozen and 7 eggs. */
        static void eggsInteractiveGUI()
        {
            
            const int DOZEN = 12;
            //int[] chickens2 = new int[4];
            int[] eggs2 = new int[4];
            int dozensOfEggs2;
            int singleEggs2;
            int totalEggs2 = 0;
            
            for (int j = 0; j < eggs2.Length; j++)
            {
                WriteLine("What is the amount of eggs for this chicken?");
                string temp1 = ReadLine();
                eggs2[j] = Convert.ToInt32(temp1);
                int temp = eggs2[j];
                totalEggs2 = totalEggs2 + temp;
                
            }//end for 
            
            dozensOfEggs2 = totalEggs2 / DOZEN;                               
            singleEggs2 = totalEggs2 % DOZEN;                                 
            WriteLine("There are {0} dozen and {1} single eggs this month", dozensOfEggs2, singleEggs2);
            
        }//end method
        
        /* Write a GUI program named MakeChangeGUI that calculates and displays the
        conversion of an entered number of dollars into currency denominations—twenties,
        tens, fives, and ones. For example, $113 is 5 twenties, 1 ten, 0 fives, and 3 ones. */
        static void makeChangeGUI()
        {

            int tempInt;
            int totalDollars;
            int twenties;
            int tens;
            int fives;
            int ones;
            
            WriteLine("How much money is there in whole dollars? (no coinage) ");
            string tempString = ReadLine();
            totalDollars = Convert.ToInt32(tempString);

            twenties = totalDollars / 20;
            tempInt = totalDollars % 20;
            tens = tempInt / 10;
            tempInt = tempInt % 10;
            fives = tempInt / 5;
            tempInt = tempInt % 5;
            ones = tempInt;
            
            WriteLine("You entered ${0}.", totalDollars);
            WriteLine("You have {0} twenties.", twenties);
            WriteLine("You have {0} tens.", tens);
            WriteLine("You have {0} fives.", fives);
            WriteLine("You have {0} ones.", ones);

        }//end method
        
        /* Create an enumeration named Month that holds values for the months of the year,
        starting with JANUARY equal to 1. (Recall that an enumeration must be placed within
        a class but outside of any method.) Write a GUI program named MonthNamesGUI
        that prompts the user for a month integer. Convert the user’s entry to a Month value,
        and display it. */
        
        //enumeration
        enum Enum_Months
        {
            January,
            February,
            March,
            April,
            May,
            June,
            July,
            August,
            September,
            October,
            November,
            December
        }//end enumeration
        
        static void monthNamesGUI()
        {
            
            foreach (var item in Enum.GetNames(typeof (Enum_Months)))
            {
                
                Console.WriteLine(item);
                
            }//end enumeration printing
            
        }//end method
        
    }//end class
    
}//end namespace