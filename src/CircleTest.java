class Circle {

    // Private field
    private double radius;

    // Constructor
    Circle(double radius) {
        setRadius(radius);
    }

    // Setter with validation
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid radius! Must be positive.");
        }
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Diameter
    public double getDiameter() {
        return 2 * radius;
    }

    // Main method
    public static void main(String[] args) {

        Circle c = new Circle(5);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());

        System.out.println("\nChanging radius to 10...");
        c.setRadius(10);

        System.out.println("New Radius: " + c.getRadius());
        System.out.println("New Area: " + c.getArea());
        System.out.println("New Circumference: " + c.getCircumference());
    }
}