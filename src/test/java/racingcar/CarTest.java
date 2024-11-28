package racingcar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void 자동차를_움직인다(int length) {
        Car car = new Car("dongdong");
        for (int i = 0; i < length; i++) {
            car.move();
        }
        assertThat(car.getMove().length())
                .isEqualTo(length);
    }
}
