package Ronnie;

public class MaxProductOfCuttingRope {
    public static int maxProduct(int length){
        //https://www.geeksforgeeks.org/maximum-product-cutting-dp-36/
        if(length <= 1) return 0;

        int[] dp = new int[length + 1];

        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i <= length; i++){
            int max = 0;
            for(int j = 1; j < i; j++){
                max = Math.max(max, Math.max(dp[j]*(i-j), j*(i-j)));
            }
            dp[i] = max;
        }
        return dp[length];
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(13));
        //3*3*3*3
    }
}
