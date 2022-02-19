import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {

    static int[] dp ;

    public int coinChange(int[] coins, int amount) {
        dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        int min = getMinCoin(coins, amount, coins.length-1);
        if(min!= 999999)
        return getMinCoin(coins, amount, coins.length-1);
        else
            return -1;
    }

    //
    public static int getMinCoin(int[] coins,  int amount, int i){

        if(amount == 0){
            return 0;}
        if(i < 0 ) return 999999;


        int min;
        if(dp[amount] != Integer.MAX_VALUE)
            return dp[amount];
        if(amount >= coins[i])
            min =  Math.min( 1 + getMinCoin(coins, amount - coins[i], i), getMinCoin(coins, amount ,i-1));
        else
            min =    getMinCoin(coins, amount ,i-1);
        if(dp[amount] == Integer.MAX_VALUE){
            dp[amount] = min;
        }
        return min;
    }

    // target 15  [2,4,6]
    //   step reached ->amount = 14

    // [2]
    // 3


}
