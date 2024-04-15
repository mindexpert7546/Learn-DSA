class Solution {
    public int maxArea(int[] arr) {
       int i=0; 
       int j=arr.length-1;
       int res = 0;
       int min = 0;
       while(i<=j){
        if(arr[i]<=arr[j]){
            min = arr[i];
            i++;
        } else {
            min = arr[j];
            j--;
        }
        int temp = min*(j-i+1);
        res = Math.max(res,temp);
       }
       return res;
    }

}
