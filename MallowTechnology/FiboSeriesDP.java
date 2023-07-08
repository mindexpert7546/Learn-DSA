

//https://practice.geeksforgeeks.org/problems/nth-fibonacci-number1335/1

//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
        // code here
        
        /*
        int[] dp = new int[(n+1)];
        dp[0]=0;
        dp[1]=1;
        
        for(int i=2; i<=n; i++){
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
        
        */
        int dp[] = new int[n+1];
        int res = fiboS(n,dp);
        return res;
        
    }
    
    public static int fiboS(int n, int[] dp){
        
        
        if(n==0 || n==1){
            return n;
        }
        
        if(dp[n]!=0)return dp[n];
        
        int f1 = fiboS(n-1,dp)%1000000007;
        int f2 = fiboS(n-2,dp)%1000000007;
        int sum = (f1+f2)%1000000007;
        dp[n]=sum;
        return sum;
    }
    
    
}
