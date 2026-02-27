// Custom Exception
class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class InsufficientBalanceDemo {

    public static void withdraw(double balance, double amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance.");
        } else {
            System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
        }
    }

    public static void main(String[] args) {

        double balance = 1000;
        double withdrawAmount = 1500;

        try {
            withdraw(balance, withdrawAmount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

    }
}