package Year_4th_PlacementTraining.May11_Assignment;

import java.util.Scanner;

public class SearchElementArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the search element : ");
        int s = scan.nextInt();
        boolean k = false;
        for(int i=0; i<n; i++){
            if(arr[i]==s){
               k=true;
               break;
            }
        }
        if(k){
            System.out.println(s + "is present in the array");
        }
        else {
            System.out.println(s + " is not present in the array");

        }
    }
}
