public class ReverseArray {

    // Method to reverse array in-place
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};

        // Reverse array
        reverse(numbers);

        // Print reversed array
        System.out.print("Reversed Array: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}