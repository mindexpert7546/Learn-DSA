package PrepInsta;

import java.util.Scanner;

public class P35_HCF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = scan.nextInt();
        System.out.println("Enter second number : ");
        int b = scan.nextInt();
        System.out.println(hcf(a,b));
    }

    // function for find the hcf

    public static int hcf(int a, int b){
        if(a==0){
            return b;
        }
        return hcf(a%b,a);
    }
}
