//https://practice.geeksforgeeks.org/problems/missing-number4257/1?page=2&difficulty[]=-1&category[]=Arrays&sortBy=submissions

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
            int a[] = new int[n+5];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n-1; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.missingNumber(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public static int missingNumber(int A[], int n)
    {
         // Your code goes here
         int sum = 0;
         
         for(int e : A){
             sum = sum+e;
         }
         
         int totalSum = n*(n+1)/2;
         
         return totalSum-sum;
    }
}
