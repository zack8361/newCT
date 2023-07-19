package 프로그래머스2단계;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 메뉴리뉴얼 {
    private static ArrayList<String> list;
    public static void main(String[] args) {
        String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int[] course = {2,3,5};
        System.out.println(solution(orders,course));
    }

    private static String[] solution(String[] orders, int[] course) {

        HashMap<String,Integer> map = new HashMap<>();
        list = new ArrayList<>();
        for (int i = 0; i < orders.length; i++) {
            map.put(orders[i],1);
        }


        for(int i=0; i<course.length; i++){
            int size = course[i];
            for (String s : map.keySet()) {
                if(s.length() == size){

                }
            }
        }


        Collections.sort(list);

        return null;
    }
}
