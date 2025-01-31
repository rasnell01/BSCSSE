/**
 * # program 1:
 * def test_scope():
 *     local_var = 20
 *     print("Inside function, local_var =", local_var)  # Accessing local variable
 * global_var = 10
 * test_scope()
 * print("Outside function, global_var =", global_var)  # Accessing global variable
 * # Uncommenting the next line would result in an error as local_var is not in this scope
 * # print(local_var)
 * */

import static java.lang.System.*;

public class TestScopeApp {

    public static int global_var = 10;

    public static void main(String[] args) {
        ScopeTest test = new ScopeTest();

        out.println("Outside function, global_var = " + global_var);
        test.testScope();
    }
}
