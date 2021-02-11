package FirstClassCollection.BusinessDependent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Drogba on 2021-02-10
 * github : https://github.com/limwoobin
 */
public class LottoService {

    public void createLottoNumbers() {
        LottoTicket lottoTicket = new LottoTicket(createNonDuplicateNumbers());
    }

    private List<Long> createNonDuplicateNumbers() {
        List<Long> lottoNumbers = new ArrayList<>();
        for (int i=0; i<6; i++) {
            lottoNumbers.add((long)(Math.random() * 45) + 1);
        }
        return lottoNumbers;
    }
}
