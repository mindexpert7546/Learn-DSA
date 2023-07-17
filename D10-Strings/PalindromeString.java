
//https://practice.geeksforgeeks.org/problems/palindrome-string0817/1
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        
       char[] c = S.toCharArray();
       
       for(int i=0; i<c.length/2; i++){
           if(c[i]!=c[c.length-i-1])return 0;
       }
       return 1;
    }
};
