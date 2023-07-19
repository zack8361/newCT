package danawa;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();


        for (int i = 0; i < N; i++) {
            String st = sc.next();
//            Push
            if(st.equals("PUSH")){
                pq.add(sc.nextInt());
                int cnt = 0;
                int si = pq.size();
                int mid = 0;

                if(si % 2 == 0){
                    mid = si/2;
                }

                else if(si %2 != 0){
                    mid = (si+1)/2;
                }

                for (int j : pq) {
                    cnt++;
                    if(cnt == mid){
                        System.out.println(j);
                        break;
                    }
                }
            }
//            Pop
            else if(st.equals("POP")){
                int si = pq.size();
                int cnt = 0;
                int mid = 0;
                if(si%2 == 0){
                    mid = si/2;
                }
                else if(si%2 != 0){
                    mid = (si+1)/2;
                }
                int answer = 0;
                for (int j : pq) {
                    cnt++;
                    if(cnt == mid){
                        answer = j;
                    }
                }
                if(pq.contains(answer)){
                    pq.remove(answer);
                }
                cnt = 0;
                if(pq.isEmpty()){
                    System.out.println("NO ITEM");
                }
                else {
                    int size = pq.size();
                    if(size %2 == 0){
                        mid = size/2;
                    }
                    else {
                        mid = (size+1)/2;
                    }
                    for (int j : pq) {
                        cnt++;
                        if (cnt == mid) {
                            System.out.println(j);
                        }
                    }
                }
            }
//            size
            else {
                System.out.println(pq.size());
            }
        }

    }
}
