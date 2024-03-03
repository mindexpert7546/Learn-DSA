class Solution {
    public String reverseVowels(String s) {
        int st = 0;
        int ed = s.length()-1;


        char[] ch = s.toCharArray();

        while(st<=ed){
            if((ch[st]=='a' || ch[st]== 'e' || ch[st] == 'i' || ch[st]=='o' || ch[st]=='u' || ch[st]=='A' || ch[st]=='E' || ch[st] == 'I' || ch[st] == 'O' || ch[st] == 'U') && (ch[ed]=='a' || ch[ed]== 'e' || ch[ed] == 'i' || ch[ed]=='o' || ch[ed]=='u' || ch[ed]=='A' || ch[ed]== 'E' || ch[ed] == 'I' || ch[ed]=='O' || ch[ed]=='U')){
                char temp = ch[st];
                ch[st] = ch[ed];
                ch[ed] = temp;
                st++;
                ed--;
            } else if((ch[st]=='a' || ch[st]== 'e' || ch[st] == 'i' || ch[st]=='o' || ch[st]=='u' || ch[st]=='A' || ch[st]== 'E' || ch[st] == 'I' || ch[st]=='O' || ch[st]=='U') && (ch[ed]!='a' || ch[ed] != 'e' || ch[ed] != 'i' || ch[ed] !='o' || ch[ed] !='u' || ch[ed]!='A' || ch[ed] != 'E' || ch[ed] != 'I' || ch[ed] !='O' || ch[ed] !='U')){
                ed--;
            } else{
                st++;
            }
        }

        StringBuilder sb = new StringBuilder("");

        for(char c : ch){
            sb.append(c);
        }

        return sb.toString();
    }
}
