package SkillTestLv3;

public class 삼각형꼭데기 {
    private static int max = Integer.MIN_VALUE;
    private static int[] arr;
    public static void main(String[] args) {
        int[][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
        System.out.println(solution(triangle));
    }

    private static int solution(int[][] triangle) {

        arr = new int[triangle.length];
        dfs(triangle,0,0,0);
        return max;
    }

    private static void dfs(int[][] triangle, int sum,int cnt,int now) {

        if (cnt == triangle.length){
            max = Math.max(max,sum);
            return;
        }
        dfs(triangle,sum + triangle[cnt][now],cnt+1,now);
        dfs(triangle,sum + triangle[cnt][now],cnt+1,now+1);
    }
}
