import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

    public static void main(String[] args) {

        // Given Array
        String[] arr = {"A", "B", "C"};

        // Convert using Arrays.asList()
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("ArrayList = " + list);
    }
}