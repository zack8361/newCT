package MediaLog;

public class ex02 {
    public static void main(String[] args) {
        int n = 10;
        int[] v = {3,1,4,1,5,9,2,6,5,3};
        System.out.println(solution(n,v));
    }

    private static int solution(int n, int[] v) {
        int price = 0;
        int max = Integer.MIN_VALUE;

        int idx = 0;
        for (int i = 0; i < v.length; i++) {
            if(max<v[i]){
                max = v[i];
                idx = i;
            }
        }

        if(idx == v.length -1 ){
            return -1;
        }

        int min = Integer.MAX_VALUE;
        for(int i = idx+1; i<v.length; i++){
            min = Math.min(min,v[i]);
        }
        price = max - min;
        return price;
    }
}
