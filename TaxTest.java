interface Taxable {
    double calculateTax(double income);
}

// Employee class
class Employee implements Taxable {

    public double calculateTax(double income) {
        return income * 0.10; // 10% tax
    }
}

// Business class
class Business implements Taxable {

    public double calculateTax(double income) {
        return income * 0.15; // 15% tax
    }
}

// Main class
public class TaxTest {

    public static void main(String[] args) {

        Taxable emp = new Employee();
        Taxable bus = new Business();

        double income = 50000;

        System.out.println("Employee Tax on ₹" + income + ": ₹" + emp.calculateTax(income));
        System.out.println("Business Tax on ₹" + income + ": ₹" + bus.calculateTax(income));
    }
}