
//https://practice.geeksforgeeks.org/problems/bit-difference-1587115620/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Bit%20Magic&sortBy=submissions
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        int c=0;
        while(b!=0 || a!=0){
           int res1 = a&1;
           int res2 = b&1;
           if(res1!=res2)c++;
           a=a>>1;
           b=b>>1;
        }
        
        return c;
    }
    
    
}


//{ Driver Code Starts.

// Driver class
class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int m, n;
		long ans = 0; // initialise ans to 0
		while(t-->0) {
		    
		    //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    Solution obj = new Solution();
		    System.out.println(obj.countBitsFlip(m, n));
		}
	}
}


// } Driver Code Ends
