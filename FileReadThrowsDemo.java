import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileReadThrowsDemo {

    // Method declaring exception using throws
    public static void readFile() throws FileNotFoundException {
        FileReader file = new FileReader("nonexistent.txt");
    }

    public static void main(String[] args) {

        try {
            readFile();
        }
        catch (FileNotFoundException e) {
            System.out.println("Proper exception message: File not found.");
        }

    }
}