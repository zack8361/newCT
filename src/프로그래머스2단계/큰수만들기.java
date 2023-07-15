package 프로그래머스2단계;

import java.util.Arrays;

public class 큰수만들기 {

    private static boolean[] visited;
    public static void main(String[] args) {
        String number = "1231234";
        int k = 3;
        System.out.println(solution(number,k));
    }

    private static String solution(String number, int k) {

        visited = new boolean[number.length()];
        int cnt = number.length()-k;
        dfs(cnt,"",number,0);
        return null;
    }

    private static void dfs(int cnt, String s, String number,int now) {

        if(s.length() == cnt){
            System.out.println("s = " + s);
            return;
        }
        for (int i = now; i < number.length(); i++) {
            dfs(cnt, s + String.valueOf(number.charAt(i)), number,now+1);
        }
    }
}
