package HASH;

import java.util.HashSet;

public class 폰캣몬 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = nums.length/2;

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if(set.size()<ans){
            return set.size();
        }

        return ans;
    }
}
