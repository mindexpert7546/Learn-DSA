

/**
 *  Java Program to find all subsets of a string
 */
package StringImportantQuestion;

import java.util.Scanner;

public class SubStringFind {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        for(int i=0; i<str.length(); i++){
            for (int j = i+1; j <=str.length(); j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
