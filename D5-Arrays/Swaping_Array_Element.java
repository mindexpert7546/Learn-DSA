/*
input : 4,5,6,7,6,5
output : [5, 4, 6, 7, 6, 5] // here 4 and 5 is swaped 
*/

import java.util.Arrays;
import java.util.Scanner;

public class SwapingElementArray {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,6,5};
        SwapIng(arr, 0,1);
        System.out.println(Arrays.toString(arr));
    }
    public  static  void SwapIng(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
