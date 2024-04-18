//imports
import java.util.Scanner;

//new class
public class Insurance {

    //new main
    public static void main(String[] args){


        Scanner keyboard = new Scanner(System.in);
        int currentYear;
        int birthYear;
        int clientAge;

        System.out.println("What year is it? Please use the four digit format.");
        currentYear = keyboard.nextInt();

        System.out.println("What year were you born? please use the four digit format.");
        birthYear = keyboard.nextInt();

        clientAge = currentYear - birthYear;
        System.out.println("You are " + clientAge + "years old");

        System.out.println("The premium this year will be: $" + premiumCost(clientAge));
    }//end main

    //new method
    public static int premiumCost(int clientAge){

        int premiumCost;
        int clientDecade;

        clientDecade = (clientAge / 10) * 10;
        premiumCost = (clientDecade + 15) * 20;

       return premiumCost;
    }//end method premiumCost

}//end clas
