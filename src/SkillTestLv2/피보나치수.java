package SkillTestLv2;

import java.util.Arrays;

public class 피보나치수 {
    public static void main(String[] args) {
        int n= 5;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[arr.length-1];
    }
}
