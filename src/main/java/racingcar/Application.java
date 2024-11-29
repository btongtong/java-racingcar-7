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
        Racing racing = new Racing(inputView.receiveCarName());
        Round round = new Round(inputView.receiveConductCount());
        race(round, racing);
        outputView.printFinalWinner(racing.getWinners());
    }

    private static void race(Round round, Racing racing) {
        outputView.printResultTitle();
        while(round.isRemainConductCount()) {
            racing.moveCars();
            outputView.printResult(racing.getCars());
            round.reduceConductCount();
        }
    }
}
