
/*
https://leetcode.com/problems/max-consecutive-ones/description/

*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
       
        int conMax = 0;
       
        
        for(int element : nums){
            if(element == 0){
                count = 0;
            }
            else{
                count++;
                conMax = Math.max(count,conMax);
            }
            
        }
        
        return conMax;
    }
}
