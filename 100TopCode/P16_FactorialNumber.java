/**
 * Factorial of a Number in Java
 * Here on this page, we will learn how to Find the Factorial of a Number in Java. Factorial is a sequence of a number where we multiply by all previous numbers.
 *
 * factorial of n (n!) = 1 * 2 * 3 * 4....n
 *
 *
 * Note : 0! = 1 and 1! = 1
 *
 * Example :
 * 5! = 1 * 2 * 3 * 4 * 5 = 120
 */
package PrepInsta;
import java.util.Scanner;

public class P16_FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        System.out.println(factNum(n));
    }

    // function for find factorial of number
    public static int factNum(int n){
        int res = 1;
        for(int i=n; i>0; i--){
            res *= i;
        }
        return res;
    }
}
