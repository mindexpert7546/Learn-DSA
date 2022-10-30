
/*
input : hi i am kundan

output : Hi I Am Kundan

*/

package String;

public class UpperCase {

    public static void main(String[] args) {
        String str = "hi i am kundan";
        System.out.println(firstLetterUpper(str));

    }

    public static String firstLetterUpper(String str){
        StringBuilder s = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        s.append(ch);
        for (int i = 1; i < str.length(); i++) {

            if(str.charAt(i)==' '){
                s.append(str.charAt(i));
                i++;

                s.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }
}
