public class CharacterFrequency {

    // Method to print frequency
    public static void printFrequency(String str) {

        str = str.toLowerCase();

        boolean[] visited = new boolean[str.length()];

        for(int i = 0; i < str.length(); i++) {

            if(visited[i])
                continue;

            char ch = str.charAt(i);
            int count = 1;

            for(int j = i + 1; j < str.length(); j++) {
                if(ch == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(ch + ":" + count);
        }
    }

    public static void main(String[] args) {

        String input = "Apple";

        printFrequency(input);
    }
}