/**
 * Find the Reverse of a Number in Java
 * Given a integer input the objective is to break down the  number into digits and rearrange them in reverse order. We’ll use loops and recursion to reverse the number input. therefore, we’ll write a program to Find the Reverse of a Number in Java Language.
 *
 * Example
 * Input : 123
 * Output : 321
 */
package PrepInsta;

import java.util.Scanner;

public class P11_ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n= scan.nextInt();
        int rev = 0;
        while (n>0){
            int mod = n%10;
            rev = rev*10 + mod;
            n/=10;
        }

        System.out.println("Reverse of Number : " + rev);
    }
}
