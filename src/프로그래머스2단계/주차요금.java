package 프로그래머스2단계;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class 주차요금 {
    public static void main(String[] args) throws ParseException {
        int[] fees = {180,5000,10,600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(solution(fees,records));
    }

    private static int[] solution(int[] fees, String[] records) throws ParseException {

        int commonTime = fees[0];
        int commonPrice = fees[1];
        int time = fees[2];
        int price = fees[3];


        HashMap<String, String > map = new HashMap<>();

        HashMap<String ,String > map1 = new HashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        PriorityQueue<String> pq = new PriorityQueue<>();
        int[] answer = {};
        for (int i = 0; i < records.length; i++) {
            String[] str = records[i].split(" ");
            if(map.get(str[1]) == null){
                if(!pq.contains(str[1])) {
                    pq.add(str[1]);
                }
                map.put(str[1],str[0] + " " + str[2]);
            }
            else {
                Date date1 = sdf.parse(str[0]);
                Date date2 = sdf.parse(map.get(str[1]).substring(0, 5));
                long time1 = date1.getTime();
                long time2 = date2.getTime();
                long diff = time1 - time2;
                diff = diff / (1000 * 60);

                if(map1.get(str[1]) == null) {
                    map1.put(str[1], String.valueOf(diff));
                }
                else {
                    map1.put(str[1], String.valueOf(Long.parseLong(map1.get(str[1])) + Long.parseLong(String.valueOf(diff))));
                }
                map.remove(str[1]);
            }
        }

        int[] arr = new int[pq.size()];

        for (int i = 0; i < arr.length; i++) {
            if(map1.containsKey(pq.peek())){
                arr[i] = Integer.parseInt(map1.get(pq.peek()));
                pq.poll();
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("map1 = " + map1);
        
        System.out.println("map = " + map);
        
        return answer;
    }
}
