class Solution {
    public int dominantIndex(int[] nums) {
        int maxnum = 0;
        for(int num:nums){
            maxnum=Math.max(maxnum,num);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] != maxnum && maxnum<nums[i]*2){
                return -1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==maxnum){
                return i;
            }
        }
        return -1;
    }
}