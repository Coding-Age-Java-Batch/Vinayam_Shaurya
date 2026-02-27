public class ExceptionPropagationDemo {

    // Deepest method
    public static void methodC() {
        int result = 10 / 0;   // Exception occurs here
    }

    // Middle method
    public static void methodB() {
        methodC();   // Exception propagates to here
    }

    // First method
    public static void methodA() {
        try {
            methodB();   // Exception propagates to here
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught in methodA: Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        methodA();
    }
}