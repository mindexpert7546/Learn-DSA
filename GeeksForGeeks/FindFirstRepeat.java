//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                
                return "" + ch[i];
                
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        
        return "-1";
    }
} 
