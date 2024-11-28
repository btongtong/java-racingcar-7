package racingcar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validation {
    public static void validateNameFormat(String input) {
        String regex = "([^\\s]{1,5},)*[^\\s]{1,5}";
        if (!input.matches(regex)) {
            throw new IllegalArgumentException(ErrorMessage.NAME_FORMAT_ERROR.getMessage());
        }
    }

    public static void validateDuplicationName(String input) {
        List<String> names = Arrays.asList(input.split(","));
        if (names.size() != names.stream().distinct().count()) {
            throw new IllegalArgumentException(ErrorMessage.NAME_FORMAT_ERROR.getMessage());
        }
    }

    public static void validateConductCountFormat(String input) {
        String regex = "0|[1-9][0-9]*";
        if (!input.matches(regex)) {
            throw new IllegalArgumentException(ErrorMessage.CONDUCT_COUNT_FORMAT_ERROR.getMessage());
        }
    }

    public static void validateNumberFormat(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.CONDUCT_COUNT_FORMAT_ERROR.getMessage());
        }
    }
}
