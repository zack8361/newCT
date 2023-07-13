package 프로그래머스2단계;

import java.util.Arrays;
import java.util.HashMap;

public class 뉴스클러스터링 {
    public static void main(String[] args) {
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";
        System.out.println(solution(str1,str2));
    }

    private static int solution(String str1, String str2) {

        HashMap<String ,Integer> map = new HashMap<>();
        HashMap<String ,Integer> map1 = new HashMap<>();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length()-2+1; i++) {
            String ans = "";
            for (int j = i; j <2+i; j++) {
                ans+=str1.charAt(j);
            }
            if(!Character.isAlphabetic(ans.charAt(0)) || !Character.isAlphabetic(ans.charAt(1))){
                continue;
            }
            else {
                if (map.get(ans) == null) {
                    map.put(ans, 1);
                } else {
                    map.put(ans, map.get(ans) + 1);
                }
            }
        }

        for (int i = 0; i < str2.length()-2+1; i++) {
            String ans = "";
            for (int j = i; j <2+i; j++) {
                ans+=str2.charAt(j);
            }
            if(!Character.isAlphabetic(ans.charAt(0)) || !Character.isAlphabetic(ans.charAt(1))){
                continue;
            }
            if(map1.get(ans) == null){
                map1.put(ans,1);
            }else {
                map1.put(ans,map1.get(ans) + 1);
            }
        }

        System.out.println("map = " + map);
        System.out.println("map1 = " + map1);
        
        double k =  0;
        double h = 0;


        for (String s : map1.keySet()) {
            double kyo = 0;
            if(map.containsKey(s)){
                kyo++;
                k +=kyo;
                map1.put(s,1);
            }
            else {
                map.put(s,1);
            }
        }


        h = map.size();

        if(h==0 && k==0){
            return 65336;
        }

        double midAns = ((k/h) * 65536);


        return (int) midAns;
    }
}
