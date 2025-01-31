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

public class IsPrime {
    public boolean isPrime (int n) {
        if (n < 2){
            return false;
        } for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }// end if
        }// end for
        return true;
    }// end method isPrime
}// end class IsPrime
