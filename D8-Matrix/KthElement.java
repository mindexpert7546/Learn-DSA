//https://practice.geeksforgeeks.org/problems/kth-element-in-matrix/1

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class KthSmallestElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.next());
		while(t>0)
		{
			int n=Integer.parseInt(sc.next());
			int[][] a=new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
    				a[i][j]=Integer.parseInt(sc.next());
    		
			int k=Integer.parseInt(sc.next());
		    Solution ob = new Solution();
		    System.out.println(ob.kthSmallest(a,n,k));
		    
		    t--;
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
	public static int kthSmallest(int[][]Mat,int n,int k)
	{
        //code here.
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<Mat.length; i++){
            for(int j=0; j<Mat[i].length; j++){
                list.add(Mat[i][j]);
            }
        }
        
        Collections.sort(list);
        
        return list.get(k-1);
    }
}
