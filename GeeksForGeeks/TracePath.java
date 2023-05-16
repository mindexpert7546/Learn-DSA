
//https://practice.geeksforgeeks.org/problems/trace-path3840/1
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String srgs[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s1[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPossible(n, m, s));
        }
    }
}
// } Driver Code Ends


// User function Template for 

class Solution{
    static int max(int x, int y){
        if(x >= y)
            return x;
        return y;
    }
    
    static int min(int x, int y){
        if(x < y)
            return x;
        return y;
    }
    
    static int isPossible(int n, int m, String s){
        int maxl = 0, maxr = 0, maxu = 0, maxd = 0, c1 = 0, c2 = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == 'L')
                c1--;
            else if(s.charAt(i) == 'R')
                c1++;
            else if(s.charAt(i) == 'U')
                c2++;
            else
                c2--;
            if(c1 >= 0)
                maxr = max(c1, maxr);
            else
                maxl = min(c1, maxl);
            if(c2 >= 0)
                maxu = max(c2, maxu);
            else
                maxd = min(c2, maxd);
        }
        if(maxr + 1 - maxl <= m && maxu + 1 - maxd <= n)
            return 1;
        return 0;    
    }
}
