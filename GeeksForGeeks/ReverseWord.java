//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1?page=1&difficulty[]=0&category[]=Strings&sortBy=submissions

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String str = "";
        
        String temp[] = S.split("[.]");
        
        for(String t:temp){
          str = "." + t + str;
        }
        
        
        return str.substring(1);
    }
}
