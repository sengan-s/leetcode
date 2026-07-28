class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int right=0;
        int left=0;
        int sum=0;
        int len=Integer.MAX_VALUE;
        for(left=0;left<nums.length;left++){
            sum=sum+nums[left];
            while(sum>=target){
                len=Math.min(len,left-right+1);
                sum=sum-nums[right];
                right++;
            }
        }
        return len==Integer.MAX_VALUE?0:len;

        
        
    }
}