public class NestedTryCatchExample {

    public static void main(String[] args) {

        try {
            String input = "abc";   // Non-integer string
            int number = Integer.parseInt(input);  // Outer risky operation

            try {
                int result = 10 / 0;   // Inner risky operation
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Inner Catch: Cannot divide by zero.");
            }

        }
        catch (NumberFormatException e) {
            System.out.println("Outer Catch: Invalid number format.");
        }

    }
}