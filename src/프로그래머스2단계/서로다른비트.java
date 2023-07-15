package 프로그래머스2단계;

import java.util.ArrayList;
import java.util.Arrays;

public class 서로다른비트 {
    public static void main(String[] args) {
        long[] numbers = {2,7};
        System.out.println(solution(numbers));
    }

    private static long[] solution(long[] numbers) {
        ArrayList<Long> list = new ArrayList<>();

        long a = 0;
        for (int i = 0; i < numbers.length; i++) {
            long num = numbers[i];
            String ans = Integer.toString(Integer.parseInt(String.valueOf(num)),2);

            while (true) {
                long cnt = 0;
                num+=1;
                String numeric = Long.toString(num,2);
                if(numeric.length() > ans.length()){
                    while (numeric.length() != ans.length()){
                        ans = "0" + ans;
                    }
                }
                for (int j = 0; j < ans.length(); j++) {
                    if(ans.charAt(j) != numeric.charAt(j)){
                        cnt++;
                    }
                }
                if(cnt == 1 || cnt == 2) {
                    list.add(num);
                    break;
                }
            }
        }

        long[] answer = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
