/*def fibonacci(n):
        if n <= 1:
        return n
    else:
            return fibonacci(n-1) + fibonacci(n-2)
number = int(input("Enter a number to find Fibonacci sequence up to: "))
        for i in range(number):
print(fibonacci(i), end=' ')*/

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class FibonacciApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("Enter a number to find Fibonacci sequence up to: ");
        int n = scanner.nextInt();

        Fibonacci calculator = new Fibonacci();

        out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            out.print(calculator.fib(i) + " ");
        }

    }//end main

}//end class
