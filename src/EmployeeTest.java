class Employee {

    private String name;
    private int employeeId;
    private double salary;
    private double bonus;

    // Constructor
    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.bonus = 0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    // Set bonus
    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            System.out.println("Invalid bonus amount!");
        }
    }

    // Total Pay
    public double getTotalPay() {
        return salary + bonus;
    }

    // Give raise
    public void giveRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * percentage / 100;
        }
    }

    // Employee details
    public String getEmployeeDetails() {
        return "Name: " + name +
                ", ID: " + employeeId +
                ", Salary: $" + salary +
                ", Bonus: $" + bonus;
    }
}

// Main class
public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp = new Employee("Rahul", 101, 50000);

        emp.setBonus(3000);
        emp.giveRaise(8);

        System.out.println(emp.getEmployeeDetails());
        System.out.println("Total Pay: $" + emp.getTotalPay());
    }
}