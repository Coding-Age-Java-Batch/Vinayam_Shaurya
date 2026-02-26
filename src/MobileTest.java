// Base class
class Device {

    String deviceName;

    Device(String deviceName) {
        this.deviceName = deviceName;
    }

    void showInfo() {
        System.out.println("Device Name: " + deviceName);
    }
}

// Derived class
class Mobile extends Device {

    String os;

    Mobile(String deviceName, String os) {
        super(deviceName);
        this.os = os;
    }

    @Override
    void showInfo() {
        System.out.println("Device Name: " + deviceName +
                " Operating System: " + os);
    }
}

// Main class
public class MobileTest {

    public static void main(String[] args) {

        Mobile m = new Mobile("Samsung Galaxy", "Android");
        m.showInfo();
    }
}