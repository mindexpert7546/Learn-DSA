/**
 * Program to Find the Sum of First N Natural Numbers using java
 */
package PrepInsta;

import java.util.Scanner;

public class P3_SumOfNumb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();

        int sum  = 0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        System.out.println("Sum is : " + sum);
    }
}
