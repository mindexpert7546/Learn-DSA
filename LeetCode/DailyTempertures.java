/**
https://leetcode.com/problems/daily-temperatures/
*/

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     int[] ans = new int[temperatures.length];
     Stack<Integer> s = new Stack<Integer>();

     for(int i=0; i<temperatures.length; i++){
         while(!s.isEmpty() && temperatures[s.peek()] < temperatures[i]){
             int idx = s.pop();
             ans[idx] = i-idx;
         }
         s.push(i);
     }

     return ans;
    }
}
