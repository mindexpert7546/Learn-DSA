
//https://practice.geeksforgeeks.org/problems/pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_9
//{ Driver Code Starts
// Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            Solution ob = new Solution();
            ob.printDiamond(n);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    void printDiamond(int n) {
      int sp = n-1;
      int st = 1;
      for(int i=0; i<n*2; i++){
         for(int j=1; j<=sp; j++){
             System.out.print(" ");
         }
         for(int j=1; j<=st; j++){
             System.out.print("* ");
         }
          if(i<n-1){
            sp--;
            st++;  
          }
          else if(i>n-1){
             
             sp++;
             st--;
          }
          System.out.println();
    
      }
    }
}
