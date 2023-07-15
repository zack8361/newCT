package 프로그래머스2단계;

public class 숫자변환하기 {

    private static int cnt = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int n = 4;
        System.out.println(solution(x,y,n));
    }

    private static int solution(int x, int y, int n) {

        dfs(x,y,n,0,0);


        if(cnt == 0){
            return 0;
        }
        if(cnt == Integer.MAX_VALUE){
            return -1;
        }
        return cnt;
    }

    private static void dfs(int x, int y, int n, int sum,int count) {
        System.out.println("sum = " + sum);
        if(sum>=y) {
            if (sum == y) {
                cnt = Math.min(cnt, count);
            }
            return;
        }

        dfs(x,y,n,sum+x+n,count+1);
        dfs(x,y,n,sum+(x*2),count+1);
        dfs(x,y,n,sum+(x*3),count+1);
    }
}
