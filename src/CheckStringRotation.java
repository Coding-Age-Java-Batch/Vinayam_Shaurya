public class CheckStringRotation {

    // Method to check rotation
    public static boolean isRotation(String str1, String str2) {

        // Length must be same
        if(str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself
        String temp = str1 + str1;

        // Check if str2 exists in concatenated string
        return temp.contains(str2);
    }

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "cdab";

        if(isRotation(str1, str2)) {
            System.out.println("True (Rotation)");
        } else {
            System.out.println("False (Not Rotation)");
        }
    }
}