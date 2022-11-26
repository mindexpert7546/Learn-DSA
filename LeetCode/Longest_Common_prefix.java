/**

Question link : 

https://leetcode.com/problems/longest-common-prefix/description/
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";

        Arrays.sort(strs);

       // find smallest char 

       String s = strs[0];
       String h = strs[strs.length-1];

       for(int i=0; i<s.length(); i++){
           if(s.charAt(i) != h.charAt(i)){
               break;
           }
           else{
               str = str + s.charAt(i);
           }
       }

        return str;
    }
}
