/**
problems link : 


https://leetcode.com/problems/valid-parentheses/description/


20. Valid Parentheses
Easy
16.9K
871
Companies
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

*/



class Solution {
    public boolean isValid(String s) {
       Stack<Character> ch = new Stack<>(); 

       for(int i=0; i<s.length(); i++){
           char c = s.charAt(i);

           if(c == '(' || c == '{' || c == '['){
               ch.push(c);
           }
           else{

               if(ch.isEmpty()){
                   return false;
               }

                if((ch.peek() =='(' && c == ')')
                   || (ch.peek() == '{' && c=='}')
                   || (ch.peek() == '[' && c==']')
               ){
                   ch.pop();
               }
               else{
                   return false;
               }
               

           }


          
       }

       if(ch.isEmpty()){
           return true;
       }
       else{
           return false;
       }

    }
}
