/**
 * input :
 * 5
 * 20
 * 5,7,11,13,17,19
 */

import java.util.Scanner;

public class PrimeNumberBetweenTwoNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1,n2,i,j;
        System.out.println("Enter first number : ");
       
        n1  = scan.nextInt();
        System.out.println("Enter Second number : ");
        n2 = scan.nextInt();

        for( i=n1; i<=n2; i++){
            for(j=2; j<=i; j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                System.out.print(j + " ,");
            }
        }

        
    }
}
