/**
 * sum of each digit for a given number in single digit 
 * example : 
 * 
 * input 98
 * output: 8//9+8 = 17 = 1+7 = 8
 */

import java.util.Scanner;

public class SumOfEachDigitInSingleDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SumOfEachDigitInSingleDigit sodisd = new SumOfEachDigitInSingleDigit();
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        sodisd.method1(num);
        sodisd.method2(num);

      

    }


//method frist 
    public void method1(int n){
        int sum =0;

        while(n>0){
            sum = sum+ n%10;
            n/=10;
  
            if(n==0 && sum>9){
                n = sum;
                sum = 0;
            }
        }
        System.out.println("Ths sum is : " +sum);
    }
//method second 
    public void method2(int n){
     int res = n%9;
     if(res!=0){
        System.out.println("This sum is : " + res);
     }
     else{
         System.out.println("This sum is : " + 9);
     }
}
