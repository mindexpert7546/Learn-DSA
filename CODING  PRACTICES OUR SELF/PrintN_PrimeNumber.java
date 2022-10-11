/**
 * input : 
 * 3
 * output:
 * 2,3,5
 * 
 * input:
 * 5
 * output:
 * 2,3,5,7,11
 */

import java.util.Scanner;

public class PrintN_PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();

        int count = 0;
        int res=0;
      
            for(int i=2; ; i++){
                for(int j=1; j<=i; j++){
                    if(i%j==0){
                        count ++;
                    }
                }
                if(count ==2){
                    System.out.print(i + " ,");
                    res++;
                   
                }
               
                count = 0;

                if(res ==n){
                    break;
                }
             
               
            }

    }
}
