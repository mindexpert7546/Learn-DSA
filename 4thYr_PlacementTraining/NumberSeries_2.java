package Year_4th_PlacementTraining.TenMayAssignment;

import java.util.Scanner;

public class NumSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = 6;
        for (int i = 1; i <=n; i++) {
            System.out.print(res + " ");
            res+=5*i;

        }

    }
}
