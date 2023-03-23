/**
 * Check for Perfect Square in Java
 * Here on this page, we will learn how to Check for Perfect Square in Java programming language. We are given an integer number and need to print “True” if it is, otherwise “False”.
 */
package PrepInsta;

import java.util.Scanner;

public class P22_PerfectSqrtNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        System.out.println(isPerfectSqrtNumber(n));

    }
    //to check perfect sqrt
    public static boolean isPerfectSqrtNumber(int n){
        int sqrt = 0;
        if(n>0){
            sqrt = (int)Math.sqrt(n);
        }
        return n==(sqrt*sqrt);
    }
}
