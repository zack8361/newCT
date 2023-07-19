package danawa;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String answer = "Palindrome";
        String wrongAnswer = "Not Palindrome";

        String s = sc.next();

        String first = "";
        String second = "";
        for (int i = 0; i < s.length()/2; i++) {
            first += s.charAt(i);
        }
        for (int i = s.length()-1; i > s.length()/2; i--) {
            second += s.charAt(i);
        }

        if(first.equals(second)){
            System.out.println(answer);
        }
        else {
            System.out.println(wrongAnswer);
        }

    }
}
