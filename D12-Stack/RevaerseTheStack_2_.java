/**
 * input : 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 * output : 
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 */

package stack;

import java.util.Stack;

public class ReverseThe_StackElement {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);

        // call the reverse funcion
        reverseStack(s);

        // call the print function
        System.out.println("In reverse order : ");
        printStack(s);

    }
    // function for print stack
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    // function for push at bottom

    public static void pushBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s,data);
        s.push(top);
    }

    // function for reverse the stack

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(s,top);

    }
}

/*
time complexity : o(n) and space complexity : o(1)
 */
