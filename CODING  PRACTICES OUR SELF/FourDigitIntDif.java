/** A four digit interger given as input and here to find the diff b/w first and last digit should be absolute value  */


// absolute value means value should be positive 
import java.util.Scanner;
public class FourDigitIntDiff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter four digit number : ");
        int n = scan.nextInt();

        int mod1, mod2, res;

        mod1 = n%10;
        mod2 = n/1000;
        res = mod2-mod1;
        System.out.println(Math.abs(res));
    }
}
