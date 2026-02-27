import java.util.Scanner;

// Custom Exception
class UnderAgeException extends RuntimeException {
    public UnderAgeException(String message) {
        super(message);
    }
}

public class UnderAgeExceptionExample {

    public static void checkAge(int age) {
        if (age < 18) {
            throw new UnderAgeException("You are underage for voting.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        }
        catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}