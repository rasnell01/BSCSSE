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

import java.util.Scanner;
import static java.lang.System.*;

public class RecursiveCalculateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for factorial example: ");
        int n = scanner.nextInt();
        Factorial factorial = new Factorial();
        out.println(factorial.factorial(n));
    }// end main
}// end class
