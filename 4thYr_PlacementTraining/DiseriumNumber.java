package Year_4th_PlacementTraining.TenMayAssignment;

import java.util.Scanner;

public class DiseriumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = n;
        int m = n;
        int res = 0;
        int i=0;
        while (n>0){
            i++;
            n/=10;
        }
        while (m>0){
           int mod = m%10;
           res+=(int)(Math.pow(mod,i--));
           m/=10;
        }
        System.out.println(temp==res?"Diserium Number":"Not Diserium Number");
    }
}
