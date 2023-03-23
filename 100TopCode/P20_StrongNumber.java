/**
 * Check Whether or Not the Number is a Strong Number in Java
 * Given an integer  input the objective is to check whether or not the number is a strong number. Therefore we’ll write a code to Check whether or Not the Number is a Strong Number in Java Language.
 *
 * Example
 * Input : 145
 * Output : Yes, it's a strong number
 */
package PrepInsta;

import java.util.Scanner;

public class P20_StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        int temp = n;
        int res = 0;

        while (n>0){
            int mod = n%10;
            res+=factNumber(mod);
            n/=10;
        }
        if(res==temp){
            System.out.println("This is strong number");
        }
        else{
            System.out.println("This is not strong number");
        }
    }
    // fin factorial of number

    public static int factNumber(int n){
        if(n==0){
            return 1;
        }
        return n*factNumber(n-1);
    }
}
