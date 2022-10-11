/** Generate the pattern for given number .
 * example : 
 * input: 
 * 4
 * output : 
 * 4321
 * 321
 * 21
 * 1
 * 
 */
import java.util.Scanner;

public class GeneratePattern4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();

        for(int i=n; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
