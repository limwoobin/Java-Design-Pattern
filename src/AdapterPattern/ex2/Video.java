package AdapterPattern.ex2;

public class Video implements VideoPlayer {

    @Override
    public void videoPlay(String filename) {
        System.out.println("Playing Video file" + filename);
    }
}
