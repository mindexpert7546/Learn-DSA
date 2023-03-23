/**
 * Check Whether or Not the Number is an Abundant Number in Java
 * Given an integer input, the objective is to check whether the sum of all the factors of a number except the number itself is greater than the number or not. Therefore, we’ll write a code to Check Whether or Not the Number is an Abundant Number in Java.
 *
 * Example
 * Input : 18
 * Output : Yes, it's an Abundant Number
 *
 * Example
 * Input : Number = 18
 * Output : Yes, It's an Abundant Number
 * Explanation : The Factors for the number 18 are, 1, 2, 3, 6 and 9. We don't want to include the number itself.
 * Now the sum of the factors except the number itself is :
 * 1 + 2 + 3 + 6 + 9 = 21
 * as the number 21>18 , the number itself.
 * It's an abundant number.
 */
package PrepInsta;

import java.util.Scanner;

public class P25_AbudantNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum=sum+i;
            }
        }

        if(sum>n){
            System.out.println("Number is Abudent.");
            int ab = sum-n;
            System.out.println(n + "Abudence is " + ab);
        }
        else {
            System.out.println (n + " is not an Abundant Number");
        }
    }
}
