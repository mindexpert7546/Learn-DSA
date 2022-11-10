/**
Check given number is prime or not 


*/

import java.util.Scanner;

public class CheckPrimeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        int count = 0;
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                count++;
            }
        }

        if(count == 2){
            System.out.println("Prime ");
        }
        else {
            System.out.println("Not prime ");
        }
    }
}
