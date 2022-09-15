/** Generate the pattern for given number .
 * example : 
 * input: 
 * 4
 * output : 
 *  ****
 *  ***
 *  **
 *  *
 * 
 */
import java.util.Scanner;

public class GeneratePattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();

        for(int i=n; i>=0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
