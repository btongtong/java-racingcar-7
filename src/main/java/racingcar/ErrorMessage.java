package racingcar;

public enum ErrorMessage {
    NAME_FORMAT_ERROR("자동차 이름은 5글자 이하이고 쉼표(,)로 구분합니다."),
    CONDUCT_COUNT_FORMAT_ERROR("실행 횟수는 " + Integer.MIN_VALUE + " 이상" + Integer.MAX_VALUE + "이하의 값입니다.");

    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}