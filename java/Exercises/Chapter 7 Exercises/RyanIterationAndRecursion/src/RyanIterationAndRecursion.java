//Ryan Snell
//29 Feb 2024
//Chapter 7 Exercise

//imports
import java.util.*;

public class RyanIterationAndRecursion {

    public static void main(String[] args) {

        ArrayList<Integer> intArray = new ArrayList<Integer>();
        intArray.add(1);
        intArray.add(4);
        intArray.add(45);
        intArray.add(17);
        intArray.add(3);
        intArray.add(99);
        intArray.add(18);

        System.out.println(intArray);
        System.out.println(forLoopAdder(intArray));
        System.out.println(recursionAdder(intArray));
    }//end main

    private static ArrayList<Integer> forLoopAdder(ArrayList<Integer> intArray){

        ArrayList<Integer> integers = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < intArray.length; i++){

            temp = intArray.get(i) + temp;

            for (int j = 0; j < intArray.length; j++){

                    integers.add(temp);

            }//end nested for loop

        }//end for loop

        return integers;
    }//end method

    private static ArrayList<Integer> recursionAdder(ArrayList<Integer> intArray){

        ArrayList<Integer> integers = new ArrayList<>();



        return integers;
    }//end method

}//end class