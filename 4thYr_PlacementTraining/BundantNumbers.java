package Year_4th_PlacementTraining.TenMayAssignment;
import java.util.Scanner;
public class BundantNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int temp = n;
        int sum = 0;
        int i = 1;
        while (i<n){
           if(n%i==0){
               sum+=i;
           }
           i++;
        }
        System.out.println(sum>temp?"Bundant Number":"Not Bundant Number");
    }
}
