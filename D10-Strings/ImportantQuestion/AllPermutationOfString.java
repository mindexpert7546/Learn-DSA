

/**
 * Find all the possible permutation for a given string.
 */

package StringImportantQuestion;

import java.util.Scanner;

public class AllPermutationOfStrign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        allPermutation(str,"");

    }

    // method for print all the permutation of string

    public static void allPermutation(String str, String res){
        if(str.length()==0){
            System.out.println(res);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char fixedChar = str.charAt(i);
            String leftSub = str.substring(0,i);
            String rightSub = str.substring(i+1);

            String sumofIt = leftSub+rightSub;
            allPermutation(sumofIt,res+fixedChar);
        }

    }
}
