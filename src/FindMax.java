public class FindMax {

    // Method to find maximum element
    public static int findMaximum(int[] arr) {

        int max = arr[0];   // assume first element is max

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];   // update max
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 5, 40, 25};

        int result = findMaximum(numbers);

        System.out.println("Maximum element = " + result);
    }
}