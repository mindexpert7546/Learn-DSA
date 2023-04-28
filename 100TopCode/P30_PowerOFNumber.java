package PrepInsta;

import java.util.Scanner;

public class P30_PowerNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter base : ");
        int n = scan.nextInt();
        System.out.println("Enter power : ");
        int p = scan.nextInt();
        System.out.println(pow(n, p));

    }

    // function for recursion

    public static int pow(int n, int p){
        if(p==0){
            return 1;
        }
        return n*pow(n,p-1);
    }
}
