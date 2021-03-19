package 객체지향생활체조_9원칙.No4;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = new ArrayList<>(carList);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public int size() {
        return carList.size();
    }

    public Car getCar(int i) {
        return carList.get(i);
    }

    public Car getCarMaxPosition() {
        int maxPosition = 0;
        int index = 0;
        for (int i=0; i < size(); i++) {
            if(maxPosition < carList.get(i).getPosition()) {
                maxPosition = carList.get(i).getPosition();
                index = i;
            }
        }

        return carList.get(index);
    }
}
