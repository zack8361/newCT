package danawa;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int i = 0;
        int answer = 0;
        while (sum<N){
            i++;
            sum += i;
            answer = i;
        }
        System.out.println(answer);
    }
}
