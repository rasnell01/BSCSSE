using System;
using System.Threading;
using static System.Console;

namespace Chapter2
{

    class Chapter2
    {
        
        static void Main(string[] args)
        {
            
            //number 6
            inchesToCentimeterslnteractive();
            //number 7 & 8
            projectedRaisesInteractive();
            //number 9
            moveEstimator();
            //number 10
            hoursAndMinutes();
            //number 11 & 12
            eggsInteractive();
            //number 13
            
            //number 14
            
            //number 15
            
            //number 16
            
        }//end main

        /* Convert the InchesToCentimeters program to an interactive application named
        InchesToCentimeterslnteractive. Instead of assigning a value to the inches variable,
        accept the value from the user as input. */
        static void inchesToCentimeterslnteractive()
        {
            const double CENTIMETER = 2.54;
            double converteredCentimeters;
            double inches;
            string inchesAsString;
            inchesAsString = ReadLine();
            inches = Convert.ToDouble(inchesAsString);

            converteredCentimeters = inches / CENTIMETER;
            
            WriteLine("There are {0} centimeters in {1} inches.", converteredCentimeters, inches);
            
        }//end method

        /* Write a C# program named ProjectedRaises that includes a named constant
        representing next year’s anticipated 4 percent raise for each employee in a company. Also
        declare variables to represent the current salaries for three employees. Assign values to
        the variables, and display, with explanatory text, next year’s salary for each employee. */
        
        /* Convert the ProjectedRaises class to an interactive application named
        ProjectedRaisesInteractive. Instead of assigning values to the salaries, accept them
        from the user as input. */
        static void projectedRaisesInteractive()
        {

            const double PERCENT_RAISE = .04;
            double[] salaries = new double[] { 54978.32, 82549.79, 62554.87 };
            string[] employees = {"Jim", "Jenny", "George"};
            double[] newSalaries = new double[3];
            
            string[] employees2 = new string[3];
            double[] newSalaries2 = new double[3];
            double[] salaries2 = new double[3];
            
            for (int i = 0; i < employees.Length; i++)
            {
                
                double temp = salaries[i] * PERCENT_RAISE;
                newSalaries[i] = salaries[i] + temp;
                WriteLine("{0} will be receiving ${1} a year, next year instead of ${2} that they received this " +
                          "year", employees[i], newSalaries[i], salaries[i]);
                    
            }//end for 

            for (int j = 0; j < employees2.Length; j++)
            {
                WriteLine("Enter the employee name: ");
                employees2[j] = ReadLine();
                
                WriteLine("Enter the employee's current salaray: ");
                string temp1 = ReadLine();
                double temp2 = Convert.ToDouble(temp1);
                
                newSalaries2[j] = salaries2[j] + temp2;                                                                
                WriteLine("{0} will be receiving ${1} a year, next year instead of ${2} that they received this " + 
                          "year", employees2[j], newSalaries2[j], salaries2[j]);                                       
                

            }//end for
            
        }//end method
        
        /* Malcolm Movers charges a base rate of $200 per move plus $150 per hour and $2 per
        mile. Write a program named MoveEstimator that prompts a user for and accepts
        estimates for the number of hours for a job and the number of miles involved in the
        move and displays the total moving fee. */
        static void moveEstimator()
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

        }//end method
        
        /* Write a program named HoursAndMinutes that declares a minutes variable to
        represent minutes worked on a job, and assign a value to it. Display the value in hours
        and minutes. For example, 197 minutes becomes 3 hours and 17 minutes. */
        static void hoursAndMinutes()
        {

            const int MINUTES_IN_HOUR = 60;
            int totalMinutes = 259;
            double hours = totalMinutes / MINUTES_IN_HOUR;
            double minutes = totalMinutes % MINUTES_IN_HOUR;
            
            WriteLine("{0} hours and {1} minutes", hours, minutes);

        }//end method
        
        /* Write a program named Eggs that declares four variables to hold the number of eggs
        produced in a month by each of four chickens, and assign a value to each variable.
        Sum the eggs, then display the total in dozens and eggs. For example, a total of 127
        eggs is 10 dozen and 7 eggs. */
        
        /* Modify the Eggs program to create a new one named EggsInteractive that prompts
        the user for and accepts a number of eggs for each chicken. */                   
        static void eggsInteractive()
        {

            const int DOZEN = 12;
            int[] chickens = new int[4];
            int[] eggs = new int[4];    
            int dozensOfEggs;           
            int singleEggs;             
            int totalEggs = 0;   
            
            int[] chickens2 = new int[4];
            int[] eggs2 = new int[4];
            int dozensOfEggs2;
            int singleEggs2;
            int totalEggs2 = 0;

            for (int i = 0; i < eggs.Length; i++)
            {

                int temp = eggs[i];
                totalEggs = totalEggs + temp;

            }//end for
            
            dozensOfEggs = totalEggs / DOZEN;
            singleEggs = totalEggs % DOZEN;
            WriteLine("There are {0} dozen and {1} single eggs this month", dozensOfEggs, singleEggs);
            
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
        
        /* Write a program named MakeChange that calculates and displays the conversion of
        an entered number of dollars into currency denominations—twenties, tens, fives, and
        ones. For example, $113 is 5 twenties, 1 ten, 0 fives, and 3 ones. */
        
        /* Write a program named TestsInteractive that prompts a user for eight test scores and
        displays the average of the test scores to two decimal places. */
        
        /* Write a program named FahrenheitToCelsius that accepts a temperature in
        Fahrenheit from a user and converts it to Celsius by subtracting 32 from the Fahrenheit
        value and multiplying the result by 5/9. Display both values to one decimal place. */
        
        /* Create an enumeration named Month that holds values for the months of the year,
        starting with JANUARY equal to 1. Write a program named MonthNames that prompts
        the user for a month integer. Convert the user’s entry to a Month value, and display it. */
        
        
    }//end class
    
}//end namespace
