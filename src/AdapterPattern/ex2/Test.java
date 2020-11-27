package AdapterPattern.ex2;

public class Test {
    public static void main(String[] args) {
        MediaPlayer media = new MP3();
        media.mp3Play("file.mp3");

        VideoPlayer video = new Video();
        video.videoPlay("file2.avi");

        media = new FormatAdapter(video);
        media.mp3Play("file3.avi");
    }
}
