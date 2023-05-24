
// left rotation of given string
package StringImportantQuestion;
import java.util.Scanner;
public class LeftRotations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int rotateTimes = scan.nextInt();
        System.out.println(rotate(str,rotateTimes));
    }

    // function for left rotate

    public static String rotate(String str, int times){

        char[] ch = str.toCharArray();

        for(int j=0; j<times; j++){
            char temp = ch[0];
            for(int i=0; i<str.length()-1; i++){
                ch[i]=ch[i+1];
            }
            ch[str.length()-1]=temp;
        }

        StringBuilder sb = new StringBuilder("");

        for(char c : ch){
            sb.append(c);
        }

        return sb.toString();
    }

}
