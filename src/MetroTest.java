// Base class
class Train {

    void run() {
        System.out.println("Train is running");
    }
}

// Derived class
class Metro extends Train {

    @Override
    void run() {
        System.out.println("Metro is running on electric track");
    }
}

// Main class
public class MetroTest {

    public static void main(String[] args) {

        Metro m = new Metro();
        m.run();
    }
}