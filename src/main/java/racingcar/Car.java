package racingcar;

public class Car {
    private static final String MOVE_SIGN = "-";
    private static final int MAX_LENGTH = 5;
    private String name;
    private StringBuilder move;

    public Car(String name) {
        validate(name);
        this.name = name;
        this.move = new StringBuilder();
    }

    private void validate(String name) {
        Validation.validateEmpty(name);
        Validation.validateNameLength(name, MAX_LENGTH);
    }

    public void move() {
        this.move.append(MOVE_SIGN);
    }

    public String getName() {
        return this.name;
    }

    public String getMove() {
        return this.move.toString();
    }
}
