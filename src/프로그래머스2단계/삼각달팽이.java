package 프로그래머스2단계;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class 삼각달팽이 {

    private static int[] dx = {1,0,-1};
    private static int[] dy = {-1,1,0};
    public static void main(String[] args) {
        int n = 6;
        System.out.println(solution(n));
    }

    private static class Node {
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int[] solution(int n)
    {
        int[][] arr = new int[n][n];
        int num = n * (n+1) /2;

        int x = 0;
        int y = n-1;
        int dir = 0;
        boolean[][]visited = new boolean[n][n];
        for (int i = 1; i <= num; i++) {
            arr[x][y] = i;
            visited[x][y] = true;
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if(nx<0 || ny<0 || nx>=n || ny>=n || visited[nx][ny]){
                dir = (dir+1) % 3;
            }
            x = x + dx[dir];
            y = y + dy[dir];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]  != 0){
                    list.add(arr[i][j]);
                }
            }
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
