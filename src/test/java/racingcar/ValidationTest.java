package racingcar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class ValidationTest {
    @ParameterizedTest
    @CsvSource({"''", "a cb", "abcdef"})
    void 자동차_이름이_5글자_이상이거나_공백이_포함되면_에러가_난다(String input) {
        assertThatThrownBy(() -> Validation.validateNameFormat(input))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @CsvSource({"'a,aa,a'", "'a,b,c,b'"})
    void 자동차_이름이_중복되면_에러가_난다(String input) {
        assertThatThrownBy(() -> Validation.validateDuplicationName(input))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @CsvSource({"''", "'1 2'", "abc", "012"})
    void 실행횟수가_숫자가_아니면_에러가_난다(String input) {
        assertThatThrownBy(() -> Validation.validateConductCountFormat(input))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @CsvSource({"-2147483649", "2147483648"})
    void 실행횟수가_Integer_이하거나_이상이명_에러가_난다(String input) {
        assertThatThrownBy(() -> Validation.validateNumberFormat(input))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }
}
