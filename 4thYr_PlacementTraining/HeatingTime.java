package Year_4th_PlacementTraining.MayNineAssignment;

import java.util.Scanner;

public class HeatingTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. items : ");
        int n = scan.nextInt();
        System.out.println("Enter the heating time for one item : ");
        float t = scan.nextInt();
        if(n==2){
            System.out.println("The recommended heating time is : " + (t + (t*50/100)));
        }
        else if (n==3){
            System.out.println("The recommended heating time is : " + (t+t));
        }
        else{
            System.out.println("Number of items is more");
        }
    }
}
