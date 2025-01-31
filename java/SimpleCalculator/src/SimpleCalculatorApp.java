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

import static java.lang.System.*;
import java.util.Scanner;

public class SimpleCalculatorApp {
    public static void main(String[] args) {

        //instantiation of Calculator Class
        Calculator calculation = new Calculator();
        Scanner scanner = new Scanner(in);

        out.print("Enter the first number: ");
        double n1 = scanner.nextDouble();
        out.print("Enter the second number: ");
        double n2 = scanner.nextDouble();
        out.print("Enter the operator: ");
        char operator = scanner.next().charAt(0);

        String result = calculation.calculate(operator, n1, n2);
        out.print("Result: " + result);
    }// end main
}// end SimpleCalculatorApp Class
