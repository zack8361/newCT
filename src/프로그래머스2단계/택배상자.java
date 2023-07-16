package 프로그래머스2단계;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 택배상자 {
    public static void main(String[] args) {
        int[] order = {4,3,1,2,5};
        System.out.println(solution(order));
    }

    private static int solution(int[] order) {
        int answer= 0;

        // 1,2,3,4,5
        int[] arr = order.clone();
        Arrays.sort(order);
        // order = 4,3,1,2,5
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> container = new ArrayList<>();

        int a = 0;
        while (true){
            stack.push(order[a]);
            a++;

            break;
        }

        return answer;
    }
}
