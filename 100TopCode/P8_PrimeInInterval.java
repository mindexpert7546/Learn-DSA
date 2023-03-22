package PrepInsta;

import java.util.Scanner;

public class P8_PrimeInInterval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first value : ");
        int a = scan.nextInt();
        System.out.println("Enter second value : ");
        int b = scan.nextInt();

        for(int i=a; i<=b; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }


    }

    public static boolean isPrime(int n){
        int temp = 0;

        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                temp++;
            }
        }
        if(temp==1){
            return true;
        }
        return false;
    }
}
