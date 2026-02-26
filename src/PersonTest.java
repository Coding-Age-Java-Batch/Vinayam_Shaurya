class Person {

    // Private fields
    private String name;
    private int age;
    private String email;

    // Constructor
    Person(String name, int age, String email) {
        this.name = name;
        setAge(age);
        setEmail(email);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setter methods with validation
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be between 0 and 120.");
        }
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email! Must contain '@'");
        }
    }

    // toString method
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Email: " + email;
    }

    // Main method
    public static void main(String[] args) {

        Person p = new Person("Rahul", 20, "rahul@gmail.com");

        p.setAge(25);
        p.setAge(-5); // Should fail

        p.setEmail("rahul_new@gmail.com");

        System.out.println(p);
    }
}