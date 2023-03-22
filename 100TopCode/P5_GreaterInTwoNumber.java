/**
 * Find the Greatest of the Two Numbers in Java
 */
package PrepInsta;

import java.util.Scanner;

public class P5_GreatestTwoNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scan.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is Greater");
        }
        else if(num1==num2){
            System.out.println("Both are equals");
        }
        else{
            System.out.println(num2 + " is Greater");
        }
    }
}
