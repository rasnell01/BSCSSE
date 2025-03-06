import java.util.Scanner;

import static java.lang.System.out;

public class MainJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        out.println("Please enter the message: ");
        String message = input.nextLine();

        MainKotlinKt.sayHello(message);
        MainKotlinKt.publicHello(message);

        out.println("Please enter a whole number: ");
        String wholeNumber = input.nextLine();
        int a = Integer.parseInt(wholeNumber);
        out.println("Please enter a whole number: ");
        wholeNumber = input.nextLine();
        int b = Integer.parseInt(wholeNumber);

        out.println(MainKotlinKt.whoIsBigger(a,b) + " is the bigger number.");
        out.println(MainKotlinKt.whoIsSmaller(a,b) + " is the smaller number.");

    }//end main

}//end class
