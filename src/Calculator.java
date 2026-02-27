class Calculator {

    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int sum1 = calc.add(10, 20);
        int sum2 = calc.add(5, 10, 15);

        System.out.println("Sum of 10 and 20 is: " + sum1);
        System.out.println("Sum of 5, 10, and 15 is: " + sum2);
    }
}