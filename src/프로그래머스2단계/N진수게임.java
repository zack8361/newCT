package 프로그래머스2단계;

public class N진수게임 {
    public static void main(String[] args) {
        // 구해야할 튜브의 갯수 t
        // n = 진법
        // 게임에 참가하는 인원 = m;
        // 튜부의 순서 = p
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 2;
        System.out.println(solution(n,t,m,p));
    }

    private static String solution(int n, int t, int m, int p) {

        String ans = "";
        String answer = "";


//        0,2,4,6,8
        for (int i = 0; i < t*m; i++) {
            if(i%2 == p-1){
                System.out.println("i = " + i);
                ans = Integer.toString(i,n);
                System.out.println(ans);
            }
        }
        return answer.toUpperCase();
    }
}
