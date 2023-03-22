/***
 * Check if a Number is Positive or Negative in Java
 */
package PrepInsta;

import java.util.Scanner;

public class P1_PosNeg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();

        if(n>0){
            System.out.println("Number is Positive.");
        }
        else if(n==0){
            System.out.println("Number is zero.");
        }
        else{
            System.out.println("Number is Negative.");
        }
    }
}
