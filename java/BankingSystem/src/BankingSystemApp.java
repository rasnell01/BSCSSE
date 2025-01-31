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

import static java.lang.System.*;

public class BankingSystemApp {
    public static void main(String[] args) {
        // creating an account for John
        Account account = new Account("John Smith");

        // preform the determined operations
        account.deposit(100);
        account.withdraw(50);
        out.println("Current balance: " + account.getBalance());
    }// end main
}// end class
