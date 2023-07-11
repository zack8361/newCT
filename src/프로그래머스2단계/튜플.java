package 프로그래머스2단계;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 튜플 {
    public static void main(String[] args) {
        String s = "{{20,111},{111}}";
        System.out.println(solution(s));
    }

    private static int[] solution(String s) {
        String[] str = s.split(",");

        HashMap<String,Integer> map = new HashMap<>();
        
        for (int i = 0; i < str.length; i++) {
            String a = "";
            for (int j = 0; j < str[i].length(); j++) {
                if(str[i].charAt(j) != '{' && str[i].charAt(j) != '}'){
                    a+=str[i].charAt(j);
                }
            }
            if(map.get(a) == null){
                map.put(a,1);
            }
            else {
                map.put(a,map.get(a) + 1);
            }
        }

        int[] arr = new int[map.size()];
        int a = 0;
        while (!map.isEmpty()) {
            int max = Integer.MIN_VALUE;
            String s1 = "";
            for (String se : map.keySet()) {
                if(max<map.get(se)){
                    max = map.get(se);
                    s1 = se;
                }
            }
            arr[a++] = Integer.parseInt(s1);
            map.remove(s1,max);
        }

        return arr;
    }
}
