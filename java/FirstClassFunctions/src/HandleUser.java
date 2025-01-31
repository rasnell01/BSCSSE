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

public class HandleUser {
    String handleUser(String name) {
        Greet greet = new Greet();
        Farewell farewell = new Farewell();

        // Assuming you want to check something based on the name or some condition
        if (name != null && !name.isEmpty()) {
            return greet.greeting(name); // assuming Greet has a sayHello method
        } else {
            return farewell.farewell(name); // assuming Farewell has a sayGoodbye method
        }
    }
}