// Base class
class College {

    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }
}

// Derived class
class Admission extends College {

    String studentName;
    String course;

    Admission(String collegeName, String studentName, String course) {
        super(collegeName);
        this.studentName = studentName;
        this.course = course;
    }

    void showDetails() {
        System.out.println("College: " + collegeName +
                " Student: " + studentName +
                " Course: " + course);
    }
}

// Main class
public class AdmissionTest {

    public static void main(String[] args) {

        Admission a = new Admission("Techno Institute", "Ananya", "B.Tech.");
        a.showDetails();
    }
}