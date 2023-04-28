/**
 * Largest Element of the array using Java
 * Here, in this page we will discuss the program to find the largest element of the array using java. We are given with an array and we need to print the largest element among the given elements of the array.
 */

package PrepInsta;

import java.util.Scanner;

public class P28_LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=scan.nextInt();
        }
        printArr(arr);
        System.out.println();
        System.out.println("max number : " + maxElement(arr,size));
    }

    // to print array:
    public static void printArr(int[] arr){
        for(int e : arr){
            System.out.print(e + " ");
        }
    }

    // max array :
    public static int maxElement(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
