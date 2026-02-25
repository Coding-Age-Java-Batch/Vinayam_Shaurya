public class ToggleCase {

    // Method to toggle case
    public static String toggleCase(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)) {
                result = result + Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)) {
                result = result + Character.toUpperCase(ch);
            }
            else {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String input = "Java123LOgic";

        String output = toggleCase(input);

        System.out.println("Toggled String: " + output);
    }
}