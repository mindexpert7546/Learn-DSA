/**
 * Find the Sum of the Numbers in a Given Interval in Java
 */
package PrepInsta;


import java.util.Scanner;

public class p4_SumOfNumInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = scan.nextInt();
        System.out.println("Enter second number : ");
        int b = scan.nextInt();

        int sum = 0;
        for (int i = a; i <=b ; i++) {
            sum +=i;
        }
        System.out.println("Sum is : " + sum);
    }
}
