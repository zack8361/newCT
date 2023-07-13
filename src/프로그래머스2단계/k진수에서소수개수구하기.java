package 프로그래머스2단계;

public class k진수에서소수개수구하기 {
    private static int cnt;
    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        System.out.println(solution(n,k));
    }

    private static int solution(int n, int k) {

        String newNum = (Long.toString(n,k));
        String[] str = newNum.split("0");

        for (int i = 0; i < str.length; i++) {
            if(str[i].equals("")){
                continue;
            }
            else {
                if (isPrime(Long.parseLong(str[i]))) {
                    cnt++;
                } else {
                    continue;
                }
            }
        }

        return cnt;
    }

    private static boolean isPrime(Long s) {
        if(s == 1){
            return false;
        }
        else {
            for (long i = 2; i < s; i++) {
                if(s%i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
