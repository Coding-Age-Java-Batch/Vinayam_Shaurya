import java.util.Arrays;

public class CheckAnagram {

    // Method to check anagram
    public static boolean isAnagram(String str1, String str2) {

        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ → not anagram
        if(str1.length() != str2.length()) {
            return false;
        }

        // Convert to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";

        if(isAnagram(str1, str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}