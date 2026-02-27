public class NullPointerHandlingDemo {

    public static void main(String[] args) {

        String s = null;

        try {
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            System.out.println("String is null, cannot get length.");
        }

    }
}