import java.util.Arrays;

public class PerfectSquares {

    //https://leetcode.com/problems/perfect-squares/
    // 9 % faster 93 % less memory

    static int[] dp;
    public int numSquares(int n) {
        dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1 ; i < dp.length; i++){
            for(int j =  i ; j >= 0 ; j--){
                if(i >= j*j && dp[i - j*j] != Integer.MAX_VALUE){
                    dp[i] = Math.min(1 + dp[i - j*j] , dp[i] );

                }
            }
        }

        return dp[n];
    }
}

