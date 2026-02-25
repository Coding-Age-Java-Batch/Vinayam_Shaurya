class BankAccount {

    String accountHolderName;
    String accountNumber;
    double balance;

    // Method to set account details
    public void setAccountDetails(String name, String accNo, double balance) {
        this.accountHolderName = name;
        this.accountNumber = accNo;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance! Withdrawal denied.");
        }
    }

    // Method to display account info
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        // Set account details
        acc.setAccountDetails("Vinayam", "ACC12345", 5000);

        // Deposit money
        acc.deposit(2000);

        // Withdraw money
        acc.withdraw(3000);

        // Try withdrawing more than balance
        acc.withdraw(5000);

        // Display final account info
        acc.displayAccountInfo();
    }
}