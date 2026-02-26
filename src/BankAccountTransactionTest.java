// Base class
class BankAccount {

    int balance = 5000;

    void displayBalance() {
        System.out.println("Initial Balance: ₹" + balance);
    }
}

// Derived class
class SavingsAccount extends BankAccount {

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
        System.out.println("New Balance: ₹" + balance);
    }
}

// Main class
public class BankAccountTransactionTest {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.displayBalance();
        sa.deposit(2000);
    }
}