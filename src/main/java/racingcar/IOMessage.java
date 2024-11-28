package racingcar;

public enum IOMessage {
    CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    CONDUCT_COUNT("시도할 횟수는 몇 회인가요?"),
    RESULT_TITLE("실행 결과"),
    RESULT_CONTENT("%s : %s"),
    FINAL_WINNER("최종 우승자 : %s");

    private String message;

    IOMessage(String message) {
        this.message = message;
    }

    public String getMessage(Object... args) {
        return String.format(this.message, args);
    }
}
