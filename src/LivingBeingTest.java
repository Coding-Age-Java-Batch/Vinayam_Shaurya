// Level 1
class LivingBeing {

    void breathe() {
        System.out.println("Breathing...");
    }
}

// Level 2
class Animal extends LivingBeing {

    void eat() {
        System.out.println("Eating...");
    }
}

// Level 3
class Dog extends Animal {

    void bark() {
        System.out.println("Barking...");
    }
}

// Main class
public class LivingBeingTest {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.breathe();
        d.eat();
        d.bark();
    }
}