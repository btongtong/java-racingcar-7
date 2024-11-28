package racingcar;

public class Application {
    private static final InputView inputView;
    private static final OutputView outputView;

    static {
        inputView = new InputView();
        outputView = new OutputView();
    }

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Racing racing = new Racing(getName(inputView.receiveCarName()));
        int conductCount = getConductCount(inputView.receiveConductCount());
        race(conductCount, racing);
        outputView.printFinalWinner(racing.getWinners());
    }

    private static String getName(String input) {
        Validation.validateNameFormat(input);
        Validation.validateDuplicationName(input);
        return input;
    }

    private static int getConductCount(String input) {
        Validation.validateConductCountFormat(input);
        Validation.validateNumberFormat(input);
        return Integer.parseInt(input);
    }

    private static void race(int conductCount, Racing racing) {
        outputView.printResultTitle();
        while(conductCount-- > 0) {
            racing.moveCars();
            outputView.printResult(racing.getCars());
        }
    }
}
