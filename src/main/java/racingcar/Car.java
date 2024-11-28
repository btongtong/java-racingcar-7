package racingcar;

public class Car {
    private static final String MOVE_SIGN = "-";
    private String name;
    private StringBuilder move;

    public Car(String name) {
        this.name = name;
        this.move = new StringBuilder();
    }

    public void move() {
        this.move.append(MOVE_SIGN);
    }
}
