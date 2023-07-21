package SkillTestLv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 숫자짝궁 {
    public static void main(String[] args) {
        String X = "100";
        String Y = "2345";
        System.out.println(solution(X,Y));
    }

    private static String solution(String x, String y) {
        String realAns = "";
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < x.length(); i++) {
            if(map.containsKey(x.charAt(i))){
                map.put(x.charAt(i),map.get(x.charAt(i)) + 1);
            }
            else {
                map.put(x.charAt(i),1);
            }
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < y.length(); i++) {
            if(map.containsKey(y.charAt(i)) && map.get(y.charAt(i)) != 0){
                list.add(String.valueOf(y.charAt(i)));
            }
            else {
                continue;
            }
        }

        if(list.isEmpty()){
            return "-1";
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        sb = sb.reverse();

        if(sb.charAt(0) == '0'){
            return "0";
        }

        return String.valueOf(sb);
    }
}
