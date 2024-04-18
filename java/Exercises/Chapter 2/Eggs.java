//imports
import java.util.Scanner;

//new class
class Eggs {

    //new method
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int NUMBER_IN_DOZEN = 12;
        double dozenPrice = 3.25;
        double singlePrice = .45;
        int numberOfEggs;
        int dozenEggs;
        int singleEggs;
        double dozenCost;
        double singleCost;

        System.out.println("How many eggs do you need? ");
        numberOfEggs = keyboard.nextInt();

        dozenEggs = numberOfEggs / NUMBER_IN_DOZEN;
        singleEggs = numberOfEggs % NUMBER_IN_DOZEN;

        dozenCost = dozenEggs * dozenPrice;
        singleCost = singleEggs * singlePrice;
        System.out.println(dozenEggs + " dozen eggs at $" + dozenCost + " and " + singleEggs + " single eggs at  $" + singleCost);

    }//end main

}//end class
