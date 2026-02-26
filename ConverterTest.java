// Generic Interface
interface Converter<F, T> {
    T convert(F from);
}

// Celsius to Fahrenheit Converter
class CelsiusToFahrenheit implements Converter<Double, Double> {

    public Double convert(Double celsius) {
        return (celsius * 9/5) + 32;
    }
}

// Kilometer to Miles Converter
class KmToMiles implements Converter<Double, Double> {

    public Double convert(Double km) {
        return km * 0.621371;
    }
}

// Main Class
public class ConverterTest {

    public static void main(String[] args) {

        Converter<Double, Double> tempConverter = new CelsiusToFahrenheit();
        Converter<Double, Double> distanceConverter = new KmToMiles();

        double celsius = 100;
        double km = 5;

        System.out.println("100°C in Fahrenheit: " + tempConverter.convert(celsius));
        System.out.println("5 Km in Miles: " + distanceConverter.convert(km));
    }
}