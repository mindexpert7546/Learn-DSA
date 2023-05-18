//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().countZeroes(arr, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    int countZeroes(int[] arr, int n) {
        // code here
      return  countZero(arr, 0, n);
    }
    
  public int countZero(int[] arr, int low, int n){
      
      int heigh = n-1;
      
      while(heigh>=low){
          int mid = low + (heigh-low)/2;
          if(arr[mid]==1){
              low = mid+1;
          }
         
          else{
              heigh = mid-1;
          }
      }
      return n-low;
  }

}
