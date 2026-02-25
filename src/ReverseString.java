public class ReverseString {

    // Method to reverse string
    public static String reverse(String str) {

        String reversed = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        String input = "coding";

        String result = reverse(input);

        System.out.println("Reversed String: " + result);
    }
}