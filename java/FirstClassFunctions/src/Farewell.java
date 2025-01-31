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

public class Farewell {
    String farewell(String name){
        return "Goodbye! " + name;
    };
}
