using System;
using System.Threading;
using static System.Console;

namespace Chapter8Exercises
{
    
    internal class Chapter8Exercises
    {
        
        public static void Main(string[] args)
        {
            
            reverse3();
            integerFacts();
            getFlightInfo();
            averages();
            fillDeck();
            selectCard();
            
        }//end main
        
        //1, 2, 3, 7, and 10a
        /* 1. a. Create a program named Reverse3 whose Main() method declares three integers
        named firstInt, middleInt, and lastInt. Assign values to the variables,
        display them, and then pass them to a method that accepts them as reference
        variables, places the first value in the lastInt variable, and places the last value
        in the firstInt variable. In the Main() method, display the three variables again,
        demonstrating that their positions have been reversed.
        b. Create a new program named Reverse4, which contains a method that reverses
        the positions of four variables. Write a Main() method that demonstrates the
        method works correctly. */
        static void reverse3()
        {
            
            
            
        }//end method
        
        /* Create a program named IntegerFacts whose Main() method declares an array of
        10 integers. Call a method to interactively fill the array with any number of values up
        to 10 or until a sentinel value is entered. If an entry is not an integer, reprompt the
        user. Call a second method that accepts out parameters for the highest value in the
        array, lowest value in the array, sum of the values in the array, and arithmetic average.
        In the Main() method, display all the statistics. */
        static void integerFacts()
        {
            
            
            
        }//end method
        
        /* Create a program for Smalltown Regional Airport Flights that accepts either an
        integer flight number or string airport code from the options in Figure 8-33. Pass the
        
        Flight number Airport code Airport name Time
        201     AUS     Austin              0710
        321     CRP     Corpus Christi      0830
        510     DFW     Dallas Fort Worth   0915
        633     HOU     Houston             1140 
        
        user’s entry to one of two overloaded GetFlightInfo() methods, and then display a
        returned string with all the flight details. The method version that accepts an integer
        looks up the airport code, name, and time of flight; the version that accepts a string
        description looks up the flight number, airport name, and time. The methods return
        an appropriate message if the flight is not found. */
        static void getFlightInfo()
        {
            
            
            
        }//end method
        
        /* Write a program named Averages that includes a method that accepts any number of
        numeric parameters, displays them, and displays their average. Demonstrate that the
        method works correctly when passed one, two, or three numbers, or an array of numbers. */
        static void averages()
        {
            
            
            
        }//end method
        
        /* In the card game War, a deck of playing cards is divided between two players. Each
        player exposes a card; the player whose card has the higher value wins possession
        of both exposed cards. Create a console-based computerized game of War named
        WarCardGame in which a standard 52-card deck is randomly divided between two players, 
        one of which is the computer. Reveal one card for the computer and one card
        for the player at a time. Award two points for the player whose card has the higher
        value. (For this game, the king is the highest card, followed by the queen and jack, then
        the numbers 10 down to 2, and finally the ace.) If the computer and player expose
        cards with equal values in the same turn, award one point to each. At the end of the
        game, all 52 cards should have been played only once, and the sum of the player’s and
        computer’s score will be 52.
        
        a. Use an array of 52 integers to store unique values for each card. Write a method
        named FillDeck() that places 52 unique values into this array. Write another
        method named SelectCard() that you call twice on each deal to select a unique
        card for each player, with no repetition of cards in 26 deals. (To pause the play
        between each dealt hand, use a call to ReadLine().) */
        static void fillDeck()
        {
            
            
            
        }//end mehtod

        static void selectCard()
        {
            
            
            
        }//end method
        
    }//end class
    
}//end namespace