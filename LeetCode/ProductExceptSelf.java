class Solution {
    public int[] productExceptSelf(int[] nums) {

       int pre = 1;

       int[] arrPre = new int[nums.length];
       int[] arrSuf = new int[nums.length];

       arrPre[0] = 1;

       for(int i=1; i<nums.length; i++){
           arrPre[i]=arrPre[i-1]*nums[i-1];
       } 

       arrSuf[nums.length-1] = 1;
       for(int i=nums.length-2; i>=0; i--){
           arrSuf[i] = arrSuf[i+1]*nums[i+1];
       }

       int[] res = new int[nums.length];

       for(int i=0; i<res.length; i++){
           res[i]=arrPre[i]*arrSuf[i];
       }

       return res;
    }
}
