/**
 * # A simple calculator to perform basic operations
 * def calculate(op, x, y):
 *     if op == '+': return x + y
 *     elif op == '-': return x - y
 *     elif op == '*': return x * y
 *     elif op == '/': return x / y if y != 0 else 'Error: Division by zero'
 *     else: return 'Invalid operation'
 * operation = input("Enter operation (+, -, *, /): ")
 * num1 = float(input("Enter first number: "))
 * num2 = float(input("Enter second number: "))
 * result = calculate(operation, num1, num2)
 * print("Result:", result)
 */
public class Calculator {
    public String calculate(char op, double x, double y) {
        switch (op) {
            case '+':
                return String.valueOf(x + y);
            case '-':
                return String.valueOf(x - y);
            case '*':
                return String.valueOf(x * y);
            case '/':
                return String.valueOf(x / y);
            default:
                return "Invalid operation";
        }// end switch
    }// end calculate method
}// end Calculator Class
