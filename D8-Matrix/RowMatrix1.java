//https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1

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
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        
        int[] temp = new int[arr.length];
        
        
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            temp[i]=sum;
        }
        
        
        int max = Integer.MIN_VALUE;
        int k=0;
        
        for(int e:temp){
            max = Math.max(e,max);
            if(e==0)k++;
        }
        if(k==temp.length)return -1;
        
        for(int i=0; i<temp.length; i++){
            if(max==temp[i]){
                return i;
            }
        }
        return -1;
    }
}
