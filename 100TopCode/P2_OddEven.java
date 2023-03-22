/**
 * Check Whether a Number is Even or Odd in Java
 */
package PrepInsta;

import java.util.Scanner;

public class P2_OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();

        if(n%2==0){
            System.out.println("Number is even.");
        }
        else{
            System.out.println("Enter number is odd");
        }
    }
}
