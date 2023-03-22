/**
 * Check Whether or Not the Number is a Palindrome in Java
 * Given an integer input as the number, the objective is to check whether or not the given number is a palindrome. To do so, we’ll first reverse the string input using loops and recursion and check if it matches the original number.
 *
 * Example
 * Input : 121
 * Output : Palindrome
 */
package PrepInsta;

import java.util.Scanner;

public class P12_PlandromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        int temp = n;
        int rev = 0;
        while (n>0){
            int mod = n%10;
            rev = rev*10 + mod;
            n/=10;
        }

        if(temp==rev){
            System.out.println("Plandrome number");
        }
        else {
            System.out.println("Not a Plandrome numebr.");
        }
    }
}
