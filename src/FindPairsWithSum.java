public class FindPairsWithSum {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 3, 5, 7};
        int targetSum = 7;

        System.out.println("Pairs with sum " + targetSum + " are:");

        // Nested loop to find pairs
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {

                if(numbers[i] + numbers[j] == targetSum) {
                    System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
                }
            }
        }
    }
}