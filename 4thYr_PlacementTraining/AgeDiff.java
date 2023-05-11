package Year_4th_PlacementTraining.MayNineAssignment;

import java.util.Scanner;

public class FindAge{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 digit of birth year : ");
        int bY = scan.nextInt();
        System.out.println("Enter 2 digit of current year : ");
        int cY = scan.nextInt();
        int yr = cY-bY;
        if(yr<0){
            System.out.println(100-(-yr));
        }
        else {
            System.out.println(yr);
        }
    }
}

