// Base class
class Shape {

    void perimeter() {
        System.out.println("Calculating perimeter...");
    }
}

// Derived class
class Square extends Shape {

    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    void perimeter() {
        int p = 4 * side;
        System.out.println("Perimeter of Square: " + p);
    }
}

// Main class
public class SquarePerimeterTest {

    public static void main(String[] args) {

        Square s = new Square(10);
        s.perimeter();
    }
}