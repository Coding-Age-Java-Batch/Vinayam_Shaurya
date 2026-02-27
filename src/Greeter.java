class Greeter {

    // Method 1: No parameters
    void greet() {
        System.out.println("Hello!");
    }

    // Method 2: Takes name
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method 3: Takes name and time of day
    void greet(String name, String time) {
        System.out.println("Good " + time + ", " + name + "!");
    }

    public static void main(String[] args) {

        Greeter g = new Greeter();

        g.greet();
        g.greet("Riya");
        g.greet("Riya", "Morning");
    }
}