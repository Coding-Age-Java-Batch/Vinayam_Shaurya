public class CountEvenOdd {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int evenCount = 0;
        int oddCount = 0;

        // Loop through array
        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print result
        System.out.println("Even = " + evenCount);
        System.out.println("Odd = " + oddCount);
    }
}