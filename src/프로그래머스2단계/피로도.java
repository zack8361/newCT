package 프로그래머스2단계;

public class 피로도 {

    private static boolean[] visited;
    private static int ans;
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        System.out.println(solution(k,dungeons));
    }

    private static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(dungeons,k,0);

        return ans;
    }

    private static void dfs(int[][] dungeons, int k,int depth) {

        ans = Math.max(ans,depth);

        for (int i = 0; i < dungeons.length; i++) {
            if(!visited[i] && k>=dungeons[i][0]){
                visited[i] = true;
                dfs(dungeons,k-dungeons[i][1],depth+1);
                visited[i] = false;
            }
        }
        
    }
}
