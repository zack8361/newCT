package Toss;

import java.util.HashSet;

public class ex02 {

    private static boolean[] visited;
    private static HashSet<Integer> set;
    public static void main(String[] args) {
        int[][] relationships = {{1,2},{2,3},{2,6},{3,4},{4,5}};
        int target = 2;
        int limit = 3;
        System.out.println(solution(relationships,target,limit));
    }

    private static int solution(int[][] relationships, int target, int limit) {
        int ans = 0;

        visited = new boolean[relationships.length];
        set = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < relationships.length; i++) {
            if(relationships[i][0] == target || relationships[i][1] == target){
                cnt++;
            }
        }
        ans = cnt * 5;


        return 0;
    }

}
