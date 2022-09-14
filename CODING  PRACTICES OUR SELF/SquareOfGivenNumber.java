/**
 * Find the square of given number  
 */
import java.util.Scanner;

public class SquareOfGivenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        int res = n*n;
        System.out.println(res);
    }
}
