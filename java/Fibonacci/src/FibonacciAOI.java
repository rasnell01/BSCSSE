import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class FibonacciAOI {

    // Recursive method to calculate Fibonacci numbers
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }// end if else
    }// end fibonacci

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("Enter a number to find Fibonacci sequence up to: ");
        int n = scanner.nextInt();

        out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            out.print(fibonacci(i) + " ");
        }// end for
    } // end main
} // end class