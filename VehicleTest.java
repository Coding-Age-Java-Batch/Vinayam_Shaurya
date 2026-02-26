interface Vehicle {
    void start();
    void stop();
    String fuelType();
}

// Car class
class Car implements Vehicle {

    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }

    public String fuelType() {
        return "Petrol";
    }
}

// Bike class
class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike is starting...");
    }

    public void stop() {
        System.out.println("Bike is stopping...");
    }

    public String fuelType() {
        return "Diesel";
    }
}

// Main class
public class VehicleTest {

    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();

        // Car actions
        car.start();
        System.out.println("Car Fuel Type: " + car.fuelType());
        car.stop();

        System.out.println();

        // Bike actions
        bike.start();
        System.out.println("Bike Fuel Type: " + bike.fuelType());
        bike.stop();
    }
}