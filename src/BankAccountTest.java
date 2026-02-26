// Abstract class
abstract class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
        System.out.println("Balance: ₹" + balance);
    }

    // Abstract withdraw method
    abstract void withdraw(double amount);
}

// Savings Account (No overdraft)
class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Withdrawal failed! No overdraft allowed.");
        }
        System.out.println("Balance: ₹" + balance);
    }
}

// Current Account (Overdraft up to ₹10,000)
class CurrentAccount extends BankAccount {

    CurrentAccount(double balance) {
        super(balance);
    }

    void withdraw(double amount) {
        if (balance - amount >= -10000) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Withdrawal failed! Overdraft limit exceeded.");
        }
        System.out.println("Balance: ₹" + balance);
    }
}

// Main class
public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount(0);
        BankAccount current = new CurrentAccount(0);

        System.out.println("Savings Account:");
        savings.deposit(5000);
        savings.withdraw(6000);

        System.out.println();

        System.out.println("Current Account:");
        current.deposit(5000);
        current.withdraw(6000);
    }
}