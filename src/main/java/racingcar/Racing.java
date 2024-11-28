package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class Racing {
    private static final int moveCriteria = 4;
    List<Car> cars;

    public Racing(List<Car> cars) {
        this.cars = cars;
    }

    public void moveCars() {
        cars.stream()
                .filter(car -> Random.isParamOrMore(Random.getRandomNumber(), moveCriteria))
                .forEach(Car::move);
    }

    public int getMaxMove() {
        return cars.stream().mapToInt(car -> car.getMove().length()).max().orElse(0);
    }

    public List<String> getWinners() {
        int maxMove = getMaxMove();
        return cars.stream()
                .filter(car -> car.getMove().length() == maxMove)
                .map(Car::getName).collect(Collectors.toList());
    }
}
