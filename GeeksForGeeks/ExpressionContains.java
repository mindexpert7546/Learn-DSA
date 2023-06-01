//https://practice.geeksforgeeks.org/problems/e015cb4d3f354b035d9665e7c8a54a7aefb1901b/1

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.checkRedundancy(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int checkRedundancy(String s) {
       Stack<Character> stack = new Stack<>();
       
       for(int i=0; i<s.length();i++){
           char ch = s.charAt(i);
           
           if(ch==')'){
              if(stack.peek()=='(') {
                  return 1;
              }
              else{
                  int k=0;
                  while(stack.peek()!='('){
                      stack.pop();
                      k++;
                  }
                  stack.pop();
                  if(k==1) return 1;
              }
           }
           else{
               stack.push(ch);
           }
       }
       
       return 0;
    }
}
        
