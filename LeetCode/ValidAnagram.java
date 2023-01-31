/**
242. Valid Anagram
https://leetcode.com/problems/valid-anagram/description/

*/

class Solution {
    public boolean isAnagram(String s, String t) {
       //code 

       if(s.length() != t.length()) return false;

       int[] arr = new int[256];

       for(int i=0; i<s.length(); i++){
           arr[s.charAt(i)]++;
           arr[t.charAt(i)]--;
       }

       for(int i=0; i<arr.length; i++){
           if(arr[i]!=0){
               return false;
           }
       }
       return true;
    }
}
