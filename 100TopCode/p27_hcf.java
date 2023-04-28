package PrepInsta;

import java.util.Scanner;

public class P27_HCF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = scan.nextInt();
        System.out.println("Enter second number : ");
        int b = scan.nextInt();
        System.out.println(hcfOfTwoNumber(a,b));

    }
    // hcf
    public static int hcfOfTwoNumber(int a, int b){
        if(b==0){
            return a;
        }
        return hcfOfTwoNumber(b,a%b);
    }
}
