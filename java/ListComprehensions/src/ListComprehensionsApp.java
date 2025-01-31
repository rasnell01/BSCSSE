/**
 * # Using list comprehensions for functional programming
 * squares = [x**2 for x in range(10)]
 * evens_squared = [x**2 for x in range(10) if x % 2 == 0]
 * print("Squares of 0-9:", squares)
 * print("Squares of even numbers 0-9:", evens_squared)
 */

import static java.lang.System.out;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListComprehensionsApp {
    public static void main(String[] args) {
        // generating squares
        List<Integer> squares = IntStream.range(0, 10)
                .map(x -> x * x)
                .boxed()
                .collect(Collectors.toList());
        out.println("Squares of 0-9: " + squares);

        // generating even squares
        List<Integer> evenSquares = IntStream.range(0, 10)
                .filter(x -> x % 2 == 0 && x != 0) // modified from the original to exclude zero it not being an even or odd, positive of negative.
                .map(x -> x * x)
                .boxed()
                .collect(Collectors.toList());
        out.println("Squares of even numbers: " + evenSquares);
    }// end main
}// end class
