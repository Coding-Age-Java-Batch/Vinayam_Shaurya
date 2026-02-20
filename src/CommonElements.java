import java.util.ArrayList;

public class CommonElements {

    public static void main(String[] args) {

        // First ArrayList
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(2);
        listA.add(3);

        // Second ArrayList
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(2);
        listB.add(3);
        listB.add(4);

        // Find common elements using retainAll()
        ArrayList<Integer> common = new ArrayList<>(listA);
        common.retainAll(listB);

        System.out.println("Common Elements: " + common);
    }
}