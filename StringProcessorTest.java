@FunctionalInterface
interface StringProcessor {
    String process(String input);
}

public class StringProcessorTest {

    public static void main(String[] args) {

        String input = "hello world";

        // Convert to Uppercase
        StringProcessor upperCase = str -> str.toUpperCase();

        // Reverse String
        StringProcessor reverse = str -> new StringBuilder(str).reverse().toString();

        // Remove Spaces
        StringProcessor removeSpaces = str -> str.replaceAll(" ", "");

        System.out.println("Original: " + input);
        System.out.println("Uppercase: " + upperCase.process(input));
        System.out.println("Reversed: " + reverse.process(input));
        System.out.println("Without Spaces: " + removeSpaces.process(input));
    }
}