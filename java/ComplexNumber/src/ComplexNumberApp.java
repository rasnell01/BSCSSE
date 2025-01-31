/**
 * # program 1: Define a custom data type using class for a complex number
 * class ComplexNumber:
 *     def __init__(self, real, imag):
 *         self.real = real
 *         self.imag = imag
 *
 *     def __add__(self, other):
 *         return ComplexNumber(self.real + other.real, self.imag + other.imag)
 *
 *     def __str__(self):
 *         return f"{self.real} + {self.imag}i"
 * num1 = ComplexNumber(2, 3)
 * num2 = ComplexNumber(1, 1)
 * result = num1 + num2
 * print("Sum of complex numbers:", result)
 */

import static java.lang.System.*;

public class ComplexNumberApp {
    public static void main(String[] args) {
        double height = 1.5445;
        int price = (int) height;
        int price2 = Double.valueOf(height).intValue();
        out.println(price2);
    }
}
