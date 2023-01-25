/**
https://takeuforward.org/data-structure/count-digits-in-a-number/
*/
import java.util.*;

class CountOfDigit {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int n = scan.nextInt();
       
       //to check number of ditit in n 
       int count = 0;
       while(n>1){
           n=n/10;
           count++;
       }
       
       System.out.println("Number of digit is : " + count);
    }
}
