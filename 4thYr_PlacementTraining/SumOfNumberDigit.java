package Year_4th_PlacementTraining.TenMayAssignment;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter range : ");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int sum = 0;
        while (n<=m){
            sum+=n;
            n++;
        }
        System.out.println(sum);
    }
}
