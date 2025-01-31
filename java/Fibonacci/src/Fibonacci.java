/*def fibonacci(n):
        if n <= 1:
        return n
    else:
            return fibonacci(n-1) + fibonacci(n-2)
number = int(input("Enter a number to find Fibonacci sequence up to: "))
        for i in range(number):
print(fibonacci(i), end=' ')*/

public class Fibonacci {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
