package 프로그래머스2단계100점못맞은문제들;

import java.util.HashMap;

public class 뉴스클러스터링 {
    public static void main(String[] args) {
        String str1 = "abab";
        String str2 = "baba";
        System.out.println(solution(str1,str2));
    }

    private static int solution(String str1, String str2) {
        double ans = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();


        for (int i = 0; i < str1.length()-2+1; i++) {
            String s = str1.substring(i,i+2);
            String word = "";
            for (int j = 0; j < s.length(); j++) {
                if(Character.isAlphabetic(s.charAt(j))){
                    word+=s.charAt(j);
                }
                else {
                    continue;
                }
            }
            if(word.length() == 2){
                if(map.get(word) == null){
                    map.put(word,1);
                }
                else {
                    map.put(word,map.get(word) + 1);
                }
            }
        }


        for (int i = 0; i < str2.length()-2+1; i++) {
            String s = str2.substring(i,i+2);
            String word = "";
            for (int j = 0; j < s.length(); j++) {
                if(Character.isAlphabetic(s.charAt(j))){
                    word+=s.charAt(j);
                }
                else {
                    continue;
                }
            }
            if(word.length() == 2){
                if(map2.get(word) == null){
                    map2.put(word,1);
                }
                else {
                    map2.put(word,map2.get(word) + 1);
                }
            }
        }

        double kyo = 0;
        double hab = 0;
        for (String s : map.keySet()) {
            if(map2.containsKey(s)){
                 int min = Math.min(map.get(s),map2.get(s));
                 kyo += min;
                 map2.put(s,Math.max(map.get(s),map2.get(s)));
            }
            else {
                map2.put(s,map.get(s));
            }
        }


        for (String s : map2.keySet()) {
            hab+=map2.get(s);
        }
        if(hab==0 && kyo==0){
            return 65536;
        }

        ans = (kyo/hab) * 65536;

        return (int) ans;
    }
}
