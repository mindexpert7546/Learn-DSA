/**
 * input : hello
 * output : olleh
 */

package stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        String str = scan.next();

        //Reverse function calling
        System.out.println(reverseStr(str));

    }


    /*
    #Logic for reverse string by using stack

    step 1 : start
    step 2 : Take input String by scanner class
    step 3 : Create string function as parameter string
    step 4 : make a stack as character and put all character of string one by one (push operation)
    step 5 : Make s string builder class and append all character one by one of stack by using pop operation.
    step 6 : Return final String builder in toString() 
    step 7 : stop 

    */

    // Function for reverse string
    public static String reverseStr(String str){
        Stack<Character> ch = new Stack<>();
        StringBuilder sb =new StringBuilder("");
        int ind = 0;
        while (ind<str.length()){
            ch.push(str.charAt(ind));
            ind++;
        }
       while (!ch.isEmpty()){
           char c = ch.pop();
           sb.append(c);
       }
       return sb.toString();

    }
}
