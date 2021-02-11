package FirstClassCollection.NamedCollection;

import FirstClassCollection.StatusAndBehavior.Pay;

import java.util.List;

/**
 * Created by Drogba on 2021-02-10
 * github : https://github.com/limwoobin
 */

// 컬렉션에 이름을 붙일 수 있다는 장점
public class Test {
    public void 컬렉션을_변수명으로() {
        List<Pay> naverPays = createNaverPays();
        List<Pay> kakaoPays = createKakaoPays();
    }

    public void 일급컬렉션의_이름으로() {
        NaverPays naverPays = new NaverPays(createNaverPays());
        KakaoPays kakaoPays = new KakaoPays(createKakaoPays());
    }

    private List<Pay> createNaverPays() {
        return null;
    }

    private List<Pay> createKakaoPays() {
        return null;
    }
}
