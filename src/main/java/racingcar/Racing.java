package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Racing {
    private static final String SEPERATOR = ",";
    private static final int moveCriteria = 4;
    private List<Car> cars;

    public Racing(String input) {
        this.cars = getCarsByInput(input);
    }

    private List<Car> getCarsByInput(String input) {
        List<Car> cars = new ArrayList<>();
        for (String name : input.split(SEPERATOR)) {
            cars.add(new Car(name));
        }
        return cars;
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

    public List<Car> getCars() {
        return cars;
    }
}
