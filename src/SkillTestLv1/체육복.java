package SkillTestLv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class 체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,3,4};
        int[] reserve = {1,2,3,4,5};
        System.out.println(solution(n,lost,reserve));
    }

    private static int solution(int n, int[] lost, int[] reserve) {
        int ans = n-lost.length;
        HashSet<Integer> set = new HashSet<>();


        for (int i = 0; i < reserve.length; i++) {
            set.add(reserve[i]);
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]){
                    lost[i] = 0;
                }
            }
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

        }

        return ans;
    }
}
