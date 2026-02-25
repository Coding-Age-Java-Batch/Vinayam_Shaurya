public class CountWords {

    // Method to count words
    public static int countWords(String sentence) {

        if(sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }

        String[] words = sentence.trim().split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {

        String input = "Java is a powerful language";

        int result = countWords(input);

        System.out.println("Word Count: " + result);
    }
}