/**
https://takeuforward.org/c-programs/reverse-a-number-in-c/
*/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class CountOfDigit {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int n = scan.nextInt();
       
       //to check number of ditit in n 
       int rev = 0;
       while(n>0){
           int mod = n%10;
           rev = rev*10+mod;
           n=n/10;
           
       }
       
       System.out.println("Number of digit is : " + rev);
    }
}
