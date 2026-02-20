import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);

        System.out.println("Before Sorting: " + numbers);

        // Sort using Collections.sort()
        Collections.sort(numbers);

        System.out.println("After Sorting: " + numbers);
    }
}