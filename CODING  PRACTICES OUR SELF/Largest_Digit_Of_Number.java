/**  Find sum of even digit in given no N 
 * input : 
 * 7462
 * 
 * Output : 
 * 7
 * 
 */
import java.util.Scanner;

public class LargestDigitOfNunber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter NUmber : ");
        int n = scan.nextInt();
        int mod;
        int temp = n%10;
        while(n>0){
          mod = n%10; 
          if(temp<mod){
            temp = mod;
          }
          n=n/10;
        }

        System.out.println("The sum of even digit is : " + temp);
    }
}
