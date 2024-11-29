package racingcar;

public class Round {
    private int conductCount;

    public Round(String input) {
        validate(input);
        this.conductCount = Integer.parseInt(input);
    }

    private static void validate(String input) {
        Validation.validateConductCountFormat(input);
        Validation.validateNumberFormat(input);
    }

    public void reduceConductCount() {
        this.conductCount--;
    }

    public boolean isRemainConductCount() {
        return this.conductCount != 0;
    }
}
