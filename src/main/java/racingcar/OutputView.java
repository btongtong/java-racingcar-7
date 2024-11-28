package racingcar;

import java.util.List;

public class OutputView {
    public void printResult(List<Car> cars) {
        System.out.println(IOMessage.RESULT_TITLE.getMessage());
        cars.forEach(car -> System.out.println(IOMessage.RESULT_CONTENT.getMessage(car.getName(), car.getMove())));
    }

    public void printFinalWinner(List<String> cars) {
        System.out.println(IOMessage.FINAL_WINNER.getMessage(String.join(", ", cars)));
    }
}
