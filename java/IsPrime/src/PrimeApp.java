/**
 Program to check if a number is prime
 def is_prime(num):
 if num < 2:
 return False
 for i in range(2, int(num**0.5) + 1):
 if num % i == 0:
 return False
 return True
 number = int(input("Enter a number to check if it's prime: "))
 if is_prime(number):
 print(number, "is a prime number.")
 else:
 print(number, "is not a prime number.")
 */

import java.util.Scanner;
import static java.lang.System.*;

public class PrimeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // instantiation of IsPrime Class
        IsPrime checkPrime = new IsPrime();

        // taking user input and storing it to check if it is prime or not
        out.print("Enter a number to check if it is prime or not: ");
        int n = scanner.nextInt();

        if (checkPrime.isPrime(n)) {
            out.println(n + " is a prime number.");
        } else {
            out.println(n + " is not a prime number.");
        }// end if else

        scanner.close();
    }// end main
}// end class PrimeApp
