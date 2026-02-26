// Abstract class
abstract class Animal {

    String type;

    Animal(String type) {
        this.type = type;
    }

    // Abstract method
    abstract void makeSound();

    // Describe method
    void describe() {
        System.out.print(type + " makes sound: ");
        makeSound();
    }
}

// Dog class
class Dog extends Animal {

    Dog() {
        super("Dog");
    }

    void makeSound() {
        System.out.println("Bark");
    }
}

// Cat class
class Cat extends Animal {

    Cat() {
        super("Cat");
    }

    void makeSound() {
        System.out.println("Meow");
    }
}

// Cow class
class Cow extends Animal {

    Cow() {
        super("Cow");
    }

    void makeSound() {
        System.out.println("Moo");
    }
}

// Main class
public class AnimalTest {

    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.makeSound();
        a1.describe();

        a2.makeSound();
        a2.describe();

        a3.makeSound();
        a3.describe();
    }
}