//https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab

//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int res = Integer.MIN_VALUE;
        
        long leftSum = 0;
        long rightSum = 0;
       
        
        for(long e:arr)rightSum+=e;
        
        for(int i=0; i<n; i++){
           rightSum-=arr[i];
           if(leftSum==rightSum){
               res=i+1;
               break;
           }
           leftSum+=arr[i];

        }
        
        if(res==Integer.MIN_VALUE)res=-1;
        return res;
    }
}
