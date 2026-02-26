interface Playable {
    void play();
}

// Music Player class
class MusicPlayer implements Playable {

    public void play() {
        System.out.println("Playing Music...");
    }
}

// Video Player class
class VideoPlayer implements Playable {

    public void play() {
        System.out.println("Playing Video...");
    }
}

// Main class
public class PlayableTest {

    public static void main(String[] args) {

        Playable[] players = new Playable[2];

        players[0] = new MusicPlayer();
        players[1] = new VideoPlayer();

        for (Playable p : players) {
            p.play();
        }
    }
}