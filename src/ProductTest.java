class Product {

    private int productId;
    private String name;
    private double price;
    private int quantity;

    // Constructor
    Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
        this.quantity = quantity;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Set price
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Must be positive.");
        }
    }

    // Add stock
    public void addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println("Added stock: " + amount);
        }
    }

    // Sell product
    public void sellProduct(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
            System.out.println("Sold: " + amount);
        } else {
            System.out.println("Not enough stock!");
        }
    }

    // Total value
    public double getTotalValue() {
        return price * quantity;
    }

    // Stock status
    public boolean isInStock() {
        return quantity > 0;
    }
}

// Main class
public class ProductTest {

    public static void main(String[] args) {

        Product p = new Product(101, "Laptop", 50000, 5);

        p.addStock(3);
        p.sellProduct(4);

        System.out.println("Total Value: " + p.getTotalValue());
        System.out.println("In Stock? " + p.isInStock());
    }
}