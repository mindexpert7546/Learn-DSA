/**
https://leetcode.com/problems/remove-element/description/
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
          if(nums[i]!=val){
              nums[sum]=nums[i];
              sum++;
          }
        }

        return sum;
    }
}
