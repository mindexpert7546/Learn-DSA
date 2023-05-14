
//https://practice.geeksforgeeks.org/problems/merge-two-strings2736/1?page=1&difficulty[]=-1&category[]=Strings&sortBy=submissions


//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String S1, String S2)
    { 
        // code here
        
        String str = "";
        
        String demoString = S1+S2;
        
        int j=0; 
        int k = 0;
        int len = 0;
        int lenMax = 0;
        
        if(S1.length()>S2.length())
        {
            len = S2.length();
            lenMax = S1.length();
            
        }
        else
        {
            len = S1.length();
           lenMax = S2.length();
        }
        
        
        for(int i=0; i<len*2; i++){
            if(i%2==0){
                str = str+S1.charAt(j++);
            }
            
            else{
                str = str+S2.charAt(k++);
            
            }
        }
        
        
        for(int i = len; i<lenMax; i++){
            if(S1.length()>S2.length())
            str=str+S1.charAt(i);
            else
                str = str+S2.charAt(i);
            
        }
        
        return str;
    }
} 
