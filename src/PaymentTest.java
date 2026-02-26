// Interface
interface PaymentMethod {
    void pay(double amount);
}

// CreditCard class
class CreditCard implements PaymentMethod {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

// UPI class
class UPI implements PaymentMethod {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

// Cash class
class Cash implements PaymentMethod {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }
}

// Main class
public class PaymentTest {

    public static void main(String[] args) {

        PaymentMethod p1 = new CreditCard();
        PaymentMethod p2 = new UPI();
        PaymentMethod p3 = new Cash();

        p1.pay(1000);
        p2.pay(500);
        p3.pay(300);
    }
}