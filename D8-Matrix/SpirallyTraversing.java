//https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1
//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int arr[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<>();
        
        int dir = 0;
        int top = 0;
        int down = r-1;
        int left = 0;
        int right = c-1;
        
        while(top<=down && left<=right){
            if(dir==0){
                for(int i=left; i<=right; i++){
                    list.add(arr[top][i]);
                }
                top+=1;
            }
            else if(dir==1){
                for(int i=top; i<=down; i++){
                    list.add(arr[i][right]);
                }
                right-=1;
            }
            else if(dir==2){
                for(int i=right; i>=left; i--){
                    list.add(arr[down][i]);
                }
                down-=1;
            }
            else if(dir==3){
                for(int i=down; i>=top; i--){
                    list.add(arr[i][left]);
                }
                left+=1;
            }
            dir=(dir+1)%4;
        }
        
        return list;
    }
}
