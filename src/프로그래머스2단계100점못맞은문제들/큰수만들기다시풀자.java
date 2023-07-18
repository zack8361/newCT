package 프로그래머스2단계100점못맞은문제들;

public class 큰수만들기다시풀자 {
    public static void main(String[] args) {
        String number = "4177252841";
        int k = 4;
        System.out.println(solution(number,4));
    }

    private static String solution(String number, int k) {
        int num = number.length() - k;

        int index = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = index; j <= k+i; j++) {
                if(max<number.charAt(j) -'0'){
                    max = number.charAt(j)-'0';
                    index = j+1;
                }
            }
            sb.append(max);
        }

        return String.valueOf(sb);
    }
}
