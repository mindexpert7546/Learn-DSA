/**
Anagram
https://practice.geeksforgeeks.org/problems/anagram-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=anagram
*/

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        
        if(a.length() != b.length()) return false;
        int[] arr = new int[256];
        
        for(int i=0; i<a.length(); i++){
            arr[a.charAt(i)]++;
            arr[b.charAt(i)]--;
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
