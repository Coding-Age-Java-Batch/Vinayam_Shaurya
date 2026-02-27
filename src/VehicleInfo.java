class Vehicle {
    void displayInfo() {
        System.out.println("Generic Vehicle");
    }
}

class Car extends Vehicle {
    void displayInfo() {
        System.out.println("Car: 4 wheels");
    }
}

class Bike extends Vehicle {
    void displayInfo() {
        System.out.println("Bike: 2 wheels");
    }
}

public class VehicleInfo {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        Car c = new Car();
        Bike b = new Bike();

        v.displayInfo();
        c.displayInfo();
        b.displayInfo();
    }
}