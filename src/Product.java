class Product {

    int productId;
    String productName;
    double price;

    // Constructor to initialize product details
    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Method to apply discount
    void applyDiscount(double discountPercent) {
        double discountAmount = price * discountPercent / 100;
        price = price - discountAmount;

        System.out.println("Updated Price after " + discountPercent + "% discount: " + price);
    }

    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 50000);

        System.out.println("Original Price: " + p1.price);

        // Applying 10% discount
        p1.applyDiscount(10);
    }
}