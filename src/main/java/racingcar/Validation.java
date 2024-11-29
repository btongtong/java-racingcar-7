package racingcar;

import java.util.Arrays;
import java.util.List;

public class Validation {
    public static void validateNameFormat(String input) {
        String regex = "([^,]+,)*[^,]+$";
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

    public static void validateNameLength(String input, int max) {
        if (input.length() > max) {
            throw new IllegalArgumentException(ErrorMessage.NAME_FORMAT_ERROR.getMessage());
        }
    }

    public static void validateEmpty(String input) {
        if (input.isBlank()) {
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
