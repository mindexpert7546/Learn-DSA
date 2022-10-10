/*
Enter base value : 
2
Enter power value : 
5

output : (2^5 = 32)
32
 */

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter base value : ");
        int base = scan.nextInt();
        System.out.println("Enter power value : ");
        int power = scan.nextInt();
        int res = 1;
        for (int i = 1; i <= power; i++) {
            res = res*base;
        }
        System.out.println(res);
    }
}
