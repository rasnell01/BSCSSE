//imports
import java.util.Scanner;

//new class
class QuartsToGallonsInteractive {

    //new main
    public static void main(String[] args){

        Scanner keyboard = new Scanner (System.in);
        int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 0;
        int gallonsNeeded;
        int quartsLeft;

        System.out.println("Please enter the number of quarts: ");
        quartsNeeded = keyboard.nextInt();

        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        quartsLeft = quartsNeeded % QUARTS_IN_GALLON;

        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + quartsLeft + " quarts");

    }//end main

}//end class
