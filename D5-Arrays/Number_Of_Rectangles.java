//Question link : https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/description/



class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int temp[] = new int[rectangles.length];
        int max = Integer.MIN_VALUE;
        int res =0;

        for(int i=0; i<rectangles.length; i++){
            if(rectangles[i][0]>rectangles[i][1]){
                temp[i]=rectangles[i][1];
            }
            else{
                temp[i]=rectangles[i][0];
            }
        }

        //now we will find max 

        for(int i=0; i<temp.length; i++){
            if(temp[i]>max){
                max=temp[i];
            }
        }

        // to find result 

        for(int i=0;i<temp.length; i++){
            if(temp[i]==max){
                res++;
            }
        }

        return res;
    }
}
