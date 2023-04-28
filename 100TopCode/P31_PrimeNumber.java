package PrepInsta;

import java.util.Scanner;

public class P31_PrimeNumberRec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(checkPrime(n,2));
    }

    // function for check prime number

    public static boolean checkPrime(int n, int i){
        if(n<=2){
            return (n==2)?true:false;
        }
        if(n%i==0)
            return false;

        if(i*i>n){
            return true;
        }
        return checkPrime(n, i+1);

    }
}
