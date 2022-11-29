/*
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
*/

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            String str = "";
            str = str + nums[i];
            if(str.length() %2==0){
                count ++;
            }
        }
        return count;
    }
}
