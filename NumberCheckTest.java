@FunctionalInterface
interface NumberCheck {
    boolean check(int num);
}

public class NumberCheckTest {

    public static void main(String[] args) {

        int number = 131;

        // Even Check
        NumberCheck isEven = n -> n % 2 == 0;

        // Prime Check
        NumberCheck isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };

        // Palindrome Check
        NumberCheck isPalindrome = n -> {
            int original = n, reverse = 0;
            while (n != 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n /= 10;
            }
            return original == reverse;
        };

        System.out.println("Number: " + number);
        System.out.println("Is Even: " + isEven.check(number));
        System.out.println("Is Prime: " + isPrime.check(number));
        System.out.println("Is Palindrome: " + isPalindrome.check(number));
    }
}