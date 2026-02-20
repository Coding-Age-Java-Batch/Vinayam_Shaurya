import java.util.ArrayList;
import java.util.List;

public class SubListExample {

    public static void main(String[] args) {

        // Original ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Create SubList from index 1 to 4
        List<Integer> subList = numbers.subList(1, 4);

        System.out.println("SubList: " + subList);
    }
}