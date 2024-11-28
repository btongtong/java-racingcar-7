package racingcar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomTest {
    @ParameterizedTest
    @CsvSource({"3, 4, false", "4, 4, true"})
    void 랜덤_숫자가_기준_숫자보다_크거나_같으면_true_아니면_false를_리턴한다(int randomNumber, int criteria, boolean result) {
        assertThat(Random.isParamOrMore(randomNumber, criteria))
                .isEqualTo(result);
    }
}
