package 프로그래머스2단계;

import java.util.Arrays;

public class 큰수만들기 {

    private static int max = Integer.MIN_VALUE;
    private static boolean[] visited;
    public static void main(String[] args) {
        String number = "1231234";
        int k = 3;
        System.out.println(solution(number,k));
    }

    private static String solution(String number, int k) {
        int cnt = number.length()-k;

        visited = new boolean[number.length()];
        for (int i = 0; i < cnt; i++) {
            if(!visited[i]){
                visited[i] = true;
                dfs(number,i,String.valueOf(number.charAt(i)),cnt);
            }
        }


        return String.valueOf(max);

    }

    private static void dfs(String number, int now, String s, int cnt) {

        if(s.length() == cnt){
            max = Math.max(max,Integer.parseInt(s));
            return;
        }

        for (int i = now+1; i < number.length(); i++) {
            dfs(number,i,s+number.charAt(i),cnt);
        }
    }
}
