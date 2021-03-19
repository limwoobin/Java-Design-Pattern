package 객체지향생활체조_9원칙.No4;

import java.util.List;

public class As_Is {
    private String getTopRankedCar(List<Car> carList) {
        String topCarString = "";
        int maxPosition = getMaxPosition(carList);
        for(int i=0; i < carList.size(); i++) {
            if(carList.get(i).getPosition() == maxPosition) topCarString += carList.get(i).getCarName() + ",";
        }
        return topCarString.substring(0, topCarString.length()-2);
    }

    private int getMaxPosition(List<Car> carList) {
        int maxPosition = 0;
        for(int i=0; i < carList.size(); i++) {
            if(maxPosition < carList.get(i).getPosition()) maxPosition = carList.get(i).getPosition();
        }

        return maxPosition;
    }
}