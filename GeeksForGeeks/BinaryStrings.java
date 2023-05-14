//https://practice.geeksforgeeks.org/problems/binary-string-1587115620/1?page=1&difficulty[]=-1&category[]=Strings&sortBy=submissions

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static Scanner sc = new Scanner(System.in);
	public static void main (String[] args){
        int t;
    	t=sc.nextInt();
    	sc.nextLine();
    	while((t--)!=0){
    	    int n=sc.nextInt();
    	    sc.nextLine();
    	    String s = new String();
    	    s=sc.nextLine();
    	    Solution obj = new Solution();
    	    System.out.println(obj.binarySubstring(n, s));
    	}
	}
}
// } Driver Code Ends




class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
      /// count 1 
      // (count * (count-1))/2
      // (3*(3-1))/2 = (3*2)/2= 6/2=3
      
      int count =0;
      
      for(int i=0; i<a; i++){
          if(str.charAt(i)=='1'){
              count++;
          }
      }
      
      return (count*(count-1))/2;
      
    }
}
