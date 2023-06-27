package SkillTestLv1;

import java.util.ArrayList;

public class 스킬테스트1 {
    private static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(solution(arr));
    }

    private static int[] solution(int[] arr) {

        if(arr.length == 1){
            return new int[-1];
        }
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == min){
                continue;
            }
            else {
                list.add(arr[i]);
            }
        }
        int[] ans = new int[list.size()];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
