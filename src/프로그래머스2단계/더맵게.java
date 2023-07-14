package 프로그래머스2단계;

import java.util.PriorityQueue;

public class 더맵게 {

    private static int answer;
    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int k = 7;
        System.out.println(solution(scoville,k));
    }

    private static int solution(int[] scoville, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }

        if(pq.isEmpty()){
            return -1;
        }
        while (true){

            if(pq.peek() >= k){
                break;
            }
            else {
                try {
                    int first = pq.poll();
                    int second = pq.poll();
                    int ans = first + (second * 2);
                    pq.add(ans);
                    answer++;
                }
                catch (Exception e){
                    return -1;
                }
            }
        }

        return answer;
    }
}
