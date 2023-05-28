

package String;

public class CompressionFunction {
    public static void main(String[] args) {
        String str = "aabbcffggggg";
        System.out.println(comF1(str));
        System.out.println(comF2(str));
    }
    // compression function 1

    public static String comF1(String str){
        String res = ""+str.charAt(0);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                res+=str.charAt(i);
            }
        }
        return res;
    }
    //compression function 2

    public static String comF2(String str){
        String res = ""+str.charAt(0);
        int count = 0;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else {
                if(count>1){
                    res+=count;
                    count=0;
                }
                res+=str.charAt(i);
            }
        }
        if(count>1){
            res+=count;
        }
        return res;
    }
}
