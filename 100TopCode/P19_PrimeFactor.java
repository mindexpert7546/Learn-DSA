/**
 * Prime Factors of a number in Java
 *
 *
 * Here, in this page we will discuss the program to print all the prime factors of a number in java. Prime factorization is a way of expressing a number as a product of its prime factors. A prime number is a number that has exactly two factors, 1 and the number itself.
 *
 * Example :
 *
 * Input : 12
 * Output : 2 2 3
 */
package PrepInsta;

import java.util.Scanner;

public class P19_PrimeFactor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                int temp = n;
                while (temp%i==0){
                    System.out.print(i + " ");
                    temp=temp/i;
                }
            }
        }
    }

    // check prime number

    public static boolean isPrime(int n){
        int res = 0;
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                res++;
            }
        }
        return res==1;
    }
}
