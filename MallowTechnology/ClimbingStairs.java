
//https://practice.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/1
//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        
        int[] dp = new int[n+1];
        dp[0]=1;
        
        for(int i=1; i<=n; i++){
            if(i==1){
                dp[i]=dp[i-1]%1000000007;
            }
            else{
                dp[i]=(dp[i-1]+dp[i-2])%1000000007;
            }
        }
        return dp[n];
    }
}

