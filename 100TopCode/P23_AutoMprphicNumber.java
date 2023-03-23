/**
 * Check Whether Or Not the Number is an Automorphic Number in Java
 * Given an integer input, the Objective is to check whether the square of the number ends with the same number or not. Therefore, we’ll write a code to Check Whether or Not the Number is an Automorphic Number in Java Language.
 *
 * Example
 * Input : 5
 * Output : Yes, it's an Automorphic Number
 * Num: 376, Square: 141376 - is Automorphic
 */
package PrepInsta;

import java.util.Scanner;

public class P23_AutoMorphicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        System.out.println(autoMorphicNum(n));
    }

    // to check automorphic number
    public static boolean autoMorphicNum(int n){
        int sq = n*n;
        while (n>0){
            if(n%10!= sq%10){
                return false;
            }
            n/=10;
            sq/=10;
        }
        return true;
    }
}
