package 프로그래머스2단계;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 연속된부분수열의합 {

    public static void main(String[] args) {
        int[] sequence = {2,2,2,2,2};
        int k = 6;
        System.out.println(solution(sequence,k));
    }

    private static int[] solution(int[] sequence, int k) {
        int[] arr = new int[2];

        int[] newSeq = new int[sequence.length+1];
        newSeq[1] = sequence[0];
        for (int i = 2; i < newSeq.length; i++) {
            newSeq[i] = newSeq[i-1]+sequence[i-1];
        }

        for (int i = 1; i < newSeq.length; i++) {
            boolean flag = false;
            for (int j = i+1; j <newSeq.length; j++) {
                if(newSeq[j] - newSeq[i] == k){
                    arr[0] = i-1;
                    arr[1] = j-2;
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
