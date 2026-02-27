import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedUncheckedDemo {

    public static void main(String[] args) {

        // Checked Exception (FileNotFoundException)
        try {
            FileReader file = new FileReader("nonexistent.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Checked Exception: File not found.");
        }

        // Unchecked Exception (ArithmeticException)
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: Cannot divide by zero.");
        }

    }
}