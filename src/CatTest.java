// Base class
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class
class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }

    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class CatTest {

    public static void main(String[] args) {

        Cat c = new Cat();
        c.eat();
        c.sound();
    }
}