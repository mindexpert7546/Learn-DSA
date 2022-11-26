/**
https://leetcode.com/problems/length-of-last-word/description/
*/

class Solution {
    public int lengthOfLastWord(String s) {
      
        String str = s.trim();
        
        int res = 0;
        if(str.contains(" ")){
            for(int i=str.length()-1; ;i--){
            char ch = str.charAt(i);
            if(ch == ' '){
                break;
            }
            else{
                res++;
            }
        }
        }
        else res = str.length();

        

        return res;
    }
}
