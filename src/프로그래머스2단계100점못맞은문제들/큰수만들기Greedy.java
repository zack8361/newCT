package 프로그래머스2단계100점못맞은문제들;

public class 큰수만들기Greedy {
    public static void main(String[] args) {
        String number = "4177252841";
        int k = 4;
        System.out.println(solution(number,k));
    }

    private static String solution(String number, int k) {
        String answer = "";
        String[] str = number.split("");
        int cn = number.length()-k;
        int round = number.length()-cn+1;
        System.out.println(cn);
        System.out.println(round);
        return answer;
    }
}
