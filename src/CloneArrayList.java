import java.util.ArrayList;

public class CloneArrayList {

    public static void main(String[] args) {

        // Original List (List A)
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(10);
        listA.add(20);

        System.out.println("List A: " + listA);

        // Clone using constructor
        ArrayList<Integer> listB = new ArrayList<>(listA);

        System.out.println("Cloned List B: " + listB);
    }
}