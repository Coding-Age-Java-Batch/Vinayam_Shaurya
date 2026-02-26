// Base class
class Shape {

    void area() {
        System.out.println("Calculating area...");
    }
}

// Derived class
class Rectangle extends Shape {

    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class RectangleAreaTest {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        r.area();
    }
}