package baseball.domain;

import java.util.List;

public class Judgement {
    public int correctCount(List<Integer> computer, List<Integer> player) {
        // 몇 개의 숫자가 같은지 확인한다.
        int result = 0;
        for (int i = 0; i < player.size(); i++) {
            int playerNumber = player.get(i);
            if (computer.contains(playerNumber)) {
                result++;
            }
        }
        return result;
    }

    public boolean hasPlace(List<Integer> computer, int place, int number) {
        return false;
    }


}
