interface Operation {
    int operate(int a, int b);
}

public class ArithmeticTest {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Addition
        Operation add = new Operation() {
            public int operate(int a, int b) {
                return a + b;
            }
        };

        // Subtraction
        Operation subtract = new Operation() {
            public int operate(int a, int b) {
                return a - b;
            }
        };

        // Multiplication
        Operation multiply = new Operation() {
            public int operate(int a, int b) {
                return a * b;
            }
        };

        // Division
        Operation divide = new Operation() {
            public int operate(int a, int b) {
                return a / b;
            }
        };

        System.out.println("Addition: " + add.operate(a, b));
        System.out.println("Subtraction: " + subtract.operate(a, b));
        System.out.println("Multiplication: " + multiply.operate(a, b));
        System.out.println("Division: " + divide.operate(a, b));
    }
}