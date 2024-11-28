package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String receiveCarName() {
        System.out.println(IOMessage.CAR_NAME.getMessage());
        return Console.readLine();
    }

    public String receiveConductCount() {
        System.out.println(IOMessage.CONDUCT_COUNT.getMessage());
        return Console.readLine();
    }
}
