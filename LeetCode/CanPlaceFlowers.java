class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int max = 0;
       int li = -1;
       int ri = -1;

       for(int i=0; i<flowerbed.length; i++){
           if(flowerbed[i]==0){
               continue;
           } else if(li==-1){
               li=i;
               ri=i;
           } else{
               ri=i;
           }
       }

       //if all zero 
       if(li==-1){
          max+= (flowerbed.length+1)/2;
       } else{
           max+=li/2;
           max+=(flowerbed.length-1-ri)/2;
           int count = 0;
           for(int i=li+1; i<ri; i++){
               if(flowerbed[i]==0){
                   count++;
               } else{
                   max+=(count-1)/2;
                   count=0;
               }

           }
           max+=(count-1)/2;

       }

       return (max>=n);
    }
}
