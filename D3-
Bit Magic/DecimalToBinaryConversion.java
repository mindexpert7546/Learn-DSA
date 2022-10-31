 /**
 * How to convert decimal number to binary number.
 * Example :
 * input : 7
 * output: 111
 */

package BitWise;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scan.nextInt();
        int[] binaryTable = new int[1000];
        binaryConverter(number, binaryTable);
    }

    public static void binaryConverter(int number, int[] binaryTable){
        int i=0;
        while (number>0){
            binaryTable[i]=number%2;
            i++;
            number/=2;

        }

        //to print binary number
        for (int j = i-1; j>= 0 ; j--) {
            System.out.print(binaryTable[j]);
        }
    }
}
