package String;

public class LargestString {
    public static void main(String[] args) {
        String[] str = {"fapple", "banana", "onion", "kundan"};
        System.out.println(largestString(str));

    }

    public static String largestString(String[] str ){
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if(largest.compareToIgnoreCase(str[i])<0){
                largest = str[i];
            }
        }

        return largest;
    }
}
