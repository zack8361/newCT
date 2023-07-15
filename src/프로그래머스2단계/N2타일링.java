package 프로그래머스2단계;

import java.util.Arrays;

public class N2타일링 {
    private static int ans;
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            arr[i] = arr[i] % 1000000007;
        }

        return arr[n-1];
    }
}
