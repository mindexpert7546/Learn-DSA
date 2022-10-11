/** Find the diff b/w last two digit of given number ? */
import java.util.Scanner;
public class FindDiffLastTwoDigit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int n = scan.nextInt();

       int mod1, mod2, diff;

       mod1 = n%10;
       n=n/10;
       mod2 = n%10;

       diff = mod2-mod1;
       System.out.println("The diff is : " + diff);
        
    }
}
