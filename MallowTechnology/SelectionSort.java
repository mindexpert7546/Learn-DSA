//https://practice.geeksforgeeks.org/problems/selection-sort/1

//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        
        return 0;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    
	    for(int i=0; i<n; i++){
	        int smallest = i;
	        
	        for(int j=i; j<n; j++){
	            if(arr[smallest]>arr[j]){
	                smallest=j;
	            }
	        }
	        int temp = arr[i];
	        arr[i]=arr[smallest];
	        arr[smallest]=temp;
	    }
	}
}
