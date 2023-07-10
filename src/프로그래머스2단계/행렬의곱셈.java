package 프로그래머스2단계;

import java.util.Arrays;

public class 행렬의곱셈 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,4},{3,2},{4,1}};
        int[][] arr2 = {{3,3},{3,3}};
        System.out.println(solution(arr1,arr2));
    }

    private static int[][] solution(int[][] arr1, int[][] arr2) {
        int N = arr1.length;
        int M = arr2.length;
        int[][] arr;
        if(N>M){
            arr = new int[N][arr1[0].length];
        }
        else {
            arr = new int[M][arr2[0].length];
        }



        for (int i = 0; i < arr1.length; i++) {
            int num = 0;
            for (int j = 0; j < arr2.length; j++) {
                a
            }
        }
        return new int[0][0];
    }
}
