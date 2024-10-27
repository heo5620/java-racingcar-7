package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RaceCars {

    private final List<Car> raceCars;

    private RaceCars(List<Car> raceCars) {
        this.raceCars = raceCars;
    }

    public static RaceCars addCars(String[] carNames) {
        List<Car> raceCars = new ArrayList<>();

        for (String carName : carNames) {
            Car car = new Car(carName);
            raceCars.add(car);
        }

        return new RaceCars(raceCars);
    }
}