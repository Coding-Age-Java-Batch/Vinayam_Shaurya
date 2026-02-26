// Base class
class Course {

    String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }

    void showCourse() {
        System.out.println("Course Name: " + courseName);
    }
}

// Derived class
class EnrolledStudent extends Course {

    String studentName;
    int rollNumber;

    EnrolledStudent(String courseName, String studentName, int rollNumber) {
        super(courseName);
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }

    @Override
    void showCourse() {
        System.out.println("Course Name: " + courseName +
                " Student Name: " + studentName +
                " Roll No: " + rollNumber);
    }
}

// Main class
public class EnrolledStudentTest {

    public static void main(String[] args) {

        EnrolledStudent e = new EnrolledStudent("Java Programming", "Aarti", 101);
        e.showCourse();
    }
}