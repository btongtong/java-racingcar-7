package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Random {
    private static final int startNum = 0;
    private static final int endNum = 9;

    private static int getRandomNumber() {
        return Randoms.pickNumberInRange(startNum, endNum);
    }

    public static boolean isParamOrMore(int randomNumber, int criteria) {
        return randomNumber >= criteria;
    }
}
