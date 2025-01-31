/**
 *# Stack implementation with basic error handling
 * class Stack:
 *     def __init__(self):
 *         self.items = []

 *     def push(self, item):
 *         self.items.append(item)

 *     def pop(self):
 *         if not self.is_empty():
 *             return self.items.pop()
 *         else:
 *             return "Error: Stack is empty"
 *     def is_empty(self):
 *         return len(self.items) == 0
 * s = Stack()
 * s.push(10)
 * s.push(20)
 * print(s.pop())  # Should print 20
 * print(s.pop())  # Should print 10
 * print(s.pop())  # Should print "Error: Stack is empty"
 */

import java.util.ArrayList;

class Stack {
    private ArrayList<Integer> items;

    public Stack() {
        items = new ArrayList<>();
    }// end Stack

    public void push(int item) {
        items.add(item);
    }// end push

    public String pop() {
        if (!isEmpty()) {
            return Integer.toString(items.remove(items.size() - 1));
        } else {
            return "Error: Stack is empty";
        }// end if else
    }// end pop

    public boolean isEmpty() {
        return items.isEmpty();
    }// end isEmpty

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }// end main
}// end class