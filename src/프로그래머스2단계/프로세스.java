package 프로그래머스2단계;

import java.util.*;

public class 프로세스 {

    public static void main(String[] args) {
        int[] priorities = {2,1,3,2};
        int location = 2;

        System.out.println(solution(priorities,location));
    }

    private static int solution(int[] priorities, int location) {

        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }

        while (!pq.isEmpty()){
            for (int i = 0; i < priorities.length; i++) {
                if(priorities[i] == pq.peek()){
                    pq.poll();
                    answer++;
                    if(i == location){
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}
