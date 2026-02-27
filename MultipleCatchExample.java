public class MultipleCatchExample {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        try {
            int result = 10 / 0;     // Arithmetic Exception
            System.out.println(arr[10]);  // Array Index Exception
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }

    }
}