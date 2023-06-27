package SkillTestLv2;

import java.util.ArrayDeque;
import java.util.Arrays;

public class LRURLURLUR {

    private static int cnt = 1;
    public static void main(String[] args) {
        String dirs = "LULLLLLLU";
        System.out.println(solution(dirs));
    }

    private static class Node {
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int solution(String dirs) {
        ArrayDeque<Node> deque = new ArrayDeque<>();
        int[][] maps = new int[22][22];
        boolean[][]visited = new boolean[22][22];
        maps[11][11] = 1;
        visited[11][11] = true;
        deque.addLast(new Node(11,11));


        for (int i = 0; i < dirs.length(); i++) {
            while (!deque.isEmpty()) {
                Node now = deque.pollFirst();
                int nx = now.x;
                int ny = now.y;
                int nx2 = now.x;
                int ny2 = now.y;


                System.out.println("nx = " + nx);
                System.out.println("ny = " + ny);
                if (dirs.charAt(i) == 'U') {
                    nx-=1;
                    nx2-=1;
                }
                else if (dirs.charAt(i) == 'L') {
                    ny-=1;
                    ny2-=2;
                }
                else if (dirs.charAt(i) == 'R') {
                    ny+=1;
                    ny2+=2;
                }
                else { // D
                    nx+=1;
                    nx2+=2;
                }
                if(nx2<0 || ny2<0 || nx2>=maps.length || ny2>=maps.length){
                    continue;
                }
                maps[nx][ny] = 2;
                maps[nx2][ny2] = 1;

                if(!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    cnt++;
                }

                deque.addLast(new Node(nx2,ny2));
                break;
            }
        }


        return cnt;
    }
}
