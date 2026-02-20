public class SeparatePositiveNegative {

    public static void rearrange(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            // Move left if already negative
            if(arr[left] < 0) {
                left++;
            }
            // Move right if already positive
            else if(arr[right] >= 0) {
                right--;
            }
            // Swap
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, -1, 3, -2, 5};

        rearrange(numbers);

        System.out.print("Result: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }
}