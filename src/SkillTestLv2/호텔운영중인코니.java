package SkillTestLv2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class 호텔운영중인코니 {
    public static void main(String[] args) {
        String[][] book_time = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
        System.out.println(solution(book_time));
    }

    private static int solution(String[][] book_time) {
        int answer = 0;
        Arrays.sort(book_time, Comparator.comparing((o1 -> (o1[0]))));

        return answer;
    }
}
