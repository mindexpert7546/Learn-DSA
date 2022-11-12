//https://leetcode.com/problems/trapping-rain-water/description/

/**
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
*/

class Solution {
    public int trap(int[] height) {
        //to find left max bound
        int arrL[] = new int[height.length];
        arrL[0] = height[0];
        for (int i = 1; i < arrL.length; i++) {
            arrL[i] = Math.max(height[i],arrL[i-1]);
        }
        //to find right bound
        int arrR[] = new int[height.length];
        arrR[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i>=0; i--) {
            arrR[i] = Math.max(height[i], arrR[i+1]);
        }
        //to find waterlevel
        int res =0;
        for (int i = 0; i < height.length; i++) {
            int tap = Math.min(arrL[i],arrR[i]);
            res += tap-height[i];
        }
      return res;
    }
}
