import java.util.ArrayList;

public class ArrayListOperations {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Add elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("Original List: " + languages);

        // Remove "Python"
        languages.remove("Python");

        // Update "C++" to "Go"
        int index = languages.indexOf("C++");
        if(index != -1) {
            languages.set(index, "Go");
        }

        System.out.println("Updated List: " + languages);
    }
}