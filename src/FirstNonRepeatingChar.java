public class FirstNonRepeatingChar {

    // Method to find first non-repeating character
    public static char firstNonRepeatingChar(String str) {

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for(int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)) {
                    count++;
                }
            }

            if(count == 1) {
                return ch;
            }
        }

        return ' '; // fallback (won't occur as per assumption)
    }

    public static void main(String[] args) {

        String input = "swiss";

        char result = firstNonRepeatingChar(input);

        System.out.println("First Non-Repeating Character: " + result);
    }
}