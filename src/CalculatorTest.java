class Calculator {

    // Private field
    private double result;

    // Constructor
    Calculator() {
        result = 0;
    }

    // Add method
    void add(double number) {
        result += number;
    }

    // Subtract method
    void subtract(double number) {
        result -= number;
    }

    // Multiply method
    void multiply(double number) {
        result *= number;
    }

    // Divide method
    void divide(double number) {
        if (number != 0) {
            result /= number;
        } else {
            System.out.println("Error: Cannot divide by zero!");
        }
    }

    // Get result
    double getResult() {
        return result;
    }

    // Clear result
    void clear() {
        result = 0;
    }

    // Main method
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.add(10);
        calc.add(5);
        System.out.println("After Addition: " + calc.getResult());

        calc.multiply(2);
        System.out.println("After Multiplication: " + calc.getResult());

        calc.divide(3);
        System.out.println("After Division: " + calc.getResult());

        calc.clear();
        System.out.println("After Clear: " + calc.getResult());
    }
}