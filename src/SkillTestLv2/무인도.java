package SkillTestLv2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class 무인도 {
    private static int[] dx = {0,0,1,-1};
    private static int[] dy = {1,-1,0,0};
    public static void main(String[] args) {
        String[] maps = {"X591X","X1X5X","X231X", "1XXX1"};
        System.out.println(solution(maps));
    }


    private static class Node{
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int[] solution(String[] maps) {

        String[][] map = new String[maps.length][maps[0].length()];
        boolean[][] visited = new boolean[map.length][map[0].length];
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                map[i][j] = String.valueOf(maps[i].charAt(j));
            }
        }

        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
        ArrayDeque<Node> deque = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(!map[i][j].equals("X") && !visited[i][j]){
                    int count = Integer.parseInt(map[i][j]);
                    visited[i][j] = true;
                    deque.addLast(new Node(i,j));
                    while (!deque.isEmpty()){
                        Node now = deque.pollFirst();
                        for (int k = 0; k < 4; k++) {
                            int nx = now.x + dx[k];
                            int ny = now.y + dy[k];
                            if(nx<0 || ny<0 || nx>=map.length || ny>=map[0].length ){
                                continue;
                            }
                            if(!visited[nx][ny] && !map[nx][ny].equals("X")){
                                System.out.println("count = " + count);
                                count+=Integer.parseInt(map[nx][ny]);
                                visited[nx][ny] = true;
                                deque.addLast(new Node(nx,ny));

                            }
                        }
                    }
                    list.add(count);
                }
            }
        }

        System.out.println("list = " + list);

        int[] noList = {-1};

        if(list.size() == 0){
            return noList;
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}
