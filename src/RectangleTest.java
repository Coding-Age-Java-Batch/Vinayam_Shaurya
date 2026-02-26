class Rectangle {

    // Private fields
    private double length;
    private double width;

    // Constructor
    Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Setter for length
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Invalid length! Must be positive.");
        }
    }

    // Setter for width
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Invalid width! Must be positive.");
        }
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Area
    public double getArea() {
        return length * width;
    }

    // Perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Check if square
    public boolean isSquare() {
        return length == width;
    }

    // Main method
    public static void main(String[] args) {

        Rectangle r = new Rectangle(4, 6);

        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println("Is Square? " + r.isSquare());

        System.out.println("\nMaking it a square...");
        r.setWidth(4);

        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println("Is Square? " + r.isSquare());
    }
}