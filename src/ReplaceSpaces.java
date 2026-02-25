public class ReplaceSpaces {

    // Method to replace spaces
    public static String replaceSpaces(String str) {

        return str.replace(" ", "-");
    }

    public static void main(String[] args) {

        String input = "Coding is fun";

        String output = replaceSpaces(input);

        System.out.println("Result: " + output);
    }
}