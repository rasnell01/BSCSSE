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

class ExpressionParser {
    private final String expression;
    private int index;

    public ExpressionParser(String expression) {
        this.expression = expression;
        this.index = 0;
    }// end method

    public double parse() {
        double result = parseExpression();
        if (index < expression.length()) {
            throw new IllegalArgumentException("Unexpected character at position " + index);
        }// end if
        return result;
    }// end method

    private double parseExpression() {
        double result = parseTerm();
        while (index < expression.length() && (expression.charAt(index) == '+' || expression.charAt(index) == '-')) {
            char operator = expression.charAt(index++);
            double term = parseTerm();
            if (operator == '+') {
                result += term;
            } else {
                result -= term;
            }// end if else
        }// end while
        return result;
    }// end method

    private double parseTerm() {
        double result = parseFactor();
        while (index < expression.length() && (expression.charAt(index) == '*' || expression.charAt(index) == '/')) {
            char operator = expression.charAt(index++);
            double factor = parseFactor();
            if (operator == '*') {
                result *= factor;
            } else {
                if (factor == 0) {
                    throw new IllegalArgumentException("Division by zero");
                }// end if
                result /= factor;
            }// end if else
        }// end while
        return result;
    }// end method

    private double parseFactor() {
        if (index < expression.length() && (Character.isDigit(expression.charAt(index)) || expression.charAt(index) == '.')) {
            return parseNumber();
        } else {
            throw new IllegalArgumentException("Invalid character at position " + index);
        }// end if else
    }// end method

    private double parseNumber() {
        int start = index;
        while (index < expression.length() && (Character.isDigit(expression.charAt(index)) || expression.charAt(index) == '.')) {
            index++;
        }// end while
        return Double.parseDouble(expression.substring(start, index));
    }// end method
}// end class