package SkillTestLv1;

import java.util.HashSet;

public class 체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        System.out.println(solution(n,lost,reserve));
    }

    private static int solution(int n, int[] lost, int[] reserve) {
        int ans = n-lost.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < reserve.length; i++) {
            set.add(reserve[i]);
        }

        for (int i = 0; i < lost.length; i++) {

            if(set.contains(lost[i]-1)){
                ans++;
                set.remove(lost[i]-1);
            }
            else if(set.contains(lost[i] + 1)){
                ans++;
                set.remove(lost[i]+1);
            }
            else {
                continue;
            }

            System.out.println("set = " + set);
        }

        return ans;
    }
}
