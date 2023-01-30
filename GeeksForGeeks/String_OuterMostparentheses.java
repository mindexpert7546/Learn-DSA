/**
Outermost Parentheses

https://practice.geeksforgeeks.org/problems/outermost-parentheses/1
*/

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.removeOuter(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removeOuter(String s) {
        // code here
        
        // assci value of ( = 40
        // assci value of ) = 41
        StringBuffer sb = new StringBuffer("");
        
        int j=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 41){
                j--;
            }
            if(j!=0){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)==40){
                j++;
            }
        }
        
        return sb.toString();
    }
}
