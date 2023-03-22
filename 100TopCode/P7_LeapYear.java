package PrepInsta;

import java.util.Scanner;

public class P7_LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = scan.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("Leap Year.");
        }
        else{
            System.out.println("Not a leap year.");
        }
    }
}
