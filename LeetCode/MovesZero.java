class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                nums[j++]=nums[i];
            }
        }
        int len = nums.length-1;
        while(zero>0){
            nums[len--]=0;
            zero--;
        }
        System.out.println(nums);
    }
}
