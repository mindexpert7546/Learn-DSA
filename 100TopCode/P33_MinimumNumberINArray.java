package PrepInsta;

import java.util.Scanner;

public class P33_MinNumberINArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {3,54,2,6,87,76,9};
        int l = arr.length-1;
        int max = arr[0];
        int res =  maxNumber(arr,l,max);
        System.out.println(res);
    }

    // function for find the maximum number in array by recursion

    public static int maxNumber(int[] arr, int l, int max){
        if(l==0){
            return max;
        }
        if(l>0){
            if(arr[l]<max){
                max = arr[l];
            }
        }

        return maxNumber(arr,l-1,max);
    }
}
