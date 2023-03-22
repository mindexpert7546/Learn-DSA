/**
 * Check whether or Not the Number is an Armstrong Number in Java
 * Given an integer input the objective is to check whether or not the number is an Armstrong number. To do so we check if the number satisfies the below mentioned conditions and if it does, the it’s an Armstrong. The task is to write a code to Check Whether or Not the Number is an Armstrong Number in Java Language.
 *
 * Example
 * Input : 371
 * Output : It's an Armstrong Number.
 */
package PrepInsta;

import java.util.Map;
import java.util.Scanner;

public class P13_ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        int len = 0;
        int temp = n;
        while (n>0){
            n/=10;
            len++;
        }
        if(isArmStrong(temp,len)){
            System.out.println("An Armstrong number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }

    }
    public static boolean isArmStrong(int n, int len){
        int armVal = 0;
        int temp = n;
        while (n>0){
            int mod = n%10;
            armVal = armVal + (int)Math.pow(mod,len);
            n/=10;
        }
        if(armVal==temp){
            return true;
        }
        return false;
    }
}
