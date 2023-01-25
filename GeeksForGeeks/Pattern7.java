/**
https://practice.geeksforgeeks.org/problems/triangle-pattern-1661492263/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_7
*/

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        
        for(int i=1; i<=n; i++){
            for(int space = 1; space<=n-i; space++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
