//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1?page=1&difficulty[]=-1&category[]=Arrays&sortBy=submissions

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
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            obj.rotate(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Compute {
    
    public void rotate(int arr[], int n)
    {
        revStart(arr, 0, n-2);
        revFinal(arr, 0, n-1);
    }
    
    public static int[] revStart(int[] arr, int s, int e){
        while(s<=e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        
       return arr;
    }
    
    public static int[] revFinal(int[] arr, int s, int e){
        while(s<=e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        
       return arr;
    }
}
