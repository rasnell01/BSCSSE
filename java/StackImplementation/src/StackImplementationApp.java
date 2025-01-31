/**
 * # Stack implementation using list to demonstrate encapsulation
 * class Stack:
 *     def __init__(self):
 *         self._items = []  # Protected member
 *     def push(self, item):
 *         self._items.append(item)
 *     def pop(self):
 *         if not self.is_empty():
 *             return self._items.pop()
 *         raise IndexError("pop from empty stack")
 *     def is_empty(self):
 *         return not self._items
 * my_stack = Stack()
 * my_stack.push(10)
 * my_stack.push(20)
 * print(my_stack.pop())
 * print(my_stack.pop())
 */

import static java.lang.System.*;

public class StackImplementationApp {
    public static void main(String[] args) {
        Stacker myStack = new Stacker();

        myStack.push(10);
        myStack.push(20);

        out.println(myStack.pop());
        out.println(myStack.pop());
    }// end main
}// end class
