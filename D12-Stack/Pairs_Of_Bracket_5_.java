/**
 * input : (())
 * output : true
 *
 * input : ()
 * output true
 *
 * input : [[{{}}]]
 * output : true
 *
 * input : {{{(}}}
 * output : false
 *
 * input : [)[[}
 * output : false
 */

package stack;

import java.util.Stack;

public class Open_Or_Close_Braces {
    public static void main(String[] args) {
        String str ="{{}}[[]]()((()))}";
        System.out.println(exectMannerString(str));
    }
    public static boolean exectMannerString(String str){
        Stack<Character> ch = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                ch.push(c);
            }
            else {
               if(ch.isEmpty()){
                   return false;
               }
               if((ch.peek() =='(' && c == ')')
                   || (ch.peek() == '{' && c=='}')
                   || (ch.peek() == '[' && c==']')
               ){
                   ch.pop();
               }
               else {
                   return false;
               }
            }

        }

            if(ch.isEmpty()){
                return true;
            }
            else {
                return false;
            }
    }
}
