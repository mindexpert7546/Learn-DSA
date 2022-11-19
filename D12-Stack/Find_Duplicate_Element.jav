/**
 * To find duplicate element form in string 
 * input : (5*5)
 * output : false
 * 
 * input : ((8*5))
 * output : true
 * 
 * 
 */

package stack;

import java.util.Stack;

public class DuplicatePairsOfBracket {
    // function for find valid pairs
    public static boolean validParis(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            if(ch == ')'){
                while (s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else {
                    s.pop();
                }
            }
            else {
                s.push(ch);
            }


        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((4*5))";
        System.out.println(validParis(str));
    }
}
