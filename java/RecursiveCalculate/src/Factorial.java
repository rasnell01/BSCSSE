/**
 *# Recursive function to calculate factorial of a number
 * def factorial(n):
 *     if n == 0:
 *         return 1
 *     else:
 *         return n * factorial(n - 1)
 * num = int(input("Enter a number to calculate factorial: "))
 * print("Factorial of", num, "is", factorial(num))
 */

public class Factorial {
    int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }// end if else
    }// end method
}// end class
