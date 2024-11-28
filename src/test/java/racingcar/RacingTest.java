package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RacingTest {
    Racing racing;

    @BeforeEach
    void setUp() {
        racing = new Racing("Car1,Car2,Car3");
    }

    @Test
    void 움직임_최댓값을_찾는다() {
        List<Car> cars = racing.getCars();
        cars.get(0).move();
        cars.get(0).move();
        cars.get(1).move();

        assertEquals(2, racing.getMaxMove());
    }

    @Test
    void 우승자를_구한다() {
        List<Car> cars = racing.getCars();
        cars.get(0).move();
        cars.get(0).move();
        cars.get(1).move();
        cars.get(2).move();
        cars.get(2).move();

        List<String> winners = racing.getWinners();

        assertEquals(2, winners.size());
        assertTrue(winners.contains(cars.get(0).getName()));
        assertTrue(winners.contains(cars.get(2).getName()));
    }
}
