//https://practice.geeksforgeeks.org/problems/palindrome-string0817/1?page=1&difficulty[]=0&category[]=Strings&sortBy=submissions

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
        String temp = S;
        String str = "";
        
        for(int i=S.length()-1; i>=0; i--){
            str +=S.charAt(i);
        }
        
    
        return (temp.equals(str)?1:0);
    }
};
