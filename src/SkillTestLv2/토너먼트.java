package SkillTestLv2;

public class 토너먼트 {
    public static void main(String[] args) {
        int N = 8;
        int A = 4;
        int B = 7;
        System.out.println(solution(N,A,B));
    }

    private static int solution(int n, int a, int b) {
        int ans =0;
        System.out.println();
        ans ++;
        if(ans>1){
            return -1;
        }
        else {
            while (a != b) {
                a = (a / 2) + (a % 2);
                b = (b / 2) + (b % 2);
                ans++;
            }
        }
        return ans;
    }
}
