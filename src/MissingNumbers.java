import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
/*
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
 */

public class MissingNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        // thnking of simple brute force now
        // seach from 1 to n if it does not exist add it
        //
        List<Integer> missing = new ArrayList<Integer>();

        for(int i = 0; i< nums.length;i++)
        {
            place(nums, nums[i]);
        }



        for(int i = 0; i< nums.length;i++)
        {
            if(nums[i] != i+1){
                missing.add(i+1);
            }
        }


        return missing;
    }

    public static void place(int[] a,int val){
        if(val == a[val -1]){
            return;
        }else{
            int temp = a[val -1];
            a[val-1] = val;
            place(a,temp);

        }

    }
}
