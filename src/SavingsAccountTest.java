// Base class
class Account {

    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void showBalance() {
        System.out.println("Balance: ₹" + balance);
    }
}

// Derived class
class SavingsAccount extends Account {

    double interestRate;

    SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    void showBalance() {
        double updatedBalance = balance + (balance * interestRate / 100);
        System.out.println("Balance with interest: ₹" + updatedBalance);
    }
}

// Main class
public class SavingsAccountTest {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(1000, 5);
        sa.showBalance();
    }
}