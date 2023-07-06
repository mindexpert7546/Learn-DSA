
//https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int arr[], int n)
    {
        // your code here
        int k = n/2;
        int res = -1;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        
        for(Map.Entry m : map.entrySet()){
           // System.out.println(m.getKey() + " "+m.getValue());
           int val = (int)m.getValue();
           
           if(val>k){
              res = (int)m.getKey();
           }
        }
        return res;
    }
}
