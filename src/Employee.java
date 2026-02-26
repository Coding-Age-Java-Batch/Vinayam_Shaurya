class Employee {

    int id;
    String name;
    String department;

    // Constructor 1 → takes ID, Name, Department
    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Constructor 2 → takes only ID and Name
    // Calls Constructor 1 and sets default department = "General"
    Employee(int id, String name) {
        this(id, name, "General");   // Constructor chaining
    }

    // Method to print employee details
    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {

        // Employee with full details
        Employee e1 = new Employee(101, "Rahul", "IT");
        e1.displayDetails();

        System.out.println();

        // Employee without department
        Employee e2 = new Employee(102, "Priya");
        e2.displayDetails();
    }
}