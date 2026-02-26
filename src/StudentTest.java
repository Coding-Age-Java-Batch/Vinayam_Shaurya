// Base class
class Person {

    void showDetails() {
        System.out.println("Person details");
    }
}

// Derived class
class Student extends Person {

    @Override
    void showDetails() {
        System.out.println("Student details");
    }
}

// Main class
public class StudentTest {

    public static void main(String[] args) {

        Student s = new Student();
        s.showDetails();
    }
}