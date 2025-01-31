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

public class Tracer {
    public static <T, U, R> BiFunction<T, U, R> trace(String tracer, BiFunction<T, U, R> f) {
        return (a, b) -> {
            out.println("Calling " + tracer + " with arguments: " + a + ", " + b);
            R result = f.apply(a, b);
            out.println(tracer + " returned: " + result);
            return result;
        };
    }// end static method

    //decorator
    public static Integer add(Integer a, Integer b) {
        return a + b;
    }// end static method

}// end class
