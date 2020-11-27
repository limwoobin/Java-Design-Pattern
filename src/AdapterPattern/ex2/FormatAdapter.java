package AdapterPattern.ex2;

public class FormatAdapter implements MediaPlayer {
    private final VideoPlayer videoPlayer;

    public FormatAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void mp3Play(String filename) {
        System.out.println("Using Adapter ...");
        videoPlayer.videoPlay(filename);
    }
}
