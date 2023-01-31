/**
https://leetcode.com/problems/rotate-string/
*/
class Solution {
    public boolean rotateString(String s, String goal) {
      if(s.length() != goal.length()) return false;

      String str = s+s;
      return str.contains(goal);
    }
}
