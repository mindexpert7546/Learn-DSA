

//right rotation of given array
package StringImportantQuestion;
import java.util.Scanner;
public class RightRotate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int rotateTimes = scan.nextInt();
        // rotations for n times

        System.out.println(firstRotate(str,rotateTimes));
    }

    // method for rotate string first rotate
    public static String firstRotate(String str, int times){
        char[] ch = str.toCharArray();

        for(int j=0; j<times; j++){
            char temp = ch[str.length()-1];
            for(int i=str.length()-1; i>0; i--){
                ch[i]=ch[i-1];
            }
            ch[0]=temp;
        }

        StringBuilder sb = new StringBuilder("");
        for(char c :ch){
            sb.append(c);
        }
        return sb.toString();
    }
}
