/* String str = "aaabbbccd"; //output will be : a3b3c2d

*/

package String;

public class CompressString {
    public static void main(String[] args) {
        String str = "aaabbbccd"; //output will be : a3b3c2d
        System.out.println(compress(str));


    }

    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
         Integer count;

        for (int i = 0; i < str.length(); i++) {
            count =1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        String st = sb.toString();
        return st;
    }
}
