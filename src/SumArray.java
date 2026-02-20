public class SumArray {

    // Method to calculate sum
    public static int findSum(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        // Define integer array
        int[] numbers = {1, 2, 3, 4};

        // Call method
        int result = findSum(numbers);

        // Print result
        System.out.println("Sum of array elements = " + result);
    }
}