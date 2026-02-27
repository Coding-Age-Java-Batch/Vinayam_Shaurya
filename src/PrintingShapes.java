class Shape {
    void printShape() {
        System.out.println("This is a shape");
    }
}

class Square extends Shape {
    void printShape() {
        System.out.println("This is a square");
    }
}

class Triangle extends Shape {
    void printShape() {
        System.out.println("This is a triangle");
    }
}

public class PrintingShapes {
    public static void main(String[] args) {

        Shape s = new Shape();
        Square sq = new Square();
        Triangle t = new Triangle();

        s.printShape();
        sq.printShape();
        t.printShape();
    }
}