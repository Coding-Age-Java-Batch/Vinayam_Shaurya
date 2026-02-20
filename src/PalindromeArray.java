public class PalindromeArray {

    public static boolean isPalindrome(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        // Two-pointer approach
        while(start < end) {

            if(arr[start] != arr[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 1};

        if(isPalindrome(numbers)) {
            System.out.println("True (Palindrome)");
        } else {
            System.out.println("False (Not Palindrome)");
        }
    }
}