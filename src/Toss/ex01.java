package Toss;

import java.util.Arrays;
import java.util.HashSet;

public class ex01 {

    private static boolean[] visited;
    private static HashSet<String> realAns;
    public static void main(String[] args) {
        String s = "313253123";
        int N = 3;
        System.out.println(solution(s,N));
    }

    private static int solution(String s, int N) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(Integer.parseInt(String.valueOf(s.charAt(i))) <= N){
                set.add(Integer.parseInt(String.valueOf(s.charAt(i))));
            }
        }
        if(set.size()<N){
            return -1;
        }
        realAns = new HashSet<>();
        String ans = "";
        int[] arr = new int[set.size()];
        int a = 0;
        for (int i : set) {
            ans+=String.valueOf(i);
            arr[a++] = i;
        }
        visited = new boolean[arr.length];

        for (int i = 0; i < ans.length(); i++) {
            if(!visited[i]){
                dfs(i,s,String.valueOf(ans.charAt(i)),ans);
                visited[i] = false;
            }
        }

        int max = Integer.MIN_VALUE;
        for (String realAn : realAns) {
            if(s.contains(realAn)){
                if(max< Integer.parseInt(realAn)){
                    max = Integer.parseInt(realAn);
                }
            }
        }
        System.out.println("max = " + max);
        return 0;
    }

    private static void dfs(int now, String s, String answer, String ans) {
        visited[now] = true;

        if(answer.length() == ans.length()){
            realAns.add(answer);
            return;
        }
        for (int i = 0; i < ans.length(); i++) {
            if(!visited[i]){
                visited[i] = true;
                dfs(now,s,answer+ans.charAt(i),ans);
                visited[i] = false;
            }
        }
    }
}
