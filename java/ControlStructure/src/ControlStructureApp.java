/**
 *# program 1: Simple control structure using if-elif-else statements
 * age = int(input("Enter your age: "))
 * if age < 13:
 *     print("Child")
 * elif age < 20:
 *     print("Teenager")
 * else:
 *     print("Adult")
 */

import java.util.Scanner;
import static java.lang.System.*;
public class ControlStructureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Welcome to the Control Structure!");
        out.println("Enter your age:  ");
        int age = scanner.nextInt();
        if (age < 13) {
            out.println("You are a child.");
        } else if (age < 20) {
            out.println("You are a teenager.");
        } else {
            out.println("You are an adult.");
        }
    }
}
