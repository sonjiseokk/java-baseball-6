package baseball.config;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class InitRandomNum {
    List<Integer> computer = new ArrayList<>();

    public List<Integer> pick(){
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public void reset(){
        computer.clear();
    }


}