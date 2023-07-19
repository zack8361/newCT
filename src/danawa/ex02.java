package danawa;

import java.util.Arrays;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String[] str = new String[2];
            String fir = sc.next();
            String sec = sc.next();
            str[0] = fir.toLowerCase();
            str[1] = sec.toLowerCase();

            String first = "";
            String second = "";

            first = String.valueOf(str[0].charAt(0)).toUpperCase();
            second = String.valueOf(str[1].charAt(0)).toUpperCase();


            for (int j = 1; j < str[0].length(); j++) {
                first +=str[0].charAt(j);
            }
            for (int j = 1; j < str[1].length(); j++) {
                second +=str[1].charAt(j);
            }

            System.out.println("Case #" + i);
            System.out.println(first +" " + second);

        }
    }
}
