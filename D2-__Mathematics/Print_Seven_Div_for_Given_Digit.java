/*
Enter digit : 2
output : 14 , 21 , 28 , 35 , 42 , 49 , 56 , 63 , 70 , 77 , 84 , 91 , 98 ,(Divilible by 7 )

 */


import java.util.Scanner;

public class PrintSevenDiv {
    public static void main(String[] args) {
        double i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter digit : ");
        int digit = scan.nextInt();
        double statrigRange = Math.pow(10, (digit-1));
        double lastRange = Math.pow(10,digit);
        for (i = statrigRange; i < lastRange; i++) {
            if(i%7 == 0){
                System.out.print((int)i + " , ");
            }
        }
    }
}
