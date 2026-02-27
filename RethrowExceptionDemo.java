public class RethrowExceptionDemo {

    // Method that catches and re-throws
    public static void methodB() {
        try {
            int result = 10 / 0;   // Exception occurs here
        }
        catch (ArithmeticException e) {
            System.out.println("Logged in methodB: Cannot divide by zero.");
            throw e;   // Re-throwing exception
        }
    }

    public static void methodA() {
        try {
            methodB();
        }
        catch (ArithmeticException e) {
            System.out.println("Caught again in methodA.");
        }
    }

    public static void main(String[] args) {
        methodA();
    }
}