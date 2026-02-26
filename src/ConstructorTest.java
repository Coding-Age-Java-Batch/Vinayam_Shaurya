// Parent class
class Parent {

    Parent() {
        System.out.println("Parent constructor called");
    }
}

// Child class
class Child extends Parent {

    Child() {
        System.out.println("Child constructor called");
    }
}

// Main class
public class ConstructorTest {

    public static void main(String[] args) {

        Child c = new Child();
    }
}