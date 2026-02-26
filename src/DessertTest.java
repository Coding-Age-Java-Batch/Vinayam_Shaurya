// Base class
class Food {

    String foodName;

    Food(String foodName) {
        this.foodName = foodName;
    }

    void display() {
        System.out.println("Food: " + foodName);
    }
}

// Derived class
class Dessert extends Food {

    String sweetnessLevel;

    Dessert(String foodName, String sweetnessLevel) {
        super(foodName);
        this.sweetnessLevel = sweetnessLevel;
    }

    @Override
    void display() {
        System.out.println("Food: " + foodName +
                " Sweetness Level: " + sweetnessLevel);
    }
}

// Main class
public class DessertTest {

    public static void main(String[] args) {

        Dessert d = new Dessert("Gulab Jamun", "High");
        d.display();
    }
}