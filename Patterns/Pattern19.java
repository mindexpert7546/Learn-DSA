//https://practice.geeksforgeeks.org/problems/double-triangle-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_19

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
        int st = n;
        int sp = 0;
        
        for(int i=1; i<=n*2; i++){
           // System.out.println(st+"," + sp);
           for(int j=1; j<=st; j++){
               System.out.print("*");
           }
           for(int j=1; j<=sp; j++){
               System.out.print(" ");
           }
           for(int j=1; j<=st; j++){
               System.out.print("*");
           }
            if(i<n){
                st--;
                sp=sp+2;
            }
            else if(i>n){
                st++;
                sp=sp-2;
            }
            System.out.println();
        }
    }
}
