class Coffee {
    String name;
    int price;

    // Constructor
    Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " : ₹" + price);
    }
}

public class CoffeeMenu {
    public static void main(String[] args) {

        Coffee c1 = new Coffee("Espresso", 120);
        Coffee c2 = new Coffee("Cappuccino", 150);
        Coffee c3 = new Coffee("Latte", 170);
        Coffee c4 = new Coffee("Americano", 140);
        Coffee c5 = new Coffee("Mocha", 180);

        System.out.println("----- Coffee Menu -----");
        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
    }
}
