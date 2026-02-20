public class FindMissingNumber {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 5};
        int N = 5;

        // Expected sum from 1 to N
        int expectedSum = N * (N + 1) / 2;

        // Actual sum of array
        int actualSum = 0;
        for(int i = 0; i < numbers.length; i++) {
            actualSum += numbers[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number = " + missingNumber);
    }
}