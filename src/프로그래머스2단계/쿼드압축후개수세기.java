package 프로그래머스2단계;

import java.util.Arrays;
import java.util.HashMap;

public class 쿼드압축후개수세기 {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}};
        System.out.println(solution(arr));
    }

    private static int[] solution(int[][] arr) {


        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }


        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i+=2) {
            for (int j = 0; j < arr.length; j+=2) {
                if(arr[i][j] == 1 && arr[i][j] == arr[i][j+1] && arr[i][j] == arr[i+1][j] && arr[i][j] == arr[i+1][j+1]){
                    arr[i][j] = -2;
                    arr[i][j+1] = -2;
                    arr[i+1][j] = -2;
                    arr[i+1][j+1] = -2;
                }
                else if(arr[i][j] == 0 && arr[i][j] == arr[i][j+1] && arr[i][j] == arr[i+1][j] && arr[i][j] == arr[i+1][j+1]){
                    arr[i][j] = -1;
                    arr[i][j+1] = -1;
                    arr[i+1][j] = -1;
                    arr[i+1][j+1] = -1;
                }
            }
        }

        int zeroCnt = 0;
        int zeroMinusCnt = 0;
        int oneCnt = 0;
        int oneMinusCnt = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] == 1){
                    oneCnt++;
                }
                else if(arr[i][j] == 0 ){
                    zeroCnt++;
                }
                else if(arr[i][j] == -1){
                    zeroMinusCnt++;
                }
                else if(arr[i][j] == -2){
                    oneMinusCnt++;
                }
            }
        }


        System.out.println("zeroCnt = " + zeroCnt);
        System.out.println("oneCnt = " + oneCnt);

        return new int[0];
    }
}
