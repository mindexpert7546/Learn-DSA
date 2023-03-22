/**
 * Find the Greatest of the Three Numbers in Java
 */
package PrepInsta;

import java.util.Scanner;

public class P6_GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scan.nextInt();
        System.out.println("Enter third number : ");
        int num3 = scan.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is Greater");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2 + " is Greater");
        }
        else if(num3>num1 && num3 > num2){
            System.out.println(num3 + " is Greater");
        }
        else{
            System.out.println("All are equals.");
        }
    }
}
