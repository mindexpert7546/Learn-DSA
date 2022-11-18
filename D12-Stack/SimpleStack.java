package stack;
import java.util.*;

public class SimpleStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(5);
//        while (!stack.isEmpty()){
//            System.out.println(stack.peek());
//
//        }
        System.out.println(stack);
    }
}
