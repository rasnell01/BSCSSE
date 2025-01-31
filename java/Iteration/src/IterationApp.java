/**
 *# program 2: Using a for loop to iterate over a range with a control structure
 * numbers = [10, 20, 30, 40, 50]
 * for num in numbers:
 *     if num % 20 == 0:
 *         print(num, "is divisible by 20")
 *     else:
 *         print(num, "is not divisible by 20")
 */

import static java.lang.System.*;

public class IterationApp {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        for (int num : numbers) {
            if (num % 20 == 0) {
                out.println(num + " is divisible by 20");
            } else {
                out.print(num + " is not divisible by 20");
            }// end if else
        }// end for
    }// end main
}// end class
