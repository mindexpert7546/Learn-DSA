package Year_4th_PlacementTraining.MayNineAssignment;

import java.util.Scanner;

public class NumSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        int res = 4;
        for(int i=1; i<=n; i++){
            System.out.print(res + " ");
            res = res + i*i;
        }
    }
}
