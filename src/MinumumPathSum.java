import java.util.Arrays;
//https://leetcode.com/problems/minimum-path-sum/
public class MinumumPathSum {
    static int[][] dp;
    public int minPathSum(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        for(int i =0 ; i < grid.length ; i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        return getMinSum(grid, 0, 0);
    }

    public static int getMinSum(int[][] grid, int i, int j){
        if(i == grid.length -1  && j == grid[0].length -1  ){
            return grid[i][j];
        }

        if(i >= grid.length   || j >= grid[0].length   ){
            return 60000;
        }

        if(dp[i][j] !=  Integer.MAX_VALUE)
            return dp[i][j];


        dp[i][j] =  Math.min(grid[i][j] + getMinSum(grid,i+1,j) ,  grid[i][j] + getMinSum(grid,i,j+1));

        return dp[i][j];
    }
}

