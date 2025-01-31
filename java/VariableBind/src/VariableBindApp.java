/**
 * # program 2:   Is it possible to do in Java???
 * def bind_var():
 *     dynamic_var = "Initially a string"
 *     print(dynamic_var)
 *     dynamic_var = 123  # Rebinding with an integer
 *     print(dynamic_var)
 * bind_var()
 * Explain why, in the paragraph format, not a single sentence or two.
 * Note: strongly prefer posting your solutions to your github and paste the URL to the BB. If there's any write-up, either save it to a plain text file or pdf.
 * */

import static java.lang.System.*;

public class VariableBindApp {
    public static void BindVariable() {
        String dynamic_variable = "Initially a string";
        out.println(dynamic_variable);
        dynamic_variable = "123";
        int integerValue = Integer.parseInt(dynamic_variable);
        out.println(integerValue);
    }

    public static void main(String[] args) {
        BindVariable();
    }
}
