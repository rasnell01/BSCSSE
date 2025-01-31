/**
 * # Using closures to create a function with a preserved state
 * def make_multiplier(x):
 *     def multiplier(n):
 *         return x * n
 *     return multiplier
 * double = make_multiplier(2)
 * triple = make_multiplier(3)
 * print("Double 5:", double(5))
 * print("Triple 5:", triple(5))
 */

import java.util.function.Function;
import static java.lang.System.*;

public class PreservedStateApp {
    public static Function<Integer,Integer> makeMultiplier(int x) {
        // lambda function simulating closure behavior
        return n -> n * x;
    }// end method

    public static void main(String[] args) {
        Function<Integer,Integer> doubleMultiplier = makeMultiplier(2);
        Function<Integer,Integer> tripleMultiplier = makeMultiplier(3);

        out.println("Double 5: " + doubleMultiplier.apply(5));
        out.println("Triple 5: " + tripleMultiplier.apply(5));
    }// end main
}// end class
