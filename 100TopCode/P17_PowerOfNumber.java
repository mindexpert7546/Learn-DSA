/**
 * Find the Power of a Number in Java
 * Given two integer inputs as number and the power, the objective is to raise the number to a power given. Therefore, we’ll write a Code to Find the Power of a Number in Java Language.
 *
 * Example
 * Input : 2 3
 * Output : 8
 */
package PrepInsta;

import java.util.Scanner;

public class P17_PowerOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter base : ");
        double base = scan.nextDouble();
        System.out.println("Enter power : ");
        double pow = scan.nextDouble();
        double res = 1.0;
        while (pow>0){
            res*=base;
            pow--;
        }
        System.out.println(res);
    }
}
