package 프로그래머스3단계;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 보석쇼핑 {
    public static void main(String[] args) {
        String[] gems = {"ZZZ", "YYY", "NNNN", "YYY", "BBB"};
        System.out.println(solution(gems));
    }

    private static int[] solution(String[] gems) {

        HashMap<String ,Integer> map = new HashMap<>();

        for(String gem : gems){
            map.put(gem,0);
        }

        int left = 0;
        int right = 0;

        int min = gems.length;

        int start = 1;
        int end = gems.length;

        int size = map.size();
        map = new HashMap<>();

        System.out.println("map = " + map);
        while (right<gems.length){
            if(map.containsKey(gems[right])){
                map.put(gems[right], map.get(gems[right]) + 1);
            }
            else {
                map.put(gems[right],1);
            }
            right+=1;
            while (map.size() == size){
                if(right - left < min){
                    min = right - left;
                    start = left + 1;
                    end = right;
                    System.out.println("sex");
                }

                if(map.get(gems[left]) == 1){
                    map.remove(gems[left]);
                }
                else {
                    map.put(gems[left], map.get(gems[left])-1);
                }
                left+=1;
            }
        }

        int[] answer = new int[2];
        answer[0] =start;
        answer[1] = end;

        return answer;
    }
}
