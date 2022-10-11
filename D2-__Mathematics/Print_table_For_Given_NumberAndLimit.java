/*
Enter number : 
6
Enter Limit : 
15
6 x 1 = 6
6 x 2 = 12
6 x 3 = 18
6 x 4 = 24
6 x 5 = 30
6 x 6 = 36
6 x 7 = 42
6 x 8 = 48
6 x 9 = 54
6 x 10 = 60
6 x 11 = 66
6 x 12 = 72
6 x 13 = 78
6 x 14 = 84
6 x 15 = 90
 */
import java.util.Scanner;

public class Table_For_Given_Range {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scan.nextInt();
        System.out.println("Enter Limit : ");
        int limit = scan.nextInt();
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
}
