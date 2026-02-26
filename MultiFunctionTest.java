interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

// Class implementing both interfaces
class MultiFunctionDevice implements Printer, Scanner {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

// Main class
public class MultiFunctionTest {

    public static void main(String[] args) {

        MultiFunctionDevice device = new MultiFunctionDevice();

        device.print();
        device.scan();
    }
}