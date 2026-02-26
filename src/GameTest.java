// Abstract class
abstract class Game {

    // Abstract method
    abstract void play();

    // Concrete method
    void start() {
        System.out.println("Game started");
    }
}

// Cricket class
class Cricket extends Game {

    void play() {
        System.out.println("Playing Cricket");
    }
}

// Chess class
class Chess extends Game {

    void play() {
        System.out.println("Playing Chess");
    }
}

// Main class
public class GameTest {

    public static void main(String[] args) {

        Game g1 = new Cricket();
        Game g2 = new Chess();

        g1.start();
        g1.play();

        System.out.println();

        g2.start();
        g2.play();
    }
}