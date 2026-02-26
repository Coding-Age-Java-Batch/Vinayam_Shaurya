// Base class
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

// Derived class
class MarkSheet extends Student {

    int sub1, sub2, sub3;

    MarkSheet(String name, int sub1, int sub2, int sub3) {
        super(name);
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    void display() {
        int total = sub1 + sub2 + sub3;
        System.out.println("Name: " + name + " Total Marks: " + total);
    }
}

// Main class
public class MarkSheetTest {

    public static void main(String[] args) {

        MarkSheet m = new MarkSheet("Ravi", 90, 85, 95);
        m.display();
    }
}