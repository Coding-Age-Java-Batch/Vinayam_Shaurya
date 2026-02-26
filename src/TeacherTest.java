// Base class
class School {

    String schoolName;

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void showSchool() {
        System.out.println("School: " + schoolName);
    }
}

// Derived class
class Teacher extends School {

    String teacherName;

    Teacher(String schoolName, String teacherName) {
        super(schoolName);
        this.teacherName = teacherName;
    }

    void showTeacherDetails() {
        System.out.println("School: " + schoolName + " Teacher: " + teacherName);
    }
}

// Main class
public class TeacherTest {

    public static void main(String[] args) {

        Teacher t = new Teacher("Green Valley", "Mr. Sharma");
        t.showTeacherDetails();
    }
}