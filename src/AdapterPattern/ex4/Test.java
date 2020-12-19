package AdapterPattern.ex4;

public class Test {
    public static void main(String[] args) {
        CType galaxyNote = new GalaxyPhone();
        Lightening iphonePro = new IPhone();

        galaxyNote.connect();
        iphonePro.connect();

        iphonePro = new Adapter(galaxyNote);
        iphonePro.connect();
    }
}
