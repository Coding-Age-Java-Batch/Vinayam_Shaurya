// Interface
interface Printer {
    void print(String document);
}

// Inkjet Printer
class InkjetPrinter implements Printer {

    public void print(String document) {
        System.out.println("Printing with Inkjet Printer: " + document);
    }
}

// Laser Printer
class LaserPrinter implements Printer {

    public void print(String document) {
        System.out.println("Printing with Laser Printer: " + document);
    }
}

// Main class
public class PrinterTest {

    public static void main(String[] args) {

        Printer p1 = new InkjetPrinter();
        Printer p2 = new LaserPrinter();

        p1.print("Project Report");
        p2.print("Project Report");
    }
}