/**
 *# Does Java support  first-class functions??? Why?
 *
 * def greet(name):
 *     return f"Hello {name}!"
 * def farewell(name):
 *     return f"Goodbye {name}!"
 * def handle_user(func):
 *     name = input("Enter your name: ")
 *     print(func(name))
 * # Passing functions as arguments
 * handle_user(greet)
 * handle_user(farewell)
 */

import java.util.Scanner;
import static java.lang.System.*;

public class FirstClassFunctionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        HandleUser handleUser = new HandleUser();
        out.print("Enter the name of the user: ");
        String name = scanner.nextLine();
        out.print(handleUser.handleUser(name));
    }// end main
}// end class
