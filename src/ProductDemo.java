// JavaBean Class
class Product {

    // Private attributes
    private int id;
    private String name;
    private double price;

    // No-arg constructor
    public Product() {
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Main class
public class ProductDemo {

    public static void main(String[] args) {

        Product p = new Product();

        // Set values
        p.setId(101);
        p.setName("Laptop");
        p.setPrice(55000);

        // Get values
        System.out.println("Product ID: " + p.getId());
        System.out.println("Product Name: " + p.getName());
        System.out.println("Product Price: " + p.getPrice());
    }
}