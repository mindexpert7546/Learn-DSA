package Year_4th_PlacementTraining.MayNineAssignment;

import java.util.Scanner;

public class FindFact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        int res = 1;
        for (int i = 1; i <=n; i++) {
            res*=i;
        }
        System.out.println(res);
    }
}
