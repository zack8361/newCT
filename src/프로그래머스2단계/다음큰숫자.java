package 프로그래머스2단계;

public class 다음큰숫자 {
    public static void main(String[] args) {
        int n = 78;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int i = 0;
        String an = Integer.toBinaryString(n);
        
        int realAn = 0;
        for (int j = 0; j < an.length(); j++) {
            if(an.charAt(j) == '1'){
                realAn++;
            }
        }
        
        while (true){
            int cnt = 0;
            i++;
            String binaryString = Integer.toBinaryString(n+i);
            for (int j = 0; j < binaryString.length(); j++) {
                if(binaryString.charAt(j) == '1'){
                    cnt++;
                }
            }
            if(cnt == realAn){
                break;
            }
        }
        return n + i;
    }
}
