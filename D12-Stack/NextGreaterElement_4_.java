

package stack;

import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();

        // next greater storing array

        int[] nextGen = new int[arr.length];

        for (int i = arr.length-1; i>=0; i--) {
            // step 1 : perform while loop operation
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            // step 2 : to check condition
            if(s.isEmpty()){
                nextGen[i]=-1;
            }
            else {
                nextGen[i] = arr[s.peek()];
            }
            // push the index in stack
            s.push(i);
        }

        for (int i = 0; i < nextGen.length; i++) {
            System.out.print(nextGen[i] + " ");
        }
    }
}
