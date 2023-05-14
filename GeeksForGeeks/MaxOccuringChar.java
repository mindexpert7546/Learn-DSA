//https://practice.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1?page=1&difficulty[]=-1&category[]=Strings&sortBy=submissions

//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int[] ch = new int[256];
        for(int i=0; i<line.length(); i++){
            ch[line.charAt(i)]++;
        }
        
        int max = 0;
        int res = 0;
        
        for(int i=0; i<256; i++){
            if(max<ch[i]){
                max = ch[i];
                res = i;
            }
        }
        return (char)(res);
    }
    
}
