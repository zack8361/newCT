package danawa;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if(a == 0){
                deque.pollLast();
            }
            else {
                deque.addLast(a);
            }
        }
        for (int i : deque) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
