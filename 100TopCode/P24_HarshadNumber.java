/**
 * Harshad number or not using Java :
 * Harshad number is a number or an integer in base 10 which is completely divisible by sum of  its digits.
 *
 * For better understanding let us consider an example.
 *
 * Example :
 *
 * Suppose a number 24 .
 * Calculate the sum of digits of the number (2 + 4) = 6 .
 * Check whether the number entered by user is completely divisible by sum of its digits or not.
 * Below are first few Harshad Numbers represented in base 10 :
 *
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20………
 *
 * In this article, we will create a java program to check whether the number entered by the user is Harshad number or not.
 */
package PrepInsta;

import java.util.Scanner;

public class P24_HarshadNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        if (isHarshadNumber(n)) {
            System.out.println("Number is Harshad");
        }
        else {
            System.out.println("Number is not Harshad");
        }
    }

    // to check harshad number
    public static boolean isHarshadNumber(int n){
        int temp = n;
        int sum = 0;
        while (n>0){
            sum+=n%10;
            n/=10;
        }

        return temp%sum==0;
    }
}
