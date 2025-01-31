/**
 *# program 2: Enforcing type checks in function arguments
 * def add_integers(a: int, b: int) -> int:
 *     if not (isinstance(a, int) and isinstance(b, int)):
 *         raise TypeError("Both arguments must be integers")
 *     return a + b
 * print(add_integers(10, 20))  # Correct usage
 * # Uncommenting the next line will raise an error
 * # print(add_integers(10, "20"))  # Incorrect usage
 * Explain a situation in Java where overloading function would lead to ambiguity.
 * Note: strongly prefer posting your solutions to your github and paste the URL to the BB. If there's any write-up,
 * either save it to a plain text file or pdf.
 */

public class AddIntegers {
    int addIntegers(int a, int b) {
        return a + b;
    }
}
