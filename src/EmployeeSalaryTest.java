// Abstract class
abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    // Abstract method
    abstract double calculateSalary();
}

// Full-time employee
class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name) {
        super(name);
    }

    double calculateSalary() {
        return 50000;
    }
}

// Part-time employee
class PartTimeEmployee extends Employee {

    int hoursWorked;

    PartTimeEmployee(String name, int hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hoursWorked * 500;
    }
}

// Main class
public class EmployeeSalaryTest {

    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Rahul");
        Employee e2 = new PartTimeEmployee("Priya", 40);

        System.out.println("Full-Time Employee Salary: ₹" + e1.calculateSalary());
        System.out.println("Part-Time Employee Salary: ₹" + e2.calculateSalary());
    }
}