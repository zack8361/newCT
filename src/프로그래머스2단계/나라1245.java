package 프로그래머스2단계;

public class 나라1245 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(solution(n));
    }

    private static String solution(int n) {

        if(n%3 ==0 ) {
            String str = Integer.toString(n,3);
            System.out.println("str = " + str);
        }
        else {
            return Integer.toString(n, 3);
        }
        return null;
    }
}
