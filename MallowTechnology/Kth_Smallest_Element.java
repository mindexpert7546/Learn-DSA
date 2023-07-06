//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        
        int res = 0;
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int i=0; i<arr.length; i++){
            q.add(arr[i]);
        }
        
        for(int i=0; i<k-1; i++){
            q.remove();
        }
        //System.out.println(q);
        res = q.peek();
        return res;
        
    } 
}
