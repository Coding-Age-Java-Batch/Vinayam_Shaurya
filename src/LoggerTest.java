import java.time.LocalDateTime;

// Abstract class
abstract class Logger {

    abstract void log(String message);

    String getTimestamp() {
        return LocalDateTime.now().toString();
    }
}

// File Logger
class FileLogger extends Logger {

    void log(String message) {
        System.out.println("[" + getTimestamp() + "] File Log: " + message);
    }
}

// Console Logger
class ConsoleLogger extends Logger {

    void log(String message) {
        System.out.println("[" + getTimestamp() + "] Console Log: " + message);
    }
}

// Database Logger
class DatabaseLogger extends Logger {

    void log(String message) {
        System.out.println("[" + getTimestamp() + "] Database Log: " + message);
    }
}

// Main class
public class LoggerTest {

    public static void main(String[] args) {

        Logger fileLogger = new FileLogger();
        Logger consoleLogger = new ConsoleLogger();
        Logger dbLogger = new DatabaseLogger();

        fileLogger.log("File saved successfully.");
        consoleLogger.log("Application started.");
        dbLogger.log("User data inserted.");
    }
}