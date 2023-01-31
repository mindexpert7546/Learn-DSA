
/**
Largest odd number in string
https://practice.geeksforgeeks.org/problems/largest-odd-number-in-string/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-odd-number-in-string
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
            String s = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.maxOdd(s));
        }
    }
}
// } Driver Code Ends


class Solution {

    String maxOdd(String s) {
        //code here
        // int maxOdd = 0;
        
        // int newI = Integer.parseInt(s);
        
        // while(newI>0){
        //     int mod = newI%10;
        //     if((mod%2==1)&& mod>maxOdd){
        //         maxOdd = mod;
        //     }
        //     newI=newI/10;
        // }
        
        // String str = ""+maxOdd;
        // return str;
        
        
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)%2==1) return s.substring(0, i+1);
        }
        return "";
    }
}
