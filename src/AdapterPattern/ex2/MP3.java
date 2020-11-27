package AdapterPattern.ex2;

public class MP3 implements MediaPlayer {

    @Override
    public void mp3Play(String filename) {
        System.out.println("Playing MP3 FIle " + filename);
    }
}
