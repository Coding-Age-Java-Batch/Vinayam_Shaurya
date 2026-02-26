// Abstract class
abstract class Shape {

    String name;

    // Constructor
    Shape(String name) {
        this.name = name;
    }

    // Abstract method
    abstract double area();

    // toString method
    public String toString() {
        return name + " Area: " + area();
    }
}

// Circle subclass
class Circle extends Shape {

    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {

    double width;
    double height;

    Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }
}

// Main class
public class ShapeTest {

    public static void main(String[] args) {

        Shape c = new Circle(3);
        Shape r = new Rectangle(4, 5);

        System.out.println(c);
        System.out.println(r);
    }
}