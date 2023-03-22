/**
 * Find the Sum of the Digits of a Number in Java
 * Given an integer input number, the objective is t0 Find the Sum of the Digits of a Number in Java Language. To do we’ll break the number into it’s digits. Then we add them one by one as we extract them from the number using modulo operator “%”.
 *
 * Example
 * Input : 1234
 * Output : 1 + 2 + 3 + 4 = 10
 */
package PrepInsta;

import java.util.Scanner;

public class P10_SumOfDigitOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = scan.nextInt();
        int sum = 0;
        while (n>0){
            sum +=n%10;
            n/=10;
        }
        System.out.println("Sum is : " + sum);
    }
}
