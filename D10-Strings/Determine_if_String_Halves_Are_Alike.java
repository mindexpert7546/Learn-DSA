/*
You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

 

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
 

Constraints:

2 <= s.length <= 1000
s.length is even.
s consists of uppercase and lowercase letters.

*/


class Solution {
    public boolean halvesAreAlike(String s) {
        int slen = s.length();
        int mid = slen/2;
        
        //to create substring
        String s1 = s.substring(0,mid);
        String s2 = s.substring(mid,slen);
        
        int s1len = s1.length();
        int s2len = s2.length();
        
     
        
       String r1 =  s1.replaceAll("[aeiouAEIOU]", "");
       String r2 = s2.replaceAll("[aeiouAEIOU]" , "");
        
       int r1len = r1.length();
       int r2len = r2.length();
        
      // if((s1.length() - r1.length())-(s2.length() - r2.length())==0)){
      //     return 0;
      // }
        
     int x = s1len-r1len;
     int y = s2len-r2len;
        if(x-y==0){
            return true;
        }
        return false;
    }
}
