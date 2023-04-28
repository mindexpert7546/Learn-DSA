package PrepInsta;

import java.util.Scanner;

public class P36_lcm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = scan.nextInt();
        System.out.println("Enter second number : ");
        int b = scan.nextInt();
        int lcm = a*b/hcf(a,b);
        System.out.println(lcm);
    }

    // function for find the hcf

    public static int hcf(int a, int b){
        if(a==0){
            return b;
        }
        return hcf(a%b,a);
    }
}
