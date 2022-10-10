/*
Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

*/




class Solution {
    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<address.length(); i++){
            if(address.charAt(i)=='.'){
                builder.append("[.]");
            }
            else{
                
                builder.append(address.charAt(i));
            }
        }
        return String.valueOf(builder);
        
    }
}
