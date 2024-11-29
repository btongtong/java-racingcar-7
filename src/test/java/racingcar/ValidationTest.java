package racingcar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class ValidationTest {
    @ParameterizedTest
    @CsvSource({"'aaa,bbb,'", "',aaa,bbb'", "','"})
    void 자동차_이름이_문자로_시작하고_쉼표로_구분되고_문자로_끝나지_않으면_에러가_난다(String input) {
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
    @CsvSource({"abcdef", "aaaaaaaaaa"})
    void 자동차_이름이_5글자를_넘어가면_에러가_난다(String input) {
        assertThatThrownBy(() -> Validation.validateNameLength(input, 5))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @CsvSource({"' '", "''"})
    void 자동차_이름이_공복이면_에러가_난다(String input) {
        assertThatThrownBy(() -> Validation.validateEmpty(input))
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
