/**
 * # Program to check if the input matches a specific pattern using regular expressions
 * import re
 * pattern = r"^[a-zA-Z]+[\w]*$"
 * user_input = input("Enter a string to match alphanumeric pattern: ")
 * if re.match(pattern, user_input):
 *     print("Valid pattern.")
 * else:
 *     print("Invalid pattern.")
 */

import static java.lang.System.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternREApp {
    public static void main(String[] args) {
        // define the pattern
        String pattern = "^[a-zA-Z]+[\\w]*$";

        Scanner scanner = new Scanner(in);

        out.print("Enter a string to match the alphanumeric pattern: ");
        String input = scanner.nextLine();

        // Compile the pattern and create a matcher
        Pattern compiledP = Pattern.compile(pattern);
        Matcher match = compiledP.matcher(input);

        // check to ensure the patterns match
        if (match.matches()) {
            out.print("Valid pattern");
        } else {
            out.print("Invalid pattern");
        }// end if else

        // close the scanner
        scanner.close();
    }// end main
}// end PatternERApp class
