package ProxyPattern.ex3;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<TextFile> textFileList = new ArrayList<>();
        textFileList.add(new ProxyTextFile("Proxy1"));
        textFileList.add(new ProxyTextFile("Proxy2"));

        textFileList.stream().map(TextFile::fetch).forEach(System.out::println);
    }
}
