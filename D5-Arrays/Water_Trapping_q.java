/*
input : 
arr[] = {4,2,0,6,3,2,5}

output : 

11
*/

package Arrays;

public class TpappingWater {
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trapW(arr));
    }
    public static int trapW(int[] arr){
        //to find left max bound
        int arrL[] = new int[arr.length];
        arrL[0] = arr[0];
        for (int i = 1; i < arrL.length; i++) {
            arrL[i] = Math.max(arr[i],arrL[i-1]);
        }
        //to find right bound
        int arrR[] = new int[arr.length];
        arrR[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i>=0; i--) {
            arrR[i] = Math.max(arr[i], arrR[i+1]);
        }
        //to find waterlevel
        int res =0;
        for (int i = 0; i < arr.length; i++) {
            int tap = Math.min(arrL[i],arrR[i]);
            res += tap-arr[i];
        }
      return res;
    }
}
