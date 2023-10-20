package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class Inputview {

    public static void gameStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static List<Integer> input() {
        System.out.print("숫자를 입력해주세요: ");
        String inputString = Console.readLine();

        if (inputString.length() != 3) {
            throw new IllegalArgumentException("잘못된 값을 입력하셨습니다.");
        }

        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            char charDigit = inputString.charAt(i);
            int intDigit = Character.getNumericValue(charDigit);
            numberList.add(intDigit);
        }

        return numberList;
    }

    public static String reStart() {
        System.out.println("게임을 새로 시작할면 1, 종료하려면 2를 입력하세요.");
        String inputString = Console.readLine();
        return inputString;
    }

}
