/**
 * # Simple banking system using classes and encapsulation
 * class Account:
 *     def __init__(self, owner, balance=0):
 *         self.owner = owner
 *         self._balance = balance  # Encapsulated attribute
 *     def deposit(self, amount):
 *         if amount > 0:
 *             self._balance += amount
 *             print(f"Added {amount} to the balance")
 *         else:
 *             print("Deposit amount must be positive")
 *     def withdraw(self, amount):
 *         if 0 < amount <= self._balance:
 *             self._balance -= amount
 *             print(f"Withdrew {amount} from the balance")
 *         else:
 *             print("Invalid withdrawal amount")
 *     def get_balance(self):
 *         return self._balance
 * acc = Account("John")
 * acc.deposit(100)
 * acc.withdraw(50)
 * print("Current balance:", acc.get_balance())
 */

import static java.lang.System.out;

public class Account {
    // private attributes for encapsulation
    private String owner;
    private double balance;

    // Constructor
    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }// end constructor

    // Constructor with default $0.00 balance
    public Account(String owner) {
        this(owner, 0);
    }// end constructor

    // method to deposit the money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            out.println("Deposited " + amount + " to the balance of " + owner + "'s account.");
        } else {
            out.println("Deposit amount must be positive");
        }// end if else

    }// end method

    // method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            out.println("Withdrawn " + amount + " from the balance of " + owner + "'s account.");
        } else {
            out.println("Invalid withdrawal amount.");
        }// end if else
    }// end method

    // Getter to check the balance
    public double getBalance() {
        return balance;
    }// end getter

    // getter for the account owner
    public String getOwner() {
        return owner;
    }//end getter
}// end class
