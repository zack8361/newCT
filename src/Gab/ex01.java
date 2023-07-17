package Gab;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ex01 {
    public static void main(String[] args) {
        int k = 3;
        String[] user_scores = {"alex111 100", "cheries2 200", "alex111 200", "cheries2 150","coco 50","coco 200"};
        System.out.println(solution(k,user_scores));
    }

    private static int solution(int k, String[] userScores) {
        int cnt = 0;

        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            String[] str = userScores[i].split(" ");
            if(map.isEmpty()){
                map.put(str[0],Integer.parseInt(str[1]));
            }
            else {
                if(map.get(str[0]) == null){
                    map.put(str[0], Integer.parseInt(str[1]));
                    cnt++;
                }
                else {
                    if(map.get(str[0]) >= Integer.parseInt(str[1])){
                        continue;
                    }
                    else {
                        map.put(str[0],Integer.parseInt(str[1]));
                        cnt++;
                    }
                }
            }
        }
        System.out.println("map = " + map);

        for (int i = k; i < userScores.length; i++) {
            String[] str = userScores[i].split(" ");
            if(map.get(str[0]) == null) {
                if (map.size() < k) {
                    map.put(str[0],Integer.parseInt(str[1]));
                } else {
                    for (String s : map.keySet()) {
                        if (map.get(s) < Integer.parseInt(str[1])) {
                            map.remove(s);
                            cnt++;
                            map.put(str[0], Integer.parseInt(str[1]));
                        }
                    }
                }
            }
            else {
                if(map.get(str[0]) < Integer.parseInt(str[1])){
                    map.put(str[0],Integer.parseInt(str[1]));
                    cnt++;
                }
                else {
                    continue;
                }
            }
        }

        System.out.println("cnt = " + cnt);
        System.out.println("map = " + map);

        return cnt;
    }
}
