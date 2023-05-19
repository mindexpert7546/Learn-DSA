//{ Driver Code Starts
//Initial Template for Java
//https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x2041/1?page=1&difficulty[]=-1&category[]=Searching&sortBy=submissions
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
            String inputLine[] = br.readLine().trim().split(" "); 
            int n = Integer.parseInt(inputLine[0]); 
            int x = Integer.parseInt(inputLine[1]);
            
            int arr[] = new int[(int)(n)];
            
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x); 
            
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    } 
} 
            



// } Driver Code Ends


//User function Template for Java
class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        int br = 0;
        int br1 = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
                list.add(i);
                br++;
                break;
            }
        }
        
         for(int i=n-1; i>=0; i--){
            if(arr[i]==x){
                list.add(i);
                br1++;
                break;
            }
        }
        
        if(br>0 && br1>0){
            return list;
        }
        else{
            list.add(-1);
            return list;
        }
       
    }
}
