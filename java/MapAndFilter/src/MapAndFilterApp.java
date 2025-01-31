/**
 * # Demonstrating functional programming concepts: map and filter
 * numbers = [1, 2, 3, 4, 5, 6]
 * # Double each number using map
 * doubled = list(map(lambda x: x * 2, numbers))
 * print("Doubled numbers:", doubled)
 * # Filter to get only even numbers
 * evens = list(filter(lambda x: x % 2 == 0, numbers))
 * print("Even numbers:", evens)
 */

import static java.lang.System.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFilterApp {
    public static void main(String[] args) {
        // list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // utilization of map for doubling
        List<Integer> doubled = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        out.println("Doubled numbers: " + doubled);

        // filtering for even numbers
        List<Integer> evens = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        out.println("Evens numbers: " + evens);
    }// end main
}// end class
