package 투포인터;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < M; i++) {
            sum += arr[i];
        }
        int answer = sum;


        int left = 0;
        int right = M;

        while (right<N){
            sum += arr[right++];
            sum -= arr[left++];
            answer = Math.max(answer,sum);
        }
        System.out.println("answer = " + answer);

    }
}
