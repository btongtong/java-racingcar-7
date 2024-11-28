package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RacingTest {
    List<Car> cars;
    Racing racing;

    @BeforeEach
    void setUp() {
        cars = List.of(new Car("Car1"), new Car("Car2"), new Car("Car3"));
        racing = new Racing(cars);
    }

    @Test
    void 움직임_최댓값을_찾는다() {
        cars.get(0).move();
        cars.get(0).move();
        cars.get(1).move();

        assertEquals(2, racing.getMaxMove());
    }

    @Test
    void 우승자를_구한다() {
        cars.get(0).move();
        cars.get(0).move();
        cars.get(1).move();
        cars.get(2).move();
        cars.get(2).move();

        List<Car> winners = racing.getWinners();

        assertEquals(2, winners.size());
        assertTrue(winners.contains(cars.get(0)));
        assertTrue(winners.contains(cars.get(2)));
    }
}
