package PrepInsta;

import java.util.Scanner;

public class P37_lengthOfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = scan.nextLine();
        System.out.println(lenStr(str));
    }
    public static int lenStr(String str){
        if(str.equals("")){
            return 0;
        }
        return lenStr(str.substring(1))+1;
    }
}
