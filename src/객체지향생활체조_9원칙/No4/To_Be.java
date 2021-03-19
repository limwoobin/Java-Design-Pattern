package 객체지향생활체조_9원칙.No4;

import java.util.List;

public class To_Be {
    // Cars 라는 일급 컬렉션을 이용하여 리팩토링

    private String getTopRankedCar2(List<Car> carList) {
        Cars cars = new Cars(carList);
        String topCarString = "";
        Car maxPositionCar = cars.getCarMaxPosition();
        topCarString = topCarString + maxPositionCar.getCarName();

        return topCarString.substring(0, topCarString.length()-2);
    }
}
