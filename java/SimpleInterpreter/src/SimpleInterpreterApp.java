/**
 *# A simple interpreter to evaluate arithmetic expressions
 * import ast
 * import operator as op
 * def eval_expr(expr):
 *     return eval_(ast.parse(expr, mode='eval').body)
 * def eval_(node):
 *     operators = {ast.Add: op.add, ast.Sub: op.sub, ast.Mult: op.mul, ast.Div: op.truediv}
 *     if isinstance(node, ast.Num):
 *         return node.n
 *     elif isinstance(node, ast.BinOp):
 *         return operators[type(node.op)](eval_(node.left), eval_(node.right))
 *     else:
 *         raise TypeError("Unsupported type {}".format(type(node).__name__))
 * expression = input("Enter an arithmetic expression: ")
 * print("Result:", eval_expr(expression))
 */

import static java.lang.System.*;
import java.util.Scanner;

public class SimpleInterpreterApp {
    public static double evaluateExpression(String expression) {
        try {
            return new ExpressionParser(expression).parse();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid expression: " + expression);
        }// end try catch
    }// end method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        out.print("Enter an arithmetic expression: ");
        String expression = scanner.nextLine();

        try {
            double result = evaluateExpression(expression);
            out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            out.println(e.getMessage());
        }// end try catch

        // close the scanner
        scanner.close();

    }// end main
}// end SimpleInterpreterApp Class
