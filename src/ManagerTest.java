// Base class
class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
    }
}

// Derived class
class Manager extends Employee {

    String department;

    Manager(String name, String department) {
        super(name);
        this.department = department;
    }

    @Override
    void displayInfo() {
        System.out.println("Name: " + name + " Department: " + department);
    }
}

// Main class
public class ManagerTest {

    public static void main(String[] args) {

        Manager m = new Manager("Karan", "HR");
        m.displayInfo();
    }
}