// Abstract class
abstract class MenuItem {

    String name;
    double price;

    MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract void prepare();

    void showPrice() {
        System.out.println("Price: ₹" + price);
    }
}

// Veg Burger
class VegBurger extends MenuItem {

    VegBurger() {
        super("Veg Burger", 120);
    }

    void prepare() {
        System.out.println("Preparing Veg Burger: Adding veg patty, lettuce, and sauce.");
    }
}

// Chicken Burger
class ChickenBurger extends MenuItem {

    ChickenBurger() {
        super("Chicken Burger", 180);
    }

    void prepare() {
        System.out.println("Preparing Chicken Burger: Adding chicken patty, cheese, and mayo.");
    }
}

// Cold Drink
class ColdDrink extends MenuItem {

    ColdDrink() {
        super("Cold Drink", 60);
    }

    void prepare() {
        System.out.println("Preparing Cold Drink: Pouring chilled beverage with ice.");
    }
}

// Main class
public class MenuTest {

    public static void main(String[] args) {

        MenuItem item1 = new VegBurger();
        MenuItem item2 = new ChickenBurger();
        MenuItem item3 = new ColdDrink();

        item1.prepare();
        item1.showPrice();

        System.out.println();

        item2.prepare();
        item2.showPrice();

        System.out.println();

        item3.prepare();
        item3.showPrice();
    }
}