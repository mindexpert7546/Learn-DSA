/**
 * Find the Fibonacci Series up to Nth Term in Java
 * For a Given integer input number as the Nth value, the objective is to Find the Fibonacci Series up to the Nth Term. Therefore, we’ll write a program to Find the Fibonacci Series up to Nth Term in Java Language.
 *
 * Example
 * Input : 4
 * Output : 0 1 1 2
 */
package PrepInsta;

import java.util.Scanner;

public class P15_FibonacciSeriec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        int[] f = new int[n+1];
        f[0]=0;
        f[1]=1;

        System.out.print(f[0] + " " + f[1] + " ");
        for(int i=2; i<n; i++){
            f[i] = f[i-1]+f[i-2];
            System.out.print(f[i] + " ");
        }
    }
}
