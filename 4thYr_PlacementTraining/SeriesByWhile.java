package Year_4th_PlacementTraining.TenMayAssignment;
import java.util.Scanner;

public class NumSeriesByWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = 3;
        int i =1;
        while (i<=n){
            System.out.print((int)Math.pow(res,i++) + " ");
        }
    }
}
