
//https://practice.geeksforgeeks.org/problems/min-subsets-with-consecutive-numbers0601/1?page=3&difficulty[]=0&status[]=solved&category[]=Arrays&sortBy=submissions
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.numofsubset(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public static int numofsubset(int arr[], int n)
    {
         // Your code goes here
          Arrays.sort(arr);
        int res = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i]+1 != arr[i+1]){
                res++;
            }
        }
        return res+1;
    }
}
