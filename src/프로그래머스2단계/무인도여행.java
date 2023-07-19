package 프로그래머스2단계;

import java.util.Arrays;

public class 무인도여행 {

    private static boolean[][] visited;

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

        visited = new boolean[map.length][map[0].length];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = String.valueOf(maps[i].charAt(j));
            }
        }

        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
        return new int[0];
    }
}
