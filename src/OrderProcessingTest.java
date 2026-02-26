// Interface
interface Order {
    void processOrder();
}

// Online Order class
class OnlineOrder implements Order {

    int orderId;
    String status;

    OnlineOrder(int orderId) {
        this.orderId = orderId;
        this.status = "Online Order Processed";
    }

    public void processOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Status: " + status);
    }
}

// Offline Order class
class OfflineOrder implements Order {

    int orderId;
    String status;

    OfflineOrder(int orderId) {
        this.orderId = orderId;
        this.status = "Offline Order Processed";
    }

    public void processOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Status: " + status);
    }
}

// Main class
public class OrderProcessingTest {

    public static void main(String[] args) {

        Order online = new OnlineOrder(101);
        Order offline = new OfflineOrder(202);

        online.processOrder();
        System.out.println();
        offline.processOrder();
    }
}