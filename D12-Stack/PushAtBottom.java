package stack;

import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(7);
        s.push(8);

        // call the function
        pushAtBottom(s,98);
        System.out.println(s);

        // check and print it
        while (! s.isEmpty()){
            System.out.println(s.pop());
        }

    }


    // to create the method for push at bottom

    static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
}
