/**
https://leetcode.com/problems/reverse-string/description/

*/


class Solution {
    public void reverseString(char[] s) {
        
        StringBuilder sb = new StringBuilder();
        sb.append(s);
       String str =  sb.reverse().toString();
       for(int i = 0; i<str.length(); i++){
          s[i] = str.charAt(i);
       }
//        System.out.println(str);
       for(int i=0; i<s.length; i++){
           System.out.print(s[i]);
    }
    
    }
}
