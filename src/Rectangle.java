class Rectangle {

    double length;
    double breadth;

    // Constructor to initialize length and breadth
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to compare area with another rectangle
    boolean hasEqualArea(Rectangle r) {
        double area1 = this.length * this.breadth;
        double area2 = r.length * r.breadth;

        return area1 == area2;
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(5, 10);

        boolean result = r1.hasEqualArea(r2);

        System.out.println("Rectangle 1 and Rectangle 2 have equal area: " + result);
    }
}