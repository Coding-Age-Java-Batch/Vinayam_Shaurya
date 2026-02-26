class Student {

    int studentId;
    String studentName;

    // Constructor to initialize student details
    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public static void main(String[] args) {

        // Create Student object
        Student s1 = new Student(101, "Rahul");

        // Create StudentInfoPrinter object
        StudentInfoPrinter printer = new StudentInfoPrinter();

        // Send student object to another class method
        printer.printStudentInfo(s1);
    }
}

// Another class
class StudentInfoPrinter {

    // Method to print student details
    void printStudentInfo(Student s) {
        System.out.println("Student ID: " + s.studentId);
        System.out.println("Student Name: " + s.studentName);
    }
}