// Abstract class
abstract class MediaPlayer {

    String fileName;

    MediaPlayer(String fileName) {
        this.fileName = fileName;
    }

    // Abstract method
    abstract void play();
}

// Audio Player
class AudioPlayer extends MediaPlayer {

    AudioPlayer(String fileName) {
        super(fileName);
    }

    void play() {
        System.out.println("Playing audio: " + fileName);
    }
}

// Video Player
class VideoPlayer extends MediaPlayer {

    VideoPlayer(String fileName) {
        super(fileName);
    }

    void play() {
        System.out.println("Playing video: " + fileName);
    }
}

// Main class
public class MediaPlayerTest {

    public static void main(String[] args) {

        MediaPlayer audio = new AudioPlayer("song.mp3");
        MediaPlayer video = new VideoPlayer("movie.mp4");

        audio.play();
        video.play();
    }
}