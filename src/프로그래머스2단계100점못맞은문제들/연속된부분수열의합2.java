package 프로그래머스2단계100점못맞은문제들;

import java.util.HashMap;
import java.util.Map;

public class 연속된부분수열의합2 {
    public static void main(String[] args) {
        int[] sequence = {1, 1, 1, 2, 3, 4, 5};
        int k = 5;
        System.out.println(solution(sequence,k));
    }

    private static int[] solution(int[] sequence, int k) {

        int left = 0;
        int right = 0;

        int start = 0;

        int end = sequence.length;

        HashMap<String,String> map = new HashMap<>();
        while (right<sequence.length){
            int sum = 0;
            String idx = "";
            String len = "";
            for (int i = left; i <= right; i++) {
                sum+=sequence[i];
                idx+=String.valueOf(i);
                len += String.valueOf(sequence[i]);
            }

            if(sum == k){
                map.put(len,idx);
            }

            if(sum<=k){
                right++;
            }
            else if(sum>k) {
                left++;
            }
        }

        int min = sequence.length;

        String ans = "";
        for (String s : map.keySet()) {
            if(min > s.length()){
                min = s.length();
                ans = map.get(s);
            }
        }


        int[] answer = new int[2];
        if(ans.length() == 1){
            answer[0] = Integer.parseInt(String.valueOf(ans.charAt(0)));
            answer[1] = Integer.parseInt(String.valueOf(ans.charAt(0)));
        }
        else {
            answer[0] = Integer.parseInt(String.valueOf(ans.charAt(0)));
            answer[1] = Integer.parseInt(String.valueOf(ans.charAt(1)));
        }
        return answer;
    }
}
