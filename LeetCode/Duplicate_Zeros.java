/**


*/

class Solution {
    public void duplicateZeros(int[] arr) {
        
        int[] tempArr = new int[arr.length];
        int j=0;
        
        for(int i=0; i<arr.length && j<arr.length; i++){
            if(arr[i]!=0){
                tempArr[j]=arr[i];
               
            }
            else{
               j++;
            }
            j++;
        }
        
        for(int i=0; i<tempArr.length; i++){
          arr[i] = tempArr[i];
        }
    }
}
