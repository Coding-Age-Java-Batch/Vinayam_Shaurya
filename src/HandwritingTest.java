class HandwritingTest {

    String studentName;
    String grade;

    // Constructor
    HandwritingTest(String studentName, String grade) {
        this.studentName = studentName;
        this.grade = grade;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {

        HandwritingTest h1 = new HandwritingTest("Rahul", "A");
        h1.displayDetails();
    }
}