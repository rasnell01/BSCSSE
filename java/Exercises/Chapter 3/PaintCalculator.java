//imports
import java.util.Scanner;

//new class
public class PaintCalculator {

    //new main
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        double gallonsNeeded;
        double wallOneSquared;
        double wallTwoSquared;
        double roomSquareFootage;
        final double GALLON_COST = 350;
        double length;
        double width;
        double height;

        //calculate wall area
        System.out.println("what is the length of the first wall? ");
        length = keyboard.nextDouble();

        System.out.println("what is the width of the second wall? ");
        width = keyboard.nextDouble();

        System.out.println("what is the height of the walls? ");
        height = keyboard.nextDouble();
        //calculate the number of gallons needed.

        //display number of gallons needed

       wallOneSquared = (height * length) * 2;
       wallTwoSquared = (height * width) *2;
       roomSquareFootage = wallOneSquared + wallTwoSquared;
       gallonsNeeded = roomSquareFootage / GALLON_COST;

       System.out.println("The job requires " + gallonsNeeded + "gallons of paint");
       System.out.println("The cost of the paint will be: " + costOfPaint(gallonsNeeded));

    }//end main

    //returns the price to the main method
    //one gallon cost = $32. less than a gallon is the same cost.
    //new method for calculating the cost of paint
    public static double costOfPaint(double gallonsNeeded){

        double gallonCost = 32;
        double costOfJob;
        costOfJob = gallonCost * gallonsNeeded;

        return costOfJob;
    }//end method costOfPaint

}//end clas
