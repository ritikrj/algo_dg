public class MoveZeroes {
//    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//    Note that you must do this in-place without making a copy of the array.
    // https://leetcode.com/problems/move-zeroes/
    public void moveZeroes(int[] nums) {
        int place = 0;
        int searcher =0;
        while(true){


            while(true){
                if(searcher >= nums.length || nums[searcher] != 0 ) break;
                searcher++;// non zero value
            }

            while(true){
                if(place >= nums.length || nums[place] == 0) break;
                place++;// zero value
            }

            if(place >= nums.length || searcher >= nums.length) break;

            if(searcher > place)
                exch(nums, searcher, place);
            else{
                searcher++;
            }
        }
    }

    public static void exch(int[] a, int i ,int j){

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
