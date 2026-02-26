class Timer {

    private long startTime;
    private long endTime;
    private boolean isRunning;

    // Constructor
    Timer() {
        isRunning = false;
        startTime = 0;
        endTime = 0;
    }

    // Start
    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis();
            isRunning = true;
            System.out.println("Timer started.");
        } else {
            System.out.println("Timer is already running!");
        }
    }

    // Stop
    public void stop() {
        if (isRunning) {
            endTime = System.currentTimeMillis();
            isRunning = false;
            System.out.println("Timer stopped.");
        } else {
            System.out.println("Timer is already stopped!");
        }
    }

    // Elapsed seconds
    public double getElapsedSeconds() {
        if (!isRunning) {
            return (endTime - startTime) / 1000.0;
        } else {
            return (System.currentTimeMillis() - startTime) / 1000.0;
        }
    }

    // Reset
    public void reset() {
        startTime = 0;
        endTime = 0;
        isRunning = false;
        System.out.println("Timer reset.");
    }

    // Check running
    public boolean isRunning() {
        return isRunning;
    }
}

// Main class
public class TimerTest {

    public static void main(String[] args) {

        Timer t = new Timer();

        t.start();

        try {
            Thread.sleep(2000); // simulate delay
        } catch (InterruptedException e) {}

        t.stop();

        System.out.println("Elapsed Time: " + t.getElapsedSeconds() + " seconds");

        t.reset();

        t.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        t.stop();

        System.out.println("Elapsed Time: " + t.getElapsedSeconds() + " seconds");
    }
}