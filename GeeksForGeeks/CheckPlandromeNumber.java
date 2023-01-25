/**
https://takeuforward.org/data-structure/check-if-a-number-is-palindrome-or-not/
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
       int temp = n;
       int rev = 0;
       while(n>0){
           int mod = n%10;
           rev = rev*10+mod;
           n=n/10;
           
       }
       if(rev==temp){
           System.out.println("This number " + temp + " is a Plandrome ");
       }
       else{
           System.out.println("This number " + temp + " is not plandrome.");
       }
       
    }
}
