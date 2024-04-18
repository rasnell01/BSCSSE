//imports
import java.util.Scanner;

//new class
class Dollars {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int twenties;
        int tens;
        int fives;
        int ones;
        int amount;
        int dollars;

        System.out.println("Enter the amount of dollars: ");
        dollars = keyboard.nextInt();

        twenties = dollars / 20;
        dollars = dollars % 20;
        tens = dollars / 10;
        dollars = dollars % 10;
        fives = dollars / 5;
        dollars = dollars % 5;
        ones = dollars;



        System.out.println("Twenties: " + twenties);
        System.out.println("Tens: " + tens);
        System.out.println("Fives: " + fives);
        System.out.println("Ones: " + ones);

    }//end main

}//end class
