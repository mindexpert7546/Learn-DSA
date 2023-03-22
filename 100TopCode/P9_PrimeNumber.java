package PrepInsta;

import java.util.Scanner;

public class P9_PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();

        int temp = 0;
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                temp++;
            }
        }
        if(temp==1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
