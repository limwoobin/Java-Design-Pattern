package ProxyPattern.ex3;

public class SecretTextFile implements TextFile {
    private String plainText;

    public SecretTextFile(String fileName) {
        this.plainText = fileName + " Secret";
    }


    @Override
    public String fetch() {
        return plainText;
    }

}
