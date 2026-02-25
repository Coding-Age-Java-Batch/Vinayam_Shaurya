public class UniqueCharacters {

    // Method to check unique characters
    public static boolean isUniqueChars(String str) {

        for(int i = 0; i < str.length(); i++) {

            for(int j = i + 1; j < str.length(); j++) {

                if(str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input1 = "abcdef";
        String input2 = "hello";

        System.out.println(isUniqueChars(input1)); // true
        System.out.println(isUniqueChars(input2)); // false
    }
}