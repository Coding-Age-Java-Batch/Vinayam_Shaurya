class Student {

    String name;
    int rollNumber;
    double marks;

    // Method to set details
    public void setDetails(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    // Method to check pass
    public boolean hasPassed() {
        return marks >= 40;
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student();

        // Set details
        s1.setDetails("Vinayam", 101, 75.5);

        // Display info
        s1.displayInfo();

        // Check pass status
        if(s1.hasPassed()) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
    }
}