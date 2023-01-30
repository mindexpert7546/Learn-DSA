/**
1021. Remove Outermost Parentheses
https://leetcode.com/problems/remove-outermost-parentheses/description/
*/

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuffer sb = new StringBuffer("");
        int j=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==41){
                j--;
            }
            if(j!=0){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)==40){
                j++;
            }
        }

        return sb.toString();
    }
}
