import java.util.ArrayList;

public class SearchArrayList {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int searchElement = 20;

        // Check using contains()
        if(numbers.contains(searchElement)) {
            int index = numbers.indexOf(searchElement);
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}