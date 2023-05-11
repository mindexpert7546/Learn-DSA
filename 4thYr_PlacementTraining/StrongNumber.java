package Year_4th_PlacementTraining.TenMayAssignment;
import java.util.Scanner;
public class StrongNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = n;
        int sum = 0;
       while (n>0){
           sum+=factorial(n%10);
           n/=10;
       }
        System.out.println(temp==sum?"Strong Number":"Not a Strong Number");
    }
    public static int factorial(int n){
        int res = 1;
        for (int i = 1; i <=n; i++) {
            res*=i;
        }
        return  res;
    }
}
