 /*
 
 Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
 
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {
      //initilize if array is empty 
      
        int[] res = {-1, 1};
      
      //to find first index
        int start = startVal(nums, target, true);
      
      //to find last index
        int end = startVal(nums, target, false);
        res[0] = start;
        res[1] = end;
      
      //return final answer
        return res;
        
       
    }
    
    public static int startVal(int[] nums, int target, boolean startvalue){
      
      
        int ans = -1;
        int s = 0; 
        int e = nums.length-1;
      
      //applay binary search 
        while(s<=e){
            int mid = s + (e-s)/2;
            
            if(nums[mid]>target){
                e = mid-1;
            }
            else if(nums[mid]<target){
                s = mid+1;
            }
            else {
              
              //our possible answer
                ans = mid;
              
              //to find first index if condition is true 
                if(startvalue){
                    e = mid-1;
                }
              
              //to find last index if condition is false 
                else{
                    s = mid+1;
                }
            }
        }
      
      //return final answer
        return ans;
    }
}
