package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Random {
    private static final int START = 0;
    private static final int END = 9;

    public static int getRandomNumber() {
        return Randoms.pickNumberInRange(START, END);
    }

    public static boolean isParamOrMore(int randomNumber, int criteria) {
        return randomNumber >= criteria;
    }
}
