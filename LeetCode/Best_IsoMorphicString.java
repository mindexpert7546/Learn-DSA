/**

205. Isomorphic Strings
https://leetcode.com/problems/isomorphic-strings/description/


*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // if(s.length() != t.length()) return false;

        // HashMap<Character, Character> h = new HashMap<>();
        // for(int i=0; i<s.length(); i++){
        //     if(!h.containsKey(s.charAt(i))){
        //         if(h.containsValue(t.charAt(i))) {
        //             return false;
        //         }
        //         else{
        //             h.put(s.charAt(i), t.charAt(i));
        //         }
        //     }

        //     else{
        //         if(h.get(s.charAt(i))!=t.charAt(i)) return false;
        //     }
        // }

        // return true;


        if(s.length() != t.length()) return false;

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int i=0; i<s.length(); i++){
            if(map1[s.charAt(i)] != map2[t.charAt(i)]){return false;}
            else{

            map1[s.charAt(i)] = i+1;
            map2[t.charAt(i)] = i+1;
            }
        }
        return true;
    }
}
