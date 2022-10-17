/**fibanocci series
 * 0,1, 1,2,3,5...etc
 */

import  java.util.Scanner;
public class FibonacciSeriesPrint {
    //method for fibanacci series
    public  void fbSeries(int n){
        int num1 = 0; int num2 = 1;
        int count = 0;
        while (count<n){
            System.out.println(num1 + " ");
            int num3 = num1+num2;
            num1 = num2;
            num2 = num3;
            count++;
        }
    }
    public static void main(String[] args) {
        FibonacciSeriesPrint fsP = new FibonacciSeriesPrint();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scan.nextInt();
        fsP.fbSeries(n);

    }
}
