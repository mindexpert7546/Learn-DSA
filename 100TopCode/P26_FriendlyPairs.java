/**
 * Check Whether or Not the Two Numbers are a Friendly Pair in Java
 * Given Two integer inputs as the numbers, the objective is to check whether the ratio of the sum of the factors of the number except the number itself upon the number, of the both numbers, matches or not. Therefore, we’ll write a code to Check Whether or Not the Two Numbers are a Friendly Pair in Java Language.
 * Example
 * Input : 6 12
 * Output : Yes, they are a friendly pair
 *Example
 * Input : 6 28
 * Output : Yes, they are a friendly pair
 * Explanation : The factors of 6 and 28 except the numbers themselves are 1, 2, 3 and 1, 2, 4, 7, 14 respectively.
 * Now the sum of factors of both the numbers are 6 and 28 respectively.
 * When we divide the sums with the numbers we get 1 and 1 respectively.
 * As the ratio of both the number match, they are considered as a friendly pair.
 *
 */
package PrepInsta;

import java.util.Scanner;

public class P26_FriendlyPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n = scanner.nextInt();
        System.out.println("Enter second number : ");
        int m = scanner.nextInt();
        if(sumFactOfNumber(n)/n == sumFactOfNumber(m)/m){
            System.out.println("Friendly Pairs");
        }
        else {
            System.out.println("Not friendly pairs");
        }
    }

    // find factor

    public static int sumFactOfNumber(int n){
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
