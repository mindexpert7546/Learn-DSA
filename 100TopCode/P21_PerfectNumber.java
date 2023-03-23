/**
 * Check Whether or Not the Number is a Perfect Number in Java
 * Given an integer input as the number, the objective is to check whether or not the number can be represented as the sum of its factors except the number itself. Therefore, we write a code to Check Whether or Not a Number is a Perfect Number in Java Language.
 *
 * Example
 * Input : 6
 * Output : Yes, it's a Perfect Number
 * Since, 6 = 1 + 2 + 3 (which are its divisors)
 */
package PrepInsta;

import java.util.Scanner;

public class P21_PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        System.out.println(isPerfectNumber(n));
    }

    // to find factor
    public static boolean isPerfectNumber(int n){
        int temp = n;
        int res = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                res+=i;
            }
        }
        return temp==res;
    }
}
