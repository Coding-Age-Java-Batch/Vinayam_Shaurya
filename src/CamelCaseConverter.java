public class CamelCaseConverter {

    // Method to convert to camelCase
    public static String toCamelCase(String input) {

        String[] words = input.toLowerCase().split(" ");
        String result = words[0];

        for(int i = 1; i < words.length; i++) {

            if(words[i].length() > 0) {
                result = result +
                        words[i].substring(0,1).toUpperCase() +
                        words[i].substring(1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String input = "hello world java";

        String output = toCamelCase(input);

        System.out.println("Camel Case: " + output);
    }
}