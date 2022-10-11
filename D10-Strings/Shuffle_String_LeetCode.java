/*
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
Example 2:

Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.

*/

class Solution {
    public String restoreString(String s, int[] indices) {
        
        char c[] = new char[indices.length];
        
        // StringBuilder builder = new StringBuilder();
        
        for(int i=0; i<indices.length; i++){
            // builder = s.append(s.charAt(indices[0]));
             // builder.append(s.charAt(indices[i]));
            
             c[indices[i]] = s.charAt(i);
        }
        
        return new String(c);
        
    }
}
