class Employee {
    int getBonus() {
        return 1000;
    }
}

class Manager extends Employee {
    int getBonus() {
        return 3000;
    }
}

class Developer extends Employee {
    int getBonus() {
        return 2000;
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {

        Employee e = new Employee();
        Manager m = new Manager();
        Developer d = new Developer();

        System.out.println("Employee Bonus: " + e.getBonus());
        System.out.println("Manager Bonus: " + m.getBonus());
        System.out.println("Developer Bonus: " + d.getBonus());
    }
}