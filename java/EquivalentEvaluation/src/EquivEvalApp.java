/**
 * # program 1: Evaluate expressions using arithmetic operators and assignments
 * x = 5
 * y = 3
 * z = x * y - 1
 * print("Result of the expression 'x * y - 1':", z)
 * x += y  # Equivalent to x = x + y
 * print("After incrementing x by y, x =", x)
 */

import static java.lang.System.*;

public class EquivEvalApp {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = x * y - 1;
        out.println("Result of the expression 'x * y - 1': " + z);
        x += y;
        out.println("After incrementing x by y, x = " + x);
    }//end main
}// end class
