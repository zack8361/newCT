package MediaLog;

import java.util.HashSet;

public class ex03 {
    public static void main(String[] args) {

        String s = "abcabcabcd";
        System.out.println(solution(s));
    }

    private static int solution(String s) {

        int a = 1;
        int answer = 0;
        while (true){
            HashSet<String> set = new HashSet<>();

            if(s.length()% a == 0) {
                for (int i = 0; i < s.length(); i += a) {
                    String ans = "";
                    for (int j = i; j < a + i; j++) {
                        ans += s.charAt(j);
                    }
                    set.add(ans);
                }
            }
            if(set.size() == 1){
                for (String s2 : set) {
                    answer = s2.length();
                    break;
                }
                break;
            }
            a++;

        }
        return answer;
    }
}
