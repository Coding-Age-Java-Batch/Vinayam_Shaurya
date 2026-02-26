class Car {

    private String make;
    private String model;
    private int year;
    private int mileage;
    private double fuelLevel;

    private final double MAX_FUEL = 15;
    private final double MPG = 25;

    // Constructor
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = 0;
        this.fuelLevel = 0;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    // Add fuel
    public void addFuel(double gallons) {
        if (gallons > 0) {
            if (fuelLevel + gallons <= MAX_FUEL) {
                fuelLevel += gallons;
                System.out.println("Fuel added: " + gallons + " gallons");
            } else {
                fuelLevel = MAX_FUEL;
                System.out.println("Tank full! Max 15 gallons.");
            }
        } else {
            System.out.println("Invalid fuel amount!");
        }
    }

    // Check if can drive
    public boolean canDrive(int miles) {
        double requiredFuel = miles / MPG;
        return fuelLevel >= requiredFuel;
    }

    // Drive method
    public void drive(int miles) {
        if (canDrive(miles)) {
            mileage += miles;
            fuelLevel -= (double)miles / MPG;
            System.out.println("Drove " + miles + " miles");
        } else {
            System.out.println("Not enough fuel to drive " + miles + " miles");
        }
    }

    // Get fuel level
    public double getFuelLevel() {
        return fuelLevel;
    }
}

// Main class
public class CarTest {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", 2022);

        car.addFuel(10);
        car.drive(150);

        System.out.println("Remaining Fuel: " + car.getFuelLevel() + " gallons");
    }
}