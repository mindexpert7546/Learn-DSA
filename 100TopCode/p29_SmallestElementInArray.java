package PrepInsta;

import java.util.Scanner;

public class P29_SmallestElementInArray {
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
        System.out.println("smallest element " + smallElement(arr,size));
    }

    // to print array:
    public static void printArr(int[] arr){
        for(int e : arr){
            System.out.print(e + " ");
        }
    }

    // smallest element array

    public static int smallElement(int[] arr, int size){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
