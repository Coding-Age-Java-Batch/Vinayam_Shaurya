interface Logger {
    void log(String message);
}

// Console Logger
class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println("Console Logger: " + message);
    }
}

// File Logger
class FileLogger implements Logger {
    public void log(String message) {
        System.out.println("File Logger: Writing message -> " + message);
    }
}

// Database Logger
class DatabaseLogger implements Logger {
    public void log(String message) {
        System.out.println("Database Logger: Saving message -> " + message);
    }
}

// Main Class
public class LoggerTest {

    public static void main(String[] args) {

        Logger console = new ConsoleLogger();
        Logger file = new FileLogger();
        Logger database = new DatabaseLogger();

        String msg = "System Error";

        console.log(msg);
        file.log(msg);
        database.log(msg);
    }
}