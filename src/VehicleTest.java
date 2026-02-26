// Abstract class
abstract class Vehicle {

    String brand;
    private int speed;

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        setSpeed(speed);
    }

    // Abstract method
    abstract void drive();

    // Getter
    public int getSpeed() {
        return speed;
    }

    // Setter with speed limit
    public void setSpeed(int speed) {
        if (speed <= 300) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot exceed 300! Setting failed.");
        }
    }
}

// Car class
class Car extends Vehicle {

    Car(String brand, int speed) {
        super(brand, speed);
    }

    void drive() {
        System.out.println(brand + " Car is driving at speed " + getSpeed());
    }
}

// Bike class
class Bike extends Vehicle {

    Bike(String brand, int speed) {
        super(brand, speed);
    }

    void drive() {
        System.out.println(brand + " Bike is riding at speed " + getSpeed());
    }
}

// Main class
public class VehicleTest {

    public static void main(String[] args) {

        Vehicle car = new Car("Toyota", 200);
        car.drive();

        // Attempt to set speed beyond limit
        car.setSpeed(400);

        System.out.println("Current Speed: " + car.getSpeed());
    }
}