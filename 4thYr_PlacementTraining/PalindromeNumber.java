package Year_4th_PlacementTraining.TenMayAssignment;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = n;
        int rev = 0;
        while (n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        System.out.println(temp==rev?"Palindome":"Not Palindrome");
    }
}
