class Solution {
    public boolean isSubsequence(String s, String t) {
       int i=0;
       int j=0;
       if(s.length()==0) return true;
       else if(s.length()>0 && (t.length()==0 || t.length()<s.length())) return false;
       while(j<t.length()){
        if(s.charAt(i)==t.charAt(j)){
            i++;
            j++;
        } else{
            j++;
        }

        if(i==s.length()){
            return true;
        }
       }
       return false;
    }
}
