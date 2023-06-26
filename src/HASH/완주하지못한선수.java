package HASH;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant ={"leo","kiki","eden"};
        String[] completion = {"eden","kiki"};
        System.out.println(solution(participant,completion));
    }

    private static String solution(String[] participant, String[] completion) {
        HashMap<String , Integer> map = new HashMap<>();

        // 참가자 -> 중복처리도 = Cnt + 1
        for (int i = 0; i < participant.length; i++) {
            if(map.get(participant[i]) == null){
                map.put(participant[i],1);
            }
            else {
                map.put(participant[i],map.get(participant[i]) + 1);
            }
        }

        for (int i = 0; i < completion.length; i++) {
            if(map.containsKey(completion[i])){
                map.put(completion[i],map.get(completion[i])-1);
            }
        }

        for (String s : map.keySet()) {
            if(map.get(s) != 0){
                return s;
            }
        }

        return null;
    }
}
