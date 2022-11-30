/**
https://leetcode.com/problems/squares-of-a-sorted-array/description/

*/


class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] tempArr = new int[nums.length];
        
        for(int i = 0; i<nums.length; i++){
            tempArr[i] = nums[i]*nums[i];
        }
        
        Arrays.sort(tempArr);
        
        return tempArr;
    }
}
