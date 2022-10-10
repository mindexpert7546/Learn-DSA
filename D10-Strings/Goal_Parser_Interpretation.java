class Solution {
    public String interpret(String command) {
        
        StringBuilder sb=new StringBuilder();
       int i=0; 
        
        while(i<command.length()){
            if(command.charAt(i) == 'G'){
                sb.append('G');
            }
            else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    sb.append('o');
                }
                else if(command.charAt(i+1)=='a'){
                    sb.append("al");
                }
            }
            i++;
        }
        
        return sb.toString();
    }
}
