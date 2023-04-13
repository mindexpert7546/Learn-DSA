

//https://practice.geeksforgeeks.org/problems/greater-on-right-side4305/1?page=3&difficulty[]=-1&category[]=Arrays&sortBy=submissions

//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().nextGreatest(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    void nextGreatest(int arr[], int n) {
        // code here
        
        int gtr = -1;
        
        int[] res = new int[n];
        
        for(int i=n-1; i>=0; i--){
            int temp = arr[i];
            res[i]=gtr;
            gtr = Math.max(gtr, temp);
        }
        
        for(int i=0; i<n; i++){
            arr[i]=res[i];
        }
    }
}
