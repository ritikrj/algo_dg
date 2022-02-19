import java.util.Arrays;
//https://leetcode.com/problems/jump-game-ii/
public class JumpGame {

    static int[] dp;
    public int jump(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        return getjump(nums,0);
    }

    public int getjump(int[] nums, int index) {
        int min = 9999;
        if(index == nums.length -1)
            return 0;
        if(index >= nums.length) return min;
        if(dp[index] != Integer.MAX_VALUE )
            return dp[index];
        for(int i = nums[index]; i > 0; i--){
            int temp = 1 + getjump(nums,  i+index);
            if(temp < min)
                min = temp;
        }
        dp[index] = min;
        return min;
    }

}
