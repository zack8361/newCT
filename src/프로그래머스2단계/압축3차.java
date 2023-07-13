package 프로그래머스2단계;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 압축3차 {
    public static void main(String[] args) {
        String msg ="KAKAO";
        System.out.println(solution(msg));
    }

    private static int[] solution(String msg) {
        int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        String[] alp = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        HashMap<String ,Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            map.put(alp[i],num[i]);
        }

        HashSet<String > set = new HashSet<>();
        for (int i = 0; i < msg.length(); i++) {
            if(map.containsKey(String.valueOf(msg.charAt(i)))){
                set.add(String.valueOf(map.get(String.valueOf(msg.charAt(i)))));
            }
        }

        
        for (int i = 0; i < msg.length(); i++) {
            ArrayList<String> list = new ArrayList<>();
            String word = String.valueOf(msg.charAt(i));
            for (int j = i+1; j < msg.length(); j++) {
                word += msg.charAt(j);
                list.add(word);
                System.out.println("word = " + word);
            }
            System.out.println("list = " + list);
        }
        return new int[0];
    }
}
