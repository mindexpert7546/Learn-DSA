/**
151. Reverse Words in a String
https://leetcode.com/problems/reverse-words-in-a-string/description/
*/

class Solution {
    public String reverseWords(String s) {
        String rs = "";
      String str[] = s.split("[ ]");
      
      for(int i=str.length-1; i>=0; i--){
          if(str[i].trim()==""){
              continue;
          }
          rs = rs + " " +  str[i];
      }
      return rs.trim();
    }
}
