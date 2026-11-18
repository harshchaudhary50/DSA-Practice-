class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int f = 0;
        int median = nums[n/2];
        for(int num:nums){
            f+=Math.abs(num-median);
        }
        return f;
    }
}