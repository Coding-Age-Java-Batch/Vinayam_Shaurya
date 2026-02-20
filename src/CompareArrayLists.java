import java.util.ArrayList;

public class CompareArrayLists {

    public static void main(String[] args) {

        // Create first ArrayList
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(2);
        listA.add(3);

        // Create second ArrayList
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(1);
        listB.add(2);
        listB.add(3);

        // Compare using equals()
        if(listA.equals(listB)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}