package stack;

import java.util.Stack;

public class StockSpanProblems {
    public static void main(String[] args) {
        int[] stock = {100,80,60,70,60,85,100};
        int[] span = new int[stock.length];
        findSpan(stock,span);

        // print span

        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i]);
        }
    }

    // function for find span
    public static void findSpan(int[] stock, int[] span){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stock.length; i++) {
            int currPrice = stock[i];
            while (!s.isEmpty() && currPrice>stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] =  i+1;
            }else {
                int prevHeigh = s.peek();
                span[i]=i-prevHeigh;
            }
            s.push(i);
        }
    }
}
