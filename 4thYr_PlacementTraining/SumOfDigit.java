package Year_4th_PlacementTraining.MayNineAssignment;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = n%9;
        System.out.println((res==0)?9:res);
    }
}
