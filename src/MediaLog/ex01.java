package MediaLog;

import java.util.HashMap;

public class ex01 {
    public static void main(String[] args) {
        String vote = "ABBCCCBBAB";
        System.out.println(solution(vote));
    }

    private static String solution(String vote) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < vote.length(); i++) {
            if(map.get(vote.charAt(i)) == null){
                map.put(vote.charAt(i),1);
            }
            else {
                map.put(vote.charAt(i),map.get(vote.charAt(i)) + 1);
            }
        }

        int max = Integer.MIN_VALUE;
        String answer = "";

        for (Character c : map.keySet()) {
            if(max<map.get(c)){
                max = map.get(c);
            }
        }

        for (Character c : map.keySet()) {
            if(map.get(c) == max){
                answer+=c;
            }
        }
        return answer;
    }
}
