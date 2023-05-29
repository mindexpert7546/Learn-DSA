//https://practice.geeksforgeeks.org/problems/two-repeated-elements-1587115621/1?page=1&difficulty[]=0&category[]=Searching&sortBy=submissions

//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int i=0;i<t;i++){
	        int n = Integer.parseInt(br.readLine());
	        String l = br.readLine();
    		String[] sarr = l.split(" ");
    		int[] arr = new int[sarr.length];
    		for(int i1=0;i1<arr.length;i1++){
    			arr[i1] = Integer.parseInt(sarr[i1]);
    		}
    		
            Solution obj = new Solution();
            
            int[] res = obj.twoRepeated(arr, n);
            System.out.println(res[0] + " " + res[1]);
	    }
	}
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int N)
    {
       int res[] = new int[2];
       int temp[] = new int[N+2];
       int k=0;
       for(int i=0; i<N+2; i++){
           temp[arr[i]]++;
           if(temp[arr[i]]==2){
               res[k++]=arr[i];
           }
       }
       return res;
    }
    
}
