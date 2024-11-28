package racingcar;

public class Validation {
    public static void validateNameFormat(String input) {
        String regex = "([^\\s]{1,5},)*[^\\s]{1,5}";
        if (!input.matches(regex)) {
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
