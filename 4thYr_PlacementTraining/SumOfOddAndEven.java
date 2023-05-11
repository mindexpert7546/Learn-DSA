package Year_4th_PlacementTraining.May11_Assignment;

import java.util.Scanner;

public class SumOfOdd_EvenArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scan.nextInt();
        }
        int sum_odd = 0;
        int sum_even = 0;
        for(int e:arr){
            if(e%2==0){
                sum_even+=e;
            }
            else {
                sum_odd+=e;
            }
        }
        System.out.println("Sum of even is : " +sum_even);
        System.out.println("Sum of odd is : " + sum_odd);
    }
}
