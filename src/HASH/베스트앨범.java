package HASH;

import java.util.HashMap;

public class 베스트앨범 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] players = {500, 600, 150, 800, 2500};
        System.out.println(solution(genres,players));
    }

    private static int[] solution(String[] genres, int[] players) {
        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            if(map.get(genres[i]) == null){
                map.put(genres[i],players[i]);
            }
            else {
                map.put(genres[i],map.get(genres[i]) + players[i]);
            }
        }
        for (int i = 0; i < players.length; i++) {

        }

        int[] answer = new int[map.size()*2];


        return new int[0];
    }
}
