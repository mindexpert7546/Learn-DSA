/**
205. Isomorphic Strings
https://leetcode.com/problems/isomorphic-strings/description/
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> h = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(!h.containsKey(s.charAt(i))){
                if(h.containsValue(t.charAt(i))) {
                    return false;
                }
                else{
                    h.put(s.charAt(i), t.charAt(i));
                }
            }

            else{
                if(h.get(s.charAt(i))!=t.charAt(i)) return false;
            }
        }

        return true;
    }
}
