class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        int gcdRes =  gcd(len1,len2);
        return str1.substring(0,gcdRes);

    }

    static int gcd(int a, int b){
       while(a!=b){
           if(a>b) a=a-b;
           else b=b-a;
       }
       return a;
    }
}
