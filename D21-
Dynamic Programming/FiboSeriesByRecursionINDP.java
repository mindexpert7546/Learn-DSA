package DynamicProgramming;

import java.util.Scanner;

// Method - 1 by using recursion
public class FIbonaciS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[n+1];
        int res = fiboS(n,dp);
        System.out.println(res);
    }

    public static int fiboS(int n, int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0){
            dp[n]=fiboS(n-1,dp)+fiboS(n-1,dp);
        }
        return fiboS(n-1,dp)+fiboS(n-2,dp);
    }
}
