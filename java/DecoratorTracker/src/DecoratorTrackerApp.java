/**
 * # Implementing a simple decorator to track function calls
 * def trace(func):
 *     def wrapper(*args, **kwargs):
 *         print(f"Calling {func.__name__} with {args}, {kwargs}")
 *         original_result = func(*args, **kwargs)
 *         print(f"{func.__name__} returned {original_result}")
 *         return original_result
 *     return wrapper
 * @trace
 * def add(a, b):
 *     return a + b
 * print(add(10, 5))
 */

import java.util.function.BiFunction;
import static java.lang.System.*;

public class DecoratorTrackerApp {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> traceAdd = Tracer.trace("add", Tracer::add);

        out.println(traceAdd.apply(10,5));
    }// end main
}// end class
