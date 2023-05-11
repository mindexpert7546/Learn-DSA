package Year_4th_PlacementTraining.May11_Assignment;

import java.util.Scanner;

public class MaximumElementArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n= scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println(max + " is the maximum element in the array");
    }
}
