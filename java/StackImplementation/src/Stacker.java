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

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stacker {
    // stack holder in a private list
    private ArrayList<Integer> stack;

    // constructor
    public Stacker() {
        this.stack = new ArrayList<>();
    }// end constructor

    public void push(int item) {
        stack.add(item);
    }// end method

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }// end if
        return stack.remove(stack.size() - 1);
    }// end method

    public boolean isEmpty() {
        return stack.isEmpty();
    }// end method

}
