package SkillTestLv1;

public class 단어s의가운데글자 {

    public static void main(String[] args) {
        String s = "abde";
        System.out.println(solution(s));
    }

    private static String solution(String s) {

        String answer = "";
        if(s.length() % 2 == 0){
            answer = String.valueOf(s.charAt(s.length()/2-1));
            answer += String.valueOf(s.charAt(s.length()/2));
        }
        else {
            answer = String.valueOf(s.charAt(s.length()/2));
        }
        System.out.println("answer = " + answer);
        return null;
    }
}
