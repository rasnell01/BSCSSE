/**
 * # program 2: Swapping two variables using tuple unpacking
 * a = 5
 * b = 10
 * print("Original a and b:", a, b)
 * a, b = b, a  # Swap values
 * print("Swapped a and b:", a, b)
 * Is there a 'clever' way in Java where swapping numbers would NOT involve a temp variable.
 * How many such 'clever' way(s) can you think of.
 * Try refrain from googling it, so that you can 'remember' for a long term.
 * Note: strongly prefer posting your solutions to your github and paste the URL to the BB.
 * If there's any write-up, either save it to a plain text file or pdf.
 */

import static java.lang.System.*;

public class TupleSwapApp {
    public static void main(String[] args) {

        // swapping using an array
        int a = 5;
        int b = 10;
        out.println("Original: a = " + a + " and b = " + b);

        int[] array = new int[4];
        array[0] = a;
        array[1] = b;
        array[2] = a + 5;
        array[3] = b - 5;
        
        for (int i = 0; i < array.length; i++) {
            out.println("array[" + i + "] = " + array[i]);
        }// end for

        a = array[2];
        b = array[3];
        out.println("Swapped: a = " + a + " and b = " + b);

        // swapping using XOR
        int x = 5;
        int y = 3;
        out.println("Original: x = " + x + " and y = " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        out.println("Swapped: x = " + x + " and y = " + y);

        // swapping using finagling
        int n = 5;
        int m = 10;
        out.println("Original: n = " + n + " and m = " + m);
        n = n + m;
        m = n - m;
        n = n - m;
        out.println("Swapped: n = " + n + " and m = " + m);

    }// end main
}// end class
