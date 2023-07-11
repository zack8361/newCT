package 프로그래머스2단계;

import java.util.HashMap;

public class 할인행사 {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3,2,2,2,1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(want,number,discount));
    }

    private static int solution(String[] want, int[] number, String[] discount) {

        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i],number[i]);
        }


        int re = discount.length-10;
        int a = 1;
        int answer = 0;
        HashMap<String,Integer> ans = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            if(ans.get(discount[i]) == null){
                ans.put(discount[i],1);
            }
            else {
                ans.put(discount[i],ans.get(discount[i])+1);
            }
        }
        if(map.equals(ans)){
            answer++;
        }
        for (int i = 0; i < discount.length-10; i++) {
            boolean flag = false;
            HashMap<String ,Integer> map1 = new HashMap<>();
            for (int j = a; j < discount.length-re+a; j++) {
                if(map1.get(discount[j]) == null){
                    map1.put(discount[j],1);
                }
                else {
                    map1.put(discount[j],map1.get(discount[j])+1);
                }
            }
            if(map1.equals(map)){
                answer++;
            }
            System.out.println("map1 = " + map1);
            a++;
        }
        return answer;
    }
}
