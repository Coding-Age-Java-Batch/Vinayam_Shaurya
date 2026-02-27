class StudentInfo {

    // Method to print name and age
    void printDetails(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Overloaded method to print name, age, and course
    void printDetails(String name, int age, String course) {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    public static void main(String[] args) {

        StudentInfo s = new StudentInfo();

        s.printDetails("Rahul", 20);
        s.printDetails("Priya", 19, "B.Tech");
    }
}