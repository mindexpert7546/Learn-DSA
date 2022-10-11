/*
Enter lower limit : 
20
Enter heigher limit : 
30
22 24 26 28 
21 23 25 27 29 
Odd count : 5
Even count : 4

 */

import java.util.Scanner;

public class printOddEvenForGivenRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter lower limit : ");
        int lLimit = scan.nextInt();
        System.out.println("Enter heigher limit : ");
        int hLimit = scan.nextInt();
        int evenCount =0;
        int oddCount = 0;

        for (int i = lLimit +1 ; i < hLimit; i++) {
            if(i%2 ==0){
                System.out.print(i + " ");
                evenCount++;
            }
        }
        System.out.println();
        for (int i = lLimit; i < hLimit; i++) {
            if(i%2!=0){
                System.out.print(i + " ");
                oddCount++;
            }
        }
        System.out.println();
        System.out.println("Odd count : " + oddCount);
        System.out.println("Even count : " + evenCount);
    }
}
