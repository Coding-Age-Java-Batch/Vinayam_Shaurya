interface Animal {
    void makeSound();
}

// Dog class
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Bark");
    }
}

// Cat class
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow");
    }
}

// Cow class
class Cow implements Animal {
    public void makeSound() {
        System.out.println("Cow says: Moo");
    }
}

// Main class
public class AnimalTest {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}