public class FinallyBlockExample {

    public static void main(String[] args) {

        try {
            int result = 5 / 0;   // Risky operation
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        finally {
            System.out.println("Execution Completed.");
        }

    }
}