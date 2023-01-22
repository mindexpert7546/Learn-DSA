/**
 question link : https://leetcode.com/problems/rotate-array/description/
*/


class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
        revR(nums,0,len-k-1);
        revR(nums,len-k,len-1);
        revR(nums,0,len-1);
        
    }
    public static int[] revR(int[] nums,int low , int heigh){
        while(low<heigh){
            int temp = nums[low];
            nums[low] = nums[heigh];
            nums[heigh] = temp;

            low++;
            heigh--;
        }

        return nums;
    }
}
