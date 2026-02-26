class ShoppingItem {

    private String itemName;
    private double price;
    private int quantity;
    private String category;

    // Constructor
    ShoppingItem(String itemName, double price, int quantity, String category) {
        this.itemName = itemName;
        updatePrice(price);
        setQuantity(quantity);
        this.category = category;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    // Set quantity
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity!");
        }
    }

    // Update price
    public void updatePrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
        } else {
            System.out.println("Invalid price!");
        }
    }

    // Apply discount
    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            price -= price * percentage / 100;
            System.out.println("Discount applied: " + percentage + "%");
        } else {
            System.out.println("Invalid discount!");
        }
    }

    // Total cost
    public double getTotalCost() {
        return price * quantity;
    }

    // Item summary
    public String getItemSummary() {
        return "Item: " + itemName +
                ", Category: " + category +
                ", Price: $" + price +
                ", Quantity: " + quantity;
    }
}

// Main class
public class ShoppingItemTest {

    public static void main(String[] args) {

        ShoppingItem item = new ShoppingItem("Headphones", 2000, 2, "Electronics");

        item.setQuantity(3);
        item.applyDiscount(15);

        System.out.println(item.getItemSummary());
        System.out.println("Total Cost: $" + item.getTotalCost());
    }
}