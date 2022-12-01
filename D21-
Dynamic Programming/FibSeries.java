/**
 * find the fibneche series
 *
 */

package DynamicProgramming;

import java.util.Scanner;

public class SimpleDynamic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();

        System.out.println(fbSeries(n));
    }

    public static int fbSeries(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <=n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[n];
    }
}
