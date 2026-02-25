public class CompareIgnoreCase {

    // Method to compare strings ignoring case
    public static boolean compareIgnoreCase(String str1, String str2) {

        return str1.equalsIgnoreCase(str2);
    }

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "java";

        boolean result = compareIgnoreCase(str1, str2);

        System.out.println(result);
    }
}