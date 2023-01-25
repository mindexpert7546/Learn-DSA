// General solutions 

package Math;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n1 = scan.nextInt();
        System.out.println("Enter another number : ");
        int n2 = scan.nextInt();

        // O(n)
        int res = 1;
        for(int i=2; i<=Math.min(n1,n2); i++){
            if(n1%i==0 && n2%i==0){
                res = i;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + res);
    }
}





// Bset approach 
  while(n1>0 && n2>0){
            if(n1>n2) n1= n1%n2;
            else n2 = n2%n1;
            if(n1==0) System.out.println(n2);
            else System.out.println(n1);
        }
