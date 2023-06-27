package SkillTestLv1;

public class 스킬테스트2 {

    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        System.out.println(solution(t,p));
    }

    private static int solution(String t, String p) {
        int ans = 0;

        for (int i = 0; i < t.length()-p.length()+1; i++) {
            String word = "";
            for (int j = i; j < p.length() + i; j++) {
                word+=t.charAt(j);
            }
            if(Long.parseLong(word)<= Long.parseLong(p)){
                ans++;
            }
        }

        return ans;
    }
}
