package SkillTestLv2;


/**
 * 점화식 무조건 다시 풀어보기.
 */
public class 스킬체크테스트lv2 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int ans = 0;
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 3;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[arr.length-1];

    }
}
