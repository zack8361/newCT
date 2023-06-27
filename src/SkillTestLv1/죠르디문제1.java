package SkillTestLv1;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 죠르디문제1 {
    private static int cnt;
    private static ArrayDeque<Integer> deque = new ArrayDeque<>();
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board,moves));
    }

    private static int solution(int[][] board, int[] moves) {

        for (int i = 0; i < moves.length; i++) {
            moves[i] = moves[i]-1;
        }

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[j][moves[i]] != 0){
                    check(board[j][moves[i]]);
                    board[j][moves[i]] = 0;
                    break;
                }
                else {
                    continue;
                }
            }
        }


        return cnt*2;
    }

    private static void check(int num) {

        if(deque.isEmpty()){
            deque.addLast(num);
        }
        else {
            if(deque.peekLast() == num){
                deque.pollLast();
                cnt++;
            }
            else {
                deque.addLast(num);
            }
        }
    }
}
