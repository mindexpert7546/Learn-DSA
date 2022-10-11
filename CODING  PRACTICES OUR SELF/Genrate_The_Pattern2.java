/** Generate the pattern for given number .
 * example : 
 *Input :
 *4
 *OutPut:
 * 1
 * 12
 * 123
 * 1234
 * 
 */
import java.util.Scanner;

public class GeneratePattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
