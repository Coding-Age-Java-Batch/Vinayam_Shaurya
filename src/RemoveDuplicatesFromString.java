public class RemoveDuplicatesFromString {

    // Method to remove duplicate characters
    public static String removeDuplicates(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check if character already exists in result
            if(result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String input = "programming";

        String output = removeDuplicates(input);

        System.out.println("Result: " + output);
    }
}