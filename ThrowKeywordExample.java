import java.util.Scanner;

public class ThrowKeywordExample {

    public static void checkPositive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive.");
        } else {
            System.out.println("Valid number: " + number);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        try {
            checkPositive(num);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}