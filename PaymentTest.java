interface PaymentGateway {
    void pay(double amount);
}

// UPI Payment class
class UPIPayment implements PaymentGateway {

    public void pay(double amount) {
        System.out.println("Payment successful via UPI.");
        System.out.println("Amount Paid: ₹" + amount);
    }
}

// Credit Card Payment class
class CreditCardPayment implements PaymentGateway {

    public void pay(double amount) {
        double finalAmount = amount + (amount * 0.02); // 2% extra charge
        System.out.println("Payment successful via Credit Card.");
        System.out.println("Amount Paid (including 2% charge): ₹" + finalAmount);
    }
}

// Main class
public class PaymentTest {

    public static void main(String[] args) {

        PaymentGateway upi = new UPIPayment();
        PaymentGateway card = new CreditCardPayment();

        System.out.println("UPI Payment:");
        upi.pay(1000);

        System.out.println();

        System.out.println("Credit Card Payment:");
        card.pay(1000);
    }
}