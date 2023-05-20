

package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ImplementationOfStack {

    // function for print the stack
    public static void printStack(Stack<Integer> stack){
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    // push the value at bottom in stack
    public static void pushBottom(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int temp = stack.pop();
        pushBottom(stack,data);
        stack.push(temp);
    }

    //check the string are palindrome by using stack
    public static void palindromeString(String str){
        String temp = str;
        StringBuilder rev = new StringBuilder("");
        Stack<Character> ch = new Stack<>();
        int br=0;
        while (str.length()>br){
            ch.push(str.charAt(br));
            br++;
        }
        while (!ch.isEmpty()){
            char c = ch.pop();
            rev.append(c);
        }

        String revS = rev.toString();
        if(temp.equals(revS)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }

    // function for reverse the stack
    public static void revStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int temp = stack.pop();
        revStack(stack);
        pushBottom(stack,temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        /*
        //push the value at bottom in stack
        pushBottom(stack,10);
        printStack(stack);
         */

        /*
        // for checking the palindrome string
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = scan.nextLine();
        palindromeString(str);
         */

        /*
        revStack(stack);
        printStack(stack);
         */

    }

}
