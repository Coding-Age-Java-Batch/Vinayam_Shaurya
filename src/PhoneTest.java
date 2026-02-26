class Phone {

    private String brand;
    private String model;
    private int batteryLevel;
    private boolean isOn;
    private int volume;

    // Constructor
    Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = 100;
        this.isOn = false;
        this.volume = 5;
    }

    // Turn ON
    public void turnOn() {
        if (batteryLevel > 0) {
            isOn = true;
            System.out.println("Phone turned ON");
        } else {
            System.out.println("Cannot turn ON. Battery is 0%");
        }
    }

    // Turn OFF
    public void turnOff() {
        isOn = false;
        System.out.println("Phone turned OFF");
    }

    // Charge battery
    public void chargeBattery(int amount) {
        if (amount > 0) {
            batteryLevel += amount;
            if (batteryLevel > 100)
                batteryLevel = 100;
            System.out.println("Battery charged to " + batteryLevel + "%");
        }
    }

    // Use battery
    public void useBattery(int amount) {
        if (amount > 0) {
            batteryLevel -= amount;
            if (batteryLevel <= 0) {
                batteryLevel = 0;
                isOn = false;
                System.out.println("Battery drained. Phone turned OFF automatically.");
            }
        }
    }

    // Set volume
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
        } else {
            System.out.println("Invalid volume! Must be 0-10");
        }
    }

    // Phone status
    public String getPhoneStatus() {
        return "Brand: " + brand +
                ", Model: " + model +
                ", Battery: " + batteryLevel + "%" +
                ", Power: " + (isOn ? "ON" : "OFF") +
                ", Volume: " + volume;
    }
}

// Main class
public class PhoneTest {

    public static void main(String[] args) {

        Phone p = new Phone("Samsung", "Galaxy");

        p.turnOn();
        p.useBattery(50);
        p.setVolume(8);
        p.useBattery(60); // should auto turn off

        p.chargeBattery(40);
        p.turnOn();

        System.out.println(p.getPhoneStatus());
    }
}