class AreaCalculator {

    // Method to calculate area of circle
    double area(int radius) {
        return 3.14 * radius * radius;
    }

    // Method to calculate area of rectangle
    int area(int length, int breadth) {
        return length * breadth;
    }

    // Method to calculate area of triangle
    double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {

        AreaCalculator ac = new AreaCalculator();

        System.out.println("Area of Circle: " + ac.area(5));
        System.out.println("Area of Rectangle: " + ac.area(4, 5));
        System.out.println("Area of Triangle: " + ac.area(6.0, 4.0));
    }
}