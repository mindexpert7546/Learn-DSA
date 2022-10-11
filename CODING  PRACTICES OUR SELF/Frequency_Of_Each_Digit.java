/**
 * find the frequency of each digit for a given number 
 * for example : 
 * 556433
 * 3->2
 * 4->1
 * 6->1
 * 5->2
 */

import java.util.Scanner;

public class FindFrequencyOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //take input from user 
        System.out.println("Enter numebr : ");
        int n = scan.nextInt();

        int mod,i;

        int[] frequencyArray = new int[10];

        while(n>0){
            mod = n%10;

            for(i=0; i<10; i++){
                if(mod==i){
                    frequencyArray[i]++;
                }
            }
            n = n/10;
        }
        

        for(i=0; i<=9; i++){
            if(frequencyArray[i]!=0){
                System.out.println(i + " -> " + frequencyArray[i]);
            }
        }
    }
}

