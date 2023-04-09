//https://practice.geeksforgeeks.org/problems/find-the-fine4353/1?page=3&difficulty[]=-1&category[]=Arrays&sortBy=submissions

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            long b[] = new long[(int)(n)];
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.totalFine(n, k, a, b));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long totalFine( long n, long date, long car[], long fine[])
    {
        int checker = 0;
        long sum = 0;
        if(date%2==1){
            checker = 1;
        }
       
       if(checker==0){
         for(int i=0; i<n; i++){
            if(car[i]%2==1){
                sum = sum + fine[i];
            }
        }  
       } 
       else{
           for(int i=0; i<n; i++){
            if(car[i]%2==0){
               sum = sum + fine[i];
            }
        }  
       }
        
       return sum;
    }
}
