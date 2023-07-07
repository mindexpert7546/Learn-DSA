//https://practice.geeksforgeeks.org/problems/merge-sort/1

//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int si, int mid, int ei)
    {
         // Your code here
         int a[]=new int[ei-si+1];
         
         int x = 0;
         int ind1 = si;
         int ind2 = mid+1;
         
         while(ind1<=mid && ind2<=ei){
             if(arr[ind1]<=arr[ind2]){
                 a[x++]=arr[ind1++];
             }
             else{
                 a[x++]=arr[ind2++];
             }
         }
         
         while(ind1<=mid){
             a[x++]=arr[ind1++];
         }
         while(ind2<=ei){
             a[x++]=arr[ind2++];
         }
         
        for(int i=0,l=si; i<a.length; i++,l++){
            arr[l]=a[i];
        }
    }
    void mergeSort(int arr[], int si, int ei)
    {
        //code here
        
        if(si>=ei){
            return;
        }
        
        int mid = si+(ei-si)/2;
        
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
}
