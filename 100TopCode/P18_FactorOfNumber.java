/**
 * Find the Factors of a Number in Java
 * Given an integer number as the input, the objective is to Find all the factors of a Number. Therefore, we’ll write a code to Find the Factors of a Number in Java Language.
 *
 * Example
 * Input : 10
 * Output : 1, 2, 5
 */
package PrepInsta;

import java.util.Scanner;

public class P18_FactorOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();

        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }
}
