public class MoveZerosToEnd {

    public static void moveZeros(int[] arr) {

        int index = 0;

        // Move all non-zero elements forward
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with 0
        while(index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {0, 1, 0, 3, 12};

        moveZeros(numbers);

        System.out.print("Result: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }
}