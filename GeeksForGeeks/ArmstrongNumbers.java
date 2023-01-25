/**
https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1
*/

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

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        
        int sum = 0; 
        
        int temp = n;
        
        while(n>0){
            int mod = n%10; 
            sum = sum + (mod*mod*mod);
            n/=10;
        }
        
        if(temp ==sum){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}
