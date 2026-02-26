// Abstract class
abstract class Student {

    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    abstract void generateReport();

    boolean isValidMarks(int marks) {
        return marks >= 0 && marks <= 100;
    }
}

// Engineering Student
class EngineeringStudent extends Student {

    int marks;

    EngineeringStudent(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }

    void generateReport() {
        System.out.println("Engineering Student Report");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);

        if (isValidMarks(marks)) {
            System.out.println("Marks: " + marks);
            System.out.println("Result: " + (marks >= 40 ? "Pass" : "Fail"));
        } else {
            System.out.println("Invalid Marks!");
        }
    }
}

// Medical Student
class MedicalStudent extends Student {

    int marks;

    MedicalStudent(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }

    void generateReport() {
        System.out.println("Medical Student Report");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);

        if (isValidMarks(marks)) {
            System.out.println("Marks: " + marks);
            System.out.println("Result: " + (marks >= 40 ? "Pass" : "Fail"));
        } else {
            System.out.println("Invalid Marks!");
        }
    }
}

// Main class
public class StudentReportTest {

    public static void main(String[] args) {

        Student s1 = new EngineeringStudent("Rahul", 101, 75);
        Student s2 = new MedicalStudent("Priya", 102, 120); // Invalid marks

        s1.generateReport();
        System.out.println();
        s2.generateReport();
    }
}