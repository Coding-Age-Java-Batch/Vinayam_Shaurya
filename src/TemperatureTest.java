class Temperature {

    private double celsius;

    private final double ABS_ZERO = -273.15;

    // Constructor
    Temperature(double value, char unit) {
        switch(unit) {
            case 'C':
                setCelsius(value);
                break;
            case 'F':
                setFahrenheit(value);
                break;
            case 'K':
                setKelvin(value);
                break;
            default:
                System.out.println("Invalid unit!");
        }
    }

    // Set Celsius
    public void setCelsius(double temp) {
        if (temp >= ABS_ZERO) {
            this.celsius = temp;
        } else {
            System.out.println("Temperature below absolute zero!");
        }
    }

    // Set Fahrenheit
    public void setFahrenheit(double temp) {
        double c = (temp - 32) * 5 / 9;
        setCelsius(c);
    }

    // Set Kelvin
    public void setKelvin(double temp) {
        double c = temp - 273.15;
        setCelsius(c);
    }

    // Get Celsius
    public double getCelsius() {
        return celsius;
    }

    // Get Fahrenheit
    public double getFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    // Get Kelvin
    public double getKelvin() {
        return celsius + 273.15;
    }

    // toString method
    public String toString() {
        return "Celsius: " + getCelsius() +
                ", Fahrenheit: " + getFahrenheit() +
                ", Kelvin: " + getKelvin();
    }
}

// Main class
public class TemperatureTest {

    public static void main(String[] args) {

        Temperature t = new Temperature(25, 'C');
        System.out.println(t);

        t.setFahrenheit(98.6);
        System.out.println(t);

        t.setKelvin(300);
        System.out.println(t);
    }
}