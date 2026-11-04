class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MIN_VALUE;
        int sum=0;

        for(int x:nums){
            min = Math.max(x,min);
            sum+=x;
        }
        return (nums.length*min)-sum;
    }
}