// Interface
interface MusicPlayer {
    void playSong(String name);
}

// Spotify Player
class SpotifyPlayer implements MusicPlayer {

    public void playSong(String name) {
        System.out.println("Playing song on Spotify: " + name);
    }

    void pause() {
        System.out.println("Spotify Player paused");
    }
}

// Local Player
class LocalPlayer implements MusicPlayer {

    public void playSong(String name) {
        System.out.println("Playing song on Local Player: " + name);
    }

    void pause() {
        System.out.println("Local Player paused");
    }
}

// Main class
public class MusicPlayerTest {

    public static void main(String[] args) {

        SpotifyPlayer sp = new SpotifyPlayer();
        LocalPlayer lp = new LocalPlayer();

        sp.playSong("Shape of You");
        sp.pause();

        System.out.println();

        lp.playSong("Believer");
        lp.pause();
    }
}