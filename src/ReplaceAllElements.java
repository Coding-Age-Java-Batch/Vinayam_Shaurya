import java.util.ArrayList;
import java.util.Collections;

public class ReplaceAllElements {

    public static void main(String[] args) {

        // Original ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Original List: " + numbers);

        // Replace all elements with 0
        Collections.fill(numbers, 0);

        System.out.println("Updated List: " + numbers);
    }
}