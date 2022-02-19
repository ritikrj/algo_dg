import java.util.Arrays;

public class HouseRobber {
// https://leetcode.com/problems/house-robber/
    // 100 % faster and 46 % less mempry
        static int[] dp;
        public int rob(int[] nums) {
            dp = new int[nums.length];
            Arrays.fill(dp,Integer.MAX_VALUE);
            return robNext(nums, 0);
        }

        public static int robNext(int[] nums,int index){

            if(index == nums.length - 1)
                return nums[index];
            if(index >= nums.length )
                return 0;

            if(dp[index] != Integer.MAX_VALUE){
                return dp[index];
            }

            if(index < nums.length){
                dp[index] =  Math.max(nums[index] + robNext(nums, index + 2), robNext(nums, index+1));}
            else{
                dp[index] =  robNext(nums, index + 1) ;
            }
            return dp[index];
        }

}
