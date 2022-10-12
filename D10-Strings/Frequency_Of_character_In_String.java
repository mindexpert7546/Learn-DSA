/*
input : 

Enter Word : 
kku

output : 
Word 	 frequency
k	2
u	1
*/


import java.util.Scanner;

public class FrequcncyOfLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Word : ");
        String str = scan.next();
        str.toLowerCase();
        System.out.println("Word \t frequency");
        for (char ch ='a'; ch < 'z' ; ch++) {
            int count =0;
            for (int i = 0; i <str.length(); i++) {
                if(ch==str.charAt(i)){
                    count++;
                }
            }
            if(count!=0){
                System.out.println(ch + "\t" + count);
            }

        }
    }
}
