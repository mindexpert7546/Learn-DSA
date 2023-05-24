
package StringImportantQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class DivideStringNequalParts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = scan.nextInt();

        String[] s = new String[n];
        int temp =0;
        if(str.length()%n!=0){
            System.out.println("not possible");
        }
        else {
            for(int i=0; i<str.length(); i=i+str.length()/n){
                String ss = str.substring(i,i+str.length()/n);
                s[temp]=ss;
                temp++;
            }
        }
        System.out.println(Arrays.toString(s));
    }
}
