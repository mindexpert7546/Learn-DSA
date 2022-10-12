/*
input : 
Enter word : 
kundakkuna

output: 

d

*/

import java.util.Scanner;

public class CharFrequency_Wlcm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word : ");
        String str = scan.next();
        boolean flag =false;
        str.toLowerCase();

        for (char ch = 'a'; ch < 'z'; ch++) {
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if(ch==str.charAt(i)){
                    count++;
                }
            }
            if(count!=0){
//                System.out.println(count);
                if(isPrime(count)==true){
                    continue;

                }
                else if (isPrime(count)==false){
                    System.out.print(ch);
                    flag = true;
                }
            }
        }
        if(flag ==false){
            System.out.println("Welcom ");
        }

    }

    public  static  boolean isPrime(int n){
        int counter = 0;
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                counter++;

            }
        }
        if(counter==2){
            return true;
        }
        else {
            return false;
        }
    }
}
