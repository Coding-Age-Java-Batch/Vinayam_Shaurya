import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        // Original ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);

        System.out.println("Original List: " + numbers);

        // Use Set to remove duplicates
        HashSet<Integer> set = new HashSet<>(numbers);

        // Create new list with unique elements
        ArrayList<Integer> uniqueList = new ArrayList<>(set);

        System.out.println("Unique List: " + uniqueList);
    }
}